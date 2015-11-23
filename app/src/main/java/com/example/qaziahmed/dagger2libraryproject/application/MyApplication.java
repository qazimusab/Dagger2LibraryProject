package com.example.qaziahmed.dagger2libraryproject.application;

import com.example.qaziahmed.library.application.LibraryApplication;
import com.example.qaziahmed.library.application.MyLibraryComponent;

/**
 * Created by ogre on 2015-07-13
 */
public class MyApplication extends LibraryApplication{
    private AppComponent mAppDependencyInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppDependencyInjector = DaggerAppComponent.builder().build();
    }

    public AppComponent getAppDependencyInjector() {
        return mAppDependencyInjector;
    }


    @Override
    public MyLibraryComponent getMyLibraryComponent() {
        return mAppDependencyInjector;
    }
}
