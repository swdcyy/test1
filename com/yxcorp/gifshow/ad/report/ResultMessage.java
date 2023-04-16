package com.yxcorp.gifshow.ad.report.ResultMessage;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ResultMessage extends Enum	// class@0017b2
{
    public final int code;
    public final String message;
    public static final ResultMessage[] $VALUES;
    public static final ResultMessage FAILED_TO_OPEN_WECHAT;
    public static final ResultMessage INVALID_ORIGINAL_ID;
    public static final ResultMessage INVALID_PARAMS_STRING;
    public static final ResultMessage SUCCESS;

    static {
       ResultMessage resultMessag1;
       ResultMessage[] resultMessag = new ResultMessage[]{resultMessag1,resultMessag1,resultMessag1,resultMessag1};
       resultMessag1 = new ResultMessage("SUCCESS", 0, 0, "");
       ResultMessage.SUCCESS = resultMessag1;
       resultMessag1 = new ResultMessage("INVALID_ORIGINAL_ID", 1, 1000, "Invalid originalID");
       ResultMessage.INVALID_ORIGINAL_ID = resultMessag1;
       resultMessag1 = new ResultMessage("INVALID_PARAMS_STRING", 2, 1001, "Invalid params string");
       ResultMessage.INVALID_PARAMS_STRING = resultMessag1;
       resultMessag1 = new ResultMessage("FAILED_TO_OPEN_WECHAT", 3, 2000, "Failed to open wechat");
       ResultMessage.FAILED_TO_OPEN_WECHAT = resultMessag1;
       ResultMessage.$VALUES = resultMessag;
    }
    public void ResultMessage(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.code = p2;
       this.message = p3;
    }
    public static ResultMessage valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ResultMessage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ResultMessage.class, p0);
    }
    public static ResultMessage[] values(){
       Object obj = PatchProxy.apply(null, null, ResultMessage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ResultMessage.$VALUES.clone();
    }
    public final int getCode(){
       return this.code;
    }
    public final String getMessage(){
       return this.message;
    }
}
