package com.example.katalogfilm3.listmovies.pojo;

import androidx.annotation.NonNull;

import java.util.List;

import com.androidnetworking.error.ANError;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class ResponseMovies{

	@SerializedName("page")
	private int page;

	@SerializedName("total_pages")
	private int totalPages;

	@SerializedName("results")
	private List<ResultsItem> results;

	@SerializedName("total_results")
	private int totalResults;

	public void setPage(int page){
		this.page = page;
	}

	public int getPage(){
		return page;
	}

	public void setTotalPages(int totalPages){
		this.totalPages = totalPages;
	}

	public int getTotalPages(){
		return totalPages;
	}

	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	public void setTotalResults(int totalResults){
		this.totalResults = totalResults;
	}

	public int getTotalResults(){
		return totalResults;

	}
	private ANError anError;

	public ANError getAnError() {
		return anError;

	}
	public ResponseMovies(){

	}
	public ResponseMovies(ANError anError) {
		this.anError = anError;

	}
	public List<ResultsItem> getResult() {
		return results;

	}

	@NonNull
	@Override
 	public String toString(){
		return 
			"ResponseMovies{" + 
			"page = '" + page + '\'' + 
			",total_pages = '" + totalPages + '\'' + 
			",results = '" + results + '\'' + 
			",total_results = '" + totalResults + '\'' + 
			"}";
		}
}