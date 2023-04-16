package com.kwai.yoda.kernel.container.YodaWebView$evaluateJavascript$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.yoda.kernel.container.YodaWebView;
import java.lang.String;
import com.kuaishou.webkit.ValueCallback;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sy7.b;
import java.lang.StringBuilder;

public final class YodaWebView$evaluateJavascript$2 extends Lambda implements a	// class@00128e
{
    public final ValueCallback $resultCallback;
    public final String $script;
    public final YodaWebView this$0;

    public void YodaWebView$evaluateJavascript$2(YodaWebView p0,String p1,ValueCallback p2){
       this.this$0 = p0;
       this.$script = p1;
       this.$resultCallback = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, YodaWebView$evaluateJavascript$2.class, "1")) {
          return;
       }
       if (!this.this$0.isActive()) {
          b.b.k("evaluate js with inactive webview, drop: "+this.$script);
          return;
       }else {
          YodaWebView.access$evaluateJavascript$s-1567828378(this.this$0, this.$script, this.$resultCallback);
          return;
       }
    }
}
