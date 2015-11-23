package com.example.qaziahmed.dagger2libraryproject.classes;

import com.example.qaziahmed.library.classes.contract.ICat;
import com.example.qaziahmed.library.classes.contract.ICatFood;

import java.util.ArrayList;

/**
 * Created by qaziahmed on 11/23/15.
 */
public class HouseCat implements ICat {
    ArrayList<ICatFood> catFoods = new ArrayList<>();

    public void feedCat(ICatFood catFood){
        catFoods.add(catFood);
    }
}
