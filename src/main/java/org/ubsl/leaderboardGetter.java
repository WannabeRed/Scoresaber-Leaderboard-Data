package org.ubsl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.ubsl.models.PlayerScores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leaderboardGetter {
    public static void main(String[] args) throws Exception {
        var scores = getPlayerScoresFromUrl("https://scoresaber.com/api/player/76561199104169308/scores");

        double TopScorePP = scores.playerScores[0].score.pp;
        double TotalPP = 0;

        System.out.println(scores);
    }

    public static PlayerScores getPlayerScoresFromUrl(String url) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        StringBuilder result = new StringBuilder();

        String curlCommand = "curl -X GET " + url;
        ProcessBuilder processBuilder = new ProcessBuilder(curlCommand.split(" "));
        Process process;

        try {
            process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            return gson.fromJson(reader, PlayerScores.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
