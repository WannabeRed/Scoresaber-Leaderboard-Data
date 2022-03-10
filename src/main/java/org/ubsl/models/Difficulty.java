package org.ubsl.models;

public class Difficulty {
    private long leaderboardId;
    private int difficulty;
    private String gameMode;
    private String difficultyRaw;

    public Difficulty(long leaderboardId, int difficulty, String gameMode, String difficultyRaw) {
        this.leaderboardId = leaderboardId;
        this.difficulty = difficulty;
        this.gameMode = gameMode;
        this.difficultyRaw = difficultyRaw;
    }

    @Override
    public String toString() {
        return "Difficulty{" +
                "leaderboardId=" + leaderboardId +
                ", difficulty=" + difficulty +
                ", gameMode='" + gameMode + '\'' +
                ", difficultyRaw='" + difficultyRaw + '\'' +
                '}';
    }
}
