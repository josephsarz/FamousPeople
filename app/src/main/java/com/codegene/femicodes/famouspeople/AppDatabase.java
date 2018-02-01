package com.codegene.femicodes.famouspeople;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.codegene.femicodes.famouspeople.User;
import com.codegene.femicodes.famouspeople.UserDAO;

/**
 * Created by femicodes on 2/1/2018.
 */

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDAO userDao();
}