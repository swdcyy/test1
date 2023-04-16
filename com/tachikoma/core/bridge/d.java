package com.tachikoma.core.bridge.d;
import vo8.a;
import gx4.e;
import android.content.Context;
import com.tachikoma.core.bridge.a$b;
import android.view.ViewGroup;
import aq8.g;
import java.lang.String;
import java.lang.Object;
import com.tachikoma.core.bridge.d$a;
import no8.a;
import java.lang.Boolean;
import java.lang.System;
import android.app.Activity;
import java.lang.ref.WeakReference;
import com.tachikoma.core.bridge.d$b;
import com.tachikoma.core.bridge.c;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.tkruntime.v8.V8Trace;
import com.tkruntime.v8.V8Object;
import gx4.c;
import com.kwai.robust.PatchProxyResult;
import com.tkruntime.v8.V8ObjectProxy;
import cq8.b;
import qp8.d;
import java.lang.Throwable;
import wp8.a;
import gx4.f$a;
import gx4.f;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import no8.e;
import tx4.w;
import com.tachikoma.core.component.e;
import com.tachikoma.core.component.TKBaseNativeModule;
import android.view.View;
import com.tkruntime.v8.V8;
import aq8.j;
import com.tkruntime.v8.JavaCallback;
import com.tkruntime.v8.V8$BindingObjectCreator;
import iq8.r;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.JsValueRef;
import tx4.y;
import java.util.Set;
import zp8.a;
import op8.a;
import qo8.f;

public class d implements a, e	// class@000d46
{
    public c a;
    public WeakReference b;
    public g c;
    public WeakReference d;
    public String e;
    public JsValueRef f;
    public boolean g;
    public boolean h;
    public long i;
    public boolean j;
    public Map k;
    public int l;
    public String m;
    public w n;
    public t o;
    public c p;
    public d$b q;
    public final V8$BindingObjectCreator r;

