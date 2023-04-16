package c77.x;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import c77.c0;
import java.lang.Object;
import com.yxcorp.gifshow.webview.api.WebViewFragment$d;
import uxc.g;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView$b;
import c77.b0;

public class x implements WebViewFragment$b	// class@00050e
{
    public final c0 b;

    public void x(c0 p0){
       this.b = p0;
       super();
    }
    public WebViewFragment$d C1(){
       return g.a(this);
    }
    public boolean J(WebView p0,String p1){
       return g.d(this, p0, p1);
    }
    public String T1(){
       return g.c(this);
    }
    public void w1(WebViewFragment p0,WebView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, x.class, "1")) {
          return;
       }
       if (p1 instanceof KwaiYodaWebView) {
          x tb = this.b;
          Objects.requireNonNull(tb);
          c0 uoc0 = PatchProxy.apply(null, tb, c0.class, "13");
          if (uoc0 != PatchProxyResult.class) {
          }else {
             uoc0 = tb.y;
             if (uoc0 == null) {
                uoc0 = new b0(tb);
                tb.y = uoc0;
             }
          }
          p1.setOnOverScrolledCallBack(uoc0);
       }
       return;
    }
}
