package k59.a;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.ad.webview.jsbridge.g;
import com.kuaishou.webkit.WebView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import com.kwai.yoda.bridge.YodaBaseWebView;
import p55.a;
import com.yxcorp.gifshow.webview.helper.e;
import txc.b;
import yx.j0;
import y55.a;

public final class a	// class@002ac5
{
    public static final boolean a;
    public static final a b;

    static {
       a.b = new a();
       a.a = a.t().d("h5UseBridgeCenter", false);
    }
    public void a(){
       super();
    }
    public static final void a(g p0,WebView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "2")) {
          return;
       }
       a.p(p0, "jsInterface");
       a.p(p1, "webView");
       if (a.a && p1 instanceof KwaiYodaWebView) {
          a uoa = e.e(p1);
          if (!uoa instanceof b) {
             Object[] objArray = new Object[0];
             j0.c("AdBridgeRegister", "bridge context is not H5BridgeContext", objArray);
             p1.addJavascriptInterface(p0, "KwaiAd");
             return;
          }else {
             uoa.e(g.class, p0);
          }
       }else {
          p1.addJavascriptInterface(p0, "KwaiAd");
       }
       return;
    }
}
