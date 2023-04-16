package com.yxcorp.gifshow.v3.widget.BaseRangeView;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import lnc.a1;
import android.os.Handler;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.yxcorp.gifshow.v3.widget.BaseRangeView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$b;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.v3.widget.gestures.ITimeLineGestureProcessor;
import ekd.m1;
import com.yxcorp.gifshow.widget.adv.MultiPartColorView;
import java.lang.Integer;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a$a;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout$LayoutParams;
import java.util.Objects;
import java.lang.Double;
import android.graphics.Rect;
import com.yxcorp.utility.n;
import java.lang.Number;
import com.yxcorp.gifshow.widget.adv.ITimelineView;
import android.view.ViewParent;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$RangeHandler;
import o56.c;
import o56.a;
import android.app.Application;
import android.view.VelocityTracker;
import java.lang.Runnable;
import android.view.MotionEvent;
import a2.q;
import java.lang.Float;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.widget.gestures.ITimeLineGestureProcessor$HeadingDirection;
import kotlin.Pair;
import com.yxcorp.gifshow.v3.widget.gestures.TimeLineGestureProcessor$AbsorbStatus;
import com.yxcorp.gifshow.widget.adv.Action$Type;
import java.lang.Math;

public class BaseRangeView extends RelativeLayout implements ITimelineView$IRangeView, d	// class@00162a
{
    public int b;
    public MultiPartColorView c;
    public View d;
    public View e;
    public View f;
    public ITimeLineGestureProcessor g;
    public VelocityTracker h;
    public int i;
    public int j;
    public int k;
    public double l;
    public double m;
    public double n;
    public int o;
    public int p;
    public Handler q;
    public double r;
    public double s;
    public List t;
    public Runnable u;
    public ITimelineView$IRangeView$a v;
    public ITimelineView$IRangeView$b w;

