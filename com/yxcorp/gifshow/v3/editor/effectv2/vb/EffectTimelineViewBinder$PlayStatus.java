package com.yxcorp.gifshow.v3.editor.effectv2.vb.EffectTimelineViewBinder$PlayStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EffectTimelineViewBinder$PlayStatus extends Enum	// class@000f5a
{
    public static final EffectTimelineViewBinder$PlayStatus[] $VALUES;
    public static final EffectTimelineViewBinder$PlayStatus END;
    public static final EffectTimelineViewBinder$PlayStatus IDLE;
    public static final EffectTimelineViewBinder$PlayStatus PAUSE;
    public static final EffectTimelineViewBinder$PlayStatus PLAY;

    static {
       EffectTimelineViewBinder$PlayStatus playStatus;
       EffectTimelineViewBinder$PlayStatus[] playStatusAr = new EffectTimelineViewBinder$PlayStatus[]{playStatus,playStatus,playStatus,playStatus};
       playStatus = new EffectTimelineViewBinder$PlayStatus("IDLE", 0);
       EffectTimelineViewBinder$PlayStatus.IDLE = playStatus;
       playStatus = new EffectTimelineViewBinder$PlayStatus("PLAY", 1);
       EffectTimelineViewBinder$PlayStatus.PLAY = playStatus;
       playStatus = new EffectTimelineViewBinder$PlayStatus("END", 2);
       EffectTimelineViewBinder$PlayStatus.END = playStatus;
       playStatus = new EffectTimelineViewBinder$PlayStatus("PAUSE", 3);
       EffectTimelineViewBinder$PlayStatus.PAUSE = playStatus;
       EffectTimelineViewBinder$PlayStatus.$VALUES = playStatusAr;
    }
    public void EffectTimelineViewBinder$PlayStatus(String p0,int p1){
       super(p0, p1);
    }
    public static EffectTimelineViewBinder$PlayStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EffectTimelineViewBinder$PlayStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EffectTimelineViewBinder$PlayStatus.class, p0);
    }
    public static EffectTimelineViewBinder$PlayStatus[] values(){
       Object obj = PatchProxy.apply(null, null, EffectTimelineViewBinder$PlayStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EffectTimelineViewBinder$PlayStatus.$VALUES.clone();
    }
}
