package com.facebook.react.bridge.JavaMethodWrapper$10;
import com.facebook.react.bridge.JavaMethodWrapper$ArgumentExtractor;
import com.facebook.react.bridge.JavaMethodWrapper$1;
import com.facebook.react.bridge.JSInstance;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.Promise;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.JavaMethodWrapper;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.PromiseImpl;

public final class JavaMethodWrapper$10 extends JavaMethodWrapper$ArgumentExtractor	// class@0011e3
{

    public void JavaMethodWrapper$10(){
       super(null);
    }
    public Promise extractArgument(JSInstance p0,ReadableArray p1,int p2){
       JavaMethodWrapper$ArgumentExtractor obj;
       if (PatchProxy.isSupport(JavaMethodWrapper$10.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, JavaMethodWrapper$10.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK;
       p2++;
       return new PromiseImpl(obj.extractArgument(p0, p1, p2), obj.extractArgument(p0, p1, p2));
    }
    public Object extractArgument(JSInstance p0,ReadableArray p1,int p2){
       return this.extractArgument(p0, p1, p2);
    }
    public int getJSArgumentsNeeded(){
       return 2;
    }
}
