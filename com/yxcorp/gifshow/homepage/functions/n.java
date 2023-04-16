package com.yxcorp.gifshow.homepage.functions.n;
import com.yxcorp.gifshow.webview.yoda.function.i$a;
import java.lang.Object;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import lsa.x;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lsa.w;
import com.kuaishou.webkit.WebView;
import vxc.z;

public final class n implements i$a	// class@0016e6
{
    public static final n a;

    static {
       n.a = new n();
    }
    public void n(){
       super();
    }
    public final void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       if (PatchProxy.isSupport(x.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, x.class, "6")) {
          label_002c :
             return;
          }
       }
       new w(p0).f(p3);
       goto label_002c ;
    }
}
