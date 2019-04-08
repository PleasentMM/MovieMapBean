package bean;

import java.util.HashSet;

public class GeoInfo {

    //实例化GeoInfo必须有经纬度
    public GeoInfo(float longitude, float dimension) {
        this.longitude = longitude;
        this.dimension = dimension;
    }

    //地理信息Id
    private int Id;
    //经度
    private float longitude;
    //维度
    private float dimension;
    //地区
    private String region;
    //地区详细信息
    private String regionDetail;
    //地图电影信息描述
    private String regionMovieDetail;
    //相关电影信息
    private HashSet<Integer> movieIds;
    //相关对地理位置的评论信息
    private HashSet<Integer> commentIds;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getDimension() {
        return dimension;
    }

    public void setDimension(float dimension) {
        this.dimension = dimension;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionDetail() {
        return regionDetail;
    }

    public void setRegionDetail(String regionDetail) {
        this.regionDetail = regionDetail;
    }

    public String getRegionMovieDetail() {
        return regionMovieDetail;
    }

    public void setRegionMovieDetail(String regionMovieDetail) {
        this.regionMovieDetail = regionMovieDetail;
    }

    public HashSet<Integer> getMovieId() {
        return movieIds;
    }

    public void setMovieId(HashSet<Integer> movieId) {
        this.movieIds = movieId;
    }

    public void addMovieId(int Id) {
        movieIds.add(Id);
    }

    public void removeMovieId(int Id) {
        if (movieIds.contains(Id)) {
            movieIds.remove(Id);
        }
    }

    public HashSet<Integer> getUserId() {
        return commentIds;
    }

    public void setUserId(HashSet<Integer> userId) {
        this.commentIds = userId;
    }

    public void addUserId(int Id) {
        commentIds.add(Id);
    }

    @Override
    public String toString() {
        return "GeoInfo{" +
                "Id=" + Id +
                ", longitude=" + longitude +
                ", dimension=" + dimension +
                ", region='" + region + '\'' +
                ", regionDetail='" + regionDetail + '\'' +
                ", regionMovieDetail='" + regionMovieDetail + '\'' +
                ", movieId=" + movieIds +
                ", commentIds=" + commentIds +
                '}';
    }
}
