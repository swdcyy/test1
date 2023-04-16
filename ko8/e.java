package ko8.e;
import yn8.a;
import com.tachikoma.core.bridge.d;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import yn8.b;
import android.view.ViewGroup;
import ln8.a;
import java.lang.StringBuilder;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.V8;
import lp8.b;
import lp8.c;
import qp8.d;
import java.lang.System;
import com.tkruntime.v8.V8ObjectProxy;
import com.tachikoma.core.bridge.c;
import com.tachikoma.core.component.view.TKView;
import gx4.f$a;
import gx4.e;
import com.tkruntime.v8.V8Object;
import gx4.f;
import java.util.List;
import android.view.View;
import com.tachikoma.core.component.e;
import com.tachikoma.core.component.TKYogaLayout;
import gx4.c;
import com.tachikoma.core.component.TKBaseNativeModule;
import tx4.y;
import java.io.PrintStream;
import java.lang.Throwable;
import wp8.a;
import android.widget.FrameLayout;
import android.content.Context;
import java.util.Iterator;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class e extends a	// class@002bd9
{
    public final boolean q;
    public boolean r;
    public final List s;

    public void e(d p0,boolean p1){
       super(p0);
       this.s = new ArrayList();
       this.q = p1;
    }
    public void J0(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "6")) {
          return;
       }
       int i = 1;
       if (p0 <= i) {
          i = false;
       }
       this.r = i;
       super.J0(p0);
       return;
    }
    public ViewGroup$LayoutParams L0(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoe, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new ViewGroup$LayoutParams(-1, -1);
    }
    public void N0(b p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "3")) {
          return;
       }
       super.N0(p0, this.W0(p1));
       return;
    }
    public b O0(ViewGroup p0,int p1){
       String str1;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.m != null) {
          return super.O0(p0, p1);
       }else {
          long l = 0;
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
                label_0085 :
                   V8ObjectProxy v8ObjectProx = new V8ObjectProxy(this.e.b().g(), "ViewPager2-Element");
                   TKView tKView = new TKView(new f$a(this.e, v8ObjectProx).a());
                   v8ObjectProx.setNativeObject(tKView);
                   this.s.add(v8ObjectProx);
                   tKView.getView().setLayoutParams(this.L0(this.f));
                   Object[] objArray = new Object[i1];
                   objArray[i] = Integer.valueOf(p1);
                   V8Object v8Object = this.h.get().call(null, objArray);
                   e uoe1 = this.e.a(v8Object);
                   uoe1.mAttachToRoot = i1;
                   a tl = this.l;
                   this.l = tl + 1;
                   this.o.add(tl, y.b(uoe1.getJsObj(), this));
                   tKView.add(v8Object);
                   if (c.booleanValue()) {
                      if (c.a().t3()) {
                         if (str1) {
                            d.p().k(this.h.get().v8);
                            uoe1.currentState = 12;
                         }
                      }else {
                         System.out.println("V8Trace ["+str+"] cost "+((float)((System.nanoTime() - l) / 1000) / 1000.00f));
                      }
                   }
                   return new b(tKView.getView(), tl);
                }else {
                   l = System.nanoTime();
                }
             }
             str = str1;
          }
          str1 = 0;
          goto label_0085 ;
       }
    }
    public void P0(){
       if (PatchProxy.applyVoid(null, this, e.class, "9")) {
          return;
       }
       super.P0();
       Iterator iterator = this.s.iterator();
       while (iterator.hasNext()) {
          V8Object v8Object = iterator.next();
          if (v8Object != null && !v8Object.isReleased()) {
             v8Object.setWeak();
          }
       }
       this.s.clear();
       return;
    }
    public void U0(View p0,boolean p1){
    }
    public int V0(){
       Object obj = PatchProxy.apply(null, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.getItemCount();
    }
    public int W0(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.X0()) {
          p0 = p0 % this.V0();
       }
       return p0;
    }
    public boolean X0(){
       boolean b = (this.q != null && this.r != null)? true: false;
       return b;
    }
    public int f0(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return super.f0(this.W0(p0));
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.X0()) {
          return 0x186a0;
       }
       return this.V0();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       this.N0(p0, p1);
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       return this.O0(p0, p1);
    }
}
