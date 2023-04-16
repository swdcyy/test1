package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$q;
import erd.g;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class KCubeBlockTabPresenter$q implements g	// class@00167b
{
    public final KCubeBlockTabPresenter b;

    public void KCubeBlockTabPresenter$q(KCubeBlockTabPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KCubeBlockTabPresenter$q.class, "1")) {
       }else {
          a.o(p0, "showTriangleIndicator");
          if (p0.booleanValue()) {
             this.b.V8();
          }
       }
       return;
    }
}
