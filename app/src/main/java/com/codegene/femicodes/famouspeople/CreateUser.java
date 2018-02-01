package com.codegene.femicodes.famouspeople;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by femicodes on 2/1/2018.
 */

public class CreateUser  extends AppCompatActivity{

    EditText mFirstName, mLastName, mEmail;
    Button mAddUserBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_user);

        mFirstName = findViewById(R.id.first_name);
        mLastName = findViewById(R.id.last_name);
        mEmail = findViewById(R.id.user_email);
        mAddUserBtn = findViewById(R.id.add_user_btn);



        mAddUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fname = mFirstName.getText().toString().trim();
                String lname = mLastName.getText().toString().trim();
                String email = mEmail.getText().toString().trim();

                if(!TextUtils.isEmpty(fname) && !TextUtils.isEmpty(lname) && !TextUtils.isEmpty(email)){

                    User users = new User(fname, lname,email);

                    AppController.provideDb().userDao().insertAll(users);
                    startActivity(new Intent(CreateUser.this, MainActivity.class));

                }else{
                    Toast.makeText(CreateUser.this, "All fields are required", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
