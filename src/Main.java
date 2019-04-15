import bean.*;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("你好，大人");
        movie.addStagePhotoURL("sds");

        System.out.println(movie.toString());
        movie.removeStagePhotoURL("sds");
        System.out.println(movie.toString());
    }
}
