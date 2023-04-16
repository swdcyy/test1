package com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.i$a;
import mk1.d0;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.i;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.e;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.f;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.g;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Boolean;
import crd.b;
import lnc.b9;
import o02.f;
import o02.e;
import p91.m;
import brd.t;
import cjd.e;
import erd.o;
import gz0.f;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.h;
import erd.g;

public class i$a implements d0	// class@000b0a
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void a(String p0,int p1){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       boolean b = k0.c(this.a.c.c.mEntity, e.a, f.a, g.a).or(Boolean.FALSE).booleanValue();
       i$a ta = this.a;
       if (ta.n != null) {
          p1 = (!p1 || p1 == 1)? 1: 0;
          if (p1 & (b ^ 1)) {
             b9.a(ta.o);
             p1.o = e.a().i0(this.a.c.Z2.getLiveStreamId(), p0).map(new e()).subscribe(new f(this), h.b);
          }
       }
       return;
    }
}
