module com.udacity.catpoint.image {
    exports main.java.com.udacity.catpoint.image;

    requires java.desktop;
    requires org.slf4j;

    // Core AWS modules
    requires software.amazon.awssdk.core;
    requires software.amazon.awssdk.auth;
    requires software.amazon.awssdk.regions;
    requires software.amazon.awssdk.awscore;
    requires software.amazon.awssdk.utils;

    // Service modules
    requires software.amazon.awssdk.services.rekognition;
    requires software.amazon.awssdk.services.s3;
    requires imgscalr.lib;
}