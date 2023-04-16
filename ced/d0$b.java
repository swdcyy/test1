package ced.d0$b;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import ced.d0;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import sf5.d;
import sf5.c;

public final class d0$b extends BottomSheetBehavior$c	// class@000547
{
    public final d0 a;

    public void d0$b(d0 p0){
       this.a = p0;
       super();
    }
    public void a(View p0,float p1){
       if (PatchProxy.isSupport2(d0$b.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(p0, Float.valueOf(p1), this, d0$b.class, "2")) {
          return;
       }
       a.p(p0, "bottomSheet");
       int i = 0;
       if (p1 - (float)i >= 0) {
          this.a.R8(true);
       }else {
          this.a.R8(i);
       }
       this.a.V8(p1);
       PatchProxy.onMethodExit(d0$b.class, "2");
       return;
    }
    public void b(View p0,int p1){
       d0$b ta;
       c uoc;
       if (PatchProxy.isSupport2(d0$b.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, d0$b.class, "1")) {
          return;
       }
       a.p(p0, "bottomSheet");
       if (p1 == 5) {
          Activity activity = this.a.getActivity();
          if (activity != null) {
             activity.finish();
          }
       }
       int i = 3;
       boolean b = true;
       boolean b1 = false;
       if (p1 != i) {
          this.a.S8(b);
       }else {
          this.a.S8(b1);
       }
       if (p1 == i) {
          ta = this.a;
          if (p1 != ta.E) {
             uoc = d.d.c(ta.getActivity());
             if (uoc != null) {
                uoc.a(b1);
             }
             this.a.P8(b1);
          }
          uoc.E = p1;
       }else if(p1 == 4){
          ta = this.a;
          if (p1 != ta.E) {
             uoc = d.d.c(ta.getActivity());
             if (uoc != null) {
                uoc.a(b);
             }
             this.a.P8(b);
          }
          uoc.E = p1;
       }
       PatchProxy.onMethodExit(d0$b.class, "1");
       return;
    }
}
