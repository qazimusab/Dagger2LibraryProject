package com.example.qaziahmed.library.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.qaziahmed.library.R;
import com.example.qaziahmed.library.activities.contract.IMainActivity;
import com.example.qaziahmed.library.application.DependencyInjectorHelper;
import com.example.qaziahmed.library.classes.contract.ICat;
import com.example.qaziahmed.library.classes.contract.IDog;

import javax.inject.Inject;


public class MainActivity extends Activity implements IMainActivity{
    @Inject
    IDog dog;

    @Inject
    ICat cat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DependencyInjectorHelper.getMyLibraryComponent(getApplication()).inject(this);


        Button btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
