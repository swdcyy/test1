package com.facebook.react.animated.NativeAnimatedModule$q;
import sd.c;
import com.facebook.react.animated.NativeAnimatedModule;
import java.lang.Object;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import java.lang.String;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import java.lang.Class;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactContext;

public class NativeAnimatedModule$q implements c	// class@001190
{
    public final int a;
    public final NativeAnimatedModule b;

    public void NativeAnimatedModule$q(NativeAnimatedModule p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(double p0){
       WritableMap writableMap = Arguments.createMap();
       writableMap.putInt("tag", this.a);
       writableMap.putDouble("value", p0);
       ReactApplicationContext reactApplica = this.b.getReactApplicationContextIfActiveOrWarn();
       if (reactApplica != null) {
          reactApplica.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit("onAnimatedValueUpdate", writableMap);
       }
       return;
    }
}
