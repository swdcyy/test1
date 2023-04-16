package com.facebook.react.bridge.JavaMethodWrapper$8;
import com.facebook.react.bridge.JavaMethodWrapper$ArgumentExtractor;
import com.facebook.react.bridge.JavaMethodWrapper$1;
import com.facebook.react.bridge.JSInstance;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class JavaMethodWrapper$8 extends JavaMethodWrapper$ArgumentExtractor	// class@0011eb
{

    public void JavaMethodWrapper$8(){
       super(null);
    }
    public ReadableMap extractArgument(JSInstance p0,ReadableArray p1,int p2){
       if (PatchProxy.isSupport(JavaMethodWrapper$8.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, JavaMethodWrapper$8.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       return p1.getMap(p2);
    }
    public Object extractArgument(JSInstance p0,ReadableArray p1,int p2){
       return this.extractArgument(p0, p1, p2);
    }
}
