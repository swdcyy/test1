package com.kwai.library.widget.scrollview.HorizontalSlideView;
import android.widget.HorizontalScrollView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import com.kwai.library.widget.scrollview.HorizontalSlideView$a;
import android.view.MotionEvent;
import java.lang.Math;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Exception;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import com.kwai.library.widget.scrollview.HorizontalSlideView$b;

public class HorizontalSlideView extends HorizontalScrollView	// class@0009e7
{
    public HorizontalSlideView$b b;
    public boolean c;
    public float d;
    public HorizontalSlideView$a e;
    public float f;
    public float g;
    public int h;

    public void HorizontalSlideView(Context p0){
       super(p0);
       this.d = 0x3f000000;
       this.f = 0xcf000000;
       this.g = 0xcf000000;
       this.a();
    }
    public void HorizontalSlideView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = 0x3f000000;
       this.f = 0xcf000000;
       this.g = 0xcf000000;
       this.a();
    }
    public void HorizontalSlideView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = 0x3f000000;
       this.f = 0xcf000000;
       this.g = 0xcf000000;
       this.a();
    }
    public final void a(){
       this.h = ViewConfiguration.get(this.getContext()).getScaledTouchSlop();
    }
    public boolean b(){
       return this.c;
    }
    public void c(boolean p0){
       this.c = false;
       HorizontalSlideView te = this.e;
       if (te != null) {
          te.a(this);
       }
       if (p0) {
          this.smoothScrollTo(false, this.getScrollY());
       }else {
          this.scrollTo(false, this.getScrollY());
       }
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       int action = p0.getAction();
       float f = 0xcf000000;
       if (action) {
          if (action != 1) {
             if (action != 2) {
                if (action == 3) {
                }
             }else {
                p0.getX();
                p0.getY();
                if (p0.getX() - this.f) {
                   this.g = p0.getX();
                }
             }
          }else {
          }
       }else {
          this.f = p0.getX();
       }
    label_004e :
       HorizontalSlideView tg = this.g;
       if (tg - f && ((this.f - tg) - (float)this.h > 0 && this.getParent() != null)) {
          this.getParent().requestDisallowInterceptTouchEvent(true);
       }
    label_006b :
       return super.dispatchTouchEvent(p0);
    }
    public ViewGroup getContainerView(){
       ViewGroup viewGroup = null;
       if (!this.getChildCount()) {
          return viewGroup;
       }
       View childAt = this.getChildAt(0);
       if (childAt instanceof ViewGroup) {
          viewGroup = childAt;
       }
       return viewGroup;
    }
    public View getFirstView(){
       ViewGroup containerVie = this.getContainerView();
       View view = (containerVie == null || containerVie.getChildCount() < 1)? null: containerVie.getChildAt(0);
       return view;
    }
    public View getSecondView(){
       ViewGroup containerVie = this.getContainerView();
       View view = (containerVie == null || containerVie.getChildCount() < 2)? null: containerVie.getChildAt(1);
       return view;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       if (this.c != null) {
          boolean b = true;
          this.requestDisallowInterceptTouchEvent(b);
          if (!p0.getActionMasked()) {
             View secondView = this.getSecondView();
             if (secondView != null && p0.getX() - (float)(this.getWidth() - secondView.getWidth()) < 0) {
                return b;
             }
          }
       }
       HorizontalSlideView tg = this.g;
       if (tg - 0xcf000000 && (tg - this.f) - (float)this.h > 0) {
          return false;
       }else {
          try{
             return super.onInterceptTouchEvent(p0);
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
             return v2;
          }
       }
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       if (!View$MeasureSpec.getMode(p0)) {
          return;
       }
       View firstView = this.getFirstView();
       ViewGroup containerVie = this.getContainerView();
       if (firstView != null && containerVie != null) {
          ViewGroup$LayoutParams layoutParams = firstView.getLayoutParams();
          if (layoutParams == null) {
             return;
          }else {
             int i = (((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()) - containerVie.getPaddingLeft()) - containerVie.getPaddingRight();
             if (layoutParams.width != i) {
                layoutParams.width = i;
                super.onMeasure(p0, p1);
             }
          }
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b = super.onTouchEvent(p0);
       int i = p0.getAction() & 0x00ff;
       boolean b1 = true;
       if (i == b1 || i == 3) {
          View secondView = this.getSecondView();
          if (secondView != null) {
             if (this.c != null) {
                this.c(b1);
                this.requestDisallowInterceptTouchEvent(false);
             }else {
                int scrollX = this.getScrollX();
                if ((float)scrollX - ((float)secondView.getWidth() * this.d) >= 0) {
                   this.c = b1;
                   this.smoothScrollTo(secondView.getLeft(), this.getScrollY());
                   HorizontalSlideView tb = this.b;
                   if (tb != null) {
                      tb.u(this);
                   }
                }else if(scrollX > 0){
                   this.c(b1);
                }
             }
          }
       }
       return b;
    }
    public void setOffsetDelta(float p0){
       this.d = p0;
    }
    public void setOnResetListener(HorizontalSlideView$a p0){
       this.e = p0;
    }
    public void setOnSlideListener(HorizontalSlideView$b p0){
       this.b = p0;
    }
}
