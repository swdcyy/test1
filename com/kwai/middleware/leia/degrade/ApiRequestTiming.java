package com.kwai.middleware.leia.degrade.ApiRequestTiming;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ApiRequestTiming extends Enum	// class@000d6f
{
    public static final ApiRequestTiming[] $VALUES;
    public static final ApiRequestTiming AFTER_ABTEST;
    public static final ApiRequestTiming AFTER_STARTUP;
    public static final ApiRequestTiming BUSY_TIME;
    public static final ApiRequestTiming BUSY_TIME_NON_DEFAULT;
    public static final ApiRequestTiming COLD_START;
    public static final ApiRequestTiming DEFAULT;
    public static final ApiRequestTiming LOGIN;
    public static final ApiRequestTiming LOGOUT;
    public static final ApiRequestTiming NETWORK_CHANGED;
    public static final ApiRequestTiming ON_BACKGROUND;
    public static final ApiRequestTiming ON_FOREGROUND;
    public static final ApiRequestTiming ON_HOME_PAGE_CREATED;

    static {
       ApiRequestTiming uApiRequestT = new ApiRequestTiming("DEFAULT", 0);
       ApiRequestTiming.DEFAULT = uApiRequestT;
       ApiRequestTiming uApiRequestT1 = new ApiRequestTiming("COLD_START", 1);
       ApiRequestTiming.COLD_START = uApiRequestT1;
       ApiRequestTiming uApiRequestT2 = new ApiRequestTiming("ON_HOME_PAGE_CREATED", 2);
       ApiRequestTiming.ON_HOME_PAGE_CREATED = uApiRequestT2;
       ApiRequestTiming uApiRequestT3 = new ApiRequestTiming("ON_FOREGROUND", 3);
       ApiRequestTiming.ON_FOREGROUND = uApiRequestT3;
       ApiRequestTiming uApiRequestT4 = new ApiRequestTiming("ON_BACKGROUND", 4);
       ApiRequestTiming.ON_BACKGROUND = uApiRequestT4;
       ApiRequestTiming uApiRequestT5 = new ApiRequestTiming("LOGIN", 5);
       ApiRequestTiming.LOGIN = uApiRequestT5;
       ApiRequestTiming uApiRequestT6 = new ApiRequestTiming("LOGOUT", 6);
       ApiRequestTiming.LOGOUT = uApiRequestT6;
       ApiRequestTiming uApiRequestT7 = new ApiRequestTiming("AFTER_STARTUP", 7);
       ApiRequestTiming.AFTER_STARTUP = uApiRequestT7;
       ApiRequestTiming uApiRequestT8 = new ApiRequestTiming("AFTER_ABTEST", 8);
       ApiRequestTiming.AFTER_ABTEST = uApiRequestT8;
       ApiRequestTiming uApiRequestT9 = new ApiRequestTiming("NETWORK_CHANGED", 9);
       ApiRequestTiming.NETWORK_CHANGED = uApiRequestT9;
       ApiRequestTiming uApiRequestT10 = new ApiRequestTiming("BUSY_TIME", 10);
       ApiRequestTiming.BUSY_TIME = uApiRequestT10;
       ApiRequestTiming uApiRequestT11 = new ApiRequestTiming("BUSY_TIME_NON_DEFAULT", 11);
       ApiRequestTiming.BUSY_TIME_NON_DEFAULT = uApiRequestT11;
       ApiRequestTiming[] uApiRequestT12 = new ApiRequestTiming[12];
       uApiRequestT12[0] = uApiRequestT;
       uApiRequestT12[1] = uApiRequestT1;
       uApiRequestT12[2] = uApiRequestT2;
       uApiRequestT12[3] = uApiRequestT3;
       uApiRequestT12[4] = uApiRequestT4;
       uApiRequestT12[5] = uApiRequestT5;
       uApiRequestT12[6] = uApiRequestT6;
       uApiRequestT12[7] = uApiRequestT7;
       uApiRequestT12[8] = uApiRequestT8;
       uApiRequestT12[9] = uApiRequestT9;
       uApiRequestT12[10] = uApiRequestT10;
       uApiRequestT12[11] = uApiRequestT11;
       ApiRequestTiming.$VALUES = uApiRequestT12;
    }
    public void ApiRequestTiming(String p0,int p1){
       super(p0, p1);
    }
    public static ApiRequestTiming valueOf(String p0){
       return Enum.valueOf(ApiRequestTiming.class, p0);
    }
    public static ApiRequestTiming[] values(){
       return ApiRequestTiming.$VALUES.clone();
    }
}
