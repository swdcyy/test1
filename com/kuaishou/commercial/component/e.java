package com.kuaishou.commercial.component.e;
import java.lang.Runnable;
import com.kuaishou.commercial.component.f;
import java.lang.Object;
import ekd.k1;
import android.view.View;
import androidx.fragment.app.Fragment;
import nl9.i0;
import lnc.l1;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.animation.ValueAnimator;
import ow.o;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import erd.g;
import java.lang.Throwable;
import yx.j0;
import java.lang.StringBuilder;

public final class e implements Runnable	// class@00149b
{
    public final f b;

    public void e(f p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       f uof = f.class;
       int i = 0;
       if (tb.e == 1) {
          k1.m(tb.k);
          f c = tb.c;
          if (c == null || c.getView() == null) {
             tb.e = -5;
             tb.a("containerView is null");
          }else {
             View view = tb.c.getView();
             View view1 = view.findViewById(R.id.content_fragment);
             view = view.findViewById(R.id.loading);
             f d = tb.d;
             i0 a = d.a;
             if (d.i == null) {
                int i1 = (l1.a())? 0x7f010109: 0x7f010105;
                view1.startAnimation(AnimationUtils.loadAnimation(a, i1));
             }
             if (tb.d.h != null) {
                d = tb.c;
                if (!PatchProxy.applyVoidOneRefs(d, tb, uof, "3")) {
                   Dialog dialog = d.getDialog();
                   if (dialog != null && dialog.getWindow() != null) {
                      ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f19999a});
                      valueAnimato.setDuration(200);
                      valueAnimato.addUpdateListener(new o(dialog));
                      valueAnimato.start();
                   }
                }
             }
             view1.setVisibility(i);
             view.setVisibility(8);
             if (!PatchProxy.applyVoid(null, tb, uof, "2")) {
                f i2 = tb.i;
                if (i2 != null) {
                   try{
                      i2.accept("");
                   }catch(java.lang.Exception e0){
                      j0.b("TransparentBgWebViewHelper", "fail callback exception", e0);
                   }
                }
             }
          }
       }else {
          tb.a("FE callback pageState: "+tb.e);
          Object[] objArray = new Object[i];
          j0.c("TransparentBgWebViewHelper", "can not show web, mPageStat="+tb.e, objArray);
       }
    }
}
