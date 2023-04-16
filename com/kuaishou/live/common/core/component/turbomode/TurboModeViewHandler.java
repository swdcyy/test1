package com.kuaishou.live.common.core.component.turbomode.TurboModeViewHandler;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qy1.a;
import com.kuaishou.live.common.core.component.turbomode.OptimizedElement;
import java.util.List;
import com.kuaishou.live.common.core.component.turbomode.TurboModeViewHandler$5;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import crd.b;
import com.kuaishou.live.common.core.component.turbomode.TurboModeViewHandler$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.common.core.component.turbomode.TurboModeViewHandler$b;
import erd.g;

public final class TurboModeViewHandler	// class@0017bf
{
    public final a a;
    public final OptimizedElement b;
    public final List c;
    public final l d;

    public void TurboModeViewHandler(PresenterV2 p0,a p1,OptimizedElement p2,List p3){
       super(p0, p1, p2, p3, TurboModeViewHandler$5.INSTANCE);
    }
    public void TurboModeViewHandler(PresenterV2 p0,a p1,OptimizedElement p2,List p3,l p4){
       a.p(p0, "presenter");
       a.p(p2, "element");
       a.p(p3, "viewList");
       a.p(p4, "action");
       super(p1, p2, p3, p4);
       b uob = this.a();
       if (uob != null) {
          p0.U7(new TurboModeViewHandler$a(uob));
       }
       return;
    }
    public void TurboModeViewHandler(a p0,OptimizedElement p1,List p2,l p3){
       a.p(p1, "element");
       a.p(p2, "viewList");
       a.p(p3, "action");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final b a(){
       Object[] objArray = null;
       TurboModeViewHandler obj = PatchProxy.apply(objArray, this, TurboModeViewHandler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          objArray = obj.vo(this.b).observeOn(d.a).subscribe(new TurboModeViewHandler$b(this));
       }
       return objArray;
    }
}
