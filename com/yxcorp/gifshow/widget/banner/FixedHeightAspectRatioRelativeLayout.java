package com.yxcorp.gifshow.widget.banner.FixedHeightAspectRatioRelativeLayout;
import android.widget.RelativeLayout;
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
import java.lang.Float;

public class FixedHeightAspectRatioRelativeLayout extends RelativeLayout	// class@001938
{
    public float b;

    public void FixedHeightAspectRatioRelativeLayout(Context p0){
       super(p0);
    }
    public void FixedHeightAspectRatioRelativeLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a(p1);
    }
    public void FixedHeightAspectRatioRelativeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a(p1);
    }
    public final void a(AttributeSet p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FixedHeightAspectRatioRelativeLayout.class, "1")) {
          return;
       }
       TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.G0);
       this.b = typedArray.getFloat(0, 0x3f800000);
       typedArray.recycle();
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(FixedHeightAspectRatioRelativeLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FixedHeightAspectRatioRelativeLayout.class, "3")) {
          return;
       }
       super.onMeasure(p0, p1);
       View$MeasureSpec.getSize(p1);
       super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec((int)((float)View$MeasureSpec.getSize(p0) / this.b), 0x40000000));
       return;
    }
    public void setAspectRadio(float p0){
       if (PatchProxy.isSupport(FixedHeightAspectRatioRelativeLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, FixedHeightAspectRatioRelativeLayout.class, "2")) {
          return;
       }
       this.b = p0;
       this.invalidate();
       return;
    }
}
