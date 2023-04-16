package com.kuaishou.live.common.core.component.turbomode.TurboModeViewHandler$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class TurboModeViewHandler$a extends PresenterV2	// class@0017bd
{
    public final b p;
    public static String sLivePresenterClassName = "TurboModeViewHandler$6$1";

    public void TurboModeViewHandler$a(b p0){
       this.p = p0;
       super();
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, TurboModeViewHandler$a.class, "1")) {
          return;
       }
       this.p.dispose();
       return;
    }
}
