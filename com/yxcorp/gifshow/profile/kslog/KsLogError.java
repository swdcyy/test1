package com.yxcorp.gifshow.profile.kslog.KsLogError;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KsLogError extends Enum	// class@001378
{
    public static final KsLogError[] $VALUES;
    public static final KsLogError DEFAULT;
    public static final KsLogError ERROR_CODE;

    static {
       KsLogError ksLogError;
       KsLogError[] ksLogErrorAr = new KsLogError[]{ksLogError,ksLogError};
       ksLogError = new KsLogError("DEFAULT", 0);
       KsLogError.DEFAULT = ksLogError;
       ksLogError = new KsLogError("ERROR_CODE", 1);
       KsLogError.ERROR_CODE = ksLogError;
       KsLogError.$VALUES = ksLogErrorAr;
    }
    public void KsLogError(String p0,int p1){
       super(p0, p1);
    }
    public static KsLogError valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsLogError.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsLogError.class, p0);
    }
    public static KsLogError[] values(){
       Object obj = PatchProxy.apply(null, null, KsLogError.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsLogError.$VALUES.clone();
    }
}
