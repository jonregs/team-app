package com.rega.teamup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Jonathan on 2/17/2016.
 */
public class InvitePlayersFragment extends Fragment {

    public InvitePlayersFragment () {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.invite_players_fragment_layout,null);
    }
}