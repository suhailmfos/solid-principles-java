package com.solid.principle.lsp;

public abstract class SocialMedia {

    //@support whatsApp, Facebook, Instagram
    public abstract void chatWithFriends();

    //@support Facebook, Instagram
    public abstract void publishPost(Object post);

    //@support WhatsApp, Facebook, Instagram
    public abstract void sendPhotosAndVideos();

    //@support WhatsApp, Facebook
    public abstract void groupVideoCall(String... users);

}
