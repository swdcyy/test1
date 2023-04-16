package com.kwai.yoda.function.tool.GetApiListFunction;
import ay7.a;
import com.kwai.yoda.function.tool.GetApiListFunction$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import com.kwai.yoda.function.tool.GetApiListFunction$ApiListResultParams;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import java.util.Set;
import com.kwai.yoda.kernel.bridge.YodaWebBridge;
import trd.d1;
import sz7.l;
import java.lang.Long;
import com.kwai.yoda.session.logger.webviewload.DebugInfo;
import com.kwai.yoda.bridge.YodaException;

public final class GetApiListFunction extends a	// class@001206
{
    public static final GetApiListFunction$a d;

    static {
       GetApiListFunction.d = new GetApiListFunction$a(null);
    }
    public void GetApiListFunction(){
       super();
    }
    public String c(){
       return "getApiList";
    }
    public String d(){
       return "tool";
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       Set set;
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, GetApiListFunction.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       long l = System.currentTimeMillis();
       if (p0 == null) {
          throw new YodaException(0x1e850, "client status error: webview is null.");
       }
       GetApiListFunction$ApiListResultParams uApiListResu = new GetApiListFunction$ApiListResultParams();
       uApiListResu.mResult = 1;
       NewYodaJavascriptBridge javascriptBr = p0.getJavascriptBridge();
       if (javascriptBr != null) {
          set = javascriptBr.e();
          if (set != null) {
          label_002e :
             uApiListResu.apiList = set;
             uApiListResu.size = set.size();
             p0.bridgeApiListCost = Long.valueOf((System.currentTimeMillis() - l));
             return uApiListResu;
          }
       }
       set = d1.k();
       goto label_002e ;
    }
}
