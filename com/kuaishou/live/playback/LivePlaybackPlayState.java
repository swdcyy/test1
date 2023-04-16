package com.kuaishou.live.playback.LivePlaybackPlayState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePlaybackPlayState extends Enum	// class@000d1e
{
    public static final LivePlaybackPlayState[] $VALUES;
    public static final LivePlaybackPlayState PAUSE;
    public static final LivePlaybackPlayState PLAYING;

    static {
       LivePlaybackPlayState livePlayback = new LivePlaybackPlayState("PLAYING", 0);
       LivePlaybackPlayState.PLAYING = livePlayback;
       LivePlaybackPlayState livePlayback1 = new LivePlaybackPlayState("PAUSE", 1);
       LivePlaybackPlayState.PAUSE = livePlayback1;
       LivePlaybackPlayState[] livePlayback2 = new LivePlaybackPlayState[]{livePlayback,livePlayback1};
       LivePlaybackPlayState.$VALUES = livePlayback2;
    }
    public void LivePlaybackPlayState(String p0,int p1){
       super(p0, p1);
    }
    public static LivePlaybackPlayState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlaybackPlayState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePlaybackPlayState.class, p0);
    }
    public static LivePlaybackPlayState[] values(){
       Object obj = PatchProxy.apply(null, null, LivePlaybackPlayState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePlaybackPlayState.$VALUES.clone();
    }
}
