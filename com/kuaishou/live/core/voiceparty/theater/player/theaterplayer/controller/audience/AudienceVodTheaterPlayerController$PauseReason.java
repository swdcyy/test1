package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceVodTheaterPlayerController$PauseReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AudienceVodTheaterPlayerController$PauseReason extends Enum	// class@0019e4
{
    public static final AudienceVodTheaterPlayerController$PauseReason[] $VALUES;
    public static final AudienceVodTheaterPlayerController$PauseReason NO_PAUSE;
    public static final AudienceVodTheaterPlayerController$PauseReason PAUSE_BY_ANCHOR;
    public static final AudienceVodTheaterPlayerController$PauseReason PAUSE_BY_PROGRESS_TOO_FAST;

    static {
       AudienceVodTheaterPlayerController$PauseReason pauseReason;
       AudienceVodTheaterPlayerController$PauseReason[] pauseReasonA = new AudienceVodTheaterPlayerController$PauseReason[]{pauseReason,pauseReason,pauseReason};
       pauseReason = new AudienceVodTheaterPlayerController$PauseReason("PAUSE_BY_ANCHOR", 0);
       AudienceVodTheaterPlayerController$PauseReason.PAUSE_BY_ANCHOR = pauseReason;
       pauseReason = new AudienceVodTheaterPlayerController$PauseReason("PAUSE_BY_PROGRESS_TOO_FAST", 1);
       AudienceVodTheaterPlayerController$PauseReason.PAUSE_BY_PROGRESS_TOO_FAST = pauseReason;
       pauseReason = new AudienceVodTheaterPlayerController$PauseReason("NO_PAUSE", 2);
       AudienceVodTheaterPlayerController$PauseReason.NO_PAUSE = pauseReason;
       AudienceVodTheaterPlayerController$PauseReason.$VALUES = pauseReasonA;
    }
    public void AudienceVodTheaterPlayerController$PauseReason(String p0,int p1){
       super(p0, p1);
    }
    public static AudienceVodTheaterPlayerController$PauseReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AudienceVodTheaterPlayerController$PauseReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AudienceVodTheaterPlayerController$PauseReason.class, p0);
    }
    public static AudienceVodTheaterPlayerController$PauseReason[] values(){
       Object obj = PatchProxy.apply(null, null, AudienceVodTheaterPlayerController$PauseReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AudienceVodTheaterPlayerController$PauseReason.$VALUES.clone();
    }
}
