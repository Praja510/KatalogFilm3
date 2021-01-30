package com.example.katalogfilm3.listtvshow.detailtvshows;

import androidx.lifecycle.ViewModel;

import com.example.katalogfilm3.listtvshow.pojo.ResultsItem;

public class DetailTvShowsViewModel extends ViewModel {
    private ResultsItem resultsItem;

    public ResultsItem getResultsItem() {
        return resultsItem;
    }

    public void setResultsItem(ResultsItem resultsItem) {
        this.resultsItem = resultsItem;
    }
}
