package com.yxcorp.gifshow.mockphoto.EncodeResultResponse$EncodeResult;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EncodeResultResponse$EncodeResult extends Enum	// class@001ddd
{
    public static final EncodeResultResponse$EncodeResult[] $VALUES;
    public static final EncodeResultResponse$EncodeResult DELETED;
    public static final EncodeResultResponse$EncodeResult FAILED;
    public static final EncodeResultResponse$EncodeResult FINISHED;
    public static final EncodeResultResponse$EncodeResult PROCESSING;

    static {
       EncodeResultResponse$EncodeResult uEncodeResul = new EncodeResultResponse$EncodeResult("PROCESSING", 0);
       EncodeResultResponse$EncodeResult.PROCESSING = uEncodeResul;
       EncodeResultResponse$EncodeResult uEncodeResul1 = new EncodeResultResponse$EncodeResult("FINISHED", 1);
       EncodeResultResponse$EncodeResult.FINISHED = uEncodeResul1;
       EncodeResultResponse$EncodeResult uEncodeResul2 = new EncodeResultResponse$EncodeResult("FAILED", 2);
       EncodeResultResponse$EncodeResult.FAILED = uEncodeResul2;
       EncodeResultResponse$EncodeResult uEncodeResul3 = new EncodeResultResponse$EncodeResult("DELETED", 3);
       EncodeResultResponse$EncodeResult.DELETED = uEncodeResul3;
       EncodeResultResponse$EncodeResult[] uEncodeResul4 = new EncodeResultResponse$EncodeResult[]{uEncodeResul,uEncodeResul1,uEncodeResul2,uEncodeResul3};
       EncodeResultResponse$EncodeResult.$VALUES = uEncodeResul4;
    }
    public void EncodeResultResponse$EncodeResult(String p0,int p1){
       super(p0, p1);
    }
    public static EncodeResultResponse$EncodeResult valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EncodeResultResponse$EncodeResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EncodeResultResponse$EncodeResult.class, p0);
    }
    public static EncodeResultResponse$EncodeResult[] values(){
       Object obj = PatchProxy.apply(null, null, EncodeResultResponse$EncodeResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EncodeResultResponse$EncodeResult.$VALUES.clone();
    }
}
