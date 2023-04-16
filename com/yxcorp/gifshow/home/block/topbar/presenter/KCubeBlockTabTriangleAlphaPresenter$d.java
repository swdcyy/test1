package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabTriangleAlphaPresenter$d;
import erd.c;
import java.lang.Object;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class KCubeBlockTabTriangleAlphaPresenter$d implements c	// class@001680
{
    public static final KCubeBlockTabTriangleAlphaPresenter$d a;

    static {
       KCubeBlockTabTriangleAlphaPresenter$d.a = new KCubeBlockTabTriangleAlphaPresenter$d();
    }
    public void KCubeBlockTabTriangleAlphaPresenter$d(){
       super();
    }
    public Object a(Object p0,Object p1){
       Boolean uBoolean = PatchProxy.applyTwoRefs(p0, p1, this, KCubeBlockTabTriangleAlphaPresenter$d.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "tabSwitchOffset");
          a.p(p1, "isSel");
          Log.b("BLOCK_TAB_TRIANGLE_ALPHA", "tabOffset: "+p0+", sel: "+p1);
          boolean b = (a.g(p0, Float.valueOf(0x3f800000)) && p1.booleanValue())? true: false;
          uBoolean = Boolean.valueOf(b);
       }
       return uBoolean;
    }
}
