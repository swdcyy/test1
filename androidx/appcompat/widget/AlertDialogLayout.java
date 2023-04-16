package androidx.appcompat.widget.AlertDialogLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import a2.i0;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.LinearLayoutCompat$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import android.graphics.drawable.Drawable;
import a2.g;

public class AlertDialogLayout extends LinearLayoutCompat	// class@0005df
{

    public void AlertDialogLayout(Context p0){
       super(p0);
    }
    public void AlertDialogLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public static int B(View p0){
       int i = i0.C(p0);
       if (i > 0) {
          return i;
       }
       if (p0 instanceof ViewGroup && p0.getChildCount() == 1) {
          return AlertDialogLayout.B(p0.getChildAt(0));
       }
       return 0;
    }
    private void p(int p0,int p1){
       int i = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0x40000000);
       int i1 = 0;
       while (i1 < p0) {
          View childAt = this.getChildAt(i1);
          if (childAt.getVisibility() != 8) {
             ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
             if (layoutParams.width == -1) {
                ViewGroup$MarginLayoutParams height = layoutParams.height;
                layoutParams.height = childAt.getMeasuredHeight();
                this.measureChildWithMargins(childAt, i, 0, p1, 0);
                layoutParams.height = height;
             }
          }
          i1 = i1 + 1;
       }
       return;
    }
    public final void A(View p0,int p1,int p2,int p3,int p4){
       p0.layout(p1, p2, (p3 + p1), (p4 + p2));
    }
    public final boolean C(int p0,int p1){
       int i5;
       int i6;
       int i7;
       int i8;
       ViewGroup viewGroup = this;
       int i = p0;
       int i1 = p1;
       int childCount = this.getChildCount();
       View view = null;
       boolean b = false;
       View view1 = view;
       View view2 = view1;
       int i2 = 0;
       while (true) {
          int i3 = 8;
          if (i2 < childCount) {
             View childAt = viewGroup.getChildAt(i2);
             if (childAt.getVisibility() != i3) {
                i3 = childAt.getId();
                if (i3 == 0x7f0a3fc2) {
                   view = childAt;
                }else if(i3 == 0x7f0a05a8){
                   view1 = childAt;
                }else if(i3 == 0x7f0a0946 || i3 == 0x7f0a0a33){
                   if (view2 != null) {
                      return b;
                   }else {
                      view2 = childAt;
                   }
                }else {
                   return b;
                }
             }
             i2 = i2 + 1;
          }else {
             i2 = View$MeasureSpec.getMode(p1);
             int size = View$MeasureSpec.getSize(p1);
             int mode = View$MeasureSpec.getMode(p0);
             int i4 = this.getPaddingTop() + this.getPaddingBottom();
             if (view != null) {
                view.measure(i, b);
                i4 = i4 + view.getMeasuredHeight();
                i5 = View.combineMeasuredStates(b, view.getMeasuredState());
             }else {
                i5 = 0;
             }
             if (view1 != null) {
                view1.measure(i, b);
                i6 = AlertDialogLayout.B(view1);
                i7 = view1.getMeasuredHeight() - i6;
                i4 = i4 + i6;
                i5 = View.combineMeasuredStates(i5, view1.getMeasuredState());
             }else {
                i6 = 0;
                i7 = 0;
             }
             if (view2 != null) {
                i8 = (!i2)? 0: View$MeasureSpec.makeMeasureSpec(Math.max(b, (size - i4)), i2);
                view2.measure(i, i8);
                i8 = view2.getMeasuredHeight();
                i4 = i4 + i8;
                i5 = View.combineMeasuredStates(i5, view2.getMeasuredState());
             }else {
                i8 = 0;
             }
             size = size - i4;
             if (view1 != null) {
                i4 = i4 - i6;
                i7 = Math.min(size, i7);
                if (i7 > 0) {
                   size = size - i7;
                   i6 = i6 + i7;
                }
                view1.measure(i, View$MeasureSpec.makeMeasureSpec(i6, 0x40000000));
                i4 = i4 + view1.getMeasuredHeight();
                i5 = View.combineMeasuredStates(i5, view1.getMeasuredState());
             }
             if (view2 != null && size > 0) {
                view2.measure(i, View$MeasureSpec.makeMeasureSpec((i8 + size), i2));
                i4 = (i4 - i8) + view2.getMeasuredHeight();
                i5 = View.combineMeasuredStates(i5, view2.getMeasuredState());
             }
             int i9 = 0;
             int i10 = 0;
             while (i9 < childCount) {
                View childAt1 = viewGroup.getChildAt(i9);
                if (childAt1.getVisibility() != i3) {
                   i10 = Math.max(i10, childAt1.getMeasuredWidth());
                }
                i9 = i9 + 1;
             }
             viewGroup.setMeasuredDimension(View.resolveSizeAndState((i10 + (this.getPaddingLeft() + this.getPaddingRight())), i, i5), View.resolveSizeAndState(i4, i1, 0));
             if (mode != 0x40000000) {
                viewGroup.p(childCount, i1);
             }
          }
       }
       return true;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       ViewGroup$MarginLayoutParams rightMargin;
       ViewGroup viewGroup = this;
       int paddingLeft = this.getPaddingLeft();
       int i = p3 - p1;
       int i1 = i - this.getPaddingRight();
       int i2 = (i - paddingLeft) - this.getPaddingRight();
       i = this.getMeasuredHeight();
       int childCount = this.getChildCount();
       int gravity = this.getGravity();
       int i3 = gravity & 0x70;
       int i4 = gravity & 0x800007;
       if (i3 != 16) {
          i = (i3 != 80)? this.getPaddingTop(): ((this.getPaddingTop() + p4) - p2) - i;
       }else {
          i = this.getPaddingTop() + (((p4 - p2) - i) / 2);
       }
       Drawable dividerDrawa = this.getDividerDrawable();
       int i5 = (dividerDrawa == null)? 0: dividerDrawa.getIntrinsicHeight();
       int i6 = 0;
       while (i6 < childCount) {
          View childAt = viewGroup.getChildAt(i6);
          if (childAt != null && childAt.getVisibility() != 8) {
             int measuredWidt = childAt.getMeasuredWidth();
             int measuredHeig = childAt.getMeasuredHeight();
             ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
             LinearLayoutCompat$LayoutParams b = layoutParams.b;
             if (b < null) {
                b = i4;
             }
             i3 = g.b(b, i0.B(this)) & 0x07;
             if (i3 != 1) {
                if (i3 != 5) {
                   i3 = layoutParams.leftMargin + paddingLeft;
                label_00a2 :
                   if (viewGroup.u(i6)) {
                      i = i + i5;
                   }
                   int i7 = i + layoutParams.topMargin;
                   this.A(childAt, i3, i7, measuredWidt, measuredHeig);
                   measuredHeig = measuredHeig + layoutParams.bottomMargin;
                   i7 = i7 + measuredHeig;
                   i = i7;
                }else {
                   i3 = i1 - measuredWidt;
                   rightMargin = layoutParams.rightMargin;
                }
             }else {
                i3 = i2 - measuredWidt;
                i3 = i3 / 2;
                i3 = i3 + paddingLeft;
                i3 = i3 + layoutParams.leftMargin;
                rightMargin = layoutParams.rightMargin;
             }
             i3 = i3 - rightMargin;
             goto label_00a2 ;
          }
          i6 = i6 + 1;
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (!this.C(p0, p1)) {
          super.onMeasure(p0, p1);
       }
       return;
    }
}
