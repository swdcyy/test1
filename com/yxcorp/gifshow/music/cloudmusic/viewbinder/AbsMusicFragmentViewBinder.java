package com.yxcorp.gifshow.music.cloudmusic.viewbinder.AbsMusicFragmentViewBinder;
import com.kuaishou.viewbinder.BaseViewBinder;
import c35.c;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.yxcorp.gifshow.music.cloudmusic.widget.MusicSmoothPagerSlidingTabStrip;
import com.google.android.material.tabs.TabLayout;

public abstract class AbsMusicFragmentViewBinder extends BaseViewBinder	// class@002042
{
    public MusicSearchLayout e;
    public KwaiActionBar f;
    public ImageButton g;

    public void AbsMusicFragmentViewBinder(c p0){
       super(p0);
    }
    public abstract View A();
    public abstract ViewPager B();
    public void C(){
    }
    public void D(){
    }
    public abstract MusicSmoothPagerSlidingTabStrip y();
    public abstract TabLayout z();
}
