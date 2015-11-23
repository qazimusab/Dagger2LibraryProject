package com.example.qaziahmed.library.application.modules;

import com.example.qaziahmed.library.activities.LoginActivity;
import com.example.qaziahmed.library.activities.MainActivity;
import com.example.qaziahmed.library.activities.contract.ILoginActivity;
import com.example.qaziahmed.library.activities.contract.IMainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ogre on 2015-07-12
 */
@Module
public class LibraryModule {
    @Provides
    ILoginActivity provideLoginActivity(){
        return new LoginActivity();
    }

    @Provides
    IMainActivity provideMainActivity(){
        return new MainActivity();
    }
}
