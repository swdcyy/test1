package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceTheaterPlayerController;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController;
import msd.a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import xw2.d;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import crd.a;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceTheaterPlayerController$c;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceTheaterPlayerController$theaterStatusObserver$1;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$c;
import msd.p;
import t45.d;
import brd.z;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceTheaterPlayerController$a;
import erd.g;
import crd.b;
import krd.a;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceTheaterPlayerController$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import q00.b;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.theater.player.sync.SyncConfig;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer;
import ht.c;
import java.lang.Number;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig$TheaterPlaySptsConfig;
import com.kuaishou.live.core.voiceparty.theater.player.sync.audience.ProgressSource;
import com.kuaishou.live.core.voiceparty.theater.player.sync.VoicePartyTheaterSyncCommand;

public abstract class AudienceTheaterPlayerController extends TheaterPlayerController	// class@0019e3
{
    public float k;
    public float l;
    public long m;
    public boolean n;
    public final a o;
    public final AudienceTheaterPlayerController$c p;
    public final p q;
    public final a r;
    public final RtcManager s;
    public final d t;

    public void AudienceTheaterPlayerController(a p0,RtcManager p1,d p2,t p3,t p4){
       z a;
       a.p(p0, "aryaSignFetcher");
       a.p(p1, "rtcManager");
       a.p(p2, "syncCommandDispatcher");
       a.p(p3, "offlineSignal");
       a.p(p4, "appBackgroundSignal");
       super();
       this.r = p0;
       this.s = p1;
       this.t = p2;
       this.k = 0x3f800000;
       this.l = 0.20f;
       p0 = new a();
       this.o = p0;
       AudienceTheaterPlayerController$c uoc = new AudienceTheaterPlayerController$c(this);
       this.p = uoc;
       AudienceTheaterPlayerController$theaterStatusObserver$1 otheaterStat = new AudienceTheaterPlayerController$theaterStatusObserver$1(this);
       this.q = otheaterStat;
       p1.b(uoc);
       p2.a(otheaterStat);
       a = d.a;
       b uob = p4.observeOn(a).subscribe(new AudienceTheaterPlayerController$a(this));
       a.o(uob, "appBackgroundSignal\n    ¡­ode\(it\)\n        }\n      }");
       a.b(p0, uob);
       b uob1 = p3.observeOn(a).subscribe(new AudienceTheaterPlayerController$b(this));
       a.o(uob1, "offlineSignal\n      .obs¡­esume\(\)\n        }\n      }");
       a.b(p0, uob1);
    }
    public void A(float p0){
       AudienceTheaterPlayerController uAudienceThe = AudienceTheaterPlayerController.class;
       if (PatchProxy.isSupport(uAudienceThe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uAudienceThe, "5")) {
          return;
       }
       if (p0 - (float)0 < 0) {
          return;
       }
       b.c0(LiveVoicePartyLogTag.THEATER, "PlayerController guestSetVoiceVolume", "v", Float.valueOf(p0));
       if (this.s.g()) {
          this.s.e().L(p0);
          this.k = p0;
       }
       return;
    }
    public void B(long p0){
       AudienceTheaterPlayerController uAudienceThe = AudienceTheaterPlayerController.class;
       if (PatchProxy.isSupport(uAudienceThe) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAudienceThe, "1")) {
          return;
       }
       super.B(p0);
       b uob = (this.s.g())? this.s.e(): null;
       this.C(uob, false);
       return;
    }
    public void C(b p0,boolean p1){
       long l;
       LiveVoicePartyTheaterCommonConfig$TheaterPlaySptsConfig mPlayLiveAud;
       AudienceTheaterPlayerController uAudienceThe = AudienceTheaterPlayerController.class;
       if (PatchProxy.isSupport(uAudienceThe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uAudienceThe, "4")) {
          return;
       }
       if (p0 != null) {
          b.Z(LiveVoicePartyLogTag.THEATER, "refreshPCMPlayStatus, player coexists with snow, mute player and play pcm using snow");
          this.x(this.l().p(this.r.invoke()));
          c uoc = this.i();
          if (uoc != null) {
             uoc.c(this.l);
          }
          p0.L(this.k);
          p0 = PatchProxy.apply(null, null, SyncConfig.class, "6");
          l = (p0 != PatchProxyResult.class)? p0.longValue(): SyncConfig.f.b().mPlayLiveGuestSptsMillis;
          this.F(l);
       }else {
          b.Z(LiveVoicePartyLogTag.THEATER, "refreshPCMPlayStatus, play pcm using player");
          this.x(null);
          this.l().l();
          this.l().q();
          this.l().c(this.l);
          p0 = PatchProxy.apply(null, null, SyncConfig.class, "7");
          l = (p0 != PatchProxyResult.class)? p0.longValue(): SyncConfig.f.b().mPlayLiveAudienceSptsMillis;
          this.F(l);
       }
       this.E(this.n);
       return;
    }
    public void D(ProgressSource p0,VoicePartyTheaterSyncCommand p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AudienceTheaterPlayerController.class, "3")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "command");
       if (p1.f != null) {
          this.y(p1.h);
       }
       if (p1.e != null) {
          this.A(p1.g);
       }
       return;
    }
    public final void E(boolean p0){
       AudienceTheaterPlayerController uAudienceThe = AudienceTheaterPlayerController.class;
       if (PatchProxy.isSupport(uAudienceThe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAudienceThe, "8")) {
          return;
       }
       this.n = p0;
       this.l().j(p0);
       return;
    }
    public final void F(long p0){
       AudienceTheaterPlayerController uAudienceThe = AudienceTheaterPlayerController.class;
       if (PatchProxy.isSupport(uAudienceThe) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAudienceThe, "7")) {
          return;
       }
       if (this.l().i() && p0 - this.m) {
          this.m = p0;
          this.l().k(p0);
       }
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, AudienceTheaterPlayerController.class, "2")) {
          return;
       }
       super.q();
       this.s.i(this.p);
       this.t.c(this.q);
       this.o.dispose();
       return;
    }
    public void y(float p0){
       AudienceTheaterPlayerController uAudienceThe = AudienceTheaterPlayerController.class;
       if (PatchProxy.isSupport(uAudienceThe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uAudienceThe, "6")) {
          return;
       }
       if (p0 - (float)0 < 0) {
          return;
       }
       b.c0(LiveVoicePartyLogTag.THEATER, "PlayerController guestOrAudienceSetMovieVolume", "v", Float.valueOf(p0));
       c uoc = this.i();
       if (uoc != null) {
          this.l = p0;
          uoc.c(p0);
          return;
       }else if(p0 - 0x3f000000 <= 0){
          p0 = p0 * 2.00f;
       }
       this.l = p0;
       this.l().c(p0);
       return;
    }
}
