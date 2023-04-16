package com.kuaishou.tachikoma.api.TKViewContainer;
import sx4.e;
import np8.d;
import android.widget.FrameLayout;
import java.lang.String;
import com.tachikoma.core.component.e;
import android.content.Context;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup;
import com.tachikoma.core.bridge.c;
import com.tkruntime.v8.V8;
import np8.c;
import tx4.h;
import com.kwai.robust.PatchProxyResult;
import tw4.a;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.tkruntime.v8.V8Trace;
import tw4.v;
import com.tkruntime.v8.JavaCallback;
import com.kuaishou.tachikoma.api.container.TKContainer;
import op8.a;
import com.tkruntime.v8.V8Object;
import java.util.Objects;
import no8.a;
import java.util.Map;
import java.util.ArrayList;
import bx4.h;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tachikoma.core.component.e$e;
import tw4.u;
import sx4.e$a;
import java.lang.ref.WeakReference;
import com.tkruntime.v8.V8Value;
import java.lang.System;
import lp8.b;
import lp8.c;
import qp8.d;
import com.tachikoma.core.bridge.d;
import zp8.a;
import com.tachikoma.core.bridge.a$b;
import java.lang.Long;
import java.lang.Integer;
import bx4.f;
import java.lang.Runnable;
import t45.c;
import java.io.PrintStream;
import java.lang.Throwable;
import wp8.a;
import iq8.r;
import java.lang.IllegalStateException;

public class TKViewContainer extends FrameLayout implements e, d	// class@000f5d
{
    public String b;
    public String c;
    public int d;
    public int e;
    public c f;
    public String g;
    public h h;
    public int i;
    public e j;
    public e$a k;
    public static final int l;

