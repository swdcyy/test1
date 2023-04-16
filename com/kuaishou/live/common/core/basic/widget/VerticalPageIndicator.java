package com.kuaishou.live.common.core.basic.widget.VerticalPageIndicator;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.LinearLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;

public class VerticalPageIndicator extends LinearLayout	// class@000f35
{
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public float h;

    public void VerticalPageIndicator(Context p0){
       super(p0, null, 0);
    }
    public void VerticalPageIndicator(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VerticalPageIndicator(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = 0;
       this.h = 0x3f800000;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.V5);
       this.b = typedArray.getDimensionPixelOffset(2, 18);
       this.c = typedArray.getDimensionPixelOffset(3, 18);
       this.e = typedArray.getDimensionPixelOffset(1, 18);
       this.f = typedArray.getResourceId(0, 0);
       this.setGravity(17);
       this.setOrientation(1);
       typedArray.recycle();
    }
    public void setItemCount(int p0){
       if (PatchProxy.isSupport(VerticalPageIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VerticalPageIndicator.class, "1")) {
          return;
       }
       if (!p0) {
          return;
       }
       int i = 0;
       this.g = i;
       this.removeAllViews();
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(this.c, this.b);
       layoutParams.setMargins(i, this.e, i, i);
       for (int i1 = 0; i1 < p0; i1 = i1 + 1) {
          View view = new View(this.getContext());
          view.setBackgroundResource(this.f);
          this.addView(view, layoutParams);
       }
       View childAt = this.getChildAt(i);
       childAt.setScaleX(this.h);
       childAt.setScaleY(this.h);
       childAt.setSelected(true);
       return;
    }
    public void setPageIndex(int p0){
       if (PatchProxy.isSupport(VerticalPageIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VerticalPageIndicator.class, "2")) {
          return;
       }
       if (p0 >= this.getChildCount()) {
          return;
       }
       if (p0 != this.g) {
          View childAt = this.getChildAt(p0);
          childAt.setScaleX(this.h);
          childAt.setScaleY(this.h);
          childAt.setSelected(true);
          childAt = this.getChildAt(this.g);
          childAt.setScaleX(0x3f800000);
          childAt.setScaleY(0x3f800000);
          childAt.setSelected(false);
          this.g = p0;
       }
       return;
    }
}
