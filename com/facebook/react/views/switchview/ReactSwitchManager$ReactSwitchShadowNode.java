package com.facebook.react.views.switchview.ReactSwitchManager$ReactSwitchShadowNode;
import lg.e;
import com.facebook.react.uimanager.LayoutShadowNode;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.views.switchview.ReactSwitchManager$a;
import lg.g;
import com.facebook.yoga.YogaMeasureMode;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.facebook.react.views.switchview.ReactSwitch;
import ze.n0;
import android.content.Context;
import androidx.appcompat.widget.SwitchCompat;
import android.view.View$MeasureSpec;
import android.widget.CompoundButton;
import lg.f;

public class ReactSwitchManager$ReactSwitchShadowNode extends LayoutShadowNode implements e	// class@0013ff
{
    public int b;
    public int c;
    public boolean d;

    public void ReactSwitchManager$ReactSwitchShadowNode(){
       super();
       if (PatchProxy.applyVoid(null, this, ReactSwitchManager$ReactSwitchShadowNode.class, "1")) {
       }else {
          this.setMeasureFunction(this);
       }
       return;
    }
    public void ReactSwitchManager$ReactSwitchShadowNode(ReactSwitchManager$a p0){
       super();
    }
    public long a(g p0,float p1,YogaMeasureMode p2,float p3,YogaMeasureMode p4){
       if (PatchProxy.isSupport(ReactSwitchManager$ReactSwitchShadowNode.class)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),p2,Float.valueOf(p3),p4};
          p0 = PatchProxy.apply(objArray, this, ReactSwitchManager$ReactSwitchShadowNode.class, "2");
          if (p0 != PatchProxyResult.class) {
             return p0.longValue();
          }
       }
       if (this.d == null) {
          ReactSwitch reactSwitch = new ReactSwitch(this.getThemedContext());
          reactSwitch.setShowText(0);
          reactSwitch.measure(View$MeasureSpec.makeMeasureSpec(0, 0), View$MeasureSpec.makeMeasureSpec(0, 0));
          this.b = reactSwitch.getMeasuredWidth();
          this.c = reactSwitch.getMeasuredHeight();
          this.d = true;
       }
       return f.b(this.b, this.c);
    }
}
