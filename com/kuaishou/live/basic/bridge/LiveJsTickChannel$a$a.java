package com.kuaishou.live.basic.bridge.LiveJsTickChannel$a$a;
import jtd.e;
import com.kuaishou.live.basic.bridge.LiveJsTickChannel$a;
import java.lang.Object;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qrd.l1;
import java.util.Objects;
import com.kuaishou.live.basic.bridge.LiveJsTickChannel;
import java.text.SimpleDateFormat;
import qrd.p;
import java.util.Date;
import csd.b;

public final class LiveJsTickChannel$a$a implements e	// class@000caa
{
    public final e b;
    public final LiveJsTickChannel$a c;

    public void LiveJsTickChannel$a$a(e p0,LiveJsTickChannel$a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object emit(Object p0,c p1){
       LiveJsTickChannel$a$a obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, LiveJsTickChannel$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       p0 = this.c.b;
       Objects.requireNonNull(p0);
       Object obj1 = PatchProxy.apply(null, p0, LiveJsTickChannel.class, "1");
       if (obj1 != PatchProxyResult.class) {
       }else {
          obj1 = p0.i.getValue();
       }
       p0 = obj.emit(obj1.format(new Date()), p1);
       if (p0 == b.h()) {
          PatchProxy.onMethodExit(LiveJsTickChannel$a$a.class, "1");
          return p0;
       }else {
          PatchProxy.onMethodExit(LiveJsTickChannel$a$a.class, "1");
          return l1.a;
       }
    }
}
