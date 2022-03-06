package com.student;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println("hello world");
        String webOut = getJSON("https://scoresaber.com/api/player/76561199104169308/scores?limit=1&sort=top&withMetadata=true");
    }

    public static String getJSON(String urlToRead) throws Exception {
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        new InputStreamReader(conn.getInputStream());
        return result.toString();
    }
}
