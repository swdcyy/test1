package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$f;
import erd.r;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class KCubeBlockTabPresenter$f implements r	// class@00166e
{
    public static final KCubeBlockTabPresenter$f b;

    static {
       KCubeBlockTabPresenter$f.b = new KCubeBlockTabPresenter$f();
    }
    public void KCubeBlockTabPresenter$f(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, KCubeBlockTabPresenter$f.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = (p0.intValue() == 2 || !p0.intValue())? true: false;
       }
       return b;
    }
}
