package com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Resources;
import android.content.res.Configuration;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactContext;

public class AppearanceModule extends ReactContextBaseJavaModule	// class@001271
{
    public String mColorScheme;

    public void AppearanceModule(ReactApplicationContext p0){
       super(p0);
       this.mColorScheme = "light";
       this.mColorScheme = AppearanceModule.colorSchemeForCurrentConfiguration(p0);
    }
    public static String colorSchemeForCurrentConfiguration(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AppearanceModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if ((p0.getResources().getConfiguration().uiMode & 0x30) != 32) {
          return "light";
       }
       return "dark";
    }
    public void addListener(String p0){
    }
    public void emitAppearanceChanged(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AppearanceModule.class, "4")) {
          return;
       }
       WritableMap writableMap = Arguments.createMap();
       writableMap.putString("colorScheme", p0);
       ReactApplicationContext reactApplica = this.getReactApplicationContextIfActiveOrWarn();
       if (reactApplica != null) {
          reactApplica.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit("appearanceChanged", writableMap);
       }
       return;
    }
    public String getColorScheme(){
       String obj = PatchProxy.apply(null, this, AppearanceModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = AppearanceModule.colorSchemeForCurrentConfiguration(this.getReactApplicationContext());
       this.mColorScheme = obj;
       return obj;
    }
    public String getName(){
       return "Appearance";
    }
    public void onConfigurationChanged(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AppearanceModule.class, "3")) {
          return;
       }
       String str = AppearanceModule.colorSchemeForCurrentConfiguration(p0);
       if (!(this.mColorScheme).equals(str)) {
          this.mColorScheme = str;
          this.emitAppearanceChanged(str);
       }
       return;
    }
    public void removeListeners(double p0){
    }
}
