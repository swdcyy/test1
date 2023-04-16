package com.yxcorp.gifshow.designercreation.widget.ProfileCreationPageSlidingTabStrip;
import com.yxcorp.gifshow.profile.widget.ProfilePagerSlidingTabStrip;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;

public final class ProfileCreationPageSlidingTabStrip extends ProfilePagerSlidingTabStrip	// class@00131b
{
    public HashMap x1;

    public void ProfileCreationPageSlidingTabStrip(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void ProfileCreationPageSlidingTabStrip(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void ProfileCreationPageSlidingTabStrip(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void ProfileCreationPageSlidingTabStrip(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public ViewGroup$LayoutParams k(){
       LinearLayout$LayoutParams obj = PatchProxy.apply(null, this, ProfileCreationPageSlidingTabStrip.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.k();
       obj.gravity = 16;
       obj.rightMargin = a1.e(8.00f);
       return obj;
    }
}
