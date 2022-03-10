package org.ubsl.models;

public class ScoreStats {
    private long totalScore;
    private long totalRankedScore;
    private double averageRankedAccuracy;
    private int totalPlayCount;
    private int rankedPlayCount;
    private int replaysWatched;

    public ScoreStats(long totalScore, long totalRankedScore, double averageRankedAccuracy, int totalPlayCount, int rankedPlayCount, int replaysWatched) {
        this.totalScore = totalScore;
        this.totalRankedScore = totalRankedScore;
        this.averageRankedAccuracy = averageRankedAccuracy;
        this.totalPlayCount = totalPlayCount;
        this.rankedPlayCount = rankedPlayCount;
        this.replaysWatched = replaysWatched;
    }

    @Override
    public String toString() {
        return "scoreStatus{" +
                "totalScore=" + totalScore +
                ", totalRankedScore=" + totalRankedScore +
                ", averageRankedAccuracy=" + averageRankedAccuracy +
                ", totalPlayCount=" + totalPlayCount +
                ", rankedPlayCount=" + rankedPlayCount +
                ", replaysWatched=" + replaysWatched +
                "}";
    }
}
