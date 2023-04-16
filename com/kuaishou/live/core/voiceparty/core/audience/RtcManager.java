package com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import hp2.j;
import ee1.a;
import msd.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ap2.g;
import zo2.o0;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$e;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$f;
import com.kwai.statechart.StateChart$b;
import pp2.b;
import ut7.g;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$micStateChart$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$micStateChart$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import msd.l;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$buildAryaInnerState$1;
import com.kwai.statechart.b;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$EnterRoomEvent;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$g;
import ut7.o;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$ExitRoomEvent;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$h;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$PrepareAryaFail;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$i;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$EnterRoomTimeoutEvent;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$j;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$EnterRoomFailEvent;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$k;
import com.kwai.statechart.StateChart;
import com.kuaishou.live.core.voiceparty.a$a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$c;
import pp2.a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$a;
import ut7.e;
import q00.b;
import java.util.Objects;
import java.lang.IllegalStateException;
import java.lang.Integer;
import com.kuaishou.rtc.model.SnowRtcConstants$VoicePartyBusinessScene;

public final class RtcManager	// class@0013b3
{
    public final g a;
    public final o0 b;
    public final CopyOnWriteArrayList c;
    public boolean d;
    public String e;
    public Object f;
    public final i g;
    public final a h;
    public final b i;
    public final StateChart j;
    public final j k;
    public final a l;

    public void RtcManager(j p0,a p1,p p2){
       a.p(p0, "liveInfo");
       a.p(p1, "rtcManager");
       a.p(p2, "snowFactory");
       super();
       this.k = p0;
       this.l = p1;
       this.a = new g(p0, p1, p2);
       this.b = new o0();
       this.c = new CopyOnWriteArrayList();
       this.g = new RtcManager$e(this);
       a uoa = new a("IdleState");
       this.h = uoa;
       RtcManager$f uof = new RtcManager$f(this, "AryaState");
       this.i = uof;
       StateChart$b uob = new StateChart$b().c("MicState").d(new b(false)).b(new RtcManager$micStateChart$1(this)).e(uoa, RtcManager$micStateChart$2.INSTANCE).f(uoa);
       RtcManager$buildAryaInnerState$1 uobuildAryaI = PatchProxy.apply(null, this, RtcManager.class, "16");
       if (uobuildAryaI != PatchProxyResult.class) {
       }else {
          uobuildAryaI = new RtcManager$buildAryaInnerState$1(this);
       }
       RtcManager$f uof1 = uof;
       a uoa1 = uoa;
       StateChart stateChart = uob.g(uof, uobuildAryaI).h("init_arya", uoa, uof, RtcManager$EnterRoomEvent.class, RtcManager$g.a).h("leave_mic_seat", uof1, uoa1, RtcManager$ExitRoomEvent.class, new RtcManager$h(this)).h("fail", uof1, uoa1, RtcManager$PrepareAryaFail.class, RtcManager$i.a).h("timeout", uof1, uoa1, RtcManager$EnterRoomTimeoutEvent.class, RtcManager$j.a).h("aboard_fail", uof1, uoa1, RtcManager$EnterRoomFailEvent.class, RtcManager$k.a).a();
       this.j = stateChart;
       stateChart.s();
       return;
    }
    public final void a(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcManager.class, "3")) {
          return;
       }
       a.p(p0, "interceptor");
       this.c.add(p0);
       return;
    }
    public final void b(RtcManager$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcManager.class, "5")) {
          return;
       }
       a.p(p0, "observer");
       this.b.j0(p0);
       return;
    }
    public final void c(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RtcManager.class, "1")) {
          return;
       }
       a.p(p0, "aryaConfig");
       a.p(p1, "token");
       this.j.l(new RtcManager$EnterRoomEvent(new RtcManager$a(p0, p1)));
       return;
    }
    public final String d(){
       Object obj = PatchProxy.apply(null, this, RtcManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.a().invoke();
    }
    public final b e(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       RtcManager obj = PatchProxy.apply(objArray, this, RtcManager.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       g og = PatchProxy.apply(objArray, obj, g.class, "1");
       if (og != patchProxyRe) {
       }else {
          og = obj.c;
          if (og == null) {
             throw new IllegalStateException("wrong state,commonEngine is not init");
          }
       }
       return og;
    }
    public final a f(){
       return this.l;
    }
    public final boolean g(){
       return this.d;
    }
    public final void h(int p0,Object p1){
       RtcManager rtcManager = RtcManager.class;
       if (PatchProxy.isSupport(rtcManager) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, rtcManager, "2")) {
          return;
       }
       a.p(p1, "token");
       this.j.l(new RtcManager$ExitRoomEvent(p0, p1));
       return;
    }
    public final void i(RtcManager$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcManager.class, "6")) {
          return;
       }
       a.p(p0, "observer");
       this.b.l0(p0);
       return;
    }
    public final void j(SnowRtcConstants$VoicePartyBusinessScene p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RtcManager.class, "7")) {
          return;
       }
       String str = "scene";
       a.p(p0, str);
       RtcManager ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, g.class, "9")) {
          a.p(p0, str);
          ta.h.i1(p0);
       }
       return;
    }
}
