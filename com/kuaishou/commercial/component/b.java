package com.kuaishou.commercial.component.b;
import java.lang.Runnable;
import com.kuaishou.commercial.component.c;
import java.lang.Object;
import ekd.k1;
import android.view.View;
import androidx.fragment.app.Fragment;
import nl9.i0;
import lnc.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.animation.ValueAnimator;
import ow.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import erd.g;
import java.lang.Throwable;
import yx.j0;
import java.lang.StringBuilder;

public final class b implements Runnable	// class@001495
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       c uoc = c.class;
       int i = 0;
       if (tb.c == 1) {
          k1.m(tb.h);
          c a = tb.a;
          if (a == null || a.getView() == null) {
             tb.c = -5;
             tb.a("containerView is null");
          }else {
             View view = tb.a.getView();
             View view1 = view.findViewById(R.id.content_fragment);
             view = view.findViewById(R.id.loading);
             i0 a1 = tb.b.a;
             int i1 = (l1.a())? 0x7f010109: 0x7f010105;
             if (tb.b.h != null) {
                c a2 = tb.a;
                if (!PatchProxy.applyVoidOneRefs(a2, tb, uoc, "3")) {
                   Dialog dialog = a2.getDialog();
                   if (dialog != null && dialog.getWindow() != null) {
                      ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f19999a});
                      valueAnimato.setDuration(200);
                      valueAnimato.addUpdateListener(new f(dialog));
                      valueAnimato.start();
                   }
                }
             }
             view1.startAnimation(AnimationUtils.loadAnimation(a1, i1));
             view1.setVisibility(i);
             view.setVisibility(8);
             if (!PatchProxy.applyVoid(null, tb, uoc, "2")) {
                c f = tb.f;
                if (f != null) {
                   try{
                      f.accept("");
                   }catch(java.lang.Exception e0){
                      j0.b("TransparentBgWebViewHelper", "fail callback exception", e0);
                   }
                }
             }
          }
       }else {
          tb.a("FE callback pageState: "+tb.c);
          Object[] objArray = new Object[i];
          j0.c("TransparentBgWebViewHelper", "can not show web, mPageStat="+tb.c, objArray);
       }
    }
}
