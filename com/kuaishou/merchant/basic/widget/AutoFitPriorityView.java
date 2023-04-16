package com.kuaishou.merchant.basic.widget.AutoFitPriorityView;
import com.kuaishou.merchant.basic.widget.AutoFitTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import com.kuaishou.merchant.basic.widget.AutoFitRowsView;
import java.lang.Math;
import android.util.SparseIntArray;
import java.util.HashMap;
import android.view.View;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.merchant.basic.widget.AutoFitRowsView$b;

public class AutoFitPriorityView extends AutoFitTextView	// class@0015eb
{

    public void AutoFitPriorityView(Context p0){
       super(p0);
    }
    public void AutoFitPriorityView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void AutoFitPriorityView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onMeasure(int p0,int p1){
       Iterator iterator;
       if (PatchProxy.isSupport(AutoFitPriorityView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AutoFitPriorityView.class, "1")) {
          return;
       }
       this.measureChildren(p0, p1);
       int mode = View$MeasureSpec.getMode(p1);
       p1 = View$MeasureSpec.getSize(p1);
       p0 = Math.min(((View$MeasureSpec.getSize(p0) - this.getPaddingStart()) - this.getPaddingEnd()), this.k);
       int i = this.getPaddingTop() + this.getPaddingBottom();
       this.i.clear();
       this.j.clear();
       AutoFitRowsView uAutoFitRows = null;
       int i1 = 0;
       int i2 = 0;
       AutoFitPriorityView uAutoFitPrio = null;
       int i3 = 0;
       while (true) {
          if (i1 < this.getChildCount()) {
             View childAt = this.getChildAt(i1);
             int i4 = 8;
             if (childAt.getVisibility() != i4) {
                this.setChildPadding(childAt);
                int i5 = this.b(childAt);
                i2 = i2 + this.c(childAt);
                if (i2 > p0) {
                   i3 = i3 + 1;
                   if (childAt.getTag() instanceof String && TextUtils.n("MERCHANT_AUTO_FIT_NOT_HIDE_VIEW", childAt.getTag())) {
                      if (!PatchProxy.isSupport(AutoFitPriorityView.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), this, AutoFitPriorityView.class, "2") && i1 < this.getChildCount())) {
                         while (uAutoFitRows < this.getChildCount()) {
                            View childAt1 = this.getChildAt(uAutoFitRows);
                            if (uAutoFitRows != i1) {
                               childAt1.setVisibility(i4);
                            }
                            uAutoFitRows = uAutoFitRows + 1;
                         }
                      }
                      if (!q.f(this.m)) {
                         iterator = this.m.iterator();
                         while (iterator.hasNext()) {
                            iterator.next().b(i1, childAt);
                         }
                      }
                      i = i + i5;
                   label_0128 :
                      uAutoFitRows = this.i;
                      i = i + uAutoFitRows.get((uAutoFitRows.size() - 1));
                      if (mode != 0x40000000) {
                         p1 = i;
                         break ;
                      }
                      break ;
                   }else if(i3 >= this.d){
                      if (!q.f(this.m)) {
                         iterator = this.m.iterator();
                         while (iterator.hasNext()) {
                            iterator.next().b(i1, childAt);
                         }
                      }
                      this.d(i1);
                      goto label_0128 ;
                   }else {
                      i = i + uAutoFitPrio;
                      i = i + this.c;
                      uAutoFitPrio = i5;
                      i2 = 0;
                   }
                }else {
                   uAutoFitPrio = Math.max(uAutoFitPrio, i5);
                   if (uAutoFitPrio > i5) {
                      childAt = null;
                   }
                   i2 = i2 + this.b;
                }
                if (childAt != null) {
                   this.j.put(Integer.valueOf(i3), childAt);
                }
                this.i.put(i3, uAutoFitPrio);
             }
             i1 = i1 + 1;
          }else {
             goto label_0128 ;
          }
       }
       this.setMeasuredDimension(p0, p1);
       return;
    }
}
