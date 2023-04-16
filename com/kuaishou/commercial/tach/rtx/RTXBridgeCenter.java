package com.kuaishou.commercial.tach.rtx.RTXBridgeCenter;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import java.lang.String;
import com.tkruntime.v8.V8Function;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.JsValueRef;
import tx4.y;
import g00.a;
import android.content.Context;
import com.kuaishou.commercial.tach.rtx.RTXBridgeCenter$a;
import p55.a;
import f55.g;
import com.kwai.bridge.a;
import java.lang.Exception;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public class RTXBridgeCenter extends TKBaseNativeModule	// class@00168b
{
    public JsValueRef mV8FunctionRef;

    public void RTXBridgeCenter(f p0){
       super(p0);
    }
    public void invoke(String p0,String p1,String p2,V8Function p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, RTXBridgeCenter.class, "1")) {
          return;
       }
       JsValueRef jsValueRef = y.b(p3, this);
       y.c(this.mV8FunctionRef);
       try{
          this.mV8FunctionRef = jsValueRef;
          a.f(new a(this.getContext()), p0, p1, p2, new RTXBridgeCenter$a(this, p3));
       }catch(java.lang.Exception e8){
          if (!TextUtils.isEmpty(e8.getMessage())) {
             Log.d("RTXBridgeCenter", "invoke onFailed: "+e8.getMessage());
          }
       }
       return;
    }
    public void test(V8Function p0){
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, RTXBridgeCenter.class, "2")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.mV8FunctionRef);
       return;
    }
}
