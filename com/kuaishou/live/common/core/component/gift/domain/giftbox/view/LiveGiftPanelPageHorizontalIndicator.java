package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftPanelPageHorizontalIndicator;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup$LayoutParams;

public class LiveGiftPanelPageHorizontalIndicator extends HorizontalPageIndicator	// class@001226
{
    public int s;
    public int t;

    public void LiveGiftPanelPageHorizontalIndicator(Context p0){
       super(p0, null);
    }
    public void LiveGiftPanelPageHorizontalIndicator(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGiftPanelPageHorizontalIndicator(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.s = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.y2);
       this.t = typedArray.getDimensionPixelOffset(0, 18);
       typedArray.recycle();
    }
    public void setItemCount(int p0){
       if (PatchProxy.isSupport(LiveGiftPanelPageHorizontalIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGiftPanelPageHorizontalIndicator.class, "1")) {
          return;
       }
       super.setItemCount(p0);
       for (p0 = 0; p0 < this.getChildCount(); p0++) {
          View childAt = this.getChildAt(p0);
          childAt.getLayoutParams().width = this.t;
          childAt.requestLayout();
       }
       return;
    }
    public void setPageIndex(int p0){
       View childAt;
       if (PatchProxy.isSupport(LiveGiftPanelPageHorizontalIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGiftPanelPageHorizontalIndicator.class, "2")) {
          return;
       }
       super.setPageIndex(p0);
       if (this.s < this.getChildCount()) {
          LiveGiftPanelPageHorizontalIndicator ts = this.s;
          if (ts >= null) {
             childAt = this.getChildAt(ts);
             childAt.getLayoutParams().width = this.t;
             childAt.requestLayout();
          }
       }
       if (p0 < this.getChildCount() && p0 >= 0) {
          childAt = this.getChildAt(p0);
          childAt.getLayoutParams().width = this.t;
          childAt.requestLayout();
       }
       this.s = p0;
       return;
    }
}
