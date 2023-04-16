package com.oasisfeng.condom.OutboundType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class OutboundType extends Enum	// class@000a95
{
    public static final OutboundType[] $VALUES;
    public static final OutboundType BIND_SERVICE;
    public static final OutboundType BROADCAST;
    public static final OutboundType CHECK_PERMISSION;
    public static final OutboundType CONTENT;
    public static final OutboundType GET_APPLICATION_INFO;
    public static final OutboundType GET_PACKAGE_INFO;
    public static final OutboundType QUERY_PACKAGES;
    public static final OutboundType QUERY_RECEIVERS;
    public static final OutboundType QUERY_SERVICES;
    public static final OutboundType START_SERVICE;

    static {
       OutboundType outboundType = new OutboundType("START_SERVICE", 0);
       OutboundType.START_SERVICE = outboundType;
       OutboundType outboundType1 = new OutboundType("BIND_SERVICE", 1);
       OutboundType.BIND_SERVICE = outboundType1;
       OutboundType outboundType2 = new OutboundType("BROADCAST", 2);
       OutboundType.BROADCAST = outboundType2;
       OutboundType outboundType3 = new OutboundType("CONTENT", 3);
       OutboundType.CONTENT = outboundType3;
       OutboundType outboundType4 = new OutboundType("QUERY_SERVICES", 4);
       OutboundType.QUERY_SERVICES = outboundType4;
       OutboundType outboundType5 = new OutboundType("QUERY_RECEIVERS", 5);
       OutboundType.QUERY_RECEIVERS = outboundType5;
       OutboundType outboundType6 = new OutboundType("QUERY_PACKAGES", 6);
       OutboundType.QUERY_PACKAGES = outboundType6;
       OutboundType outboundType7 = new OutboundType("GET_APPLICATION_INFO", 7);
       OutboundType.GET_APPLICATION_INFO = outboundType7;
       OutboundType outboundType8 = new OutboundType("GET_PACKAGE_INFO", 8);
       OutboundType.GET_PACKAGE_INFO = outboundType8;
       OutboundType outboundType9 = new OutboundType("CHECK_PERMISSION", 9);
       OutboundType.CHECK_PERMISSION = outboundType9;
       OutboundType[] outboundType10 = new OutboundType[10];
       outboundType10[0] = outboundType;
       outboundType10[1] = outboundType1;
       outboundType10[2] = outboundType2;
       outboundType10[3] = outboundType3;
       outboundType10[4] = outboundType4;
       outboundType10[5] = outboundType5;
       outboundType10[6] = outboundType6;
       outboundType10[7] = outboundType7;
       outboundType10[8] = outboundType8;
       outboundType10[9] = outboundType9;
       OutboundType.$VALUES = outboundType10;
    }
    public void OutboundType(String p0,int p1){
       super(p0, p1);
    }
    public static OutboundType valueOf(String p0){
       return Enum.valueOf(OutboundType.class, p0);
    }
    public static OutboundType[] values(){
       return OutboundType.$VALUES.clone();
    }
}
