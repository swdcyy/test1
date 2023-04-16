package com.kuaishou.live.common.core.basic.resource.controlfiles.LiveControlFilePolicy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveControlFilePolicy extends Enum	// class@000ec2
{
    public static final LiveControlFilePolicy[] $VALUES;
    public static final LiveControlFilePolicy MULTI_BIZ_MERGE;
    public static final LiveControlFilePolicy SINGLE_BIZ_SPLIT;

    static {
       LiveControlFilePolicy liveControlF1;
       LiveControlFilePolicy[] liveControlF = new LiveControlFilePolicy[]{liveControlF1,liveControlF1};
       liveControlF1 = new LiveControlFilePolicy("MULTI_BIZ_MERGE", 0);
       LiveControlFilePolicy.MULTI_BIZ_MERGE = liveControlF1;
       liveControlF1 = new LiveControlFilePolicy("SINGLE_BIZ_SPLIT", 1);
       LiveControlFilePolicy.SINGLE_BIZ_SPLIT = liveControlF1;
       LiveControlFilePolicy.$VALUES = liveControlF;
    }
    public void LiveControlFilePolicy(String p0,int p1){
       super(p0, p1);
    }
    public static LiveControlFilePolicy valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveControlFilePolicy.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveControlFilePolicy.class, p0);
    }
    public static LiveControlFilePolicy[] values(){
       Object obj = PatchProxy.apply(null, null, LiveControlFilePolicy.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveControlFilePolicy.$VALUES.clone();
    }
}
