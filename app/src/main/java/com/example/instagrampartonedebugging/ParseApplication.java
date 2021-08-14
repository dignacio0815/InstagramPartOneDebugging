package com.example.instagrampartonedebugging;

import android.app.Application;

import com.example.instagrampartonedebugging.model.Post;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("onbp3os97i65k0vNPfUKHdUxE6gf5iX2gvCCPlCp")
                .clientKey("Ucy9hpQogCk4pqAcGZ2vleYqZ9XlYfloSXZAbi5C")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
