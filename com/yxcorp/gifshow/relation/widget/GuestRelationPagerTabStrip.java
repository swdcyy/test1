package com.yxcorp.gifshow.relation.widget.GuestRelationPagerTabStrip;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.CharSequence;
import android.widget.LinearLayout$LayoutParams;

public class GuestRelationPagerTabStrip extends PagerSlidingTabStrip	// class@001a5f
{
    public LinearLayout$LayoutParams w1;

    public void GuestRelationPagerTabStrip(Context p0){
       super(p0);
    }
    public void GuestRelationPagerTabStrip(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void GuestRelationPagerTabStrip(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public ViewGroup$LayoutParams k(){
       GuestRelationPagerTabStrip obj = PatchProxy.apply(null, this, GuestRelationPagerTabStrip.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.w1;
       if (obj != null) {
          return obj;
       }
       return super.k();
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(GuestRelationPagerTabStrip.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, GuestRelationPagerTabStrip.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (this.getTabsContainer() != null && this.getTabsContainer().getChildCount() >= 0) {
          p0 = 0;
          p1 = 0;
          GuestRelationPagerTabStrip guestRelatio = null;
          while (p1 < this.getTabsContainer().getChildCount()) {
             View childAt = this.getTabsContainer().getChildAt(p1);
             int measuredWidt = childAt.getMeasuredWidth();
             if (!guestRelatio && childAt instanceof TextView) {
                int i = this.getTabPadding() * 2;
                measuredWidt = measuredWidt - i;
                if (childAt.getPaint().measureText(childAt.getText().toString()) - (float)measuredWidt > 0) {
                   guestRelatio = 1;
                }
             }
             p1++;
          }
          if (guestRelatio) {
             if (this.w1 == null) {
                LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -1, 0x3f800000);
                this.w1 = layoutParams;
                this.setTabLayoutParams(layoutParams);
             }
             while (p0 < this.getTabsContainer().getChildCount()) {
                this.getTabsContainer().getChildAt(p0).setLayoutParams(this.w1);
                p0++;
             }
          }
       }
       return;
    }
}
