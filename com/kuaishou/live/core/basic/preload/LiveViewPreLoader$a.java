package com.kuaishou.live.core.basic.preload.LiveViewPreLoader$a;
import java.lang.Object;
import nsd.u;
import com.kuaishou.live.core.basic.preload.LiveLoadViewAsyncStrategy;
import r12.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import r12.l;
import java.lang.Enum;
import com.kuaishou.live.core.basic.preload.LiveViewPreLoader;
import qrd.p;
import kotlin.NoWhenBranchMatchedException;

public final class LiveViewPreLoader$a	// class@0008c7
{

    public void LiveViewPreLoader$a(){
       super();
    }
    public void LiveViewPreLoader$a(u p0){
       super();
    }
    public final e a(LiveLoadViewAsyncStrategy p0){
       e uoe;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveViewPreLoader$a.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "strategy");
       int i = l.a[p0.ordinal()];
       Object[] objArray = null;
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                uoe = PatchProxy.apply(objArray, this, LiveViewPreLoader$a.class, "2");
                if (uoe == patchProxyRe) {
                   uoe = LiveViewPreLoader.f.getValue();
                }
             }else {
                throw new NoWhenBranchMatchedException();
             }
          }else {
             uoe = PatchProxy.apply(objArray, this, LiveViewPreLoader$a.class, "1");
             if (uoe == patchProxyRe) {
                uoe = LiveViewPreLoader.e.getValue();
             }
          }
          objArray = uoe;
       }
       return objArray;
    }
}
