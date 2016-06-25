package com.rega.teamup;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rega.teamup.model.YourGames;
import com.rega.teamup.parser.YourGamesJsonParser;

import java.util.List;


/**
 * Created by Jonathan on 2/17/2016.
 */
public class YourGamesFragment extends ListFragment {

    TextView output;
    List<YourGames> flowerList;
    List<YourGamesTask> tasks;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.your_games_fragment_layout,null);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        YourGamesTask task = new YourGamesTask();

        String uri = "http://services.hanselandpetal.com/feeds/flowers.json";
        task.execute(uri);

    }

    protected void updateDisplay() {

        YourGamesArrayAdapter adapter = new YourGamesArrayAdapter(getActivity(), R.layout.item_flower, flowerList);
        setListAdapter(adapter);
    }

    private class YourGamesTask extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
//			updateDisplay("Starting task");
        }

        @Override
        protected String doInBackground(String... params) {

            String content = HttpManager.getData(params[0]);
            return content;
        }

        @Override
        protected void onPostExecute(String result) {

            flowerList = YourGamesJsonParser.parseFeed(result);
            updateDisplay();
        }

        @Override
        protected void onProgressUpdate(String... values) {
//			updateDisplay(values[0]);
        }

    }

    public void setArguments() {
    }
}
