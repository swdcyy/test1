package com.yxcorp.gateway.pay.response.BindResult;
import com.yxcorp.gateway.pay.response.GatewayPayBaseResponse;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class BindResult extends GatewayPayBaseResponse	// class@001264
{

    public void BindResult(){
       super();
    }
    public static BindResult cancel(String p0){
       BindResult obj = PatchProxy.applyOneRefs(p0, null, BindResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new BindResult();
       obj.mCode = "CANCEL";
       obj.mMsg = p0;
       return obj;
    }
    public static BindResult fail(String p0){
       BindResult obj = PatchProxy.applyOneRefs(p0, null, BindResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new BindResult();
       obj.mCode = "FAIL";
       obj.mMsg = p0;
       return obj;
    }
    public static BindResult success(){
       BindResult obj = PatchProxy.apply(null, null, BindResult.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new BindResult();
       obj.mCode = "SUCCESS";
       obj.mMsg = "";
       return obj;
    }
    public boolean isCancel(){
       Object obj = PatchProxy.apply(null, this, BindResult.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("CANCEL").equals(this.mCode);
    }
    public boolean isSuccess(){
       Object obj = PatchProxy.apply(null, this, BindResult.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("SUCCESS").equals(this.mCode);
    }
}
