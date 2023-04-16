package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceVodTheaterPlayerController$a;
import com.kuaishou.live.core.voiceparty.theater.player.sync.audience.ClientProgressSync$a;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceVodTheaterPlayerController;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.theater.player.sync.SyncConfig;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceVodTheaterPlayerController$PauseReason;
import com.kuaishou.live.core.voiceparty.theater.player.sync.audience.ClientProgressSync;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig;
import java.lang.Long;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer$Event;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController;
import java.lang.StringBuilder;
import java.lang.Boolean;

public final class AudienceVodTheaterPlayerController$a implements ClientProgressSync$a	// class@0019e5
{
    public final String a;
    public AudienceVodTheaterPlayerController$PauseReason b;
    public final ClientProgressSync c;
    public final AudienceVodTheaterPlayerController d;

    public void AudienceVodTheaterPlayerController$a(AudienceVodTheaterPlayerController p0){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SyncConfig syncConfig = SyncConfig.class;
       this.d = p0;
       super();
       this.a = "PlayerSyncHandler";
       this.b = AudienceVodTheaterPlayerController$PauseReason.NO_PAUSE;
       Object[] objArray = null;
       SyncConfig obj = PatchProxy.apply(objArray, objArray, syncConfig, "3");
       if (obj != patchProxyRe) {
          l = obj.longValue();
       }else {
          obj = SyncConfig.f;
          l = (obj.a().mPlayAlignTolerantMillis - (long)1000 > 0)? obj.a().mPlayAlignTolerantMillis: SyncConfig.c;
       }
       long l1 = l;
       long a = SyncConfig.a;
       long b = SyncConfig.b;
       Object obj1 = PatchProxy.apply(objArray, objArray, syncConfig, "4");
       long l2 = (obj1 != patchProxyRe)? obj1.longValue(): SyncConfig.f.a().mPlayAlignAdjustDuration;
       ClientProgressSync uClientProgr = new ClientProgressSync(this, l1, a, b, l2);
       this.c = AudienceVodTheaterPlayerController$PauseReason.NO_PAUSE;
       return;
    }
    public final void a(long p0){
       AudienceVodTheaterPlayerController$a uoa = AudienceVodTheaterPlayerController$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "5")) {
          return;
       }
       this.d.l().seekTo(p0);
       this.b = AudienceVodTheaterPlayerController$PauseReason.NO_PAUSE;
       this.d.l().resume();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, AudienceVodTheaterPlayerController$a.class, "7")) {
          return;
       }
       b.P(LiveVoicePartyLogTag.THEATER.appendTag(this.a), "play audience progress too fast, pause and wait anchor");
       this.b = AudienceVodTheaterPlayerController$PauseReason.PAUSE_BY_PROGRESS_TOO_FAST;
       this.d.l().pause();
       this.d.e(TheaterPlayer$Event.BEGIN_BUFFER);
       return;
    }
    public void c(long p0){
       AudienceVodTheaterPlayerController$a uoa = AudienceVodTheaterPlayerController$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "9")) {
          return;
       }
       b.P(LiveVoicePartyLogTag.THEATER.appendTag(this.a), "play resume play \(cur: paused because of client too fast\), anchor="+p0);
       this.b = AudienceVodTheaterPlayerController$PauseReason.NO_PAUSE;
       this.d.l().resume();
       this.d.e(TheaterPlayer$Event.END_BUFFER);
       return;
    }
    public boolean isPaused(){
       Object obj = PatchProxy.apply(null, this, AudienceVodTheaterPlayerController$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.d.l().g() && this.b == AudienceVodTheaterPlayerController$PauseReason.PAUSE_BY_PROGRESS_TOO_FAST)? true: false;
       return b;
    }
    public boolean isPlaying(){
       Object obj = PatchProxy.apply(null, this, AudienceVodTheaterPlayerController$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.d.l().i();
    }
    public void seekTo(long p0){
       AudienceVodTheaterPlayerController$a uoa = AudienceVodTheaterPlayerController$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "8")) {
          return;
       }
       b.P(LiveVoicePartyLogTag.THEATER.appendTag(this.a), "play audience progress too slow, catch up£¨seek to anchor pos£©, diff="+(this.d.l().getCurrentPosition() - p0));
       this.a(p0);
       return;
    }
}
