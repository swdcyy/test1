package com.kwai.framework.config.NetworkResponse$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class NetworkResponse$Status extends Enum	// class@0014fb
{
    public static final NetworkResponse$Status[] $VALUES;
    public static final NetworkResponse$Status FAILURE;
    public static final NetworkResponse$Status SUCCESS;

    static {
       NetworkResponse$Status status = new NetworkResponse$Status("SUCCESS", 0);
       NetworkResponse$Status.SUCCESS = status;
       NetworkResponse$Status status1 = new NetworkResponse$Status("FAILURE", 1);
       NetworkResponse$Status.FAILURE = status1;
       NetworkResponse$Status[] statusArray = new NetworkResponse$Status[]{status,status1};
       NetworkResponse$Status.$VALUES = statusArray;
    }
    public void NetworkResponse$Status(String p0,int p1){
       super(p0, p1);
    }
    public static NetworkResponse$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkResponse$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(NetworkResponse$Status.class, p0);
    }
    public static NetworkResponse$Status[] values(){
       Object obj = PatchProxy.apply(null, null, NetworkResponse$Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NetworkResponse$Status.$VALUES.clone();
    }
}
