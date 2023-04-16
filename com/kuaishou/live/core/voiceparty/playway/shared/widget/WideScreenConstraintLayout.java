package com.kuaishou.live.core.voiceparty.playway.shared.widget.WideScreenConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import java.lang.Float;

public final class WideScreenConstraintLayout extends ConstraintLayout	// class@0018a2
{
    public float B;
    public HashMap C;

    public void WideScreenConstraintLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void WideScreenConstraintLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void WideScreenConstraintLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.B = 0x3f100000;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.l6);
       a.o(typedArray, "context.obtainStyledAttr¡­ideRatioConstraintLayout\)");
       this.setConstraintRatio(typedArray.getFloat(0, 0x3f200000));
       typedArray.recycle();
    }
    public void WideScreenConstraintLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final float getConstraintRatio(){
       return this.B;
    }
    public void onMeasure(int p0,int p1){
       float f;
       if (PatchProxy.isSupport(WideScreenConstraintLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, WideScreenConstraintLayout.class, "2")) {
          return;
       }
       int size = View$MeasureSpec.getSize(p0);
       int size1 = View$MeasureSpec.getSize(p1);
       size = (!size || !size1)? 0: (float)size / (float)size1;
       WideScreenConstraintLayout tB = this.B;
       if (size - tB > 0) {
          super.onMeasure(View$MeasureSpec.makeMeasureSpec((int)((float)size1 * tB), 0x40000000), p1);
       }else {
          super.onMeasure(p0, p1);
       }
       return;
    }
    public final void setConstraintRatio(float p0){
       if (PatchProxy.isSupport(WideScreenConstraintLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, WideScreenConstraintLayout.class, "1")) {
          return;
       }
       this.B = p0;
       this.requestLayout();
       return;
    }
}
