package com.rega.teamup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rega.teamup.data.Flower;
import com.rega.teamup.data.FlowerData;

import java.util.List;


/**
 * Created by Jonathan on 2/17/2016.
 */
public class YourGamesFragment extends ListFragment {

    List<Flower> flowers = new FlowerData().getFlowers();

    public YourGamesFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FlowerArrayAdapter adapter = new FlowerArrayAdapter(getActivity(), R.layout.flower_listitem, flowers);
        setListAdapter(adapter);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.your_games_fragment_layout, container, false);
        return rootView;
    }
}