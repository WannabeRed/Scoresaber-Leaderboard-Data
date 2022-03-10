package org.ubsl.models;

public class MetaData {

    private int total;
    private int page;
    private int itemsPerPage;

    public MetaData(int total, int page, int itemsPerPage) {
        this.total = total;
        this.page = page;
        this.itemsPerPage = itemsPerPage;
    }

    @Override
    public String toString() {
        return "MetaData{" +
                "total=" + total +
                ", page=" + page +
                ", itemsPerPage=" + itemsPerPage +
                '}';
    }
}