    public void TKViewContainer(String p0,e p1){
       super(p1.getContext());
       this.i = 0;
       this.c = p0;
       if (PatchProxy.applyVoidOneRefs(p1, this, TKViewContainer.class, "11")) {
       }else if(this.j == p1){
          this.d();
          this.j = p1;
          this.f();
          ViewGroup view = p1.getView();
          if (view != null) {
             this.addView(view);
          }
       }
       TKViewContainer tj = this.j;
       if (tj != null && (tj.getJSContext() != null && !this.j.getJSContext().k())) {
          this.b = this.j.getJSContext().g().getTraceTag(this.c, "");
       }
    label_0059 :
       if (!PatchProxy.applyVoid(null, this, TKViewContainer.class, "3") && this.c()) {
          this.f = new c();
       }
       return;
    }
    public void a(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewContainer.class, "15")) {
          return;
       }
       if (p0 != null && this.j != p0) {
          this.d();
          this.j = p0;
          this.f();
          this.addView(p0.getView(), 0);
          TKViewContainer tf = this.f;
          if (tf != null && tf.a() != null) {
             this.setData(this.f.a());
          }
       }
       return;
    }
    public Object b(String p0,String p1,h p2){
       TKViewContainer obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, TKViewContainer.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.c.booleanValue()) {
          V8Trace.traceLog(this.b, "invokeJSFunction: "+p0+", jsonData = "+p1);
       }
       obj = this.j;
       TKViewContainer tc = this.c;
       JavaCallback javaCallback = (p2 == null)? null: new v(p2);
       return obj.invokeJSFunctionWithJSONString(tc, p0, p1, javaCallback);
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, TKViewContainer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TKContainer.L();
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, TKViewContainer.class, "9")) {
          return;
       }
       TKViewContainer tj = this.j;
       if (tj != null && (tj.getJSContext() != null && this.j.getJSContext().k())) {
          return;
       }
       Boolean c = a.c;
       if (c.booleanValue()) {
          V8Trace.traceLog(this.b, "close");
       }
       this.e(this.j.getView());
       if (c.booleanValue()) {
          a uoa = a.n();
          String str = this.j.getJSContext().h();
          TKViewContainer tc = this.c;
          V8Object jsObj = this.j.getJsObj();
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoidThreeRefs(str, tc, jsObj, uoa, a.class, "5") && a.c.booleanValue()) {
             ArrayList uArrayList = uoa.e.get(tc);
             if (uArrayList != null) {
                uArrayList.remove(jsObj);
                if (uArrayList.isEmpty()) {
                   uoa.e.remove(tc);
                }
             }
             Map map = uoa.d.get(str);
             if (map != null) {
                map.remove(tc);
                if (map.isEmpty()) {
                   uoa.d.remove(str);
                }
                uoa.g.remove(tc);
                uoa.h.remove(tc);
                uoa.i.remove(tc);
                uoa.q(str, tc);
             }
          }
       }
       tj = this.h;
       if (tj != null) {
          TKViewContainer tg = this.g;
          Objects.requireNonNull(tj);
          if (!PatchProxy.applyVoidOneRefs(tg, tj, h.class, "21") && !TextUtils.isEmpty(tg)) {
             tj.z.remove(tg);
          }
       }
       return;
    }
    public final void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKViewContainer.class, "12")) {
          return;
       }
       TKViewContainer tj = this.j;
       if (tj != null) {
          tj.setIJS2NativeInvoker(objArray);
          this.removeView(this.j.getView());
          this.j.destroy(true);
       }
       return;
    }
    public final void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewContainer.class, "10")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p0 instanceof ViewGroup) {
          int i = 0;
          ViewGroup viewGroup = p0;
          while (i < viewGroup.getChildCount()) {
             this.e(viewGroup.getChildAt(i));
             i = i + 1;
          }
       }
       e tKBaseFromVi = e.getTKBaseFromView(p0);
       if (tKBaseFromVi != null) {
          tKBaseFromVi.unRetainJsObj();
       }
       return;
    }
    public final void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKViewContainer.class, "13")) {
          return;
       }
       TKViewContainer tj = this.j;
       if (tj == null) {
          return;
       }
       TKViewContainer tk = this.k;
       if (tk == null) {
          tj.setIJS2NativeInvoker(objArray);
       }else {
          tj.setIJS2NativeInvoker(new u(this, tk));
       }
       return;
    }
    public final void g(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewContainer.class, "5")) {
          return;
       }
       if (this.c()) {
          TKViewContainer tf = this.f;
          if (tf != null) {
             Objects.requireNonNull(tf);
             if (!PatchProxy.applyVoidOneRefs(p0, tf, c.class, "1")) {
                c b = tf.b;
                if (b != null) {
                   b.clear();
                }
                tf.b = new WeakReference(p0);
             }
          }
       }
       return;
    }
    public e getBaseView(){
       TKViewContainer obj = PatchProxy.apply(null, this, TKViewContainer.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       if (obj != null) {
          this.removeView(obj.getView());
       }
       return this.j;
    }
    public e getContainer(){
       return this;
    }
    public c getParam(){
       return this.f;
    }
    public FrameLayout getView(){
       return this;
    }
    public void setData(Object[] p0){
       int i = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, i, TKViewContainer.class, "1")) {
          return;
       }
       TKViewContainer j = i.j;
       if (j == null) {
          throw new IllegalStateException("TKViewContainer 里没有 view，代码不应该执行到这里");
       }
       V8Object v8Object = j.retainJsObj();
       if (v8Object != null && !v8Object.isReleased()) {
          int i1 = 1;
          i.i = i.i + i1;
          long l = System.currentTimeMillis();
          Boolean c = a.c;
          int i2 = 0;
          if (c.booleanValue() && c.a().t3()) {
             TKViewContainer b = i.b;
             StringBuilder str = "setData: args[0] = ";
             object oobject = (obj != null && obj.length > 0)? obj[i2]: "null";
             V8Trace.traceLog(b, str+oobject);
             i.j.getJSContext().g().currentState = 5;
             TKViewContainer e = i.e;
             i.e = e + 1;
             d.p().h(i.j.getJSContext().g(), i.c, "setData_"+i.d+"_"+e);
          }
          a.i("TKViewContainer", "setData bundleId: "+i.j.getTKJSContext().e());
          i.j.getJSContext().f().h(i1);
          v8Object.executeVoidFunction("setData", obj);
          i.j.getJSContext().f().h(i2);
          long l1 = System.currentTimeMillis();
          j = i.h;
          if (j != null) {
             TKViewContainer g = i.g;
             TKViewContainer i3 = i.i;
             Objects.requireNonNull(j);
             if (!PatchProxy.isSupport(h.class) || (!PatchProxy.applyVoidFourRefs(g, Long.valueOf(l), Long.valueOf(l1), Integer.valueOf(i3), j, h.class, "20") && j.k != null)) {
                f uof = new f(j, g, l, l1, i3);
                c.a(i1);
             }
          }
          if (c.booleanValue()) {
             if (c.a().t3()) {
                d.p().k(i.j.getJSContext().g());
                i.j.getJSContext().g().currentState = 6;
             }else {
                System.out.println("V8Trace setData ["+i.j.getTKJSContext().e()+"]["+i.c+"] cost "+(l1 - l));
             }
          }
          if (!PatchProxy.applyVoidOneRefs(obj, i, TKViewContainer.class, "4") && this.c()) {
             j = i.f;
             if (j != null) {
                j.a = obj;
             }
          }
       }else if(!r.a()){
          a.g("未找到 TKBase 对应的 js object handler，setData 只对 jsContext.createView 创建的 view 有效", null);
       }else {
          throw new IllegalStateException("未找到 TKBase 对应的 js object handler，setData 只对 jsContext.createView 创建的 view 有效");
       }
       return;
    }
    public void setIJS2NativeInvoker(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKViewContainer.class, "6")) {
          return;
       }
       this.k = p0;
       this.f();
       this.g(p0);
       return;
    }
    public void setTraceReporter(h p0){
       this.h = p0;
    }
    public void setViewContainerIndex(int p0){
       this.d = p0;
    }
    public void setViewSessionID(String p0){
       this.g = p0;
    }
}
