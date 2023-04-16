package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$o;
import erd.o;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class KCubeBlockTabPresenter$o implements o	// class@001679
{
    public static final KCubeBlockTabPresenter$o b;

    static {
       KCubeBlockTabPresenter$o.b = new KCubeBlockTabPresenter$o();
    }
    public void KCubeBlockTabPresenter$o(){
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, KCubeBlockTabPresenter$o.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "appBarState");
          boolean b = (p0.intValue() == 2)? true: false;
          uBoolean = Boolean.valueOf(b);
       }
       return uBoolean;
    }
}
