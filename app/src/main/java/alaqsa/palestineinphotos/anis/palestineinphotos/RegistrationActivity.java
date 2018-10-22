package alaqsa.palestineinphotos.anis.palestineinphotos;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import alaqsa.palestineinphotos.anis.palestineinphotos.adapter.viewPagerRegistationAdapter;

public class RegistrationActivity extends AppCompatActivity {
    private TextView tvLogin;
    private TextView tvSignUp;

    private ViewPager viewPager;

    private viewPagerRegistationAdapter mPagerViewAdpter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        tvLogin = (TextView)findViewById(R.id.tvLogin);
        tvSignUp = (TextView)findViewById(R.id.tvSignUp);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        mPagerViewAdpter = new viewPagerRegistationAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mPagerViewAdpter);

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(0);
            }
        });

        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(1);
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                changeTabs(i);

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

    }

    private void changeTabs(int i) {
        if (i==0){
            tvLogin.setBackground(getDrawable(R.drawable.round_login));
            tvLogin.setTextSize(20);
            tvLogin.setTextColor(getColor(R.color.white));


            tvSignUp.setBackgroundColor(getColor(R.color.white));
            tvSignUp.setTextSize(20);
            tvSignUp.setTextColor(getColor(R.color.gray));

        }
        if (i==1){
            tvLogin.setBackgroundColor(getColor(R.color.white));
            tvLogin.setTextSize(20);
            tvLogin.setTextColor(getColor(R.color.gray));

            tvSignUp.setBackground(getDrawable(R.drawable.round_registration));
            tvSignUp.setTextSize(20);
            tvSignUp.setTextColor(getColor(R.color.white));

        }
    }
}
