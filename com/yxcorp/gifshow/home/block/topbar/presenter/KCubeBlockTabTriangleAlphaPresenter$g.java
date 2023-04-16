package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabTriangleAlphaPresenter$g;
import zq6.u;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabTriangleAlphaPresenter;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.kcube.decorator.IContainerDecorator;
import wq6.f;
import wq6.h;

public final class KCubeBlockTabTriangleAlphaPresenter$g implements u	// class@001683
{
    public final KCubeBlockTabTriangleAlphaPresenter a;

    public void KCubeBlockTabTriangleAlphaPresenter$g(KCubeBlockTabTriangleAlphaPresenter p0){
       this.a = p0;
       super();
    }
    public void onChange(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KCubeBlockTabTriangleAlphaPresenter$g.class, "1")) {
       }else {
          p0 = this.a;
          if (p0.p != null) {
             float f = (KCubeBlockTabTriangleAlphaPresenter.P8(p0).c().isSelected())? 0x3f800000: 0;
             p0.S8(f);
          }
       }
       return;
    }
}
