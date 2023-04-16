package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$g;
import erd.g;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.kcube.decorator.IContainerDecorator;
import wq6.f;
import zq6.r;
import bo5.a;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import zq6.p;

public final class KCubeBlockTabPresenter$g implements g	// class@00166f
{
    public final KCubeBlockTabPresenter b;

    public void KCubeBlockTabPresenter$g(KCubeBlockTabPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KCubeBlockTabPresenter$g.class, "1")) {
       }else {
          p d = a.D;
          a.o(d, "HomeTopStateId.TAB_ROTATE_DEGREES");
          KCubeBlockTabPresenter.P8(this.b).c().e0().a(d, Boolean.TRUE);
       }
       return;
    }
}
