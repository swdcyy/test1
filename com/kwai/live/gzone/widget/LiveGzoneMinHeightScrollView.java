package com.kwai.live.gzone.widget.LiveGzoneMinHeightScrollView;
import android.widget.ScrollView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import android.view.View$MeasureSpec;
import android.content.pm.ApplicationInfo;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import java.lang.Math;

public class LiveGzoneMinHeightScrollView extends ScrollView	// class@000e7c
{
    public int b;

    public void LiveGzoneMinHeightScrollView(Context p0){
       super(p0, null);
    }
    public void LiveGzoneMinHeightScrollView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGzoneMinHeightScrollView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onMeasure(int p0,int p1){
       int i;
       FrameLayout$LayoutParams bottomMargin;
       if (PatchProxy.isSupport(LiveGzoneMinHeightScrollView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveGzoneMinHeightScrollView.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       View childAt = this.getChildAt(0);
       if (childAt != null) {
          if (!View$MeasureSpec.getMode(p1)) {
             return;
          }else {
             FrameLayout$LayoutParams layoutParams = childAt.getLayoutParams();
             if (this.getContext().getApplicationInfo().targetSdkVersion >= 23) {
                p1 = ((this.getPaddingLeft() + this.getPaddingRight()) + layoutParams.leftMargin) + layoutParams.rightMargin;
                i = (this.getPaddingTop() + this.getPaddingBottom()) + layoutParams.topMargin;
                bottomMargin = layoutParams.bottomMargin;
             }else {
                p1 = this.getPaddingLeft() + this.getPaddingRight();
                i = this.getPaddingTop();
                bottomMargin = this.getPaddingBottom();
             }
             this.b = Math.max((this.getMeasuredHeight() - (i + bottomMargin)), childAt.getMinimumHeight());
             if (childAt.getMeasuredHeight() < this.b) {
                childAt.measure(ScrollView.getChildMeasureSpec(p0, p1, layoutParams.width), View$MeasureSpec.makeMeasureSpec(this.b, 0x40000000));
             }
          }
       }
       return;
    }
}
