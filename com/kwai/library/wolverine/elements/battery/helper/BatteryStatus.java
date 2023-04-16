package com.kwai.library.wolverine.elements.battery.helper.BatteryStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class BatteryStatus extends Enum	// class@000aaf
{
    public static final BatteryStatus[] $VALUES;
    public static final BatteryStatus CHARGING;
    public static final BatteryStatus DISCHARGING;
    public static final BatteryStatus FULL;
    public static final BatteryStatus NOT_CHARGING;
    public static final BatteryStatus UNKNOWN;

    static {
       BatteryStatus uBatteryStat1;
       BatteryStatus[] uBatteryStat = new BatteryStatus[]{uBatteryStat1,uBatteryStat1,uBatteryStat1,uBatteryStat1,uBatteryStat1};
       uBatteryStat1 = new BatteryStatus("CHARGING", 0);
       BatteryStatus.CHARGING = uBatteryStat1;
       uBatteryStat1 = new BatteryStatus("FULL", 1);
       BatteryStatus.FULL = uBatteryStat1;
       uBatteryStat1 = new BatteryStatus("DISCHARGING", 2);
       BatteryStatus.DISCHARGING = uBatteryStat1;
       uBatteryStat1 = new BatteryStatus("NOT_CHARGING", 3);
       BatteryStatus.NOT_CHARGING = uBatteryStat1;
       uBatteryStat1 = new BatteryStatus("UNKNOWN", 4);
       BatteryStatus.UNKNOWN = uBatteryStat1;
       BatteryStatus.$VALUES = uBatteryStat;
    }
    public void BatteryStatus(String p0,int p1){
       super(p0, p1);
    }
    public static BatteryStatus valueOf(String p0){
       return Enum.valueOf(BatteryStatus.class, p0);
    }
    public static BatteryStatus[] values(){
       return BatteryStatus.$VALUES.clone();
    }
}
