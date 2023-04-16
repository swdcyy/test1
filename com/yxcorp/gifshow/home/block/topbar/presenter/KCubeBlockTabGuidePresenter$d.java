package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabGuidePresenter$d;
import erd.r;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabGuidePresenter;
import java.lang.Object;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import wra.b;

public final class KCubeBlockTabGuidePresenter$d implements r	// class@001663
{
    public final KCubeBlockTabGuidePresenter b;

    public void KCubeBlockTabGuidePresenter$d(KCubeBlockTabGuidePresenter p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, KCubeBlockTabGuidePresenter$d.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          if (a.g(p0, Float.valueOf(0x3f800000)) && !this.b.W8()) {
             p0 = this.b.q;
             if (p0 == null) {
                a.S("mHomeBlockViewState");
             }
             if (!p0.c()) {
                b = true;
             }
          }
       label_0041 :
          b = false;
       }
       return b;
    }
}
