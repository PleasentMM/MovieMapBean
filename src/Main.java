import bean.*;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("你好，大人");
        GeoInfo geoInfo = new GeoInfo(-12.11,29.22);
        User user = new User("Mcc","123123");
        Comment comment = new Comment("nihao ",1);
        Reply reply = new Reply("asdasd",12);
        UserDetails userDetails = new UserDetails();
        userDetails.setId(1);
        float asd= (float) 34.12;

        System.out.println(movie.toString());
        System.out.println(geoInfo.toString());
        System.out.println(user.toString());
        System.out.println(comment.toString());
        System.out.println(reply.toString());
        System.out.println(userDetails.toString());
    }
}
