package com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import hf3.a;
import msd.a;
import java.lang.String;
import zo2.e;
import brd.t;
import kp2.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import cp2.e;
import jp2.u;
import hp2.h;
import cp2.f;
import cp2.b;
import zo2.a0;
import jp2.p;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager$a;
import jp2.c;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$b;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager$c;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager$b;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager$d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jp2.a;
import cp2.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$g;
import jp2.d;
import jp2.s;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$c;
import java.lang.Boolean;
import hp2.c;
import crd.b;
import com.kuaishou.livestream.message.nano.SCKtvOpened;
import com.kuaishou.livestream.message.nano.SCKtvNextMusicOrderInfo;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager$e;
import com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager$f;
import erd.g;
import java.util.Objects;

public final class AudienceKtvManager extends KtvManager	// class@0013be
{
    public final t A;
    public b s;
    public final f t;
    public final d u;
    public final AudienceKtvManager$c v;
    public final AudienceKtvManager$b w;
    public final KtvManager$g x;
    public final RtcManager y;
    public final e z;

    public void AudienceKtvManager(RtcManager p0,a p1,a p2,String p3,String p4,String p5,e p6,t p7,a p8,a p9){
       int i = this;
       Object obj = p0;
       Object obj1 = p6;
       Object obj2 = p7;
       a.p(obj, "rtcManager");
       a.p(p1, "longConnection");
       Object obj3 = p2;
       a.p(obj3, "liveStreamIdFetcher");
       Object obj4 = p3;
       a.p(obj4, "voicePartyId");
       Object obj5 = p4;
       a.p(obj5, "anchorUserId");
       Object obj6 = p5;
       a.p(obj6, "myselfId");
       a.p(obj1, "param");
       a.p(obj2, "offlineSignal");
       a.p(p8, "livePlayerFactory");
       Object obj7 = p9;
       a.p(obj7, "logger");
       super(new e(obj), p1, obj3, obj4, obj5, obj6, p6, obj7);
       i.y = obj;
       i.z = obj1;
       i.A = obj2;
       i.t = super();
       b uob = new b(p0, p8.invoke(), this.f(), p1, new p(), this.t().k());
       i.u = super();
       i.v = new AudienceKtvManager$c(this);
       i.w = new AudienceKtvManager$b(this);
       i.x = new AudienceKtvManager$d(this);
    }
    public KtvManager$b c(){
       Object obj = PatchProxy.apply(null, this, AudienceKtvManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AudienceKtvManager$a();
    }
    public KtvManager$b d(){
       return this.t();
    }
    public a e(){
       return this.u();
    }
    public KtvManager$g g(){
       return this.x;
    }
    public d h(){
       return this.u;
    }
    public s i(){
       return this.v();
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, AudienceKtvManager.class, "7")) {
          return;
       }
       this.y.b(this.w);
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, AudienceKtvManager.class, "8")) {
          return;
       }
       this.y.i(this.w);
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, AudienceKtvManager.class, "9")) {
          return;
       }
       Boolean uBoolean = this.u().i();
       a.m(uBoolean);
       this.v().S1(uBoolean.booleanValue());
       return;
    }
    public void p(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceKtvManager.class, "5")) {
          return;
       }
       a.p(p0, "reason");
       AudienceKtvManager ts = this.s;
       if (ts == null) {
          a.S("offlineDispose");
       }
       ts.dispose();
       super.p(p0);
       this.y.i(this.v);
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, AudienceKtvManager.class, "4")) {
          return;
       }
       this.t().d = this.z.b.disableApplaud;
       super.s();
       SCKtvNextMusicOrderInfo sCKtvNextMus = this.z.b();
       if (sCKtvNextMus != null) {
          this.j(sCKtvNextMus);
       }
       b uob = this.A.subscribe(new AudienceKtvManager$e(this), AudienceKtvManager$f.b);
       a.o(uob, "offlineSignal.subscribe\(бн }\n      }, { throw it }\)");
       this.s = uob;
       this.y.b(this.v);
       return;
    }
    public AudienceKtvManager$a t(){
       KtvManager$b obj = PatchProxy.apply(null, this, AudienceKtvManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.d();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvManager.AudienceContext");
       return obj;
    }
    public a u(){
       a obj = PatchProxy.apply(null, this, AudienceKtvManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.e();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.live.core.voiceparty.core.audience.ktv.AudienceKtvData");
       return obj;
    }
    public f v(){
       return this.t;
    }
}
