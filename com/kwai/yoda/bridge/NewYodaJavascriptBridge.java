package com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import com.kwai.yoda.kernel.bridge.YodaWebBridge;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.yoda.kernel.container.YodaWebView;
import com.kwai.yoda.bridge.InvokeContextCompatHelper;
import java.util.LinkedHashSet;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge$mBCFirstList$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge$mAllPass$2;
import ny7.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import java.util.Map;
import java.lang.Boolean;
import gy7.n;
import java.util.Objects;
import com.kwai.middleware.azeroth.Azeroth2;
import o97.a;
import o97.a$a;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import ny7.d;
import ny7.f;
import rx7.k;
import java.lang.ref.WeakReference;
import java.lang.Integer;
import sy7.b;
import java.lang.StringBuilder;
import com.kwai.yoda.bridge.c;
import ny7.c;
import rx7.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Set;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge$b;
import java.util.concurrent.Callable;
import brd.t;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge$c;
import erd.o;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge$d;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge$e;
import erd.g;
import crd.b;
import rx7.m;
import java.lang.Runnable;
import yb7.p;
import rx7.l;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge$a;
import com.kwai.yoda.Yoda;
import com.kwai.yoda.bridge.YodaBridgeHandler;
import java.util.concurrent.CopyOnWriteArrayList;
import rx7.c;
import ny7.e;
import com.kwai.yoda.kernel.helper.GsonHelper;
import com.kwai.yoda.kernel.helper.GsonHelper$a;
import ty7.c;
import ty7.g;
import ty7.e;
import ty7.d;
import nz7.e;
import sz7.l;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Number;
import java.util.concurrent.atomic.AtomicLong;

public class NewYodaJavascriptBridge extends YodaWebBridge	// class@00117c
{
    public final InvokeContextCompatHelper h;
    public final Set i;
    public final p j;
    public final p k;

