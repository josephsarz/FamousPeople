package com.codegene.femicodes.famouspeople;


import android.app.Application;
import android.arch.persistence.room.Room;

/**
 * Created by femicodes on 2/1/2018.
 */

public class AppController extends Application {

    private static AppDatabase db;

    @Override
    public void onCreate() {
        super.onCreate();

        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "production")
                .allowMainThreadQueries()
                .build();
    }

    public static AppDatabase provideDb(){
        return db;
    }

}
