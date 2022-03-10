package org.ubsl.models;

import java.util.Arrays;

public class Player {
    public String id;
    private String name;
    private String profilePicture;
    private String bio;
    private String country;
    public double pp;
    private int rank;
    private int countryRank;
    private String role;
    private Badge[] badges;
    private String histories;
    private ScoreStats scoreStats;
    private int permissions;
    private boolean banned;
    private boolean inactive;

    public Player(String id, String name, String profilePicture, String bio, String country, double pp, int rank, int countryRank,String role, Badge[] badges, String histories, ScoreStats scoreStats, int permissions, boolean banned, boolean inactive) {
        this.id = id;
        this.name = name;
        this.profilePicture = profilePicture;
        this.bio = bio;
        this.country = country;
        this.pp = pp;
        this.rank = rank;
        this.countryRank = countryRank;
        this.role = role;
        this.badges = badges;
        this.histories =histories;
        this.scoreStats = scoreStats;
        this.permissions = permissions;
        this.banned = banned;
        this.inactive = inactive;
    }

    @Override
    public String toString() {
        return "Player{"+
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                ", country='" + country + '\'' +
                ", pp=" + pp +
                ", rank=" + rank +
                ", countryRank=" + countryRank +
                ", role='" + role + '\'' +
                ", badges=" + Arrays.toString(badges) +
                ", histories='" + histories + '\'' +
                ", scoreStats='" + scoreStats + '\'' +
                ", permissions=" + permissions +
                ", banned=" + banned +
                ", inactive=" + inactive +
                "}";
    }
}
