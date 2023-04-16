package com.kuaishou.live.common.core.component.multiline.log.LiveMultiLineLogType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiLineLogType extends Enum	// class@0014e8
{
    public static final LiveMultiLineLogType[] $VALUES;
    public static final LiveMultiLineLogType CLICK;
    public static final LiveMultiLineLogType SHOW;

    static {
       LiveMultiLineLogType liveMultiLin1;
       LiveMultiLineLogType[] liveMultiLin = new LiveMultiLineLogType[]{liveMultiLin1,liveMultiLin1};
       liveMultiLin1 = new LiveMultiLineLogType("SHOW", 0);
       LiveMultiLineLogType.SHOW = liveMultiLin1;
       liveMultiLin1 = new LiveMultiLineLogType("CLICK", 1);
       LiveMultiLineLogType.CLICK = liveMultiLin1;
       LiveMultiLineLogType.$VALUES = liveMultiLin;
    }
    public void LiveMultiLineLogType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMultiLineLogType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiLineLogType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMultiLineLogType.class, p0);
    }
    public static LiveMultiLineLogType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMultiLineLogType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiLineLogType.$VALUES.clone();
    }
}
