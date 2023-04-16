package com.yxcorp.gifshow.homepage.functions.j;
import com.yxcorp.gifshow.webview.yoda.function.i$a;
import java.lang.Object;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import lsa.x;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lsa.q;
import com.kuaishou.webkit.WebView;
import vxc.z;

public final class j implements i$a	// class@0016e2
{
    public static final j a;

    static {
       j.a = new j();
    }
    public void j(){
       super();
    }
    public final void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       if (PatchProxy.isSupport(x.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, x.class, "2")) {
          label_002c :
             return;
          }
       }
       new q(p0).f(p3);
       goto label_002c ;
    }
}
