package com.kds.headertabscrollview.layout.SimpleLinearLayout;
import in.b;
import android.widget.LinearLayout;
import com.kds.headertabscrollview.layout.SimpleLinearLayout$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import in.b$a;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import kotlin.TypeCastException;
import android.view.View$MeasureSpec;

public final class SimpleLinearLayout extends LinearLayout implements b	// class@00072c
{
    public static final SimpleLinearLayout$a b;

    static {
       SimpleLinearLayout.b = new SimpleLinearLayout$a(null);
    }
    public void SimpleLinearLayout(Context p0){
       a.q(p0, "context");
       super(p0);
       this.setLayoutParams(new LinearLayout$LayoutParams(-1, -2));
       this.setOrientation(1);
       this.setGravity(17);
    }
    public void a(){
       b$a.a(this);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       this.getHeight();
       int paddingLeft = this.getPaddingLeft();
       p1 = this.getPaddingTop();
       p2 = this.getChildCount();
       p3 = 0;
       while (true) {
          if (p3 >= p2) {
             return;
          }
          View childAt = this.getChildAt(p3);
          if (childAt != null) {
             ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
             if (layoutParams != null) {
                int i = layoutParams.leftMargin + paddingLeft;
                int i1 = layoutParams.topMargin + p1;
                int i2 = childAt.getMeasuredWidth() + i;
                int i3 = childAt.getMeasuredHeight() + i1;
                childAt.layout(i, i1, i2, i3);
                i = layoutParams.topMargin + childAt.getMeasuredHeight();
                i = i + layoutParams.bottomMargin;
                p1 = p1 + i;
             }else {
                break ;
             }
          }
          p3++;
       }
       throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
    public void onMeasure(int p0,int p1){
       p1 = View$MeasureSpec.getSize(p1);
       if (this.getLayoutParams().height == -2) {
          p1 = this.getChildCount();
          int i = 0;
          int i1 = 0;
          while (true) {
             if (i < p1) {
                View childAt = this.getChildAt(i);
                if (childAt != null) {
                   ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
                   if (layoutParams != null) {
                      int i2 = layoutParams.topMargin + childAt.getMeasuredHeight();
                      i2 = i2 + layoutParams.bottomMargin;
                      i1 = i1 + i2;
                   }else {
                      throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                   }
                }
                i = i + 1;
             }else {
                p1 = this.getPaddingBottom() + (i1 + this.getPaddingTop());
                break ;
             }
          }
       }
       this.setMeasuredDimension(View$MeasureSpec.getSize(p0), p1);
       return;
    }
}
