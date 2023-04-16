package androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup;
import android.content.Context;
import android.util.SparseArray;
import java.util.ArrayList;
import androidx.constraintlayout.solver.widgets.d;
import java.util.HashMap;
import androidx.constraintlayout.widget.ConstraintLayout$b;
import android.util.AttributeSet;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.lang.Object;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import i1.b$b;
import ll8.c$b;
import android.content.res.TypedArray;
import androidx.constraintlayout.widget.a;
import android.content.res.Resources;
import java.lang.String;
import java.lang.Integer;
import androidx.constraintlayout.widget.Constraints;
import h1.c;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.Placeholder;
import androidx.constraintlayout.solver.widgets.f;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.lang.Math;
import android.content.pm.ApplicationInfo;
import android.view.View$MeasureSpec;
import androidx.constraintlayout.widget.Guideline;
import j1.a;
import j1.b;
import java.util.Objects;

public class ConstraintLayout extends ViewGroup	// class@0006b7
{
    public SparseArray b;
    public ArrayList c;
    public d d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public int j;
    public a k;
    public a l;
    public int m;
    public HashMap n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public SparseArray u;
    public b v;
    public b w;
    public ConstraintLayout$b x;
    public int y;
    public int z;
    public static final String A = "ConstraintLayout-2.0.4";

