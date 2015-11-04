package com.example.epicodus.ribbitnew;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Guest on 11/4/15.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "AqE3XCmZzd8N6BRYNfUwoebhkgoFy0wj2Y8NpbiL", "YvOBYK6sHHRZiwJ95F9R1AOB2qaN0c68XfL4UD56");


    }

}
