package com.kwai.yoda.kernel.bridge.YodaWebBridge$callback$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.yoda.kernel.bridge.YodaWebBridge;
import ny7.c;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.ref.WeakReference;
import com.kwai.yoda.kernel.container.YodaWebView;
import nsd.r0;
import java.util.Arrays;
import kotlin.jvm.internal.a;

public final class YodaWebBridge$callback$2 extends Lambda implements a	// class@001286
{
    public final c $invokeContext;
    public final String $resultJson;
    public final YodaWebBridge this$0;

    public void YodaWebBridge$callback$2(YodaWebBridge p0,c p1,String p2){
       this.this$0 = p0;
       this.$invokeContext = p1;
       this.$resultJson = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, YodaWebBridge$callback$2.class, "1")) {
          return;
       }
       YodaWebView yodaWebView = this.this$0.k().get();
       if (yodaWebView != null) {
          Object[] objArray = new Object[]{this.$invokeContext.d,this.$resultJson};
          String str = String.format("typeof __yodaBridgeCallback__ === \'function\' && __yodaBridgeCallback__\(\'%s\', %s\)", Arrays.copyOf(objArray, 2));
          a.h(str, "java.lang.String.format\(format, *args\)");
          yodaWebView.evaluateJavascript(str);
       }
       return;
    }
}
