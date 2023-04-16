package com.yxcorp.gifshow.profile.kslog.KsLogStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KsLogStatus extends Enum	// class@00137d
{
    public static final KsLogStatus[] $VALUES;
    public static final KsLogStatus FAIL;
    public static final KsLogStatus RETRY;
    public static final KsLogStatus START;
    public static final KsLogStatus SUCCESS;

    static {
       KsLogStatus ksLogStatus;
       KsLogStatus[] ksLogStatusA = new KsLogStatus[]{ksLogStatus,ksLogStatus,ksLogStatus,ksLogStatus};
       ksLogStatus = new KsLogStatus("START", 0);
       KsLogStatus.START = ksLogStatus;
       ksLogStatus = new KsLogStatus("SUCCESS", 1);
       KsLogStatus.SUCCESS = ksLogStatus;
       ksLogStatus = new KsLogStatus("FAIL", 2);
       KsLogStatus.FAIL = ksLogStatus;
       ksLogStatus = new KsLogStatus("RETRY", 3);
       KsLogStatus.RETRY = ksLogStatus;
       KsLogStatus.$VALUES = ksLogStatusA;
    }
    public void KsLogStatus(String p0,int p1){
       super(p0, p1);
    }
    public static KsLogStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsLogStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsLogStatus.class, p0);
    }
    public static KsLogStatus[] values(){
       Object obj = PatchProxy.apply(null, null, KsLogStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsLogStatus.$VALUES.clone();
    }
}
