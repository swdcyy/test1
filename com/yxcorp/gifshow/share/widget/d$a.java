package com.yxcorp.gifshow.share.widget.d$a;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import com.yxcorp.gifshow.share.widget.d;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.Integer;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import djc.k;
import android.app.Activity;
import android.app.Dialog;
import djc.h;
import java.lang.Runnable;
import ekd.k1;

public class d$a extends BottomSheetBehavior$c	// class@001d1e
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(View p0,float p1){
       if (PatchProxy.isSupport(d$a.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, d$a.class, "2")) {
          return;
       }
       Objects.requireNonNull(this.a);
       return;
    }
    public void b(View p0,int p1){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       Objects.requireNonNull(uoa);
       if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), uoa, d.class, "6")) {
          if (p1 == 5 || (p1 == 4 && !uoa.y.getPeekHeight())) {
             k l = uoa.l;
             if (l != null && (!l.isFinishing() && uoa.isShowing())) {
                k1.o(new h(uoa));
             }
          }
       label_0057 :
          if (p1 == 3) {
             uoa.y.setPeekHeight(p0.getMeasuredHeight());
          }
       }
       return;
    }
}
