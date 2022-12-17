package com.builditcreative.androidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.builditcreative.androidapp.api.ApiData;
import com.builditcreative.androidapp.api.RetroClient;
import com.builditcreative.androidapp.api.model.AgendaList;
import com.google.android.material.tabs.TabLayout;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    RecyclerView recyclerView;
    SearchView searchView;
    ApiData apiData;
    RecyclerAdapter recyclerAdapter;

    private List<AgendaList> listDate = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RetroClient.initRetroClient();

        tabLayout = findViewById(R.id.tab_layout);
        searchView = findViewById(R.id.searchView);
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerAdapter = new RecyclerAdapter(MainActivity.this,listDate);
        recyclerView.setAdapter(recyclerAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filter(newText);
                return false;
            }
        });

        searchView.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {
                filter("");
                return false;
            }
        });



        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                try {
                    Date date = new SimpleDateFormat("dd MMM yy").parse(tab.getText().toString());
                    listDate = new ArrayList<>();
                    for (int i=0;i<apiData.getData().getAgendaList().size();i++) {
                        if (apiData.getData().getAgendaList().get(i).getStartDate().equals(date)) {
                            listDate.add(apiData.getData().getAgendaList().get(i));
                        }
                    }
                    recyclerAdapter.notifyDataSetChanged();
                    filter("");
                } catch (ParseException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        RetroClient.getServicesAPI().getData("3342","3112","Asia/Kolkata").enqueue(new Callback<ApiData>() {
            @Override
            public void onResponse(Call<ApiData> call, Response<ApiData> response) {
                if (response.isSuccessful() && response.isSuccessful()) {
                    apiData = response.body();

                    Set<Date> tempList = new HashSet<>();
                    for (int i=0;i<apiData.getData().getAgendaList().size();i++) {
                        tempList.add(apiData.getData().getAgendaList().get(i).getStartDate());
                    }
                    List<Date> dateList = new ArrayList<>();
                    dateList.addAll(tempList);
                    for (int i=0;i<dateList.size();i++) {
                        tabLayout.addTab(tabLayout.newTab().setText(new SimpleDateFormat("dd MMM yy").format(dateList.get(i))));
                    }

                } else {
                    Log.d("TAG", "onResponse: "+response.errorBody() +response.message());
                }
            }

            @Override
            public void onFailure(Call<ApiData> call, Throwable t) {
                Log.d("TAG", "onFailure: "+t);
            }
        });

    }


    private void filter(String text) {
        // creating a new array list to filter our data.
        ArrayList<AgendaList> filteredlist = new ArrayList<AgendaList>();

        // running a for loop to compare elements.
        for (AgendaList item : listDate) {
            // checking if the entered string matched with any item of our recycler view.
            if (item.getHeading().toLowerCase().contains(text.toLowerCase())) {
                // if the item is matched we are
                // adding it to our filtered list.
                filteredlist.add(item);
            }
        }
        if (filteredlist.isEmpty()) {
            // if no item is added in filtered list we are
            // displaying a toast message as no data found.
            Toast.makeText(this, "No Data Found..", Toast.LENGTH_SHORT).show();
        } else {
            recyclerAdapter.filterList(filteredlist);
        }
    }

}