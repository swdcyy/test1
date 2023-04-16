package com.facebook.react.uimanager.LayoutShadowNode$b;
import java.lang.Object;
import com.facebook.react.uimanager.LayoutShadowNode$a;
import com.facebook.react.bridge.Dynamic;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.yoga.YogaUnit;
import com.facebook.react.bridge.ReadableType;
import java.lang.Float;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import ze.p;

public class LayoutShadowNode$b	// class@001318
{
    public float a;
    public YogaUnit b;

    public void LayoutShadowNode$b(){
       super();
    }
    public void LayoutShadowNode$b(LayoutShadowNode$a p0){
       super();
    }
    public void LayoutShadowNode$b(LayoutShadowNode$b p0){
       super();
       this.a = p0.a;
       this.b = p0.b;
    }
    public void a(Dynamic p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LayoutShadowNode$b.class, "1")) {
          return;
       }
       float f = Float.NaN;
       if (p0.isNull()) {
          this.b = YogaUnit.UNDEFINED;
          this.a = f;
       }else if(p0.getType() == ReadableType.String){
          String str = p0.asString();
          if (str.equals("auto")) {
             this.b = YogaUnit.AUTO;
             this.a = f;
          }else if(str.endsWith("%")){
             this.b = YogaUnit.PERCENT;
             this.a = Float.parseFloat(str.substring(0, (str.length() - 1)));
          }else {
             throw new IllegalArgumentException("Unknown value: "+str);
          }
       }else {
          this.b = YogaUnit.POINT;
          this.a = p.b(p0.asDouble());
       }
       return;
    }
}
