package com.kuaishou.live.common.core.component.watchtimer.b$c;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Iterable;
import java.util.HashSet;
import com.google.common.collect.o;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.System;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Long;
import pp.c;
import com.kuaishou.android.live.log.b;

public class b$c	// class@0017d1
{
    public boolean a;
    public boolean b;
    public long c;
    public long d;
    public final String e;
    public final String f;
    public final List g;

    public void b$c(String p0,String p1,List p2,boolean p3){
       super();
       this.a = true;
       this.e = p0;
       this.f = p1;
       List list = (p2 == null)? null: Lists.c(o.i(p2));
       this.g = list;
       this.b = p3;
       return;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, b$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e+"_"+this.f;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "2")) {
          return;
       }
       this.d = this.d + (System.currentTimeMillis() - this.c);
       this.c = 0;
       b.f0(LiveLogTag.LIVE_WATCH_TIMER, "logEnd", "biz", this.e, "token", this.f, "startTime", Long.valueOf(0), "duration", Long.valueOf(this.d));
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "1")) {
          return;
       }
       long l = System.currentTimeMillis();
       this.c = l;
       Long longx = Long.valueOf(l);
       b.f0(LiveLogTag.LIVE_WATCH_TIMER, "logStart", "biz", this.e, "token", this.f, "startTime", longx, "duration", Long.valueOf(this.d));
       return;
    }
}