    public void BaseRangeView(Context p0){
       super(p0, null);
    }
    public void BaseRangeView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void BaseRangeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = a1.d(0x7f070f07);
       this.j = 0;
       this.k = 0;
       this.m = 0;
       this.n = 0;
       this.p = 1;
       this.q = new Handler();
       this.r = 0;
       this.s = 0;
       this.t = Lists.b();
       this.u = new BaseRangeView$a(this);
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRangeView.class, "3")) {
       }else {
          this.doBindView(a.d(p0, R.layout.arg_RES_7f0d00f3, this, 1));
       }
       return;
    }
    public boolean a(){
       BaseRangeView obj = PatchProxy.apply(null, this, BaseRangeView.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.w != null) {
          obj = this.v;
          if (obj == null || obj.q()) {
             return this.w.c(this);
          }
       }
       return false;
    }
    public ITimelineView$IRangeView b(ITimelineView$IRangeView$a p0){
       Iterator iterator;
       View obj = PatchProxy.applyOneRefs(p0, this, BaseRangeView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v = p0;
       int i = (p0.o != null)? 0x7f070f08: 0x7f070f07;
       this.b = a1.d(i);
       if (!q.f(this.t)) {
          iterator = this.t.iterator();
          while (iterator.hasNext()) {
             this.removeView(iterator.next());
          }
       }
       this.t.clear();
       if (!q.f(this.v.c())) {
          iterator = this.v.c().iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             this.addView(obj);
             this.t.add(obj);
          }
       }
       this.d.bringToFront();
       this.e.bringToFront();
       this.f.bringToFront();
       return this;
    }
    public ITimelineView$IRangeView c(ITimeLineGestureProcessor p0,int p1){
       this.g = p0;
       this.i = p1;
       return this;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, BaseRangeView.class, "14")) {
          return;
       }
       this.l(false);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRangeView.class, "1")) {
          return;
       }
       this.f = m1.f(p0, 0x7f0a33ed);
       this.e = m1.f(p0, 0x7f0a0c3c);
       this.d = m1.f(p0, 0x7f0a0ffd);
       this.c = m1.f(p0, 0x7f0a1002);
       return;
    }
    public void e(int p0){
       if (PatchProxy.isSupport(BaseRangeView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BaseRangeView.class, "13")) {
          return;
       }
       this.l(true);
       return;
    }
    public ITimelineView$IRangeView f(ITimelineView$IRangeView$b p0){
       this.w = p0;
       return this;
    }
    public ITimelineView$IRangeView g(ViewGroup p0){
       Object obj = this;
       BaseRangeView obj1 = PatchProxy.applyOneRefs(p0, obj, BaseRangeView.class, "6");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = obj.v;
       int i = 0;
       int i1 = 8;
       if (obj1 != null) {
          BaseRangeView e = obj.e;
          int i2 = (obj1.s())? 0: 4;
          e.setVisibility(i2);
          obj1 = obj.f;
          if (!obj.v.p()) {
             i = 4;
          }
          obj1.setVisibility(i);
          if (obj.v.s() && obj.v.p()) {
             obj.f.setVisibility(i1);
          }
          ITimelineView$IRangeView$a$a c = (obj.v.s())? obj.v.i().c: obj.v.i().b;
          if (!PatchProxy.applyVoid(null, obj, BaseRangeView.class, "7")) {
             RelativeLayout$LayoutParams layoutParams = obj.c.getLayoutParams();
             i1 = (obj.v.o != null)? 0x7f070418: 0x7f070417;
             layoutParams.height = a1.d(i1);
             i1 = (obj.v.o != null)? 0x7f070f08: 0x7f070f07;
             i1 = a1.d(i1);
             layoutParams.leftMargin = i1;
             layoutParams.rightMargin = i1;
             obj.c.setLayoutParams(layoutParams);
             RelativeLayout$LayoutParams layoutParams1 = obj.d.getLayoutParams();
             int i3 = a1.d(R.dimen.arg_RES_7f0702e3);
             layoutParams1.height = layoutParams.height + (i3 * 2);
             int i4 = layoutParams.leftMargin - i3;
             layoutParams1.leftMargin = i4;
             layoutParams1.rightMargin = i4;
             obj.d.setLayoutParams(layoutParams1);
             layoutParams1 = obj.f.getLayoutParams();
             int i5 = a1.d(R.dimen.arg_RES_7f0702e3);
             i4 = i5 * 2;
             layoutParams1.width = layoutParams.width + i4;
             layoutParams1.height = layoutParams.height + i4;
             i = layoutParams.leftMargin - i5;
             layoutParams1.leftMargin = i;
             layoutParams1.rightMargin = i;
             obj.f.setLayoutParams(layoutParams1);
             if (!q.f(obj.t)) {
                Iterator iterator = obj.t.iterator();
                while (iterator.hasNext()) {
                   View view = iterator.next();
                   RelativeLayout$LayoutParams layoutParams2 = view.getLayoutParams();
                   i3 = (obj.v.o != null)? 0x7f070418: 0x7f070417;
                   layoutParams2.height = a1.d(i3);
                   i3 = (obj.v.o != null)? 0x7f070f08: 0x7f070f07;
                   i3 = a1.d(i3);
                   layoutParams2.leftMargin = i3;
                   layoutParams2.rightMargin = i3;
                   view.setLayoutParams(layoutParams2);
                }
             }
          }
          BaseRangeView c1 = obj.c;
          BaseRangeView v = obj.v;
          ITimelineView$IRangeView$a r = v.r;
          c1.g = v.p;
          c1.h = v.q;
          if (r >= null) {
             c1.i = r;
          }
          i1 = this.getPixelForSecond();
          double d = obj.v.h();
          ITimelineView$IRangeView$a n = obj.v.n;
          Objects.requireNonNull(c1);
          if (!PatchProxy.isSupport(MultiPartColorView.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(c), Integer.valueOf(i1), Double.valueOf(d), n, c1, MultiPartColorView.class, "2")) {
             if (n == null) {
                n = new ArrayList();
             }
             c1.e = c;
             c1.f = d;
             c1.c = i1;
             c1.d = n;
             c1.invalidate();
          }
          obj.d.setBackgroundResource(obj.v.i().f);
          obj1 = obj.e;
          i = (obj.v.o != null)? 0x7f080822: 0x7f081871;
          obj1.setBackgroundResource(i);
       }else {
          obj.e.setVisibility(i1);
          obj.f.setVisibility(i1);
          obj.d.setBackgroundResource(i);
       }
       return obj;
    }
    public ITimelineView$IRangeView$a getBindData(){
       return this.v;
    }
    public int getHandlerWidth(){
       return this.b;
    }
    public final Rect getLeftHandlerRect(){
       Rect obj = PatchProxy.apply(null, this, BaseRangeView.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Rect();
       Rect rect = n.B(this.e, true);
       Rect left = rect.left;
       obj.set(left, rect.top, (this.b + left), rect.bottom);
       return obj;
    }
    public final int getPixelForSecond(){
       ITimelineView obj = PatchProxy.apply(null, this, BaseRangeView.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.getTimelineViewByLayer();
       if (obj != null) {
          return obj.getPixelsForSecond();
       }
       return 1;
    }
    public final Rect getRightHandlerRect(){
       Rect obj = PatchProxy.apply(null, this, BaseRangeView.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Rect();
       Rect rect = n.B(this.e, true);
       Rect right = rect.right;
       obj.set((right - this.b), rect.top, right, rect.bottom);
       return obj;
    }
    public final ITimelineView getTimelineViewByLayer(){
       ViewParent obj = PatchProxy.apply(null, this, BaseRangeView.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getParent();
       while (true) {
          if (!obj instanceof View) {
             return null;
          }
          if (obj instanceof ITimelineView) {
             break ;
          }else {
             obj = obj.getParent();
          }
       }
       return obj;
    }
    public Rect getTouchableRect(){
       BaseRangeView obj = PatchProxy.apply(null, this, BaseRangeView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj != null && (obj.r() && this.v.s())) {
          return this.i(n.B(this, true));
       }
       return n.B(this.c, true);
    }
    public final boolean h(){
       BaseRangeView obj = PatchProxy.apply(null, this, BaseRangeView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.v;
       boolean b = (obj != null && (obj.f() == ITimelineView$IRangeView$RangeHandler.LEFT || this.v.f() == ITimelineView$IRangeView$RangeHandler.RIGHT))? true: false;
       return b;
    }
    public final Rect i(Rect p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseRangeView.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = n.c(a.a().a(), 10.00f);
       p0.left = p0.left - i;
       p0.right = p0.right + i;
       return p0;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, BaseRangeView.class, "11")) {
          return;
       }
       BaseRangeView th = this.h;
       if (th != null) {
          th.clear();
          this.h.recycle();
          this.h = null;
       }
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, BaseRangeView.class, "24")) {
          return;
       }
       int i = 0;
       this.o = i;
       BaseRangeView tv = this.v;
       if (tv != null) {
          tv.u(i);
       }
       this.q.removeCallbacks(this.u);
       return;
    }
    public final void l(boolean p0){
       if (PatchProxy.isSupport(BaseRangeView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BaseRangeView.class, "15")) {
          return;
       }
       if (this.e.isActivated() != p0) {
          this.e.setActivated(p0);
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, BaseRangeView.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       this.q.removeCallbacks(null);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       int i1;
       boolean b;
       BaseRangeView w;
       int i2;
       Object[] objArray1;
       VelocityTracker velocityTrac = this;
       BaseRangeView obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       BaseRangeView obj1 = PatchProxy.applyOneRefs(obj, velocityTrac, BaseRangeView.class, "9");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       String str = "BaseRangeView";
       if (!q.c(p0)) {
          float rawX = p0.getRawX();
          float rawY = p0.getRawY();
          if (!PatchProxy.isSupport(BaseRangeView.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(rawX), Float.valueOf(rawY), velocityTrac, BaseRangeView.class, "16")) {
             BaseRangeView v = velocityTrac.v;
             if (v != null) {
                v.w(ITimelineView$IRangeView$RangeHandler.NONE);
                if (!velocityTrac.e.getVisibility() && velocityTrac.i(this.getLeftHandlerRect()).contains((int)rawX, (int)rawY)) {
                   velocityTrac.v.w(ITimelineView$IRangeView$RangeHandler.LEFT);
                   objArray1 = new Object[0];
                   a.D().s(str, "indexOfPointInHandle: LEFT", objArray1);
                }else if(!velocityTrac.e.getVisibility() && velocityTrac.i(this.getRightHandlerRect()).contains((int)rawX, (int)rawY)){
                   velocityTrac.v.w(ITimelineView$IRangeView$RangeHandler.RIGHT);
                   objArray1 = new Object[0];
                   a.D().s(str, "indexOfPointInHandle: RIGHT", objArray1);
                }
                velocityTrac.g(this.getParent());
             }
          }
       }
       if (!this.h()) {
          Object[] objArray = new Object[0];
          a.D().s(str, "onTouchEvent: isHandlerDragging false", objArray);
          return 0;
       }else if(velocityTrac.h == null){
          velocityTrac.h = VelocityTracker.obtain();
       }
       int i = q.c(p0);
       ITimelineView$IRangeView$RangeHandler iRangeView$R = 2;
       double d = 0;
       if (i) {
          if (i != 1) {
             if (i != iRangeView$R) {
                if (i == 3) {
                   this.j();
                   velocityTrac.s = d;
                }
             }else {
                i = (int)(((double)p0.getRawX() - velocityTrac.l) + velocityTrac.m);
                if (velocityTrac.g != null && velocityTrac.v.f() != ITimelineView$IRangeView$RangeHandler.NONE) {
                   velocityTrac.h.addMovement(obj);
                   velocityTrac.h.computeCurrentVelocity(1000);
                   if (velocityTrac.h.getXVelocity() - (float)(velocityTrac.i * 12) <= 0) {
                      BaseRangeView g = velocityTrac.g;
                      i1 = velocityTrac.j + i;
                      ITimeLineGestureProcessor$HeadingDirection lEFT = (i < 0)? ITimeLineGestureProcessor$HeadingDirection.LEFT: ITimeLineGestureProcessor$HeadingDirection.RIGHT;
                      Pair pair = g.a(i1, lEFT);
                      if (pair.getSecond().intValue() >= 0) {
                         i1 = pair.getSecond().intValue() - velocityTrac.k;
                         velocityTrac.k = pair.getSecond().intValue();
                         velocityTrac.v.t(pair.getFirst());
                         if (velocityTrac.v.k() == Action$Type.SUBTITLE && velocityTrac.v.a()) {
                            g = (velocityTrac.v.f() == ITimelineView$IRangeView$RangeHandler.LEFT)? velocityTrac.p: - velocityTrac.p;
                            i1 = i1 + g;
                            velocityTrac.p = 0;
                         }
                      }else {
                         i1 = i;
                      }
                      velocityTrac.j = velocityTrac.j + i;
                   label_0196 :
                      if (!i) {
                         velocityTrac.m = velocityTrac.m + ((double)p0.getRawX() - velocityTrac.l);
                      }else if(PatchProxy.isSupport(BaseRangeView.class)){
                         ITimelineView obj2 = PatchProxy.applyOneRefs(Integer.valueOf(i), velocityTrac, BaseRangeView.class, "20");
                         if (obj2 != patchProxyRe) {
                            b = obj2.booleanValue();
                         }else {
                         label_01c5 :
                            double d1 = (double)i;
                            w = ((velocityTrac.n * d1) - d < 0)? 1: null;
                            if (!w) {
                               obj2 = this.getTimelineViewByLayer();
                               if (this.h() && obj2 != null) {
                                  Rect[] leftRightEdg = obj2.getLeftRightEdgesOnScreen();
                                  Rect leftHandlerR = (velocityTrac.v.f() == ITimelineView$IRangeView$RangeHandler.LEFT)? this.getLeftHandlerRect(): this.getRightHandlerRect();
                                  if (leftHandlerR.intersect(leftRightEdg[0])) {
                                     velocityTrac.o = (int)Math.ceil((((double)((long)(- obj2.getPixelsForSecond()) * 25) * 5.00f) / 0x408f400000000000));
                                     velocityTrac.v.u(true);
                                     if (!i) {
                                        d1 = velocityTrac.n;
                                     }
                                     velocityTrac.n = d1;
                                  }else if(leftHandlerR.intersect(leftRightEdg[1])){
                                     velocityTrac.o = (int)Math.ceil((((double)((long)obj2.getPixelsForSecond() * 25) * 5.00f) / 0x408f400000000000));
                                     velocityTrac.v.u(true);
                                     if (!i) {
                                        d1 = velocityTrac.n;
                                     }
                                     velocityTrac.n = d1;
                                  }else {
                                     w = 1;
                                  }
                               }
                            }
                            if (w) {
                               velocityTrac.v.u(0);
                               velocityTrac.q.removeCallbacks(velocityTrac.u);
                               velocityTrac.q.post(velocityTrac.u);
                               velocityTrac.n = d;
                               b = false;
                            }else {
                               b = true;
                            }
                         }
                      }else {
                         goto label_01c5 ;
                      }
                      if (!b) {
                         w = velocityTrac.w;
                         if (w != null) {
                            w.b(velocityTrac.v.f(), velocityTrac, i1);
                         }
                      }
                      velocityTrac.l = (double)p0.getRawX();
                   }else {
                      velocityTrac.j = velocityTrac.j + i;
                      velocityTrac.k = velocityTrac.k + i;
                      velocityTrac.v.t(TimeLineGestureProcessor$AbsorbStatus.IDLE);
                   }
                }
                i1 = i;
                goto label_0196 ;
             }
          }else {
             double d2 = (double)p0.getRawX();
             velocityTrac.s = d2;
             b = (Math.abs((d2 - velocityTrac.r)) - 0x3ff0000000000000 < 0)? true: false;
             this.j();
             velocityTrac.j = 0;
             velocityTrac.k = 0;
             velocityTrac.p = 1;
             obj1 = velocityTrac.w;
             if (obj1 != null) {
                obj1.d(velocityTrac.v.f(), velocityTrac, b);
             }
             w = velocityTrac.v;
             if (w != null) {
                w.w(ITimelineView$IRangeView$RangeHandler.NONE);
             }
             w = velocityTrac.g;
             if (w != null) {
                w.c();
             }
             this.d();
             this.k();
             if (this.getParent() != null) {
                velocityTrac.g(this.getParent());
                this.getParent().requestDisallowInterceptTouchEvent(0);
             }
             velocityTrac.s = (double)p0.getRawX();
          }
       }else {
          double d3 = (double)p0.getRawX();
          velocityTrac.l = d3;
          velocityTrac.r = d3;
          velocityTrac.m = d;
          velocityTrac.p = 1;
          if (velocityTrac.v.f() == ITimelineView$IRangeView$RangeHandler.LEFT) {
             velocityTrac.j = (int)(velocityTrac.v.h() * (double)velocityTrac.i);
          }else if(velocityTrac.v.f() == ITimelineView$IRangeView$RangeHandler.RIGHT){
             velocityTrac.j = (int)(velocityTrac.v.g() * (double)velocityTrac.i);
          }
          velocityTrac.k = velocityTrac.j;
          velocityTrac.g(this.getParent());
          if (this.h()) {
             this.getParent().requestDisallowInterceptTouchEvent(true);
          }
          if (!PatchProxy.applyVoid(null, velocityTrac, BaseRangeView.class, "23")) {
             this.k();
             velocityTrac.q.post(velocityTrac.u);
          }
          obj = velocityTrac.w;
          if (obj != null) {
             obj.a(velocityTrac.v.f(), velocityTrac);
          }
       }
       if (!PatchProxy.applyVoid(null, velocityTrac, BaseRangeView.class, "10") && (velocityTrac.w != null && Math.abs((velocityTrac.s - velocityTrac.r)) - 0x3ff0000000000000 < 0)) {
          int[] ointArray = new int[2];
          velocityTrac.e.getLocationOnScreen(ointArray);
          if (velocityTrac.s - (double)(ointArray[0] + (velocityTrac.e.getWidth() / 2)) < 0) {
             velocityTrac.w.e(velocityTrac, (this.getLeftHandlerRect().left + a1.e(10.00f)), true);
          }else {
             velocityTrac.w.e(velocityTrac, (this.getRightHandlerRect().right - a1.e(10.00f)), 0);
          }
       }
       return true;
    }
}
