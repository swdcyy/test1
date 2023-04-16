package com.kuaishou.live.basic.degrade.policy.LiveLevelWeightType;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.live.basic.degrade.policy.LiveLevelWeightType$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLevelWeightType extends Enum	// class@000cc0
{
    public static final LiveLevelWeightType[] $VALUES;
    public static final LiveLevelWeightType BATTERY;
    public static final LiveLevelWeightType$a Companion;
    public static final LiveLevelWeightType DEVICE_BENCHMARK;
    public static final LiveLevelWeightType TEMPERATURE;

    static {
       LiveLevelWeightType liveLevelWei1;
       LiveLevelWeightType[] liveLevelWei = new LiveLevelWeightType[]{liveLevelWei1,liveLevelWei1,liveLevelWei1};
       liveLevelWei1 = new LiveLevelWeightType("BATTERY", 0);
       LiveLevelWeightType.BATTERY = liveLevelWei1;
       liveLevelWei1 = new LiveLevelWeightType("TEMPERATURE", 1);
       LiveLevelWeightType.TEMPERATURE = liveLevelWei1;
       liveLevelWei1 = new LiveLevelWeightType("DEVICE_BENCHMARK", 2);
       LiveLevelWeightType.DEVICE_BENCHMARK = liveLevelWei1;
       LiveLevelWeightType.$VALUES = liveLevelWei;
       LiveLevelWeightType.Companion = new LiveLevelWeightType$a(null);
    }
    public void LiveLevelWeightType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveLevelWeightType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLevelWeightType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLevelWeightType.class, p0);
    }
    public static LiveLevelWeightType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLevelWeightType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLevelWeightType.$VALUES.clone();
    }
}
