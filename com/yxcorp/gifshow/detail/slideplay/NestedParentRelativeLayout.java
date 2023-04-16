package com.yxcorp.gifshow.detail.slideplay.NestedParentRelativeLayout;
import a2.x;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.utility.n;
import a2.y;
import android.view.ViewGroup;
import android.animation.ValueAnimator;
import java.lang.Object;
import java.lang.Integer;
import com.yxcorp.gifshow.detail.slideplay.NestedParentRelativeLayout$d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import java.lang.Float;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slideplay.NestedParentRelativeLayout$b;
import com.yxcorp.gifshow.detail.slideplay.NestedParentRelativeLayout$c;
import d6a.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.detail.slideplay.NestedParentRelativeLayout$a;
import android.animation.Animator$AnimatorListener;
import android.view.MotionEvent;
import java.lang.Math;
import android.view.ViewConfiguration;

public class NestedParentRelativeLayout extends RelativeLayout implements x	// class@00170c
{
    public boolean isUseTransitionToOffset;
    public int mLastMotionY;
    public int mMaxDragSlop;
    public NestedParentRelativeLayout$b mNestedScrollIntercepter;
    public NestedParentRelativeLayout$c mOnDragEventListener;
    public NestedParentRelativeLayout$d mOnTopChangeListener;
    public y parentHelper;

