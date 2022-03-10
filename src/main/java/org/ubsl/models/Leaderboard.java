package org.ubsl.models;

public class Leaderboard {

    private long id;
    private String songHash;
    private String songName;
    private String songSubName;
    private String songAuthorName;
    private String levelAuthorName;
    private Difficulty difficulty;
    private long maxScore;
    private String createdDate;
    private String rankedDate;
    private String qualifiedDate;
    private String lovedDate;
    private boolean ranked;
    private boolean qualified;
    private boolean loved;
    private double maxPp;
    private double stars;
    private int plays;
    private int dailyPlays;
    private boolean positiveModifiers;
    private int playerScore;
    private String coverImage;
    private String difficulties;

    public Leaderboard(long id, String songHash, String songName, String songSubName, String songAuthorName,
                       String levelAuthorName, Difficulty difficulty, long maxScore, String createdDate,
                       String rankedDate, String qualifiedDate, String lovedDate, boolean ranked, boolean qualified,
                       boolean loved, double maxPp, double stars, int plays, int dailyPlays, boolean positiveModifiers,
                       int playerScore, String coverImage, String difficulties)
    {
        this.id = id;
        this.songHash = songHash;
        this.songName = songName;
        this.songSubName = songSubName;
        this.songAuthorName = songAuthorName;
        this.levelAuthorName = levelAuthorName;
        this.difficulty = difficulty;
        this.maxScore = maxScore;
        this.createdDate = createdDate;
        this.rankedDate = rankedDate;
        this.qualifiedDate = qualifiedDate;
        this.lovedDate = lovedDate;
        this.ranked = ranked;
        this.qualified = qualified;
        this.loved = loved;
        this.maxPp = maxPp;
        this.stars = stars;
        this.plays = plays;
        this.dailyPlays = dailyPlays;
        this.positiveModifiers = positiveModifiers;
        this.playerScore = playerScore;
        this.coverImage = coverImage;
        this.difficulties = difficulties;
    }

    @Override
    public String toString() {
        return "Leaderboard{" +
                "id=" + id +
                ", songHash='" + songHash + '\'' +
                ", songName='" + songName + '\'' +
                ", songSubName='" + songSubName + '\'' +
                ", songAuthorName='" + songAuthorName + '\'' +
                ", levelAuthorName='" + levelAuthorName + '\'' +
                ", difficulty=" + difficulty +
                ", maxScore=" + maxScore +
                ", createdDate='" + createdDate + '\'' +
                ", rankedDate='" + rankedDate + '\'' +
                ", qualifiedDate='" + qualifiedDate + '\'' +
                ", lovedDate='" + lovedDate + '\'' +
                ", ranked=" + ranked +
                ", qualified=" + qualified +
                ", loved=" + loved +
                ", maxPp=" + maxPp +
                ", stars=" + stars +
                ", plays=" + plays +
                ", dailyPlays=" + dailyPlays +
                ", positiveModifiers=" + positiveModifiers +
                ", playerScore=" + playerScore +
                ", coverImage='" + coverImage + '\'' +
                ", difficulties='" + difficulties + '\'' +
                '}';
    }
}
