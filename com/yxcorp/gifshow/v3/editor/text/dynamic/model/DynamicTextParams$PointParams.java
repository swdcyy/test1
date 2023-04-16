package com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$PointParams;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class DynamicTextParams$PointParams	// class@0013cc
{
    public float x;
    public float y;

    public void DynamicTextParams$PointParams(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DynamicTextParams$PointParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Point\(x="+this.x+", y="+this.y+')';
    }
}
