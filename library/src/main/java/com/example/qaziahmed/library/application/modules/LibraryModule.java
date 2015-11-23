package com.example.qaziahmed.library.application.modules;

import com.example.qaziahmed.library.activities.LoginActivity;
import com.example.qaziahmed.library.activities.contract.ILoginActivity;
import com.example.qaziahmed.library.classes.Cat;
import com.example.qaziahmed.library.classes.CatFood;
import com.example.qaziahmed.library.classes.Dog;
import com.example.qaziahmed.library.classes.DogFood;
import com.example.qaziahmed.library.classes.contract.ICat;
import com.example.qaziahmed.library.classes.contract.ICatFood;
import com.example.qaziahmed.library.classes.contract.IDog;
import com.example.qaziahmed.library.classes.contract.IDogFood;

import javax.inject.Singleton;

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
}
