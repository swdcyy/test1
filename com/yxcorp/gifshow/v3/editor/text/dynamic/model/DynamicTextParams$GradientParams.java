package com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$GradientParams;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class DynamicTextParams$GradientParams	// class@0013ca
{
    public DynamicTextParams$PointParams endPoint;
    public int gradientType;
    public float radius;
    public DynamicTextParams$PointParams startPoint;
    public List stops;
    public int tileMode;

    public void DynamicTextParams$GradientParams(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DynamicTextParams$GradientParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GradientParams{gradientType="+this.gradientType+", startPoint="+this.startPoint+", endPoint="+this.endPoint+", radius="+this.radius+", tileMode="+this.tileMode+", stops="+this.stops+'}';
    }
}
