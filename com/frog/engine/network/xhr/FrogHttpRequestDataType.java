package com.frog.engine.network.xhr.FrogHttpRequestDataType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FrogHttpRequestDataType extends Enum	// class@001565
{
    public static final FrogHttpRequestDataType[] $VALUES;
    public static final FrogHttpRequestDataType ARRAY_BUFFER;
    public static final FrogHttpRequestDataType OBJECT;
    public static final FrogHttpRequestDataType STRING;

    static {
       FrogHttpRequestDataType uFrogHttpReq = new FrogHttpRequestDataType("STRING", 0);
       FrogHttpRequestDataType.STRING = uFrogHttpReq;
       FrogHttpRequestDataType uFrogHttpReq1 = new FrogHttpRequestDataType("OBJECT", 1);
       FrogHttpRequestDataType.OBJECT = uFrogHttpReq1;
       FrogHttpRequestDataType uFrogHttpReq2 = new FrogHttpRequestDataType("ARRAY_BUFFER", 2);
       FrogHttpRequestDataType.ARRAY_BUFFER = uFrogHttpReq2;
       FrogHttpRequestDataType[] uFrogHttpReq3 = new FrogHttpRequestDataType[]{uFrogHttpReq,uFrogHttpReq1,uFrogHttpReq2};
       FrogHttpRequestDataType.$VALUES = uFrogHttpReq3;
    }
    public void FrogHttpRequestDataType(String p0,int p1){
       super(p0, p1);
    }
    public static FrogHttpRequestDataType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FrogHttpRequestDataType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FrogHttpRequestDataType.class, p0);
    }
    public static FrogHttpRequestDataType[] values(){
       Object obj = PatchProxy.apply(null, null, FrogHttpRequestDataType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FrogHttpRequestDataType.$VALUES.clone();
    }
}
