package com.yxcorp.gifshow.freetraffic.FreeTrafficActivateEvent$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FreeTrafficActivateEvent$Status extends Enum	// class@00128e
{
    public static final FreeTrafficActivateEvent$Status[] $VALUES;
    public static final FreeTrafficActivateEvent$Status FAILED;
    public static final FreeTrafficActivateEvent$Status SUCCESS;

    static {
       FreeTrafficActivateEvent$Status status = new FreeTrafficActivateEvent$Status("SUCCESS", 0);
       FreeTrafficActivateEvent$Status.SUCCESS = status;
       FreeTrafficActivateEvent$Status status1 = new FreeTrafficActivateEvent$Status("FAILED", 1);
       FreeTrafficActivateEvent$Status.FAILED = status1;
       FreeTrafficActivateEvent$Status[] statusArray = new FreeTrafficActivateEvent$Status[]{status,status1};
       FreeTrafficActivateEvent$Status.$VALUES = statusArray;
    }
    public void FreeTrafficActivateEvent$Status(String p0,int p1){
       super(p0, p1);
    }
    public static FreeTrafficActivateEvent$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FreeTrafficActivateEvent$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FreeTrafficActivateEvent$Status.class, p0);
    }
    public static FreeTrafficActivateEvent$Status[] values(){
       Object obj = PatchProxy.apply(null, null, FreeTrafficActivateEvent$Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FreeTrafficActivateEvent$Status.$VALUES.clone();
    }
}
