package com.kuaishou.live.core.show.turbomode.dialog.MaxHeightFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.View$MeasureSpec;

public final class MaxHeightFrameLayout extends FrameLayout	// class@00122a
{
    public int b;
    public HashMap c;

    public void MaxHeightFrameLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void MaxHeightFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void MaxHeightFrameLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void MaxHeightFrameLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
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
       if (PatchProxy.isSupport(MaxHeightFrameLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, MaxHeightFrameLayout.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (this.b != null) {
          MaxHeightFrameLayout tb = this.b;
          if (this.getMeasuredHeight() > tb) {
             super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec(tb, 0x40000000));
          }
       }
       return;
    }
    public final void setMaxHeight(int p0){
       if (PatchProxy.isSupport(MaxHeightFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MaxHeightFrameLayout.class, "1")) {
          return;
       }
       if (this.b != p0) {
          this.b = p0;
          this.requestLayout();
       }
       return;
    }
}
