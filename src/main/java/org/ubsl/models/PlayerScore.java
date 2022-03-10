package org.ubsl.models;

public class PlayerScore {

    public Score score;
    private Leaderboard leaderboard;

    public PlayerScore(Score score, Leaderboard leaderboard) {
        this.score = score;
        this.leaderboard = leaderboard;
    }

    @Override
    public String toString() {
        return "PlayerScore{" +
                "score=" + score +
                ", leaderboard=" + leaderboard +
                '}';
    }
}
