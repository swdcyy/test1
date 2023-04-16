package com.kwai.yoda.bridge.NewYodaJavascriptBridge$a;
import java.lang.Runnable;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.ref.WeakReference;
import com.kwai.yoda.kernel.bridge.YodaWebBridge;
import com.kwai.yoda.bridge.YodaBaseWebView;
import yz7.k;

public final class NewYodaJavascriptBridge$a implements Runnable	// class@001175
{
    public final NewYodaJavascriptBridge b;
    public final String c;
    public final String d;

    public void NewYodaJavascriptBridge$a(NewYodaJavascriptBridge p0,String p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, NewYodaJavascriptBridge$a.class, "1")) {
          return;
       }
       YodaBaseWebView yodaBaseWebV = this.b.k().get();
       if (yodaBaseWebV != null) {
          NewYodaJavascriptBridge$a tc = this.c;
          if (tc != null) {
             Object[] objArray = new Object[]{this.d,tc};
             yodaBaseWebV.evaluateJavascript(k.a("typeof __yodaBridgeCallback__ === \'function\' && __yodaBridgeCallback__\(\'%s\', %s\)", objArray));
          }
       }
       return;
    }
}
