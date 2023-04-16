package androidx.constraintlayout.widget.ConstraintLayout$b;
import i1.b$b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.View;
import androidx.constraintlayout.widget.Placeholder;
import java.util.ArrayList;
import androidx.constraintlayout.widget.ConstraintHelper;
import java.util.Objects;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import i1.b$a;
import androidx.constraintlayout.widget.ConstraintLayout$a;
import java.lang.Enum;
import android.view.View$MeasureSpec;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.g;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.solver.widgets.h;
import java.lang.Math;

public class ConstraintLayout$b implements b$b	// class@0006b6
{
    public ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final ConstraintLayout h;

    public void ConstraintLayout$b(ConstraintLayout p0,ConstraintLayout p1){
       this.h = p0;
       super();
       this.a = p1;
    }
    public final void a(){
       int childCount = this.a.getChildCount();
       int i = 0;
       int i1 = 0;
       while (i1 < childCount) {
          View childAt = this.a.getChildAt(i1);
          if (childAt instanceof Placeholder) {
             childAt.b(this.a);
          }
          i1 = i1 + 1;
       }
       childCount = this.a.c.size();
       if (childCount > 0) {
          for (; i < childCount; i = i + 1) {
             Objects.requireNonNull(this.a.c.get(i));
          }
       }
       return;
    }
    public final void b(ConstraintWidget p0,b$a p1){
       int i4;
       int i5;
       int i6;
       d uod;
       ConstraintWidget$DimensionBehaviour uDimensionBe;
       int baseline;
       int i7;
       boolean i8;
       ConstraintLayout$b uob = this;
       ConstraintWidget uConstraintW = p0;
       b$a uoa = p1;
       if (!uConstraintW) {
          return;
       }
       int i = 0;
       if (p0.T() == 8 && !p0.d0()) {
          uoa.e = i;
          uoa.f = i;
          uoa.g = i;
          return;
       }else if(p0.L() == null){
          return;
       }else {
          b$a a = uoa.a;
          b$a b = uoa.b;
          b$a c = uoa.c;
          b$a d = uoa.d;
          int i1 = uob.b + uob.c;
          ConstraintLayout$b d1 = uob.d;
          View view = p0.t();
          int[] a1 = ConstraintLayout$a.a;
          int i2 = a1[a.ordinal()];
          ConstraintWidget uConstraintW1 = 4;
          b$a uoa1 = 3;
          int i3 = 2;
          ConstraintWidget uConstraintW2 = 1;
          if (i2 != uConstraintW2) {
             if (i2 != i3) {
                if (i2 != uoa1) {
                   if (i2 != uConstraintW1) {
                      i4 = 0;
                   }else {
                      i4 = ViewGroup.getChildMeasureSpec(uob.f, d1, -2);
                      i5 = (uConstraintW.p == uConstraintW2)? 1: 0;
                      b$a j1 = uoa.j;
                      if (j1 == b$a.l || j1 == b$a.m) {
                         ConstraintWidget$DimensionBehaviour uDimensionBe1 = (view.getMeasuredHeight() == p0.y())? 1: null;
                         i5 = (uoa.j != b$a.m && (!i5 || (!i5 || (!uDimensionBe1 && (view instanceof Placeholder || p0.h0())))))? 1: 0;
                         if (i5) {
                            i4 = View$MeasureSpec.makeMeasureSpec(p0.U(), 0x40000000);
                         }
                      }
                   }
                }else {
                   i4 = ViewGroup.getChildMeasureSpec(uob.f, (d1 + p0.C()), -1);
                }
             }else {
                i4 = ViewGroup.getChildMeasureSpec(uob.f, d1, -2);
             }
          }else {
             i4 = View$MeasureSpec.makeMeasureSpec(c, 0x40000000);
          }
          i5 = a1[b.ordinal()];
          if (i5 != uConstraintW2) {
             if (i5 != i3) {
                if (i5 != 3) {
                   if (i5 != 4) {
                      i6 = 0;
                   }else {
                      i6 = ViewGroup.getChildMeasureSpec(uob.g, i1, -2);
                      uod = (uConstraintW.q == uConstraintW2)? 1: null;
                      b$a j = uoa.j;
                      if (j == b$a.l || j == b$a.m) {
                         d1 = (view.getMeasuredWidth() == p0.U())? 1: null;
                         uod = (uoa.j != b$a.m && (!uod || (!uod || (!d1 && (view instanceof Placeholder || p0.i0())))))? 1: null;
                         if (uod) {
                            i6 = View$MeasureSpec.makeMeasureSpec(p0.y(), 0x40000000);
                         }
                      }
                   }
                }else {
                   i6 = ViewGroup.getChildMeasureSpec(uob.g, (i1 + p0.S()), -1);
                }
             }else {
                i6 = ViewGroup.getChildMeasureSpec(uob.g, i1, -2);
             }
          }else {
             i6 = View$MeasureSpec.makeMeasureSpec(d, 0x40000000);
          }
          uod = p0.L();
          if (uod != null && (g.b(uob.h.j, 256) && (view.getMeasuredWidth() == p0.U() && (view.getMeasuredWidth() < uod.U() && (view.getMeasuredHeight() == p0.y() && (view.getMeasuredHeight() < uod.y() && (view.getBaseline() == p0.q() && !p0.g0()))))))) {
             uDimensionBe = (uob.d(p0.D(), i4, p0.U()) && uob.d(p0.E(), i6, p0.y()))? 1: null;
             if (uDimensionBe) {
                uoa.e = p0.U();
                uoa.f = p0.y();
                uoa.g = p0.q();
                return;
             }
          }
       label_01b3 :
          uDimensionBe = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
          ConstraintWidget uConstraintW3 = (a == uDimensionBe)? 1: null;
          ConstraintWidget uConstraintW4 = (b == uDimensionBe)? 1: null;
          ConstraintWidget$DimensionBehaviour mATCH_PARENT = ConstraintWidget$DimensionBehaviour.MATCH_PARENT;
          float f = (b == mATCH_PARENT || b == ConstraintWidget$DimensionBehaviour.FIXED)? Float.MIN_VALUE: 0;
          ConstraintWidget uConstraintW5 = (a == mATCH_PARENT || a == ConstraintWidget$DimensionBehaviour.FIXED)? 1: null;
          mATCH_PARENT = 0;
          i2 = (uConstraintW3 && uConstraintW.Y - mATCH_PARENT > 0)? 1: 0;
          mATCH_PARENT = (uConstraintW4 && uConstraintW.Y - mATCH_PARENT > 0)? 1: 0;
          if (view == null) {
             return;
          }else {
             ConstraintLayout$LayoutParams layoutParams = view.getLayoutParams();
             uoa1 = uoa.j;
             if (uoa1 != b$a.l && (uoa1 != b$a.m && (uConstraintW3 && (uConstraintW.p == null && (!uConstraintW4 || uConstraintW.q != null))))) {
                if (view instanceof VirtualLayout && uConstraintW instanceof h) {
                   view.x(uConstraintW, i4, i6);
                }else {
                   view.measure(i4, i6);
                }
                uConstraintW.J0(i4, i6);
                i1 = view.getMeasuredWidth();
                i5 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                ConstraintWidget s = uConstraintW.s;
                i3 = (s > null)? Math.max(s, i1): i1;
                uConstraintW2 = uConstraintW.t;
                if (uConstraintW2 > null) {
                   i3 = Math.min(uConstraintW2, i3);
                }
                uConstraintW2 = uConstraintW.v;
                if (uConstraintW2 > null) {
                   i = Math.max(uConstraintW2, i5);
                   i7 = i4;
                }else {
                   i7 = i4;
                   i = i5;
                }
                ConstraintWidget w = uConstraintW.w;
                if (w > null) {
                   i = Math.min(w, i);
                }
                if (!g.b(uob.h.j, 1)) {
                   float f1 = 0x3f000000;
                   if (i2 && f) {
                      i3 = (int)(((float)i * uConstraintW.Y) + f1);
                   }else if(mATCH_PARENT && uConstraintW5 != null){
                      i = (int)(((float)i3 / uConstraintW.Y) + f1);
                   }
                }
                if (i1 != i3 || i5 != i) {
                   i8 = 0x40000000;
                   i4 = (i1 != i3)? View$MeasureSpec.makeMeasureSpec(i3, i8): i7;
                   if (i5 != i) {
                      i6 = View$MeasureSpec.makeMeasureSpec(i, i8);
                   }
                   view.measure(i4, i6);
                   uConstraintW.J0(i4, i6);
                   i3 = view.getMeasuredWidth();
                   i = view.getMeasuredHeight();
                   baseline = view.getBaseline();
                }
                i8 = -1;
             }else {
                i8 = -1;
                i3 = 0;
             }
             i8 = (baseline != i8)? true: false;
             boolean b1 = (i3 != uoa.c || i != uoa.d)? true: false;
             uoa.i = b1;
             if (layoutParams.Y != null) {
                i8 = true;
             }
             if (i8 && (baseline != -1 && p0.q() != baseline)) {
                uoa.i = true;
             }
          label_02d2 :
             uoa.e = i3;
             uoa.f = i;
             uoa.h = i8;
             uoa.g = baseline;
             return;
          }
       }
    }
    public void c(int p0,int p1,int p2,int p3,int p4,int p5){
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p0;
       this.g = p1;
    }
    public final boolean d(int p0,int p1,int p2){
       if (p0 == p1) {
          return true;
       }
       int mode = View$MeasureSpec.getMode(p0);
       View$MeasureSpec.getSize(p0);
       p1 = View$MeasureSpec.getSize(p1);
       if (View$MeasureSpec.getMode(p1) == 0x40000000 && (mode == Integer.MIN_VALUE || (!mode && p2 == p1))) {
          return true;
       }
       return false;
    }
}
