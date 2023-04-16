package com.kuaishou.live.basic.widget.a;
import androidx.viewpager2.widget.ViewPager2$h;
import com.kuaishou.live.basic.widget.LiveAutoScrollBanner;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.IllegalStateException;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Float;
import com.kuaishou.live.basic.widget.LiveAutoScrollBanner$b;

public class a extends ViewPager2$h	// class@000d35
{
    public final LiveAutoScrollBanner a;

    public void a(LiveAutoScrollBanner p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       uoa = this.a;
       Objects.requireNonNull(uoa);
       if (!PatchProxy.isSupport(LiveAutoScrollBanner.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uoa, LiveAutoScrollBanner.class, "13")) {
          int i = 1;
          if (p0 != i) {
             if (uoa.d == null && !PatchProxy.applyVoid(null, uoa, LiveAutoScrollBanner.class, "5")) {
                if (uoa.c != null) {
                   if (uoa.d == null) {
                      uoa.d = i;
                      uoa.a();
                   }
                }else {
                   throw new IllegalStateException("can\'t auto scroll because mEnableAutoScroll = false");
                }
             }
          }else if(PatchProxy.applyVoid(null, uoa, LiveAutoScrollBanner.class, "6")){
             uoa.d = false;
             k1.m(uoa.f);
          }
       }
       return;
    }
    public void b(int p0,float p1,int p2){
       if (PatchProxy.isSupport(a.class)) {
          PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, a.class, "1");
       }
       return;
    }
    public void c(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       LiveAutoScrollBanner e = this.a.e;
       if (e != null) {
          e.a(p0);
       }
       return;
    }
}
