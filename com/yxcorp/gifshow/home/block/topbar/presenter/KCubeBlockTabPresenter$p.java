package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$p;
import erd.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KCubeBlockTabPresenter$p implements r	// class@00167a
{
    public static final KCubeBlockTabPresenter$p b;

    static {
       KCubeBlockTabPresenter$p.b = new KCubeBlockTabPresenter$p();
    }
    public void KCubeBlockTabPresenter$p(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, KCubeBlockTabPresenter$p.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = p0.booleanValue();
       }
       return b;
    }
}
