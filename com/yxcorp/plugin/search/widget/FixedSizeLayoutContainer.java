package com.yxcorp.plugin.search.widget.FixedSizeLayoutContainer;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View$MeasureSpec;

public class FixedSizeLayoutContainer extends FrameLayout	// class@0007c4
{
    public int b;
    public int c;
    public static final int d;
    public static final int e;

    static {
       FixedSizeLayoutContainer.d = a1.e(88.00f);
       FixedSizeLayoutContainer.e = a1.e(66.00f);
    }
    public void FixedSizeLayoutContainer(Context p0){
       super(p0);
       this.b = FixedSizeLayoutContainer.d;
       this.c = FixedSizeLayoutContainer.e;
    }
    public void FixedSizeLayoutContainer(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = FixedSizeLayoutContainer.d;
       this.c = FixedSizeLayoutContainer.e;
    }
    public void FixedSizeLayoutContainer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = FixedSizeLayoutContainer.d;
       this.c = FixedSizeLayoutContainer.e;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(FixedSizeLayoutContainer.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FixedSizeLayoutContainer.class, "3")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.setMeasuredDimension(View$MeasureSpec.makeMeasureSpec(this.b, 0x40000000), View$MeasureSpec.makeMeasureSpec(this.c, 0x40000000));
       return;
    }
    public void setFixedHeight(int p0){
       if (PatchProxy.isSupport(FixedSizeLayoutContainer.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FixedSizeLayoutContainer.class, "2")) {
          return;
       }
       this.c = p0;
       this.requestLayout();
       return;
    }
    public void setFixedWidth(int p0){
       if (PatchProxy.isSupport(FixedSizeLayoutContainer.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FixedSizeLayoutContainer.class, "1")) {
          return;
       }
       this.b = p0;
       this.requestLayout();
       return;
    }
}
