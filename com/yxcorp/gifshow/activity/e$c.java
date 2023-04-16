package com.yxcorp.gifshow.activity.e$c;
import com.kwai.yoda.function.c;
import com.yxcorp.gifshow.activity.e$a;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.yxcorp.gifshow.activity.e$c$a;
import com.kuaishou.webkit.WebView;
import vxc.z;

public class e$c extends c	// class@001346
{

    public void e$c(){
       super();
    }
    public void e$c(e$a p0){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       e$c uoc = e$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoc, "1")) {
             return;
          }
       }
       e$c$a uoc$a = new e$c$a(this, p0, p0, p1, p2, p4);
       uoc.f(p3);
       return;
    }
}
