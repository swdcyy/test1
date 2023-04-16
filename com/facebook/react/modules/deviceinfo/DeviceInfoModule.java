package com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import android.content.Context;
import com.facebook.react.bridge.ReactApplicationContext;
import ze.c;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.content.ContextWrapper;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;
import java.lang.Double;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.WritableNativeMap;
import java.lang.Boolean;
import od.a;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import java.lang.Throwable;
import com.facebook.react.bridge.ReactSoftException;
import java.util.Map;
import java.util.HashMap;

public class DeviceInfoModule extends ReactContextBaseJavaModule implements LifecycleEventListener, TurboModule	// class@0012a8
{
    public float mFontScale;
    public ReactApplicationContext mReactApplicationContext;

    public void DeviceInfoModule(Context p0){
       super(null);
       this.mReactApplicationContext = null;
       c.g(p0);
       this.mFontScale = p0.getResources().getConfiguration().fontScale;
    }
    public void DeviceInfoModule(ReactApplicationContext p0){
       super(p0);
       c.g(p0);
       this.mFontScale = p0.getResources().getConfiguration().fontScale;
       this.mReactApplicationContext = p0;
       p0.addLifecycleEventListener(this);
    }
    public void emitUpdateDimensionsEvent(){
       WritableNativeMap writableNati;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DeviceInfoModule.class, "3")) {
          return;
       }
       DeviceInfoModule tmReactAppli = this.mReactApplicationContext;
       if (tmReactAppli == null) {
          return;
       }
       if (tmReactAppli.hasActiveCatalystInstance()) {
          DeviceEventManagerModule$RCTDeviceEventEmitter jSModule = this.mReactApplicationContext.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class);
          double d = (double)this.mFontScale;
          c uoc = c.class;
          if (PatchProxy.isSupport(uoc)) {
             writableNati = PatchProxy.applyOneRefs(Double.valueOf(d), objArray, uoc, "4");
             if (writableNati != PatchProxyResult.class) {
             label_006d :
                jSModule.emit("didUpdateDimensions", writableNati);
             }
          }
          boolean b = (c.a != null || c.b != null)? true: false;
          a.d(Boolean.valueOf(b), "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
          writableNati = new WritableNativeMap();
          writableNati.putMap("windowPhysicalPixels", c.c(c.a, d));
          writableNati.putMap("screenPhysicalPixels", c.c(c.b, d));
          goto label_006d ;
       }else {
          ReactSoftException.logSoftException("DeviceInfo", new ReactNoCrashSoftException("No active CatalystInstance, cannot emitUpdateDimensionsEvent"));
       }
       return;
    }
    public Map getConstants(){
       HashMap obj = PatchProxy.apply(null, this, DeviceInfoModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("Dimensions", c.a((double)this.mFontScale));
       return obj;
    }
    public String getName(){
       return "DeviceInfo";
    }
    public void invalidate(){
    }
    public void onHostDestroy(){
    }
    public void onHostPause(){
    }
    public void onHostResume(){
       if (PatchProxy.applyVoid(null, this, DeviceInfoModule.class, "2")) {
          return;
       }
       DeviceInfoModule tmReactAppli = this.mReactApplicationContext;
       if (tmReactAppli == null) {
          return;
       }
       Configuration fontScale = tmReactAppli.getResources().getConfiguration().fontScale;
       if (this.mFontScale - fontScale) {
          this.mFontScale = fontScale;
          this.emitUpdateDimensionsEvent();
       }
       return;
    }
}
