package com.kuaishou.merchant.live.cart.onsale.widget.TabIconifyTextViewNew;
import com.kwai.library.widget.textview.KwaiIconifyTextViewNew;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import java.lang.Math;

public class TabIconifyTextViewNew extends KwaiIconifyTextViewNew	// class@0019c4
{

    public void TabIconifyTextViewNew(Context p0){
       super(p0, null);
    }
    public void TabIconifyTextViewNew(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void TabIconifyTextViewNew(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(TabIconifyTextViewNew.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TabIconifyTextViewNew.class, "1")) {
          return;
       }
       int measuredHeig = this.getMeasuredHeight();
       if (View$MeasureSpec.getMode(p0) != 0x40000000) {
          this.a();
          p0 = (int)((float)((this.getTextWidth() + this.getPaddingLeft()) + this.getPaddingRight()) + this.M);
          p1 = View$MeasureSpec.getSize(p1);
          if (this.getLayoutParams().width == -2 && this.P != null) {
             float f = this.e();
             this.Q = f;
             this.setMeasuredDimension(((int)f + p0), Math.max(measuredHeig, p1));
          }else {
             this.setMeasuredDimension(p0, Math.max(measuredHeig, p1));
          }
       }
       return;
    }
}
