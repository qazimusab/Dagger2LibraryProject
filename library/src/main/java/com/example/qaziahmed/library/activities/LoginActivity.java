package com.example.qaziahmed.library.activities;

import android.app.Activity;
import android.os.Bundle;

import com.example.qaziahmed.library.activities.contract.ILoginActivity;
import com.example.qaziahmed.library.application.DependencyInjectorHelper;
import com.example.qaziahmed.library.classes.contract.ICat;
import com.example.qaziahmed.library.classes.contract.ICatFood;
import com.example.qaziahmed.library.classes.contract.IDog;
import com.example.qaziahmed.library.classes.contract.IDogFood;

import javax.inject.Inject;

/**
 * Created by ogre on 2015-07-13
 */
public class LoginActivity extends Activity implements ILoginActivity{

    @Inject
    ICat cat;
    @Inject
    ICatFood catFood;
    @Inject
    IDog dog;
    @Inject
    IDogFood dogFood;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DependencyInjectorHelper.getMyLibraryComponent(getApplication()).inject(this);

        cat.feedCat(catFood);
        dog.feedDog(dogFood);
    }
}
