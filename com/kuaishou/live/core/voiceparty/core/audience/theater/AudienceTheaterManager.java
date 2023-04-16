package com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager$a;
import nsd.u;
import qu2.a;
import co2.f2;
import zo2.g;
import hf3.a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController;
import zw2.c;
import brd.t;
import q12.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager$1;
import msd.a;
import hp2.n;
import gp2.m;
import wa1.h;
import com.kwai.statechart.StateChart$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ut7.c;
import java.util.Set;
import trd.d1;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager$NextOrderEvent;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager$b;
import com.kwai.statechart.a;
import ut7.o;
import java.lang.Integer;
import java.util.Objects;
import op2.g;
import op2.e;
import op2.c;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;
import k2b.e0;
import yx2.n$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import yx2.n;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterLogger$logAudienceTheaterSeriesPushTaskEvent$1;
import msd.l;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyTheaterPackage;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDataKt;
import op2.f;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$SeriesPackage;
import op2.a;
import gp2.b;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager$play$1;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudiencePlayLogic$setStateChangeListener$1;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager$play$2;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudiencePlayLogic$setProgressListener$1;
import msd.p;
import t45.d;
import brd.z;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager$c;
import erd.g;
import crd.b;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$b;
import op2.b;
import gp2.l;
import gp2.k;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager$prepare$prepareLogic$1;
import gp2.s;
import xw2.d;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$a;
import com.kuaishou.livestream.message.nano.TheaterEpisodeOrderInfo;
import op2.f$a;
import com.kuaishou.livestream.message.nano.TheaterEpisodeInfo;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager$prepare$1;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager$prepare$2;
import com.kuaishou.live.core.voiceparty.theater.player.a;
import java.lang.Boolean;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import wkd.b;
import kka.h;
import java.lang.Long;
import java.util.concurrent.TimeUnit;
import gp2.f;
import erd.o;
import gp2.g;
import gp2.h;
import cjd.e;
import gp2.i;
import gp2.j;
import gp2.a;
import gp2.c;
import brd.w;
import erd.c;
import brd.a0;
import gp2.d;
import gp2.e;
import hp2.c;
import com.kuaishou.live.core.voiceparty.theater.player.sync.audience.TheaterSyncCommandDispatcherManager;
import java.lang.Number;
import hp2.c$a;
import hp2.c$b;
import hp2.c$d;
import hp2.c$c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import java.lang.System;
import java.lang.StringBuilder;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterLogger$logTheaterPlayTaskEvent$1;
import kotlin.NoWhenBranchMatchedException;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager$createSyncCommandDispatcher$$inlined$also$lambda$1;
import qrd.l1;
import gp2.o;
import com.kuaishou.livestream.message.nano.SCTheaterNextEpisodeOrderInfo;
import lf3.g;
import gp2.p;
import com.kuaishou.livestream.message.nano.SCTheaterEpisodeOrderFinished;
import java.util.List;
import com.kuaishou.live.core.voiceparty.core.audience.LongConnectionUnregisterException;
import ut7.e;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.CharSequence;
import e17.i;

public final class AudienceTheaterManager extends TheaterManager	// class@0013d3
{
    public final m g;
    public final h h;
    public boolean i;
    public String j;
    public TheaterSyncCommandDispatcherManager k;
    public final g l;
    public final RtcManager m;
    public final VoicePartyPlayerController n;
    public final c o;
    public final t p;
    public final c q;
    public static final AudienceTheaterManager$a r;

