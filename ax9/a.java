package ax9.a;
import com.yxcorp.gifshow.webview.yoda.function.i$a;
import java.lang.Object;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import ax9.j;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ax9.e;
import com.kuaishou.webkit.WebView;
import vxc.z;

public final class a implements i$a	// class@0002df
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       if (PatchProxy.isSupport(j.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, j.class, "1")) {
          label_002c :
             return;
          }
       }
       new e(p0).f(p3);
       goto label_002c ;
    }
}
