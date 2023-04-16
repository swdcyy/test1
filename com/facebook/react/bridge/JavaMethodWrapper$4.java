package com.facebook.react.bridge.JavaMethodWrapper$4;
import com.facebook.react.bridge.JavaMethodWrapper$ArgumentExtractor;
import com.facebook.react.bridge.JavaMethodWrapper$1;
import com.facebook.react.bridge.JSInstance;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class JavaMethodWrapper$4 extends JavaMethodWrapper$ArgumentExtractor	// class@0011e7
{

    public void JavaMethodWrapper$4(){
       super(null);
    }
    public Integer extractArgument(JSInstance p0,ReadableArray p1,int p2){
       if (PatchProxy.isSupport(JavaMethodWrapper$4.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, JavaMethodWrapper$4.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       return Integer.valueOf((int)p1.getDouble(p2));
    }
    public Object extractArgument(JSInstance p0,ReadableArray p1,int p2){
       return this.extractArgument(p0, p1, p2);
    }
}
