package com.kuaishou.live.effect.rescue.c;
import rz2.c;
import rz2.f;
import iy2.v;
import iy2.g;
import com.kuaishou.live.effect.rescue.c$c;
import iy2.d;
import java.lang.Object;
import com.kuaishou.live.effect.rescue.c$a;
import com.kuaishou.live.effect.rescue.c$b;
import com.kuaishou.live.effect.rescue.LiveEffectTaskSurvivorPool;
import com.kuaishou.live.effect.rescue.LiveEffectTaskSurvivorPool$a;
import pz2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rz2.b;
import rz2.a;
import rz2.e;
import com.kuaishou.live.effect.rescue.LiveEffectTaskSurvivorPool$FIFOTaskSurvivorCache;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class c implements c	// class@001b22
{
    public final f b;
    public final v c;
    public final LiveEffectTaskSurvivorPool d;
    public final g e;
    public final c$c f;
    public final d g;
    public final b h;
    public final LiveEffectTaskSurvivorPool$a i;

    public void c(f p0,v p1,g p2,c$c p3,d p4){
       super();
       this.h = new c$a(this);
       c$b uob = new c$b(this);
       this.i = uob;
       this.b = p0;
       this.c = p1;
       this.e = p2;
       this.f = p3;
       this.d = new LiveEffectTaskSurvivorPool(p0.b, uob);
       this.g = p4;
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       c tb = this.b;
       a uoa = tb.d.a(p0, tb, this.h);
       c td = this.d;
       _monitor_enter(td);
       if (PatchProxy.applyVoidOneRefs(uoa, td, LiveEffectTaskSurvivorPool.class, "1")) {
          _monitor_exit(td);
       }else {
          td.a.enqueue(uoa);
          _monitor_exit(td);
       }
       uoa.d = System.currentTimeMillis();
       p0.i(true);
       uoa.d();
       return;
    }
    public boolean isEnable(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.a();
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       c td = this.d;
       _monitor_enter(td);
       if (PatchProxy.applyVoid(null, td, LiveEffectTaskSurvivorPool.class, "4")) {
          _monitor_exit(td);
       }else {
          td.a.evictAll();
          _monitor_exit(td);
       }
       return;
    }
}
