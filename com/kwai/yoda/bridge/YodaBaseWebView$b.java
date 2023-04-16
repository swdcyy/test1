package com.kwai.yoda.bridge.YodaBaseWebView$b;
import java.lang.Runnable;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import com.kuaishou.webkit.ValueCallback;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import yz7.r;

public class YodaBaseWebView$b implements Runnable	// class@001180
{
    public final String b;
    public final ValueCallback c;
    public final YodaBaseWebView d;

    public void YodaBaseWebView$b(YodaBaseWebView p0,String p1,ValueCallback p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, YodaBaseWebView$b.class, "1")) {
          return;
       }
       YodaBaseWebView$b td = this.d;
       if (td.mDestroyed != null) {
          r.j(YodaBaseWebView$b.class.getSimpleName(), "webview destroyed, drop: "+this.b);
          return;
       }else {
          YodaBaseWebView.access$101(td, this.b, this.c);
          return;
       }
    }
}
