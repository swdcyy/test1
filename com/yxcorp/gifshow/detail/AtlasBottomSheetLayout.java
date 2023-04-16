package com.yxcorp.gifshow.detail.AtlasBottomSheetLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View$MeasureSpec;

public class AtlasBottomSheetLayout extends FrameLayout	// class@001331
{
    public int b;

    public void AtlasBottomSheetLayout(Context p0){
       super(p0, null);
    }
    public void AtlasBottomSheetLayout(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void AtlasBottomSheetLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(AtlasBottomSheetLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AtlasBottomSheetLayout.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (this.b != null) {
          AtlasBottomSheetLayout tb = this.b;
          if (this.getMeasuredHeight() > tb) {
             super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec(tb, 0x40000000));
          }
       }
       return;
    }
    public void setMaxHeight(int p0){
       if (PatchProxy.isSupport(AtlasBottomSheetLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AtlasBottomSheetLayout.class, "1")) {
          return;
       }
       if (this.b != p0) {
          this.b = p0;
          this.requestLayout();
       }
       return;
    }
}
