package io.guardianx.guardianx_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.app_bar_background));
        setTitle(getString(R.string.title_login));
        LoginFragment loginFragment= new LoginFragment();
        getSupportFragmentManager().beginTransaction().
                replace(R.id.activity_login, loginFragment)
                .commitNow();
    }
}
