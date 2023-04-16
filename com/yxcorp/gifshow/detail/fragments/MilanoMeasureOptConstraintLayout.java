package com.yxcorp.gifshow.detail.fragments.MilanoMeasureOptConstraintLayout;
import com.kwai.library.slide.base.widget.SlidePlayConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.yxcorp.utility.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup;
import android.view.View;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.view.ViewParent;
import android.view.View$MeasureSpec;

public final class MilanoMeasureOptConstraintLayout extends SlidePlayConstraintLayout	// class@001504
{
    public boolean C;

    public void MilanoMeasureOptConstraintLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0, 4, null);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 0;
       if (PatchProxy.isSupport(MilanoMeasureOptConstraintLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, MilanoMeasureOptConstraintLayout.class, "2")) {
             return;
          }
       }
       if (this.C != null) {
          Log.d("SlidePlayConsLayout", "没有Measure就Layout了，布局可能出错！");
       }
       super.onLayout(p0, p1, p2, p3, p4);
       int childCount = this.getChildCount();
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          a.o(childAt, "getChildAt\(index\)");
          if (a.g(childAt.getTag(0x7f0a2b6b), Boolean.TRUE)) {
             childAt.requestLayout();
             StringBuilder str = "存在requestLayout丢失问题，补充requestLayout。View："+childAt.getClass().getSimpleName()+' ';
             String str1 = (childAt.getId() == -1)? "NO_ID": this.getResources().getResourceEntryName(childAt.getId());
             Log.d("SlidePlayConsLayout", str+str1);
          }
          i = i + 1;
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(MilanoMeasureOptConstraintLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, MilanoMeasureOptConstraintLayout.class, "1")) {
          return;
       }
       if (this.getParent() instanceof ConstraintLayout && View$MeasureSpec.getMode(p1) == Integer.MIN_VALUE) {
          this.L("跳过measure "+"w:"+View$MeasureSpec.toString(p0)+" h:"+View$MeasureSpec.toString(p1));
          this.setMeasuredDimension(this.getMeasuredWidth(), this.getMeasuredHeight());
          this.C = true;
          return;
       }else {
          int childCount = this.getChildCount();
          boolean i = 0;
          String str = "getChildAt\(index\)";
          while (i < childCount) {
             View childAt = this.getChildAt(i);
             a.o(childAt, str);
             childAt.setTag(R.id.milano_constraint_opt_request_layout_flag, Boolean.valueOf(childAt.isLayoutRequested()));
             i = i + 1;
          }
          super.onMeasure(p0, p1);
          this.C = false;
          p0 = this.getChildCount();
          for (p1 = 0; p1 < p0; p1++) {
             View childAt1 = this.getChildAt(p1);
             a.o(childAt1, str);
             Boolean tag = childAt1.getTag(R.id.milano_constraint_opt_request_layout_flag);
             if (childAt1.isLayoutRequested()) {
                i = a.g(tag, Boolean.TRUE) ^ true;
                if (i) {
                   i = true;
                label_00b0 :
                   childAt1.setTag(R.id.milano_constraint_opt_request_layout_flag, Boolean.valueOf(i));
                }
             }
             i = false;
             goto label_00b0 ;
          }
          return;
       }
    }
}
