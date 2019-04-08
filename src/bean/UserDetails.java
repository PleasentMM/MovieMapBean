package bean;

import java.util.HashMap;

public class UserDetails {
    //用户详细信息Id
    private int Id;
    //用户对某个电影的评分,Integer电影Id,Float电影评分
    private HashMap<Integer,Float> rateToMovie;
    //用户对某个评论的评分
    private HashMap<Integer,Float> rateToComment;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public HashMap<Integer, Float> getRateToMovie() {
        return rateToMovie;
    }

    public void setRateToMovie(HashMap<Integer, Float> rateToMovie) {
        this.rateToMovie = rateToMovie;
    }

    public void addRateToMovie(int movieId, float rating) {
        rateToMovie.put(movieId,rating);
    }

    public HashMap<Integer, Float> getRateToComment() {
        return rateToComment;
    }

    public void setRateToComment(HashMap<Integer, Float> rateToComment) {
        this.rateToComment = rateToComment;
    }

    public void addRateToComment(int commentId, float rating) {
        rateToComment.put(commentId,rating);
    }
}
