package com.omar.mvp.data.remote.api;

import com.google.gson.annotations.SerializedName;
import com.omar.mvp.data.model.Movie;

import java.util.List;

public class MoviesResponse {

    @SerializedName("page")
    int page;

    @SerializedName("total_pages")
    int total_pages;

    @SerializedName("total_results")
    int total_results;

    @SerializedName("results")
    List<Movie> results;

    public int getPage() {
        return page;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public int getTotal_results() {
        return total_results;
    }

    public List<Movie> getResult() {
        return results;
    }
}
