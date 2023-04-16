package io8.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import gx4.e;
import com.tachikoma.core.bridge.c;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import io8.a$a;
import java.lang.Integer;
import ln8.a;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.tkruntime.v8.V8;
import com.tkruntime.v8.V8Value;
import lp8.b;
import lp8.c;
import qp8.d;
import java.lang.System;
import com.tachikoma.core.component.e;
import android.view.View;
import com.tachikoma.core.component.TKYogaLayout;
import android.view.ViewGroup;
import com.tachikoma.core.component.view.TKView;
import com.tkruntime.v8.V8Object;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.io.PrintStream;
import android.content.Context;
import com.tkruntime.v8.V8ObjectProxy;
import gx4.f$a;
import gx4.f;
import android.view.ViewGroup$LayoutParams;

public class a extends RecyclerView$Adapter	// class@002701
{
    public final ArrayList e;
    public final ArrayList f;
    public c g;
    public e h;
    public int i;
    public boolean j;

    public void a(e p0,c p1){
       super();
       this.e = new ArrayList();
       this.f = new ArrayList();
       this.i = 0;
       this.j = false;
       this.g = p1;
       this.h = p0;
    }
    public void J0(){
       this.j = true;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       a$a a;
       Object obj;
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2") && this.j == null)) {
          a = p0.a;
          if (a != null) {
             int i = 0;
             long l = 0;
             Boolean c = a.c;
             String str = "";
             if (c.booleanValue()) {
                String str1 = "listBindData_"+p1;
                if (!(this.g.g().v8.currentState % 2)) {
                   if (c.a().t3()) {
                      i = 1;
                      this.g.g().v8.currentState = 13;
                      d.p().h(this.g.g().v8, str, str1);
                   }else {
                      l = System.nanoTime();
                   }
                }
                str = str1;
             }
             if (PatchProxy.isSupport(uoa)) {
                obj = PatchProxy.applyOneRefs(Integer.valueOf(p1), this, uoa, "5");
                if (obj != PatchProxyResult.class) {
                label_009c :
                   if (a.getView().getChildCount() > 0) {
                      a.removeAll();
                   }
                   if (obj.getParent() != null) {
                      obj.getParent().remove(obj.getJsObj());
                   }
                   a.add(obj.getJsObj());
                   if (c.booleanValue()) {
                      if (c.a().t3()) {
                         if (i) {
                            d.p().k(this.g.g().v8);
                            a.currentState = 14;
                         }
                      }else {
                         System.out.println("V8Trace ["+str+"] cost "+((float)((System.nanoTime() - l) / 1000) / 1000.00f));
                      }
                   }
                }
             }
             obj = this.e.get(p1);
             goto label_009c ;
          }
       }
    label_011d :
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       a$a uoa1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          uoa1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (uoa1 != PatchProxyResult.class) {
          }else if(this.j != null){
             uoa1 = new a$a(p0.getContext());
          }else {
             a uoa2 = null;
             long l = 0;
             Boolean c = a.c;
             String str = "";
             if (c.booleanValue()) {
                String str1 = "listCreateView_"+this.i;
                if (!(this.g.g().v8.currentState % 2)) {
                   if (c.a().t3()) {
                      uoa2.currentState = 11;
                      d.p().h(this.g.g().v8, str, str1);
                      str = str1;
                      uoa2 = 1;
                   }else {
                      l = System.nanoTime();
                   }
                }
                str = str1;
             }
             V8ObjectProxy v8ObjectProx = new V8ObjectProxy(this.g.g(), "ViewPager-item-container-"+this.i);
             this.i = this.i + 1;
             TKView tKView = new TKView(new f$a(this.h, v8ObjectProx).a());
             v8ObjectProx.setNativeObject(tKView);
             tKView.mAttachToRoot = true;
             if (c.booleanValue()) {
                if (c.a().t3()) {
                   if (uoa2 != null) {
                      d.p().k(this.g.g().v8);
                      uoa2.currentState = 12;
                   }
                }else {
                   System.out.println("V8Trace ["+str+"] cost "+((float)((System.nanoTime() - l) / 1000) / 1000.00f));
                }
             }
             a$a uoa3 = PatchProxy.applyOneRefs(tKView, null, a$a.class, "1");
             if (uoa3 != PatchProxyResult.class) {
             }else {
                tKView.getView().setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
                uoa3 = new a$a(tKView);
             }
             uoa1 = uoa3;
          }
       }else {
          goto label_001a ;
       }
       return uoa1;
    }
}
