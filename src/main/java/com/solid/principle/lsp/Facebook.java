package com.solid.principle.lsp;

import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

public class Facebook extends SocialMedia{
    @Override
    public void chatWithFriends() {

    }

    @Override
    public void publishPost(Object post) {
        Model model = new ConcurrentModel();
        model.addAttribute("Lost", "Lost");

        var str  = "Something special";
        char[] chars = str.toCharArray();
        System.out.println(chars.length);
    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {

    }
}
