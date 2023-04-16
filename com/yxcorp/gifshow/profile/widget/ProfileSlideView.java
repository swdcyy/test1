package com.yxcorp.gifshow.profile.widget.ProfileSlideView;
import android.widget.HorizontalScrollView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.profile.widget.ProfileSlideView$a;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.view.MotionEvent;
import com.yxcorp.gifshow.profile.widget.ProfileSlideView$b;

public class ProfileSlideView extends HorizontalScrollView	// class@001600
{
    public boolean b;
    public float c;
    public ProfileSlideView$a d;
    public ProfileSlideView$b e;

    public void ProfileSlideView(Context p0){
       super(p0);
       this.c = 0x3f000000;
    }
    public void ProfileSlideView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = 0x3f000000;
    }
    public void ProfileSlideView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = 0x3f000000;
    }
    public void a(boolean p0){
       if (PatchProxy.isSupport(ProfileSlideView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ProfileSlideView.class, "1")) {
          return;
       }
       this.b = false;
       ProfileSlideView td = this.d;
       if (td != null) {
          td.a(this);
       }
       if (p0) {
          this.smoothScrollTo(false, this.getScrollY());
       }else {
          this.scrollTo(false, this.getScrollY());
       }
       return;
    }
    public ViewGroup getContainerView(){
       Object[] objArray = null;
       View obj = PatchProxy.apply(objArray, this, ProfileSlideView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.getChildCount()) {
          return objArray;
       }
       obj = this.getChildAt(0);
       if (obj instanceof ViewGroup) {
          objArray = obj;
       }
       return objArray;
    }
    public View getFirstView(){
       Object[] objArray = null;
       ViewGroup obj = PatchProxy.apply(objArray, this, ProfileSlideView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getContainerView();
       if (obj != null && obj.getChildCount() >= 1) {
          objArray = obj.getChildAt(0);
       }
       return objArray;
    }
    public View getSecondView(){
       Object[] objArray = null;
       ViewGroup obj = PatchProxy.apply(objArray, this, ProfileSlideView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getContainerView();
       if (obj != null && obj.getChildCount() >= 2) {
          objArray = obj.getChildAt(1);
       }
       return objArray;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ProfileSlideView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ProfileSlideView.class, "9")) {
          return;
       }
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
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileSlideView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = super.onTouchEvent(p0);
       int i = p0.getAction() & 0x00ff;
       boolean b1 = true;
       if (i != b1 && (i == 3 && !PatchProxy.applyVoid(null, this, ProfileSlideView.class, "3"))) {
          View secondView = this.getSecondView();
          if (secondView != null) {
             if (this.b != null) {
                this.a(b1);
             }else {
                int scrollX = this.getScrollX();
                if ((float)scrollX - ((float)secondView.getWidth() * this.c) >= 0) {
                   if (!PatchProxy.applyVoidOneRefs(secondView, this, ProfileSlideView.class, "5")) {
                      this.b = b1;
                      this.smoothScrollTo(secondView.getLeft(), this.getScrollY());
                      ProfileSlideView te = this.e;
                      if (te != null) {
                         te.a(this);
                      }
                   }
                }else if(scrollX > 0){
                   this.a(b1);
                }
             }
          }
       }
       return b;
    }
    public void setOnResetListener(ProfileSlideView$a p0){
       this.d = p0;
    }
    public void setOnSlideListener(ProfileSlideView$b p0){
       this.e = p0;
    }
}
