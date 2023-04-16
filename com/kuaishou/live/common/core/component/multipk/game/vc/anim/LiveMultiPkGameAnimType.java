package com.kuaishou.live.common.core.component.multipk.game.vc.anim.LiveMultiPkGameAnimType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiPkGameAnimType extends Enum	// class@0015ed
{
    public static final LiveMultiPkGameAnimType[] $VALUES;
    public static final LiveMultiPkGameAnimType NORMAL;
    public static final LiveMultiPkGameAnimType WITH_BOTTOM_AREA;

    static {
       LiveMultiPkGameAnimType liveMultiPkG1;
       LiveMultiPkGameAnimType[] liveMultiPkG = new LiveMultiPkGameAnimType[]{liveMultiPkG1,liveMultiPkG1};
       liveMultiPkG1 = new LiveMultiPkGameAnimType("NORMAL", 0);
       LiveMultiPkGameAnimType.NORMAL = liveMultiPkG1;
       liveMultiPkG1 = new LiveMultiPkGameAnimType("WITH_BOTTOM_AREA", 1);
       LiveMultiPkGameAnimType.WITH_BOTTOM_AREA = liveMultiPkG1;
       LiveMultiPkGameAnimType.$VALUES = liveMultiPkG;
    }
    public void LiveMultiPkGameAnimType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMultiPkGameAnimType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiPkGameAnimType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMultiPkGameAnimType.class, p0);
    }
    public static LiveMultiPkGameAnimType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMultiPkGameAnimType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiPkGameAnimType.$VALUES.clone();
    }
}
