package org.ubsl.models;

public class Badge {
    private String description;
    private String image;

    public Badge(String description, String image) {
        this.description = description;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Badge{" +
                "description='" + description + '\''+
                ", image='" + image + '\'' +
                "}";
    }
}
