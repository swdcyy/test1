package com.yxcorp.gifshow.home.block.topbar.appbar.GestureCollapseAppBarBehavior;
import com.yxcorp.gifshow.home.block.topbar.appbar.NoNestedScrollAppBarBehavior;
import com.yxcorp.gifshow.home.block.topbar.appbar.GestureCollapseAppBarBehavior$b;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewConfiguration;
import com.yxcorp.gifshow.home.block.topbar.appbar.GestureCollapseAppBarBehavior$c;
import a2.f;
import android.view.GestureDetector$OnGestureListener;
import com.yxcorp.gifshow.home.block.topbar.appbar.GestureCollapseAppBarBehavior$a;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import android.view.MotionEvent;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.SystemUtil;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.Math;
import com.kwai.kcube.decorator.AlwaysInterceptTouchEventCoordinatorLayout;

public final class GestureCollapseAppBarBehavior extends NoNestedScrollAppBarBehavior	// class@00165e
{
    public float j;
    public boolean k;
    public boolean l;
    public float m;
    public float n;
    public float o;
    public boolean p;
    public boolean q;
    public boolean r;
    public GestureCollapseAppBarBehavior$a s;
    public final GestureCollapseAppBarBehavior$c t;
    public f u;
    public static final GestureCollapseAppBarBehavior$b v;

    static {
       GestureCollapseAppBarBehavior.v = new GestureCollapseAppBarBehavior$b(null);
    }
    public void GestureCollapseAppBarBehavior(Context p0){
       a.p(p0, "context");
       super();
       ViewConfiguration viewConfigur = ViewConfiguration.get(p0);
       a.o(viewConfigur, "ViewConfiguration.get\(context\)");
       this.j = (float)viewConfigur.getScaledTouchSlop();
       this.q = true;
       GestureCollapseAppBarBehavior$c uoc = new GestureCollapseAppBarBehavior$c(this);
       this.t = uoc;
       this.u = new f(p0, uoc);
    }
    public final GestureCollapseAppBarBehavior$a D(){
       return this.s;
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       boolean b;
       String actionMasked1;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, GestureCollapseAppBarBehavior.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "parent");
          a.p(p1, "child");
          a.p(p2, "ev");
          boolean b1 = 2;
          boolean b2 = true;
          if (SystemUtil.I()) {
             StringBuilder str = "* event: ";
             int actionMasked = p2.getActionMasked();
             if (actionMasked) {
                if (actionMasked != b2) {
                   if (actionMasked != b1) {
                      actionMasked1 = (actionMasked != 3)? "unknown": "cancel";
                   }else {
                      actionMasked1 = "move";
                   }
                }else {
                   actionMasked1 = "up";
                }
             }else {
                actionMasked1 = "down";
             }
             Log.b("NoScrollAppBarBehavior", str+actionMasked1);
          }
          int actionMasked2 = p2.getActionMasked();
          if (actionMasked2) {
             if (actionMasked2 == b1 && (this.p != null && this.r == null)) {
                float y = p2.getY();
                float f = Math.abs((y - this.o));
                if (SystemUtil.I()) {
                   Log.b("NoScrollAppBarBehavior", "slop:"+this.j+" yDiff:"+f+", mLastY: "+this.o+", y:"+y);
                }
                if (f - this.j > 0) {
                   if (y - this.o < 0) {
                      if (SystemUtil.I()) {
                         Log.b("NoScrollAppBarBehavior", "- onUp");
                      }
                      GestureCollapseAppBarBehavior ts = this.s;
                      if (ts != null) {
                         ts.a(b2);
                      }
                   }else if(this.l != null){
                      this.r = b2;
                   }
                }
             }
          }else {
             this.m = p2.getX();
             this.n = p2.getY();
             GestureCollapseAppBarBehavior ts1 = this.s;
             if (ts1 == null || ts1.b() != b2) {
                b2 = false;
             }
             this.p = b2;
             p0.setMAlwaysEnableIntercept(b2);
             this.q = false;
             this.o = this.n;
          }
       label_0102 :
          this.o = Math.max(this.o, p2.getY());
          if (this.p != null && this.r == null) {
             this.u.a(p2);
          }
          b = this.q;
          this.q = false;
       }
       return b;
    }
}
