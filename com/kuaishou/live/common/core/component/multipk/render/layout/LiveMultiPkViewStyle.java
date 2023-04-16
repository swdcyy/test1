package com.kuaishou.live.common.core.component.multipk.render.layout.LiveMultiPkViewStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiPkViewStyle extends Enum	// class@001672
{
    public static final LiveMultiPkViewStyle[] $VALUES;
    public static final LiveMultiPkViewStyle NORMAL;
    public static final LiveMultiPkViewStyle SIMPLE;

    static {
       LiveMultiPkViewStyle liveMultiPkV1;
       LiveMultiPkViewStyle[] liveMultiPkV = new LiveMultiPkViewStyle[]{liveMultiPkV1,liveMultiPkV1};
       liveMultiPkV1 = new LiveMultiPkViewStyle("NORMAL", 0);
       LiveMultiPkViewStyle.NORMAL = liveMultiPkV1;
       liveMultiPkV1 = new LiveMultiPkViewStyle("SIMPLE", 1);
       LiveMultiPkViewStyle.SIMPLE = liveMultiPkV1;
       LiveMultiPkViewStyle.$VALUES = liveMultiPkV;
    }
    public void LiveMultiPkViewStyle(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMultiPkViewStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiPkViewStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMultiPkViewStyle.class, p0);
    }
    public static LiveMultiPkViewStyle[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMultiPkViewStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiPkViewStyle.$VALUES.clone();
    }
}
