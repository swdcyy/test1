package com.yxcorp.gifshow.album.widget.ScrollableLayout;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.album.widget.ScrollableLayout$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.StringBuilder;
import th0.e;
import android.widget.Scroller;
import com.yxcorp.gifshow.album.widget.ScrollableLayout$e;
import android.view.animation.Interpolator;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.album.widget.ScrollableLayout$b;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import kotlin.TypeCastException;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.album.widget.ScrollableLayout$d;
import java.lang.Integer;
import java.lang.Math;
import com.yxcorp.gifshow.album.widget.ScrollableLayout$c;
import android.view.animation.DecelerateInterpolator;

public final class ScrollableLayout extends LinearLayout	// class@001b0f
{
    public View b;
    public ScrollableLayout$b c;
    public ScrollableLayout$c d;
    public ScrollableLayout$d e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public Scroller r;
    public VelocityTracker s;
    public float t;
    public boolean u;
    public boolean v;
    public HashMap w;
    public static final int A = 120;
    public static final int B = 60;
    public static final int C = 1200;
    public static final int D = 1;
    public static final int E = 2;
    public static final int F = 3;
    public static final ScrollableLayout$a G;
    public static final String x;
    public static final boolean y;
    public static final int z;

    static {
       ScrollableLayout.G = new ScrollableLayout$a(null);
       ScrollableLayout.x = "ScrollableLayout";
       ScrollableLayout.y = true;
       ScrollableLayout.z = 300;
       ScrollableLayout.A = 120;
       ScrollableLayout.B = 60;
       ScrollableLayout.C = 1200;
       ScrollableLayout.D = 1;
       ScrollableLayout.E = 2;
       ScrollableLayout.F = 3;
    }
    public void ScrollableLayout(Context p0){
       a.q(p0, "context");
       super(p0);
       this.g = ScrollableLayout.D;
       this.j = true;
       this.v = true;
       this.b();
    }
    public void ScrollableLayout(Context p0,AttributeSet p1){
       a.q(p0, "context");
       a.q(p1, "attrs");
       super(p0, p1);
       this.g = ScrollableLayout.D;
       this.j = true;
       this.v = true;
       this.b();
    }
    public void ScrollableLayout(Context p0,AttributeSet p1,int p2){
       a.q(p0, "context");
       a.q(p1, "attrs");
       super(p0, p1, p2);
       this.g = ScrollableLayout.D;
       this.j = true;
       this.v = true;
       this.b();
    }
    public final void a(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ScrollableLayout.class, "12")) {
          return;
       }
       View scrollList = this.getScrollList();
       if (scrollList != null) {
          scrollList.dispatchTouchEvent(p0);
          this.f("dispatchTouchEventToScrollList action"+p0.getAction());
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, ScrollableLayout.class, "4")) {
          return;
       }
       this.r = new Scroller(this.getContext(), new ScrollableLayout$e(new e()));
       this.s = VelocityTracker.obtain();
       ViewConfiguration viewConfigur = ViewConfiguration.get(this.getContext());
       a.h(viewConfigur, "ViewConfiguration.get\(context\)");
       this.l = viewConfigur.getScaledTouchSlop();
       this.u = true;
       this.k = true;
       return;
    }
    public final boolean c(){
       ScrollableLayout obj = PatchProxy.apply(null, this, ScrollableLayout.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       if (obj != null) {
          if (obj == null) {
             a.L();
          }
          return obj.a();
       }else if(this.getScrollList() instanceof RecyclerView){
          View scrollList = this.getScrollList();
          if (scrollList == null) {
             throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
          }
          int i = scrollList.canScrollVertically(-1) ^ 0x01;
          this.f("isContentListOnTop "+i);
          return i;
       }else {
          return false;
       }
    }
    public void computeScroll(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ScrollableLayout.class, "16")) {
          return;
       }
       ScrollableLayout tr = this.r;
       if (tr != null) {
          if (tr.computeScrollOffset()) {
             objArray = tr;
          }
          if (objArray != null) {
             this.scrollTo(objArray.getCurrX(), objArray.getCurrY());
             this.postInvalidate();
          }
       }
       return;
    }
    public final boolean d(){
       boolean b = (this.g == ScrollableLayout.D)? true: false;
       return b;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       boolean b;
       ScrollableLayout obj = PatchProxy.applyOneRefs(p0, this, ScrollableLayout.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "ev");
       if (!this.e()) {
          try{
             b = super.dispatchTouchEvent(p0);
          }catch(java.lang.Exception e0){
             b = false;
          }
          return b;
       }else {
          obj = this.s;
          if (obj != null) {
             obj.addMovement(p0);
          }
          int action = p0.getAction();
          float f = 0;
          if (action) {
             if (action == 1) {
                obj = this.s;
                if (obj != null) {
                   obj.computeCurrentVelocity(ScrollableLayout.B);
                }
                obj = this.s;
                if (obj != null) {
                   f = obj.getYVelocity();
                }
                this.t = f;
                if (ScrollableLayout.y) {
                   Log.b(ScrollableLayout.x, "dispatchTouchEvent ACTION_UP: mYVelocity:"+this.t);
                }
                obj = this.s;
                if (obj != null) {
                   obj.clear();
                }
             }
          }else {
             this.t = f;
          }
          return super.dispatchTouchEvent(p0);
       }
    }
    public final boolean e(){
       boolean b = (this.k != null && (this.b != null && this.f > null))? true: false;
       return b;
    }
    public final void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ScrollableLayout.class, "20")) {
          return;
       }
       if (ScrollableLayout.y) {
          Log.b(ScrollableLayout.x, p0);
       }
       return;
    }
    public final void g(int p0,int p1){
       this.p = p0;
       this.q = p1;
       this.o = p1;
    }
    public final View getScrollList(){
       Object[] objArray = null;
       ScrollableLayout obj = PatchProxy.apply(objArray, this, ScrollableLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj != null && obj != null) {
          objArray = obj.a();
       }
       return objArray;
    }
    public final void h(boolean p0,boolean p1){
       if (PatchProxy.isSupport(ScrollableLayout.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, ScrollableLayout.class, "19")) {
          return;
       }
       if (this.m != null) {
          return;
       }
       ScrollableLayout tr = this.r;
       boolean b = true;
       if (tr == null || tr.isFinished() != b) {
          if (this.g != ScrollableLayout.D) {
             b = false;
          }
          if (p0 == b) {
             return;
          }
       }
       if (ScrollableLayout.y) {
          Log.b(ScrollableLayout.x, "setExpand: expand:"+p0+", smooth:"+p1);
       }
       if (p0) {
          if (p1) {
             this.i(0);
          }else {
             this.scrollTo(0, 0);
          }
          this.g = ScrollableLayout.D;
       }else if(p1){
          this.i(this.f);
       }else {
          this.scrollTo(0, this.f);
       }
       this.g = ScrollableLayout.E;
       return;
    }
    public final void i(int p0){
       if (PatchProxy.isSupport(ScrollableLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ScrollableLayout.class, "15")) {
          return;
       }
       if (ScrollableLayout.y) {
          Log.b(ScrollableLayout.x, "smoothScrollTo: dy:"+p0);
       }
       ScrollableLayout tr = this.r;
       if (tr != null) {
          tr.startScroll(0, this.getScrollY(), 0, (p0 - this.getScrollY()), ScrollableLayout.z);
       }
       this.invalidate();
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       int action;
       Object obj = PatchProxy.applyOneRefs(p0, this, ScrollableLayout.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "event");
       if (!this.e()) {
          return super.onInterceptTouchEvent(p0);
       }
       int i = (int)p0.getX();
       int i1 = (int)p0.getY();
       boolean y = ScrollableLayout.y;
       if (y) {
          Log.b(ScrollableLayout.x, "onInterceptTouchEvent:  y:"+i1+",  action:"+p0.getAction());
       }
       action = p0.getAction();
       boolean b = true;
       int i2 = 0;
       if (action) {
          if (action != b) {
             if (action != 2) {
                if (action == 3) {
                label_0137 :
                   this.q = i2;
                   this.p = i2;
                }
             }else {
                action = i - this.p;
                int i3 = i1 - this.q;
                if (y) {
                   Log.b(ScrollableLayout.x, "onInterceptTouchEvent: move  deletaY:"+i3+",deletaX:"+action+", mStatus:"+this.g);
                }
                if (Math.abs(i3) > Math.abs(action)) {
                   ScrollableLayout tg = this.g;
                   if (tg != ScrollableLayout.F && (tg != ScrollableLayout.D || (i3 > (- this.l) || this.n != null))) {
                      int e = ScrollableLayout.E;
                      if (tg != e || i3 > (- this.l)) {
                         if (tg == e && i3 > this.l) {
                            if (y) {
                               Log.b(ScrollableLayout.x, "onInterceptTouchEvent: 收起状态的下拉");
                            }
                            if (this.c()) {
                               if (y) {
                                  Log.b(ScrollableLayout.x, "onInterceptTouchEvent: 列表也已经到顶");
                               }
                               this.g(i, i1);
                            }
                         }else if(this.c() && i3 >= this.l){
                            if (y) {
                               Log.b(ScrollableLayout.x, "onInterceptTouchEvent: 下拉, 已经到顶还在下拉");
                            }
                            if (this.v == null) {
                               return i2;
                            }else {
                               this.g(i, i1);
                            }
                         }else {
                            Log.d(ScrollableLayout.x, "onInterceptTouchEvent: why here!");
                         }
                      }
                   }
                   i2 = 1;
                }
             label_0109 :
                if (!i2 && (this.j == null && (this.getScrollY() < this.f && (Math.abs(i3) > this.l && (Math.abs(i3) > Math.abs(action) && this.n == null))))) {
                   Log.b(ScrollableLayout.x, "onInterceptTouchEvent: 下拉，中间拖动状态");
                label_0145 :
                   if (y) {
                      Log.b(ScrollableLayout.x, "intercepted="+b);
                   }
                   return b;
                }else {
                   b = i2;
                   goto label_0145 ;
                }
             }
          }else {
             goto label_0137 ;
          }
       }else {
          this.p = i;
          this.q = i1;
          this.o = i1;
       }
       b = false;
       goto label_0145 ;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ScrollableLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ScrollableLayout.class, "18")) {
          return;
       }
       super.onScrollChanged(p0, p1, p2, p3);
       float f = ((float)this.getScrollY() * 0x3f800000) / (float)this.f;
       if (ScrollableLayout.y) {
          Log.b(ScrollableLayout.x, "onScrollChanged: mStatus:"+this.g+", ratio:"+f+", t:"+p1+", oldt:"+p3);
       }
       ScrollableLayout td = this.d;
       if (td != null) {
          td.a(f, p1, p3, (float)this.getScrollY());
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       ScrollableLayout tt;
       boolean a;
       String str;
       Object obj = PatchProxy.applyOneRefs(p0, this, ScrollableLayout.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "event");
       if (!this.e()) {
          return super.onTouchEvent(p0);
       }
       int i = (int)p0.getY();
       int action = p0.getAction();
       if (action) {
          if (action != 1) {
             if (action != 2) {
                if (action == 3) {
                label_00f1 :
                   this.m = false;
                   if (ScrollableLayout.y) {
                      Log.d(ScrollableLayout.x, "onTouchEvent ACTION_UP: scrollY:"+this.getScrollY()+", mStatus:"+this.g+", isContentListOnTop\(\):"+this.c());
                   }
                   tt = this.t;
                   a = ScrollableLayout.A;
                   if (tt - (float)(- a) < 0 && this.g == ScrollableLayout.D) {
                      tt = this.f;
                      this.setStatus(ScrollableLayout.E);
                   }else if(tt - (float)a > 0 && (this.g == ScrollableLayout.E && this.c())){
                      this.setStatus(ScrollableLayout.D);
                      tt = null;
                   }else {
                      tt = null;
                      str = null;
                   label_015a :
                      if (!str) {
                         int d = ScrollableLayout.D;
                         if (this.g == d && this.getScrollY() < this.i) {
                            this.setStatus(d);
                         }else if(this.g == d && this.getScrollY() >= this.i){
                            tt = this.f;
                            this.setStatus(ScrollableLayout.E);
                         }else {
                            int e = ScrollableLayout.E;
                            if (this.g == e && this.getScrollY() >= this.h) {
                               tt = this.f;
                               this.setStatus(e);
                            }else if(this.g == e && this.getScrollY() < this.h){
                               this.setStatus(d);
                            }
                         }
                         action = 0;
                      }
                   label_01a7 :
                      if (this.j != null || str) {
                         this.i(action);
                      }
                      if (this.j == null && (str || this.getScrollY() > this.f)) {
                         this.a(p0);
                      }
                      if (this.j != null || (!str || (this.g == ScrollableLayout.E && !PatchProxy.applyVoid(null, this, ScrollableLayout.class, "13")))) {
                         View scrollList = this.getScrollList();
                         if (scrollList instanceof RecyclerView) {
                            scrollList.smoothScrollBy(false, (int)((float)this.getHeight() * (Math.abs(this.t) / (float)ScrollableLayout.C)), new DecelerateInterpolator(0x3f800000));
                            this.f("ScrollList scroll");
                         }
                      }
                   }
                   str = 1;
                   goto label_015a ;
                }
             }else {
                this.m = true;
                action = i - this.o;
                a = ScrollableLayout.y;
                if (a) {
                   Log.b(ScrollableLayout.x, "onTouchEvent ACTION_MOVE current scrollY="+this.getScrollY()+" deltaY="+action+" mlastY="+this.o);
                }
                if (this.getScrollY() == this.f && (this.getScrollY() - action) > this.f) {
                   if (a) {
                      Log.b(ScrollableLayout.x, "onTouchEvent: 应该交给list 进行滑动");
                   }
                   this.a(p0);
                   return true;
                }else {
                   int i1 = - action;
                   if (!PatchProxy.isSupport(ScrollableLayout.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), this, ScrollableLayout.class, "17")) {
                      if (this.u == null) {
                         this.b();
                      }
                      i1 = Math.max(false, Math.min(this.f, (this.getScrollY() + i1)));
                      if (!i1) {
                         this.setStatus(ScrollableLayout.E);
                      }else if(i1 == this.f){
                         this.setStatus(ScrollableLayout.D);
                      }
                      if (!this.c()) {
                         View scrollList1 = this.getScrollList();
                         if (scrollList1 instanceof RecyclerView) {
                            scrollList1.smoothScrollToPosition(false);
                            Log.b(ScrollableLayout.x, "ScrollList fixScroll");
                         }
                      }
                      if (this.b != null) {
                         this.scrollTo(false, i1);
                      }
                   }
                }
             }
          }else {
             goto label_00f1 ;
          }
       }else {
          tt = this.r;
          if (tt == null || tt.isFinished() != true) {
             tt = this.r;
             if (tt != null) {
                tt.abortAnimation();
             }
          }
          this.a(p0);
       }
    label_0219 :
       this.o = i;
       return true;
    }
    public final void setAutoScrollEnable(boolean p0){
       this.j = p0;
    }
    public final void setHeader(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ScrollableLayout.class, "5")) {
          return;
       }
       a.q(p0, "header");
       this.b = p0;
       return;
    }
    public final void setHeaderScrollHeight(int p0){
       this.f = p0;
    }
    public final void setHeaderScrolledListener(ScrollableLayout$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ScrollableLayout.class, "6")) {
          return;
       }
       a.q(p0, "listener");
       this.d = p0;
       return;
    }
    public final void setInterceptTouchEventWhenDragTop(boolean p0){
       this.v = p0;
    }
    public final void setOnContentListCallback(ScrollableLayout$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ScrollableLayout.class, "8")) {
          return;
       }
       a.q(p0, "l");
       this.c = p0;
       return;
    }
    public final void setScrollEnabled(boolean p0){
       this.k = p0;
    }
    public final void setScrollListProvider(ScrollableLayout$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ScrollableLayout.class, "7")) {
          return;
       }
       a.q(p0, "provider");
       this.e = p0;
       return;
    }
    public final void setStatus(int p0){
       if (PatchProxy.isSupport(ScrollableLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ScrollableLayout.class, "14")) {
          return;
       }
       this.g = p0;
       Log.b("debug_tag", "setStatus : "+p0);
       return;
    }
    public final void setViewPagerDragging(boolean p0){
       if (PatchProxy.isSupport(ScrollableLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ScrollableLayout.class, "1")) {
          return;
       }
       this.n = p0;
       this.f("isViewpagerDragging:"+p0);
       return;
    }
}
