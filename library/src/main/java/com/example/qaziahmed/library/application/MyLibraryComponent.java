package com.example.qaziahmed.library.application;

import com.example.qaziahmed.library.activities.LoginActivity;
import com.example.qaziahmed.library.activities.MainActivity;
import com.example.qaziahmed.library.application.modules.LibraryModule;

import dagger.Subcomponent;

/**
 * Created by ogre on 2015-07-12
 */
@Subcomponent(modules = LibraryModule.class)
public interface MyLibraryComponent {
    void inject(LoginActivity loginActivity);

    void inject(MainActivity mainActivity);
}
