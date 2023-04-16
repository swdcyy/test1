package com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.graphics.Rect;
import android.widget.ImageButton;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import a2.i0;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;
import java.lang.Object;
import com.google.android.material.internal.VisibilityAwareImageButton;
import ck.d;
import com.google.android.material.floatingactionbutton.FloatingActionButton$a;

public class FloatingActionButton$BaseBehavior extends CoordinatorLayout$Behavior	// class@001689
{
    public Rect a;
    public FloatingActionButton$a b;
    public boolean c;

    public void FloatingActionButton$BaseBehavior(){
       super();
       this.c = true;
    }
    public void FloatingActionButton$BaseBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.M0);
       this.c = typedArray.getBoolean(0, true);
       typedArray.recycle();
    }
    public static boolean d(View p0){
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams instanceof CoordinatorLayout$LayoutParams) {
          return layoutParams.f() instanceof BottomSheetBehavior;
       }
       return false;
    }
    public boolean c(CoordinatorLayout p0,FloatingActionButton p1,Rect p2){
       FloatingActionButton n = p1.n;
       p2.set((p1.getLeft() + n.left), (p1.getTop() + n.top), (p1.getRight() - n.right), (p1.getBottom() - n.bottom));
       return true;
    }
    public final void e(CoordinatorLayout p0,FloatingActionButton p1){
       Rect right;
       FloatingActionButton n = p1.n;
       if (n != null && (n.centerX() > 0 && n.centerY() > 0)) {
          CoordinatorLayout$LayoutParams layoutParams = p1.getLayoutParams();
          Rect rect = null;
          if (p1.getRight() >= (p0.getWidth() - layoutParams.rightMargin)) {
             right = n.right;
          }else if(p1.getLeft() <= layoutParams.leftMargin){
             right = - n.left;
          }else {
             right = 0;
          }
          if (p1.getBottom() >= (p0.getHeight() - layoutParams.bottomMargin)) {
             rect = n.bottom;
          }else if(p1.getTop() <= layoutParams.topMargin){
             rect = - n.top;
          }
          if (rect) {
             i0.e0(p1, rect);
          }
          if (right) {
             i0.d0(p1, right);
          }
       }
    label_0059 :
       return;
    }
    public boolean g(CoordinatorLayout p0,FloatingActionButton p1,View p2){
       if (p2 instanceof AppBarLayout) {
          this.j(p0, p2, p1);
       }else if(FloatingActionButton$BaseBehavior.d(p2)){
          this.k(p2, p1);
       }
       return false;
    }
    public boolean getInsetDodgeRect(CoordinatorLayout p0,View p1,Rect p2){
       this.c(p0, p1, p2);
       return true;
    }
    public boolean h(CoordinatorLayout p0,FloatingActionButton p1,int p2){
       List list = p0.s(p1);
       int i = list.size();
       int i1 = 0;
       while (i1 < i) {
          View view = list.get(i1);
          if (view instanceof AppBarLayout) {
             if (this.j(p0, view, p1)) {
                break ;
             }
          }else if(FloatingActionButton$BaseBehavior.d(view) && this.k(view, p1)){
             break ;
          }
          i1 = i1 + 1;
       }
       p0.J(p1, p2);
       this.e(p0, p1);
       return true;
    }
    public final boolean i(View p0,FloatingActionButton p1){
       CoordinatorLayout$LayoutParams layoutParams = p1.getLayoutParams();
       if (this.c == null) {
          return false;
       }
       if (layoutParams.e() != p0.getId()) {
          return false;
       }
       if (p1.getUserSetVisibility()) {
          return false;
       }
       return true;
    }
    public final boolean j(CoordinatorLayout p0,AppBarLayout p1,FloatingActionButton p2){
       if (!this.i(p1, p2)) {
          return false;
       }
       if (this.a == null) {
          this.a = new Rect();
       }
       FloatingActionButton$BaseBehavior ta = this.a;
       d.a(p0, p1, ta);
       if (ta.bottom <= p1.getMinimumHeightForVisibleOverlappingContent()) {
          p2.k(null, false);
       }else {
          p2.r(null, false);
       }
       return true;
    }
    public final boolean k(View p0,FloatingActionButton p1){
       if (!this.i(p0, p1)) {
          return false;
       }
       if (p0.getTop() < ((p1.getHeight() / 2) + p1.getLayoutParams().topMargin)) {
          p1.k(null, false);
       }else {
          p1.r(null, false);
       }
       return true;
    }
    public void onAttachedToLayoutParams(CoordinatorLayout$LayoutParams p0){
       if (p0.h == null) {
          p0.h = 80;
       }
       return;
    }
    public boolean onDependentViewChanged(CoordinatorLayout p0,View p1,View p2){
       this.g(p0, p1, p2);
       return false;
    }
    public boolean onLayoutChild(CoordinatorLayout p0,View p1,int p2){
       this.h(p0, p1, p2);
       return true;
    }
}
