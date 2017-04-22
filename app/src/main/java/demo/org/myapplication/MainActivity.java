package demo.org.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            SignInFragment signInFragment = SignInFragment.newInstance();
            getSupportFragmentManager().beginTransaction().replace(R.id.content, signInFragment).commitAllowingStateLoss();
        } else {
        }
    }
}
