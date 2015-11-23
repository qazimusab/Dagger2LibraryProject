package com.example.qaziahmed.dagger2libraryproject.application;

import com.example.qaziahmed.dagger2libraryproject.classes.AllNaturalDogFood;
import com.example.qaziahmed.dagger2libraryproject.classes.HouseCat;
import com.example.qaziahmed.library.application.modules.CatModule;
import com.example.qaziahmed.library.application.modules.DogModule;
import com.example.qaziahmed.library.application.modules.LibraryModule;
import com.example.qaziahmed.library.classes.contract.ICat;
import com.example.qaziahmed.library.classes.contract.IDogFood;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ogre on 2015-07-12
 */
@Module(includes = {
        LibraryModule.class,
        DogModule.class,
        CatModule.class
})
public class AppModule {

    @Provides
    @Singleton
    ICat provideHouseCat() {
        return new HouseCat();
    }

    @Provides
    IDogFood provideAllNaturalDogFood(){
        return new AllNaturalDogFood();
    }
}
