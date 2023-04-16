package com.kuaishou.live.bridge.rn.LiveRnBridge$a$a;
import o63.l;
import com.kuaishou.live.bridge.rn.LiveRnBridge$a;
import o63.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import java.lang.StringBuilder;
import com.kuaishou.live.external.invoke.krn.LiveRnCommandParams;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.facebook.react.bridge.Promise;

public class LiveRnBridge$a$a extends l	// class@000e2b
{
    public final LiveRnBridge$a c;

    public void LiveRnBridge$a$a(LiveRnBridge$a p0,boolean p1,boolean p2){
       this.c = p0;
       super(p1, p2);
    }
    public void a(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRnBridge$a$a.class, "1")) {
          return;
       }
       b.Z(LiveJsBridgeLogTag.RN, "execute command: "+this.c.d.getCommand()+" callback, for: "+this.c.i);
       LiveRnBridge$a$a tc = this.c;
       if (tc.g != null) {
          if (p0.a != null) {
             tc.h.resolve(p0.b);
          }else {
             tc.h.reject("2", p0.c);
          }
       }else {
          tc.h.resolve(p0.b);
       }
       return;
    }
}
