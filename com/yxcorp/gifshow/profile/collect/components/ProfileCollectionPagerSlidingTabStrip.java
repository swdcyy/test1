package com.yxcorp.gifshow.profile.collect.components.ProfileCollectionPagerSlidingTabStrip;
import com.yxcorp.gifshow.profile.widget.ProfilePagerSlidingTabStrip;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;

public class ProfileCollectionPagerSlidingTabStrip extends ProfilePagerSlidingTabStrip	// class@001298
{

    public void ProfileCollectionPagerSlidingTabStrip(Context p0){
       super(p0);
    }
    public void ProfileCollectionPagerSlidingTabStrip(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void ProfileCollectionPagerSlidingTabStrip(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public ViewGroup$LayoutParams k(){
       LinearLayout$LayoutParams obj = PatchProxy.apply(null, this, ProfileCollectionPagerSlidingTabStrip.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.k();
       obj.gravity = 16;
       obj.rightMargin = a1.e(8.00f);
       return obj;
    }
}
