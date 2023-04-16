package com.kuaishou.live.basic.bridge.LiveJsTickChannel$a;
import jtd.d;
import com.kuaishou.live.basic.bridge.LiveJsTickChannel;
import java.lang.Object;
import jtd.e;
import asd.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.bridge.LiveJsTickChannel$a$a;
import csd.b;
import qrd.l1;

public final class LiveJsTickChannel$a implements d	// class@000cab
{
    public final d a;
    public final LiveJsTickChannel b;

    public void LiveJsTickChannel$a(d p0,LiveJsTickChannel p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object b(e p0,c p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, LiveJsTickChannel$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = this.a.b(new LiveJsTickChannel$a$a(p0, this), p1);
       if (p0 == b.h()) {
          PatchProxy.onMethodExit(LiveJsTickChannel$a.class, "1");
          return p0;
       }else {
          PatchProxy.onMethodExit(LiveJsTickChannel$a.class, "1");
          return l1.a;
       }
    }
}
