package com.kuaishou.aegon.NetworkSwitchCallback$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class NetworkSwitchCallback$Status extends Enum	// class@00079c
{
    public static final NetworkSwitchCallback$Status[] $VALUES;
    public static final NetworkSwitchCallback$Status NETWORK_ACTIVATE_ONLY;
    public static final NetworkSwitchCallback$Status NETWORK_BIND_FAILED;
    public static final NetworkSwitchCallback$Status NETWORK_NO_PERMISSION;
    public static final NetworkSwitchCallback$Status NETWORK_NQE_NOT_POOR;
    public static final NetworkSwitchCallback$Status NETWORK_SPEED_FAILED;
    public static final NetworkSwitchCallback$Status NETWORK_SWITCH_CLOSE;
    public static final NetworkSwitchCallback$Status NETWORK_SWITCH_ERROR;
    public static final NetworkSwitchCallback$Status NETWORK_SWITCH_RESET;
    public static final NetworkSwitchCallback$Status NETWORK_SWITCH_SUCCESS;
    public static final NetworkSwitchCallback$Status NETWORK_UNAVAILABLE;

    static {
       NetworkSwitchCallback$Status status = new NetworkSwitchCallback$Status("NETWORK_SWITCH_SUCCESS", 0);
       NetworkSwitchCallback$Status.NETWORK_SWITCH_SUCCESS = status;
       NetworkSwitchCallback$Status status1 = new NetworkSwitchCallback$Status("NETWORK_UNAVAILABLE", 1);
       NetworkSwitchCallback$Status.NETWORK_UNAVAILABLE = status1;
       NetworkSwitchCallback$Status status2 = new NetworkSwitchCallback$Status("NETWORK_ACTIVATE_ONLY", 2);
       NetworkSwitchCallback$Status.NETWORK_ACTIVATE_ONLY = status2;
       NetworkSwitchCallback$Status status3 = new NetworkSwitchCallback$Status("NETWORK_SPEED_FAILED", 3);
       NetworkSwitchCallback$Status.NETWORK_SPEED_FAILED = status3;
       NetworkSwitchCallback$Status status4 = new NetworkSwitchCallback$Status("NETWORK_NQE_NOT_POOR", 4);
       NetworkSwitchCallback$Status.NETWORK_NQE_NOT_POOR = status4;
       NetworkSwitchCallback$Status status5 = new NetworkSwitchCallback$Status("NETWORK_BIND_FAILED", 5);
       NetworkSwitchCallback$Status.NETWORK_BIND_FAILED = status5;
       NetworkSwitchCallback$Status status6 = new NetworkSwitchCallback$Status("NETWORK_NO_PERMISSION", 6);
       NetworkSwitchCallback$Status.NETWORK_NO_PERMISSION = status6;
       NetworkSwitchCallback$Status status7 = new NetworkSwitchCallback$Status("NETWORK_SWITCH_ERROR", 7);
       NetworkSwitchCallback$Status.NETWORK_SWITCH_ERROR = status7;
       NetworkSwitchCallback$Status status8 = new NetworkSwitchCallback$Status("NETWORK_SWITCH_CLOSE", 8);
       NetworkSwitchCallback$Status.NETWORK_SWITCH_CLOSE = status8;
       NetworkSwitchCallback$Status status9 = new NetworkSwitchCallback$Status("NETWORK_SWITCH_RESET", 9);
       NetworkSwitchCallback$Status.NETWORK_SWITCH_RESET = status9;
       NetworkSwitchCallback$Status[] statusArray = new NetworkSwitchCallback$Status[10];
       statusArray[0] = status;
       statusArray[1] = status1;
       statusArray[2] = status2;
       statusArray[3] = status3;
       statusArray[4] = status4;
       statusArray[5] = status5;
       statusArray[6] = status6;
       statusArray[7] = status7;
       statusArray[8] = status8;
       statusArray[9] = status9;
       NetworkSwitchCallback$Status.$VALUES = statusArray;
    }
    public void NetworkSwitchCallback$Status(String p0,int p1){
       super(p0, p1);
    }
    public static NetworkSwitchCallback$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkSwitchCallback$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(NetworkSwitchCallback$Status.class, p0);
    }
    public static NetworkSwitchCallback$Status[] values(){
       Object obj = PatchProxy.apply(null, null, NetworkSwitchCallback$Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NetworkSwitchCallback$Status.$VALUES.clone();
    }
}
