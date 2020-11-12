package ru.netology.domain;

public class Attachment {
    private boolean isAttach;
    private AttachPhoto photo;
    private AttachVideo video;
    private AttachAudio audio;
    private AttachFile file;

    public boolean isAttach() {
        return isAttach;
    }

    public void setAttach(boolean attach) {
        isAttach = attach;
    }

    public AttachPhoto getPhoto() {
        return photo;
    }

    public void setPhoto(AttachPhoto photo) {
        this.photo = photo;
    }

    public AttachVideo getVideo() {
        return video;
    }

    public void setVideo(AttachVideo video) {
        this.video = video;
    }

    public AttachAudio getAudio() {
        return audio;
    }

    public void setAudio(AttachAudio audio) {
        this.audio = audio;
    }

    public AttachFile getFile() {
        return file;
    }

    public void setFile(AttachFile file) {
        this.file = file;
    }
}
