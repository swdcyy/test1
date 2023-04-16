package com.facebook.react.views.slider.ReactSliderManager$ReactSliderShadowNode;
import lg.e;
import com.facebook.react.uimanager.LayoutShadowNode;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.views.slider.ReactSliderManager$a;
import lg.g;
import com.facebook.yoga.YogaMeasureMode;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.facebook.react.views.slider.ReactSlider;
import ze.n0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View$MeasureSpec;
import android.widget.SeekBar;
import lg.f;

public class ReactSliderManager$ReactSliderShadowNode extends LayoutShadowNode implements e	// class@0013f4
{
    public int b;
    public int c;
    public boolean d;

    public void ReactSliderManager$ReactSliderShadowNode(){
       super();
       if (PatchProxy.applyVoid(null, this, ReactSliderManager$ReactSliderShadowNode.class, "1")) {
       }else {
          this.setMeasureFunction(this);
       }
       return;
    }
    public void ReactSliderManager$ReactSliderShadowNode(ReactSliderManager$a p0){
       super();
    }
    public long a(g p0,float p1,YogaMeasureMode p2,float p3,YogaMeasureMode p4){
       if (PatchProxy.isSupport(ReactSliderManager$ReactSliderShadowNode.class)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),p2,Float.valueOf(p3),p4};
          p0 = PatchProxy.apply(objArray, this, ReactSliderManager$ReactSliderShadowNode.class, "2");
          if (p0 != PatchProxyResult.class) {
             return p0.longValue();
          }
       }
       if (this.d == null) {
          ReactSlider reactSlider = new ReactSlider(this.getThemedContext(), null, 0x101007b);
          reactSlider.measure(View$MeasureSpec.makeMeasureSpec(-2, 0), View$MeasureSpec.makeMeasureSpec(-2, 0));
          this.b = reactSlider.getMeasuredWidth();
          this.c = reactSlider.getMeasuredHeight();
          this.d = true;
       }
       return f.b(this.b, this.c);
    }
}
