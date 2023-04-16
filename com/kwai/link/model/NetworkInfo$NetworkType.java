package com.kwai.link.model.NetworkInfo$NetworkType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class NetworkInfo$NetworkType extends Enum	// class@000d20
{
    public static final NetworkInfo$NetworkType[] $VALUES;
    public static final NetworkInfo$NetworkType k2G;
    public static final NetworkInfo$NetworkType k3G;
    public static final NetworkInfo$NetworkType k4G;
    public static final NetworkInfo$NetworkType k5G;
    public static final NetworkInfo$NetworkType kCellular;
    public static final NetworkInfo$NetworkType kNone;
    public static final NetworkInfo$NetworkType kOther;
    public static final NetworkInfo$NetworkType kWifi;

    static {
       NetworkInfo$NetworkType networkType = new NetworkInfo$NetworkType("kNone", 0);
       NetworkInfo$NetworkType.kNone = networkType;
       NetworkInfo$NetworkType networkType1 = new NetworkInfo$NetworkType("kOther", 1);
       NetworkInfo$NetworkType.kOther = networkType1;
       NetworkInfo$NetworkType networkType2 = new NetworkInfo$NetworkType("kWifi", 2);
       NetworkInfo$NetworkType.kWifi = networkType2;
       NetworkInfo$NetworkType networkType3 = new NetworkInfo$NetworkType("kCellular", 3);
       NetworkInfo$NetworkType.kCellular = networkType3;
       NetworkInfo$NetworkType networkType4 = new NetworkInfo$NetworkType("k2G", 4);
       NetworkInfo$NetworkType.k2G = networkType4;
       NetworkInfo$NetworkType networkType5 = new NetworkInfo$NetworkType("k3G", 5);
       NetworkInfo$NetworkType.k3G = networkType5;
       NetworkInfo$NetworkType networkType6 = new NetworkInfo$NetworkType("k4G", 6);
       NetworkInfo$NetworkType.k4G = networkType6;
       NetworkInfo$NetworkType networkType7 = new NetworkInfo$NetworkType("k5G", 7);
       NetworkInfo$NetworkType.k5G = networkType7;
       NetworkInfo$NetworkType[] networkTypeA = new NetworkInfo$NetworkType[]{networkType,networkType1,networkType2,networkType3,networkType4,networkType5,networkType6,networkType7};
       NetworkInfo$NetworkType.$VALUES = networkTypeA;
    }
    public void NetworkInfo$NetworkType(String p0,int p1){
       super(p0, p1);
    }
    public static NetworkInfo$NetworkType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkInfo$NetworkType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(NetworkInfo$NetworkType.class, p0);
    }
    public static NetworkInfo$NetworkType[] values(){
       Object obj = PatchProxy.apply(null, null, NetworkInfo$NetworkType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NetworkInfo$NetworkType.$VALUES.clone();
    }
}
