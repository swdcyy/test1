package com.kwai.yoda.function.tool.GetPageInitConfigFunction;
import ny7.a;
import com.kwai.yoda.function.tool.GetPageInitConfigFunction$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.kernel.container.YodaWebView;
import ny7.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.tool.GetPageInitConfigFunction$b;
import com.kwai.yoda.function.tool.GetPageInitConfigFunction$ConfigData;
import mz7.a;
import com.kwai.yoda.function.tool.GetPageInitConfigFunction$BridgeConfig;
import sx7.x$a;
import java.lang.Boolean;
import com.kwai.yoda.bridge.YodaException;

public final class GetPageInitConfigFunction extends a	// class@001214
{
    public static final GetPageInitConfigFunction$a c;

    static {
       GetPageInitConfigFunction.c = new GetPageInitConfigFunction$a(null);
    }
    public void GetPageInitConfigFunction(){
       super();
    }
    public String c(){
       return "getCommonConfig";
    }
    public String d(){
       return "tool";
    }
    public Object e(YodaWebView p0,c p1){
       GetPageInitConfigFunction$ConfigData obj = PatchProxy.applyTwoRefs(p0, p1, this, GetPageInitConfigFunction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p1, "invokeContext");
       if (!p0 instanceof YodaBaseWebView) {
          throw new YodaException(0x1e850, "client status error: webview is null.");
       }
       GetPageInitConfigFunction$b uob = new GetPageInitConfigFunction$b();
       obj = new GetPageInitConfigFunction$ConfigData();
       a e = p0.getContainerSession().e;
       if (e != null) {
          GetPageInitConfigFunction$BridgeConfig uBridgeConfi = new GetPageInitConfigFunction$BridgeConfig();
          x$a enableApiPro = e.enableApiProxy;
          boolean b = (enableApiPro != null)? enableApiPro.booleanValue(): false;
          uBridgeConfi.enableRequestProxy = b;
          obj.bridgeConfig = uBridgeConfi;
       }
       uob.configData = obj;
       return uob;
    }
}
