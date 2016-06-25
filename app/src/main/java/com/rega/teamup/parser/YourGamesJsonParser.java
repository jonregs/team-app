package com.rega.teamup.parser;

import com.rega.teamup.model.YourGames;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jon on 6/22/2016.
 */
public class YourGamesJsonParser {

    public static List<YourGames> parseFeed(String content) {

        try {
            JSONArray ar = new JSONArray(content);
            List<YourGames> youGamesList = new ArrayList<>();

            for (int i = 0; i < ar.length() ; i++) {

                JSONObject obj = ar.getJSONObject(i);
                YourGames yourGames = new YourGames();

                yourGames.setProductId(obj.getInt("productId"));
                yourGames.setName(obj.getString("name"));
                yourGames.setCategory(obj.getString("category"));
                yourGames.setInstructions(obj.getString("instructions"));
                yourGames.setPhoto(obj.getString("photo"));
                yourGames.setPrice(obj.getDouble("price"));

                youGamesList.add(yourGames);
            }
            return youGamesList;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
