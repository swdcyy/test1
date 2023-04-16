package com.kuaishou.commercial.splash.playable.d;
import ub.a;
import ez.w;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yx.j0;
import java.util.Objects;
import android.view.ViewGroup;
import bz.c;
import io.reactivex.subjects.PublishSubject;
import android.graphics.drawable.Animatable;
import ez.u;
import java.lang.Runnable;
import ekd.k1;

public class d extends a	// class@0015bc
{
    public final w b;

    public void d(w p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "2")) {
          return;
       }
       j0.b("SplashPlayablePopupImagePre", "Splash image load failed! ", p1);
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, w.class, "8")) {
          tb.s.setVisibility(8);
          tb.t.onNext(new c(2, 1));
       }
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashPlayablePopupImagePre", "onFinalImageSet", objArray);
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, w.class, "6")) {
          k1.m(new u(tb));
          k1.r(new u(tb), (long)w.v);
       }
       return;
    }
}
