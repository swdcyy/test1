package com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveVoicePartyKtvMusicDownloadHelper$Status extends Enum	// class@0017ea
{
    public static final LiveVoicePartyKtvMusicDownloadHelper$Status[] $VALUES;
    public static final LiveVoicePartyKtvMusicDownloadHelper$Status CANCELLED;
    public static final LiveVoicePartyKtvMusicDownloadHelper$Status DOWNLOADING;
    public static final LiveVoicePartyKtvMusicDownloadHelper$Status FAILED;
    public static final LiveVoicePartyKtvMusicDownloadHelper$Status SUCCESS;
    public static final LiveVoicePartyKtvMusicDownloadHelper$Status WAITING;

    static {
       LiveVoicePartyKtvMusicDownloadHelper$Status status = new LiveVoicePartyKtvMusicDownloadHelper$Status("WAITING", 0);
       LiveVoicePartyKtvMusicDownloadHelper$Status.WAITING = status;
       LiveVoicePartyKtvMusicDownloadHelper$Status status1 = new LiveVoicePartyKtvMusicDownloadHelper$Status("DOWNLOADING", 1);
       LiveVoicePartyKtvMusicDownloadHelper$Status.DOWNLOADING = status1;
       LiveVoicePartyKtvMusicDownloadHelper$Status status2 = new LiveVoicePartyKtvMusicDownloadHelper$Status("SUCCESS", 2);
       LiveVoicePartyKtvMusicDownloadHelper$Status.SUCCESS = status2;
       LiveVoicePartyKtvMusicDownloadHelper$Status status3 = new LiveVoicePartyKtvMusicDownloadHelper$Status("FAILED", 3);
       LiveVoicePartyKtvMusicDownloadHelper$Status.FAILED = status3;
       LiveVoicePartyKtvMusicDownloadHelper$Status status4 = new LiveVoicePartyKtvMusicDownloadHelper$Status("CANCELLED", 4);
       LiveVoicePartyKtvMusicDownloadHelper$Status.CANCELLED = status4;
       LiveVoicePartyKtvMusicDownloadHelper$Status[] statusArray = new LiveVoicePartyKtvMusicDownloadHelper$Status[]{status,status1,status2,status3,status4};
       LiveVoicePartyKtvMusicDownloadHelper$Status.$VALUES = statusArray;
    }
    public void LiveVoicePartyKtvMusicDownloadHelper$Status(String p0,int p1){
       super(p0, p1);
    }
    public static LiveVoicePartyKtvMusicDownloadHelper$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveVoicePartyKtvMusicDownloadHelper$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveVoicePartyKtvMusicDownloadHelper$Status.class, p0);
    }
    public static LiveVoicePartyKtvMusicDownloadHelper$Status[] values(){
       Object obj = PatchProxy.apply(null, null, LiveVoicePartyKtvMusicDownloadHelper$Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveVoicePartyKtvMusicDownloadHelper$Status.$VALUES.clone();
    }
}
