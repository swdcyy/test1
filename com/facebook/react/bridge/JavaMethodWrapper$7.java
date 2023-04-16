package com.facebook.react.bridge.JavaMethodWrapper$7;
import com.facebook.react.bridge.JavaMethodWrapper$ArgumentExtractor;
import com.facebook.react.bridge.JavaMethodWrapper$1;
import com.facebook.react.bridge.JSInstance;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.Dynamic;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.DynamicFromArray;

public final class JavaMethodWrapper$7 extends JavaMethodWrapper$ArgumentExtractor	// class@0011ea
{

    public void JavaMethodWrapper$7(){
       super(null);
    }
    public Dynamic extractArgument(JSInstance p0,ReadableArray p1,int p2){
       if (PatchProxy.isSupport(JavaMethodWrapper$7.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, JavaMethodWrapper$7.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       return DynamicFromArray.create(p1, p2);
    }
    public Object extractArgument(JSInstance p0,ReadableArray p1,int p2){
       return this.extractArgument(p0, p1, p2);
    }
}
