package com.kwai.library.widget.map.search.IDrivingRoutePlanOption$DrivingPolicy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class IDrivingRoutePlanOption$DrivingPolicy extends Enum	// class@000966
{
    public static final IDrivingRoutePlanOption$DrivingPolicy[] $VALUES;
    public static final IDrivingRoutePlanOption$DrivingPolicy ECAR_AVOID_JAM;
    public static final IDrivingRoutePlanOption$DrivingPolicy ECAR_DIS_FIRST;
    public static final IDrivingRoutePlanOption$DrivingPolicy ECAR_FEE_FIRST;
    public static final IDrivingRoutePlanOption$DrivingPolicy ECAR_TIME_FIRST;

    static {
       IDrivingRoutePlanOption$DrivingPolicy uDrivingPoli = new IDrivingRoutePlanOption$DrivingPolicy("ECAR_TIME_FIRST", 0);
       IDrivingRoutePlanOption$DrivingPolicy.ECAR_TIME_FIRST = uDrivingPoli;
       IDrivingRoutePlanOption$DrivingPolicy uDrivingPoli1 = new IDrivingRoutePlanOption$DrivingPolicy("ECAR_DIS_FIRST", 1);
       IDrivingRoutePlanOption$DrivingPolicy.ECAR_DIS_FIRST = uDrivingPoli1;
       IDrivingRoutePlanOption$DrivingPolicy uDrivingPoli2 = new IDrivingRoutePlanOption$DrivingPolicy("ECAR_FEE_FIRST", 2);
       IDrivingRoutePlanOption$DrivingPolicy.ECAR_FEE_FIRST = uDrivingPoli2;
       IDrivingRoutePlanOption$DrivingPolicy uDrivingPoli3 = new IDrivingRoutePlanOption$DrivingPolicy("ECAR_AVOID_JAM", 3);
       IDrivingRoutePlanOption$DrivingPolicy.ECAR_AVOID_JAM = uDrivingPoli3;
       IDrivingRoutePlanOption$DrivingPolicy[] uDrivingPoli4 = new IDrivingRoutePlanOption$DrivingPolicy[]{uDrivingPoli,uDrivingPoli1,uDrivingPoli2,uDrivingPoli3};
       IDrivingRoutePlanOption$DrivingPolicy.$VALUES = uDrivingPoli4;
    }
    public void IDrivingRoutePlanOption$DrivingPolicy(String p0,int p1){
       super(p0, p1);
    }
    public static IDrivingRoutePlanOption$DrivingPolicy valueOf(String p0){
       return Enum.valueOf(IDrivingRoutePlanOption$DrivingPolicy.class, p0);
    }
    public static IDrivingRoutePlanOption$DrivingPolicy[] values(){
       return IDrivingRoutePlanOption$DrivingPolicy.$VALUES.clone();
    }
}
