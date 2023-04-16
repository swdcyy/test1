package com.kuaishou.live.audience.component.gift.gift.audience.v2.o;
import lp3.e;
import java.lang.Object;
import java.util.ArrayList;
import q01.h;
import com.kuaishou.live.common.core.component.gift.gift.righttopbanner.panel.ILiveDefaultSelectGiftIdInterceptor;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import qk1.a;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import mk1.f;
import mk1.b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Enum;
import java.lang.Integer;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;
import rs1.b;
import com.kwai.robust.PatchProxyResult;
import lp3.c;
import ic3.a;
import java.lang.Iterable;
import qk.m;
import ez0.h0;
import ok.o;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.n;
import java.util.Comparator;
import com.google.common.collect.ImmutableList;
import android.util.Pair;

public class o	// class@000b26
{
    public final List a;
    public final e b;

    public void o(e p0){
       super();
       this.a = new ArrayList();
       this.b = p0;
       this.a(new h());
    }
    public void a(ILiveDefaultSelectGiftIdInterceptor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       this.a.remove(p0);
       this.a.add(p0);
       return;
    }
    public void b(a p0,GiftTab p1,f p2,b p3){
       int b;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, o.class, "4")) {
          return;
       }
       LiveLogTag gIFT = LiveLogTag.GIFT;
       b.f0(gIFT, "[GiftOpt][setDefaultSelectGiftId]", "giftTab", p1.name(), "specifiedGiftId", Integer.valueOf(p0.c()), "lastSelectedGiftId", Integer.valueOf(p0.c()), "isSendToAnchor", Boolean.valueOf(p3.l()));
       if (p0.g()) {
          return;
       }
       b uob = b.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "5");
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.b.a(uob).Aa()){
          b = this.b.a(uob).Uh();
          int i1 = -1;
          if (b != i1 && p1 == GiftTab.NormalGift) {
             Object[] objArray = new Object[]{Integer.valueOf(b)};
             b.Z(gIFT, String.format("replace last selected gift id to %d, because in new cohesion pk", objArray));
             p0.m(b);
             p0.j(i1);
             b = true;
          }
       }
       b = false;
       if (b) {
          return;
       }else if(!this.a.isEmpty()){
          ImmutableList immutableLis = m.s(this.a).p(new h0(p1)).E(n.b);
          if (immutableLis.size() > 0) {
             Pair pair = immutableLis.get(i).b(p0, p1, p2, p3);
             p0.m(pair.first.intValue());
             p0.l(pair.second.intValue());
             b.Z(gIFT, "[GiftOpt][defaultGiftIdInterceptors]");
          }
       }
       b.e0(gIFT, "[GiftOpt][setDefaultSelectGiftId][afterInterceptors]", "giftTab", p1.name(), "specifiedGiftId", Integer.valueOf(p0.e()), "batchCount", Integer.valueOf(p0.d()));
       return;
    }
    public void c(ILiveDefaultSelectGiftIdInterceptor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       this.a.remove(p0);
       return;
    }
}
