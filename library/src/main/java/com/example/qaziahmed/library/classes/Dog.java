package com.example.qaziahmed.library.classes;

import com.example.qaziahmed.library.classes.contract.IDog;
import com.example.qaziahmed.library.classes.contract.IDogFood;

import java.util.ArrayList;

/**
 * Created by ogre on 2015-07-12
 */
public class Dog implements IDog {
    ArrayList<IDogFood> catFoods = new ArrayList<>();

    public void feedDog(IDogFood dogFood){
        catFoods.add(dogFood);
    }
}
