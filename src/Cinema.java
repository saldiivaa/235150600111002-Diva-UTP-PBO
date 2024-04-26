package src;

public class Cinema {
    private String name;
    private User[] listUser;
    private Studio[] listStudio;
    private int studioCapacity;

    public Cinema (String name, int studioCapacity) {
        this.name = name;
        this.studioCapacity = studioCapacity;
    }

    private void init () {

    }

    public boolean registerUser (User user) {
        return user;
    }

    public User authenticateUser (String email, String password) {

    }

    public void displayListStudio () {

    }

    public void displayStudioDetail (int studioNumber) {

    }

    public boolean addStudioWithMovies (String studioType, String movieTitle, double movieRating, String[] movieGenres) {
        this.studioType = studioType;
        
    }

    public boolean bookTicket (User user, int studioNumber, char row, int col) {

    }

    public String getName () {

    }
}
