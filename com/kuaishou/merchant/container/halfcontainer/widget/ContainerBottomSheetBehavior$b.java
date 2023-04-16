package com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior$b;
import com.kuaishou.merchant.container.halfcontainer.widget.a$c;
import com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import u1.a;
import java.lang.Float;
import java.lang.Math;
import java.util.Objects;
import com.kuaishou.merchant.container.halfcontainer.widget.a;
import java.lang.Boolean;
import android.view.VelocityTracker;
import a2.h0;
import com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior$d;
import java.lang.Runnable;
import a2.i0;
import java.lang.IllegalStateException;
import java.lang.ref.WeakReference;

public class ContainerBottomSheetBehavior$b extends a$c	// class@001636
{
    public final ContainerBottomSheetBehavior a;

    public void ContainerBottomSheetBehavior$b(ContainerBottomSheetBehavior p0){
       this.a = p0;
       super();
    }
    public int a(View p0,int p1,int p2){
       if (PatchProxy.isSupport(ContainerBottomSheetBehavior$b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ContainerBottomSheetBehavior$b.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return p0.getLeft();
    }
    public int b(View p0,int p1,int p2){
       if (PatchProxy.isSupport(ContainerBottomSheetBehavior$b.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ContainerBottomSheetBehavior$b.class, "5");
          if (p0 != PatchProxyResult.class) {
             return p0.intValue();
          }
       }
       int expandedOffs = this.a.getExpandedOffset();
       ContainerBottomSheetBehavior$b ta = this.a;
       ContainerBottomSheetBehavior s = (ta.k != null)? ta.s: ta.i;
       return a.b(p1, expandedOffs, s);
    }
    public int c(View p0){
       ContainerBottomSheetBehavior$b ta = this.a;
       if (ta.k != null) {
          return ta.s;
       }
       return ta.i;
    }
    public void d(int p0){
       ContainerBottomSheetBehavior$b uob = ContainerBottomSheetBehavior$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       if (p0 == 1) {
          this.a.setStateInternal(1);
       }
       return;
    }
    public void e(View p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ContainerBottomSheetBehavior$b.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ContainerBottomSheetBehavior$b.class, "2")) {
             return;
          }
       }
       this.a.dispatchOnSlide(p2);
       return;
    }
    public void f(View p0,float p1,float p2){
       ContainerBottomSheetBehavior g;
       ContainerBottomSheetBehavior n;
       ContainerBottomSheetBehavior$b obj;
       int b1;
       if (PatchProxy.isSupport(ContainerBottomSheetBehavior$b.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, ContainerBottomSheetBehavior$b.class, "4")) {
          return;
       }
       int i = 0;
       ContainerBottomSheetBehavior uContainerBo = null;
       boolean b = 6;
       int i1 = 4;
       if (p2 - uContainerBo < 0) {
          ContainerBottomSheetBehavior$b ta = this.a;
          if (ta.a != null) {
             if (ta.g(p0, p2)) {
                g = this.a.g;
             label_0036 :
                i1 = 3;
             label_00ea :
                n = this.a.n;
                i = p0.getLeft();
                Objects.requireNonNull(n);
                a uoa = a.class;
                if (PatchProxy.isSupport(uoa)) {
                   obj = PatchProxy.applyTwoRefs(Integer.valueOf(i), Integer.valueOf(g), n, uoa, "7");
                   if (obj != PatchProxyResult.class) {
                      b1 = obj.booleanValue();
                   label_0130 :
                      if (b1) {
                         this.a.setStateInternal(2);
                         i0.k0(p0, new ContainerBottomSheetBehavior$d(this.a, p0, i1));
                      }else {
                         this.a.setStateInternal(i1);
                      }
                      return;
                   }
                }
                if (n.w != null) {
                   b1 = n.k(i, g, (int)h0.a(n.o, n.f), (int)h0.b(n.o, n.f));
                   goto label_0130 ;
                }else {
                   throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
                }
             }else {
                g = this.a.i;
                goto label_00ea ;
             }
          }else {
             n = this.a.h;
             if (p0.getTop() > n) {
                i = n;
             }else {
             label_004b :
                b = 3;
             }
          }
       }else {
          ContainerBottomSheetBehavior$b ta1 = this.a;
          if (ta1.k != null && (ta1.shouldHide(p0, p2) && (p0.getTop() > this.a.i || Math.abs(p1) - Math.abs(p2) < 0))) {
             g = this.a.s;
             i1 = 5;
             goto label_00ea ;
          }else if(!p2 - uContainerBo || Math.abs(p1) - Math.abs(p2) > 0){
             b1 = p0.getTop();
             obj = this.a;
             if (obj.a != null) {
                if (obj.g(p0, p2)) {
                   i = this.a.g;
                   goto label_004b ;
                }else {
                   i = this.a.i;
                }
             }else {
                n = obj.h;
                if (b1 < n) {
                   if (b1 < Math.abs((b1 - obj.i))) {
                      goto label_004b ;
                   }else {
                      i = this.a.h;
                   }
                }else if(Math.abs((b1 - n)) < Math.abs((b1 - this.a.i))){
                   i = this.a.h;
                }else {
                   i = this.a.i;
                }
             }
             b = 4;
          }else if(this.a.g(p0, p2)){
             b1 = this.a.getExpandedOffset();
             goto label_0036 ;
          }else {
             g = this.a.i;
             goto label_00ea ;
          }
       }
       b1 = i;
       i1 = b;
       goto label_00ea ;
    }
    public boolean g(View p0,int p1){
       ContainerBottomSheetBehavior$b uob = ContainerBottomSheetBehavior$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uob = this.a;
       ContainerBottomSheetBehavior m = uob.m;
       boolean b = true;
       if (m == b) {
          return false;
       }else if(uob.z != null){
          return false;
       }else if(m == 3 && uob.x == p1){
          View view = uob.u.get();
          if (view != null && view.canScrollVertically(-1)) {
             return false;
          }
       }
       ContainerBottomSheetBehavior t = this.a.t;
       if (t == null || t.get() != p0) {
          b = false;
       }
       return b;
    }
}
