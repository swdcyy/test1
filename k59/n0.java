package k59.n0;
import msd.a;
import com.yxcorp.gifshow.ad.webview.j;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.ad.webview.o;
import qrd.l1;

public final class n0 implements a	// class@002af9
{
    public final j b;

    public void n0(j p0){
       this.b = p0;
    }
    public final Object invoke(){
       n0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, j.class, "9")) {
       }else {
          Object[] objArray = new Object[0];
          j0.f("AdLandingPageFragmentV2", "webView reload", objArray);
          j e = tb.E;
          if (e != null) {
             e.i(tb.z, tb.x);
          }
          tb.x.reload();
       }
       return l1.a;
    }
}
