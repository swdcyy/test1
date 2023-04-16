package com.google.android.material.bottomsheet.BottomSheetBehavior$b;
import androidx.customview.widget.ViewDragHelper$c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.View;
import u1.a;
import java.lang.Math;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.bottomsheet.BottomSheetBehavior$d;
import java.lang.Runnable;
import a2.i0;
import java.lang.Object;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior$b extends ViewDragHelper$c	// class@001654
{
    public final BottomSheetBehavior a;

    public void BottomSheetBehavior$b(BottomSheetBehavior p0){
       this.a = p0;
       super();
    }
    public int a(View p0,int p1,int p2){
       return p0.getLeft();
    }
    public int b(View p0,int p1,int p2){
       int expandedOffs = this.a.getExpandedOffset();
       BottomSheetBehavior$b ta = this.a;
       BottomSheetBehavior parentHeight = (ta.hideable != null)? ta.parentHeight: ta.collapsedOffset;
       return a.b(p1, expandedOffs, parentHeight);
    }
    public int e(View p0){
       BottomSheetBehavior$b ta = this.a;
       if (ta.hideable != null) {
          return ta.parentHeight;
       }
       return ta.collapsedOffset;
    }
    public void j(int p0){
       if (p0 == 1) {
          this.a.setStateInternal(1);
       }
       return;
    }
    public void k(View p0,int p1,int p2,int p3,int p4){
       this.a.dispatchOnSlide(p2);
    }
    public void l(View p0,float p1,float p2){
       BottomSheetBehavior fitToContent;
       int i = 0;
       int i1 = 0;
       int i2 = 4;
       if (p2 - i1 < 0) {
          BottomSheetBehavior$b ta = this.a;
          if (ta.fitToContents != null) {
             fitToContent = ta.fitToContentsOffset;
             i2 = 3;
          label_00bc :
             if (this.a.viewDragHelper.settleCapturedViewAt(p0.getLeft(), fitToContent)) {
                this.a.setStateInternal(2);
                i0.k0(p0, new BottomSheetBehavior$d(this.a, p0, i2));
             }else {
                this.a.setStateInternal(i2);
             }
             return;
          }else {
             BottomSheetBehavior halfExpanded = this.a.halfExpandedOffset;
             if (p0.getTop() > halfExpanded) {
                i = halfExpanded;
             label_001f :
                i2 = 6;
             }else {
             label_0021 :
                i2 = 3;
             }
          }
       }else {
          BottomSheetBehavior$b ta1 = this.a;
          if (ta1.hideable != null && (ta1.shouldHide(p0, p2) && (p0.getTop() > this.a.collapsedOffset || Math.abs(p1) - Math.abs(p2) < 0))) {
             fitToContent = this.a.parentHeight;
             i2 = 5;
             goto label_00bc ;
          }else if(!p2 - i1 || Math.abs(p1) - Math.abs(p2) > 0){
             int top = p0.getTop();
             BottomSheetBehavior$b ta2 = this.a;
             if (ta2.fitToContents != null) {
                if (Math.abs((top - ta2.fitToContentsOffset)) < Math.abs((top - this.a.collapsedOffset))) {
                   i = this.a.fitToContentsOffset;
                   goto label_0021 ;
                }else {
                   i = this.a.collapsedOffset;
                }
             }else {
                BottomSheetBehavior halfExpanded1 = ta2.halfExpandedOffset;
                if (top < halfExpanded1) {
                   if (top < Math.abs((top - ta2.collapsedOffset))) {
                      goto label_0021 ;
                   }else {
                      i = this.a.halfExpandedOffset;
                      goto label_001f ;
                   }
                }else if(Math.abs((top - halfExpanded1)) < Math.abs((top - this.a.collapsedOffset))){
                   i = this.a.halfExpandedOffset;
                   goto label_001f ;
                }else {
                   i = this.a.collapsedOffset;
                }
             }
          }else {
             fitToContent = this.a.collapsedOffset;
             goto label_00bc ;
          }
       }
       fitToContent = i;
       goto label_00bc ;
    }
    public boolean m(View p0,int p1){
       BottomSheetBehavior$b ta = this.a;
       BottomSheetBehavior state = ta.state;
       boolean b = true;
       if (state == b) {
          return false;
       }
       if (ta.touchingScrollingChild != null) {
          return false;
       }
       if (state == 3 && ta.activePointerId == p1) {
          View view = ta.nestedScrollingChildRef.get();
          if (view != null && view.canScrollVertically(-1)) {
             return false;
          }
       }
       BottomSheetBehavior viewRef = this.a.viewRef;
       if (viewRef == null || viewRef.get() != p0) {
          b = false;
       }
       return b;
    }
}
