package com.yxcorp.gifshow.corona.common.widget.ConstraintProxyMeasureLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.corona.common.widget.ConstraintProxyMeasureLayout$a;

public final class ConstraintProxyMeasureLayout extends ConstraintLayout	// class@00127e
{
    public ConstraintProxyMeasureLayout$a B;
    public HashMap C;

    public void ConstraintProxyMeasureLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void ConstraintProxyMeasureLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void ConstraintProxyMeasureLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void ConstraintProxyMeasureLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ConstraintProxyMeasureLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ConstraintProxyMeasureLayout.class, "1")) {
          return;
       }
       ConstraintProxyMeasureLayout tB = this.B;
       if (tB != null) {
          a.m(tB);
          int[] ointArray = tB.onMeasure(p0, p1);
          super.onMeasure(ointArray[0], ointArray[1]);
       }else {
          super.onMeasure(p0, p1);
       }
       return;
    }
    public final void setMeasureIntercept(ConstraintProxyMeasureLayout$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ConstraintProxyMeasureLayout.class, "2")) {
          return;
       }
       a.p(p0, "intercept");
       this.B = p0;
       this.requestLayout();
       return;
    }
}
