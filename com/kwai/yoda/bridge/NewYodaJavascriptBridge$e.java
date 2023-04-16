package com.kwai.yoda.bridge.NewYodaJavascriptBridge$e;
import erd.g;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import kotlin.jvm.internal.Ref$ObjectRef;
import rx7.a;
import ny7.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sy7.b;
import java.lang.StringBuilder;
import ny7.a;
import com.kwai.yoda.kernel.YodaException;
import ny7.e;
import ny7.e$a;
import com.kwai.yoda.bridge.YodaException;
import java.util.concurrent.TimeoutException;
import com.kwai.yoda.bridge.YodaBaseWebView;

public final class NewYodaJavascriptBridge$e implements g	// class@001179
{
    public final NewYodaJavascriptBridge b;
    public final Ref$ObjectRef c;
    public final a d;
    public final Ref$ObjectRef e;
    public final c f;

    public void NewYodaJavascriptBridge$e(NewYodaJavascriptBridge p0,Ref$ObjectRef p1,a p2,Ref$ObjectRef p3,c p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewYodaJavascriptBridge$e.class, "1")) {
       }else {
          b.b.e(this.c.element+' '+this.d.q+" execute error", p0);
          this.d.e();
          if (p0 instanceof YodaException) {
             p0 = e.d.a(p0.getResultCode(), p0.getMessage());
          }else if(p0 instanceof YodaException){
             p0 = e.d.a(p0.getResult(), p0.getMessage());
          }else if(p0 instanceof TimeoutException){
             p0 = e.d.a(0x1e852, p0.getMessage());
          }else {
             p0 = e.d.a(0x1e84a, p0.getMessage());
          }
          this.b.v(this.e.element, this.f, this.d, p0);
       }
       return;
    }
}
