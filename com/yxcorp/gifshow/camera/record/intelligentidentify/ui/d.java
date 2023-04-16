package com.yxcorp.gifshow.camera.record.intelligentidentify.ui.d;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.d$c;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.d$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.c;
import java.lang.Runnable;
import java.lang.Boolean;
import a2.i0;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.d$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public class d	// class@000e0f
{

    public void d(){
       super();
    }
    public static void a(View p0,View p1,d$c p2,d$b[] p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, d.class, "1")) {
          return;
       }
       if (!p3.length || (p0 != null && p1 != null)) {
          int len = p3.length;
          int i = 0;
          while (true) {
             if (i < len) {
                object oobject = p3[i];
                if (oobject != null) {
                   d$b a = oobject.a;
                   if (a != null && a.getVisibility() != 8) {
                      d$b a1 = oobject.a;
                      d$b b = oobject.b;
                      d uod = d.class;
                      if (PatchProxy.isSupport(uod)) {
                         Object[] objArray = new Object[]{a1,p1,p0,Integer.valueOf(b),p2};
                         if (!PatchProxy.applyVoid(objArray, null, uod, "2")) {
                         label_0059 :
                            if (a1 != null) {
                               c uoc = new c(p1, a1, b, p0, p2);
                               d.b(0, a1, uod);
                               break ;
                            }
                         }
                      }else {
                         goto label_0059 ;
                      }
                      break ;
                   }
                }
                i = i + 1;
             }
          }
          return;
       }
    label_006c :
       return;
    }
    public static void b(boolean p0,View p1,Runnable p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, null, d.class, "4")) {
          return;
       }
       if (p1.getVisibility() == 8) {
          return;
       }
       if (i0.Y(p1) && !p0) {
          p2.run();
       }else {
          p1.getViewTreeObserver().addOnGlobalLayoutListener(new d$a(p1, p2));
       }
       return;
    }
}
