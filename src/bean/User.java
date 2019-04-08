package bean;

import java.util.HashSet;

public class User {
    //实例化用户必须有用户名和密码
    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
    //用户Id
    private int Id;
    //用户名
    private String userName;
    //昵称
    private String nickName;
    //密码
    private String passWord;
    //性别
    private String sex;
    //国家
    private String nation;
    //收藏的电影Id
    private HashSet<Integer> colleMovieIds;
    //发出的评论的Id
    private HashSet<Integer> commentIds;
    //收藏的地理位置Id
    private HashSet<Integer> colleGeoInfoIds;
    //关注的用户Id
    private HashSet<Integer> colleUserIds;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public HashSet<Integer> getColleMovieIds() {
        return colleMovieIds;
    }

    public void setColleMovieIds(HashSet<Integer> colleMovieId) {
        this.colleMovieIds = colleMovieId;
    }

    public void addColleMovieIds(int Id) {
        colleMovieIds.add(Id);
    }

    public void removeColleMovieIds(int Id) {
        if (commentIds.contains(Id)) {
            commentIds.remove(Id);
        }
    }

    public HashSet<Integer> getCommentIds() {
        return commentIds;
    }

    public void setCommentIds(HashSet<Integer> commentId) {
        this.commentIds = commentId;
    }

    public void addCommentId(int id) {
        commentIds.add(id);
    }

    public void removeCommentId(int id) {
        if (commentIds.contains(id)) {
            commentIds.remove(id);
        }
    }

    public HashSet<Integer> getColleGeoInfoIds() {
        return colleGeoInfoIds;
    }

    public void setColleGeoInfoIds(HashSet<Integer> colleGeoInfoId) {
        this.colleGeoInfoIds = colleGeoInfoId;
    }

    public HashSet<Integer> getColleUserIds() {
        return colleUserIds;
    }

    public void setColleUserIds(HashSet<Integer> colleUserId) {
        this.colleUserIds = colleUserId;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", userName='" + userName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", sex='" + sex + '\'' +
                ", nation='" + nation + '\'' +
                ", colleMovieIds=" + colleMovieIds +
                ", commentIds=" + commentIds +
                ", colleGeoInfoIds=" + colleGeoInfoIds +
                ", colleUserIds=" + colleUserIds +
                '}';
    }
}
