package yn8.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.tachikoma.core.bridge.d;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Math;
import java.util.List;
import java.util.Collection;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tachikoma.core.component.e;
import android.view.ViewGroup$LayoutParams;
import java.lang.Boolean;
import yn8.b;
import ln8.a;
import java.lang.StringBuilder;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.V8;
import lp8.b;
import lp8.c;
import qp8.d;
import java.lang.System;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.lang.Throwable;
import wp8.a;
import java.io.PrintStream;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.content.Context;
import gx4.c;
import com.tachikoma.core.component.TKBaseNativeModule;
import com.tkruntime.v8.V8Array;
import java.lang.Number;

public class a extends RecyclerView$Adapter	// class@0041af
{
    public final d e;
    public boolean f;
    public boolean g;
    public JsValueRef h;
    public JsValueRef i;
    public JsValueRef j;
    public int k;
    public int l;
    public boolean m;
    public List n;
    public final List o;
    public final List p;

    public void a(d p0){
       super(p0, false);
    }
    public void a(d p0,boolean p1){
       super();
       this.o = new ArrayList();
       this.p = new ArrayList();
       this.e = p0;
       this.f = p1;
    }
    public void J0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       if (this.m != null) {
          return;
       }
       int i = 0;
       this.k = Math.max(i, p0);
       if (!this.p.isEmpty()) {
          this.p.clear();
       }
       if (this.M0()) {
          ArrayList uArrayList = new ArrayList();
          for (; i < this.k; i = i + 1) {
             uArrayList.add(Integer.valueOf(i));
          }
          List list = this.T0(uArrayList);
          if (list != null && !list.isEmpty()) {
             this.p.addAll(list);
          }
       }
       this.k0();
       return;
    }
    public List K0(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          JsValueRef jsValueRef = iterator.next();
          if (y.a(jsValueRef.get())) {
             Object nativeObject = jsValueRef.get().getNativeObject();
             if (nativeObject instanceof e) {
                obj.add(nativeObject);
             }
          }
       }
       return obj;
    }
    public ViewGroup$LayoutParams L0(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.f != null) {
          return new ViewGroup$LayoutParams(-2, -1);
       }else {
          return new ViewGroup$LayoutParams(-1, -2);
       }
    }
    public final boolean M0(){
       a obj = PatchProxy.apply(null, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j;
       boolean b = (obj != null && y.a(obj.get()))? true: false;
       return b;
    }
    public void N0(b p0,int p1){
       String str1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "16")) {
          return;
       }
       if (this.m != null) {
          return;
       }
       uoa = this.i;
       if (uoa != null && y.a(uoa.get())) {
          long l = 0;
          String str = "";
          int i = 0;
          if (a.c.booleanValue()) {
             str1 = "listBindData_"+p1;
             if (!(this.i.get().v8.currentState % 2)) {
                if (c.a().t3()) {
                   this.i.get().v8.currentState = 13;
                   d.p().h(this.i.get().v8, str, str1);
                   str = str1;
                   str1 = 1;
                label_008d :
                   JsValueRef jsValueRef = this.o.get(p0.a);
                   if (jsValueRef != null && y.a(jsValueRef.get())) {
                      this.U0(p0.itemView, this.f);
                      Object[] objArray = new Object[]{jsValueRef.get(),Integer.valueOf(p1),Integer.valueOf(this.f0(p1))};
                      this.i.get().call(null, objArray);
                      if (a.c.booleanValue()) {
                         if (c.a().t3()) {
                            if (str1) {
                               d.p().k(this.i.get().v8);
                               p0.currentState = 14;
                            }
                         }else {
                            System.out.println("V8Trace ["+str+"] cost "+((float)((System.nanoTime() - l) / 1000) / 1000.00f));
                         }
                      }
                   }
                }else {
                   l = System.nanoTime();
                }
             }
             str = str1;
          }
          str1 = null;
          goto label_008d ;
       }
    label_0138 :
       return;
    }
    public b O0(ViewGroup p0,int p1){
       d obj;
       StringBuilder str1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.m != null) {
          return new b(new FrameLayout(p0.getContext()), this.l);
       }else {
          obj = null;
          Boolean c = a.c;
          String str = "";
          int i = 0;
          int i1 = 1;
          if (c.booleanValue()) {
             str1 = "listCreateView_"+this.l;
             if (!(this.h.get().v8.currentState % 2)) {
                if (c.a().t3()) {
                   this.h.get().v8.currentState = 11;
                   d.p().h(this.h.get().v8, str, str1);
                   str = str1;
                   str1 = 1;
                label_0091 :
                   Object[] objArray = new Object[i1];
                   objArray[i] = Integer.valueOf(p1);
                   e uoe = this.e.a(this.h.get().call(null, objArray));
                   a tl = this.l;
                   this.l = tl + 1;
                   this.o.add(tl, y.b(uoe.getJsObj(), this));
                   uoe.getView().setLayoutParams(this.L0(this.f));
                   if (c.booleanValue()) {
                      if (c.a().t3()) {
                         if (str1) {
                            d.p().k(this.h.get().v8);
                            this.h.get().v8.currentState = 12;
                         }
                      }else {
                         System.out.println("V8Trace ["+str+"] cost "+((float)((System.nanoTime() - obj) / 1000) / 1000.00f));
                      }
                   }
                   return new b(uoe.getView(), tl);
                }else {
                   long l = System.nanoTime();
                }
             }
             str = str1;
          }
          str1 = null;
          goto label_0091 ;
       }
    }
    public void P0(){
       if (PatchProxy.applyVoid(null, this, a.class, "19")) {
          return;
       }
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          y.c(iterator.next());
       }
       this.o.clear();
       y.c(this.h);
       y.c(this.i);
       y.c(this.j);
       return;
    }
    public void Q0(JsValueRef p0){
       this.j = p0;
    }
    public void R0(JsValueRef p0){
       this.i = p0;
    }
    public void S0(JsValueRef p0){
       this.h = p0;
    }
    public final List T0(List p0){
       List obj = PatchProxy.applyOneRefs(p0, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.M0()) {
          this.p.clear();
          return null;
       }else {
          Object[] objArray = new Object[]{p0};
          V8Array v8Array = this.j.get().call(null, objArray);
          if (v8Array == null) {
             return null;
          }
          obj = v8Array.getList();
          v8Array.setWeak();
          return obj;
       }
    }
    public void U0(View p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "17")) {
          return;
       }
       if (this.g == null) {
          return;
       }
       if (p0 == null) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams == null) {
          return;
       }
       this.g = false;
       if (this.f != null) {
          layoutParams.width = -2;
          layoutParams.height = -1;
       }else {
          layoutParams.width = -1;
          layoutParams.height = -2;
       }
       p0.requestLayout();
       return;
    }
    public int f0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 < this.p.size()) {
          return this.p.get(p0).intValue();
       }else if(!this.M0()){
          uoa = this.n;
          if (uoa != null && !uoa.isEmpty()) {
             return this.n.get((p0 % this.n.size())).intValue();
          }
       }
       return 0;
    }
    public int getItemCount(){
       return this.k;
    }
    public void onDestroy(){
       this.m = true;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       this.N0(p0, p1);
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       return this.O0(p0, p1);
    }
}
