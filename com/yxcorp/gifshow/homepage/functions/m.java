package com.yxcorp.gifshow.homepage.functions.m;
import com.yxcorp.gifshow.webview.yoda.function.i$a;
import java.lang.Object;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import lsa.x;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lsa.v;
import com.kuaishou.webkit.WebView;
import vxc.z;

public final class m implements i$a	// class@0016e5
{
    public static final m a;

    static {
       m.a = new m();
    }
    public void m(){
       super();
    }
    public final void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       if (PatchProxy.isSupport(x.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, x.class, "5")) {
          label_002c :
             return;
          }
       }
       new v(p0).f(p3);
       goto label_002c ;
    }
}
