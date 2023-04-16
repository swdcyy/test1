package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$h;
import erd.g;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.kcube.decorator.IContainerDecorator;
import wq6.f;
import yq6.d;
import un5.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.home.block.topbar.presenter.a;
import yq6.a;
import z1.a;

public final class KCubeBlockTabPresenter$h implements g	// class@001670
{
    public final KCubeBlockTabPresenter b;

    public void KCubeBlockTabPresenter$h(KCubeBlockTabPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KCubeBlockTabPresenter$h.class, "1")) {
       }else {
          a g = a.g;
          a.o(g, "HomeCommonAction.RECYCLERVIEW_REFRESH_ENABLE");
          KCubeBlockTabPresenter.P8(this.b).c().d().e(g, new a(p0));
       }
       return;
    }
}
