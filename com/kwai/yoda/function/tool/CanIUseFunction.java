package com.kwai.yoda.function.tool.CanIUseFunction;
import ay7.a;
import com.kwai.yoda.function.tool.CanIUseFunction$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import org.json.JSONObject;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import ny7.a;
import com.kwai.yoda.function.tool.CanIUseFunction$CanUseResultParams;
import com.kwai.yoda.bridge.YodaException;
import java.lang.StringBuilder;
import org.json.JSONException;
import java.lang.Boolean;

public final class CanIUseFunction extends a	// class@001203
{
    public static final CanIUseFunction$a d;

    static {
       CanIUseFunction.d = new CanIUseFunction$a(null);
    }
    public void CanIUseFunction(){
       super();
    }
    public String c(){
       return "canIUse";
    }
    public String d(){
       return "tool";
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       StringBuilder obj = PatchProxy.applyTwoRefs(p0, p1, this, CanIUseFunction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       JSONObject jSONObject = (p1 == null || !p1.length())? 1: null;
       if (!jSONObject) {
          if (p0 != null) {
             try{
                jSONObject = new JSONObject(p1);
                p1 = jSONObject.getString("name");
                CanIUseFunction$CanUseResultParams uCanUseResul = (p0.getJavascriptBridge().c(jSONObject.getString("namespace"), p1) == null)? this.m(obj): this.m(true);
                return uCanUseResul;
             }catch(org.json.JSONException e6){
                throw new YodaException(0x1e84f, "The Input parameter is invalid. "+e6.getMessage());
             }
          }else {
             throw new YodaException(0x1e850, "client status error: webview is null.");
          }
       }else {
          throw new YodaException(0x1e84f, "The Input is invalid: root params should be object.");
       }
    }
    public final CanIUseFunction$CanUseResultParams m(boolean p0){
       CanIUseFunction$CanUseResultParams obj;
       CanIUseFunction uCanIUseFunc = CanIUseFunction.class;
       if (PatchProxy.isSupport(uCanIUseFunc)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uCanIUseFunc, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new CanIUseFunction$CanUseResultParams();
       obj.mResult = 1;
       obj.mCanUse = p0;
       return obj;
    }
}
