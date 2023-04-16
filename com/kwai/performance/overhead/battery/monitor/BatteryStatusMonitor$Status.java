package com.kwai.performance.overhead.battery.monitor.BatteryStatusMonitor$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class BatteryStatusMonitor$Status extends Enum	// class@00112a
{
    public static final BatteryStatusMonitor$Status[] $VALUES;
    public static final BatteryStatusMonitor$Status CHARGING;
    public static final BatteryStatusMonitor$Status DISCHARGING;
    public static final BatteryStatusMonitor$Status FULL;
    public static final BatteryStatusMonitor$Status NOT_CHARGING;
    public static final BatteryStatusMonitor$Status UNKNOWN;

    static {
       BatteryStatusMonitor$Status status;
       BatteryStatusMonitor$Status[] statusArray = new BatteryStatusMonitor$Status[]{status,status,status,status,status};
       status = new BatteryStatusMonitor$Status("CHARGING", 0);
       BatteryStatusMonitor$Status.CHARGING = status;
       status = new BatteryStatusMonitor$Status("FULL", 1);
       BatteryStatusMonitor$Status.FULL = status;
       status = new BatteryStatusMonitor$Status("DISCHARGING", 2);
       BatteryStatusMonitor$Status.DISCHARGING = status;
       status = new BatteryStatusMonitor$Status("NOT_CHARGING", 3);
       BatteryStatusMonitor$Status.NOT_CHARGING = status;
       status = new BatteryStatusMonitor$Status("UNKNOWN", 4);
       BatteryStatusMonitor$Status.UNKNOWN = status;
       BatteryStatusMonitor$Status.$VALUES = statusArray;
    }
    public void BatteryStatusMonitor$Status(String p0,int p1){
       super(p0, p1);
    }
    public static BatteryStatusMonitor$Status valueOf(String p0){
       return Enum.valueOf(BatteryStatusMonitor$Status.class, p0);
    }
    public static BatteryStatusMonitor$Status[] values(){
       return BatteryStatusMonitor$Status.$VALUES.clone();
    }
}
