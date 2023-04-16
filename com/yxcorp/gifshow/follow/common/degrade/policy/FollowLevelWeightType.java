package com.yxcorp.gifshow.follow.common.degrade.policy.FollowLevelWeightType;
import java.lang.Enum;
import java.lang.String;
import com.yxcorp.gifshow.follow.common.degrade.policy.FollowLevelWeightType$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FollowLevelWeightType extends Enum	// class@00104b
{
    public static final FollowLevelWeightType[] $VALUES;
    public static final FollowLevelWeightType BATTERY;
    public static final FollowLevelWeightType BATTERY_TEMPERATURE;
    public static final FollowLevelWeightType$a Companion;
    public static final FollowLevelWeightType DEVICE_BENCHMARK;
    public static final FollowLevelWeightType TEMPERATURE;

    static {
       FollowLevelWeightType uFollowLevel1;
       FollowLevelWeightType[] uFollowLevel = new FollowLevelWeightType[]{uFollowLevel1,uFollowLevel1,uFollowLevel1,uFollowLevel1};
       uFollowLevel1 = new FollowLevelWeightType("BATTERY", 0);
       FollowLevelWeightType.BATTERY = uFollowLevel1;
       uFollowLevel1 = new FollowLevelWeightType("TEMPERATURE", 1);
       FollowLevelWeightType.TEMPERATURE = uFollowLevel1;
       uFollowLevel1 = new FollowLevelWeightType("DEVICE_BENCHMARK", 2);
       FollowLevelWeightType.DEVICE_BENCHMARK = uFollowLevel1;
       uFollowLevel1 = new FollowLevelWeightType("BATTERY_TEMPERATURE", 3);
       FollowLevelWeightType.BATTERY_TEMPERATURE = uFollowLevel1;
       FollowLevelWeightType.$VALUES = uFollowLevel;
       FollowLevelWeightType.Companion = new FollowLevelWeightType$a(null);
    }
    public void FollowLevelWeightType(String p0,int p1){
       super(p0, p1);
    }
    public static FollowLevelWeightType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FollowLevelWeightType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FollowLevelWeightType.class, p0);
    }
    public static FollowLevelWeightType[] values(){
       Object obj = PatchProxy.apply(null, null, FollowLevelWeightType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FollowLevelWeightType.$VALUES.clone();
    }
}
