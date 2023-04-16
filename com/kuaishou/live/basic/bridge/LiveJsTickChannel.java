package com.kuaishou.live.basic.bridge.LiveJsTickChannel;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.live.basic.bridge.LiveJsTickChannel$dateFormat$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.jsbridge.LiveJsSubscribeParams$Params;
import kotlin.jvm.internal.a;
import ftd.k0;
import ftd.l0;
import com.kwai.robust.PatchProxyResult;
import jtd.d;
import com.kuaishou.live.basic.bridge.LiveJsTickChannel$tickFlow$1;
import asd.c;
import msd.p;
import jtd.f;
import com.kuaishou.live.basic.bridge.LiveJsTickChannel$a;
import com.kuaishou.live.basic.bridge.LiveJsTickChannel$onSubscribed$$inlined$also$lambda$2;
import ftd.z1;
import qrd.l1;
import java.lang.Number;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CancellationException;

public final class LiveJsTickChannel extends AbstractLiveJsChannel	// class@000caf
{
    public k0 h;
    public final p i;

    public void LiveJsTickChannel(){
       super();
       this.i = s.b(LazyThreadSafetyMode.NONE, LiveJsTickChannel$dateFormat$2.INSTANCE);
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, LiveJsTickChannel.class, "5")) {
          return;
       }
       this.o();
       return;
    }
    public void m(String p0,LiveJsSubscribeParams$Params p1){
       LiveJsTickChannel liveJsTickCh = LiveJsTickChannel.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, liveJsTickCh, "2")) {
          return;
       }
       a.p(p0, "subscribeId");
       if (this.h != null) {
          return;
       }
       k0 ok0 = l0.b();
       Object[] objArray = null;
       d uod = PatchProxy.apply(objArray, this, liveJsTickCh, "4");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = f.F0(new LiveJsTickChannel$tickFlow$1(objArray));
       }
       f.T0(f.e1(new LiveJsTickChannel$a(f.V(uod), this), new LiveJsTickChannel$onSubscribed$$inlined$also$lambda$2(objArray, this)), ok0);
       this.h = ok0;
       return;
    }
    public void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveJsTickChannel.class, "3")) {
          return;
       }
       a.p(p0, "subscribeId");
       p0 = PatchProxy.apply(null, this, AbstractLiveJsChannel.class, "14");
       int i = (p0 != PatchProxyResult.class)? p0.intValue(): this.c.size();
       if (!i) {
          this.o();
       }
       return;
    }
    public final void o(){
       if (PatchProxy.applyVoid(null, this, LiveJsTickChannel.class, "6")) {
          return;
       }
       LiveJsTickChannel th = this.h;
       if (th != null) {
          l0.f(th, null, 1, null);
       }
       this.h = null;
       return;
    }
}
