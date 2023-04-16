package com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$d$a;
import x5.a$d;
import com.alibaba.android.bindingx.plugin.react.ReactBindingXModule$d;
import java.lang.Object;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import java.lang.Class;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactContext;
import java.util.Map;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.Arguments;
import java.lang.String;

public class ReactBindingXModule$d$a implements a$d	// class@000e23
{
    public final ReactBindingXModule$d a;

    public void ReactBindingXModule$d$a(ReactBindingXModule$d p0){
       this.a = p0;
       super();
    }
    public void callback(Object p0){
       ReactApplicationContext reactApplica = this.a.e.getReactApplicationContext();
       if (reactApplica != null) {
          reactApplica.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit("bindingx:statechange", Arguments.makeNativeMap(p0));
       }
       return;
    }
}
