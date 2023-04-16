package com.facebook.react.bridge.JavaMethodWrapper$2;
import com.facebook.react.bridge.JavaMethodWrapper$ArgumentExtractor;
import com.facebook.react.bridge.JavaMethodWrapper$1;
import com.facebook.react.bridge.JSInstance;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Double;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class JavaMethodWrapper$2 extends JavaMethodWrapper$ArgumentExtractor	// class@0011e5
{

    public void JavaMethodWrapper$2(){
       super(null);
    }
    public Double extractArgument(JSInstance p0,ReadableArray p1,int p2){
       if (PatchProxy.isSupport(JavaMethodWrapper$2.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, JavaMethodWrapper$2.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       return Double.valueOf(p1.getDouble(p2));
    }
    public Object extractArgument(JSInstance p0,ReadableArray p1,int p2){
       return this.extractArgument(p0, p1, p2);
    }
}
