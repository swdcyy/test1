package com.facebook.react.bridge.JavaMethodWrapper$5;
import com.facebook.react.bridge.JavaMethodWrapper$ArgumentExtractor;
import com.facebook.react.bridge.JavaMethodWrapper$1;
import com.facebook.react.bridge.JSInstance;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;

public final class JavaMethodWrapper$5 extends JavaMethodWrapper$ArgumentExtractor	// class@0011e8
{

    public void JavaMethodWrapper$5(){
       super(null);
    }
    public Object extractArgument(JSInstance p0,ReadableArray p1,int p2){
       return this.extractArgument(p0, p1, p2);
    }
    public String extractArgument(JSInstance p0,ReadableArray p1,int p2){
       if (PatchProxy.isSupport(JavaMethodWrapper$5.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, JavaMethodWrapper$5.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       return p1.getString(p2);
    }
}
