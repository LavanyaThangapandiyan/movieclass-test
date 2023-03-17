package com.movie.details;

public class Movie {
	
	    public String title;

	    public String genre;
	    
	    public int year;   

	    public String review;

	    public int rating;

	    public Movie(String title,String genre,int year,String review,int rating)

	    {   this.title=title;

	        this.genre=genre;

	        this.year=year;

	        this.review=review;

	        this.rating=rating;

	    }

	    public void getTitle()

	    {

	        System.out.println("Title of Movie: "+title);

	    }

	    public void getGenre()

	    {

	        System.out.println("Genre of the Movie: "+genre);

	    }

	    public void getYear()

	    {

	        System.out.println("Year: "+year);

	    }

	    public void getReview()

	    {

	        System.out.println("Review of the Movie: "+review);

	    } 

	    public void getRating()

	    {

	        System.out.println("Rating of the Movie: "+rating);

	    }

	    public void setTitle(String title)

	    {

	        this.title=title;

	    }

	    public void setGenre(String genre)

	    {

	       this.genre=genre;

	    }

	    public void setYear(int year)

	    {

	        this.year=year;

	    }

	    public void setReview(String review)

	    {

	        this.review=review;

	    } 

	    public void setRating(int rating)

	    {

	        this.rating=rating;

	    }    

	    public void show()

	    {

	        getTitle();

	        getGenre();

	        getYear();

	        getReview();

	        getRating();
	

	}
	}

