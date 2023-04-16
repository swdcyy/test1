package com.yxcorp.gifshow.nearby.homecard.view.FixedRatioConstraintLayout;
import com.yxcorp.widget.selector.view.SelectShapeConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class FixedRatioConstraintLayout extends SelectShapeConstraintLayout	// class@002145
{

    public void FixedRatioConstraintLayout(Context p0){
       super(p0, null);
    }
    public void FixedRatioConstraintLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(FixedRatioConstraintLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FixedRatioConstraintLayout.class, "1")) {
          return;
       }
       super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec(((View$MeasureSpec.getSize(p0) * 16) / 9), 0x40000000));
       return;
    }
}
