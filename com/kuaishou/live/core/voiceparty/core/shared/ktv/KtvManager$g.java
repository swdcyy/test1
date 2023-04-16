package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$g;
import ut7.d;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.statechart.b;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$d;
import jp2.u;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$c;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$b;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$h;
import java.lang.System;
import crd.b;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$e$a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$e$c;
import hp2.c;
import hp2.c$a;
import kp2.a;
import java.lang.Integer;
import k2b.e0;
import qu2.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import co2.q1;
import co2.f2;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import yx2.n;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import k2b.u1;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$PlayNextOrder;
import java.lang.Boolean;
import jp2.c;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import brd.t;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.a;
import erd.o;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.b;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.c;
import erd.g;

public class KtvManager$g extends d	// class@001430
{
    public b f;
    public final KtvManager g;

    public void KtvManager$g(KtvManager p0){
       this.g = p0;
       super("KtvSing");
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KtvManager$g.class, "1")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          p1.g = this.g.f().q();
          this.h().h(p0);
          this.a().p(this.h());
          this.a().n().h(System.currentTimeMillis());
          this.a().n().g(p0);
       }
       return;
    }
    public void f(h p0){
       int i;
       String str = "3";
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvManager$g.class, str)) {
          return;
       }
       a.p(p0, "reason");
       KtvManager$g tf = this.f;
       if (tf != null) {
          tf.dispose();
          this.f = null;
       }
       this.a().n().i(System.currentTimeMillis());
       KtvManager q = this.g.q;
       KtvManager$a r = KtvManager.r;
       Objects.requireNonNull(r);
       a obj = PatchProxy.applyOneRefs(p0, r, KtvManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else if(p0 instanceof KtvManager$e$a){
          i = p0.d;
       }else if(a.g(p0, KtvManager$e$c.d)){
          i = 2;
       }else if(p0 instanceof c){
          i = (a.g(p0, c$a.d))? 6: 5;
       }else {
          i = 0;
       }
       Objects.requireNonNull(q);
       obj = a.class;
       if (!PatchProxy.isSupport(obj) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), q, obj, str)) {
          e0 uoe0 = q.b.c();
          obj = q.a;
          ClientContent$LiveStreamPackage liveStreamPa = q.b.a();
          if (!PatchProxy.isSupport(q1.class) || !PatchProxy.applyVoidFourRefs(uoe0, obj, Integer.valueOf(i), liveStreamPa, null, q1.class, "87")) {
             ClientContentWrapper$LiveVoicePartyPackage liveVoicePar = n.g(obj);
             liveVoicePar.leaveKtvStageReason = i;
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
             uContentWrap.liveVoicePartyPackage = liveVoicePar;
             h$b uob = h$b.d(10, 0x77fd);
             ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
             resultPackag.timeCost = liveVoicePar.leaveKtvStageTimestamp - liveVoicePar.enterKtvStageTimestamp;
             uob.h(uContentPack);
             uob.i(uContentWrap);
             uob.q(resultPackag);
             u1.p0("", uoe0, uob);
          }
       }
       this.a().n().h(0);
       this.a().n().i(0);
       this.a().n().j(0);
       this.a().p(null);
       return;
    }
    public final boolean j(KtvManager$PlayNextOrder p0){
       KtvManager$g og = KtvManager$g.class;
       KtvMusicOrderInfo obj = PatchProxy.applyOneRefs(p0, this, og, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       obj = this.a().A();
       a.m(obj);
       c uoc = this.a().k();
       p0 = p0.a;
       if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidThreeRefs(obj, uoc, Integer.valueOf(p0), this, KtvManager$g.class, "4")) {
          og = this.f;
          if (og != null) {
             og.dispose();
          }
          this.f = LiveVoicePartyApi.b().S(uoc.b(), uoc.d(), uoc.a(), obj.musicOrderId).map(a.b).subscribe(new b(this, obj, p0), new c(this, p0, obj));
       }
       return true;
    }
}
