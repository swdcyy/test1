package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$l;
import erd.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KCubeBlockTabPresenter$l implements r	// class@001674
{
    public static final KCubeBlockTabPresenter$l b;

    static {
       KCubeBlockTabPresenter$l.b = new KCubeBlockTabPresenter$l();
    }
    public void KCubeBlockTabPresenter$l(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, KCubeBlockTabPresenter$l.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = p0.booleanValue();
       }
       return b;
    }
}
