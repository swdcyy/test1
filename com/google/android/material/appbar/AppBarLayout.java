package com.google.android.material.appbar.AppBarLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.os.Build$VERSION;
import android.view.View;
import sj.m;
import ll8.c$b;
import android.content.res.TypedArray;
import ck.k;
import android.graphics.drawable.Drawable;
import a2.i0;
import com.google.android.material.appbar.AppBarLayout$a;
import a2.z;
import com.google.android.material.appbar.AppBarLayout$b;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;
import com.google.android.material.appbar.AppBarLayout$c;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.appbar.AppBarLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import a2.u0;
import z1.d;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.lang.IllegalArgumentException;
import java.lang.String;

public class AppBarLayout extends LinearLayout	// class@001617
{
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public u0 g;
    public List h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int[] m;

    public void AppBarLayout(Context p0){
       super(p0, null);
    }
    public void AppBarLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = -1;
       this.c = -1;
       this.d = -1;
       this.f = 0;
       this.setOrientation(1);
       int sDK_INT = Build$VERSION.SDK_INT;
       m.a(this);
       m.c(this, p1, 0, R.style.arg_RES_7f1104b9);
       int[] ointArray = new int[0];
       TypedArray typedArray = k.h(p0, p1, c$b.n, 0, R.style.arg_RES_7f1104b9, ointArray);
       i0.v0(this, typedArray.getDrawable(0));
       int i = 4;
       if (typedArray.hasValue(i)) {
          this.q(typedArray.getBoolean(i, 0), 0, 0);
       }
       i = 3;
       if (typedArray.hasValue(i)) {
          m.b(this, (float)typedArray.getDimensionPixelSize(i, 0));
       }
       if (sDK_INT >= 26) {
          i = 2;
          if (typedArray.hasValue(i)) {
             this.setKeyboardNavigationCluster(typedArray.getBoolean(i, 0));
          }
          if (typedArray.hasValue(1)) {
             this.setTouchscreenBlocksFocus(typedArray.getBoolean(1, 0));
          }
       }
       this.l = typedArray.getBoolean(5, 0);
       typedArray.recycle();
       i0.I0(this, new AppBarLayout$a(this));
       return;
    }
    public void b(AppBarLayout$b p0){
       if (this.h == null) {
          this.h = new ArrayList();
       }
       if (p0 != null && !this.h.contains(p0)) {
          this.h.add(p0);
       }
       return;
    }
    public void c(AppBarLayout$c p0){
       this.b(p0);
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       return p0 instanceof AppBarLayout$LayoutParams;
    }
    public void d(int p0){
       AppBarLayout th = this.h;
       if (th != null) {
          int i = 0;
          int i1 = th.size();
          while (i < i1) {
             AppBarLayout$b uob = this.h.get(i);
             if (uob != null) {
                uob.Y0(this, p0);
             }
             i = i + 1;
          }
       }
       return;
    }
    public AppBarLayout$LayoutParams e(){
       return new AppBarLayout$LayoutParams(-1, -2);
    }
    public AppBarLayout$LayoutParams f(AttributeSet p0){
       return new AppBarLayout$LayoutParams(this.getContext(), p0);
    }
    public AppBarLayout$LayoutParams g(ViewGroup$LayoutParams p0){
       if (p0 instanceof LinearLayout$LayoutParams) {
          return new AppBarLayout$LayoutParams(p0);
       }
       if (p0 instanceof ViewGroup$MarginLayoutParams) {
          return new AppBarLayout$LayoutParams(p0);
       }
       return new AppBarLayout$LayoutParams(p0);
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return this.e();
    }
    public LinearLayout$LayoutParams generateDefaultLayoutParams(){
       return this.e();
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return this.f(p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       return this.g(p0);
    }
    public LinearLayout$LayoutParams generateLayoutParams(AttributeSet p0){
       return this.f(p0);
    }
    public LinearLayout$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       return this.g(p0);
    }
    public int getDownNestedPreScrollRange(){
       AppBarLayout tc = this.c;
       if (tc != -1) {
          return tc;
       }
       int i = this.getChildCount() - 1;
       int i1 = 0;
       while (i >= 0) {
          View childAt = this.getChildAt(i);
          AppBarLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          int measuredHeig = childAt.getMeasuredHeight();
          AppBarLayout$LayoutParams a = layoutParams.a;
          int i2 = a & 0x05;
          if (i2 == 5) {
             i2 = layoutParams.topMargin + layoutParams.bottomMargin;
             i1 = i1 + i2;
             int i3 = a & 0x08;
             if (i3) {
                i1 = i1 + i0.C(childAt);
             }else {
                i3 = a & 0x02;
                int i4 = (i3)? i0.C(childAt): this.getTopInset();
                measuredHeig = measuredHeig - i4;
                i1 = i1 + measuredHeig;
             }
          }else if(i1 > 0){
             break ;
          }
          i = i - 1;
       }
       i = Math.max(0, i1);
       this.c = i;
       return i;
    }
    public int getDownNestedScrollRange(){
       AppBarLayout td = this.d;
       if (td != -1) {
          return td;
       }
       int childCount = this.getChildCount();
       int i = 0;
       int i1 = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          AppBarLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          int i2 = layoutParams.topMargin + layoutParams.bottomMargin;
          int i3 = childAt.getMeasuredHeight() + i2;
          layoutParams = layoutParams.a;
          i2 = layoutParams & 0x01;
          if (i2) {
             i1 = i1 + i3;
             int i4 = layoutParams & 0x02;
             if (i4) {
                i1 = i1 - (i0.C(childAt) + this.getTopInset());
                break ;
             }else {
                i = i + 1;
             }
          }else {
             break ;
          }
       }
       childCount = Math.max(0, i1);
       this.d = childCount;
       return childCount;
    }
    public final int getMinimumHeightForVisibleOverlappingContent(){
       int topInset = this.getTopInset();
       int i = i0.C(this);
       if (!i) {
          i = this.getChildCount();
          i = (i >= 1)? i0.C(this.getChildAt((i - 1))): 0;
          if (!i) {
             return (this.getHeight() / 3);
          }
       }
       return ((i * 2) + topInset);
    }
    public int getPendingAction(){
       return this.f;
    }
    public float getTargetElevation(){
       return 0;
    }
    public final int getTopInset(){
       AppBarLayout tg = this.g;
       int i = (tg != null)? tg.k(): 0;
       return i;
    }
    public final int getTotalScrollRange(){
       AppBarLayout tb = this.b;
       if (tb != -1) {
          return tb;
       }
       int childCount = this.getChildCount();
       int i = 0;
       int i1 = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          AppBarLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          int measuredHeig = childAt.getMeasuredHeight();
          AppBarLayout$LayoutParams a = layoutParams.a;
          int i2 = a & 0x01;
          if (i2) {
             measuredHeig = measuredHeig + layoutParams.topMargin;
             measuredHeig = measuredHeig + layoutParams.bottomMargin;
             i1 = i1 + measuredHeig;
             int i3 = a & 0x02;
             if (i3) {
                i1 = i1 - i0.C(childAt);
                break ;
             }else {
                i = i + 1;
             }
          }else {
             break ;
          }
       }
       childCount = Math.max(0, (i1 - this.getTopInset()));
       this.b = childCount;
       return childCount;
    }
    public int getUpNestedPreScrollRange(){
       return this.getTotalScrollRange();
    }
    public boolean h(){
       return this.e;
    }
    public final boolean i(){
       int childCount = this.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return false;
          }
          if (this.getChildAt(i).getLayoutParams().c()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public boolean j(){
       boolean b = (this.getTotalScrollRange())? true: false;
       return b;
    }
    public final void k(){
       this.b = -1;
       this.c = -1;
       this.d = -1;
    }
    public boolean l(){
       return this.l;
    }
    public u0 m(u0 p0){
       Object obj = (i0.y(this))? p0: null;
       if (!d.a(this.g, obj)) {
          this.g = obj;
          this.k();
       }
       return p0;
    }
    public void n(AppBarLayout$b p0){
       AppBarLayout th = this.h;
       if (th != null && p0 != null) {
          th.remove(p0);
       }
       return;
    }
    public void o(AppBarLayout$c p0){
       this.n(p0);
    }
    public int[] onCreateDrawableState(int p0){
       if (this.m == null) {
          int[] ointArray = new int[4];
          this.m = ointArray;
       }
       AppBarLayout tm = this.m;
       int[] ointArray1 = super.onCreateDrawableState((p0 + tm.length));
       int i = 0;
       AppBarLayout tj = this.j;
       int i1 = (tj != null)? 0x7f04087e: -2130970750;
       tm[i] = i1;
       i = 1;
       i1 = (tj != null && this.k != null)? 0x7f04087f: -2130970751;
       tm[i] = i1;
       i = 2;
       i1 = (tj != null)? 0x7f04087d: -2130970749;
       tm[i] = i1;
       int i2 = (tj != null && this.k != null)? 0x7f04087c: -2130970748;
       tm[3] = i2;
       return LinearLayout.mergeDrawableStates(ointArray1, tm);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       this.k();
       p0 = false;
       this.e = p0;
       p1 = this.getChildCount();
       p2 = 0;
       while (p2 < p1) {
          if (this.getChildAt(p2).getLayoutParams().b() != null) {
             this.e = true;
             break ;
          }else {
             p2++;
          }
       }
       if (this.i == null) {
          if (this.l != null || this.i()) {
             p0 = true;
          }
          this.r(p0);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       this.k();
    }
    public void p(boolean p0,boolean p1){
       this.q(p0, p1, true);
    }
    public final void q(boolean p0,boolean p1,boolean p2){
       int i = (p0)? 1: 2;
       int i1 = 0;
       int i2 = (p1)? 4: 0;
       i = i | i2;
       if (p2) {
          i1 = 8;
       }
       this.f = i | i1;
       this.requestLayout();
       return;
    }
    public final boolean r(boolean p0){
       if (this.j == p0) {
          return false;
       }
       this.j = p0;
       this.refreshDrawableState();
       return true;
    }
    public void resetPendingAction(){
       this.f = 0;
    }
    public boolean s(boolean p0){
       if (this.k == p0) {
          return false;
       }
       this.k = p0;
       this.refreshDrawableState();
       return true;
    }
    public void setExpanded(boolean p0){
       this.p(p0, i0.Y(this));
    }
    public void setLiftOnScroll(boolean p0){
       this.l = p0;
    }
    public void setOrientation(int p0){
       if (p0 != 1) {
          throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
       }
       super.setOrientation(p0);
       return;
    }
    public void setTargetElevation(float p0){
       m.b(this, p0);
    }
}
