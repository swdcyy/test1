package com.kuaishou.live.core.voiceparty.customview.LiveFixRatioPlaceHolderView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View$MeasureSpec;
import java.lang.Float;

public class LiveFixRatioPlaceHolderView extends View	// class@0014a6
{
    public float b;

    public void LiveFixRatioPlaceHolderView(Context p0){
       super(p0, null);
    }
    public void LiveFixRatioPlaceHolderView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveFixRatioPlaceHolderView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0x3f800000;
       this.setWillNotDraw(true);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.x2);
       this.b = typedArray.getFloat(0, 0x3f800000);
       typedArray.recycle();
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveFixRatioPlaceHolderView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveFixRatioPlaceHolderView.class, "2")) {
          return;
       }
       p0 = View.getDefaultSize(this.getSuggestedMinimumWidth(), p0);
       this.setMeasuredDimension(View$MeasureSpec.makeMeasureSpec(p0, 0x40000000), View$MeasureSpec.makeMeasureSpec((int)(((float)p0 * this.b) + 0x3f000000), 0x40000000));
       return;
    }
    public void setRatio(float p0){
       if (PatchProxy.isSupport(LiveFixRatioPlaceHolderView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveFixRatioPlaceHolderView.class, "1")) {
          return;
       }
       this.b = p0;
       this.requestLayout();
       return;
    }
}
