package com.kwai.live.gzone.bridge.function.d;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.kwai.live.gzone.bridge.function.d$a;
import com.kuaishou.webkit.WebView;
import vxc.z;

public class d extends c	// class@000c89
{

    public void d(){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uod, "1")) {
             return;
          }
       }
       d$a uoa = new d$a(this, p0, p0, p1, p2, p4);
       uod.f(p3);
       return;
    }
}
