package com.kwai.library.groot.framework.viewpager.GrootTouchViewPager;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import android.content.Context;
import android.util.AttributeSet;
import java.util.BitSet;
import java.util.ArrayList;
import com.kwai.library.groot.framework.viewpager.constant.GrootTargetBoundUpdatedType;
import android.view.View;
import java.lang.Object;
import java.util.List;
import tw6.c;
import android.view.MotionEvent;
import java.lang.StringBuilder;
import java.lang.String;
import h3.a;
import lw6.a;
import android.graphics.Rect;
import java.util.Iterator;
import java.util.Collection;
import ow6.a;
import tw6.e;
import android.view.ViewGroup;
import java.lang.Math;
import sw6.a;

public class GrootTouchViewPager extends VerticalViewPager	// class@000837
{
    public final List A1;
    public final List B1;
    public final List C1;
    public int D1;
    public int l1;
    public boolean m1;
    public boolean n1;
    public float o1;
    public float p1;
    public int q1;
    public boolean r1;
    public boolean s1;
    public boolean t1;
    public boolean u1;
    public boolean v1;
    public boolean w1;
    public boolean x1;
    public final BitSet y1;
    public a z1;

    public void GrootTouchViewPager(Context p0){
       super(p0, null);
    }
    public void GrootTouchViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.l1 = 0;
       this.t1 = false;
       this.u1 = false;
       this.v1 = true;
       this.w1 = false;
       this.x1 = true;
       this.y1 = new BitSet();
       this.A1 = new ArrayList();
       this.B1 = new ArrayList();
       this.C1 = new ArrayList();
    }
    public void K(int p0,boolean p1,boolean p2){
       super.K(p0, p1, p2);
       this.f0(GrootTargetBoundUpdatedType.ON_SCROLL_END);
    }
    public int R(int p0){
       GrootTouchViewPager tq1;
       if (this.getCurrentItem() <= this.getFirstValidItemPosition()) {
          tq1 = this.q1;
          if ((p0 - tq1) < 0) {
             return tq1;
          }
       }
       if (this.getCurrentItem() >= this.getLastValidItemPosition()) {
          tq1 = this.q1;
          if ((p0 - tq1) > 0) {
             return tq1;
          }
       }
       return p0;
    }
    public void S(View p0){
       if (!this.A1.contains(p0)) {
          this.A1.add(p0);
       }
       return;
    }
    public void T(c p0){
       if (!this.B1.contains(p0)) {
          this.B1.add(p0);
       }
       return;
    }
    public final boolean U(MotionEvent p0){
       boolean b = true;
       if (!p0.getActionMasked()) {
          int i = (this.Y(p0))? 1: 2;
          this.l1 = i;
       }
       if (this.l1 != b) {
          b = false;
       }
       return b;
    }
    public void V(){
    }
    public final boolean W(){
       a.b("GrootTouchViewPager", "ignoreTouchEvent, mShouldNotifyLazyLoad = "+this.n1+" mIsIgnoreTouchEvent = "+this.w1+" mEnabled = "+this.x1+" getAdapter = "+this.getAdapter()+" mBanOperation = "+this.u1);
       boolean b = (this.n1 == null && (this.w1 == null && (this.x1 != null && (this.getAdapter() == null || this.u1 != null))))? true: false;
       return b;
    }
    public final void X(MotionEvent p0){
       if (p0.getActionMasked()) {
       }else {
          this.o1 = p0.getX();
          this.p1 = p0.getY();
          this.l1 = 0;
          this.s1 = false;
          this.r1 = false;
       }
       return;
    }
    public boolean Y(MotionEvent p0){
       Rect rect = new Rect();
       Iterator iterator = this.A1.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          iterator.next().getGlobalVisibleRect(rect);
          if (rect.contains((int)p0.getRawX(), (int)p0.getRawY())) {
             break ;
          }
       }
       return true;
    }
    public boolean Z(){
       return (this.x1 ^ 0x01);
    }
    public boolean a0(){
       boolean b = (this.m1 != null && this.r1 != null)? true: false;
       return b;
    }
    public void b0(View p0){
       this.A1.remove(p0);
    }
    public void c0(boolean p0,int p1){
       a.b("GrootTouchViewPager", "enable:"+p0+";flag:"+p1);
       if (p0) {
          this.y1.clear(p1);
       }else {
          this.y1.set(p1);
       }
       p0 = (!this.y1.cardinality())? true: false;
       this.x1 = p0;
       return;
    }
    public void d0(int p0){
       if (a.c(this.C1)) {
          return;
       }
       int i = 2;
       this.c0(false, i);
       int i1 = 1;
       if (p0 == i1 || p0 == i) {
          this.u1 = i1;
       }
       Iterator iterator = this.C1.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       return;
    }
    public void e0(){
    }
    public void f0(GrootTargetBoundUpdatedType p0){
       if (p0 == GrootTargetBoundUpdatedType.ON_SCROLL_END) {
          this.q1 = this.getScrollY();
       }else if(p0 == GrootTargetBoundUpdatedType.RESET){
          this.q1 = 0;
       }else if(p0 == GrootTargetBoundUpdatedType.ON_MOVE_TO_NEXT){
          this.q1 = this.q1 + this.getHeight();
       }else {
          this.q1 = this.q1 - this.getHeight();
       }
       return;
    }
    public int g(int p0,float p1,int p2,int p3){
       return Math.max(Math.min(super.g(p0, p1, p2, p3), this.getLastValidItemPosition()), this.getFirstValidItemPosition());
    }
    public a getAdapter(){
       return super.getAdapter();
    }
    public int getFirstValidItemPosition(){
       return 0;
    }
    public int getLastValidItemPosition(){
       return (this.getAdapter().j() - 1);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       boolean b = false;
       if (this.u1 != null) {
          a.b("GrootTouchViewPager", "onInterceptTouchEvent, mBanOperation ,return true");
          this.u1 = b;
          return true;
       }else if(this.W()){
          a.b("GrootTouchViewPager", "onInterceptTouchEvent, ignoreTouchEvent ,return false");
          return b;
       }else {
          int i = p0.getAction() & 0x00ff;
          this.X(p0);
          if (this.U(p0)) {
             a.b("GrootTouchViewPager", "onInterceptTouchEvent, checkIgnoreMove ,return false");
             return b;
          }else {
             int i1 = 2;
             if (i == i1) {
                float f = Math.abs((p0.getX() - this.o1));
                float y = p0.getY();
                GrootTouchViewPager tp1 = this.p1;
                float f1 = y - tp1;
                y = Math.abs((y - tp1));
                VerticalViewPager tE = this.E;
                if (f - (float)tE < 0 && y - (float)tE < 0) {
                   b = true;
                }
                this.t1 = b;
                if (this.getCurrentItem() == this.getFirstValidItemPosition()) {
                   a.b("GrootTouchViewPager", "onInterceptTouchEvent, getCurrentItem\(\) == getFirstValidItemPosition\(\), "+this.getCurrentItem());
                   if (f1 - (float)this.E > 0 && (y * 0x3f000000) - f > 0) {
                      this.r1 = true;
                      if (this.m1 != null) {
                         GrootTouchViewPager tz1 = this.z1;
                         if (tz1 != null) {
                            tz1.b(p0);
                         }
                      }
                      a.b("GrootTouchViewPager", "onInterceptTouchEvent, pull refresh  ,return true");
                      return true;
                   }
                }
                if (this.getCurrentItem() != this.getFirstValidItemPosition() && (this.getTranslationY() && (f1 - (float)this.E > 0 && y - f > 0))) {
                   a.b("GrootTouchViewPager", "onInterceptTouchEvent, translateYToTop down ,return true");
                   this.d0(i1);
                   return true;
                }else if(this.getTranslationY() && (f1 - (float)(- this.E) < 0 && y - f > 0)){
                   a.b("GrootTouchViewPager", "onInterceptTouchEvent, translateYToTop up,return true");
                   this.d0(true);
                   return true;
                }else if(this.getCurrentItem() == this.getLastValidItemPosition() && (f1 - (float)(- this.E) < 0 && (y * 0x3f000000) - f > 0)){
                   a.b("GrootTouchViewPager", "onInterceptTouchEvent, set mDisableMoveToNext = true,return true");
                   this.s1 = true;
                   return true;
                }
             }
          label_0103 :
             if (this.getTranslationY() && (i == 1 && this.t1 != null)) {
                a.b("GrootTouchViewPager", "onInterceptTouchEvent, translateYToTop click");
                this.d0(3);
             }
          label_011a :
             if (this.m1 != null && this.z1 != null) {
                a.b("GrootTouchViewPager", "mRefreshInterceptor.onInterceptTouchEvent\(ev\)"+p0.getY());
                this.z1.b(p0);
             }
             return super.onInterceptTouchEvent(p0);
          }
       }
    }
    public boolean onTouchEvent(MotionEvent p0){
       float f;
       float y;
       Iterator iterator;
       boolean b = false;
       if (this.u1 != null && p0.getAction() == 1) {
          a.b("GrootTouchViewPager", "onTouchEvent, mBanOperation == true,return true");
          this.u1 = b;
          return true;
       }else if(this.W()){
          a.b("GrootTouchViewPager", "onTouchEvent, ignoreTouchEvent ,return false");
          return b;
       }else {
          int i = p0.getAction() & 0x00ff;
          this.X(p0);
          if (this.U(p0)) {
             a.b("GrootTouchViewPager", "onTouchEvent, checkIgnoreMove ,return false");
             return b;
          }else if(!this.getCurrentItem() && !this.getChildCount()){
             a.b("GrootTouchViewPager", "onTouchEvent, getCurrentItem == 0,getChildCount==0,return false");
             return b;
          }else if(this.v1 == null){
             a.b("GrootTouchViewPager", "onTouchEvent, mIsScrollEnd ,return super");
             return super.onTouchEvent(p0);
          }else {
             GrootTouchViewPager grootTouchVi = 0x3f000000;
             if (i) {
                if (i != 1) {
                   if (i == 0.00f) {
                   label_00e0 :
                      f = Math.abs((p0.getX() - this.o1));
                      y = p0.getY();
                      GrootTouchViewPager tp1 = this.p1;
                      float f1 = y - tp1;
                      y = Math.abs((y - tp1));
                      if (this.getCurrentItem() == this.getFirstValidItemPosition()) {
                         if (f1 - (float)this.E > 0 && (y * grootTouchVi) - f > 0) {
                            this.r1 = true;
                         }
                         if (this.r1 == null && (f1 > 0 && this.m1 != null)) {
                            tp1 = this.z1;
                            if (tp1 != null) {
                               tp1.a(p0);
                            }
                         }
                      }
                   label_0125 :
                      if (this.getCurrentItem() == this.getLastValidItemPosition() && (f1 - (float)(- this.E) < 0 && (y * grootTouchVi) - f > 0)) {
                         this.s1 = true;
                      }
                   }
                }else {
                   f = Math.abs((p0.getX() - this.o1));
                   y = p0.getY();
                   float f2 = Math.abs((y - this.p1));
                   if (f2 - (float)this.E > 0 && (f2 * grootTouchVi) - f > 0) {
                      if (this.m1 == null && (y - this.p1 > 0 && this.getCurrentItem() == this.getFirstValidItemPosition())) {
                         this.V();
                         iterator = this.B1.iterator();
                         while (iterator.hasNext()) {
                            iterator.next().a();
                         }
                      }else if(this.getCurrentItem() == this.getLastValidItemPosition() && y - this.p1 < 0){
                         this.e0();
                         iterator = this.B1.iterator();
                         while (iterator.hasNext()) {
                            iterator.next().b();
                         }
                      }
                   }
                }
             }else {
                this.s1 = b;
                this.r1 = b;
                goto label_00e0 ;
             }
             if (this.r1 != null) {
                if (i == 1 || i == 3) {
                   this.r1 = b;
                }
                if (this.m1 != null) {
                   GrootTouchViewPager tz1 = this.z1;
                   if (tz1 != null) {
                      tz1.a(p0);
                   }
                }
                a.b("GrootTouchViewPager", "onTouchEvent, mIsPullToRefresh ,return true");
                return true;
             }else if(this.s1 != null){
                if (i == 1) {
                   super.onTouchEvent(p0);
                }
                a.b("GrootTouchViewPager", "onTouchEvent, mDisableMoveToNext ,return true");
                return true;
             }else {
                return super.onTouchEvent(p0);
             }
          }
       }
    }
    public void scrollTo(int p0,int p1){
       super.scrollTo(p0, (p1 + this.D1));
    }
    public void setAdapter(a p0){
       super.setAdapter(p0);
       this.f0(GrootTargetBoundUpdatedType.RESET);
    }
    public void setEnablePullToRefresh(boolean p0){
       this.m1 = p0;
    }
    public void setEnabled(boolean p0){
       super.setEnabled(p0);
       this.c0(p0, 1);
    }
    public void setIgnoreTouchEvent(boolean p0){
       this.w1 = p0;
    }
    public void setNotifyLazyLoad(boolean p0){
       this.n1 = p0;
    }
    public void setPullRefreshInterceptor(a p0){
       this.z1 = p0;
    }
    public void setViewPagerTranslationY(int p0){
       GrootTouchViewPager tD1 = this.D1;
       this.D1 = p0;
       int i = this.getScrollY() - tD1;
       StringBuilder str = "setViewPagerTranslationY,  lastTranslationY = "+tD1;
       a.b("GrootTouchViewPager", str+" offset = "+p0+" y = "+i);
       this.scrollTo(this.getScrollX(), i);
    }
    public void w(){
       GrootTouchViewPager tz1 = this.z1;
       if (tz1 != null) {
          boolean b = (this.getCurrentItem() == this.getFirstValidItemPosition())? true: false;
          tz1.c(b);
       }
       this.f0(GrootTargetBoundUpdatedType.ON_SCROLL_END);
       return;
    }
}
