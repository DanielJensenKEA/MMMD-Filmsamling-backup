package domain_model;

import data_source.FileHandler;

import java.util.ArrayList;

public class Controller {

    //oprettelse af instance af domain_model.MovieCollection
    private MovieCollection instanceMovieCollection = new MovieCollection(new FileHandler());
    FileHandler fh = new FileHandler();

    //constructor
    public Controller() {
    }

    public String addMovie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, Genre genre) {
        return instanceMovieCollection.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
    }

    public MovieCollection getInstanceMovieCollection() {
        return instanceMovieCollection;//getter til instanceMovieCollection og typen er domain_model.MovieCollection
    }

    public void findAllMovies() {
        instanceMovieCollection.printFullListe();
    }

    public ArrayList<Movie> findTitle(String title) {
        return instanceMovieCollection.searchMovie(title);
    }

    public String findTitleMedToString(String title) { //til user case 5
        return instanceMovieCollection.searchMovieMedToString(title);
    }

    public void deleteMovie() {
        getInstanceMovieCollection().deleteMovie();
    }

    public int getIndexToBeChanged() {
        return instanceMovieCollection.getIndexToBeChanged();
    }

    public String setTitle(int indexToBeChanged, String newTitle) {
        return instanceMovieCollection.setTitle(indexToBeChanged, newTitle);
    }

    public String setDirector(int indexToBeChanged, String newDirector) {
        return instanceMovieCollection.setDirector(indexToBeChanged, newDirector);
    }

    public String setYear(int indexToBeChanged, int newYear) {
        return instanceMovieCollection.setYear(indexToBeChanged, newYear);
    }


    public String setGenre(int indexToBeChanged, Genre newGenre) {
        return instanceMovieCollection.setGenre(indexToBeChanged, newGenre);
    }

    public String setDuration(int indexToBeChanged, int newDuration) {
        return instanceMovieCollection.setDuration(indexToBeChanged, newDuration);
    }

    public String setIsInColor(int indexToBeChanged, boolean isInColor) {
        return instanceMovieCollection.setIsInColor(indexToBeChanged, isInColor);
    }
    public void saveListOfMoviesToFile() {
        /*
        instanceMovieCollection.getFh().saveListOfMovies();
        fh.saveListOfMovies(instanceMovieCollection);
        */
        instanceMovieCollection.getFh().saveListOfMovies(instanceMovieCollection.getMovieListe());



    }
}
