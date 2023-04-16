package vxc.e;
import com.yxcorp.gifshow.webview.api.WebViewFragment$c;
import uxc.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.webview.view.c;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import erd.g;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.util.Map;

public interface abstract e	// class@0040a4
{

    WebViewFragment$c a();
    void b(WebViewFragment$c p0);
    void c(b p0);
    void d(GifshowActivity p0,WebView p1,c p2,JsNativeEventCommunication p3);
    ProgressFragment e(g p0);
    Map f();
    void g(Map p0);
    b h();
    JsNativeEventCommunication i();
    c j();
}
