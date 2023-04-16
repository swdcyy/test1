package com.yxcorp.gifshow.magic.ui.widget.SmoothPagerSlidingTabStrip$b;
import android.widget.Scroller;
import android.content.Context;
import android.view.animation.Interpolator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;

public class SmoothPagerSlidingTabStrip$b extends Scroller	// class@001c50
{

    public void SmoothPagerSlidingTabStrip$b(Context p0,Interpolator p1){
       super(p0, p1);
    }
    public void startScroll(int p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(SmoothPagerSlidingTabStrip$b.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, SmoothPagerSlidingTabStrip$b.class, "1")) {
             return;
          }
       }
       super.startScroll(p0, p1, p2, p3, 300);
       return;
    }
}
