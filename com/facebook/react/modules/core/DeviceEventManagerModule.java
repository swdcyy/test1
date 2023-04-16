package com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import je.a;
import com.facebook.react.modules.core.DeviceEventManagerModule$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactContext;
import android.net.Uri;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import java.lang.Runnable;

public class DeviceEventManagerModule extends ReactContextBaseJavaModule	// class@00128c
{
    public final Runnable mInvokeDefaultBackPressRunnable;

    public void DeviceEventManagerModule(ReactApplicationContext p0,a p1){
       super(p0);
       this.mInvokeDefaultBackPressRunnable = new DeviceEventManagerModule$a(this, p1);
    }
    public void emitHardwareBackPressed(){
       if (PatchProxy.applyVoid(null, this, DeviceEventManagerModule.class, "1")) {
          return;
       }
       ReactApplicationContext reactApplica = this.getReactApplicationContextIfActiveOrWarn();
       if (reactApplica != null) {
          reactApplica.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit("hardwareBackPress", null);
       }
       return;
    }
    public void emitNewIntentReceived(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DeviceEventManagerModule.class, "2")) {
          return;
       }
       ReactApplicationContext reactApplica = this.getReactApplicationContextIfActiveOrWarn();
       if (reactApplica != null) {
          WritableMap writableMap = Arguments.createMap();
          writableMap.putString("url", p0.toString());
          reactApplica.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit("url", writableMap);
       }
       return;
    }
    public String getName(){
       return "DeviceEventManager";
    }
    public void invokeDefaultBackPressHandler(){
       if (PatchProxy.applyVoid(null, this, DeviceEventManagerModule.class, "3")) {
          return;
       }
       this.getReactApplicationContext().runOnUiQueueThread(this.mInvokeDefaultBackPressRunnable);
       return;
    }
}
