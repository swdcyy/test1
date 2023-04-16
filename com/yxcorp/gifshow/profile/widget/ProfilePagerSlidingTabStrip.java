package com.yxcorp.gifshow.profile.widget.ProfilePagerSlidingTabStrip;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.content.Context;
import java.util.HashSet;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Iterator;
import java.util.Set;
import com.yxcorp.gifshow.profile.widget.ProfilePagerSlidingTabStrip$a;
import android.view.View;

public class ProfilePagerSlidingTabStrip extends PagerSlidingTabStrip	// class@0015fc
{
    public Set w1;

    public void ProfilePagerSlidingTabStrip(Context p0){
       super(p0);
       this.w1 = new HashSet();
    }
    public void ProfilePagerSlidingTabStrip(Context p0,AttributeSet p1){
       super(p0, p1);
       this.w1 = new HashSet();
    }
    public void ProfilePagerSlidingTabStrip(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.w1 = new HashSet();
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ProfilePagerSlidingTabStrip.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ProfilePagerSlidingTabStrip.class, "1")) {
          return;
       }
       super.onScrollChanged(p0, p1, p2, p3);
       Iterator iterator = this.w1.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(this, p0, p1, p2, p3);
       }
       return;
    }
}
