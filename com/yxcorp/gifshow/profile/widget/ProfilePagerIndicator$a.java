package com.yxcorp.gifshow.profile.widget.ProfilePagerIndicator$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.profile.widget.ProfilePagerIndicator;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class ProfilePagerIndicator$a implements ViewPager$i	// class@0015f9
{
    public final ProfilePagerIndicator b;

    public void ProfilePagerIndicator$a(ProfilePagerIndicator p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       ProfilePagerIndicator$a uoa = ProfilePagerIndicator$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.b.setSelected(p0);
       return;
    }
}
