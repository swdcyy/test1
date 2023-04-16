package com.kwai.live.gzone.guess.kshell.y;
import com.kwai.live.gzone.guess.kshell.k$a;
import com.kwai.live.gzone.guess.kshell.x;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import brd.t;
import t45.d;
import brd.z;
import p57.c0;
import erd.g;
import p57.f0;
import p57.g0;
import crd.b;
import p57.z;
import java.lang.Runnable;
import ekd.k1;

public class y implements k$a	// class@000d82
{
    public final x a;

    public void y(x p0){
       this.a = p0;
       super();
    }
    public void a(long p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oy, "2")) {
          return;
       }
       oy = this.a;
       Objects.requireNonNull(oy);
       x ox = x.class;
       if (!PatchProxy.isSupport(ox) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), oy, ox, "25")) {
          oy.W = false;
          oy.X = null;
          oy.c9(oy.getLiveStreamId(), 1);
          oy.V = oy.S8(p0).observeOn(d.a).doOnNext(new c0(oy)).subscribe(new f0(oy), new g0(oy));
       }
       return;
    }
    public void b(long p0){
       y oy = y.class;
       if (PatchProxy.isSupport(oy) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oy, "1")) {
          return;
       }
       oy = this.a;
       Objects.requireNonNull(oy);
       x ox = x.class;
       if (!PatchProxy.isSupport(ox) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), oy, ox, "19")) {
          oy.W = true;
          oy.X8(p0);
          k1.s(new z(oy), oy, (long)oy.V8(p0));
       }
       return;
    }
}
