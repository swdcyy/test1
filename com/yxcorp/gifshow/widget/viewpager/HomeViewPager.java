package com.yxcorp.gifshow.widget.viewpager.HomeViewPager;
import com.yxcorp.gifshow.widget.viewpager.CustomViewPager;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import androidx.viewpager.widget.CorrectOffsetViewPager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import android.view.MotionEvent;
import android.graphics.Rect;
import android.view.View;
import t17.a;
import joc.x;
import java.util.Set;
import java.lang.Math;
import java.lang.Float;
import com.yxcorp.gifshow.widget.viewpager.HomeViewPager$a;
import java.util.Iterator;
import joc.x$a;

public class HomeViewPager extends CustomViewPager	// class@0019f3
{
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public HomeViewPager$a E;
    public x F;
    public float w;
    public float x;
    public boolean y;
    public boolean z;

    public void HomeViewPager(Context p0){
       super(p0, null);
    }
    public void HomeViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.z = true;
       this.A = true;
       this.B = true;
       this.C = false;
       this.D = true;
       this.h = true;
       this.setIgnoreChildTranslation(false);
    }
    public boolean canScrollHorizontally(int p0){
       if (PatchProxy.isSupport(HomeViewPager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, HomeViewPager.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.B != null && super.canScrollHorizontally(p0))? true: false;
       return b;
    }
    public final boolean o(ViewGroup p0,MotionEvent p1){
       boolean b;
       Rect obj = PatchProxy.applyTwoRefs(p0, p1, this, HomeViewPager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new Rect();
       int i = 0;
       float f = 0;
       while (true) {
          if (i >= p0.getChildCount()) {
             return f;
          }
          View childAt = p0.getChildAt(i);
          if (childAt instanceof a && childAt.isShown()) {
             childAt.getGlobalVisibleRect(obj);
             f = obj.contains((int)p1.getRawX(), (int)p1.getRawY());
          }
          b = true;
          if (f) {
             break ;
          }else if(childAt instanceof ViewGroup && this.o(childAt, p1)){
             return b;
          }else {
             i = i + 1;
          }
       }
       return b;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       int i;
       Object[] objArray1;
       x n;
       Object obj = this;
       Object obj1 = p0;
       HomeViewPager obj2 = PatchProxy.applyOneRefs(obj1, obj, HomeViewPager.class, "3");
       if (obj2 != PatchProxyResult.class) {
          return obj2.booleanValue();
       }
       if (!this.isEnabled()) {
          return false;
       }
       obj2 = obj.F;
       if (obj2 != null) {
          if (!obj2.o.isEmpty() && (obj2.e != null || (obj2.g != null || obj2.h != null))) {
             boolean actionMasked = p0.getActionMasked();
             if (actionMasked == 3 || actionMasked == 1) {
                Object[] objArray = new Object[true];
                String str = (actionMasked == 3)? "canceled": "up";
                objArray[0] = str;
                obj2.e("Intercept %1$s", objArray);
                obj2.f();
             }else if(actionMasked){
                if (obj2.i != null) {
                   objArray1 = new Object[true];
                   objArray1[0] = "Intercept";
                   obj2.e("[%1$s] Swiping, do nothing, just return true", objArray1);
                }else if(!obj2.c("Intercept")){
                   obj2.f();
                }else if(actionMasked){
                   if (actionMasked == 2) {
                      n = obj2.n;
                      float f = -1.#Rf;
                      if (n != f) {
                         if (obj2.i == null) {
                            actionMasked = obj1.findPointerIndex(n);
                            if (actionMasked != f) {
                               float x1 = obj1.getX(actionMasked);
                               f = x1 - obj2.j;
                               float f1 = Math.abs(f);
                               float y = obj1.getY(actionMasked);
                               float f2 = Math.abs((y - obj2.k));
                               int i1 = (int)f;
                               int i2 = i1;
                               int i3 = i1;
                               float f3 = y;
                               if (obj2.b(f1, f2, i2, (int)x1, (int)y)) {
                                  objArray1 = new Object[]{"Intercept",Float.valueOf(x1),Float.valueOf(f3),Float.valueOf(f1),Float.valueOf(f2)};
                                  obj2.e("[%1$s] to %2$s,%3$s, diff=%4$s, %5$s", objArray1);
                               }else {
                                  obj2.i = i3;
                               }
                            }
                         }
                      }
                   }
                }else {
                   obj2.j = p0.getX();
                   obj2.k = p0.getY();
                   obj2.n = obj1.getPointerId(false);
                   n = obj2.j;
                   boolean b = (n - (float)obj2.c <= 0)? true: false;
                   obj2.l = b;
                   actionMasked = (n - (float)obj2.d >= 0)? true: false;
                   obj2.m = actionMasked;
                   obj2.i = 0;
                }
             }else {
                goto label_0065 ;
             }
             i = 1;
          label_011d :
             if (i) {
                return true;
             }
          }
       label_011c :
          i = 0;
          goto label_011d ;
       }
       i = p0.getAction();
       if (i) {
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                label_0172 :
                   obj.y = false;
                   return super.onInterceptTouchEvent(p0);
                }
             }else if(obj.C != null){
                return false;
             }else {
                float x = p0.getX();
                if ((Math.abs((x - obj.w)) * 0x3f000000) - Math.abs((p0.getY() - obj.x)) > 0) {
                   HomeViewPager w = obj.w;
                   if (w - x > 0 && obj.z == null) {
                      obj.y = true;
                      return false;
                   }else if(w - x < 0 && obj.A == null){
                      obj.y = true;
                      return false;
                   }else if(obj.o(obj, obj1)){
                      return false;
                   }
                }
             }
          }
          obj.C = false;
          goto label_0172 ;
       }else {
          obj.w = p0.getX();
          obj.x = p0.getY();
          return super.onInterceptTouchEvent(p0);
       }
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(HomeViewPager.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, HomeViewPager.class, "1")) {
             return;
          }
       }
       if (this.D != null) {
          this.D = false;
          HomeViewPager tE = this.E;
          if (tE != null) {
             tE.a();
             this.E = null;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       x n;
       boolean i1;
       Object obj = this;
       Object obj1 = p0;
       HomeViewPager obj2 = PatchProxy.applyOneRefs(obj1, obj, HomeViewPager.class, "4");
       if (obj2 != PatchProxyResult.class) {
          return obj2.booleanValue();
       }
       boolean b = true;
       if (!this.isEnabled()) {
          obj2 = obj.F;
          if (obj2 != null) {
             if (!obj2.o.isEmpty() && (obj2.e != null || (obj2.g != null || obj2.h != null))) {
                boolean actionMasked = p0.getActionMasked();
                if (actionMasked && !obj2.c("Touch")) {
                   obj2.f();
                }else if(actionMasked){
                   if (actionMasked != b) {
                      if (actionMasked != 2) {
                         if (actionMasked != 3) {
                            if (actionMasked != 5) {
                               if (actionMasked == 6) {
                                  actionMasked = p0.getActionIndex();
                                  if (obj1.getPointerId(actionMasked) == obj2.n) {
                                     actionMasked = (!actionMasked)? 1: 0;
                                     obj2.n = obj1.getPointerId(actionMasked);
                                  }
                               }
                            }else {
                               obj2.n = obj1.getPointerId(p0.getActionIndex());
                            }
                         }else {
                            obj2.f();
                         }
                      }else {
                         n = obj2.n;
                         x ox = -1;
                         if (n != ox) {
                            if (obj2.i == null) {
                               actionMasked = obj1.findPointerIndex(n);
                               if (actionMasked != ox) {
                                  float x = obj1.getX(actionMasked);
                                  float f = x - obj2.j;
                                  float f1 = Math.abs(f);
                                  float y = obj1.getY(actionMasked);
                                  float f2 = Math.abs((y - obj2.k));
                                  int i = (int)f;
                                  i1 = i;
                                  int i2 = i;
                                  float f3 = y;
                                  if (obj2.b(f1, f2, i1, (int)x, (int)y)) {
                                     Object[] objArray = new Object[]{"Touch",Float.valueOf(x),Float.valueOf(f3),Float.valueOf(f1),Float.valueOf(f2)};
                                     obj2.e("[%1$s] to %2$s,%3$s, diff=%4$s, %5$s", objArray);
                                  }else {
                                     obj2.i = i2;
                                  }
                               }
                            }
                            obj2 = 1;
                         label_0158 :
                            if (obj2) {
                            label_0166 :
                               return b;
                            }
                         }
                      }
                   }else if(obj2.i != null){
                      Iterator iterator = obj2.o.iterator();
                      while (iterator.hasNext()) {
                         x$a uoa = iterator.next();
                         boolean b1 = (obj2.i < null)? true: false;
                         i1 = (obj2.l != null || obj2.m != null)? true: false;
                         uoa.a(b1, i1);
                      }
                   }
                   obj2.f();
                }else {
                   obj2.j = p0.getX();
                   obj2.k = p0.getY();
                   obj2.n = obj1.getPointerId(0);
                   n = obj2.j;
                   boolean b2 = (n - (float)obj2.c <= 0)? true: false;
                   obj2.l = b2;
                   actionMasked = (n - (float)obj2.d >= 0)? true: false;
                   obj2.m = actionMasked;
                   obj2.i = 0;
                }
             }
             obj2 = null;
             goto label_0158 ;
          }
       }
       if (obj.y != null || super.onTouchEvent(p0)) {
          goto label_0166 ;
       }else {
          b = false;
          goto label_0166 ;
       }
    }
    public void setCanScrollHorizontally(boolean p0){
       this.B = p0;
    }
    public void setDisableTouchEvent(boolean p0){
       this.y = p0;
    }
    public void setEnableSwipeLeft(boolean p0){
       this.z = p0;
    }
    public void setEnableSwipeRight(boolean p0){
       this.A = p0;
    }
    public void setPadding(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(HomeViewPager.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, HomeViewPager.class, "2")) {
          return;
       }
       super.setPadding(p0, p1, p2, p3);
       return;
    }
    public void setPreFirstOnLayoutListener(HomeViewPager$a p0){
       this.E = p0;
    }
    public void setSwipeViewPagerHelper(x p0){
       this.F = p0;
    }
}
