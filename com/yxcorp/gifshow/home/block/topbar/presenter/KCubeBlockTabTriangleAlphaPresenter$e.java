package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabTriangleAlphaPresenter$e;
import erd.r;
import java.lang.Object;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class KCubeBlockTabTriangleAlphaPresenter$e implements r	// class@001681
{
    public static final KCubeBlockTabTriangleAlphaPresenter$e b;

    static {
       KCubeBlockTabTriangleAlphaPresenter$e.b = new KCubeBlockTabTriangleAlphaPresenter$e();
    }
    public void KCubeBlockTabTriangleAlphaPresenter$e(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, KCubeBlockTabTriangleAlphaPresenter$e.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = a.g(p0, Float.valueOf(0x3f800000));
       }
       return b;
    }
}
