package com.yxcorp.gifshow.ad.half.AdBottomSheetBehavior$a;
import androidx.customview.widget.ViewDragHelper$c;
import com.yxcorp.gifshow.ad.half.AdBottomSheetBehavior;
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
import java.lang.Boolean;
import java.lang.ref.WeakReference;

public class AdBottomSheetBehavior$a extends ViewDragHelper$c	// class@001777
{
    public final AdBottomSheetBehavior a;

    public void AdBottomSheetBehavior$a(AdBottomSheetBehavior p0){
       this.a = p0;
       super();
    }
    public int a(View p0,int p1,int p2){
       if (PatchProxy.isSupport(AdBottomSheetBehavior$a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AdBottomSheetBehavior$a.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return p0.getLeft();
    }
    public int b(View p0,int p1,int p2){
       if (PatchProxy.isSupport(AdBottomSheetBehavior$a.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AdBottomSheetBehavior$a.class, "6");
          if (p0 != PatchProxyResult.class) {
             return p0.intValue();
          }
       }
       int expandedOffs = this.a.getExpandedOffset();
       AdBottomSheetBehavior$a ta = this.a;
       AdBottomSheetBehavior x = (ta.o != null)? ta.x: ta.n;
       return a.b(p1, expandedOffs, x);
    }
    public int e(View p0){
       AdBottomSheetBehavior$a ta = this.a;
       if (ta.o != null) {
          return ta.x;
       }
       return ta.n;
    }
    public void j(int p0){
       AdBottomSheetBehavior$a uoa = AdBottomSheetBehavior$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       if (p0 == 1) {
          this.a.setStateInternal(1);
       }
       return;
    }
    public void k(View p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(AdBottomSheetBehavior$a.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, AdBottomSheetBehavior$a.class, "2")) {
             return;
          }
       }
       this.a.dispatchOnSlide(p2);
       return;
    }
    public void l(View p0,float p1,float p2){
       AdBottomSheetBehavior$a ta1;
       AdBottomSheetBehavior m;
       boolean b;
       AdBottomSheetBehavior$a uoa = AdBottomSheetBehavior$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, AdBottomSheetBehavior$a.class, "5")) {
          return;
       }
       int i = 3;
       if (p2 < 0) {
          AdBottomSheetBehavior$a ta = this.a;
          if (ta.v > ta.f) {
             ta1 = this.a;
             if (p0.getTop() < (ta1.x - ta1.f)) {
                m = ta1.m;
             }
          }
          m = this.a.n;
       label_0041 :
          i = 4;
       }else if(Math.abs(p1) - Math.abs(p2) >= 0 || p2 - 0x43fa0000 <= 0){
          Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             ta1 = this.a;
             b = (p0.getTop() > ((ta1.x + ta1.getExpandedOffset()) / 2))? true: false;
          }
          if (!b) {
             if (this.a.b.booleanValue()) {
                m = this.a.m;
             }else {
                m = this.a.n;
                goto label_0041 ;
             }
          }
       }
       m = this.a.x;
       i = 5;
       this.a.k(p0, i, m, true);
       return;
    }
    public boolean m(View p0,int p1){
       AdBottomSheetBehavior z;
       AdBottomSheetBehavior$a uoa = AdBottomSheetBehavior$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       uoa = this.a;
       AdBottomSheetBehavior q = uoa.q;
       boolean b = true;
       if (q == b) {
          return false;
       }else if(uoa.E != null){
          return false;
       }else if(q == 3 && uoa.C == p1){
          z = uoa.z;
          View view = (z != null)? z.get(): null;
          if (view != null && view.canScrollVertically(-1)) {
             return false;
          }
       }
    label_0048 :
       z = this.a.y;
       if (z == null || z.get() != p0) {
          b = false;
       }
       return b;
    }
}
