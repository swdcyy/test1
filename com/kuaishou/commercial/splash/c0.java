package com.kuaishou.commercial.splash.c0;
import java.lang.Runnable;
import com.kuaishou.commercial.splash.d0;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.Window;
import com.kuaishou.commercial.splash.SplashUtils;
import android.view.View;
import yy.a2;
import msd.q;
import com.yxcorp.gifshow.util.l;
import ekd.i;
import java.lang.StringBuilder;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import im8.f;
import com.kuaishou.commercial.splash.r$b;

public final class c0 implements Runnable	// class@0015a4
{
    public final d0 b;

    public void c0(d0 p0){
       this.b = p0;
    }
    public final void run(){
       c0 tb = this.b;
       Objects.requireNonNull(tb);
       d0 uod0 = d0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, uod0, "21")) {
       }else if(PatchProxy.applyVoid(objArray, tb, uod0, "15")){
          Object[] objArray1 = new Object[0];
          String str = "SplashTopPlayControlPresenter";
          j0.f(str, "exitFullScreen", objArray1);
          Activity activity = tb.getActivity();
          if (activity == null || tb.E == null) {
             Object[] objArray2 = new Object[0];
             j0.f(str, "exitFullScreen isEnter: "+tb.E, objArray2);
          }else {
             tb.E = false;
             Window window = activity.getWindow();
             if (window != null) {
                window.clearFlags(1024);
                window.addFlags(2048);
             }
             if (SplashUtils.f()) {
                l.b(tb.m8(), new a2(tb));
             }
             i.h(tb.getActivity(), 0, 0);
          }
       }
       uod0 = tb.I;
       if (uod0 != null) {
          uod0.setAlpha(0);
          tb.I.setVisibility(0);
          tb.B.onNext(Boolean.TRUE);
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tb.I, View.ALPHA, new float[2]{0,0x3f800000});
          objectAnimat.setDuration(500);
          objectAnimat.start();
          if (tb.Z.get() != null) {
             tb.Z.get().b();
          }
       }
       tb.Y8(0);
       return;
    }
}
