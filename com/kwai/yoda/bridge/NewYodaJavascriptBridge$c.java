package com.kwai.yoda.bridge.NewYodaJavascriptBridge$c;
import erd.o;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import kotlin.jvm.internal.Ref$ObjectRef;
import ny7.c;
import rx7.a;
import java.lang.Object;
import ny7.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import kotlin.jvm.internal.a;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.util.Objects;
import android.os.SystemClock;
import java.lang.System;
import java.lang.Long;
import ay7.a;
import rx7.n;
import com.kwai.yoda.function.c;
import rx7.o;
import java.util.concurrent.Callable;
import rx7.p;
import com.kwai.yoda.kernel.container.YodaWebView;
import rx7.q;

public final class NewYodaJavascriptBridge$c implements o	// class@001177
{
    public final NewYodaJavascriptBridge b;
    public final Ref$ObjectRef c;
    public final c d;
    public final a e;

    public void NewYodaJavascriptBridge$c(NewYodaJavascriptBridge p0,Ref$ObjectRef p1,c p2,a p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewYodaJavascriptBridge$c.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.q(p0, "it");
          NewYodaJavascriptBridge$c tb = this.b;
          Ref$ObjectRef objectRef = this.c.element;
          NewYodaJavascriptBridge$c td = this.d;
          NewYodaJavascriptBridge$c te = this.e;
          Objects.requireNonNull(tb);
          obj = PatchProxy.applyFourRefs(objectRef, td, te, p0, tb, NewYodaJavascriptBridge.class, "3");
          if (obj != PatchProxyResult.class) {
          }else {
             Objects.requireNonNull(te);
             if (!PatchProxy.applyVoid(null, te, a.class, "1")) {
                te.d = SystemClock.elapsedRealtime();
                te.i = Long.valueOf(System.currentTimeMillis());
             }
             if (p0 instanceof a) {
                p0 = p0.l(objectRef, te.p).map(new n(tb));
                a.h(p0, "function.invokeObservabl¡­ionResult\(it\)\n          }");
             }else if(p0 instanceof c){
                p0 = t.fromCallable(new o(tb, te, p0, objectRef)).map(p.b);
                a.h(p0, "Observable.fromCallable ¡­unctionResult\(\)\n        }");
             }else {
                p0 = p0.f(objectRef, td).map(q.b);
                a.h(p0, "function.invokeObservabl¡­essResult\(it\)\n          }");
             }
             obj = p0;
          }
       }
       return obj;
    }
}
