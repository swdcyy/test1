package com.yxcorp.gifshow.widget.ProfilePYMKSwipeDetailLayout;
import a2.x;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.View;
import i2b.a;
import com.yxcorp.utility.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.lang.Integer;
import android.view.ViewParent;
import a2.i0;
import com.yxcorp.gifshow.widget.ProfilePYMKSwipeDetailLayout$c;
import com.yxcorp.gifshow.widget.ProfilePYMKSwipeDetailLayout$b;
import com.yxcorp.gifshow.widget.ProfilePYMKSwipeDetailLayout$a;
import android.view.animation.Animation;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class ProfilePYMKSwipeDetailLayout extends LinearLayout implements x	// class@0018a2
{
    public View b;
    public RecyclerView c;
    public ProfilePYMKSwipeDetailLayout$c d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;

    public void ProfilePYMKSwipeDetailLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ProfilePYMKSwipeDetailLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = false;
       this.setOrientation(false);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.q4);
       this.h = typedArray.getDimensionPixelSize(1, false);
       this.b = a.a(p0, typedArray.getResourceId(false, false));
       typedArray.recycle();
       this.g = n.y(p0);
    }
    public int getNestedScrollAxes(){
       return 0;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, ProfilePYMKSwipeDetailLayout.class, "4")) {
          return;
       }
       super.onDetachedFromWindow();
       this.clearAnimation();
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, ProfilePYMKSwipeDetailLayout.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.c = this.getChildAt(0);
       this.addView(this.b, this.getChildCount(), new LinearLayout$LayoutParams(this.h, -1));
       return;
    }
    public boolean onNestedFling(View p0,float p1,float p2,boolean p3){
       return false;
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       return false;
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3){
       if (PatchProxy.isSupport(ProfilePYMKSwipeDetailLayout.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, ProfilePYMKSwipeDetailLayout.class, "3")) {
          return;
       }
       this.getParent().requestDisallowInterceptTouchEvent(true);
       int i = (p1 < 0 && (this.getScrollX() > 0 && !i0.d(p0, true)))? 1: 0;
       int i1 = (p1 > 0 && !i0.d(p0, true))? 1: 0;
       if (i || i1) {
          this.scrollBy((p1 / 2), 0);
          p3[0] = p1;
       }
       if (p1 > 0 && (this.getScrollX() > 0 && !i0.d(p0, -1))) {
          this.scrollTo(0, 0);
       }
    label_0060 :
       if (p1 < 0 && (this.getScrollX() < 0 && !i0.d(p0, true))) {
          this.scrollTo(0, 0);
       }
    label_0071 :
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4){
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2){
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       boolean b = (p1 instanceof RecyclerView && this.e == null)? true: false;
       return b;
    }
    public void onStopNestedScroll(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePYMKSwipeDetailLayout.class, "2")) {
          return;
       }
       int[] ointArray = new int[2];
       this.b.getLocationOnScreen(ointArray);
       int i = 0;
       if (ointArray[i] >= this.g) {
          return;
       }
       if ((n.z(this.getContext()) - ointArray[i]) >= this.h) {
          i = 1;
       }
       if (i) {
          ProfilePYMKSwipeDetailLayout td = this.d;
          if (td != null) {
             td.b((this.f ^ 1));
          }
          this.f = true;
       }
       this.startAnimation(new ProfilePYMKSwipeDetailLayout$b(this, i, null));
       return;
    }
    public void scrollTo(int p0,int p1){
       if (PatchProxy.isSupport(ProfilePYMKSwipeDetailLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ProfilePYMKSwipeDetailLayout.class, "5")) {
          return;
       }
       if (p0 >= 0 && (this.c.getAdapter() == null || this.c.getAdapter().getItemCount() <= 6)) {
          p0 = 0;
       }else {
          ProfilePYMKSwipeDetailLayout th = this.h;
          if (p0 > th) {
             ProfilePYMKSwipeDetailLayout profilePYMKS = th;
          }
       }
       super.scrollTo(p0, p1);
       return;
    }
    public void setSwipeFooterListener(ProfilePYMKSwipeDetailLayout$c p0){
       this.d = p0;
    }
}
