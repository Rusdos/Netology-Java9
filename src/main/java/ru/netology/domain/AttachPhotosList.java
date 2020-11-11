package ru.netology.domain;

public class AttachPhotosList {
    private String[] id;
    private AttachPhoto[] attachPhotos;

    public String[] getId() {
        return id;
    }

    public void setId(String[] id) {
        this.id = id;
    }

    public AttachPhoto[] getAttachPhotos() {
        return attachPhotos;
    }

    public void setAttachPhotos(AttachPhoto[] attachPhotos) {
        this.attachPhotos = attachPhotos;
    }
}
