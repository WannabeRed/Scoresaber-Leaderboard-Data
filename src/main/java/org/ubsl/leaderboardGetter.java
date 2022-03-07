package org.ubsl;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
//import com.google.gson.Gson;

public class leaderboardGetter {
    public static void main(String[] args) throws Exception{
        JsonObject webOut = getJSON("https://scoresaber.com/api/player/76561199104169308/scores?limit=1&sort=top&withMetadata=true");
        System.out.println(webOut);
    }

    public static JsonObject getJSON(String urlToRead) throws Exception {
        StringBuilder result = new StringBuilder();

        String curlCommand = "curl -X GET " + urlToRead;
        ProcessBuilder processBuilder = new ProcessBuilder(curlCommand.split(" "));
        Process process = processBuilder.start();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))) {
            for(String line; (line = reader.readLine()) != null; ) {
                result.append(line);
            }
        }

        String json = result.toString();
        JsonObject jsonObj = JsonParser.parseString(json).getAsJsonObject();

        return jsonObj;
    }
}
