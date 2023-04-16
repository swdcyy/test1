package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$n;
import erd.g;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter;
import java.lang.Object;
import wra.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.google.android.material.appbar.AppBarLayout;

public final class KCubeBlockTabPresenter$n implements g	// class@001678
{
    public final KCubeBlockTabPresenter b;

    public void KCubeBlockTabPresenter$n(KCubeBlockTabPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KCubeBlockTabPresenter$n.class, "1")) {
       }else {
          KCubeBlockTabPresenter q = this.b.q;
          if (q == null) {
             a.S("mAppBarLayout");
          }
          q.p((p0.a ^ 0x01), p0.b);
       }
       return;
    }
}
