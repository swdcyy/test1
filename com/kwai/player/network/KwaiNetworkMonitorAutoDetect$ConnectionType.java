package com.kwai.player.network.KwaiNetworkMonitorAutoDetect$ConnectionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KwaiNetworkMonitorAutoDetect$ConnectionType extends Enum	// class@0012f0
{
    public static final KwaiNetworkMonitorAutoDetect$ConnectionType[] $VALUES;
    public static final KwaiNetworkMonitorAutoDetect$ConnectionType CONNECTION_2G;
    public static final KwaiNetworkMonitorAutoDetect$ConnectionType CONNECTION_3G;
    public static final KwaiNetworkMonitorAutoDetect$ConnectionType CONNECTION_4G;
    public static final KwaiNetworkMonitorAutoDetect$ConnectionType CONNECTION_BLUETOOTH;
    public static final KwaiNetworkMonitorAutoDetect$ConnectionType CONNECTION_ETHERNET;
    public static final KwaiNetworkMonitorAutoDetect$ConnectionType CONNECTION_NONE;
    public static final KwaiNetworkMonitorAutoDetect$ConnectionType CONNECTION_UNKNOWN;
    public static final KwaiNetworkMonitorAutoDetect$ConnectionType CONNECTION_UNKNOWN_CELLULAR;
    public static final KwaiNetworkMonitorAutoDetect$ConnectionType CONNECTION_VPN;
    public static final KwaiNetworkMonitorAutoDetect$ConnectionType CONNECTION_WIFI;

    static {
       KwaiNetworkMonitorAutoDetect$ConnectionType uConnectionT = new KwaiNetworkMonitorAutoDetect$ConnectionType("CONNECTION_UNKNOWN", 0);
       KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_UNKNOWN = uConnectionT;
       KwaiNetworkMonitorAutoDetect$ConnectionType uConnectionT1 = new KwaiNetworkMonitorAutoDetect$ConnectionType("CONNECTION_ETHERNET", 1);
       KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_ETHERNET = uConnectionT1;
       KwaiNetworkMonitorAutoDetect$ConnectionType uConnectionT2 = new KwaiNetworkMonitorAutoDetect$ConnectionType("CONNECTION_WIFI", 2);
       KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_WIFI = uConnectionT2;
       KwaiNetworkMonitorAutoDetect$ConnectionType uConnectionT3 = new KwaiNetworkMonitorAutoDetect$ConnectionType("CONNECTION_4G", 3);
       KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_4G = uConnectionT3;
       KwaiNetworkMonitorAutoDetect$ConnectionType uConnectionT4 = new KwaiNetworkMonitorAutoDetect$ConnectionType("CONNECTION_3G", 4);
       KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_3G = uConnectionT4;
       KwaiNetworkMonitorAutoDetect$ConnectionType uConnectionT5 = new KwaiNetworkMonitorAutoDetect$ConnectionType("CONNECTION_2G", 5);
       KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_2G = uConnectionT5;
       KwaiNetworkMonitorAutoDetect$ConnectionType uConnectionT6 = new KwaiNetworkMonitorAutoDetect$ConnectionType("CONNECTION_UNKNOWN_CELLULAR", 6);
       KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_UNKNOWN_CELLULAR = uConnectionT6;
       KwaiNetworkMonitorAutoDetect$ConnectionType uConnectionT7 = new KwaiNetworkMonitorAutoDetect$ConnectionType("CONNECTION_BLUETOOTH", 7);
       KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_BLUETOOTH = uConnectionT7;
       KwaiNetworkMonitorAutoDetect$ConnectionType uConnectionT8 = new KwaiNetworkMonitorAutoDetect$ConnectionType("CONNECTION_VPN", 8);
       KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_VPN = uConnectionT8;
       KwaiNetworkMonitorAutoDetect$ConnectionType uConnectionT9 = new KwaiNetworkMonitorAutoDetect$ConnectionType("CONNECTION_NONE", 9);
       KwaiNetworkMonitorAutoDetect$ConnectionType.CONNECTION_NONE = uConnectionT9;
       KwaiNetworkMonitorAutoDetect$ConnectionType[] uConnectionT10 = new KwaiNetworkMonitorAutoDetect$ConnectionType[10];
       uConnectionT10[0] = uConnectionT;
       uConnectionT10[1] = uConnectionT1;
       uConnectionT10[2] = uConnectionT2;
       uConnectionT10[3] = uConnectionT3;
       uConnectionT10[4] = uConnectionT4;
       uConnectionT10[5] = uConnectionT5;
       uConnectionT10[6] = uConnectionT6;
       uConnectionT10[7] = uConnectionT7;
       uConnectionT10[8] = uConnectionT8;
       uConnectionT10[9] = uConnectionT9;
       KwaiNetworkMonitorAutoDetect$ConnectionType.$VALUES = uConnectionT10;
    }
    public void KwaiNetworkMonitorAutoDetect$ConnectionType(String p0,int p1){
       super(p0, p1);
    }
    public static KwaiNetworkMonitorAutoDetect$ConnectionType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiNetworkMonitorAutoDetect$ConnectionType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KwaiNetworkMonitorAutoDetect$ConnectionType.class, p0);
    }
    public static KwaiNetworkMonitorAutoDetect$ConnectionType[] values(){
       Object obj = PatchProxy.apply(null, null, KwaiNetworkMonitorAutoDetect$ConnectionType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiNetworkMonitorAutoDetect$ConnectionType.$VALUES.clone();
    }
}
