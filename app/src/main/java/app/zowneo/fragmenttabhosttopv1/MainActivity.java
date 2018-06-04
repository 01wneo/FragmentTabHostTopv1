package app.zowneo.fragmenttabhosttopv1;

import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends AppCompatActivity {
    public  FragmentTabHost mTabHost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        mTabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
/**
 * 在setup()里边，其才去获取到TabWidget，所以在此之前，不能直接调用getTabWidget()方法；
 */
        mTabHost.setup(this, getSupportFragmentManager(), R.id.fragment);

/**
 *addTab:添加标签到TabHost中
 * setIndicator:表示设置标签的logo
 */
        mTabHost.addTab(mTabHost.newTabSpec("blue").setIndicator("blue"),
                BlueFragment.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("orange").setIndicator("orange"),
                OrangeFragment.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("green").setIndicator("green"),
                GreenFragment.class, null);
    }
}
