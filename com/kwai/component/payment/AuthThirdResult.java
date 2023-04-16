package com.kwai.component.payment.AuthThirdResult;
import com.yxcorp.gateway.pay.params.result.BaseResult;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AuthThirdResult extends BaseResult	// class@0009eb
{
    public String mAuthCode;
    public String mErrorCode;
    public String mErrorMsg;
    public static final long serialVersionUID = 0xb37963ccbe03b7cf;

    public void AuthThirdResult(){
       super();
    }
    public static AuthThirdResult cancel(String p0,String p1){
       AuthThirdResult obj = PatchProxy.applyTwoRefs(p0, p1, null, AuthThirdResult.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AuthThirdResult();
       obj.mResult = 0;
       obj.mErrorCode = p0;
       obj.mErrorMsg = p1;
       return obj;
    }
    public static AuthThirdResult fail(String p0,String p1){
       AuthThirdResult obj = PatchProxy.applyTwoRefs(p0, p1, null, AuthThirdResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AuthThirdResult();
       obj.mResult = -1;
       obj.mErrorCode = p0;
       obj.mErrorMsg = p1;
       return obj;
    }
    public static AuthThirdResult success(String p0,String p1){
       AuthThirdResult obj = PatchProxy.applyTwoRefs(p0, p1, null, AuthThirdResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AuthThirdResult();
       obj.mResult = 1;
       obj.mErrorCode = p0;
       obj.mAuthCode = p1;
       return obj;
    }
}
