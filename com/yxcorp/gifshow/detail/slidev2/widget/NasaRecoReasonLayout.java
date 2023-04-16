package com.yxcorp.gifshow.detail.slidev2.widget.NasaRecoReasonLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.animation.ValueAnimator;
import java.lang.Float;

public class NasaRecoReasonLayout extends LinearLayout	// class@001a03
{
    public View b;
    public float c;
    public ValueAnimator d;

    public void NasaRecoReasonLayout(Context p0){
       super(p0);
       this.c = 0x3f800000;
       this.setOrientation(0);
    }
    public void NasaRecoReasonLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = 0x3f800000;
       this.setOrientation(0);
    }
    public void NasaRecoReasonLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = 0x3f800000;
       this.setOrientation(0);
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, NasaRecoReasonLayout.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.b = this.getChildAt(1);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(NasaRecoReasonLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, NasaRecoReasonLayout.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       p0 = this.getPaddingLeft();
       p1 = 0;
       int i = 0;
       while (i < this.getChildCount()) {
          View childAt = this.getChildAt(i);
          if (childAt.getVisibility() != 8) {
             p0 = p0 + childAt.getMeasuredWidth();
             LinearLayout$LayoutParams layoutParams = childAt.getLayoutParams();
             int i1 = layoutParams.leftMargin + layoutParams.rightMargin;
             p0 = p0 + i1;
          }
          i = i + 1;
       }
       NasaRecoReasonLayout tb = this.b;
       tb.scrollTo((int)((float)tb.getMeasuredWidth() * (0x3f800000 - this.c)), p1);
       this.b.setAlpha(this.c);
       this.setMeasuredDimension((int)((float)(p0 + this.getPaddingRight()) - ((float)this.b.getMeasuredWidth() * (0x3f800000 - this.c))), this.getMeasuredHeight());
       return;
    }
    public void onVisibilityChanged(View p0,int p1){
       if (PatchProxy.isSupport(NasaRecoReasonLayout.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, NasaRecoReasonLayout.class, "5")) {
          return;
       }
       super.onVisibilityChanged(p0, p1);
       if (p1 == 8 && !PatchProxy.applyVoid(null, this, NasaRecoReasonLayout.class, "6")) {
          NasaRecoReasonLayout td = this.d;
          if (td != null && td.isRunning()) {
             this.d.cancel();
          }
       }
       return;
    }
    public void setMoreViewShowProgress(float p0){
       if (PatchProxy.isSupport(NasaRecoReasonLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, NasaRecoReasonLayout.class, "3")) {
          return;
       }
       this.c = p0;
       this.requestLayout();
       return;
    }
}
