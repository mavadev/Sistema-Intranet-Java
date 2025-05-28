package com.intranet.app;

import com.intranet.views.LoginView;

public class App {
    public static void main(String[] args) {
        AppContext.initialize();
        new LoginView().setVisible(true);
    }
}
