package k59.x;
import msd.a;
import com.yxcorp.gifshow.ad.webview.f;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import com.kuaishou.webkit.WebView;
import qrd.l1;

public final class x implements a	// class@002b34
{
    public final f b;

    public void x(f p0){
       this.b = p0;
    }
    public final Object invoke(){
       x tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, f.class, "12")) {
       }else {
          Object[] objArray = new Object[0];
          j0.f("AdLandingPageFragment", "webView reload", objArray);
          tb.S8(tb.t);
          tb.t.reload();
       }
       return l1.a;
    }
}
