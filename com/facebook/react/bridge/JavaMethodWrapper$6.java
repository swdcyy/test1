package com.facebook.react.bridge.JavaMethodWrapper$6;
import com.facebook.react.bridge.JavaMethodWrapper$ArgumentExtractor;
import com.facebook.react.bridge.JavaMethodWrapper$1;
import com.facebook.react.bridge.JSInstance;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class JavaMethodWrapper$6 extends JavaMethodWrapper$ArgumentExtractor	// class@0011e9
{

    public void JavaMethodWrapper$6(){
       super(null);
    }
    public ReadableArray extractArgument(JSInstance p0,ReadableArray p1,int p2){
       if (PatchProxy.isSupport(JavaMethodWrapper$6.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, JavaMethodWrapper$6.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       return p1.getArray(p2);
    }
    public Object extractArgument(JSInstance p0,ReadableArray p1,int p2){
       return this.extractArgument(p0, p1, p2);
    }
}
