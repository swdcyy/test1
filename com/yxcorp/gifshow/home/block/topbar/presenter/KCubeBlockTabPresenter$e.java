package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$e;
import erd.g;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class KCubeBlockTabPresenter$e implements g	// class@00166d
{
    public final KCubeBlockTabPresenter b;

    public void KCubeBlockTabPresenter$e(KCubeBlockTabPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KCubeBlockTabPresenter$e.class, "1")) {
       }else {
          a.o(p0, "isSel");
          if (p0.booleanValue()) {
             this.b.V8();
          }
       }
       return;
    }
}
