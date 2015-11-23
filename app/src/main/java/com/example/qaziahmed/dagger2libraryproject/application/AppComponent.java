package com.example.qaziahmed.dagger2libraryproject.application;


import com.example.qaziahmed.dagger2libraryproject.activities.MainActivity;
import com.example.qaziahmed.library.application.MyLibraryComponent;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ogre on 2015-07-12
 */
@Component(modules = AppModule.class)
@Singleton
public interface AppComponent extends MyLibraryComponent {
    void inject(MainActivity mainActivity);
    MyLibraryComponent newMyLibraryComponent();
}
