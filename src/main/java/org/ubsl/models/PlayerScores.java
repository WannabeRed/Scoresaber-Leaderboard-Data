package org.ubsl.models;

import java.util.Arrays;

public class PlayerScores {

    public PlayerScore[] playerScores;
    private MetaData metadata;

    public PlayerScores(PlayerScore[] playerPlayerScores, MetaData metadata) {
        this.playerScores = playerPlayerScores;
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "PlayerScores{" +
                "playerPlayerScores=" + Arrays.toString(playerScores) +
                ", metadata=" + metadata +
                '}';
    }
}