    public void NewYodaJavascriptBridge(YodaBaseWebView p0){
       a.q(p0, "webView");
       super(p0);
       this.h = new InvokeContextCompatHelper();
       this.i = new LinkedHashSet();
       this.j = s.c(NewYodaJavascriptBridge$mBCFirstList$2.INSTANCE);
       this.k = s.c(new NewYodaJavascriptBridge$mAllPass$2(this));
    }
    public a c(String p0,String p1){
       a uoa2;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NewYodaJavascriptBridge newYodaJavas = NewYodaJavascriptBridge.class;
       String str = "11";
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, newYodaJavas, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       boolean b = false;
       int i = (p0 == null || !p0.length())? 1: 0;
       a uoa = null;
       if (!i) {
          Map map = (p1 == null || !p1.length())? 1: null;
          if (!map) {
             a uoa1 = this.h(this.l(), p0, p1);
             if (uoa1 == null) {
                uoa1 = this.h(this.i(), p0, p1);
             }
             if (uoa1 == null) {
                n obj1 = PatchProxy.applyTwoRefs(p0, p1, this, newYodaJavas, "14");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else {
                   obj1 = n.e;
                   Objects.requireNonNull(obj1);
                   List obj2 = PatchProxy.apply(uoa, obj1, n.class, str);
                   if (obj2 != patchProxyRe) {
                      b1 = obj2.booleanValue();
                   }else {
                      a uoa4 = Azeroth2.B.q();
                      b1 = (uoa4 != null)? a$a.b(uoa4, null, "enable_bridge_center_first", false, 1, null): false;
                   }
                   if (b1) {
                      obj2 = this.u();
                      str = (obj2 == null || obj2.isEmpty())? 1: null;
                      if (!str) {
                         Boolean uBoolean = PatchProxy.apply(uoa, this, newYodaJavas, "13");
                         if (uBoolean == patchProxyRe) {
                            uBoolean = this.k.getValue();
                         }
                         if (!uBoolean.booleanValue()) {
                            Iterator iterator = this.u().iterator();
                            while (true) {
                               if (iterator.hasNext()) {
                                  uoa2 = iterator.next();
                                  Object obj3 = uoa2;
                                  obj3 = (a.g(obj3.namespace, p0) && a.g(obj3.command, p1))? 1: null;
                                  if (!obj3) {
                                     continue ;
                                  }
                               }else {
                                  uoa2 = uoa;
                               }
                               if (uoa2 == null) {
                               label_00d9 :
                                  String str1 = "bridgecenter";
                                  if (b) {
                                     uoa2 = this.s(p0, p1);
                                     if (uoa2 != null) {
                                        uoa2.i(str1);
                                        uoa1 = uoa2;
                                        break ;
                                     }else {
                                        uoa1 = this.h(this.g(), p0, p1);
                                        break ;
                                     }
                                  }else {
                                     uoa2 = this.h(this.g(), p0, p1);
                                     if (uoa2 != null) {
                                        uoa = uoa2;
                                     }else {
                                        a uoa3 = this.s(p0, p1);
                                        if (uoa3 != null) {
                                           uoa3.i(str1);
                                           uoa = uoa3;
                                        }
                                     }
                                     uoa1 = uoa;
                                     break ;
                                  }
                               }
                            }
                         }
                         b = true;
                         goto label_00d9 ;
                      }
                   }
                }
             }
             return uoa1;
          }
       }
       return uoa;
    }
    public f f(){
       Object obj = PatchProxy.apply(null, this, NewYodaJavascriptBridge.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new k(this.k());
    }
    public final void fpsUpdate(int p0){
       NewYodaJavascriptBridge newYodaJavas = NewYodaJavascriptBridge.class;
       if (PatchProxy.isSupport(newYodaJavas) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, newYodaJavas, "1")) {
          return;
       }
       YodaBaseWebView yodaBaseWebV = this.k().get();
       if (yodaBaseWebV != null) {
          b.b.a("js update fps from bridge: "+p0);
          yodaBaseWebV.getLoadEventLogger().h = p0;
       }
       return;
    }
    public void m(c p0){
       c a;
       NewYodaJavascriptBridge newYodaJavas = NewYodaJavascriptBridge.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, newYodaJavas, "2")) {
          return;
       }
       a.q(p0, "invokeContext");
       b b = b.b;
       b.g("Start invoke yoda bridge "+p0);
       a uoa = PatchProxy.applyOneRefs(p0, this, newYodaJavas, "5");
       if (uoa != PatchProxyResult.class) {
       }else {
          a = p0.a;
          String str = "";
          if (a == null) {
             a = str;
          }
          c b1 = p0.b;
          if (b1 == null) {
             b1 = str;
          }
          c c = p0.c;
          if (c != null) {
             str = c;
          }
          uoa = new a(a, b1, str, p0.d);
          uoa.b = p0.e;
       }
       a q = uoa.q;
       YodaWebBridge$a uoa1 = (q == null || !q.length())? 1: null;
       if (!uoa1) {
          Objects.requireNonNull(YodaWebBridge.g);
          if (!YodaWebBridge.f.matcher(q).find()) {
             b.g("Callback Id check fail: "+p0);
             return;
          }
       }
       if (uoa.b != null) {
          this.i.add(uoa.q);
       }
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       objectRef.element = null;
       Ref$ObjectRef objectRef1 = new Ref$ObjectRef();
       objectRef1.element = null;
       NewYodaJavascriptBridge newYodaJavas1 = this;
       NewYodaJavascriptBridge$b uob = new NewYodaJavascriptBridge$b(newYodaJavas1, objectRef, p0, objectRef1, uoa);
       Ref$ObjectRef objectRef2 = objectRef1;
       Object obj = uoa;
       Ref$ObjectRef objectRef3 = objectRef;
       c uoc = p0;
       NewYodaJavascriptBridge$d uod = new NewYodaJavascriptBridge$d(newYodaJavas1, objectRef2, obj, objectRef3, uoc);
       NewYodaJavascriptBridge$e uoe = new NewYodaJavascriptBridge$e(newYodaJavas1, objectRef2, obj, objectRef3, uoc);
       b uob1 = t.fromCallable(q).flatMap(new NewYodaJavascriptBridge$c(this, objectRef, p0, uoa)).subscribe(v10, v11);
       Ref$ObjectRef element = objectRef.element;
       if (element != null) {
          element.compositeWith(uob1);
       }
       return;
    }
    public void q(String p0,String p1,a p2){
       YodaBaseWebView yodaBaseWebV;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, NewYodaJavascriptBridge.class, "8")) {
          return;
       }
       a.q(p1, "json");
       if (p2 != null) {
          p2.c();
       }
       if (this.i.contains(p0)) {
          if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, NewYodaJavascriptBridge.class, "10")) {
             yodaBaseWebV = this.k().get();
             if (yodaBaseWebV != null) {
                p.d(new m(yodaBaseWebV, p0, p1, p2));
             }
          }
       }else if(PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, NewYodaJavascriptBridge.class, "9")){
          yodaBaseWebV = this.k().get();
          if (yodaBaseWebV != null) {
             p.d(new l(yodaBaseWebV, p0, p1, p2));
          }
       }
       return;
    }
    public void r(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NewYodaJavascriptBridge.class, "7")) {
          return;
       }
       p.d(new NewYodaJavascriptBridge$a(this, p1, p0));
       return;
    }
    public final a s(String p0,String p1){
       Yoda obj = PatchProxy.applyTwoRefs(p0, p1, this, NewYodaJavascriptBridge.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Yoda.get();
       a.h(obj, "Yoda.get\(\)");
       YodaBridgeHandler yodaBridgeHa = obj.getYodaBridgeHandler();
       if (yodaBridgeHa != null) {
          YodaBaseWebView yodaBaseWebV = this.k().get();
          if (yodaBaseWebV != null) {
             a.h(yodaBaseWebV, "mWebViewRef.get\(\) ?: return null");
             Iterator iterator = yodaBridgeHa.c().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   a uoa = iterator.next().b(yodaBaseWebV, p0, p1);
                   if (uoa != null) {
                      return uoa;
                   }
                   continue ;
                }else {
                   b.b.c("Yoda try to find function from BC fail ["+p0+'.'+p1+"].");
                   break ;
                }
             }
          }
       }
       return null;
    }
    public InvokeContextCompatHelper t(){
       return this.h;
    }
    public final List u(){
       Object obj = PatchProxy.apply(null, this, NewYodaJavascriptBridge.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public final void v(YodaBaseWebView p0,c p1,a p2,e p3){
       long l;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, NewYodaJavascriptBridge.class, "6")) {
          return;
       }
       String str = GsonHelper.b.a(p3);
       this.q(p2.q, str, p2);
       if (p0 != null) {
          p2.d();
          c debugKit = p0.getDebugKit();
          int i = 1;
          if (debugKit != null) {
             g og = (p3.a == i)? new g(p1, str): new e(p1, str);
             debugKit.a(og);
          }
          this.h.c(p2);
          p0.getSessionLogger().t(p2, Integer.valueOf(p3.a), p3.b, null);
          l sessionPageI = p0.getSessionPageInfoModule();
          if (p3.a != i) {
             sessionPageI.bridgeErrorCount.incrementAndGet();
          }
          sessionPageI = sessionPageI.bridgeCost;
          p1 = PatchProxy.apply(null, p2, a.class, "9");
          if (p1 != PatchProxyResult.class) {
             l = p1.longValue();
          }else {
             a c = p2.c;
             a f = p2.f;
             l = (c <= 0 || f <= 0)? -1: f - c;
          }
          sessionPageI.addAndGet(l);
       }
       return;
    }
}
