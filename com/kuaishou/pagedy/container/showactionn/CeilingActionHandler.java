package com.kuaishou.pagedy.container.showactionn.CeilingActionHandler;
import lo4.d;
import java.lang.Object;
import com.kuaishou.pagedy.container.showactionn.CeilingActionHandler$a;
import lo4.j;
import lo4.k;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lo4.a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.pagedy.container.widget.DynamicRootListContainer;
import msd.a;
import android.view.ViewGroup;
import com.kuaishou.bowl.core.component.a;
import kotlin.jvm.internal.a;
import lo4.i;
import android.view.View;
import com.kuaishou.pagedy.container.showactionn.CeilingActionHandler$dealState$1;
import com.kuaishou.pagedy.container.showactionn.CeilingActionHandler$dealState$2;
import com.kuaishou.pagedy.container.showactionn.CeilingActionHandler$dealState$3;
import msd.l;
import lo4.a$a;
import com.kuaishou.pagedy.container.showactionn.CeilingActionHandler$handle$1;
import com.kuaishou.pagedy.container.showactionn.a;
import com.kuaishou.pagedy.container.showactionn.a$a;

public final class CeilingActionHandler implements d	// class@000a60
{
    public View a;
    public int b;
    public DynamicRootListContainer c;
    public a d;
    public int e;
    public final CeilingActionHandler$a f;
    public final j g;

    public void CeilingActionHandler(){
       super();
       CeilingActionHandler$a uoa = new CeilingActionHandler$a(this);
       this.f = uoa;
       j oj = new j();
       oj.n(uoa);
       this.g = oj;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, CeilingActionHandler.class, "5")) {
          return;
       }
       this.g.g();
       CeilingActionHandler td = this.d;
       if (td != null) {
          td.d();
       }
       td = this.c;
       if (td != null) {
          td.e(this.g);
       }
       this.g.l(null);
       this.b = 0;
       this.e = 0;
       return;
    }
    public String b(){
       return "ceiling";
    }
    public void c(ViewGroup p0,a p1){
       CeilingActionHandler uCeilingActi = CeilingActionHandler.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uCeilingActi, "1")) {
          return;
       }
       if (p1 != null && p0 != null) {
          if (!p0 instanceof DynamicRootListContainer) {
             return;
          }else {
             int i = 1;
             if (this.b == i) {
                return;
             }else {
                this.b = i;
                if (a.g(p0, this.c) ^ i) {
                   CeilingActionHandler td = this.d;
                   if (td != null) {
                      td.d();
                   }
                   td = this.c;
                   if (td != null) {
                      td.e(this.g);
                   }
                   td = this.c;
                   if (td != null) {
                      ViewGroup ceilingConta = td.getCeilingContainer();
                      if (ceilingConta != null) {
                         ceilingConta.removeAllViews();
                      }
                   }
                   this.a = null;
                   this.c = p0;
                }
                DynamicRootListContainer uDynamicRoot = p0;
                int i1 = 0;
                uDynamicRoot.setCeilingHeight(i1);
                this.g.j(p1);
                this.g.k(uDynamicRoot.getCeilingViewContainer());
                this.g.o(p0);
                this.g.i(uDynamicRoot.getCeilingViewContainer());
                if (!PatchProxy.applyVoidTwoRefs(uDynamicRoot, p1, this, uCeilingActi, "2")) {
                   if (this.a != null && !uDynamicRoot.getCeilingContainer().getVisibility()) {
                      p1.addLog("relatedView != null", null);
                      this.g.m(i1);
                      uDynamicRoot.getCeilingViewContainer().removeAllViews();
                      this.d(uDynamicRoot.getCeilingContainer(), p1.relatedComponent);
                   }else {
                      this.g.m(i);
                      uDynamicRoot.getCeilingContainer().removeAllViews();
                      this.f.release();
                   }
                   this.d = a.g.a(uDynamicRoot, p1, new CeilingActionHandler$dealState$1(this), new CeilingActionHandler$dealState$2(this), new CeilingActionHandler$dealState$3(this));
                }
                uDynamicRoot.e(this.g);
                uDynamicRoot.n(this.g);
                this.g.l(new CeilingActionHandler$handle$1(p0, p1));
             }
          }
       }
       return;
    }
    public final void d(ViewGroup p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CeilingActionHandler.class, "3")) {
          return;
       }
       if (p0 != null && p1 != null) {
          View view = a.b.a(p1, p0);
          this.a = view;
          if (view != null) {
             p0.addView(view);
             p1.addLog("ceiling add view to ceilingContainer", null);
             p1.bindData(p1, view, 0);
          }
       }
       return;
    }
    public void release(){
       ViewGroup ceilingViewC;
       if (PatchProxy.applyVoid(null, this, CeilingActionHandler.class, "4")) {
          return;
       }
       if (this.b == null) {
          CeilingActionHandler tc = this.c;
          if (tc != null) {
             ceilingViewC = tc.getCeilingViewContainer();
             if (ceilingViewC != null) {
                ceilingViewC.removeAllViews();
             }
          }
          this.a = null;
          tc = this.c;
          if (tc != null) {
             tc.e(this.g);
          }
          tc = this.c;
          if (tc != null) {
             ceilingViewC = tc.getCeilingViewContainer();
             if (ceilingViewC != null) {
                ceilingViewC.setVisibility(8);
             }
          }
          tc = this.c;
          if (tc != null) {
             tc.setCeilingHeight(0);
          }
          this.c = null;
          this.f.release();
          this.g.f();
       }
       return;
    }
}
