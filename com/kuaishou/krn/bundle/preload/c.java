package com.kuaishou.krn.bundle.preload.c;
import erd.o;
import gj0.d;
import com.kuaishou.krn.model.LoadingStateTrack;
import java.lang.Object;
import fk0.a;
import com.kuaishou.krn.bundle.preload.KrnReactRootPreloadManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.m;
import vj0.b;
import com.kuaishou.krn.instance.JsFramework;
import com.kuaishou.krn.c;
import kj0.f;
import com.kuaishou.krn.instance.JsExecutorConfig;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.KrnInternalManager;
import vj0.a;
import sj0.b;
import brd.a0;
import com.kuaishou.krn.load.a;
import gj0.g;

public final class c implements o	// class@000843
{
    public final d b;
    public final LoadingStateTrack c;

    public void c(d p0,LoadingStateTrack p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       c uoc = this;
       c b = uoc.b;
       c c = uoc.c;
       a uoa = p0;
       m om = PatchProxy.applyThreeRefs(b, c, uoa, null, KrnReactRootPreloadManager.class, "11");
       if (om != PatchProxyResult.class) {
       }else {
          c.i(b.a());
          b uob = new b(b.a(), b.d(), b.minVersion, c.b().f().a(), false, false);
          JsExecutorConfig jsExecutorCo = b.c();
          if (!PatchProxy.applyVoidOneRefs(jsExecutorCo, om, b.class, "1")) {
             a.p(jsExecutorCo, "<set-?>");
             om.a = jsExecutorCo;
          }
          b uob1 = KrnInternalManager.c.b().c(om, c, false);
          uob1.n(true);
          uob1.m(uoa);
          om = a.d(uob1).C(new g(uob1)).c0();
       }
       return om;
    }
}
