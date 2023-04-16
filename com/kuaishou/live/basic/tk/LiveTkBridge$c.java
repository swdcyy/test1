package com.kuaishou.live.basic.tk.LiveTkBridge$c;
import o63.l;
import tx4.h;
import com.kuaishou.live.basic.tk.LiveTkCommandParams;
import nsd.u;
import o63.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveTkBridge$c extends l	// class@000d14
{
    public final h c;
    public final LiveTkCommandParams d;

    public void LiveTkBridge$c(h p0,LiveTkCommandParams p1,boolean p2){
       this.c = p0;
       this.d = p1;
       super(p2, false, 2, null);
    }
    public void a(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTkBridge$c.class, "1")) {
          return;
       }
       a.p(p0, "result");
       b.Z(LiveJsBridgeLogTag.TK, "resolve: "+p0);
       LiveTkBridge$c tc = this.c;
       if (tc != null) {
          Object[] objArray = new Object[]{p0.b};
          tc.call(objArray);
       }
       return;
    }
}
