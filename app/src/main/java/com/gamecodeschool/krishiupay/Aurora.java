package com.gamecodeschool.krishiupay;

import android.app.Application;
import com.backendless.Backendless;

public class Aurora extends Application {
    public static final String APPLICATION_ID = "CCA18299-F188-6FBB-FF75-ABB9FC97BB00";
    public static final String API_KEY = "255CEAC4-12D6-B588-FF87-D92335F18700";
    public static final String SERVER_URL = "https://api.backendless.com";

    @Override
    public void onCreate() {
        super.onCreate();
        Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(),
                APPLICATION_ID,
                API_KEY );
    }
}
