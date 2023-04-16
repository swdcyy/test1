package com.reactnativecommunity.netinfo.types.ConnectionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ConnectionType extends Enum	// class@000b68
{
    public final String label;
    public static final ConnectionType[] $VALUES;
    public static final ConnectionType BLUETOOTH;
    public static final ConnectionType CELLULAR;
    public static final ConnectionType ETHERNET;
    public static final ConnectionType NONE;
    public static final ConnectionType UNKNOWN;
    public static final ConnectionType VPN;
    public static final ConnectionType WIFI;
    public static final ConnectionType WIMAX;

    static {
       ConnectionType uConnectionT = new ConnectionType("BLUETOOTH", 0, "bluetooth");
       ConnectionType.BLUETOOTH = uConnectionT;
       ConnectionType uConnectionT1 = new ConnectionType("CELLULAR", 1, "cellular");
       ConnectionType.CELLULAR = uConnectionT1;
       ConnectionType uConnectionT2 = new ConnectionType("ETHERNET", 2, "ethernet");
       ConnectionType.ETHERNET = uConnectionT2;
       ConnectionType uConnectionT3 = new ConnectionType("NONE", 3, "none");
       ConnectionType.NONE = uConnectionT3;
       ConnectionType uConnectionT4 = new ConnectionType("UNKNOWN", 4, "unknown");
       ConnectionType.UNKNOWN = uConnectionT4;
       ConnectionType uConnectionT5 = new ConnectionType("WIFI", 5, "wifi");
       ConnectionType.WIFI = uConnectionT5;
       ConnectionType uConnectionT6 = new ConnectionType("WIMAX", 6, "wimax");
       ConnectionType.WIMAX = uConnectionT6;
       ConnectionType uConnectionT7 = new ConnectionType("VPN", 7, "vpn");
       ConnectionType.VPN = uConnectionT7;
       ConnectionType[] uConnectionT8 = new ConnectionType[]{uConnectionT,uConnectionT1,uConnectionT2,uConnectionT3,uConnectionT4,uConnectionT5,uConnectionT6,uConnectionT7};
       ConnectionType.$VALUES = uConnectionT8;
    }
    public void ConnectionType(String p0,int p1,String p2){
       super(p0, p1);
       this.label = p2;
    }
    public static ConnectionType valueOf(String p0){
       return Enum.valueOf(ConnectionType.class, p0);
    }
    public static ConnectionType[] values(){
       return ConnectionType.$VALUES.clone();
    }
}
