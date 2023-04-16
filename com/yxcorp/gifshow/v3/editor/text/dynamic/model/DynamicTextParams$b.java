package com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class DynamicTextParams$b	// class@0013d4
{
    public DynamicTextParams$ColorParams color;
    public float position;

    public void DynamicTextParams$b(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DynamicTextParams$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StopParams\(color="+this.color+", position="+this.position+')';
    }
}
