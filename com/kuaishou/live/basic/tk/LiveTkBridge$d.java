package com.kuaishou.live.basic.tk.LiveTkBridge$d;
import o63.h;
import com.kuaishou.live.basic.tk.LiveTkBridge$AsyncResolver;
import java.lang.Object;
import o63.q;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.basic.tk.LiveTkBridge$a;
import nsd.u;
import o63.m;
import o63.m$a;
import o63.l;

public final class LiveTkBridge$d implements h	// class@000d15
{
    public final LiveTkBridge$AsyncResolver a;

    public void LiveTkBridge$d(LiveTkBridge$AsyncResolver p0){
       this.a = p0;
       super();
    }
    public q a(){
       return q.d;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTkBridge$d.class, "1")) {
          return;
       }
       LiveTkBridge$a uoa = new LiveTkBridge$a(0, null, p0, 3, null);
       this.a.b(m.g.f(v0, true));
       return;
    }
}