    public void NestedParentRelativeLayout(Context p0){
       super(p0, null, 0);
    }
    public void NestedParentRelativeLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void NestedParentRelativeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.mMaxDragSlop = n.c(this.getContext(), 0x41f00000);
       this.parentHelper = new y(this);
    }
    public static void a(NestedParentRelativeLayout p0,ValueAnimator p1){
       p0.lambda$onStopNestedScroll$0(p1);
    }
    public static boolean isUnderLollipop(){
       return false;
    }
    private void lambda$onStopNestedScroll$0(ValueAnimator p0){
       int i = p0.getAnimatedValue().intValue();
       this.setCurrentOffset(i);
       this.invalidate();
       NestedParentRelativeLayout tmOnTopChang = this.mOnTopChangeListener;
       if (tmOnTopChang != null) {
          tmOnTopChang.a(i);
       }
       return;
    }
    public int getCurrentOffset(){
       Object obj = PatchProxy.apply(null, this, NestedParentRelativeLayout.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.getTop() + (int)this.getTranslationY());
    }
    public int getNestedScrollAxes(){
       Object obj = PatchProxy.apply(null, this, NestedParentRelativeLayout.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.parentHelper.a();
    }
    public final void offset(int p0){
       if (PatchProxy.isSupport(NestedParentRelativeLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, NestedParentRelativeLayout.class, "10")) {
          return;
       }
       if (this.isUseTransitionToOffset != null) {
          this.setTranslationY((this.getTranslationY() + (float)p0));
       }else {
          this.offsetTopAndBottom(p0);
       }
       return;
    }
    public boolean onNestedFling(View p0,float p1,float p2,boolean p3){
       if (PatchProxy.isSupport(NestedParentRelativeLayout.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Boolean.valueOf(p3), this, NestedParentRelativeLayout.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (!NestedParentRelativeLayout.isUnderLollipop() && super.onNestedFling(p0, p1, p2, p3))? true: false;
       NestedParentRelativeLayout tmOnTopChang = this.mOnTopChangeListener;
       if (tmOnTopChang != null) {
          tmOnTopChang.a(this.getCurrentOffset());
       }
       return b;
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       if (PatchProxy.isSupport(NestedParentRelativeLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, NestedParentRelativeLayout.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (!NestedParentRelativeLayout.isUnderLollipop() && super.onNestedPreFling(p0, p1, p2))? true: false;
       NestedParentRelativeLayout tmOnTopChang = this.mOnTopChangeListener;
       if (tmOnTopChang != null) {
          tmOnTopChang.a(this.getCurrentOffset());
       }
       return b;
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3){
       NestedParentRelativeLayout tmNestedScro;
       if (PatchProxy.isSupport(NestedParentRelativeLayout.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, NestedParentRelativeLayout.class, "7")) {
          return;
       }
       if (!this.isEnabled()) {
          return;
       }
       if (!p0.canScrollHorizontally(p1)) {
          p3[0] = p3[0] + p1;
       }
       p1 = 1;
       if (!p0.canScrollVertically(-1) && p2 < 0) {
          tmNestedScro = this.mNestedScrollIntercepter;
          if (tmNestedScro == null || !tmNestedScro.a()) {
             this.offset((- p2));
             p3[p1] = p3[p1] + p2;
          }
       }
       if (p2 > 0) {
          if ((p2 - this.getCurrentOffset()) > 0 && this.getCurrentOffset()) {
             p3[p1] = p3[p1] + this.getCurrentOffset();
             this.offset((- this.getCurrentOffset()));
          }else if((p2 - this.getCurrentOffset()) < 0){
             this.offset((- p2));
             p3[p1] = p3[p1] + p2;
          }
       }
       tmNestedScro = this.mOnTopChangeListener;
       if (tmNestedScro != null) {
          tmNestedScro.a(this.getCurrentOffset());
       }
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(NestedParentRelativeLayout.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, NestedParentRelativeLayout.class, "3")) {
             return;
          }
       }
       if (!NestedParentRelativeLayout.isUnderLollipop()) {
          super.onNestedScroll(p0, p1, p2, p3, p4);
       }
       NestedParentRelativeLayout tmOnTopChang = this.mOnTopChangeListener;
       if (tmOnTopChang != null) {
          tmOnTopChang.a(this.getCurrentOffset());
       }
       return;
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2){
       if (PatchProxy.isSupport(NestedParentRelativeLayout.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, NestedParentRelativeLayout.class, "2")) {
          return;
       }
       this.parentHelper.b(p0, p1, p2);
       NestedParentRelativeLayout tmOnTopChang = this.mOnTopChangeListener;
       if (tmOnTopChang != null) {
          tmOnTopChang.a(this.getCurrentOffset());
       }
       return;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       if (PatchProxy.isSupport(NestedParentRelativeLayout.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, NestedParentRelativeLayout.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       return this.isEnabled();
    }
    public void onStopNestedScroll(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NestedParentRelativeLayout.class, "4")) {
          return;
       }
       if (!this.isEnabled()) {
          return;
       }
       this.parentHelper.d(p0);
       if (this.getCurrentOffset() > this.mMaxDragSlop) {
          NestedParentRelativeLayout tmOnDragEven = this.mOnDragEventListener;
          if (tmOnDragEven != null) {
             tmOnDragEven.a();
          }
       }else if(this.getCurrentOffset() && this.getCurrentOffset() <= this.mMaxDragSlop){
          int[] ointArray = new int[]{this.getCurrentOffset(),0};
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
          valueAnimato.setDuration(150);
          valueAnimato.addUpdateListener(new c(this));
          valueAnimato.addListener(new NestedParentRelativeLayout$a(this));
          valueAnimato.start();
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       NestedParentRelativeLayout tmOnDragEven;
       Object obj = PatchProxy.applyOneRefs(p0, this, NestedParentRelativeLayout.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.isEnabled()) {
          return super.onTouchEvent(p0);
       }
       int i = (int)p0.getRawY();
       int action = p0.getAction();
       if (action) {
          if (action == 2) {
             if (Math.abs((i - this.mLastMotionY)) > ViewConfiguration.getTouchSlop()) {
                tmOnDragEven = this.mOnDragEventListener;
                if (tmOnDragEven != null) {
                   tmOnDragEven.a();
                }
             }else {
                tmOnDragEven = this.mOnTopChangeListener;
                if (tmOnDragEven != null) {
                   tmOnDragEven.a(this.getCurrentOffset());
                }
             }
             this.mLastMotionY = i;
          }
       }else {
          this.mLastMotionY = i;
       }
       return super.onTouchEvent(p0);
    }
    public void setCurrentOffset(int p0){
       if (PatchProxy.isSupport(NestedParentRelativeLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, NestedParentRelativeLayout.class, "11")) {
          return;
       }
       if (this.isUseTransitionToOffset != null) {
          this.setTranslationY((float)p0);
       }else {
          this.setTop(p0);
       }
       return;
    }
    public void setNestedScrollIntercepter(NestedParentRelativeLayout$b p0){
       this.mNestedScrollIntercepter = p0;
    }
    public void setOnDragListener(NestedParentRelativeLayout$c p0){
       this.mOnDragEventListener = p0;
    }
    public void setOnTopChangeListener(NestedParentRelativeLayout$d p0){
       this.mOnTopChangeListener = p0;
    }
    public void setUseTransitionToOffset(boolean p0){
       this.isUseTransitionToOffset = p0;
    }
}
