package com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroup;
import android.view.ViewGroup;
import android.content.Context;
import java.util.HashSet;
import android.os.Build$VERSION;
import android.graphics.Rect;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import android.util.SparseIntArray;
import android.widget.Scroller;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import lnc.i3;
import java.lang.Number;
import com.yxcorp.gifshow.util.PostUtils;
import j8c.a;
import java.lang.StringBuilder;
import w46.b;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroup$LayoutParams;
import eh9.g;
import java.lang.Runnable;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Float;
import android.view.ViewParent;
import java.lang.Boolean;
import q87.c;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroup$a;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.IllegalArgumentException;
import a2.i0;
import java.lang.Math;
import android.view.MotionEvent;
import java.util.Objects;
import java.lang.IndexOutOfBoundsException;
import android.content.res.Resources;
import android.content.res.ColorStateList;

public class CameraScrollTabViewGroup extends ViewGroup	// class@000f30
{
    public int b;
    public float c;
    public float d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public View n;
    public final Scroller o;
    public int p;
    public CameraScrollTabViewGroup$a q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public final HashSet w;
    public final List x;
    public SparseIntArray y;
    public SparseIntArray z;
    public static final int A;

    public void CameraScrollTabViewGroup(Context p0){
       List list;
       super(p0);
       this.c = 0;
       this.d = 0;
       this.e = 0;
       int i = 0;
       this.f = i;
       this.g = i;
       this.h = -1;
       this.i = i;
       this.j = -1;
       this.k = i;
       this.l = -1;
       this.m = -1;
       this.p = 150;
       this.r = i;
       this.s = i;
       this.t = i;
       this.u = i;
       this.v = i;
       this.w = new HashSet();
       if (Build$VERSION.SDK_INT >= 29) {
          Rect[] rectArray = new Rect[]{new Rect()};
          list = Arrays.asList(rectArray);
       }else {
          list = null;
       }
       this.x = list;
       this.y = new SparseIntArray(5);
       this.z = new SparseIntArray(5);
       this.o = new Scroller(p0, new AccelerateDecelerateInterpolator());
       this.b = 0x800033;
       return;
    }
    public void CameraScrollTabViewGroup(Context p0,AttributeSet p1){
       List list;
       super(p0, p1);
       this.c = 0;
       this.d = 0;
       this.e = 0;
       int i = 0;
       this.f = i;
       this.g = i;
       this.h = -1;
       this.i = i;
       this.j = -1;
       this.k = i;
       this.l = -1;
       this.m = -1;
       this.p = 150;
       this.r = i;
       this.s = i;
       this.t = i;
       this.u = i;
       this.v = i;
       this.w = new HashSet();
       if (Build$VERSION.SDK_INT >= 29) {
          Rect[] rectArray = new Rect[]{new Rect()};
          list = Arrays.asList(rectArray);
       }else {
          list = null;
       }
       this.x = list;
       this.y = new SparseIntArray(5);
       this.z = new SparseIntArray(5);
       this.o = new Scroller(p0, new AccelerateDecelerateInterpolator());
       this.b = this.d(p0, p1);
       return;
    }
    public void CameraScrollTabViewGroup(Context p0,AttributeSet p1,int p2){
       List list;
       super(p0, p1, p2);
       this.c = 0;
       this.d = 0;
       this.e = 0;
       p2 = 0;
       this.f = p2;
       this.g = p2;
       this.h = -1;
       this.i = p2;
       this.j = -1;
       this.k = p2;
       this.l = -1;
       this.m = -1;
       this.p = 150;
       this.r = p2;
       this.s = p2;
       this.t = p2;
       this.u = p2;
       this.v = p2;
       this.w = new HashSet();
       if (Build$VERSION.SDK_INT >= 29) {
          Rect[] rectArray = new Rect[]{new Rect()};
          list = Arrays.asList(rectArray);
       }else {
          list = null;
       }
       this.x = list;
       this.y = new SparseIntArray(5);
       this.z = new SparseIntArray(5);
       this.o = new Scroller(p0, new AccelerateDecelerateInterpolator());
       this.b = this.d(p0, p1);
       return;
    }
    public void a(int p0){
       if (PatchProxy.isSupport(CameraScrollTabViewGroup.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CameraScrollTabViewGroup.class, "23")) {
          return;
       }
       if (p0 != -1 && p0 == this.m) {
          return;
       }
       int i = this.f(p0);
       if (i < 0) {
          return;
       }
       this.m = p0;
       this.setSelected(i);
       return;
    }
    public void b(int p0){
       if (PatchProxy.isSupport(CameraScrollTabViewGroup.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CameraScrollTabViewGroup.class, "14")) {
          return;
       }
       Rect rect = new Rect();
       View childAt = this.getChildAt(p0);
       int i = 0;
       if (childAt != null) {
          childAt.getGlobalVisibleRect(rect);
          this.scrollBy((((rect.right + rect.left) / 2) - (this.getWidth() / 2)), i);
       }else {
          i3 oi3 = i3.f();
          oi3.c("tabSize", Integer.valueOf(this.getChildCount()));
          oi3.c("index", Integer.valueOf(p0));
          PostUtils.x("ScrollTabViewGroup", oi3.e());
          Object[] objArray = new Object[i];
          a.D().t("ScrollTabViewGroup", "doScrollView crash! scroll tab size:"+this.getChildCount()+" , index:"+p0, objArray);
       }
       return;
    }
    public final int c(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroup.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return -1;
       }
       if (p0.getTag() != null && p0 instanceof TextView) {
          return p0.getId();
       }
       if (p0 instanceof ViewGroup) {
          int i = 0;
          while (i < p0.getChildCount()) {
             int i1 = this.c(p0.getChildAt(i));
             if (i1 == -1) {
                i = i + 1;
             }else {
                return i1;
             }
          }
       }
       return -1;
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       return p0 instanceof CameraScrollTabViewGroup$LayoutParams;
    }
    public void computeScroll(){
       if (PatchProxy.applyVoid(null, this, CameraScrollTabViewGroup.class, "6")) {
          return;
       }
       if (this.o.computeScrollOffset()) {
          this.scrollTo(this.o.getCurrX(), this.o.getCurrY());
          this.invalidate();
       }else {
          this.post(new g(this));
       }
       super.computeScroll();
       return;
    }
    public final int d(Context p0,AttributeSet p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, CameraScrollTabViewGroup.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.O4);
       this.r = typedArray.getInt(1, 0);
       typedArray.recycle();
       return typedArray.getInt(0, -1);
    }
    public final int e(float p0,float p1){
       if (PatchProxy.isSupport(CameraScrollTabViewGroup.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, CameraScrollTabViewGroup.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = (int)p0;
       int i1 = -1;
       int childCount = this.getChildCount();
       int i2 = 0;
       while (i2 < childCount) {
          View childAt = this.getChildAt(i2);
          if (!childAt.getVisibility()) {
             Rect rect = new Rect();
             childAt.getGlobalVisibleRect(rect);
             Rect left = rect.left;
             rect = rect.right;
             if (left < rect && (i >= left && i < rect)) {
                i1 = i2;
                break ;
             }
          }
          i2 = i2 + 1;
       }
       return i1;
    }
    public final int f(int p0){
       View obj;
       if (PatchProxy.isSupport(CameraScrollTabViewGroup.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CameraScrollTabViewGroup.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.y.get(p0, -1) != -1) {
          return this.y.get(p0);
       }else {
          obj = this.findViewById(p0);
          if (obj == null) {
             return -1;
          }else {
             while (obj.getParent() == null || (obj.getParent() instanceof ViewGroup && obj.getParent() != this)) {
                ViewGroup parent = obj.getParent();
             }
             if (obj.getParent() != this) {
                return -1;
             }else {
                int i = 0;
                while (true) {
                   if (i >= this.getChildCount()) {
                      return -1;
                   }
                   if (this.getChildAt(i).getVisibility() != 8 && this.getChildAt(i) == obj) {
                      break ;
                   }else {
                      i = i + 1;
                   }
                }
                this.y.put(p0, i);
                return i;
             }
          }
       }
    }
    public int g(int p0){
       if (PatchProxy.isSupport(CameraScrollTabViewGroup.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CameraScrollTabViewGroup.class, "27");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = -1;
       int i1 = this.z.get(p0, i);
       if (i1 != i) {
          return i1;
       }else {
          i1 = this.c(this.getChildAt(p0));
          this.z.put(p0, i1);
          return i1;
       }
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, CameraScrollTabViewGroup.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CameraScrollTabViewGroup$LayoutParams(-2, -2);
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroup.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CameraScrollTabViewGroup$LayoutParams(this.getContext(), p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroup.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CameraScrollTabViewGroup$LayoutParams(p0);
    }
    public int getCheckedId(){
       return this.m;
    }
    public final View[] getUnSelectTab(){
       View[] obj = PatchProxy.apply(null, this, CameraScrollTabViewGroup.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int childCount = this.getChildCount();
       int i = 0;
       if (childCount <= 1) {
          obj = new View[i];
          return obj;
       }else {
          View[] viewArray = new View[(childCount - 1)];
          int i1 = 0;
          while (i < childCount) {
             View childAt = this.getChildAt(i);
             if (childAt.getId() != this.m) {
                int i2 = i1 + 1;
                viewArray[i1] = childAt;
                i1 = i2;
             }
             i = i + 1;
          }
          return viewArray;
       }
    }
    public final boolean h(int p0){
       if (PatchProxy.isSupport(CameraScrollTabViewGroup.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CameraScrollTabViewGroup.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (p0 >= 0 && p0 < this.getChildCount())? true: false;
       return b;
    }
    public boolean i(){
       return this.k;
    }
    public boolean j(){
       Object obj = PatchProxy.apply(null, this, CameraScrollTabViewGroup.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.o.isFinished();
    }
    public boolean k(){
       boolean b = (this.c)? true: false;
       return b;
    }
    public final void l(int p0){
       if (PatchProxy.isSupport(CameraScrollTabViewGroup.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CameraScrollTabViewGroup.class, "8")) {
          return;
       }
       if (p0 == this.t) {
          return;
       }
       this.t = p0;
       CameraScrollTabViewGroup tn = this.n;
       if (tn != null && tn instanceof TextView) {
          boolean b = false;
          tn.setSelected(b);
          tn = this.s;
          if (tn != null) {
             this.n.setTextSize(b, (float)tn);
          }
       }
       View view = this.findViewById(p0);
       if (view instanceof TextView) {
          view.setSelected(true);
          if (this.s == null) {
             this.s = (int)view.getTextSize();
          }
          tn = this.r;
          if (tn != null) {
             view.setTextSize(2, (float)tn);
          }
       }
       this.n = view;
       return;
    }
    public final void m(int p0){
       if (PatchProxy.isSupport(CameraScrollTabViewGroup.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CameraScrollTabViewGroup.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("ScrollTabViewGroup", "setSelected:"+p0, objArray);
       if (p0 < this.getChildCount() && p0 >= 0) {
          this.j = p0;
          if (this.l == p0) {
             return;
          }else {
             this.l = p0;
             CameraScrollTabViewGroup tq = this.q;
             if (tq != null) {
                tq.b(this.findViewById(this.g(p0)));
             }
             p0 = this.g(this.l);
             this.m = p0;
             this.l(p0);
          }
       }
       return;
    }
    public void n(int p0){
       if (PatchProxy.isSupport(CameraScrollTabViewGroup.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CameraScrollTabViewGroup.class, "15")) {
          return;
       }
       this.b(p0);
       this.m(p0);
       return;
    }
    public void o(float p0,float p1,float p2,int p3){
       if (PatchProxy.isSupport(CameraScrollTabViewGroup.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Integer.valueOf(p3), this, CameraScrollTabViewGroup.class, "22")) {
          return;
       }
       int i = 0;
       while (i < this.getChildCount()) {
          TextView textView = this.findViewById(this.g(i));
          if (textView != null) {
             textView.setShadowLayer(p0, p1, p2, p3);
          }
          i = i + 1;
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i4;
       int i5;
       ViewGroup$MarginLayoutParams topMargin;
       int i7;
       View childAt1;
       Object obj = this;
       int i = 2;
       if (PatchProxy.isSupport(CameraScrollTabViewGroup.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, obj, CameraScrollTabViewGroup.class, "3")) {
             return;
          }
       }
       int childCount = this.getChildCount();
       int i1 = obj.f(obj.m);
       if (!obj.h(i1) || obj.getChildAt(i1).getVisibility() == 8) {
          i1 = 0;
       }
       int paddingTop = this.getPaddingTop();
       int i2 = (p4 - p2) - paddingTop;
       int i3 = 0;
       while (true) {
          if (i3 < childCount) {
             View childAt = obj.getChildAt(i3);
             if (childAt.getVisibility() != 8) {
                CameraScrollTabViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
                CameraScrollTabViewGroup b = obj.b;
                if (b == -1) {
                   b = 0x800033;
                }
                if (PatchProxy.isSupport(CameraScrollTabViewGroup.class)) {
                   Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(i3), Integer.valueOf(i1), obj, CameraScrollTabViewGroup.class, "4");
                   if (obj1 != PatchProxyResult.class) {
                      i4 = obj1.intValue();
                   }else if(obj.h(i3)){
                      i4 = this.getWidth() - obj.getChildAt(i1).getMeasuredWidth();
                      i4 = i4 / i;
                      i5 = this.getWidth() + obj.getChildAt(i1).getMeasuredWidth();
                      i5 = i5 / i;
                      if (i3 != i1) {
                         if (i3 > i1) {
                            i4 = i1 + 1;
                            while (i4 < i3) {
                               childAt1 = obj.getChildAt(i4);
                               if (childAt1.getVisibility() != 8) {
                                  i5 = i5 + childAt1.getMeasuredWidth();
                               }
                               i4 = i4 + 1;
                            }
                            i4 = i5;
                         }
                         if (i3 < i1) {
                            i5 = i1 - 1;
                            while (i5 >= i3) {
                               childAt1 = obj.getChildAt(i5);
                               if (childAt1.getVisibility() != 8) {
                                  i4 = i4 - childAt1.getMeasuredWidth();
                               }
                               i5 = i5 - 1;
                            }
                         }
                      }
                   }else {
                      throw new IllegalArgumentException(" Illegal argument ");
                   }
                }else {
                   goto label_009d ;
                }
                i5 = childAt.getMeasuredWidth() + i4;
                int measuredHeig = childAt.getMeasuredHeight();
                int i6 = b & 0x70;
                if (i6 != 16) {
                   if (i6 != 48) {
                      if (i6 != 80) {
                         topMargin = layoutParams.topMargin;
                      }else {
                         i6 = i2 - measuredHeig;
                         topMargin = layoutParams.bottomMargin;
                      }
                   }else {
                      topMargin = layoutParams.topMargin;
                   }
                   i7 = topMargin + paddingTop;
                label_0122 :
                   measuredHeig = measuredHeig + i7;
                   childAt.layout(i4, i7, i5, measuredHeig);
                }else {
                   i6 = i2 - paddingTop;
                   i6 = i6 - measuredHeig;
                   i6 = i6 / i;
                   i6 = i6 + paddingTop;
                   i6 = i6 + layoutParams.topMargin;
                   topMargin = layoutParams.bottomMargin;
                }
                i7 = i6 - topMargin;
                goto label_0122 ;
             }
             i3 = i3 + 1;
          }else {
             obj.o.startScroll(0, 0, 0, 0, 0);
             obj.l(obj.m);
             CameraScrollTabViewGroup x = obj.x;
             if (x != null && p0) {
                x.get(0).set(0, 0, this.getWidth(), this.getHeight());
                i0.M0(obj, obj.x);
                break ;
             }
             break ;
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(CameraScrollTabViewGroup.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CameraScrollTabViewGroup.class, "7")) {
          return;
       }
       int childCount = this.getChildCount();
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          if (childAt.getVisibility() != 8) {
             ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
             this.measureChildWithMargins(childAt, p0, 0, p1, 0);
             int i3 = childAt.getMeasuredWidth() + layoutParams.leftMargin;
             i3 = i3 + layoutParams.rightMargin;
             i1 = i1 + i3;
             i3 = childAt.getMeasuredHeight() + layoutParams.topMargin;
             i3 = i3 + layoutParams.bottomMargin;
             i2 = Math.max(i2, i3);
          }
          i = i + 1;
       }
       this.setMeasuredDimension(ViewGroup.resolveSize(Math.max((i1 + (this.getPaddingLeft() + this.getPaddingRight())), this.getSuggestedMinimumWidth()), p0), ViewGroup.resolveSize(Math.max((i2 + (this.getPaddingTop() + this.getPaddingBottom())), this.getSuggestedMinimumHeight()), p1));
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       int i;
       Rect obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroup.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.isEnabled()) {
          return false;
       }
       float f = 0;
       CameraScrollTabViewGroup uCameraScrol = -1;
       if (!p0.getAction()) {
          if (!this.o.isFinished()) {
             this.o.abortAnimation();
             this.scrollTo(this.o.getFinalX(), this.o.getFinalY());
          }
          this.c = p0.getX();
          this.e = p0.getX();
          if (!PatchProxy.applyVoid(null, this, CameraScrollTabViewGroup.class, "13")) {
             i = this.getChildCount();
             int i1 = 0;
             while (i1 < i) {
                if (!this.getChildAt(i1).getVisibility()) {
                   this.i = i1;
                   if (this.h == uCameraScrol) {
                      this.h = i1;
                   }
                }
                i1 = i1 + 1;
             }
             if (this.h < null) {
                this.h = 0;
             }
          }
          if (this.getChildAt(this.h) == null || this.getChildAt(this.i) == null) {
             this.f = 0;
             this.g = 0;
             this.k = false;
             this.c = f;
             return false;
          }
       }
       if (p0.getAction() == 1) {
          float x = p0.getX();
          this.d = x;
          if (Math.abs((x - this.c)) - 0x42300000 < 0 && this.k == null) {
             i = this.e(p0.getX(), p0.getY());
             if (i > uCameraScrol) {
                if (i == this.l) {
                   this.b(i);
                }
                this.m = this.g(i);
                this.setSelected(i);
             }else {
                this.b(this.l);
             }
          }else {
             obj = new Rect();
             this.getChildAt(this.h).getGlobalVisibleRect(obj);
             this.f = obj.left;
             obj = new Rect();
             this.getChildAt(this.i).getGlobalVisibleRect(obj);
             this.g = obj.right;
             if (this.f >= (this.getWidth() / 2)) {
                this.n(this.h);
             }else if(this.g <= (this.getWidth() / 2)){
                this.n(this.i);
             }else {
                i = this.e((float)(this.getWidth() / 2), p0.getY());
                if (i > uCameraScrol) {
                   this.m = this.g(i);
                   this.n(i);
                }
             }
          }
          this.f = 0;
          this.g = 0;
          this.k = false;
          this.c = f;
       }else if(p0.getAction() == 3){
          this.n(this.l);
          this.f = 0;
          this.g = 0;
          this.k = false;
          this.c = f;
       }
       if (p0.getAction() == 2) {
          if (!this.o.isFinished()) {
             this.o.abortAnimation();
          }
          if (Math.abs((p0.getX() - this.c)) - 0x42300000 > 0) {
             this.k = true;
          }
          obj = new Rect();
          this.getChildAt(this.h).getGlobalVisibleRect(obj);
          this.f = obj.left;
          obj = new Rect();
          this.getChildAt(this.i).getGlobalVisibleRect(obj);
          this.g = obj.right;
          float f1 = (float)(int)p0.getX();
          i = (int)(this.e - f1);
          if (this.f > (this.getWidth() / 2) || this.g < (this.getWidth() / 2)) {
             this.scrollBy((i / 10), false);
          }else {
             this.scrollBy(i, false);
          }
          this.e = f1;
       }
       return true;
    }
    public void setItemSelectedTextSize(int p0){
       if (PatchProxy.isSupport(CameraScrollTabViewGroup.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CameraScrollTabViewGroup.class, "34")) {
          return;
       }
       this.r = p0;
       this.invalidate();
       return;
    }
    public void setLayoutGravity(String p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraScrollTabViewGroup.class, "31")) {
          return;
       }
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraScrollTabViewGroup.class, "32");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          String[] stringArray = p0.split("\\|");
          int i1 = 0;
          for (int i2 = 0; i2 < stringArray.length; i2 = i2 + 1) {
             object oobject = stringArray[i2];
             Object obj1 = PatchProxy.applyOneRefs(oobject, this, CameraScrollTabViewGroup.class, "33");
             int i3 = 8;
             if (obj1 != PatchProxyResult.class) {
                i3 = obj1.intValue();
             }else {
                Objects.requireNonNull(oobject);
                int i4 = -1;
                switch (oobject.hashCode()){
                    case 0x9eaa26b2:
                      if (oobject.equals("fill_vertical")) {
                         i4 = 0;
                      }
                      break;
                    case 0xad8d9a2b:
                      if (oobject.equals("bottom")) {
                         i4 = 1;
                      }
                      break;
                    case 0xaeb2cc55:
                      if (oobject.equals("center")) {
                         i4 = 2;
                      }
                      break;
                    case 0xce750c73:
                      if (oobject.equals("clip_horizontal")) {
                         i4 = 3;
                      }
                      break;
                    case 0xe3306c60:
                      if (oobject.equals("fill_horizontal")) {
                         i4 = 4;
                      }
                      break;
                    case 0xeb36dc20:
                      if (oobject.equals("center_vertical")) {
                         i4 = 5;
                      }
                      break;
                    case 0xfcadaf85:
                      if (oobject.equals("clip_vertical")) {
                         i4 = 6;
                      }
                      break;
                    case 0x188db:
                      if (oobject.equals("end")) {
                         i4 = 7;
                      }
                      break;
                    case 0x1c155:
                      if (oobject.equals("top")) {
                         i4 = 8;
                      }
                      break;
                    case 0x2ff583:
                      if (oobject.equals("fill")) {
                         i4 = 9;
                      }
                      break;
                    case 0x677c21c:
                      if (oobject.equals("right")) {
                         i4 = 10;
                      }
                      break;
                    case 0x68ac462:
                      if (oobject.equals("start")) {
                         i4 = 11;
                      }
                      break;
                    case 0x3f657e4e:
                      if (oobject.equals("center_horizontal")) {
                         i4 = 12;
                      }
                      break;
                    default:
                }
                switch (i4){
                    case 0:
                      i3 = 112;
                      break;
                    case 1:
                      i3 = 80;
                      break;
                    case 2:
                      i3 = 17;
                    case 3:
                      break;
                    case 4:
                      i3 = 7;
                      break;
                    case 5:
                      i3 = 16;
                      break;
                    case 6:
                      i3 = 128;
                      break;
                    case 7:
                      i3 = 0x800005;
                      break;
                    case 8:
                      i3 = 48;
                      break;
                    case 9:
                      i3 = 119;
                      break;
                    case 10:
                      i3 = 5;
                      break;
                    case 11:
                      i3 = 0x800003;
                      break;
                    case 12:
                      i3 = 1;
                      break;
                    default:
                      i3 = 3;
                }
             }
             i1 = i1 | i3;
          }
          i = i1;
       }
       this.b = i;
       this.invalidate();
       return;
    }
    public void setOnTabSelected(CameraScrollTabViewGroup$a p0){
       this.q = p0;
    }
    public final void setSelected(int p0){
       CameraScrollTabViewGroup obj;
       int i;
       int i1;
       if (PatchProxy.isSupport(CameraScrollTabViewGroup.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CameraScrollTabViewGroup.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("ScrollTabViewGroup", "setSelected:"+p0, objArray);
       if (p0 >= this.getChildCount() || p0 < 0) {
          throw new IndexOutOfBoundsException("total:"+this.getChildCount()+" and current: "+p0);
       }
       this.j = p0;
       int b = i0.Y(this);
       CameraScrollTabViewGroup tl = this.l;
       if (p0 == tl && b) {
          return;
       }
       if (!b) {
          this.m(p0);
          return;
       }else if(PatchProxy.isSupport(CameraScrollTabViewGroup.class)){
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(tl), Integer.valueOf(p0), this, CameraScrollTabViewGroup.class, "11");
          if (obj != PatchProxyResult.class) {
             b = obj.intValue();
          label_009f :
             if (tl > p0) {
                b = - b;
             }
             this.o.startScroll(this.getScrollX(), 0, b, 0, this.p);
             obj = this.q;
             if (obj != null) {
                obj.c(this.g(p0));
             }
             this.postInvalidate();
             return;
          }
       }
       b = (tl < null)? 0: tl;
       if (b > p0) {
          i = b;
          i1 = 0;
          obj = p0;
       }else {
          i = p0;
          i1 = 0;
       }
       while (obj < i) {
          b = obj + 1;
          int i2 = this.getChildAt(obj).getWidth() + this.getChildAt(b).getWidth();
          float f = (float)i2 / 2.00f;
          i1 = i1 + Math.round(f);
       }
       b = i1;
       goto label_009f ;
    }
    public void setSelectedTextColor(int p0){
       if (PatchProxy.isSupport(CameraScrollTabViewGroup.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CameraScrollTabViewGroup.class, "20")) {
          return;
       }
       int i = 0;
       while (i < this.getChildCount()) {
          TextView textView = this.findViewById(this.g(i));
          if (textView != null) {
             textView.setTextColor(this.getResources().getColorStateList(p0));
          }
          i = i + 1;
       }
       return;
    }
    public void setSelectedTextColor(ColorStateList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraScrollTabViewGroup.class, "21")) {
          return;
       }
       int i = 0;
       while (i < this.getChildCount()) {
          TextView textView = this.findViewById(this.g(i));
          if (textView != null) {
             textView.setTextColor(p0);
          }
          i = i + 1;
       }
       return;
    }
}
