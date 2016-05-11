package com.rega.teamup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Jonathan on 2/17/2016.
 */
public class YourGamesFragment extends Fragment {


    RecyclerViewAdapter adapter;
    RecyclerView recyclerView;
    private static List<Model> demoData;

    public YourGamesFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.your_games_fragment_layout, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.myList);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        demoData = new ArrayList<Model>();
        char c = 'A';
        for (byte i = 0; i < 20; i++) {
            Model model = new Model();
            model.name = c++;
            model.age = (byte) (20 + 1);
            demoData.add(model);
        }
        adapter = new RecyclerViewAdapter(demoData);
        recyclerView.setAdapter(adapter);

        return rootView;
    }


    /*@Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerView = (RecyclerView) getView().findViewById(R.id.myList);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        demoData = new ArrayList<Model>();
        char c = 'A';
        for (byte i = 0; i < 20; i++) {
            Model model = new Model();
            model.name = c++;
            model.age = (byte) (20 + 1);
            demoData.add(model);
        }
        adapter = new RecyclerViewAdapter(demoData);
        recyclerView.setAdapter(adapter);
    }*/

    public void setArguments() {
    }
}
