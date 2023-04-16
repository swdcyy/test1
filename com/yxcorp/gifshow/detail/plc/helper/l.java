package com.yxcorp.gifshow.detail.plc.helper.l;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import f4a.w;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Float;
import f4a.x;
import android.view.ViewPropertyAnimator;

public class l	// class@001680
{

    public void l(){
       super();
    }
    public static void a(View p0,long p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, ol, "1")) {
          return;
       }
       if (p0 != null && p0.getVisibility() != 4) {
          k1.o(new w(p0, p1));
       }
       return;
    }
    public static void b(View p0,long p1,float p2){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Float.valueOf(p2), null, l.class, "2")) {
          return;
       }
       l.c(p0, p1, 80, p2);
       return;
    }
    public static void c(View p0,long p1,long p2,float p3){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Long.valueOf(p2), Float.valueOf(p3), null, l.class, "3")) {
          return;
       }
       if (p0 != null && (p0.getVisibility() || p0.getAlpha() - 0x3f800000)) {
          x ox = new x(p0, p2, p3, p1);
          k1.o(v0);
       }
       return;
    }
    public static void d(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, l.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.animate().cancel();
       return;
    }
}
