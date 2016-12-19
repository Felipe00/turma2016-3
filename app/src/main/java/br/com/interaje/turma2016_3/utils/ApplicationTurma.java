package br.com.interaje.turma2016_3.utils;

import android.app.Application;

import com.mapbox.mapboxsdk.MapboxAccountManager;
import com.orm.SugarApp;
import com.orm.SugarContext;
import com.orm.util.SugarConfig;

/**
 * Created by felipe on 14/12/16.
 */

public class ApplicationTurma extends Application {

    private static final String MAPBOX_KEY = "pk.eyJ1IjoiZmVsaXBlMDAiLCJhIjoiY2lzaGxzNXU3MDA1NDJ5cGlybWQ4c285cCJ9.LF3B-PJnBBFyF7xZSaK2og";

    @Override
    public void onCreate() {
        super.onCreate();
        SugarContext.init(this);
        MapboxAccountManager.start(this, MAPBOX_KEY);
    }
}
