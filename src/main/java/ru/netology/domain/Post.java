package ru.netology.domain;

import java.awt.*;
import java.text.DateFormat;

public class Post {
    private int id;
    private Avatar ava;
    private String url;
    private Button subscribeButton;
    private DateFormat postDate;
    private String content;
    private Attachment attach;
    private likesInfo likesInfo;
    private commentsInfo commentsInfo;
    private repostsInfo repostsInfo;
    private viewsInfo viewsInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Avatar getAva() {
        return ava;
    }

    public void setAva(Avatar ava) {
        this.ava = ava;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Button getSubscribeButton() {
        return subscribeButton;
    }

    public void setSubscribeButton(Button subscribeButton) {
        this.subscribeButton = subscribeButton;
    }

    public DateFormat getPostDate() {
        return postDate;
    }

    public void setPostDate(DateFormat postDate) {
        this.postDate = postDate;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Attachment getAttach() {
        return attach;
    }

    public void setAttach(Attachment attach) {
        this.attach = attach;
    }

    public ru.netology.domain.likesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(ru.netology.domain.likesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public ru.netology.domain.commentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(ru.netology.domain.commentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public ru.netology.domain.repostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(ru.netology.domain.repostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public ru.netology.domain.viewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ru.netology.domain.viewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }
}




