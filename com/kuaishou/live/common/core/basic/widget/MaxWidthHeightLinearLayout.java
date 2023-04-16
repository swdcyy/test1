package com.kuaishou.live.common.core.basic.widget.MaxWidthHeightLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import java.lang.Math;

public class MaxWidthHeightLinearLayout extends LinearLayout	// class@000f31
{
    public int b;
    public int c;

    public void MaxWidthHeightLinearLayout(Context p0){
       super(p0, null);
    }
    public void MaxWidthHeightLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void MaxWidthHeightLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MaxWidthHeightLinearLayout.class, "1")) {
       }else if(p1 != null){
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.j3);
          this.b = typedArray.getDimensionPixelSize(0, Integer.MAX_VALUE);
          this.c = typedArray.getDimensionPixelSize(1, Integer.MAX_VALUE);
          typedArray.recycle();
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(MaxWidthHeightLinearLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, MaxWidthHeightLinearLayout.class, "2")) {
          return;
       }
       super.onMeasure(View$MeasureSpec.makeMeasureSpec(Math.min(View$MeasureSpec.getSize(p0), this.c), View$MeasureSpec.getMode(p0)), View$MeasureSpec.makeMeasureSpec(Math.min(View$MeasureSpec.getSize(p1), this.b), View$MeasureSpec.getMode(p1)));
       return;
    }
}
