package com.yxcorp.gifshow.widget.PullDownZoomInAppBarHeader;
import android.widget.FrameLayout;
import android.content.Context;
import java.util.ArrayList;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import java.lang.Math;
import android.view.ViewGroup$MarginLayoutParams;

public class PullDownZoomInAppBarHeader extends FrameLayout	// class@0018a5
{
    public final ArrayList b;

    public void PullDownZoomInAppBarHeader(Context p0){
       super(p0);
       this.b = new ArrayList(1);
    }
    public void PullDownZoomInAppBarHeader(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new ArrayList(1);
    }
    public void PullDownZoomInAppBarHeader(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new ArrayList(1);
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, PullDownZoomInAppBarHeader.class, "1")) {
          return;
       }
       super.onFinishInflate();
       return;
    }
    public void onMeasure(int p0,int p1){
       View childAt;
       int i6;
       FrameLayout$LayoutParams this;
       int i7;
       int i10;
       int i11;
       int i12;
       Object obj = this;
       int i = p0;
       int i1 = p1;
       if (PatchProxy.isSupport(PullDownZoomInAppBarHeader.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), obj, PullDownZoomInAppBarHeader.class, "2")) {
          return;
       }
       int childCount = this.getChildCount();
       int i2 = 0x40000000;
       int i3 = (View$MeasureSpec.getMode(p0) != i2 || View$MeasureSpec.getMode(p1) != i2)? 1: 0;
       obj.b.clear();
       ViewGroup$MarginLayoutParams marginLayout = null;
       ViewGroup$MarginLayoutParams marginLayout1 = null;
       int i4 = 0;
       int i5 = 0;
       while (i4 < childCount) {
          childAt = obj.getChildAt(i4);
          if (childAt.getVisibility() != 8) {
             View view = childAt;
             i2 = -1;
             i6 = marginLayout;
             this.measureChildWithMargins(childAt, p0, 0, p1, 0);
             this = view.getLayoutParams();
             i7 = view.getMeasuredWidth() + this.leftMargin;
             i7 = i7 + this.rightMargin;
             marginLayout1 = Math.max(marginLayout1, i7);
             if (view.getId() == 0x7f0a125b) {
                i7 = view.getMeasuredHeight() + this.topMargin;
                i7 = i7 + this.bottomMargin;
                i5 = Math.max(i5, i7);
             }
             marginLayout = FrameLayout.combineMeasuredStates(i6, view.getMeasuredState());
             if (i3 && (this.width == i2 || this.height == i2)) {
                obj.b.add(view);
             }
          }else {
             int i8 = marginLayout1;
          }
          i4 = i4 + 1;
          i2 = 0x40000000;
       }
       i6 = marginLayout;
       obj.setMeasuredDimension(FrameLayout.resolveSizeAndState(Math.max(marginLayout1, this.getSuggestedMinimumWidth()), i, i6), FrameLayout.resolveSizeAndState(Math.max(i5, this.getSuggestedMinimumHeight()), i1, (i6 << 16)));
       int i9 = obj.b.size();
       if (i9 > 1) {
          for (i7 = 0; i7 < i9; i7 = i7 + 1) {
             childAt = obj.b.get(i7);
             ViewGroup$MarginLayoutParams layoutParams = childAt.getLayoutParams();
             marginLayout = layoutParams.width;
             if (marginLayout == -1) {
                i10 = this.getMeasuredWidth() - layoutParams.leftMargin;
                i10 = i10 - layoutParams.rightMargin;
                i10 = View$MeasureSpec.makeMeasureSpec(Math.max(0, i10), 0x40000000);
             }else {
                i11 = layoutParams.leftMargin + layoutParams.rightMargin;
                i10 = FrameLayout.getChildMeasureSpec(i, i11, marginLayout);
             }
             marginLayout1 = layoutParams.height;
             if (marginLayout1 == -1) {
                i11 = this.getMeasuredHeight() - layoutParams.topMargin;
                i11 = i11 - layoutParams.bottomMargin;
                i12 = View$MeasureSpec.makeMeasureSpec(Math.max(0, i11), 0x40000000);
             }else {
                i6 = layoutParams.topMargin + layoutParams.bottomMargin;
                i12 = FrameLayout.getChildMeasureSpec(i1, i6, marginLayout1);
             }
             childAt.measure(i10, i12);
          }
       }
       return;
    }
}
