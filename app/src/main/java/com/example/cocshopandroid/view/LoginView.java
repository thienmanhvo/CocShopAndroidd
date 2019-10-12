package com.example.cocshopandroid.view;

import com.example.cocshopandroid.model.Token;

public interface LoginView {
    void loginSuccess(String token);

    void loginFailed(String s);
}