    public void d(Context p0,boolean p1,a$b p2,ViewGroup p3,g p4,String p5){
       super();
       this.a = null;
       this.b = null;
       this.d = null;
       this.e = "";
       this.h = false;
       long l = 0;
       this.i = l;
       this.j = false;
       this.l = 0;
       this.r = new d$a(this);
       Boolean c = a.c;
       if (c.booleanValue()) {
          l = System.currentTimeMillis();
       }
       if (p0 instanceof Activity) {
          this.b = new WeakReference(p0);
       }
       if (p3 != null) {
          this.d = new WeakReference(p3);
       }
       this.q = new d$b();
       this.c = p4;
       if (p1) {
          c uoc = p2.d();
          if (uoc != null && !uoc.f().a - p2.a) {
             this.a = uoc;
          }
       }
       d ta = this.a;
       if (ta == null) {
          this.j = false;
          this.a = c.c(p1, p2, p5);
       }else {
          this.j = true;
          ta.m(p5);
       }
       ta = this.a;
       int i = this.hashCode();
       Objects.requireNonNull(ta);
       c uoc1 = c.class;
       if (!PatchProxy.isSupport(uoc1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), ta, uoc1, "4")) {
          ta.b();
          ta.b = i;
          ta.c = i+"_"+System.currentTimeMillis();
       }
       if (c.booleanValue()) {
          V8Trace.traceLog("TKJSContext", "useSharedIsolate = "+p1+", JSContext.create cost "+(System.currentTimeMillis() - l));
       }
       return;
    }
    public c a(V8Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c uoc = null;
       c nativeObject = (p0 instanceof V8ObjectProxy)? p0.getNativeObject(): uoc;
       if (nativeObject instanceof c) {
          uoc = nativeObject;
       }
       return uoc;
    }
    public c b(){
       return this.a;
    }
    public final Object c(V8Object p0,Object[] p1,String p2,String p3,b p4){
       Boolean obj;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, uod, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.c;
       if (obj.booleanValue()) {
          d.p().g("invoke_"+p2+"_"+p3, p0);
       }
       p0 = (p0 instanceof V8ObjectProxy)? p0.getNativeObject(): this.f(p2);
       Object obj1 = null;
       if (p0 == null) {
          a.d(this, new Throwable("function call, nativeObject is null: "+p2+", methodName: "+p3));
          if (obj.booleanValue()) {
             d.p().j();
          }
          return obj1;
       }else {
          try{
             obj1 = p4.f(p0, p3, p1);
          }catch(java.lang.Exception e5){
             a.d(this, e5);
          }
          if (a.c.booleanValue()) {
             d.p().j();
          }
          return obj1;
       }
    }
    public Object d(V8ObjectProxy p0,b p1){
       f$a obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p1 != null) {
          obj = p1.a(new f$a(this, p0).a());
          if (obj instanceof a) {
             obj.onCreate();
          }
          p0.setNativeObject(obj);
       }
       return obj;
    }
    public String e(){
       return this.m;
    }
    public Object f(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = PatchProxy.applyOneRefs(p0, this, d.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       this.b().b();
       obj = this.b();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, c.class, "11");
       if (obj1 != patchProxyRe) {
       }else {
          obj.b();
          obj1 = obj.f.get(p0);
       }
       if (obj1 == null) {
          return null;
       }else {
          Object nativeObject = obj1.getNativeObject();
          if (nativeObject == null) {
             nativeObject = this.d(obj1, g.e().a().get(p0));
          }
          if (nativeObject == null) {
             nativeObject = this.d(obj1, g.e().b().get(p0));
          }
          return nativeObject;
       }
    }
    public String g(){
       Object obj = PatchProxy.apply(null, this, d.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(this.e) && !(this.e).endsWith("/")) {
          this.e = (this.e).concat("/");
       }
       return this.e;
    }
    public Context getContext(){
       d obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj != null) {
          Activity uActivity = obj.get();
          if (uActivity != null) {
             return uActivity;
          }
       }
       return e.k;
    }
    public String getTag(){
       Object obj = PatchProxy.apply(null, this, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.hashCode());
    }
    public d$b h(){
       return this.q;
    }
    public w i(){
       return this.n;
    }
    public boolean j(){
       return this.h;
    }
    public void k(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "14")) {
          return;
       }
       e uoe = this.a(p0);
       if (uoe == null) {
          return;
       }
       uoe.retainJsObj();
       ViewGroup view = uoe.getView();
       ViewGroup viewGroup = null;
       d td = this.d;
       if (td != null) {
          viewGroup = td.get();
       }
       if (viewGroup == null) {
          a.d(this, new Throwable("rootView is null, bundleId: "+this.m));
          return;
       }else if(view != null){
          viewGroup.removeAllViews();
          viewGroup.addView(view);
       }
       return;
    }
    public void l(String p0){
       this.m = p0;
    }
    public void onCreate(){
       int this;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       long l = 0;
       if (a.c.booleanValue()) {
          l = System.currentTimeMillis();
       }
       if (this.c == null) {
          this.c = g.e();
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       if (!PatchProxy.applyVoid(objArray, this, uod, "10")) {
          V8 v8 = this.a.g();
          j oj = j.b();
          d ta = this.a;
          Objects.requireNonNull(oj);
          if (!PatchProxy.applyVoidThreeRefs(ta, this, v8, oj, j.class, "2")) {
             v8.registerInternalFunction(1, oj.a("setInterval", ta, this));
             v8.registerInternalFunction(2, oj.a("clearInterval", ta, this));
             v8.registerInternalFunction(3, oj.a("setTimeout", ta, this));
             v8.registerInternalFunction(4, oj.a("clearTimeout", ta, this));
          }
          v8.setBindingObjectCreator(this.r);
          v8.registerExposedComponents(g.e().c());
          if (r.a()) {
             this.f = y.b(v8.getObject("console"), this);
          }
          this = 0;
          String[] stringArray = new String[this];
          String[] stringArray1 = g.e().a().keySet().toArray(stringArray);
          g og1 = g.e();
          _monitor_enter(og1);
          g og2 = PatchProxy.apply(objArray, og1, og, "12");
          if (og2 != patchProxyRe) {
             _monitor_exit(og1);
          }else if(og1.b == null){
             og1.h();
          }
          og2 = og1.b;
          _monitor_exit(og1);
          int len = stringArray1.length;
          for (int i = 0; i < len; i = i + 1) {
             V8ObjectProxy v8ObjectProx = new V8ObjectProxy(v8, og2[i]);
             this.a.a(stringArray1[i], v8ObjectProx);
             v8.add(stringArray1[i], v8ObjectProx);
          }
          stringArray = new String[this];
          stringArray1 = g.e().b().keySet().toArray(stringArray);
          og1 = g.e();
          _monitor_enter(og1);
          g og3 = PatchProxy.apply(objArray, og1, og, "13");
          if (og3 != patchProxyRe) {
             _monitor_exit(og1);
          }else if(og1.c == null){
             og1.g();
          }
          og3 = og1.c;
          _monitor_exit(og1);
          int len1 = stringArray1.length;
          for (; this < len1; this++) {
             V8ObjectProxy v8ObjectProx1 = new V8ObjectProxy(v8, og3[this], true);
             this.a.a(stringArray1[this], v8ObjectProx1);
             v8.add(stringArray1[this], v8ObjectProx1);
          }
       }
       if (a.c.booleanValue()) {
          V8Trace.traceLog("TKJSContext", "registerJSClassesOrObject cost "+(System.currentTimeMillis() - l));
       }
       return;
    }
    public void onDestroy(){
       Map a;
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       a.a("TKJSContext", "onDestroy");
       d td = this.d;
       if (td != null) {
          td.clear();
          this.d = null;
       }
       try{
          if (a.c.booleanValue()) {
             a.n().t(this.b().h(), this.a.g().getHandle());
          }
          if (r.a()) {
             y.c(this.f);
          }
          this.a.d();
       }catch(java.lang.Exception e0){
          a.d(this, e0);
       }
       if (!PatchProxy.applyVoid(null, null, f.class, "6")) {
          a = f.a;
          if (a != null) {
             a.clear();
             f.a = null;
          }
       }
       td = this.k;
       if (td != null) {
          td.clear();
       }
       td = this.b;
       if (td != null) {
          td.clear();
          this.b = null;
       }
       return;
    }
}
