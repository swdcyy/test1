package k59.b;
import f55.a;
import txc.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import p55.a;
import f55.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.webview.jsbridge.g;
import y55.a;
import com.kwai.bridge.context.AbsBridgeContext;
import yx.j0;

public final class b implements a	// class@002aca
{
    public final String a;
    public final b b;

    public void b(b p0){
       a.p(p0, "bridgeContext");
       super();
       this.b = p0;
       this.a = "AdH5Bridge";
    }
    public void a(a p0,String p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "1")) {
          return;
       }
       a.p(p0, "context");
       a.p(p1, "paramsStr");
       g og = this.b.a(g.class);
       if (og == null) {
          Object[] objArray = new Object[0];
          j0.c(this.a, "null KwaiAdJSBridge in bridgeContext", objArray);
          return;
       }else {
          og.callAdBridge(p1);
          return;
       }
    }
}
