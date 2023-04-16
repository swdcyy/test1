package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$d;
import erd.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KCubeBlockTabPresenter$d implements r	// class@00166c
{
    public static final KCubeBlockTabPresenter$d b;

    static {
       KCubeBlockTabPresenter$d.b = new KCubeBlockTabPresenter$d();
    }
    public void KCubeBlockTabPresenter$d(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, KCubeBlockTabPresenter$d.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = p0.booleanValue();
       }
       return b;
    }
}
