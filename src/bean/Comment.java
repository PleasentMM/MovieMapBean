package bean;

import java.util.Date;
import java.util.HashSet;

public class Comment {
    //实例化Comment必须有用户Id和评论内容和电影Id
    public Comment(int toMovieId, String content, int fromUserId) {
        this.toMovieId = toMovieId;
        this.content = content;
        this.fromUserId = fromUserId;
    }
    //评论的电影的ID
    private int toMovieId;
    //评论的地理位置ID
    private int toGeoId;
    //评论内容
    private String content;
    //评论时间,系统自动设定
    private Date date;
    //来自用户ID
    private int fromUserId;
    //对此评论的投票
    private int vote;
    //回复Id
    private HashSet<Integer> replyId = new HashSet<>();

    public int getToMovieId() {
        return toMovieId;
    }

    public void setToMovieId(int toMovieId) {
        this.toMovieId = toMovieId;
    }

    public int getToGeoId() {
        return toGeoId;
    }

    public void setToGeoId(int toGeoId) {
        this.toGeoId = toGeoId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(int fromUserId) {
        this.fromUserId = fromUserId;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public void addVote() {
        vote++;
    }

    public HashSet<Integer> getReplyId() {
        return replyId;
    }

    public void setReplyId(HashSet<Integer> replyId) {
        this.replyId = replyId;
    }

    public void addReply(int Id) {
        replyId.add(Id);
    }

    public void removeReply(int Id) {
        if (replyId.contains(Id)) {
            replyId.remove(Id);
        }
    }

    @Override
    public String toString() {
        return "Comment{" +
                "toMovieId=" + toMovieId +
                ", toGeoId=" + toGeoId +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", fromUserId=" + fromUserId +
                ", vote=" + vote +
                ", replyId=" + replyId +
                '}';
    }
}
