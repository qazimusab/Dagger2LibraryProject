package com.example.qaziahmed.library.application.modules;

import com.example.qaziahmed.library.classes.Cat;
import com.example.qaziahmed.library.classes.CatFood;
import com.example.qaziahmed.library.classes.contract.ICat;
import com.example.qaziahmed.library.classes.contract.ICatFood;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by qaziahmed on 11/23/15.
 */
@Module
public class CatModule {

    @Provides
    @Singleton
    ICat provideCat() {
        return new Cat();
    }

    @Provides
    ICatFood provideCatFood(){
        return new CatFood();
    }
}
