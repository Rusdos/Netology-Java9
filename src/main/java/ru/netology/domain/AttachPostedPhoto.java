package ru.netology.domain;

public class AttachPostedPhoto {
    private int id;
    private int postedId;
    private String photo130;
    private String photo604;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPostedId() {
        return postedId;
    }

    public void setPostedId(int postedId) {
        this.postedId = postedId;
    }

    public String getPhoto130() {
        return photo130;
    }

    public void setPhoto130(String photo130) {
        this.photo130 = photo130;
    }

    public String getPhoto604() {
        return photo604;
    }

    public void setPhoto604(String photo604) {
        this.photo604 = photo604;
    }
}