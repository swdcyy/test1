package androidx.work.NetworkType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class NetworkType extends Enum	// class@000a50
{
    public static final NetworkType[] $VALUES;
    public static final NetworkType CONNECTED;
    public static final NetworkType METERED;
    public static final NetworkType NOT_REQUIRED;
    public static final NetworkType NOT_ROAMING;
    public static final NetworkType UNMETERED;

    static {
       NetworkType networkType = new NetworkType("NOT_REQUIRED", 0);
       NetworkType.NOT_REQUIRED = networkType;
       NetworkType networkType1 = new NetworkType("CONNECTED", 1);
       NetworkType.CONNECTED = networkType1;
       NetworkType networkType2 = new NetworkType("UNMETERED", 2);
       NetworkType.UNMETERED = networkType2;
       NetworkType networkType3 = new NetworkType("NOT_ROAMING", 3);
       NetworkType.NOT_ROAMING = networkType3;
       NetworkType networkType4 = new NetworkType("METERED", 4);
       NetworkType.METERED = networkType4;
       NetworkType[] networkTypeA = new NetworkType[]{networkType,networkType1,networkType2,networkType3,networkType4};
       NetworkType.$VALUES = networkTypeA;
    }
    public void NetworkType(String p0,int p1){
       super(p0, p1);
    }
    public static NetworkType valueOf(String p0){
       return Enum.valueOf(NetworkType.class, p0);
    }
    public static NetworkType[] values(){
       return NetworkType.$VALUES.clone();
    }
}
