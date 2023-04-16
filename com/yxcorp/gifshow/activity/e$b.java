package com.yxcorp.gifshow.activity.e$b;
import com.kwai.yoda.function.c;
import com.yxcorp.gifshow.activity.e$a;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.yxcorp.gifshow.activity.e$b$a;
import com.kuaishou.webkit.WebView;
import vxc.z;

public class e$b extends c	// class@001344
{

    public void e$b(){
       super();
    }
    public void e$b(e$a p0){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
             return;
          }
       }
       e$b$a uob$a = new e$b$a(this, p0, p0, p1, p2, p4);
       uob.f(p3);
       return;
    }
}
