package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$k;
import erd.c;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KCubeBlockTabPresenter$k implements c	// class@001673
{
    public static final KCubeBlockTabPresenter$k a;

    static {
       KCubeBlockTabPresenter$k.a = new KCubeBlockTabPresenter$k();
    }
    public void KCubeBlockTabPresenter$k(){
       super();
    }
    public Object a(Object p0,Object p1){
       Boolean uBoolean = PatchProxy.applyTwoRefs(p0, p1, this, KCubeBlockTabPresenter$k.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "appBarState");
          a.p(p1, "isSel");
          boolean b = (!p0.intValue() && p1.booleanValue())? true: false;
          uBoolean = Boolean.valueOf(b);
       }
       return uBoolean;
    }
}
