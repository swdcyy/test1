package com.kwai.yoda.kernel.bridge.YodaWebBridge$b;
import java.util.concurrent.Callable;
import com.kwai.yoda.kernel.bridge.YodaWebBridge;
import kotlin.jvm.internal.Ref$ObjectRef;
import ny7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ny7.a;
import java.lang.ref.WeakReference;
import com.kwai.yoda.kernel.container.YodaWebView;
import com.kwai.yoda.kernel.YodaV2;
import ny7.h;
import java.util.Map;
import com.kwai.yoda.kernel.YodaException;
import java.lang.StringBuilder;
import ny7.f;

public final class YodaWebBridge$b implements Callable	// class@001283
{
    public final YodaWebBridge b;
    public final Ref$ObjectRef c;
    public final c d;
    public final Ref$ObjectRef e;

    public void YodaWebBridge$b(YodaWebBridge p0,Ref$ObjectRef p1,c p2,Ref$ObjectRef p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object call(){
       Ref$ObjectRef objectRef = PatchProxy.apply(null, this, YodaWebBridge$b.class, "1");
       if (objectRef != PatchProxyResult.class) {
       }else {
          YodaWebBridge$b tc = this.c;
          YodaWebView yodaWebView = this.b.k().get();
          int i = 0x1e84a;
          if (yodaWebView != null) {
             tc.element = yodaWebView;
             YodaWebBridge$b td = this.d;
             char c = '.';
             if (!this.b.b(td.a, td.b)) {
                char c1 = '[';
                YodaException yodaExceptio = (!YodaV2.f.a().e().isEmpty())? new YodaException(i, c1+this.d.a+c+this.d.b+"]-["+this.b.j().e()+"] "+"Yoda bridge is not ready."): new YodaException(0x1e855, c1+this.d.a+c+this.d.b+"]-["+this.b.j().e()+"] security policy check url return false.");
                throw yodaExceptio;
             }else {
                this.e.element = this.b.d(this.d);
                objectRef = this.e.element;
                if (objectRef == null) {
                   throw new YodaException(0x1e84c, "$["+this.d.a+c+this.d.b+"] The function is not exist.");
                }
             }
          }else {
             throw new YodaException(i, "client status error: webview is null.");
          }
       }
       return objectRef;
    }
}
