package com.kwai.yoda.function.webview.GetWebViewStatusFunction;
import ay7.a;
import com.kwai.yoda.function.webview.GetWebViewStatusFunction$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.function.webview.GetWebViewStatusFunction$WebViewStatusParams;
import com.kwai.yoda.bridge.YodaException;

public final class GetWebViewStatusFunction extends a	// class@00125d
{
    public static final GetWebViewStatusFunction$a d;

    static {
       GetWebViewStatusFunction.d = new GetWebViewStatusFunction$a(null);
    }
    public void GetWebViewStatusFunction(){
       super();
    }
    public String c(){
       return "getWebviewStatus";
    }
    public String d(){
       return "webview";
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, GetWebViewStatusFunction.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (p0 == null) {
          throw new YodaException(0x1e850, "client status error: webview is null.");
       }
       GetWebViewStatusFunction$WebViewStatusParams webViewStatu = new GetWebViewStatusFunction$WebViewStatusParams();
       webViewStatu.mResult = 1;
       webViewStatu.mOnTop = p0.isShowing();
       String str = (p0.isForeground())? "foreground": "background";
       webViewStatu.mAppStatus = str;
       return webViewStatu;
    }
}
