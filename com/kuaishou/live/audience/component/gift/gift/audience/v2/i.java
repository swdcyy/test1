package com.kuaishou.live.audience.component.gift.gift.audience.v2.i;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.k;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import p91.m;
import brd.t;
import mk1.f;
import rm1.g;
import ez0.x;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.e;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ry1.b;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.g;
import erd.o;
import java.util.concurrent.TimeUnit;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.j;
import brd.w;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.h;
import erd.r;
import ez0.o;
import ez0.y;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.f;

public final class i implements Runnable	// class@000b1c
{
    public final k b;

    public void i(k p0){
       this.b = p0;
    }
    public final void run(){
       b uob;
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, k.class, "10")) {
       }else if(!tb.w.Z2.U()){
          t ot = tb.M.m();
          if (!g.b()) {
             uob = ot.subscribe(new x(tb), e.b);
             tb.W = uob;
             tb.X7(uob);
          }else {
             uob = tb.w.b3.W().flatMap(g.b).timeout(g.g(), TimeUnit.MILLISECONDS, j.b).takeUntil(h.b).flatMap(new o(ot)).subscribe(new y(tb), f.b);
             tb.W = uob;
             tb.X7(uob);
          }
       }
       return;
    }
}
