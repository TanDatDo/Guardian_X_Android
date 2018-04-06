package io.guardianx.guardianx_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ResgistrationActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resgistration);
        ButterKnife.bind(this);

        getSupportActionBar().hide();
        RegistrationFragment registrationFragment= new RegistrationFragment();

        getSupportFragmentManager().beginTransaction().
                replace(R.id.activity_registration, registrationFragment).
                commitNow();
    }

}
