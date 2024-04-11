package domain_model;

public class Movie {

    //attributes på movie
    private String title;
    private String director;
    private int yearCreated;
    private boolean isInColor;
    private int lengthInMinutes;
    private Genre genre;

    //constructor med setter af attributes
    public Movie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, Genre genre) {
        this.title = title;
        this.director = director;
        this.yearCreated = yearCreated;
        this.isInColor = isInColor;
        this.lengthInMinutes = lengthInMinutes;
        this.genre = genre;
    }


    @Override //en slags stavekontrol - kaldes ved at kalde metoden Movies.toString()
    public String toString() {
        String result = "";
        result += "Title: " + title + "\nInstructor: " + director + "\nGenre: " + genre + "\nYear: " + yearCreated + "\nDuration in min: " + lengthInMinutes;
        if (isInColor == true) {
            result += "\nColor: In color\n";
        } else {
            result += "\nColor: Black and White\n";
        }
        return result;
    }   //dette result vises som udskrift, når search metode kaldes


    public String toString2() {
        String result = "";
        result += "Title: " + title + ", Instructor: " + director + ", Genre: " + genre + ", Year: " + yearCreated + ", Duration in min: " + lengthInMinutes;
        if (isInColor) {
            result += ", Color: In Color";
        } else {
            result += ", Color: Black/White";
        }
        return result;
    }   //dette result vises som udskrift, når samlet liste skal vises (en film på hver linje)

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setDirector(String newDirector) {
        this.director = newDirector;
    }

    public void setGenre(Genre newGenre) {
        this.genre = newGenre;
    }

    public void setYearCreated(int newYearCreated) {
        this.yearCreated = newYearCreated;
    }

    public void setIsInColor(boolean newIsInColor) {
        this.isInColor = newIsInColor;
    }

    public void setLengthInMinutes(int newLengthInMinutes) {
        this.lengthInMinutes = newLengthInMinutes;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public boolean getIsInColor() {
        return isInColor;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public Genre getGenre() {
        return genre;
    }
}
