package com.example.qaziahmed.library.application.modules;

import com.example.qaziahmed.library.classes.Dog;
import com.example.qaziahmed.library.classes.DogFood;
import com.example.qaziahmed.library.classes.contract.IDog;
import com.example.qaziahmed.library.classes.contract.IDogFood;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by qaziahmed on 11/23/15.
 */
@Module
public class DogModule {

    @Provides
    @Singleton
    IDog provideDog() {
        return new Dog();
    }

    @Provides
    IDogFood provideDogFood(){
        return new DogFood();
    }

}
