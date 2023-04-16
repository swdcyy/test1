package com.kwai.yoda.kernel.bridge.YodaWebBridge;
import com.kwai.yoda.kernel.bridge.YodaWebBridge$a;
import nsd.u;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.yoda.kernel.container.YodaWebView;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import com.kwai.yoda.kernel.bridge.YodaWebBridge$mBridgeGuard$2;
import msd.a;
import qrd.p;
import qrd.s;
import ny7.c;
import ny7.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.kernel.helper.GsonHelper;
import com.kwai.yoda.kernel.helper.GsonHelper$a;
import com.kwai.yoda.kernel.bridge.YodaWebBridge$callback$1;
import tb7.b;
import com.kwai.yoda.kernel.bridge.YodaWebBridge$callback$2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import ny7.f;
import java.util.Objects;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import ny7.d;
import ny7.a;
import java.util.Map;
import trd.d1;
import com.kwai.yoda.kernel.YodaV2;
import ny7.h;
import java.util.concurrent.ConcurrentHashMap;
import sy7.b;
import java.lang.StringBuilder;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kwai.yoda.kernel.bridge.YodaWebBridge$b;
import java.util.concurrent.Callable;
import brd.t;
import com.kwai.yoda.kernel.bridge.YodaWebBridge$c;
import erd.o;
import com.kwai.yoda.kernel.bridge.YodaWebBridge$d;
import com.kwai.yoda.kernel.bridge.YodaWebBridge$e;
import erd.g;
import crd.b;
import java.util.HashSet;
import java.util.Collection;
import vy7.a;
import vy7.a$a;
import uy7.a;

public class YodaWebBridge	// class@00128a
{
    public final WeakReference a;
    public final Map b;
    public final p c;
    public String d;
    public HashSet e;
    public static final Pattern f;
    public static final YodaWebBridge$a g;

