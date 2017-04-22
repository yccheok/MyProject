package demo.org.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewAnimator;

public class SignInFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.trading_sign_in_fragment, container, false);

        this.viewAnimator = (ViewAnimator)v.findViewById(R.id.view_animator);

        final Button forgotPasswordButton = (Button)v.findViewById(R.id.forgot_password_button);

        forgotPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forgotPassword();
            }
        });

        Animation slideInLeftFast = AnimationUtils.loadAnimation(this.getContext(), R.anim.slide_in_left_fast);
        Animation slideOutRightSlow = AnimationUtils.loadAnimation(this.getContext(), R.anim.slide_out_right_slow);
        this.viewAnimator.setInAnimation(slideInLeftFast);
        this.viewAnimator.setOutAnimation(slideOutRightSlow);
        slideInLeftFast.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationEnd(Animation arg0) {
                android.util.Log.i("CHEOK", "animation end");
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // TODO Auto-generated method stub
                android.util.Log.i("CHEOK", "animation repeat");
            }

            @Override
            public void onAnimationStart(Animation animation) {
                // TODO Auto-generated method stub
                android.util.Log.i("CHEOK", "animation start");
            }
        });


        return v;
    }

    private void forgotPassword() {
        viewAnimator.setDisplayedChild(1);
        //viewAnimator.showNext();
    }

    public static SignInFragment newInstance() {
        return new SignInFragment();
    }

    private ViewAnimator viewAnimator;
}