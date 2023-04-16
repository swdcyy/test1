package com.kuaishou.live.widget.view.a;
import com.kuaishou.live.widget.page2.ViewPager2$g;
import com.kuaishou.live.widget.view.LiveAutoScrollBanner;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import com.kuaishou.live.widget.view.LiveAutoScrollBanner$b;

public class a extends ViewPager2$g	// class@001042
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
       if (p0 != 1) {
          a ta = this.a;
          if (ta.d == null) {
             ta.b();
          }
       }else {
          this.a.c();
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
