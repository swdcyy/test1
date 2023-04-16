package com.yxcorp.gifshow.ad.webview.o$c;
import erd.g;
import com.yxcorp.gifshow.ad.webview.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;

public class o$c implements g	// class@001911
{
    public final o b;

    public void o$c(o p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$c.class, "1")) {
       }else {
          j0.b("AdYodaController", "exception in life cycle.", p0);
       }
       return;
    }
}
