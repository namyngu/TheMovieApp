package com.example.themovieapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("page")     // Maps the JSON variable "page" to our class variable (pageNumber)
    @Expose                     // Used to specify which fields should be included/excluded when Gson serializes/deserialization
                                // Default all fields are included.
    private Integer pageNumber;

    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;

    @SerializedName("total_results")
    @Expose
    private Integer totalResults;

    @SerializedName("results")
    @Expose
    private List<Movie> results = null;

    public Result() {
    }

    public Integer getPage() {
        return pageNumber;
    }

    public void setPage(Integer page) {
        this.pageNumber = page;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }
}
