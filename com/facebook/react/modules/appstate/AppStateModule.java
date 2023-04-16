package com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.WindowFocusChangeListener;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.bridge.WritableMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.Arguments;
import java.util.Map;
import java.util.HashMap;
import com.facebook.react.bridge.Callback;
import java.lang.Boolean;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;

public class AppStateModule extends ReactContextBaseJavaModule implements LifecycleEventListener, WindowFocusChangeListener	// class@001273
{
    public String mAppState;
    public static final String TAG = "AppStateModule";

    public void AppStateModule(ReactApplicationContext p0){
       super(p0);
       p0.addLifecycleEventListener(this);
       p0.addWindowFocusChangeListener(this);
       String str = (p0.getLifecycleState() == LifecycleState.RESUMED)? "active": "background";
       this.mAppState = str;
       return;
    }
    public final WritableMap createAppStateEventMap(){
       WritableMap obj = PatchProxy.apply(null, this, AppStateModule.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Arguments.createMap();
       obj.putString("app_state", this.mAppState);
       return obj;
    }
    public Map getConstants(){
       HashMap obj = PatchProxy.apply(null, this, AppStateModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("initialAppState", this.mAppState);
       return obj;
    }
    public void getCurrentAppState(Callback p0,Callback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AppStateModule.class, "2")) {
          return;
       }
       Object[] objArray = new Object[]{this.createAppStateEventMap()};
       p0.invoke(objArray);
       return;
    }
    public String getName(){
       return "AppState";
    }
    public void onHostDestroy(){
    }
    public void onHostPause(){
       if (PatchProxy.applyVoid(null, this, AppStateModule.class, "4")) {
          return;
       }
       this.mAppState = "background";
       this.sendAppStateChangeEvent();
       return;
    }
    public void onHostResume(){
       if (PatchProxy.applyVoid(null, this, AppStateModule.class, "3")) {
          return;
       }
       this.mAppState = "active";
       this.sendAppStateChangeEvent();
       return;
    }
    public void onWindowFocusChange(boolean p0){
       AppStateModule uAppStateMod = AppStateModule.class;
       if (PatchProxy.isSupport(uAppStateMod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAppStateMod, "5")) {
          return;
       }
       this.sendEvent("appStateFocusChange", Boolean.valueOf(p0));
       return;
    }
    public final void sendAppStateChangeEvent(){
       if (PatchProxy.applyVoid(null, this, AppStateModule.class, "8")) {
          return;
       }
       this.sendEvent("appStateDidChange", this.createAppStateEventMap());
       return;
    }
    public final void sendEvent(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AppStateModule.class, "7")) {
          return;
       }
       ReactApplicationContext reactApplica = this.getReactApplicationContextIfActiveOrWarn();
       if (reactApplica != null) {
          reactApplica.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit(p0, p1);
       }
       return;
    }
}
