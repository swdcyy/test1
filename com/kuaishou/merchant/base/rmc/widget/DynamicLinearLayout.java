package com.kuaishou.merchant.base.rmc.widget.DynamicLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingTextView;
import lnc.a1;
import com.kuaishou.merchant.base.rmc.RMCLogBiz;
import p74.a;
import o74.a;
import java.lang.Math;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingRatingBarView;

public class DynamicLinearLayout extends LinearLayout	// class@001586
{

    public void DynamicLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void DynamicLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = p3;
       int i1 = 1;
       int i2 = 0;
       if (PatchProxy.isSupport(DynamicLinearLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, DynamicLinearLayout.class, "1")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       View view = null;
       int i3 = 0;
       int i4 = 0;
       String str = null;
       while (i2 < this.getChildCount()) {
          View childAt = this.getChildAt(i2);
          if (childAt instanceof ShopItemMarketingTextView && view == null) {
             view = childAt;
             str = 1;
          }else {
             float f = 4.00f;
             if (!str) {
                int i5 = childAt.getMeasuredWidth() + a1.e(f);
                i3 = i3 + i5;
             }
             if (str) {
                int i6 = childAt.getMeasuredWidth() + a1.e(f);
                i4 = i4 + i6;
             }
          }
          i2 = i2 + 1;
       }
       RMCLogBiz rMC = RMCLogBiz.RMC;
       a.u(rMC, "DynamicLinearLayout", "onLayout: ", "view before text width: ", Integer.valueOf(i3), ", view after text width: ", Integer.valueOf(i4));
       if (view == null) {
          a.s(rMC, "DynamicLinearLayout", "onLayout: no textview, not adjust text width ");
          return;
       }else if(view.getRight() >= i){
          if (view.getMinimumWidth()) {
             if (view.getMinimumWidth()) {
                i = Math.max(((i - i3) - i4), view.getMinimumWidth());
                a.t(rMC, "DynamicLinearLayout", "onLayout: ", "max text width: ", Integer.valueOf(i));
                LinearLayout$LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = i;
                view.setLayoutParams(layoutParams);
             }
          }else {
             i2 = this.indexOfChild(view) - i1;
             if (i2 >= 0 && (i2 < this.getChildCount() && this.getChildAt(i2) instanceof ShopItemMarketingRatingBarView)) {
                view.setVisibility(8);
                super.onLayout(p0, p1, p2, p3, p4);
             }
          }
       }
       return;
    }
}
