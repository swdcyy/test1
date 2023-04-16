package com.kuaishou.live.basic.tk.LiveTkBridge$AsyncResolver;
import o63.l;
import tx4.h;
import ftd.k0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import o63.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.basic.tk.LiveTkBridge$AsyncResolver$callback$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;

public final class LiveTkBridge$AsyncResolver extends l	// class@000d0f
{
    public final h c;
    public final k0 d;

    public void LiveTkBridge$AsyncResolver(h p0,k0 p1){
       a.p(p1, "mainScope");
       super(true, false, 2, null);
       this.c = p0;
       this.d = p1;
    }
    public void a(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTkBridge$AsyncResolver.class, "1")) {
          return;
       }
       a.p(p0, "result");
       b.Z(LiveJsBridgeLogTag.TK, "resolve: "+p0);
       if (this.c == null) {
          return;
       }
       a.f(this.d, null, null, new LiveTkBridge$AsyncResolver$callback$1(this, p0, null), 3, null);
       return;
    }
}
