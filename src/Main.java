import bean.*;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("你好，大人");
        GeoInfo geoInfo = new GeoInfo(-12.11,29.22);
        User user = new User("Mcc","123123");
        Comment comment = new Comment(1,"nihao ",1);
        Reply reply = new Reply("asdasd",12);
        UserDetails userDetails = new UserDetails();
        userDetails.setId(1);
        userDetails.addRateToComment(1,30.33f);
        userDetails.addRateToComment(2,3.09f);
        user.addColleMovieIds(1);
        user.addColleMovieIds(2);

        System.out.println(movie.toString());
        System.out.println(geoInfo.toString());
        System.out.println(user.toString());
        System.out.println(comment.toString());
        System.out.println(reply.toString());
        System.out.println(userDetails.toString());
    }
}
