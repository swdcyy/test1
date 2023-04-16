package com.kwai.yoda.bridge.NewYodaJavascriptBridge$b;
import java.util.concurrent.Callable;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import kotlin.jvm.internal.Ref$ObjectRef;
import ny7.c;
import rx7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ny7.a;
import java.lang.ref.WeakReference;
import com.kwai.yoda.kernel.bridge.YodaWebBridge;
import com.kwai.yoda.bridge.YodaBaseWebView;
import ty7.c;
import ty7.f;
import ty7.d;
import java.lang.Boolean;
import com.kwai.yoda.kernel.YodaV2;
import ny7.h;
import java.util.Map;
import com.kwai.yoda.bridge.YodaException;
import java.lang.StringBuilder;
import ny7.f;
import com.kwai.middleware.azeroth.Azeroth2;
import i97.a;
import java.lang.Throwable;

public final class NewYodaJavascriptBridge$b implements Callable	// class@001176
{
    public final NewYodaJavascriptBridge b;
    public final Ref$ObjectRef c;
    public final c d;
    public final Ref$ObjectRef e;
    public final a f;

    public void NewYodaJavascriptBridge$b(NewYodaJavascriptBridge p0,Ref$ObjectRef p1,c p2,Ref$ObjectRef p3,a p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public Object call(){
       NewYodaJavascriptBridge$b td;
       YodaException yodaExceptio;
       Object[] objArray = null;
       Ref$ObjectRef objectRef = PatchProxy.apply(objArray, this, NewYodaJavascriptBridge$b.class, "1");
       if (objectRef != PatchProxyResult.class) {
       }else {
          NewYodaJavascriptBridge$b tc = this.c;
          YodaBaseWebView yodaBaseWebV = this.b.k().get();
          int i = 0x1e84a;
          if (yodaBaseWebV != null) {
             tc.element = yodaBaseWebV;
             objectRef = this.c.element;
             if (objectRef != null) {
                c debugKit = objectRef.getDebugKit();
                if (debugKit != null) {
                   td = this.d;
                   debugKit.a(new f(td.a, td.b, td.c, td.d));
                }
             }
             tc = this.e;
             a uoa = this.b.d(this.d);
             if (uoa != null) {
                this.f.m = uoa.a;
             }else {
                uoa = objArray;
             }
             tc.element = uoa;
             objectRef = this.e.element;
             char c = '.';
             if (objectRef != null) {
                td = this.f;
                Boolean uBoolean = (objectRef != null)? Boolean.valueOf(objectRef.h()): objArray;
                td.g = uBoolean;
                td = this.f;
                if (!this.b.b(td.n, td.o)) {
                   char c1 = '[';
                   if (!(YodaV2.f.a().e().isEmpty() ^ 0x01)) {
                      yodaExceptio = new YodaException(i, c1+this.f.n+c+this.f.o+"] - Yoda bridge is not ready.");
                   }else {
                      String str = "]-[";
                      StringBuilder str1 = c1+this.f.n+c+this.f.o+str+this.b.j().e()+"] "+"security policy check url return false. [";
                      Ref$ObjectRef element = this.c.element;
                      YodaBaseWebView pageUrlInfo = (element != null)? element.pageUrlInfo: objArray;
                      str1 = str1+pageUrlInfo+str;
                      Ref$ObjectRef element1 = this.c.element;
                      if (element1 != null) {
                         objArray = element1.loadUrlInfo;
                      }
                      yodaExceptio = new YodaException(0x1e855, str1+objArray+']');
                   }
                   a uoa1 = Azeroth2.B.g();
                   if (uoa1 != null) {
                      uoa1.b(yodaExceptio);
                   }
                   throw yodaExceptio;
                }else {
                   objectRef = this.e.element;
                }
             }else {
                throw new YodaException(0x1e84c, "$["+this.d.a+c+this.d.b+"] The function is not exist.");
             }
          }else {
             throw new YodaException(i, "client status error: webview is null.");
          }
       }
       return objectRef;
    }
}
