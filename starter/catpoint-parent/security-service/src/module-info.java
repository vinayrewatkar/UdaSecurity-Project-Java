module com.udacity.catpoint.security {
    exports main.java.com.udacity.catpoint.security.data;
    exports main.java.com.udacity.catpoint.security.service;
    exports main.java.com.udacity.catpoint.application;

    requires com.udacity.catpoint.image;
    requires java.desktop;
    requires com.google.common;
    requires org.slf4j;
    requires com.google.gson;
    requires java.prefs;
    requires miglayout.core;
    requires miglayout.swing;
}