    static {
       YodaWebBridge.g = new YodaWebBridge$a(null);
       Pattern pattern = Pattern.compile("^[\\w-]+$");
       a.h(pattern, "Pattern.compile\(\"^[\\\\w-]+$\"\)");
       YodaWebBridge.f = pattern;
    }
    public void YodaWebBridge(YodaWebView p0){
       a.q(p0, "webView");
       super();
       this.a = new WeakReference(p0);
       this.b = new LinkedHashMap();
       this.c = s.c(new YodaWebBridge$mBridgeGuard$2(this));
    }
    public void a(YodaWebView p0,c p1,e p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, YodaWebBridge.class, "5")) {
          return;
       }
       a.q(p1, "invokeContext");
       a.q(p2, "result");
       String str = GsonHelper.b.a(p2);
       if (p1.e != null) {
          b.j(new YodaWebBridge$callback$1(this, p1, str));
       }else {
          b.j(new YodaWebBridge$callback$2(this, p1, str));
       }
       return;
    }
    public boolean b(String p0,String p1){
       int b1;
       Iterator iterator;
       Object obj2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, YodaWebBridge.class, "19");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       int i = (p0 == null || !p0.length())? 1: 0;
       if (!i) {
          f uof = (p1 == null || !p1.length())? 1: null;
          if (!uof) {
             if (this.j().j()) {
                return true;
             }else {
                uof = this.j();
                Objects.requireNonNull(uof);
                Object obj1 = PatchProxy.applyTwoRefs(p0, p1, uof, f.class, "4");
                int i1 = 0;
                if (obj1 != patchProxyRe) {
                   b1 = obj1.booleanValue();
                }else {
                   a.q(p0, "namespace");
                   a.q(p1, "command");
                   b1 = (!p0.length())? 1: 0;
                   if (!b1) {
                      Set set = (!p1.length())? 1: null;
                      if (!set) {
                         iterator = uof.f().iterator();
                         while (true) {
                            if (iterator.hasNext()) {
                               obj2 = iterator.next();
                               obj1 = obj2;
                               obj1 = (a.g(obj1.namespace, p0) && a.g(obj1.command, p1))? 1: null;
                               if (!obj1) {
                                  continue ;
                               }
                            }else {
                               obj2 = i1;
                            }
                            if (obj2 != null) {
                               b1 = true;
                            }
                         }
                      }
                   }
                label_00a8 :
                   b1 = false;
                }
                if (b1) {
                   return true;
                }else {
                   YodaWebBridge te = this.e;
                   if (te != null) {
                      if (te != null) {
                         iterator = te.iterator();
                         while (iterator.hasNext()) {
                            obj2 = iterator.next();
                            obj1 = obj2;
                            obj1 = (a.g(obj1.namespace, p0) && a.g(obj1.command, p1))? 1: null;
                            if (obj1) {
                               i1 = obj2;
                            }else {
                               continue ;
                            }
                         }
                      }
                      if (i1 != null) {
                         b = true;
                      }
                      return b;
                   }else {
                      return this.j().i(p0, p1);
                   }
                }
             }
          }
       }
       return b;
    }
    public a c(String p0,String p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, YodaWebBridge.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h(this.l(), p0, p1);
       if (obj == null) {
          obj = this.h(this.i(), p0, p1);
       }
       if (obj == null) {
          obj = this.h(this.g(), p0, p1);
       }
       return obj;
    }
    public final a d(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, YodaWebBridge.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "invokeContext");
       return this.c(p0.a, p0.b);
    }
    public final Set e(){
       YodaWebBridge obj = PatchProxy.apply(null, this, YodaWebBridge.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e == null) {
          this.n();
       }
       obj = this.e;
       if (obj == null) {
          Set set = d1.k();
       }
       return obj;
    }
    public f f(){
       Object obj = PatchProxy.apply(null, this, YodaWebBridge.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f();
    }
    public Map g(){
       Object obj = PatchProxy.apply(null, this, YodaWebBridge.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return YodaV2.f.a().d();
    }
    public final a h(Map p0,String p1,String p2){
       a this;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, YodaWebBridge.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = 0;
       int i = (p0 == null || p0.isEmpty())? 1: 0;
       this = null;
       if (!i) {
          i = (p1 == null || !p1.length())? 1: 0;
          if (!i) {
             if (p2 == null || !p2.length()) {
                obj = 1;
             }
             if (!obj) {
                p0 = p0.get(p1);
                if (p0 != null) {
                   this = p0.get(p2);
                }
             }
          }
       }
    label_004d :
       return this;
    }
    public Map i(){
       return this.b;
    }
    public final void invoke(String p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, YodaWebBridge.class, "3")) {
          return;
       }
       this.m(new c(p0, p1, p2, p3));
       return;
    }
    public final void invokeCallback(String p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, YodaWebBridge.class, "2")) {
          return;
       }
       c uoc = new c(p0, p1, p2, p3);
       uoc.e = true;
       this.m(uoc);
       return;
    }
    public final f j(){
       Object obj = PatchProxy.apply(null, this, YodaWebBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final WeakReference k(){
       return this.a;
    }
    public Map l(){
       Object obj = PatchProxy.apply(null, this, YodaWebBridge.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return YodaV2.f.a().i();
    }
    public void m(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaWebBridge.class, "4")) {
          return;
       }
       a.q(p0, "invokeContext");
       b b = b.b;
       b.g("Start invoke yoda bridge "+p0);
       c d = p0.d;
       Pattern pattern = (d == null || !d.length())? 1: null;
       if (!pattern && !YodaWebBridge.f.matcher(d).find()) {
          b.g("Callback Id check fail: "+p0);
          return;
       }else {
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          objectRef.element = null;
          Ref$ObjectRef objectRef1 = new Ref$ObjectRef();
          objectRef1.element = null;
          b uob = t.fromCallable(new YodaWebBridge$b(this, objectRef, p0, objectRef1)).flatMap(new YodaWebBridge$c(objectRef, p0)).subscribe(new YodaWebBridge$d(this, objectRef1, p0, objectRef), new YodaWebBridge$e(this, objectRef1, p0, objectRef));
          objectRef = objectRef.element;
          if (objectRef != null) {
             a.h(uob, "disposable");
             objectRef.compositeWith(uob);
          }
          return;
       }
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, YodaWebBridge.class, "18")) {
          return;
       }
       b.b.g("yoda start to init api list info");
       HashSet hashSet = new HashSet();
       hashSet.addAll(this.j().d(this.b));
       if (a.a.a()) {
          HashSet hashSet1 = new HashSet();
          Iterator iterator = hashSet.iterator();
          while (iterator.hasNext()) {
             d uod = iterator.next();
             if (this.j().i("Kwai", uod.command)) {
                hashSet1.add(new d("Kwai", uod.command));
             }
          }
          hashSet.addAll(hashSet1);
       }
       this.e = hashSet;
       b.b.g("yoda end to init api list info");
       return;
    }
    public final void o(String p0,String p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, YodaWebBridge.class, "6")) {
          return;
       }
       a.q(p2, "function");
       YodaV2 yodaV2 = 1;
       int i = (p0 == null || !p0.length())? 1: 0;
       if (!i) {
          if (p1 != null && p1.length()) {
             yodaV2 = null;
          }
          if (!yodaV2) {
             if (YodaV2.f.a().l(p0, p1)) {
                return;
             }else {
                Map map = this.b.get(p0);
                if (map == null) {
                   map = new LinkedHashMap();
                }
                map.put(p1, p2);
                this.b.put(p0, map);
                if (this.j().i(p0, p1)) {
                   YodaWebBridge te = this.e;
                   if (te != null) {
                      te.add(new d(p0, p1));
                   }
                }
             }
          }
       }
    label_006b :
       return;
    }
    public final void p(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaWebBridge.class, "8")) {
          return;
       }
       a.q(p0, "url");
       this.d = p0;
       this.j().c(p0);
       this.e = null;
       this.n();
       return;
    }
}
