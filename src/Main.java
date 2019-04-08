import bean.*;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("你好，大人");
        GeoInfo geoInfo = new GeoInfo(-57.48,65.99);
        User user = new User("Mcc","123123");
        Comment comment = new Comment(1,"nihao ",1);
        Reply reply = new Reply("asdasd",12);
        System.out.println(movie.toString());
        System.out.println(geoInfo.toString());
        System.out.println(user.toString());
        System.out.println(comment.toString());
        System.out.println(reply.toString());
    }
}
