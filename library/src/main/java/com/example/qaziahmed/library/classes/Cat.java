package com.example.qaziahmed.library.classes;

import com.example.qaziahmed.library.classes.contract.ICat;
import com.example.qaziahmed.library.classes.contract.ICatFood;

import java.util.ArrayList;

/**
 * Created by ogre on 2015-07-12
 */
public class Cat implements ICat {
    ArrayList<ICatFood> catFoods = new ArrayList<>();

    public void feedCat(ICatFood catFood){
        catFoods.add(catFood);
    }

}
