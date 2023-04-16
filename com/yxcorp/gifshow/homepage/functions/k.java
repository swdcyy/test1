package com.yxcorp.gifshow.homepage.functions.k;
import com.yxcorp.gifshow.webview.yoda.function.i$a;
import java.lang.Object;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import lsa.x;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lsa.s;
import com.kuaishou.webkit.WebView;
import vxc.z;

public final class k implements i$a	// class@0016e3
{
    public static final k a;

    static {
       k.a = new k();
    }
    public void k(){
       super();
    }
    public final void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       if (PatchProxy.isSupport(x.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, x.class, "3")) {
          label_002c :
             return;
          }
       }
       new s(p0).f(p3);
       goto label_002c ;
    }
}
