package com.yxcorp.gifshow.powermode.PowerModeHelper$KSDeviceThermalState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PowerModeHelper$KSDeviceThermalState extends Enum	// class@0012d5
{
    public final int mStateId;
    public static final PowerModeHelper$KSDeviceThermalState[] $VALUES;
    public static final PowerModeHelper$KSDeviceThermalState CRITICAL;
    public static final PowerModeHelper$KSDeviceThermalState EMERGENCY;
    public static final PowerModeHelper$KSDeviceThermalState FAIR;
    public static final PowerModeHelper$KSDeviceThermalState MODERATE;
    public static final PowerModeHelper$KSDeviceThermalState NOMINAL;
    public static final PowerModeHelper$KSDeviceThermalState SERIOUS;
    public static final PowerModeHelper$KSDeviceThermalState SHUTDOWN;

    static {
       PowerModeHelper$KSDeviceThermalState kSDeviceTher = new PowerModeHelper$KSDeviceThermalState("NOMINAL", 0, 0x2710);
       PowerModeHelper$KSDeviceThermalState.NOMINAL = kSDeviceTher;
       PowerModeHelper$KSDeviceThermalState kSDeviceTher1 = new PowerModeHelper$KSDeviceThermalState("FAIR", 1, 0x271a);
       PowerModeHelper$KSDeviceThermalState.FAIR = kSDeviceTher1;
       PowerModeHelper$KSDeviceThermalState kSDeviceTher2 = new PowerModeHelper$KSDeviceThermalState("MODERATE", 2, 0x2724);
       PowerModeHelper$KSDeviceThermalState.MODERATE = kSDeviceTher2;
       PowerModeHelper$KSDeviceThermalState kSDeviceTher3 = new PowerModeHelper$KSDeviceThermalState("SERIOUS", 3, 0x272e);
       PowerModeHelper$KSDeviceThermalState.SERIOUS = kSDeviceTher3;
       PowerModeHelper$KSDeviceThermalState kSDeviceTher4 = new PowerModeHelper$KSDeviceThermalState("CRITICAL", 4, 0x2738);
       PowerModeHelper$KSDeviceThermalState.CRITICAL = kSDeviceTher4;
       PowerModeHelper$KSDeviceThermalState kSDeviceTher5 = new PowerModeHelper$KSDeviceThermalState("EMERGENCY", 5, 0x2742);
       PowerModeHelper$KSDeviceThermalState.EMERGENCY = kSDeviceTher5;
       PowerModeHelper$KSDeviceThermalState kSDeviceTher6 = new PowerModeHelper$KSDeviceThermalState("SHUTDOWN", 6, 0x274c);
       PowerModeHelper$KSDeviceThermalState.SHUTDOWN = kSDeviceTher6;
       PowerModeHelper$KSDeviceThermalState[] kSDeviceTher7 = new PowerModeHelper$KSDeviceThermalState[]{kSDeviceTher,kSDeviceTher1,kSDeviceTher2,kSDeviceTher3,kSDeviceTher4,kSDeviceTher5,kSDeviceTher6};
       PowerModeHelper$KSDeviceThermalState.$VALUES = kSDeviceTher7;
    }
    public void PowerModeHelper$KSDeviceThermalState(String p0,int p1,int p2){
       super(p0, p1);
       this.mStateId = p2;
    }
    public static PowerModeHelper$KSDeviceThermalState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PowerModeHelper$KSDeviceThermalState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PowerModeHelper$KSDeviceThermalState.class, p0);
    }
    public static PowerModeHelper$KSDeviceThermalState[] values(){
       Object obj = PatchProxy.apply(null, null, PowerModeHelper$KSDeviceThermalState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PowerModeHelper$KSDeviceThermalState.$VALUES.clone();
    }
}
