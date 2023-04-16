package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabTriangleAlphaPresenter$i;
import ekd.f$j;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabTriangleAlphaPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.kcube.decorator.IContainerDecorator;
import wq6.f;
import zq6.r;
import bo5.a;
import kotlin.jvm.internal.a;
import co5.p;
import zq6.p;
import com.yxcorp.utility.Log;
import android.animation.Animator;

public final class KCubeBlockTabTriangleAlphaPresenter$i extends f$j	// class@001685
{
    public final KCubeBlockTabTriangleAlphaPresenter a;
    public final boolean b;

    public void KCubeBlockTabTriangleAlphaPresenter$i(KCubeBlockTabTriangleAlphaPresenter p0,boolean p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoidWithListener(null, this, KCubeBlockTabTriangleAlphaPresenter$i.class, "5")) {
          return;
       }
       if (this.b == null) {
          KCubeBlockTabTriangleAlphaPresenter$i ta = this.a;
          ta.p = false;
          p b = a.B;
          a.o(b, "HomeTopStateId.TAB_TRIANGLE_NOTIFY");
          KCubeBlockTabTriangleAlphaPresenter.P8(ta).c().e0().a(b, p.b());
          Log.b("BLOCK_TAB_TRIANGLE_ALPHA", "notify triangle hide");
       }
       PatchProxy.onMethodExit(KCubeBlockTabTriangleAlphaPresenter$i.class, "5");
       return;
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, KCubeBlockTabTriangleAlphaPresenter$i.class, "3")) {
          return;
       }
       this.a();
       PatchProxy.onMethodExit(KCubeBlockTabTriangleAlphaPresenter$i.class, "3");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, KCubeBlockTabTriangleAlphaPresenter$i.class, "2")) {
          return;
       }
       this.a();
       PatchProxy.onMethodExit(KCubeBlockTabTriangleAlphaPresenter$i.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, KCubeBlockTabTriangleAlphaPresenter$i.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidWithListener(null, this, KCubeBlockTabTriangleAlphaPresenter$i.class, "4")) {
          if (this.b != null) {
             KCubeBlockTabTriangleAlphaPresenter$i ta = this.a;
             ta.p = true;
             ta.S8(0);
          }
          PatchProxy.onMethodExit(KCubeBlockTabTriangleAlphaPresenter$i.class, "4");
       }
       PatchProxy.onMethodExit(KCubeBlockTabTriangleAlphaPresenter$i.class, "1");
       return;
    }
}
