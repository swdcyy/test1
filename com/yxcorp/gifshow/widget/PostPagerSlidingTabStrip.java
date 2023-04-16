package com.yxcorp.gifshow.widget.PostPagerSlidingTabStrip;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.LinearLayout$LayoutParams;

public final class PostPagerSlidingTabStrip extends PagerSlidingTabStrip	// class@001899
{
    public HashMap w1;

    public void PostPagerSlidingTabStrip(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public void PostPagerSlidingTabStrip(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attr");
       super(p0, p1);
    }
    public void PostPagerSlidingTabStrip(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       a.p(p1, "attr");
       super(p0, p1, p2);
    }
    public ViewGroup$LayoutParams k(){
       LinearLayout$LayoutParams obj = PatchProxy.apply(null, this, PostPagerSlidingTabStrip.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinearLayout$LayoutParams(0, -1);
       obj.weight = 0x3f800000;
       return obj;
    }
}
