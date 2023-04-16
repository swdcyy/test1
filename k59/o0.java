package k59.o0;
import msd.a;
import com.yxcorp.gifshow.ad.webview.j;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import com.yxcorp.gifshow.ad.webview.o;
import qrd.l1;

public final class o0 implements a	// class@002afd
{
    public final j b;

    public void o0(j p0){
       this.b = p0;
    }
    public final Object invoke(){
       o0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, j.class, "10")) {
       }else {
          Object[] objArray = new Object[0];
          j0.f("AdLandingPageFragmentV2", "webView nonReload only show", objArray);
          if (tb.D == null) {
             j e = tb.E;
             if (e != null) {
                e.h();
             }
          }
       }
       return l1.a;
    }
}
