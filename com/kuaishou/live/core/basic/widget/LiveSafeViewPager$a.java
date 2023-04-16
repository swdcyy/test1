package com.kuaishou.live.core.basic.widget.LiveSafeViewPager$a;
import android.widget.Scroller;
import com.kuaishou.live.core.basic.widget.LiveSafeViewPager;
import android.content.Context;
import android.view.animation.Interpolator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;

public class LiveSafeViewPager$a extends Scroller	// class@00090f
{
    public final int a;
    public final LiveSafeViewPager b;

    public void LiveSafeViewPager$a(LiveSafeViewPager p0,Context p1,Interpolator p2,int p3){
       this.b = p0;
       this.a = p3;
       super(p1, p2);
    }
    public void startScroll(int p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveSafeViewPager$a.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveSafeViewPager$a.class, "1")) {
             return;
          }
       }
       super.startScroll(p0, p1, p2, p3, this.a);
       return;
    }
}
