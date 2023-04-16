package com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$ColorParams;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.StringBuilder;

public class DynamicTextParams$ColorParams	// class@0013c7
{
    public float alpha;
    public float blue;
    public float green;
    public float red;

    public void DynamicTextParams$ColorParams(){
       super();
    }
    public final String a(float p0){
       DynamicTextParams$ColorParams uColorParams = DynamicTextParams$ColorParams.class;
       if (PatchProxy.isSupport(uColorParams)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uColorParams, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = Integer.toHexString((int)(p0 * 0x437f0000));
       if (str.length() < 2) {
          str = "0"+str;
       }
       return str;
    }
    public int b(){
       return (((((int)((this.alpha * 0x437f0000) + 0x3f000000) << 24) | ((int)((this.red * 0x437f0000) + 0x3f000000) << 16)) | ((int)((this.green * 0x437f0000) + 0x3f000000) << 8)) | (int)((this.blue * 0x437f0000) + 0x3f000000));
    }
    public String c(){
       Object obj = PatchProxy.apply(null, this, DynamicTextParams$ColorParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "#"+this.a(this.alpha)+this.a(this.red)+this.a(this.green)+this.a(this.blue);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DynamicTextParams$ColorParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c();
    }
}
