package com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class RequestTiming extends Enum	// class@000847
{
    public static final RequestTiming[] $VALUES;
    public static final RequestTiming AFTER_ABTEST;
    public static final RequestTiming AFTER_STARTUP;
    public static final RequestTiming BUSY_TIME;
    public static final RequestTiming BUSY_TIME_NON_DEFAULT;
    public static final RequestTiming COLD_START;
    public static final RequestTiming DEFAULT;
    public static final RequestTiming LOGIN;
    public static final RequestTiming LOGOUT;
    public static final RequestTiming NETWORK_CHANGED;
    public static final RequestTiming ON_BACKGROUND;
    public static final RequestTiming ON_FOREGROUND;
    public static final RequestTiming ON_HOME_PAGE_CREATED;

    static {
       RequestTiming requestTimin = new RequestTiming("DEFAULT", 0);
       RequestTiming.DEFAULT = requestTimin;
       RequestTiming requestTimin1 = new RequestTiming("COLD_START", 1);
       RequestTiming.COLD_START = requestTimin1;
       RequestTiming requestTimin2 = new RequestTiming("ON_HOME_PAGE_CREATED", 2);
       RequestTiming.ON_HOME_PAGE_CREATED = requestTimin2;
       RequestTiming requestTimin3 = new RequestTiming("ON_FOREGROUND", 3);
       RequestTiming.ON_FOREGROUND = requestTimin3;
       RequestTiming requestTimin4 = new RequestTiming("ON_BACKGROUND", 4);
       RequestTiming.ON_BACKGROUND = requestTimin4;
       RequestTiming requestTimin5 = new RequestTiming("LOGIN", 5);
       RequestTiming.LOGIN = requestTimin5;
       RequestTiming requestTimin6 = new RequestTiming("LOGOUT", 6);
       RequestTiming.LOGOUT = requestTimin6;
       RequestTiming requestTimin7 = new RequestTiming("AFTER_STARTUP", 7);
       RequestTiming.AFTER_STARTUP = requestTimin7;
       RequestTiming requestTimin8 = new RequestTiming("AFTER_ABTEST", 8);
       RequestTiming.AFTER_ABTEST = requestTimin8;
       RequestTiming requestTimin9 = new RequestTiming("NETWORK_CHANGED", 9);
       RequestTiming.NETWORK_CHANGED = requestTimin9;
       RequestTiming requestTimin10 = new RequestTiming("BUSY_TIME", 10);
       RequestTiming.BUSY_TIME = requestTimin10;
       RequestTiming requestTimin11 = new RequestTiming("BUSY_TIME_NON_DEFAULT", 11);
       RequestTiming.BUSY_TIME_NON_DEFAULT = requestTimin11;
       RequestTiming[] requestTimin12 = new RequestTiming[12];
       requestTimin12[0] = requestTimin;
       requestTimin12[1] = requestTimin1;
       requestTimin12[2] = requestTimin2;
       requestTimin12[3] = requestTimin3;
       requestTimin12[4] = requestTimin4;
       requestTimin12[5] = requestTimin5;
       requestTimin12[6] = requestTimin6;
       requestTimin12[7] = requestTimin7;
       requestTimin12[8] = requestTimin8;
       requestTimin12[9] = requestTimin9;
       requestTimin12[10] = requestTimin10;
       requestTimin12[11] = requestTimin11;
       RequestTiming.$VALUES = requestTimin12;
    }
    public void RequestTiming(String p0,int p1){
       super(p0, p1);
    }
    public static RequestTiming valueOf(String p0){
       return Enum.valueOf(RequestTiming.class, p0);
    }
    public static RequestTiming[] values(){
       return RequestTiming.$VALUES.clone();
    }
}
