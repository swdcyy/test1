package com.facebook.react.bridge.JavaMethodWrapper$9;
import com.facebook.react.bridge.JavaMethodWrapper$ArgumentExtractor;
import com.facebook.react.bridge.JavaMethodWrapper$1;
import com.facebook.react.bridge.JSInstance;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.Callback;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.CallbackImpl;

public final class JavaMethodWrapper$9 extends JavaMethodWrapper$ArgumentExtractor	// class@0011ec
{

    public void JavaMethodWrapper$9(){
       super(null);
    }
    public Callback extractArgument(JSInstance p0,ReadableArray p1,int p2){
       if (PatchProxy.isSupport(JavaMethodWrapper$9.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, JavaMethodWrapper$9.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1.isNull(p2)) {
          return null;
       }else {
          return new CallbackImpl(p0, (int)p1.getDouble(p2));
       }
    }
    public Object extractArgument(JSInstance p0,ReadableArray p1,int p2){
       return this.extractArgument(p0, p1, p2);
    }
}
