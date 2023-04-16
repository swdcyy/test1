package com.kuaishou.commercial.splash.presenter.x0;
import java.lang.Runnable;
import com.kuaishou.commercial.splash.presenter.y0;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import yx.j0;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.ViewConfiguration;
import java.lang.StringBuilder;
import gz.z4;
import gz.a5;
import android.view.GestureDetector$SimpleOnGestureListener;
import android.view.GestureDetector$OnGestureListener;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import android.view.GestureDetector;
import android.view.View$OnTouchListener;

public final class x0 implements Runnable	// class@001612
{
    public final y0 b;

    public void x0(y0 p0){
       this.b = p0;
    }
    public final void run(){
       x0 tb = this.b;
       Objects.requireNonNull(tb);
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("SplashTouchControl", "mStartLineRunnable", objArray);
       tb.M.setVisibility(i);
       tb.d9();
       ViewGroup viewGroup = tb.m8();
       if (PatchProxy.applyVoidOneRefs(viewGroup, tb, y0.class, "12")) {
       }else if(viewGroup == null){
          int i1 = ViewConfiguration.get(tb.getContext()).getScaledTouchSlop() * 2;
          Object[] objArray1 = new Object[i];
          j0.f("SplashLineView", "swipeThreshold :"+i1, objArray1);
          tb.N = new z4(tb, i1);
          a5 uoa5 = new a5(tb, tb.getContext(), new GestureDetector$SimpleOnGestureListener());
          tb.O = uoa5;
          y0 l = tb.L;
          if (l instanceof ScaleHelpView) {
             l.e(uoa5);
          }else {
             viewGroup.setOnTouchListener(tb.N);
          }
       }
       return;
    }
}
