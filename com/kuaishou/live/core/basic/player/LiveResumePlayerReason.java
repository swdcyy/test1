package com.kuaishou.live.core.basic.player.LiveResumePlayerReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveResumePlayerReason extends Enum	// class@0008c2
{
    public static final LiveResumePlayerReason[] $VALUES;
    public static final LiveResumePlayerReason FloatingWindowClosed;
    public static final LiveResumePlayerReason LiveNextActivityIsTranslucentAndResumed;
    public static final LiveResumePlayerReason LivePlayFragmentOnResumed;
    public static final LiveResumePlayerReason NoSlidePlayOnBind;
    public static final LiveResumePlayerReason SlidePlayPageShow;
    public static final LiveResumePlayerReason SlidePlayWillShow;

    static {
       LiveResumePlayerReason liveResumePl = new LiveResumePlayerReason("NoSlidePlayOnBind", 0);
       LiveResumePlayerReason.NoSlidePlayOnBind = liveResumePl;
       LiveResumePlayerReason liveResumePl1 = new LiveResumePlayerReason("LivePlayFragmentOnResumed", 1);
       LiveResumePlayerReason.LivePlayFragmentOnResumed = liveResumePl1;
       LiveResumePlayerReason liveResumePl2 = new LiveResumePlayerReason("SlidePlayWillShow", 2);
       LiveResumePlayerReason.SlidePlayWillShow = liveResumePl2;
       LiveResumePlayerReason liveResumePl3 = new LiveResumePlayerReason("SlidePlayPageShow", 3);
       LiveResumePlayerReason.SlidePlayPageShow = liveResumePl3;
       LiveResumePlayerReason liveResumePl4 = new LiveResumePlayerReason("FloatingWindowClosed", 4);
       LiveResumePlayerReason.FloatingWindowClosed = liveResumePl4;
       LiveResumePlayerReason liveResumePl5 = new LiveResumePlayerReason("LiveNextActivityIsTranslucentAndResumed", 5);
       LiveResumePlayerReason.LiveNextActivityIsTranslucentAndResumed = liveResumePl5;
       LiveResumePlayerReason[] liveResumePl6 = new LiveResumePlayerReason[]{liveResumePl,liveResumePl1,liveResumePl2,liveResumePl3,liveResumePl4,liveResumePl5};
       LiveResumePlayerReason.$VALUES = liveResumePl6;
    }
    public void LiveResumePlayerReason(String p0,int p1){
       super(p0, p1);
    }
    public static LiveResumePlayerReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveResumePlayerReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveResumePlayerReason.class, p0);
    }
    public static LiveResumePlayerReason[] values(){
       Object obj = PatchProxy.apply(null, null, LiveResumePlayerReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveResumePlayerReason.$VALUES.clone();
    }
}
