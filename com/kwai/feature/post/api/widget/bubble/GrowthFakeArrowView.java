package com.kwai.feature.post.api.widget.bubble.GrowthFakeArrowView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.feature.post.api.widget.bubble.GrowthPopupView;

public class GrowthFakeArrowView extends View	// class@001493
{
    public GrowthPopupView b;

    public void GrowthFakeArrowView(Context p0){
       super(p0, null, -1);
    }
    public void GrowthFakeArrowView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void GrowthFakeArrowView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void setTranslationX(float p0){
       if (PatchProxy.isSupport(GrowthFakeArrowView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, GrowthFakeArrowView.class, "1")) {
          return;
       }
       GrowthFakeArrowView tb = this.b;
       if (tb == null) {
          return;
       }
       tb.setArrowOffsetMiddle(p0);
       return;
    }
    public void setTranslationY(float p0){
       if (PatchProxy.isSupport(GrowthFakeArrowView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, GrowthFakeArrowView.class, "2")) {
          return;
       }
       GrowthFakeArrowView tb = this.b;
       if (tb == null) {
          return;
       }
       tb.setArrowOffsetMiddle(p0);
       return;
    }
}
