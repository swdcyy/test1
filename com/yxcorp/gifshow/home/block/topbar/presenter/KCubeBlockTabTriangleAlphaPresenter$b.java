package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabTriangleAlphaPresenter$b;
import erd.c;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KCubeBlockTabTriangleAlphaPresenter$b implements c	// class@00167e
{
    public static final KCubeBlockTabTriangleAlphaPresenter$b a;

    static {
       KCubeBlockTabTriangleAlphaPresenter$b.a = new KCubeBlockTabTriangleAlphaPresenter$b();
    }
    public void KCubeBlockTabTriangleAlphaPresenter$b(){
       super();
    }
    public Object a(Object p0,Object p1){
       Boolean uBoolean = PatchProxy.applyTwoRefs(p0, p1, this, KCubeBlockTabTriangleAlphaPresenter$b.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "appBarState");
          a.p(p1, "isSel");
          boolean b = (p0.intValue() == 2 && p1.booleanValue())? true: false;
          uBoolean = Boolean.valueOf(b);
       }
       return uBoolean;
    }
}
