package com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior$b;
import com.yxcorp.gifshow.camera.record.widget.i$c;
import com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import u1.a;
import java.lang.Float;
import lnc.a1;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.widget.i;
import java.lang.Boolean;
import android.view.VelocityTracker;
import com.yxcorp.gifshow.camera.record.widget.BottomSheetBehavior$d;
import java.lang.Runnable;
import a2.i0;
import java.lang.IllegalStateException;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior$b extends i$c	// class@000fb8
{
    public final BottomSheetBehavior a;

    public void BottomSheetBehavior$b(BottomSheetBehavior p0){
       this.a = p0;
       super();
    }
    public int a(View p0,int p1,int p2){
       if (PatchProxy.isSupport(BottomSheetBehavior$b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, BottomSheetBehavior$b.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return p0.getLeft();
    }
    public int b(View p0,int p1,int p2){
       int expandedOffs;
       BottomSheetBehavior$b ta1;
       BottomSheetBehavior s;
       if (PatchProxy.isSupport(BottomSheetBehavior$b.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, BottomSheetBehavior$b.class, "5");
          if (p0 != PatchProxyResult.class) {
             return p0.intValue();
          }
       }
       BottomSheetBehavior$b ta = this.a;
       BottomSheetBehavior h = ta.H;
       if (Math.abs(p2) <= h) {
          expandedOffs = ta.getExpandedOffset();
          ta1 = this.a;
          s = (ta1.k != null)? ta1.s: ta1.i;
          return a.b(p1, expandedOffs, s);
       }else if(p2 < 0){
          h = - h;
       }
       p1 = (p1 - p2) + h;
       expandedOffs = ta.getExpandedOffset();
       ta1 = this.a;
       s = (ta1.k != null)? ta1.s: ta1.i;
       return a.b(p1, expandedOffs, s);
    }
    public int c(View p0){
       BottomSheetBehavior$b ta = this.a;
       if (ta.k != null) {
          return ta.s;
       }
       return ta.i;
    }
    public void d(int p0){
       BottomSheetBehavior$b uob = BottomSheetBehavior$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       if (p0 == 1) {
          this.a.setStateInternal(1);
       }
       return;
    }
    public void e(View p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(BottomSheetBehavior$b.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, BottomSheetBehavior$b.class, "2")) {
             return;
          }
       }
       this.a.dispatchOnSlide(p2);
       return;
    }
    public void f(View p0,float p1,float p2){
       BottomSheetBehavior g;
       BottomSheetBehavior n;
       BottomSheetBehavior$b obj;
       int b1;
       if (PatchProxy.isSupport(BottomSheetBehavior$b.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, BottomSheetBehavior$b.class, "4")) {
          return;
       }
       int i = 0;
       BottomSheetBehavior uBottomSheet = null;
       boolean b = 6;
       int i1 = 4;
       if (p2 - uBottomSheet < 0) {
          BottomSheetBehavior$b ta = this.a;
          if (ta.a != null) {
             if (ta.h(p0, p2)) {
                g = this.a.g;
             label_0036 :
                i1 = 3;
             label_00fa :
                n = this.a.n;
                i = p0.getLeft();
                Objects.requireNonNull(n);
                i oi = i.class;
                if (PatchProxy.isSupport(oi)) {
                   obj = PatchProxy.applyTwoRefs(Integer.valueOf(i), Integer.valueOf(g), n, oi, "8");
                   if (obj != PatchProxyResult.class) {
                      b1 = obj.booleanValue();
                   label_0140 :
                      if (b1) {
                         if (i1 == 3) {
                            b1.J = true;
                         }
                         this.a.setStateInternal(2);
                         i0.k0(p0, new BottomSheetBehavior$d(this.a, p0, i1));
                      }else {
                         this.a.setStateInternal(i1);
                      }
                      return;
                   }
                }
                if (n.t != null) {
                   b1 = n.k(i, g, (int)n.l.getXVelocity(n.c), (int)n.l.getYVelocity(n.c));
                   goto label_0140 ;
                }else {
                   throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
                }
             }else {
                g = this.a.i;
                goto label_00fa ;
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
          BottomSheetBehavior$b ta1 = this.a;
          if (ta1.k != null && (ta1.shouldHide(p0, p2) && (p0.getTop() > this.a.i || Math.abs(p1) - Math.abs(p2) < 0))) {
             g = this.a.s;
             i1 = 5;
             goto label_00fa ;
          }else if(!p2 - uBottomSheet || Math.abs(p1) - Math.abs(p2) > 0){
             b1 = p0.getTop();
             obj = this.a;
             if (obj.a != null) {
                if (obj.h(p0, p2)) {
                   i = this.a.g;
                   goto label_004b ;
                }else {
                   i = this.a.i;
                }
             }else {
                n = obj.h;
                if (b1 < n) {
                   if ((float)Math.abs((b1 - n)) - (this.a.G * (float)a1.g()) > 0) {
                      goto label_004b ;
                   }else {
                      i = this.a.h;
                   }
                }else if((float)Math.abs((b1 - n)) - (this.a.G * (float)a1.g()) < 0){
                   i = this.a.h;
                }else {
                   i = this.a.i;
                }
             }
             b = 4;
          }else if(this.a.h(p0, p2)){
             b1 = this.a.getExpandedOffset();
             goto label_0036 ;
          }else {
             g = this.a.i;
             goto label_00fa ;
          }
       }
       b1 = i;
       i1 = b;
       goto label_00fa ;
    }
    public boolean g(View p0,int p1){
       BottomSheetBehavior$b uob = BottomSheetBehavior$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uob = this.a;
       BottomSheetBehavior m = uob.m;
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
       BottomSheetBehavior t = this.a.t;
       if (t == null || t.get() != p0) {
          b = false;
       }
       return b;
    }
}
