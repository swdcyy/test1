package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceVodTheaterPlayerController;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceTheaterPlayerController;
import yw2.k;
import com.kuaishou.live.core.voiceparty.theater.player.a;
import msd.a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import xw2.d;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceVodTheaterPlayerController$a;
import zw2.d;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer;
import com.kuaishou.live.core.voiceparty.theater.player.sync.audience.ProgressSource;
import com.kuaishou.live.core.voiceparty.theater.player.sync.VoicePartyTheaterSyncCommand;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bx2.b;
import java.lang.Enum;
import java.util.Objects;
import java.lang.Long;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceVodTheaterPlayerController$PauseReason;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.theater.player.sync.audience.ClientProgressSync;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.theater.player.sync.audience.ClientProgressSync$AdjustAction;
import java.lang.Math;
import com.kuaishou.live.core.voiceparty.theater.player.sync.audience.ClientProgressSync$a;
import xw2.a;
import java.lang.StringBuilder;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceVodTheaterPlayerController$createPlayer$$inlined$also$lambda$1;
import msd.l;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceVodTheaterPlayerController$createPlayer$$inlined$also$lambda$2;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceVodTheaterPlayerController$createPlayer$$inlined$also$lambda$3;
import msd.p;

public final class AudienceVodTheaterPlayerController extends AudienceTheaterPlayerController	// class@0019e9
{
    public final a A;
    public final AudienceVodTheaterPlayerController$a u;
    public final d v;
    public TheaterPlayer w;
    public final boolean x;
    public final k y;
    public final a z;

    public void AudienceVodTheaterPlayerController(k p0,a p1,a p2,RtcManager p3,d p4,t p5,t p6){
       a.p(p0, "playerViewOwner");
       a.p(p1, "playSource");
       a.p(p2, "aryaSignFetcher");
       a.p(p3, "rtcManager");
       a.p(p4, "syncCommandDispatcher");
       a.p(p5, "offlineSignal");
       a.p(p6, "appBackgroundSignal");
       super(p2, p3, p4, p5, p6);
       this.y = p0;
       this.z = p1;
       this.A = p2;
       this.u = new AudienceVodTheaterPlayerController$a(this);
       this.v = new d();
       this.w = this.G(p1, p2);
    }
    public void D(ProgressSource p0,VoicePartyTheaterSyncCommand p1){
       AudienceVodTheaterPlayerController u;
       ClientProgressSync uClientProgr1;
       PatchProxyResult patchProxyRe1;
       boolean b;
       int b1;
       long l;
       AudienceVodTheaterPlayerController$a uoa1;
       ClientProgressSync$AdjustAction uAdjustActio;
       ClientProgressSync uClientProgr2;
       ClientProgressSync$AdjustAction sEEK;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       AudienceVodTheaterPlayerController$a uoa = AudienceVodTheaterPlayerController$a.class;
       String str = "6";
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, AudienceVodTheaterPlayerController.class, str)) {
          return;
       }
       String str1 = "source";
       a.p(obj1, str1);
       a.p(obj2, "command");
       super.D(p0, p1);
       VoicePartyTheaterSyncCommand c = obj2.c;
       if (c != null) {
          int i = b.a[c.ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i == 3) {
                   u = obj.u;
                   VoicePartyTheaterSyncCommand d = obj2.d;
                   Objects.requireNonNull(u);
                   String str2 = "3";
                   if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(obj1, Long.valueOf(d), u, uoa, str2)) {
                      a.p(obj1, str1);
                      if (u.d.l().g() && u.b == AudienceVodTheaterPlayerController$PauseReason.PAUSE_BY_ANCHOR) {
                         b.P(LiveVoicePartyLogTag.THEATER.appendTag(u.a), "play resume play \(cur: paused by anchor\)");
                         u.b = AudienceVodTheaterPlayerController$PauseReason.NO_PAUSE;
                         u.d.l().resume();
                      }else {
                         AudienceVodTheaterPlayerController$a c1 = u.c;
                         long currentPosit = u.d.l().getCurrentPosition();
                         Objects.requireNonNull(c1);
                         PatchProxyResult patchProxyRe = PatchProxyResult.class;
                         ClientProgressSync uClientProgr = ClientProgressSync.class;
                         if (PatchProxy.isSupport(uClientProgr)) {
                            uClientProgr1 = uClientProgr;
                            patchProxyRe1 = patchProxyRe;
                            if (!PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(currentPosit), Long.valueOf(d), c1, ClientProgressSync.class, "1")) {
                            }
                         }else {
                            uClientProgr1 = uClientProgr;
                            patchProxyRe1 = patchProxyRe;
                         }
                      }
                   }
                }
             }else {
                u = obj.u;
                VoicePartyTheaterSyncCommand obj3 = obj2.d;
                Objects.requireNonNull(u);
                if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Long.valueOf(obj3), u, uoa, "4")) {
                   b.P(LiveVoicePartyLogTag.THEATER.appendTag(u.a), "seek, anchor seek progress, pos = "+obj3);
                   u.a(obj3);
                }
             }
          }else {
             u = obj.u;
             VoicePartyTheaterSyncCommand d1 = obj2.d;
             Objects.requireNonNull(u);
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Long.valueOf(d1), u, uoa, str)) {
                b.P(LiveVoicePartyLogTag.THEATER.appendTag(u.a), "pause, anchor paused play. pos = "+d1);
                u.d.l().seekTo(d1);
                u.b = AudienceVodTheaterPlayerController$PauseReason.PAUSE_BY_ANCHOR;
                u.d.l().pause();
             }
          }
       }
       return;
    }
    public final TheaterPlayer G(a p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AudienceVodTheaterPlayerController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       TheaterPlayer theaterPlaye = this.v.a(p0, p1);
       theaterPlaye.h(this.y);
       theaterPlaye.m(new AudienceVodTheaterPlayerController$createPlayer$$inlined$also$lambda$1(this));
       theaterPlaye.n(new AudienceVodTheaterPlayerController$createPlayer$$inlined$also$lambda$2(this));
       theaterPlaye.f(new AudienceVodTheaterPlayerController$createPlayer$$inlined$also$lambda$3(this));
       return theaterPlaye;
    }
    public TheaterPlayer l(){
       return this.w;
    }
    public boolean n(){
       return this.x;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, AudienceVodTheaterPlayerController.class, "5")) {
          return;
       }
       super.q();
       this.y.hide();
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, AudienceVodTheaterPlayerController.class, "4")) {
          return;
       }
       this.v.b(this.l());
       return;
    }
    public void u(){
       AudienceVodTheaterPlayerController uAudienceVod = AudienceVodTheaterPlayerController.class;
       if (PatchProxy.applyVoid(null, this, uAudienceVod, "3")) {
          return;
       }
       long currentPosit = this.l().getCurrentPosition();
       this.r();
       TheaterPlayer theaterPlaye = this.G(this.z, this.A);
       if (!PatchProxy.applyVoidOneRefs(theaterPlaye, this, uAudienceVod, "1")) {
          a.p(theaterPlaye, "<set-?>");
          this.w = theaterPlaye;
       }
       this.B(currentPosit);
       return;
    }
}
