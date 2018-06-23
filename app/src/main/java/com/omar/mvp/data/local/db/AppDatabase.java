package com.omar.mvp.data.local.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import com.omar.mvp.data.local.db.dao.MovieDao;
import com.omar.mvp.data.model.Movie;

@Database(entities = {Movie.class}, version = 3)
@TypeConverters(Converters.class)
public abstract class AppDatabase extends RoomDatabase {

    public abstract MovieDao movieDao();
}