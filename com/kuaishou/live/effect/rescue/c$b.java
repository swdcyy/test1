package com.kuaishou.live.effect.rescue.c$b;
import com.kuaishou.live.effect.rescue.LiveEffectTaskSurvivorPool$a;
import com.kuaishou.live.effect.rescue.c;
import java.lang.Object;
import rz2.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import pz2.c;
import pz2.a;
import java.util.List;
import java.util.Collections;
import java.lang.Throwable;
import iy2.g;

public class c$b implements LiveEffectTaskSurvivorPool$a	// class@001b20
{
    public final c a;

    public void c$b(c p0){
       this.a = p0;
       super();
    }
    public void a(a p0,int p1){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       p0.b();
       if (p1 == 4) {
          this.a.e.d(p0.c().b(), Collections.singletonList(p0), "TRIM_FOR_FULL", null);
       }
       return;
    }
}
