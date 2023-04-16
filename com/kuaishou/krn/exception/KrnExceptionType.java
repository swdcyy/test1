package com.kuaishou.krn.exception.KrnExceptionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KrnExceptionType extends Enum	// class@00086e
{
    public static final KrnExceptionType[] $VALUES;
    public static final KrnExceptionType CHECK_BUNDLE_ERROR;
    public static final KrnExceptionType LOAD_BUNDLE_ERROR;
    public static final KrnExceptionType LOAD_JS_ERROR;

    static {
       KrnExceptionType krnException1;
       KrnExceptionType[] krnException = new KrnExceptionType[]{krnException1,krnException1,krnException1};
       krnException1 = new KrnExceptionType("LOAD_BUNDLE_ERROR", 0);
       KrnExceptionType.LOAD_BUNDLE_ERROR = krnException1;
       krnException1 = new KrnExceptionType("CHECK_BUNDLE_ERROR", 1);
       KrnExceptionType.CHECK_BUNDLE_ERROR = krnException1;
       krnException1 = new KrnExceptionType("LOAD_JS_ERROR", 2);
       KrnExceptionType.LOAD_JS_ERROR = krnException1;
       KrnExceptionType.$VALUES = krnException;
    }
    public void KrnExceptionType(String p0,int p1){
       super(p0, p1);
    }
    public static KrnExceptionType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KrnExceptionType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KrnExceptionType.class, p0);
    }
    public static KrnExceptionType[] values(){
       Object obj = PatchProxy.apply(null, null, KrnExceptionType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KrnExceptionType.$VALUES.clone();
    }
}
