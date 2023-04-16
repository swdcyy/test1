package com.kwai.performance.stability.crash.monitor.anr.AnrTypeEnum;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AnrTypeEnum extends Enum	// class@000dee
{
    public String mReason;
    public String mType;
    public int mWhat;
    public static final AnrTypeEnum[] $VALUES;
    public static final AnrTypeEnum ACTIVITY;
    public static final AnrTypeEnum BROADCAST;
    public static final AnrTypeEnum DEFAULT;
    public static final AnrTypeEnum INPUT_COMMON;
    public static final AnrTypeEnum PROVIDER;
    public static final AnrTypeEnum SERVICE_BACKGROUND;
    public static final AnrTypeEnum SERVICE_FOREGROUND;
    public static final AnrTypeEnum UNKNOWN;

    static {
       AnrTypeEnum uAnrTypeEnum = new AnrTypeEnum("UNKNOWN", 0, -4, "unknown", "unknown");
       AnrTypeEnum.UNKNOWN = v6;
       AnrTypeEnum uAnrTypeEnum1 = new AnrTypeEnum("DEFAULT", 1, -3, "default", "default");
       AnrTypeEnum.DEFAULT = uAnrTypeEnum;
       AnrTypeEnum uAnrTypeEnum2 = new AnrTypeEnum("ACTIVITY", 2, 20, "activity", "activity");
       AnrTypeEnum.ACTIVITY = v1;
       uAnrTypeEnum1 = new AnrTypeEnum("SERVICE_FOREGROUND", 3, 66, "service", "service_foreground");
       AnrTypeEnum.SERVICE_FOREGROUND = v2;
       uAnrTypeEnum2 = new AnrTypeEnum("SERVICE_BACKGROUND", 4, 12, "service", "service_background");
       AnrTypeEnum.SERVICE_BACKGROUND = v3;
       uAnrTypeEnum1 = new AnrTypeEnum("PROVIDER", 5, 57, "provider", "provider");
       AnrTypeEnum.PROVIDER = v4;
       uAnrTypeEnum2 = new AnrTypeEnum("BROADCAST", 6, 201, "broadcast", "broadcast");
       AnrTypeEnum.BROADCAST = v5;
       uAnrTypeEnum1 = new AnrTypeEnum("INPUT_COMMON", 7, 0x2710, "input", "input_common");
       AnrTypeEnum.INPUT_COMMON = uAnrTypeEnum2;
       AnrTypeEnum[] uAnrTypeEnum3 = new AnrTypeEnum[]{v6,uAnrTypeEnum,v1,v2,v3,v4,v5,uAnrTypeEnum2};
       AnrTypeEnum.$VALUES = uAnrTypeEnum3;
    }
    public void AnrTypeEnum(String p0,int p1,int p2,String p3,String p4){
       super(p0, p1);
       this.mWhat = p2;
       this.mType = p3;
       this.mReason = p4;
    }
    public static AnrTypeEnum valueOf(String p0){
       return Enum.valueOf(AnrTypeEnum.class, p0);
    }
    public static AnrTypeEnum[] values(){
       return AnrTypeEnum.$VALUES.clone();
    }
    public String getType(){
       return this.mType;
    }
    public int getWhat(){
       return this.mWhat;
    }
}
