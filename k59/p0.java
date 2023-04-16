package k59.p0;
import sl9.b;
import com.yxcorp.gifshow.ad.webview.j;
import java.lang.Object;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m59.o;
import com.yxcorp.gifshow.ad.webview.o;
import k59.e2;
import com.yxcorp.gifshow.webview.view.c;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import android.widget.RelativeLayout;
import com.kwai.yoda.bridge.YodaBaseWebView;
import y55.a;
import sl9.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class p0 implements b	// class@002b01
{
    public final j a;

    public void p0(j p0){
       this.a = p0;
       super();
    }
    public void a(WebView p0,WebViewFragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p0.class, "1")) {
          return;
       }
       p0 ta = this.a;
       ta.x = p0;
       if (ta.E.d() != null) {
          this.a.E.d().O(this.a.q);
       }
       p0 ta1 = this.a;
       if (ta1.t == null) {
          j z = ta1.z;
          if (z != null && (z.vh() != null && this.a.z.vh().l != null)) {
             this.a.z.vh().l.setVisibility(8);
          }
       }
       return;
    }
    public void b(YodaBaseWebView p0,a p1){
       a.c(this, p0, p1);
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, p0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.q.j();
    }
}
