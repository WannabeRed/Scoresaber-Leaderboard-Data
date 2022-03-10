package org.ubsl.models;

import java.util.Arrays;

public class Players {
    public Player[] players;
    private MetaData metadata;

    public Players(Player[] playerPlayers, MetaData metadata) {
        this.players = playerPlayers;
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "players{" +
                Arrays.toString(players) +
                ", metadata=" + metadata +
                '}';
    }
}
