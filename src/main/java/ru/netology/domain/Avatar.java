package ru.netology.domain;

import javax.swing.*;

public class Avatar {
    private boolean onAvatar;
    private ImageIcon avatar;

    public boolean isOnAvatar() {
        return onAvatar;
    }

    public void setOnAvatar(boolean onAvatar) {
        this.onAvatar = onAvatar;
    }

    public ImageIcon getAvatar() {
        return avatar;
    }

    public void setAvatar(ImageIcon avatar) {
        this.avatar = avatar;
    }
}
