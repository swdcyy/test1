package com.facebook.react.a$d;
import com.facebook.react.bridge.JSIModuleSpec;
import com.facebook.react.a;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import com.facebook.react.bridge.JSIModuleProvider;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rd.u;
import com.facebook.react.bridge.JSIModuleType;

public class a$d implements JSIModuleSpec	// class@001172
{
    public final ReactApplicationContext a;
    public final a b;

    public void a$d(a p0,ReactApplicationContext p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public JSIModuleProvider getJSIModuleProvider(){
       Object obj = PatchProxy.apply(null, this, a$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new u(this, this.a);
    }
    public JSIModuleType getJSIModuleType(){
       return JSIModuleType.TurboModuleManager;
    }
}