    static {
       AudienceTheaterManager.r = new AudienceTheaterManager$a(null);
    }
    public void AudienceTheaterManager(a p0,f2 p1,g p2,a p3,RtcManager p4,VoicePartyPlayerController p5,c p6,t p7,c p8){
       a.p(p0, "liveBaseContext");
       a.p(p1, "voicePartyContext");
       a.p(p2, "param");
       a.p(p3, "longConnection");
       a.p(p4, "rtcManager");
       a.p(p5, "livePlayerController");
       a.p(p6, "playerControllerFactory");
       a.p(p7, "offlineSignal");
       String str = p1.y();
       a.o(str, "voicePartyContext.voicePartyId");
       super(new AudienceTheaterManager$1(p0), str, p2);
       this.l = p2;
       this.m = p4;
       this.n = p5;
       this.o = p6;
       this.p = p7;
       this.q = p8;
       this.g = new m(p0, p1, this);
       this.h = new h(p3);
       this.j = "";
    }
    public StateChart$b b(){
       StateChart$b obj = PatchProxy.apply(null, this, AudienceTheaterManager.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.b();
       c[] uocArray = new c[]{this.g(),this.i(),this.h()};
       obj.i("prepare_theater", d1.u(uocArray), this.i(), AudienceTheaterManager$NextOrderEvent.class, new AudienceTheaterManager$b(this));
       return obj;
    }
    public void j(int p0){
       AudienceTheaterManager uAudienceThe = AudienceTheaterManager.class;
       if (PatchProxy.isSupport(uAudienceThe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAudienceThe, "12")) {
          return;
       }
       uAudienceThe = this.g;
       Objects.requireNonNull(uAudienceThe);
       m om = m.class;
       if (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uAudienceThe, om, "2")) {
          e uoe = uAudienceThe.f().e();
          uAudienceThe.h(uAudienceThe.e());
          b.a0(LiveVoicePartyLogTag.THEATER, "theater log VOICE_PARTY_THEATER_SERIES_PLAY", c.j("seriesLogInfo", uAudienceThe.e().toString()));
          e0 uoe0 = uAudienceThe.i.c();
          n$a uoa = new n$a();
          uoa.f(uAudienceThe.i.a());
          uoa.g(n.g(uAudienceThe.j));
          uoa.k(TheaterDataKt.c(uoe, new AudienceTheaterLogger$logAudienceTheaterSeriesPushTaskEvent$1(uAudienceThe, p0)));
          f uof = uoe.a();
          ClientContentWrapper$SeriesPackage seriesPackag = (uof != null)? TheaterDataKt.b(uof): null;
          uoa.j(seriesPackag);
          n.A(uoe0, 7, "VOICE_PARTY_THEATER_SERIES_PLAY", uoa);
       }
       return;
    }
    public void l(a p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceTheaterManager.class, "11")) {
          return;
       }
       a.p(p0, "playLogic");
       AudienceTheaterManager$play$1 oplay$1 = new AudienceTheaterManager$play$1(this, p0);
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoidOneRefs(oplay$1, p0, uob, "8")) {
          a.p(oplay$1, "stateChangeListener");
          p0.b.c(new AudiencePlayLogic$setStateChangeListener$1(oplay$1));
       }
       AudienceTheaterManager$play$2 oplay$2 = new AudienceTheaterManager$play$2(this);
       if (!PatchProxy.applyVoidOneRefs(oplay$2, p0, uob, "9")) {
          a.p(oplay$2, "listener");
          p0.b.b(new AudiencePlayLogic$setProgressListener$1(oplay$2));
       }
       p0.a.observeOn(d.a).subscribe(new AudienceTheaterManager$c(this, p0));
       if (!PatchProxy.applyVoid(null, p0, uob, "3")) {
          p0.b.B(p0.c);
       }
       return;
    }
    public b m(TheaterManager$b p0){
       l a;
       boolean b;
       t ot1;
       t ot2;
       String str;
       boolean b1;
       TheaterEpisodeOrderInfo obj3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AudienceTheaterManager obj = PatchProxy.applyOneRefs(p0, this, AudienceTheaterManager.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "param");
       a = p0.a;
       obj = this.k;
       if (obj == null) {
          a.S("statusDispatcher");
       }
       k ok = new k(obj, new AudienceTheaterManager$prepare$prepareLogic$1(this, a));
       TheaterManager$a uoa = this.d();
       f$a d = f.d;
       TheaterEpisodeOrderInfo theaterEpiso = a.a();
       a.m(theaterEpiso);
       Objects.requireNonNull(d);
       f uof = PatchProxy.applyOneRefs(theaterEpiso, d, f$a.class, "1");
       z oz = null;
       if (uof != patchProxyRe) {
       }else {
          a.p(theaterEpiso, "proto");
          obj3 = theaterEpiso.episodeOrderId;
          a.o(obj3, "proto.episodeOrderId");
          theaterEpiso = theaterEpiso.episodeInfo;
          a.o(theaterEpiso, "proto.episodeInfo");
          uof = new f(obj3, theaterEpiso, oz);
       }
       uoa.g(uof);
       LiveVoicePartyLogTag tHEATER = LiveVoicePartyLogTag.THEATER;
       b.c0(tHEATER, "start prepare", "orderInfo", a);
       AudienceTheaterManager$prepare$1 oprepare$1 = new AudienceTheaterManager$prepare$1(this);
       AudienceTheaterManager$prepare$2 oprepare$2 = new AudienceTheaterManager$prepare$2(this);
       if (!PatchProxy.applyVoidThreeRefs(a, oprepare$1, oprepare$2, ok, k.class, "1")) {
          a.p(a, "nextOrderInfo");
          a.p(oprepare$1, "onSuccess");
          a.p(oprepare$2, "onFail");
          t ot = PatchProxy.applyOneRefs(a, ok, k.class, "3");
          Object[] objArray = null;
          if (ot != patchProxyRe) {
          }else {
             TheaterEpisodeOrderInfo theaterEpiso1 = a.a();
             a.m(theaterEpiso1);
             s a1 = a.a;
             if (!a1.b()) {
                if (!a1.a()) {
                   c obj2 = PatchProxy.apply(objArray, ok, k.class, "4");
                   if (obj2 != patchProxyRe) {
                      b1 = obj2.booleanValue();
                   }else {
                      obj2 = a.a();
                      a.o(obj2, "AppEnv.get\(\)");
                      if (p0.A(obj2.a())) {
                         obj3 = b.a(-1592356291);
                         a.o(obj3, "Singleton.get\(FreeTrafficHelper::class.java\)");
                         if (obj3.a()) {
                            b1 = true;
                         }
                      }
                      b1 = false;
                   }
                   if (b1) {
                   label_00f8 :
                      oz = 1;
                   }
                }
             }else {
                goto label_00f8 ;
             }
             if (oz) {
                b.c0(tHEATER, "fetchFreeTrafficUrls", "request freeTraffic with delay ms", Long.valueOf(a.b()));
                ot = t.timer(a.b(), TimeUnit.MILLISECONDS, d.b).flatMap(new f(a, theaterEpiso1)).doOnEach(g.b).doOnError(h.b).map(new e()).map(new i(theaterEpiso1)).onErrorReturn(new j(a1));
                a.o(ot, "Observable.timer\(nextOrd…rrorReturn { playSource }");
             }else {
                b.c0(tHEATER, "fetchFreeTrafficUrls no free traffic", "isAlreadyFreeFlow", Boolean.valueOf(a1.a()));
                ot = t.just(a1);
                a.o(ot, "Observable.just\(playSource\)");
             }
          }
          theaterEpiso = PatchProxy.apply(objArray, a, s.class, "6");
          if (theaterEpiso != patchProxyRe) {
          }else {
             theaterEpiso = a.a();
             if (theaterEpiso != null) {
                theaterEpiso = theaterEpiso.episodeOrderId;
                if (theaterEpiso == null) {
                }
             }else {
             }
          }
          Object obj1 = PatchProxy.apply(objArray, a, s.class, "7");
          b = (obj1 != patchProxyRe)? obj1.booleanValue(): a.a.b();
          if (PatchProxy.isSupport(k.class)) {
             ot1 = PatchProxy.applyTwoRefs(theaterEpiso, Boolean.valueOf(b), ok, k.class, "5");
             if (ot1 != patchProxyRe) {
             label_01c9 :
                ok.b = t.zip(ot, ot1, c.a).firstOrError().G(d.a).p(new d(oprepare$2)).Q(new e(ok, oprepare$2, oprepare$1, a));
             }
          }
          if (b) {
             ot2 = t.just(Long.valueOf(-1));
             a.o(ot2, "Observable.just\(-1L\)");
          }else {
             a uoa1 = new a(theaterEpiso, 0x3a98);
             ok.a = uoa1;
             ok.c.a(uoa1);
             uoa1 = uoa1.e;
          }
          ot1 = ot2;
          goto label_01c9 ;
       }
       return ok;
    }
    public void n(c p0){
       int i;
       Object obj = this;
       Object obj1 = p0;
       AudienceTheaterManager uAudienceThe = AudienceTheaterManager.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, uAudienceThe, "4")) {
          return;
       }
       a.p(obj1, "reason");
       AudienceTheaterManager k = obj.k;
       if (k == null) {
          a.S("statusDispatcher");
       }
       k.g();
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, obj, uAudienceThe, "7")) {
          obj.h.b();
       }
       AudienceTheaterManager g = obj.g;
       f obj2 = PatchProxy.applyOneRefs(obj1, obj, uAudienceThe, "5");
       if (obj2 != PatchProxyResult.class) {
          i = obj2.intValue();
       }else if(a.g(obj1, c$a.d)){
          i = 4;
       }else if(a.g(obj1, c$b.d)){
          i = 3;
       }else if(a.g(obj1, c$d.d)){
          i = 2;
       }else if(a.g(obj1, c$c.d)){
          i = 1;
       }else {
          throw new NoWhenBranchMatchedException();
       }
       Objects.requireNonNull(g);
       m om = m.class;
       if (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), g, om, "1")) {
          ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
          resultPackag.timeCost = System.currentTimeMillis() - g.j.j();
          b.Z(LiveVoicePartyLogTag.AUDIENCE, "VOICE_PARTY_THEATER_PLAY"+" timeCost: "+resultPackag.timeCost);
          b.a0(LiveVoicePartyLogTag.THEATER, "theater log VOICE_PARTY_THEATER_PLAY", c.m("enterTimestamp", String.valueOf(g.b()), "reason", String.valueOf(i), "landscapeDurationMs", String.valueOf(g.d()), "fullscreenDuration", String.valueOf(g.c())));
          e0 uoe0 = g.i.c();
          n$a uoa = new n$a();
          uoa.f(g.i.a());
          uoa.h(n.h(g.j));
          uoa.k(TheaterDataKt.c(g.f().e(), new AudienceTheaterLogger$logTheaterPlayTaskEvent$1(g, i)));
          obj2 = g.f().e().a();
          if (obj2 != null) {
             objArray = TheaterDataKt.b(obj2);
          }
          uoa.j(objArray);
          uoa.i(resultPackag);
          n.A(uoe0, 7, "VOICE_PARTY_THEATER_PLAY", uoa);
       }
       super.n(p0);
       obj.i = true;
       return;
    }
    public void w(){
       AudienceTheaterManager uAudienceThe = AudienceTheaterManager.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAudienceThe, "3")) {
          return;
       }
       super.w();
       TheaterSyncCommandDispatcherManager theaterSyncC = PatchProxy.apply(objArray, this, uAudienceThe, "8");
       if (theaterSyncC != PatchProxyResult.class) {
       }else {
          theaterSyncC = new TheaterSyncCommandDispatcherManager(this, this.m, this.n, this.q);
          theaterSyncC.a(new AudienceTheaterManager$createSyncCommandDispatcher$$inlined$also$lambda$1(this));
       }
       theaterSyncC.d();
       this.k = theaterSyncC;
       if (!PatchProxy.applyVoid(objArray, this, uAudienceThe, "6")) {
          uAudienceThe = this.h;
          uAudienceThe.a(632, SCTheaterNextEpisodeOrderInfo.class, new o(this));
          uAudienceThe.a(633, SCTheaterEpisodeOrderFinished.class, new p(this));
       }
       g c = this.l.c;
       if (c != null) {
          this.x(c);
       }
       return;
    }
    public final void x(SCTheaterNextEpisodeOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceTheaterManager.class, "9")) {
          return;
       }
       LiveVoicePartyLogTag tHEATER = LiveVoicePartyLogTag.THEATER;
       String str = "AudienceTheaterManager";
       tHEATER.appendTag(str);
       LiveVoicePartyLogTag liveVoicePar = tHEATER;
       String str1 = "onReceiveTheaterNextEpisodeOrderInfo";
       String str2 = "msg";
       try{
          b.S(liveVoicePar, str1, str2, p0);
          b.c0(tHEATER, "prepareForPlayNextEpisode", "orderId", p0.episodeOrderInfo.episodeOrderId);
          AudienceTheaterManager$NextOrderEvent nextOrderEve = new AudienceTheaterManager$NextOrderEvent(new s(p0));
          if (this.i != null) {
             ExceptionHandler.handleCaughtException(new LongConnectionUnregisterException(nextOrderEve));
          }else {
             this.r(nextOrderEve);
          }
       }catch(java.lang.IllegalArgumentException e6){
          b.y(LiveVoicePartyLogTag.THEATER.appendTag(str), "onReceiveTheaterNextEpisodeOrderInfo, invalid play source", e6);
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          if (uoc.c()) {
             i.d(R.style.arg_RES_7f110668, "Debug: 放映厅nextOrder信息无效!!!"+e6);
          }
       }
       return;
    }
}
