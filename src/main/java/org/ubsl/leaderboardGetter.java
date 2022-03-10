package org.ubsl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.ubsl.models.PlayerScores;
import org.ubsl.models.Players;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// get player score
// https://scoresaber.com/api/player/76561199104169308/scores?limit=1&sort=top&withMetadata=true

// get current players
// https://scoresaber.com/api/players/count

// get player page
// https://scoresaber.com/api/players?page=1&withMetadata=false

public class leaderboardGetter {
    public static void main(String[] args) throws Exception {

        int index = 1;
        int page = 1;

        var players = getPlayersPage(page); // a page contains 50 players
        String playerID = players.players[index].id;
        double TotalPP = players.players[index].pp;

        var scores = getPlayerScores(playerID);

        double TopScorePP = scores.playerScores[0].score.pp;


        System.out.println("je");
        System.out.println(playerID);
        System.out.println(TopScorePP);
        System.out.println(TotalPP);
        System.out.println(scores);
    }

    private static Players getPlayersPage(int i) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        StringBuilder result = new StringBuilder();
        String curlCommand = "curl -X GET https://scoresaber.com/api/players?page=" + i + "&withMetadata=false";
        ProcessBuilder processBuilder = new ProcessBuilder(curlCommand.split(" "));
        Process process;

        try {
            process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            return gson.fromJson(reader, Players.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static PlayerScores getPlayerScores(String playerID) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        StringBuilder result = new StringBuilder();
        String curlCommand = "curl -X GET https://scoresaber.com/api/player/" + playerID + "/scores?limit=1&sort=top&withMetadata=false";
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
