package ax9.b;
import com.yxcorp.gifshow.webview.yoda.function.i$a;
import java.lang.Object;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import ax9.j;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ax9.g;
import com.kuaishou.webkit.WebView;
import vxc.z;

public final class b implements i$a	// class@0002e0
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       if (PatchProxy.isSupport(j.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, j.class, "2")) {
          label_002c :
             return;
          }
       }
       new g(p0).f(p3);
       goto label_002c ;
    }
}
