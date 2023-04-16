package k59.g2;
import syc.e;
import com.yxcorp.gifshow.ad.webview.YodaNestedScrollWebView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import ny7.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import syc.c;
import k59.f2;
import java.lang.ref.WeakReference;

public final class g2 extends e	// class@002adf
{

    public void g2(YodaNestedScrollWebView p0){
       a.p(p0, "webView");
       super(p0);
    }
    public f f(){
       f2 uof2 = PatchProxy.apply(null, this, g2.class, "1");
       if (uof2 != PatchProxyResult.class) {
       }else {
          uof2 = new f2(this, new WeakReference(this.l));
       }
       return uof2;
    }
}
