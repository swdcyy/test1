package com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import msd.a;
import java.lang.String;
import hp2.n;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import op2.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import qrd.l1;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$g;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$i;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$h;
import op2.j;
import pp2.a;
import com.kwai.statechart.StateChart$b;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$buildStateChart$$inlined$apply$lambda$1;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$buildStateChart$1$2;
import com.kwai.statechart.a;
import pp2.b;
import ut7.g;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$PlayEvent;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$d;
import ut7.o;
import ut7.c;
import java.util.Set;
import trd.d1;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$NoOrderEvent;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$e;
import trd.c1;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$PrepareFailed;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$f;
import java.lang.Long;
import op2.e;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$PauseEvent;
import ut7.e;
import op2.a;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$b;
import op2.b;
import hp2.c;
import ut7.h;
import com.kwai.statechart.StateChart;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$ResumeEvent;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$SeekEvent;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import java.lang.Float;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$VolumeEvent;
import nsd.u;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$QualityEvent;

public abstract class TheaterManager	// class@001475
{
    public StateChart a;
    public final k b;
    public final TheaterManager$a c;
    public final c d;
    public final c e;
    public final c f;

    public void TheaterManager(a p0,String p1,n p2){
       a.p(p0, "liveStreamIdFetcher");
       a.p(p1, "voicePartyId");
       a.p(p2, "param");
       super();
       this.b = new k();
       TheaterManager$a uoa = PatchProxy.apply(null, this, TheaterManager.class, "15");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new TheaterManager$a();
       }
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoidOneRefs(p0, uoa, TheaterManager$a.class, "2")) {
          a.p(p0, "<set-?>");
          uoa.a = p0;
       }
       if (!PatchProxy.applyVoidOneRefs(p1, uoa, TheaterManager$a.class, "6")) {
          a.p(p1, "<set-?>");
          uoa.c = p1;
       }
       if (!PatchProxy.applyVoidOneRefs(p2, uoa, TheaterManager$a.class, "4")) {
          a.p(p2, "<set-?>");
          uoa.b = p2;
       }
       this.c = uoa;
       this.d = new TheaterManager$g(this, "Theater.Idle");
       this.e = new TheaterManager$i(this, "Theater.Prepare");
       this.f = new TheaterManager$h(this, "Theater.Play");
       return;
    }
    public final void a(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterManager.class, "5")) {
          return;
       }
       a.p(p0, "observer");
       this.f().j0(p0);
       return;
    }
    public StateChart$b b(){
       StateChart$b obj = PatchProxy.apply(null, this, TheaterManager.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StateChart$b();
       obj.b(new TheaterManager$buildStateChart$$inlined$apply$lambda$1(this));
       obj.e(this.d, TheaterManager$buildStateChart$1$2.INSTANCE);
       obj.d(new b(false));
       obj.f(this.d);
       obj.f(this.e);
       obj.f(this.f);
       obj.h("play_theater", this.e, this.f, TheaterManager$PlayEvent.class, TheaterManager$d.a);
       c[] uocArray = new c[]{this.e,this.f};
       obj.i("no_order", d1.u(uocArray), this.d, TheaterManager$NoOrderEvent.class, TheaterManager$e.a);
       obj.i("prepare_failed", c1.f(this.e), this.d, TheaterManager$PrepareFailed.class, TheaterManager$f.a);
       return obj;
    }
    public final void c(long p0,long p1){
       TheaterManager theaterManag = TheaterManager.class;
       if (PatchProxy.isSupport(theaterManag) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, theaterManag, "14")) {
          return;
       }
       this.d().i(p0);
       this.d().f(p1);
       this.f().onProgress(p0, p1);
       return;
    }
    public TheaterManager$a d(){
       return this.c;
    }
    public final e e(){
       Object obj = PatchProxy.apply(null, this, TheaterManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d();
    }
    public k f(){
       return this.b;
    }
    public final c g(){
       return this.d;
    }
    public final c h(){
       return this.f;
    }
    public final c i(){
       return this.e;
    }
    public void j(int p0){
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, TheaterManager.class, "9")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.THEATER, "pause play. pos = "+this.d().c());
       this.r(new TheaterManager$PauseEvent());
       return;
    }
    public abstract void l(a p0);
    public abstract b m(TheaterManager$b p0);
    public void n(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterManager.class, "3")) {
          return;
       }
       a.p(p0, "reason");
       TheaterManager ta = this.a;
       if (ta == null) {
          a.S("stateChart");
       }
       ta.t(p0);
       return;
    }
    public final void o(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterManager.class, "6")) {
          return;
       }
       a.p(p0, "observer");
       this.f().l0(p0);
       return;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, TheaterManager.class, "10")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.THEATER, "resume play. pos = "+this.d().c());
       this.r(new TheaterManager$ResumeEvent());
       return;
    }
    public final void q(long p0){
       TheaterManager theaterManag = TheaterManager.class;
       if (PatchProxy.isSupport(theaterManag) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, theaterManag, "11")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.THEATER, "seek, anchor seek progress, pos = "+p0);
       this.r(new TheaterManager$SeekEvent(p0));
       return;
    }
    public final void r(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterManager.class, "4")) {
          return;
       }
       a.p(p0, "event");
       TheaterManager ta = this.a;
       if (ta == null) {
          a.S("stateChart");
       }
       ta.l(p0);
       return;
    }
    public void s(TheaterDisplayMode p0){
       String str = "8";
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterManager.class, str)) {
          return;
       }
       a.p(p0, "displayMode");
       b.c0(LiveVoicePartyLogTag.THEATER, "setTheaterDisplayMode: ", "mode", p0);
       TheaterManager$a uoa = this.d();
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoidOneRefs(p0, uoa, TheaterManager$a.class, str)) {
          a.p(p0, "<set-?>");
          uoa.e = p0;
       }
       this.f().k(p0);
       return;
    }
    public final void t(float p0){
       TheaterManager theaterManag = TheaterManager.class;
       if (PatchProxy.isSupport(theaterManag) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, theaterManag, "13")) {
          return;
       }
       this.r(new TheaterManager$VolumeEvent(0, p0, 1, null));
       return;
    }
    public final void u(LiveQualityItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterManager.class, "7")) {
          return;
       }
       a.p(p0, "quality");
       this.r(new TheaterManager$QualityEvent(p0));
       return;
    }
    public final void v(float p0){
       TheaterManager theaterManag = TheaterManager.class;
       if (PatchProxy.isSupport(theaterManag) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, theaterManag, "12")) {
          return;
       }
       this.r(new TheaterManager$VolumeEvent(p0, 0, 2, null));
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, TheaterManager.class, "2")) {
          return;
       }
       StateChart stateChart = this.b().a();
       this.a = stateChart;
       if (stateChart == null) {
          a.S("stateChart");
       }
       stateChart.s();
       return;
    }
}
