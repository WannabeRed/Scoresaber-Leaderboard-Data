package org.ubsl.models;

public class Score {

    private long id;
    private int rank;
    private long baseScore;
    private long modifiedScore;
    public double pp;
    private float weight;
    private String modifiers;
    private int multiplier;
    private int badCuts;
    private int missedNotes;
    private int maxCombo;
    private boolean fullCombo;
    private int hmd;
    private String timeSet;
    private boolean hasReplay;

    public Score(long id, int rank, long baseScore, long modifiedScore, double pp, float weight, String modifiers,
                 int multiplier, int badCuts, int missedNotes, int maxCombo, boolean fullCombo, int hmd,
                 String timeSet, boolean hasReplay)
    {
        this.id = id;
        this.rank = rank;
        this.baseScore = baseScore;
        this.modifiedScore = modifiedScore;
        this.pp = pp;
        this.weight = weight;
        this.modifiers = modifiers;
        this.multiplier = multiplier;
        this.badCuts = badCuts;
        this.missedNotes = missedNotes;
        this.maxCombo = maxCombo;
        this.fullCombo = fullCombo;
        this.hmd = hmd;
        this.timeSet = timeSet;
        this.hasReplay = hasReplay;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", rank=" + rank +
                ", baseScore=" + baseScore +
                ", modifiedScore=" + modifiedScore +
                ", pp=" + pp +
                ", weight=" + weight +
                ", modifiers='" + modifiers + '\'' +
                ", multiplier=" + multiplier +
                ", badCuts=" + badCuts +
                ", missedNotes=" + missedNotes +
                ", maxCombo=" + maxCombo +
                ", fullCombo=" + fullCombo +
                ", hmd=" + hmd +
                ", timeSet='" + timeSet + '\'' +
                ", hasReplay=" + hasReplay +
                '}';
    }
}
