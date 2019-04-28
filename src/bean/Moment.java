package bean;

import java.util.Date;
import java.util.HashSet;

public class Moment {

    public Moment(String content) {
        this.content = content;
        date = new Date();
    }
    //说说的Id
    private int Id;
    //说说的标题
    private String title;
    //说说的内容
    private String content;
    //说说的时间
    private Date date;
    //发说说的用户Id
    private int fromUserId;
    //获赞数目
    private int vote;
    //评论Id
    private HashSet<Integer> commentId = new HashSet<>();
    //用户上传的图片
    private HashSet<String> userPhotosURL = new HashSet<>();

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        ++vote;
    }

    public HashSet<Integer> getCommentId() {
        return commentId;
    }

    public void setCommentId(HashSet<Integer> commentId) {
        this.commentId = commentId;
    }

    public void addCommentId(int id) {
        commentId.add(id);
    }

    public void removeCommentId(int id) {
        if (commentId.contains(id)) {
            commentId.remove(id);
        }
    }

    public HashSet<String> getUserPhotosURL() {
        return userPhotosURL;
    }

    public void setUserPhotosURL(HashSet<String> userPhotosURL) {
        this.userPhotosURL = userPhotosURL;
    }

    public void addUserPhotoURL(String url) {
        userPhotosURL.add(url);
    }

    public void removeUserPhotoURL(String url) {
        if (userPhotosURL.contains(url)) {
            userPhotosURL.remove(url);
        }
    }

    @Override
    public String toString() {
        return "Moment{" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", fromUserId=" + fromUserId +
                ", vote=" + vote +
                ", commentId=" + commentId +
                ", userPhotosURL=" + userPhotosURL +
                '}';
    }
}
