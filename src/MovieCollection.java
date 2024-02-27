import java.util.ArrayList;

public class MovieCollection {

    ArrayList<Movie> movieListe = new ArrayList<>();
    ArrayList<Movie> searchMatch = new ArrayList<>();
    int indexToBeChanged;


    //constructor
    public MovieCollection() {
    }


    //metoder
    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre) {
        movieListe.add(new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre));
        System.out.println("Du har tilføjet filmen: " + title);
        System.out.println("Filmsamlingen indeholder nu samlet: " + movieListe.size() + " film.");
    }

    /*public void editMovie() {
        System.out.println("

        movieListe.add(new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre));
        System.out.println("Du har ændret informationer på filmen: " + title);
        System.out.println("");
    }*/

    public void printFullListe() {
        for (Movie film : movieListe) {
            System.out.println(film.toString());
        }
    }

    public String searchMovieMedToString(String title) { //user case 5
        for (Movie films : movieListe) {
            if (films.getTitle().toLowerCase().contains(title.toLowerCase())) {
                indexToBeChanged = movieListe.indexOf(films);
                return "Ja vi har filmen: " + films.toString();
            }
        }
        return "Desværre vi har ikke filmen i samlingen.";
    }

    public ArrayList<Movie> searchMovie(String title) { //user case 6 prøv at lave denne om til String i stedet for Array, så der bruges toString
        for (Movie films : movieListe) {
            if (films.getTitle().toLowerCase().contains(title.toLowerCase())) {
                searchMatch.add(films);
            }
        }
        return searchMatch;
    }


    public ArrayList<Movie> getMovieListe() { //getter for at få MovieListe af "typen" Movie
        return movieListe;
    }

    public ArrayList<Movie> getSearchMatch() {//getter for at kunne kalde searchMatch af typen Movie.
        return searchMatch;
    }
}
