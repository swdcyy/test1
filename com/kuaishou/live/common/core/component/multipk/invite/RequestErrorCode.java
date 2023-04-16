package com.kuaishou.live.common.core.component.multipk.invite.RequestErrorCode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RequestErrorCode extends Enum	// class@001648
{
    public final int type;
    public static final RequestErrorCode[] $VALUES;
    public static final RequestErrorCode DEFAULT;
    public static final RequestErrorCode INTERACT_SDK_ERROR;
    public static final RequestErrorCode INVITING;
    public static final RequestErrorCode SUCCESS;

    static {
       RequestErrorCode requestError1;
       RequestErrorCode[] requestError = new RequestErrorCode[]{requestError1,requestError1,requestError1,requestError1};
       requestError1 = new RequestErrorCode("DEFAULT", 0, -1);
       RequestErrorCode.DEFAULT = requestError1;
       requestError1 = new RequestErrorCode("SUCCESS", 1, 0);
       RequestErrorCode.SUCCESS = requestError1;
       requestError1 = new RequestErrorCode("INVITING", 2, 1);
       RequestErrorCode.INVITING = requestError1;
       requestError1 = new RequestErrorCode("INTERACT_SDK_ERROR", 3, 2);
       RequestErrorCode.INTERACT_SDK_ERROR = requestError1;
       RequestErrorCode.$VALUES = requestError;
    }
    public void RequestErrorCode(String p0,int p1,int p2){
       super(p0, p1);
       this.type = p2;
    }
    public static RequestErrorCode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RequestErrorCode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RequestErrorCode.class, p0);
    }
    public static RequestErrorCode[] values(){
       Object obj = PatchProxy.apply(null, null, RequestErrorCode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RequestErrorCode.$VALUES.clone();
    }
    public final int getType(){
       return this.type;
    }
}
