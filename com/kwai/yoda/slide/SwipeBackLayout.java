package com.kwai.yoda.slide.SwipeBackLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.slide.SwipeBackLayout$a;
import com.kwai.yoda.slide.a;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import com.kwai.yoda.slide.a$c;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import java.util.Objects;
import java.lang.Boolean;
import e2.g;
import android.view.View;
import a2.i0;
import java.lang.Runnable;
import android.graphics.Canvas;
import java.lang.Long;
import android.view.MotionEvent;
import java.lang.Integer;
import a2.q;
import android.view.VelocityTracker;

public class SwipeBackLayout extends FrameLayout	// class@0012e6
{
    public a b;
    public Activity c;
    public View d;
    public int e;
    public float f;
    public Drawable g;
    public float h;
    public Rect i;
    public boolean j;
    public boolean k;
    public boolean l;
    public ObjectAnimator m;

    public void SwipeBackLayout(Context p0){
       super(p0);
       this.i = new Rect();
       this.k = true;
       this.l = false;
       this.a(p0);
    }
    public void SwipeBackLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.i = new Rect();
       this.k = true;
       this.l = false;
       this.a(p0);
    }
    public void SwipeBackLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.i = new Rect();
       this.k = true;
       this.l = false;
       this.a(p0);
    }
    public final void a(Context p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, SwipeBackLayout.class, str)) {
          return;
       }
       SwipeBackLayout$a uoa = new SwipeBackLayout$a(this);
       a uoa1 = PatchProxy.applyTwoRefs(this, uoa, null, a.class, str);
       if (uoa1 != PatchProxyResult.class) {
       }else {
          uoa1 = new a(this.getContext(), this, uoa);
       }
       this.b = uoa1;
       uoa1.r = 1;
       float f = c.c(this.getResources()).density * 200.00f;
       SwipeBackLayout tb = this.b;
       tb.p = f;
       tb.o = f * 2.00f;
       this.g = ContextCompat.getDrawable(p0, 0x7f0823bd);
       return;
    }
    public void computeScroll(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, SwipeBackLayout.class, "6")) {
          return;
       }
       this.h = 0x3f800000 - this.f;
       SwipeBackLayout tb = this.b;
       Objects.requireNonNull(tb);
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.TRUE, tb, uoa, "15");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(tb.c == 2){
             boolean b1 = tb.s.b();
             int i = tb.s.f();
             int i1 = tb.s.g();
             int i2 = i - tb.t.getLeft();
             int i3 = i1 - tb.t.getTop();
             if (i2) {
                i0.d0(tb.t, i2);
             }
             if (i3) {
                i0.e0(tb.t, i3);
             }
             if (i2 || i3) {
                tb.a.d(tb.t, i, i1, i2, i3);
             }
             if (b1 && (i == tb.s.h() && i1 == tb.s.i())) {
                tb.s.a();
                b1 = false;
             }
          label_008e :
             if (!b1) {
                tb.b.post(tb.u);
             }
          }
          if (tb.c == 2) {
             b = true;
          }else {
             b = false;
          }
       }else {
          goto label_0033 ;
       }
       if (b) {
          i0.j0(this);
       }
       return;
    }
    public boolean drawChild(Canvas p0,View p1,long p2){
       String obj;
       if (PatchProxy.isSupport(SwipeBackLayout.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), this, SwipeBackLayout.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = (p1 == this.d)? 1: null;
       boolean b = super.drawChild(p0, p1, p2);
       if (this.h <= 0 || (!obj || (this.b.c != null && !PatchProxy.applyVoidTwoRefs(p0, p1, this, SwipeBackLayout.class, "5")))) {
          SwipeBackLayout ti = this.i;
          p1.getHitRect(ti);
          SwipeBackLayout tg = this.g;
          tg.setBounds((ti.left - tg.getIntrinsicWidth()), ti.top, ti.left, ti.bottom);
          this.g.setAlpha((int)(this.h * 0x437f0000));
          this.g.draw(p0);
       }
    label_006f :
       return b;
    }
    public View getContentView(){
       return this.d;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SwipeBackLayout.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          return this.b.r(p0);
       }catch(java.lang.ArrayIndexOutOfBoundsException e0){
          return false;
       }
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(SwipeBackLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, SwipeBackLayout.class, "2")) {
             return;
          }
       }
       this.j = true;
       SwipeBackLayout td = this.d;
       if (td != null) {
          SwipeBackLayout te = this.e;
          td.layout(te, p2, (td.getMeasuredWidth() + te), this.d.getMeasuredHeight());
       }
       this.j = false;
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       int i3;
       int i4;
       int i5;
       float f;
       int i6;
       int i7;
       View obj3;
       int i11;
       Object obj = this;
       a obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj2 = PatchProxy.applyOneRefs(obj1, obj, SwipeBackLayout.class, "8");
       if (obj2 != patchProxyRe) {
          return obj2.booleanValue();
       }
       SwipeBackLayout b = obj.b;
       Objects.requireNonNull(b);
       obj2 = a.class;
       if (!PatchProxy.applyVoidOneRefs(obj1, b, obj2, "25")) {
          int i = q.c(p0);
          int i1 = q.b(p0);
          if (!i) {
             b.a();
          }
          if (b.n == null) {
             b.n = VelocityTracker.obtain();
          }
          b.n.addMovement(obj1);
          int i2 = 0;
          if (i) {
             if (i != 1) {
                if (i != 2) {
                   if (i != 3) {
                      if (i != 5) {
                         if (i == 6) {
                            i3 = q.e(obj1, i1);
                            if (b.c == true && i3 == b.e) {
                               i4 = q.d(p0);
                               while (true) {
                                  if (i2 < i4) {
                                     i1 = q.e(obj1, i2);
                                     if (i1 != b.e) {
                                        a t = b.t;
                                        if (b.i((int)q.f(obj1, i2), (int)q.g(obj1, i2)) == t && b.s(t, i1)) {
                                           obj1 = b.e;
                                        label_0093 :
                                           if (obj1 == -1) {
                                              b.l();
                                           }
                                        }
                                     }
                                     i2 = i2 + 1;
                                  }else {
                                     obj1 = -1;
                                     goto label_0093 ;
                                  }
                               }
                            }
                         label_0098 :
                            b.f(i3);
                         }
                      }else {
                         i5 = q.e(obj1, i1);
                         f = q.f(obj1, i1);
                         float f1 = q.g(obj1, i1);
                         b.n(f, f1, i5);
                         if (b.c == null) {
                            b.s(b.i((int)f, (int)f1), i5);
                            if (b.j[i5] & b.r) {
                               Objects.requireNonNull(b.a);
                            }
                         }else {
                            i6 = (int)f;
                            i7 = (int)f1;
                            if (PatchProxy.isSupport(obj2)) {
                               obj3 = PatchProxy.applyTwoRefs(Integer.valueOf(i6), Integer.valueOf(i7), b, obj2, "35");
                               if (obj3 != patchProxyRe) {
                                  i7 = obj3.booleanValue();
                               label_0128 :
                                  if (i7) {
                                     b.s(b.t, i5);
                                  }
                               }
                            }
                            a t1 = b.t;
                            if (PatchProxy.isSupport(obj2)) {
                               Object obj4 = PatchProxy.applyThreeRefs(t1, Integer.valueOf(i6), Integer.valueOf(i7), b, a.class, "36");
                               if (obj4 != patchProxyRe) {
                                  i2 = obj4.booleanValue();
                               }else if(t1 != null && (i6 >= t1.getLeft() && (i6 < t1.getRight() && (i7 >= t1.getTop() && i7 < t1.getBottom())))){
                                  i2 = 1;
                               }
                            }else {
                               goto label_010b ;
                            }
                            i7 = i2;
                            goto label_0128 ;
                         }
                      }
                   }else if(b.c == true){
                      b.h(0, 0);
                   }
                   b.a();
                }else if(b.c == true){
                   if (b.k(b.e)) {
                      i3 = q.a(obj1, b.e);
                      f = q.f(obj1, i3);
                      a e = b.e;
                      i5 = (int)(f - b.h[e]);
                      i6 = (int)(q.g(obj1, i3) - b.i[e]);
                      int i8 = b.t.getLeft() + i5;
                      int i9 = b.t.getTop() + i6;
                      if (!PatchProxy.isSupport(obj2) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i5), Integer.valueOf(i6), b, a.class, "34")) {
                         i3 = b.t.getLeft();
                         i4 = b.t.getTop();
                         if (i5) {
                            i8 = b.a.a(b.t, i8, i5);
                            i0.d0(b.t, (i8 - i3));
                         }
                         int i10 = i8;
                         if (i6) {
                            Objects.requireNonNull(b.a);
                            i0.e0(b.t, (i4 - 0));
                            i11 = 0;
                         }else {
                            i11 = i9;
                         }
                         if (i5 || i6) {
                            b.a.d(b.t, i10, i11, (i10 - i3), (i11 - i4));
                         }
                      }
                      b.o(obj1);
                   }
                }else {
                   i3 = q.d(p0);
                   while (i2 < i3) {
                      i4 = q.e(obj1, i2);
                      if (b.k(i4)) {
                         f = q.f(obj1, i2);
                         float f2 = q.g(obj1, i2);
                         float f3 = f - b.f[i4];
                         float f4 = f2 - b.g[i4];
                         b.m(f3, f4, i4);
                         if (b.c == true) {
                            break ;
                         }else {
                            obj3 = b.i((int)f, (int)f2);
                            if (b.c(obj3, f3, f4) && b.s(obj3, i4)) {
                               break ;
                            }
                         }
                      }
                      i2 = i2 + 1;
                   }
                   b.o(obj1);
                }
             }else if(b.c == true){
                b.l();
             }
             b.a();
          }else {
             float x = p0.getX();
             float y = p0.getY();
             i7 = q.e(obj1, i2);
             b.n(x, y, i7);
             b.s(b.i((int)x, (int)y), i7);
             if (b.j[i7] & b.r) {
                Objects.requireNonNull(b.a);
             }
          }
       }
    label_025c :
       return true;
    }
    public void requestLayout(){
       if (PatchProxy.applyVoid(null, this, SwipeBackLayout.class, "3")) {
          return;
       }
       if (this.j == null) {
          super.requestLayout();
       }
       return;
    }
    public final void setContentView(View p0){
       this.d = p0;
    }
    public void setSwipeBackEnable(boolean p0){
       this.k = p0;
    }
}
