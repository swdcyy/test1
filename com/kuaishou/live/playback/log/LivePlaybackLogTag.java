package com.kuaishou.live.playback.log.LivePlaybackLogTag;
import pp.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LivePlaybackLogTag extends Enum implements c	// class@000d29
{
    public String mName;
    public static final LivePlaybackLogTag[] $VALUES;
    public static final LivePlaybackLogTag ANIMATION;
    public static final LivePlaybackLogTag MESSAGE;

    static {
       LivePlaybackLogTag livePlayback = new LivePlaybackLogTag("ANIMATION", 0, "PlaybackAnimation");
       LivePlaybackLogTag.ANIMATION = livePlayback;
       LivePlaybackLogTag livePlayback1 = new LivePlaybackLogTag("MESSAGE", 1, "PlaybackMessage");
       LivePlaybackLogTag.MESSAGE = livePlayback1;
       LivePlaybackLogTag[] livePlayback2 = new LivePlaybackLogTag[]{livePlayback,livePlayback1};
       LivePlaybackLogTag.$VALUES = livePlayback2;
    }
    public void LivePlaybackLogTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static LivePlaybackLogTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlaybackLogTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePlaybackLogTag.class, p0);
    }
    public static LivePlaybackLogTag[] values(){
       Object obj = PatchProxy.apply(null, null, LivePlaybackLogTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePlaybackLogTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
