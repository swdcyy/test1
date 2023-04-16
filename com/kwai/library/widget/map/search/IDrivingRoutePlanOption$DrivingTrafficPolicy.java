package com.kwai.library.widget.map.search.IDrivingRoutePlanOption$DrivingTrafficPolicy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class IDrivingRoutePlanOption$DrivingTrafficPolicy extends Enum	// class@000967
{
    public static final IDrivingRoutePlanOption$DrivingTrafficPolicy[] $VALUES;
    public static final IDrivingRoutePlanOption$DrivingTrafficPolicy ROUTE_PATH;
    public static final IDrivingRoutePlanOption$DrivingTrafficPolicy ROUTE_PATH_AND_TRAFFIC;

    static {
       IDrivingRoutePlanOption$DrivingTrafficPolicy uDrivingTraf = new IDrivingRoutePlanOption$DrivingTrafficPolicy("ROUTE_PATH", 0);
       IDrivingRoutePlanOption$DrivingTrafficPolicy.ROUTE_PATH = uDrivingTraf;
       IDrivingRoutePlanOption$DrivingTrafficPolicy uDrivingTraf1 = new IDrivingRoutePlanOption$DrivingTrafficPolicy("ROUTE_PATH_AND_TRAFFIC", 1);
       IDrivingRoutePlanOption$DrivingTrafficPolicy.ROUTE_PATH_AND_TRAFFIC = uDrivingTraf1;
       IDrivingRoutePlanOption$DrivingTrafficPolicy[] uDrivingTraf2 = new IDrivingRoutePlanOption$DrivingTrafficPolicy[]{uDrivingTraf,uDrivingTraf1};
       IDrivingRoutePlanOption$DrivingTrafficPolicy.$VALUES = uDrivingTraf2;
    }
    public void IDrivingRoutePlanOption$DrivingTrafficPolicy(String p0,int p1){
       super(p0, p1);
    }
    public static IDrivingRoutePlanOption$DrivingTrafficPolicy valueOf(String p0){
       return Enum.valueOf(IDrivingRoutePlanOption$DrivingTrafficPolicy.class, p0);
    }
    public static IDrivingRoutePlanOption$DrivingTrafficPolicy[] values(){
       return IDrivingRoutePlanOption$DrivingTrafficPolicy.$VALUES.clone();
    }
}
