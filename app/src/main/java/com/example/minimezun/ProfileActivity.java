package com.example.minimezun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity {
    private static final String TAG = "ProfileActivity";

    private FirebaseAuth mAuth;
    private FirebaseUser mUser;
    private TextView mTextViewEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();
        mTextViewEmail = findViewById(R.id.editTextTextEmailAddress);

        if (mUser != null) {
            String email = mUser.getEmail();
            mTextViewEmail.setText(email);
        } else {
            Log.w(TAG, "User is null");
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        mUser = mAuth.getCurrentUser();
    }

    @Override
    public void onStop() {
        super.onStop();
        mAuth.signOut();
    }
}