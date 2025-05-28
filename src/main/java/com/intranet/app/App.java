package com.intranet.app;

import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import com.intranet.views.LoginView;

public class App {
    public static void main(String[] args) {
        FlatArcOrangeIJTheme.setup();
        
        AppContext.initialize();
        new LoginView().setVisible(true);
    }
}