    public void ConstraintLayout(Context p0){
       super(p0);
       this.b = new SparseArray();
       this.c = new ArrayList(4);
       this.d = new d();
       this.e = 0;
       this.f = 0;
       this.g = Integer.MAX_VALUE;
       this.h = Integer.MAX_VALUE;
       this.i = true;
       this.j = 257;
       this.k = null;
       this.l = null;
       this.m = -1;
       this.n = new HashMap();
       this.o = -1;
       this.p = -1;
       this.q = -1;
       this.r = -1;
       this.s = 0;
       this.t = 0;
       this.u = new SparseArray();
       this.x = new ConstraintLayout$b(this, this);
       this.y = 0;
       this.z = 0;
       this.H(null, 0, 0);
    }
    public void ConstraintLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new SparseArray();
       this.c = new ArrayList(4);
       this.d = new d();
       this.e = 0;
       this.f = 0;
       this.g = Integer.MAX_VALUE;
       this.h = Integer.MAX_VALUE;
       this.i = true;
       this.j = 257;
       this.k = null;
       this.l = null;
       this.m = -1;
       this.n = new HashMap();
       this.o = -1;
       this.p = -1;
       this.q = -1;
       this.r = -1;
       this.s = 0;
       this.t = 0;
       this.u = new SparseArray();
       this.x = new ConstraintLayout$b(this, this);
       this.y = 0;
       this.z = 0;
       this.H(p1, 0, 0);
    }
    public void ConstraintLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new SparseArray();
       this.c = new ArrayList(4);
       this.d = new d();
       this.e = 0;
       this.f = 0;
       this.g = Integer.MAX_VALUE;
       this.h = Integer.MAX_VALUE;
       this.i = true;
       this.j = 257;
       this.k = null;
       this.l = null;
       this.m = -1;
       this.n = new HashMap();
       this.o = -1;
       this.p = -1;
       this.q = -1;
       this.r = -1;
       this.s = 0;
       this.t = 0;
       this.u = new SparseArray();
       this.x = new ConstraintLayout$b(this, this);
       this.y = 0;
       this.z = 0;
       this.H(p1, p2, 0);
    }
    public final ConstraintWidget G(int p0){
       ConstraintWidget uConstraintW;
       if (!p0) {
          return this.d;
       }
       View view = this.b.get(p0);
       if (view == null) {
          view = this.findViewById(p0);
          if (view != null && (view != this && view.getParent() == this)) {
             this.onViewAdded(view);
          }
       }
       if (view == this) {
          return this.d;
       }else if(view == null){
          uConstraintW = null;
       }else {
          uConstraintW = view.getLayoutParams().n0;
       }
       return uConstraintW;
    }
    public final void H(AttributeSet p0,int p1,int p2){
       this.d.p0(this);
       this.d.H1(this.x);
       this.b.put(this.getId(), this);
       this.k = null;
       if (p0 != null) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.a0, p1, p2);
          p1 = typedArray.getIndexCount();
          int i = 0;
          while (i < p1) {
             int index = typedArray.getIndex(i);
             if (index == 9) {
                this.e = typedArray.getDimensionPixelOffset(index, this.e);
             }else if(index == 10){
                this.f = typedArray.getDimensionPixelOffset(index, this.f);
             }else if(index == 7){
                this.g = typedArray.getDimensionPixelOffset(index, this.g);
             }else if(index == 8){
                this.h = typedArray.getDimensionPixelOffset(index, this.h);
             }else if(index == 90){
                this.j = typedArray.getInt(index, this.j);
             }else if(index == 39){
                index = typedArray.getResourceId(index, 0);
                if (index) {
                   try{
                      this.parseLayoutDescription(index);
                   }catch(android.content.res.Resources$NotFoundException e0){
                      this.l = e0;
                   }
                }
             }else if(index == 18){
                index = typedArray.getResourceId(index, 0);
                try{
                   a uoa = new a();
                   this.k = uoa;
                   uoa.D(this.getContext(), index);
                }catch(android.content.res.Resources$NotFoundException e0){
                   this.k = e0;
                }
                this.m = index;
             }
             i = i + 1;
          }
          typedArray.recycle();
       }
       this.d.I1(this.j);
       return;
    }
    public final void I(){
       this.i = true;
       this.o = -1;
       this.p = -1;
       this.q = -1;
       this.r = -1;
       this.s = 0;
       this.t = 0;
    }
    public final void J(){
       int i2;
       View childAt1;
       ConstraintWidget viewWid1;
       boolean b = this.isInEditMode();
       int childCount = this.getChildCount();
       int i = 0;
       int i1 = 0;
       while (i1 < childCount) {
          ConstraintWidget viewWid = this.getViewWidget(this.getChildAt(i1));
          if (viewWid != null) {
             viewWid.k0();
          }
          i1 = i1 + 1;
       }
       ConstraintLayout uConstraintL = -1;
       if (b) {
          i2 = 0;
          while (i2 < childCount) {
             View childAt = this.getChildAt(i2);
             try{
                String resourceName = this.getResources().getResourceName(childAt.getId());
                this.setDesignInformation(i, resourceName, Integer.valueOf(childAt.getId()));
                int i3 = resourceName.indexOf(47);
                if (i3 != uConstraintL) {
                   i3 = i3 + 1;
                   resourceName = resourceName.substring(i3);
                }
                this.G(childAt.getId()).q0(resourceName);
                i2 = i2 + 1;
             }catch(android.content.res.Resources$NotFoundException e0){
             }
          }
       }
       if (this.m != uConstraintL) {
          i1 = 0;
          while (i1 < childCount) {
             childAt1 = this.getChildAt(i1);
             if (childAt1.getId() == this.m && childAt1 instanceof Constraints) {
                this.k = childAt1.getConstraintSet();
             }
             i1 = i1 + 1;
          }
       }
       uConstraintL = this.k;
       if (uConstraintL != null) {
          uConstraintL.d(this, true);
       }
       this.d.h1();
       i1 = this.c.size();
       if (i1 > 0) {
          for (i2 = 0; i2 < i1; i2 = i2 + 1) {
             this.c.get(i2).v(this);
          }
       }
       i1 = 0;
       while (i1 < childCount) {
          childAt1 = this.getChildAt(i1);
          if (childAt1 instanceof Placeholder) {
             childAt1.c(this);
          }
          i1 = i1 + 1;
       }
       this.u.clear();
       this.u.put(i, this.d);
       this.u.put(this.getId(), this.d);
       for (i1 = 0; i1 < childCount; i1 = i1 + 1) {
          childAt1 = this.getChildAt(i1);
          viewWid1 = this.getViewWidget(childAt1);
          this.u.put(childAt1.getId(), viewWid1);
       }
       int i4 = 0;
       while (i4 < childCount) {
          childAt1 = this.getChildAt(i4);
          viewWid1 = this.getViewWidget(childAt1);
          if (viewWid1 != null) {
             this.d.c(viewWid1);
             this.applyConstraintsFromLayoutParams(b, childAt1, viewWid1, childAt1.getLayoutParams(), this.u);
          }
          i4 = i4 + 1;
       }
       return;
    }
    public final boolean K(){
       int childCount = this.getChildCount();
       boolean b = false;
       int i = 0;
       while (i < childCount) {
          if (this.getChildAt(i).isLayoutRequested()) {
             b = true;
             break ;
          }else {
             i = i + 1;
          }
       }
       if (b) {
          this.J();
       }
       return b;
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       super.addView(p0, p1, p2);
    }
    public void applyConstraintsFromLayoutParams(boolean p0,View p1,ConstraintWidget p2,ConstraintLayout$LayoutParams p3,SparseArray p4){
       ConstraintLayout$LayoutParams k0;
       ConstraintLayout$LayoutParams l0;
       ConstraintAnchor$Type obj1;
       ConstraintAnchor$Type lEFT;
       ConstraintLayout$LayoutParams layoutParams2;
       View view;
       Object obj2;
       ConstraintLayout uConstraintL = this;
       ConstraintWidget obj = p1;
       ConstraintWidget uConstraintW = p2;
       ConstraintLayout$LayoutParams layoutParams = p3;
       SparseArray sparseArray = p4;
       p3.c();
       layoutParams.o0 = false;
       uConstraintW.X0(p1.getVisibility());
       if (layoutParams.b0 != null) {
          uConstraintW.H0(true);
          uConstraintW.X0(8);
       }
       uConstraintW.p0(obj);
       if (obj instanceof ConstraintHelper) {
          obj.r(uConstraintW, uConstraintL.d.B1());
       }
       if (layoutParams.Z != null) {
          obj = uConstraintW;
          k0 = layoutParams.k0;
          l0 = layoutParams.l0;
          ConstraintLayout$LayoutParams m0 = layoutParams.m0;
          if (m0 - 0xbf800000) {
             obj.m1(m0);
          }else if(k0 != -1){
             obj.k1(k0);
          }else if(l0 != -1){
             obj.l1(l0);
          }
       }else {
          ConstraintLayout$LayoutParams d0 = layoutParams.d0;
          k0 = layoutParams.e0;
          ConstraintLayout$LayoutParams layoutParams1 = layoutParams.f0;
          ConstraintLayout$LayoutParams g0 = layoutParams.g0;
          ConstraintLayout$LayoutParams h0 = layoutParams.h0;
          ConstraintLayout$LayoutParams i0 = layoutParams.i0;
          ConstraintLayout$LayoutParams j0 = layoutParams.j0;
          l0 = layoutParams.m;
          if (l0 != -1) {
             obj = sparseArray.get(l0);
             if (obj != null) {
                uConstraintW.l(obj, layoutParams.o, layoutParams.n);
             }
          }else if(d0 != -1){
             obj1 = sparseArray.get(d0);
             if (obj1 != null) {
                lEFT = ConstraintAnchor$Type.LEFT;
                layoutParams2 = j0;
                p2.a0(lEFT, obj1, lEFT, layoutParams.leftMargin, h0);
             }else {
                layoutParams2 = j0;
             }
          }else {
             layoutParams2 = j0;
             if (k0 != -1) {
                obj2 = sparseArray.get(k0);
                if (obj2 != null) {
                   p2.a0(ConstraintAnchor$Type.LEFT, obj2, ConstraintAnchor$Type.RIGHT, layoutParams.leftMargin, h0);
                }
             }
          }
          if (layoutParams1 != -1) {
             obj1 = sparseArray.get(layoutParams1);
             if (obj1 != null) {
                p2.a0(ConstraintAnchor$Type.RIGHT, obj1, ConstraintAnchor$Type.LEFT, layoutParams.rightMargin, i0);
             }
          }else if(g0 != -1){
             obj2 = sparseArray.get(g0);
             if (obj2 != null) {
                lEFT = ConstraintAnchor$Type.RIGHT;
                p2.a0(lEFT, obj2, lEFT, layoutParams.rightMargin, i0);
             }
          }
          d0 = layoutParams.h;
          if (d0 != -1) {
             obj1 = sparseArray.get(d0);
             if (obj1 != null) {
                lEFT = ConstraintAnchor$Type.TOP;
                p2.a0(lEFT, obj1, lEFT, layoutParams.topMargin, layoutParams.u);
             }
          }else {
             d0 = layoutParams.i;
             if (d0 != -1) {
                obj2 = sparseArray.get(d0);
                if (obj2 != null) {
                   p2.a0(ConstraintAnchor$Type.TOP, obj2, ConstraintAnchor$Type.BOTTOM, layoutParams.topMargin, layoutParams.u);
                }
             }
          }
          d0 = layoutParams.j;
          if (d0 != -1) {
             obj1 = sparseArray.get(d0);
             if (obj1 != null) {
                p2.a0(ConstraintAnchor$Type.BOTTOM, obj1, ConstraintAnchor$Type.TOP, layoutParams.bottomMargin, layoutParams.w);
             }
          }else {
             d0 = layoutParams.k;
             if (d0 != -1) {
                obj2 = sparseArray.get(d0);
                if (obj2 != null) {
                   lEFT = ConstraintAnchor$Type.BOTTOM;
                   p2.a0(lEFT, obj2, lEFT, layoutParams.bottomMargin, layoutParams.w);
                }
             }
          }
          d0 = layoutParams.l;
          if (d0 != -1) {
             view = uConstraintL.b.get(d0);
             ConstraintWidget uConstraintW1 = sparseArray.get(layoutParams.l);
             if (uConstraintW1 != null && (view != null && view.getLayoutParams() instanceof ConstraintLayout$LayoutParams)) {
                d0 = view.getLayoutParams();
                layoutParams.Y = true;
                d0.Y = true;
                obj1 = ConstraintAnchor$Type.BASELINE;
                uConstraintW.p(obj1).b(uConstraintW1.p(obj1), false, -1, true);
                uConstraintW.y0(true);
                d0.n0.y0(true);
                uConstraintW.p(ConstraintAnchor$Type.TOP).q();
                uConstraintW.p(ConstraintAnchor$Type.BOTTOM).q();
             }
          }
          view = 0;
          k0 = layoutParams2;
          if (k0 - view >= 0) {
             uConstraintW.A0(k0);
          }
          k0 = layoutParams.A;
          if (k0 - view >= 0) {
             uConstraintW.R0(k0);
          }
          if (p0) {
             d0 = layoutParams.Q;
             if (d0 != -1 || layoutParams.R != -1) {
                uConstraintW.P0(d0, layoutParams.R);
             }
          }
          ViewGroup$MarginLayoutParams marginLayout = -2;
          if (layoutParams.W == null) {
             if (layoutParams.width == -1) {
                if (layoutParams.T != null) {
                   uConstraintW.D0(ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT);
                }else {
                   uConstraintW.D0(ConstraintWidget$DimensionBehaviour.MATCH_PARENT);
                }
                uConstraintW.p(ConstraintAnchor$Type.LEFT).g = layoutParams.leftMargin;
                uConstraintW.p(ConstraintAnchor$Type.RIGHT).g = layoutParams.rightMargin;
             }else {
                uConstraintW.D0(ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT);
                uConstraintW.Y0(false);
             }
          }else {
             uConstraintW.D0(ConstraintWidget$DimensionBehaviour.FIXED);
             uConstraintW.Y0(layoutParams.width);
             if (layoutParams.width == marginLayout) {
                uConstraintW.D0(ConstraintWidget$DimensionBehaviour.WRAP_CONTENT);
             }
          }
          if (layoutParams.X == null) {
             if (layoutParams.height == -1) {
                if (layoutParams.U != null) {
                   uConstraintW.U0(ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT);
                }else {
                   uConstraintW.U0(ConstraintWidget$DimensionBehaviour.MATCH_PARENT);
                }
                uConstraintW.p(ConstraintAnchor$Type.TOP).g = layoutParams.topMargin;
                uConstraintW.p(ConstraintAnchor$Type.BOTTOM).g = layoutParams.bottomMargin;
             }else {
                uConstraintW.U0(ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT);
                uConstraintW.z0(false);
             }
          }else {
             uConstraintW.U0(ConstraintWidget$DimensionBehaviour.FIXED);
             uConstraintW.z0(layoutParams.height);
             if (layoutParams.height == marginLayout) {
                uConstraintW.U0(ConstraintWidget$DimensionBehaviour.WRAP_CONTENT);
             }
          }
          uConstraintW.r0(layoutParams.B);
          uConstraintW.F0(layoutParams.E);
          uConstraintW.W0(layoutParams.F);
          uConstraintW.B0(layoutParams.G);
          uConstraintW.S0(layoutParams.H);
          uConstraintW.E0(layoutParams.I, layoutParams.K, layoutParams.M, layoutParams.O);
          uConstraintW.V0(layoutParams.J, layoutParams.L, layoutParams.N, layoutParams.P);
       }
       return;
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       return p0 instanceof ConstraintLayout$LayoutParams;
    }
    public void dispatchDraw(Canvas p0){
       int i;
       ConstraintLayout uConstraintL = this;
       ConstraintLayout c = uConstraintL.c;
       if (c != null) {
          i = c.size();
          if (i > 0) {
             for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                uConstraintL.c.get(i1).t(uConstraintL);
             }
          }
       }
       super.dispatchDraw(p0);
       if (this.isInEditMode()) {
          i = this.getChildCount();
          float f = (float)this.getWidth();
          float f1 = (float)this.getHeight();
          int i2 = 0;
          while (i2 < i) {
             View childAt = uConstraintL.getChildAt(i2);
             if (childAt.getVisibility() != 8) {
                String[] tag = childAt.getTag();
                if (tag != null && tag instanceof String) {
                   tag = tag.split(",");
                   if (tag.length == 4) {
                      float f2 = (float)Integer.parseInt(tag[0]) / 1080.00f;
                      f2 = f2 * f;
                      int i3 = (int)f2;
                      float f3 = (float)Integer.parseInt(tag[1]) / 0x44f00000;
                      f3 = f3 * f1;
                      int i4 = (int)f3;
                      float f4 = (float)Integer.parseInt(tag[2]) / 1080.00f;
                      f4 = f4 * f;
                      float f5 = (float)Integer.parseInt(tag[3]) / 0x44f00000;
                      f5 = f5 * f1;
                      Paint paint = new Paint();
                      paint.setColor(0xffff0000);
                      float f6 = (float)i3;
                      i3 = i3 + (int)f4;
                      f2 = (float)i3;
                      Canvas uCanvas = p0;
                      f4 = (float)i4;
                      float f7 = f6;
                      float f8 = f6;
                      f6 = f4;
                      Paint paint1 = paint;
                      float f9 = f2;
                      Paint paint2 = paint1;
                      uCanvas.drawLine(f7, f6, f9, f4, paint2);
                      i4 = i4 + (int)f5;
                      f5 = (float)i4;
                      f7 = f2;
                      float f10 = f5;
                      uCanvas.drawLine(f7, f6, f9, f10, paint2);
                      f6 = f5;
                      f9 = f8;
                      uCanvas.drawLine(f7, f6, f9, f10, paint2);
                      f7 = f8;
                      uCanvas.drawLine(f7, f6, f9, f4, paint2);
                      paint = paint1;
                      paint.setColor(-16711936);
                      Paint paint3 = paint;
                      f9 = f2;
                      paint2 = paint3;
                      uCanvas.drawLine(f7, f4, f9, f5, paint2);
                      uCanvas.drawLine(f7, f5, f9, f4, paint2);
                   }
                }
             }
             i2 = i2 + 1;
          }
       }
       return;
    }
    public void forceLayout(){
       this.I();
       super.forceLayout();
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return this.generateDefaultLayoutParams();
    }
    public ConstraintLayout$LayoutParams generateDefaultLayoutParams(){
       return new ConstraintLayout$LayoutParams(-2, -2);
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return this.generateLayoutParams(p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       return new ConstraintLayout$LayoutParams(p0);
    }
    public ConstraintLayout$LayoutParams generateLayoutParams(AttributeSet p0){
       return new ConstraintLayout$LayoutParams(this.getContext(), p0);
    }
    public Object getDesignInformation(int p0,Object p1){
       if (!p0 && p1 instanceof String) {
          ConstraintLayout tn = this.n;
          if (tn != null && tn.containsKey(p1)) {
             return this.n.get(p1);
          }
       }
       return null;
    }
    public int getMaxHeight(){
       return this.h;
    }
    public int getMaxWidth(){
       return this.g;
    }
    public int getMinHeight(){
       return this.f;
    }
    public int getMinWidth(){
       return this.e;
    }
    public int getOptimizationLevel(){
       return this.d.w1();
    }
    public final int getPaddingWidth(){
       int i = Math.max(0, this.getPaddingLeft()) + Math.max(0, this.getPaddingRight());
       int i1 = Math.max(0, this.getPaddingStart()) + Math.max(0, this.getPaddingEnd());
       if (i1 > 0) {
          i = i1;
       }
       return i;
    }
    public View getViewById(int p0){
       return this.b.get(p0);
    }
    public final ConstraintWidget getViewWidget(View p0){
       if (p0 == this) {
          return this.d;
       }
       ConstraintWidget uConstraintW = (p0 == null)? null: p0.getLayoutParams().n0;
       return uConstraintW;
    }
    public boolean isRtl(){
       boolean b = false;
       int i = (this.getContext().getApplicationInfo().flags & 0x400000)? 1: 0;
       if (i && 1 == this.getLayoutDirection()) {
          b = true;
       }
       return b;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int childCount = this.getChildCount();
       boolean b = this.isInEditMode();
       p2 = 0;
       p3 = 0;
       while (p3 < childCount) {
          View childAt = this.getChildAt(p3);
          ConstraintLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          ConstraintLayout$LayoutParams n0 = layoutParams.n0;
          if (childAt.getVisibility() != 8 || (layoutParams.Z != null || (layoutParams.a0 != null || (layoutParams.c0 != null || (b && layoutParams.b0 == null))))) {
             int i = n0.V();
             int i1 = n0.W();
             int i2 = n0.U() + i;
             int i3 = n0.y() + i1;
             childAt.layout(i, i1, i2, i3);
             if (childAt instanceof Placeholder) {
                childAt = childAt.getContent();
                if (childAt != null) {
                   childAt.setVisibility(p2);
                   childAt.layout(i, i1, i2, i3);
                }
             }
          }
          p3++;
       }
       childCount = this.c.size();
       if (childCount > 0) {
          for (; p2 < childCount; p2++) {
             this.c.get(p2).s(this);
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       boolean b = false;
       if (this.i == null) {
          int childCount = this.getChildCount();
          int i = 0;
          while (i < childCount) {
             if (this.getChildAt(i).isLayoutRequested()) {
                this.i = true;
                break ;
             }
             i = i + 1;
          }
       }
       if (this.i == null) {
          ConstraintLayout ty = this.y;
          if (ty == p0 && this.z == p1) {
             this.resolveMeasuredDimension(p0, p1, this.d.U(), this.d.y(), this.d.C1(), this.d.A1());
             return;
          }else if(ty == p0 && View$MeasureSpec.getMode(p0) == 0x40000000){
             ConstraintLayout uConstraintL = Integer.MIN_VALUE;
             if (View$MeasureSpec.getMode(p1) == uConstraintL && (View$MeasureSpec.getMode(this.z) == uConstraintL && View$MeasureSpec.getSize(p1) >= this.d.y())) {
                this.y = p0;
                this.z = p1;
                this.resolveMeasuredDimension(p0, p1, this.d.U(), this.d.y(), this.d.C1(), this.d.A1());
                return;
             }
          }
       }
       this.y = p0;
       this.z = p1;
       this.d.J1(this.isRtl());
       if (this.i != null) {
          this.i = b;
          if (this.K()) {
             this.d.L1();
          }
       }
       this.resolveSystem(this.d, this.j, p0, p1);
       this.resolveMeasuredDimension(p0, p1, this.d.U(), this.d.y(), this.d.C1(), this.d.A1());
       return;
    }
    public void onViewAdded(View p0){
       super.onViewAdded(p0);
       ConstraintWidget viewWid = this.getViewWidget(p0);
       if (p0 instanceof Guideline && !viewWid instanceof f) {
          ConstraintLayout$LayoutParams layoutParams = p0.getLayoutParams();
          f uof = new f();
          layoutParams.n0 = uof;
          layoutParams.Z = true;
          uof.n1(layoutParams.S);
       }
       if (p0 instanceof ConstraintHelper) {
          ConstraintHelper uConstraintH = p0;
          uConstraintH.w();
          p0.getLayoutParams().a0 = true;
          if (!this.c.contains(uConstraintH)) {
             this.c.add(uConstraintH);
          }
       }
       this.b.put(p0.getId(), p0);
       this.i = true;
       return;
    }
    public void onViewRemoved(View p0){
       super.onViewRemoved(p0);
       this.b.remove(p0.getId());
       this.d.g1(this.getViewWidget(p0));
       this.c.remove(p0);
       this.i = true;
    }
    public void parseLayoutDescription(int p0){
       this.l = new a(this.getContext(), this, p0);
    }
    public void removeView(View p0){
       super.removeView(p0);
    }
    public void requestLayout(){
       this.I();
       super.requestLayout();
    }
    public void resolveMeasuredDimension(int p0,int p1,int p2,int p3,boolean p4,boolean p5){
       ConstraintLayout tx = this.x;
       p0 = Math.min(this.g, (ViewGroup.resolveSizeAndState((p2 + tx.d), p0, 0) & 0xffffff));
       p1 = Math.min(this.h, (ViewGroup.resolveSizeAndState((p3 + tx.e), p1, 0) & 0xffffff));
       if (p4) {
          p0 = p0 | 0x1000000;
       }
       if (p5) {
          p1 = p1 | 0x1000000;
       }
       this.setMeasuredDimension(p0, p1);
       this.o = p0;
       this.p = p1;
       return;
    }
    public void resolveSystem(d p0,int p1,int p2,int p3){
       int i6;
       ConstraintLayout uConstraintL = this;
       int mode = View$MeasureSpec.getMode(p2);
       int size = View$MeasureSpec.getSize(p2);
       int mode1 = View$MeasureSpec.getMode(p3);
       int size1 = View$MeasureSpec.getSize(p3);
       int i = 0;
       int i1 = Math.max(i, this.getPaddingTop());
       int i2 = Math.max(i, this.getPaddingBottom());
       int i3 = i1 + i2;
       int paddingWidth = this.getPaddingWidth();
       uConstraintL.x.c(p2, p3, i1, i2, paddingWidth, i3);
       int i4 = Math.max(i, this.getPaddingStart());
       int i5 = Math.max(i, this.getPaddingEnd());
       if (i4 > 0 || i5 > 0) {
          i6 = (this.isRtl())? i5: i4;
       }else {
          i6 = Math.max(i, this.getPaddingLeft());
       }
       int i7 = size - paddingWidth;
       int i8 = size1 - i3;
       this.setSelfDimensionBehaviour(p0, mode, i7, mode1, i8);
       p0.D1(p1, mode, i7, mode1, i8, uConstraintL.o, uConstraintL.p, i6, i1);
       return;
    }
    public void setConstraintSet(a p0){
       this.k = p0;
    }
    public void setDesignInformation(int p0,Object p1,Object p2){
       if (!p0 && (p1 instanceof String && p2 instanceof Integer)) {
          if (this.n == null) {
             this.n = new HashMap();
          }
          p0 = p1.indexOf("/");
          if (p0 != -1) {
             p0++;
             p1 = p1.substring(p0);
          }
          this.n.put(p1, Integer.valueOf(p2.intValue()));
       }
    label_0035 :
       return;
    }
    public void setId(int p0){
       this.b.remove(this.getId());
       super.setId(p0);
       this.b.put(this.getId(), this);
    }
    public void setMaxHeight(int p0){
       if (p0 == this.h) {
          return;
       }
       this.h = p0;
       this.requestLayout();
       return;
    }
    public void setMaxWidth(int p0){
       if (p0 == this.g) {
          return;
       }
       this.g = p0;
       this.requestLayout();
       return;
    }
    public void setMinHeight(int p0){
       if (p0 == this.f) {
          return;
       }
       this.f = p0;
       this.requestLayout();
       return;
    }
    public void setMinWidth(int p0){
       if (p0 == this.e) {
          return;
       }
       this.e = p0;
       this.requestLayout();
       return;
    }
    public void setOnConstraintsChanged(b p0){
       ConstraintLayout tl = this.l;
       if (tl != null) {
          Objects.requireNonNull(tl);
       }
       return;
    }
    public void setOptimizationLevel(int p0){
       this.j = p0;
       this.d.I1(p0);
    }
    public void setSelfDimensionBehaviour(d p0,int p1,int p2,int p3,int p4){
       ConstraintWidget$DimensionBehaviour uDimensionBe;
       ConstraintLayout tx = this.x;
       ConstraintLayout$b e = tx.e;
       ConstraintLayout$b d = tx.d;
       ConstraintWidget$DimensionBehaviour fIXED = ConstraintWidget$DimensionBehaviour.FIXED;
       int childCount = this.getChildCount();
       if (p1 != Integer.MIN_VALUE) {
          if (p1) {
             if (p1 != 0x40000000) {
                uDimensionBe = fIXED;
             }else {
                p2 = Math.min((this.g - d), p2);
                uDimensionBe = fIXED;
             }
          }else {
             uDimensionBe = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
             if (!childCount) {
                p2 = Math.max(0, this.e);
             }
          }
          p2 = 0;
       }else {
          uDimensionBe = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
          if (!childCount) {
             p2 = Math.max(0, this.e);
          }
       }
       if (p3 != Integer.MIN_VALUE) {
          if (p3) {
             if (p3 == 0x40000000) {
                p4 = Math.min((this.h - e), p4);
             }
          }else {
             fIXED = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
             if (!childCount) {
                p4 = Math.max(0, this.f);
             }
          }
          p4 = 0;
       }else {
          fIXED = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
          if (!childCount) {
             p4 = Math.max(0, this.f);
          }
       }
       if (p2 != p0.U() || p4 != p0.y()) {
          p0.z1();
       }
       p0.Z0(0);
       p0.a1(0);
       p0.L0((this.g - d));
       p0.K0((this.h - e));
       p0.O0(0);
       p0.N0(0);
       p0.D0(uDimensionBe);
       p0.Y0(p2);
       p0.U0(fIXED);
       p0.z0(p4);
       p0.O0((this.e - d));
       p0.N0((this.f - e));
       return;
    }
    public boolean shouldDelayChildPressedState(){
       return false;
    }
}
