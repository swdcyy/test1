package com.yxcorp.gifshow.panel.sizer.view.MaxHeightFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import com.yxcorp.utility.n;
import java.lang.Math;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import java.lang.Float;

public class MaxHeightFrameLayout extends FrameLayout	// class@000e30
{
    public float b;
    public int c;

    public void MaxHeightFrameLayout(Context p0){
       super(p0);
       this.b = 0x3f400000;
       this.c = 0;
       this.a();
    }
    public void MaxHeightFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 0x3f400000;
       this.c = 0;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MaxHeightFrameLayout.class, "1")) {
       }else {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.h3);
          this.b = typedArray.getFloat(1, this.b);
          this.c = (int)typedArray.getDimension(0, 0);
          typedArray.recycle();
          this.a();
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, MaxHeightFrameLayout.class, "2")) {
          return;
       }
       MaxHeightFrameLayout tc = this.c;
       this.c = (tc <= null)? (int)(this.b * (float)n.u(this.getContext())): (int)Math.min((float)tc, (this.b * (float)n.u(this.getContext())));
       return;
    }
    public int getMaxHeight(){
       return this.c;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(MaxHeightFrameLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, MaxHeightFrameLayout.class, "5")) {
          return;
       }
       int mode = View$MeasureSpec.getMode(p1);
       p1 = View$MeasureSpec.getSize(p1);
       if (mode == 0x40000000) {
          p1 = Math.min(p1, this.c);
       }
       if (!mode) {
          p1 = Math.min(p1, this.c);
       }
       if (mode == Integer.MIN_VALUE) {
          p1 = Math.min(p1, this.c);
       }
       super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec(p1, mode));
       return;
    }
    public void setMaxHeight(int p0){
       if (PatchProxy.isSupport(MaxHeightFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MaxHeightFrameLayout.class, "4")) {
          return;
       }
       this.c = p0;
       this.requestLayout();
       return;
    }
    public void setMaxRatio(float p0){
       if (PatchProxy.isSupport(MaxHeightFrameLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, MaxHeightFrameLayout.class, "3")) {
          return;
       }
       this.b = p0;
       this.requestLayout();
       return;
    }
}
