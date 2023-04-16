package com.kuaishou.live.core.voiceparty.playway.shared.widget.FixedRatioConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kuaishou.live.core.voiceparty.playway.shared.util.ToIntType;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import yu2.b;
import java.lang.Float;

public class FixedRatioConstraintLayout extends ConstraintLayout	// class@001893
{
    public float B;
    public ToIntType C;
    public int D;

    public void FixedRatioConstraintLayout(Context p0){
       super(p0, null);
    }
    public void FixedRatioConstraintLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void FixedRatioConstraintLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p1, this, FixedRatioConstraintLayout.class, "1")) {
       }else {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p1, c$b.H0);
          this.B = typedArray.getFloat(0, 0);
          this.C = ToIntType.values()[typedArray.getInt(1, 1)];
          this.D = typedArray.getInt(2, 1);
          typedArray.recycle();
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(FixedRatioConstraintLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FixedRatioConstraintLayout.class, "4")) {
          return;
       }
       if (this.B) {
          int mode = View$MeasureSpec.getMode(p0);
          int size = View$MeasureSpec.getSize(p0);
          int mode1 = View$MeasureSpec.getMode(p1);
          int size1 = View$MeasureSpec.getSize(p1);
          if (mode == 0x40000000 || mode == Integer.MIN_VALUE) {
             mode = b.a(((float)size / this.B), this.C);
             FixedRatioConstraintLayout tD = this.D;
             if (tD != null && (tD != 1 || (mode <= size1 || (tD == 2 && mode >= size1)))) {
                super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec(mode, 0x40000000));
                return;
             }
          }
          if (mode1 == 0x40000000) {
             mode = b.a(((float)size1 * this.B), this.C);
             FixedRatioConstraintLayout tD1 = this.D;
             if (tD1 != null && (tD1 != 1 || (mode <= size || (tD1 == 2 && mode >= size)))) {
                super.onMeasure(View$MeasureSpec.makeMeasureSpec(mode, 0x40000000), p1);
                return;
             }
          }
       }
    label_007c :
       super.onMeasure(p0, p1);
       return;
    }
    public void setAspectRatio(float p0){
       if (PatchProxy.isSupport(FixedRatioConstraintLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, FixedRatioConstraintLayout.class, "2")) {
          return;
       }
       if (this.B - p0) {
          this.B = p0;
          this.requestLayout();
          this.invalidate();
       }
       return;
    }
    public void setScaleType(int p0){
       if (PatchProxy.isSupport(FixedRatioConstraintLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FixedRatioConstraintLayout.class, "3")) {
          return;
       }
       this.D = p0;
       this.requestLayout();
       this.invalidate();
       return;
    }
}
