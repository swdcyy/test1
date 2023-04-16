package com.facebook.react.transientpage.TransientEventEmitter;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.CatalystInstance;
import java.lang.Class;
import java.lang.Object;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Float;
import java.lang.String;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import com.facebook.react.transientpage.TransientPageModule;
import com.facebook.react.turbomodule.core.TurboModuleManager;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableArray;

public class TransientEventEmitter implements RCTEventEmitter, DeviceEventManagerModule$RCTDeviceEventEmitter, JavaScriptModule	// class@001302
{
    public final CatalystInstance mCatalystInstance;
    public final Class mModuleInterface;

    public void TransientEventEmitter(CatalystInstance p0,Class p1){
       super();
       this.mCatalystInstance = p0;
       this.mModuleInterface = p1;
    }
    public static WritableNativeArray pushJavaObject(WritableNativeArray p0,Object p1){
       if (p1 == null) {
          p0.pushNull();
       }
       if (p1 instanceof ReadableArray) {
          p0.pushArray(p1);
       }else if(p1 instanceof ReadableMap){
          p0.pushMap(p1);
       }else if(p1 instanceof Boolean){
          p0.pushBoolean(p1.booleanValue());
       }else if(p1 instanceof Integer){
          p0.pushDouble(p1.doubleValue());
       }else if(p1 instanceof Double){
          p0.pushDouble(p1.doubleValue());
       }else if(p1 instanceof Float){
          p0.pushDouble(p1.doubleValue());
       }else if(p1 instanceof String){
          p0.pushString(p1.toString());
       }else {
          throw new RuntimeException("Cannot convert argument of type "+p1.getClass());
       }
       return p0;
    }
    public void emit(String p0,Object p1){
       if (this.getTransientPageModule() != null && this.getTransientPageModule().isActive()) {
          WritableNativeArray writableNati = new WritableNativeArray();
          TransientEventEmitter.pushJavaObject(writableNati, p1);
          this.getTurboBridge().callFunction("emit", writableNati);
       }else {
          this.getRCTDeviceEventEmitter().emit(p0, p1);
       }
       return;
    }
    public final DeviceEventManagerModule$RCTDeviceEventEmitter getRCTDeviceEventEmitter(){
       return this.mCatalystInstance.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class);
    }
    public final RCTEventEmitter getRCTEventEmitter(){
       return this.mCatalystInstance.getJSModule(RCTEventEmitter.class);
    }
    public final TransientPageModule getTransientPageModule(){
       return this.mCatalystInstance.getNativeModule(TransientPageModule.class);
    }
    public final TurboModuleManager getTurboBridge(){
       return this.mCatalystInstance.getJSIModule(JSIModuleType.TurboModuleManager);
    }
    public void receiveEvent(int p0,String p1,WritableMap p2){
       if (this.getTransientPageModule() != null && this.getTransientPageModule().isActive()) {
          WritableNativeArray writableNati = new WritableNativeArray();
          writableNati.pushInt(p0);
          writableNati.pushString(p1);
          writableNati.pushMap(p2);
          this.getTurboBridge().callFunction("receiveEvent", writableNati);
       }else {
          this.getRCTEventEmitter().receiveEvent(p0, p1, p2);
       }
       return;
    }
    public void receiveTouches(String p0,WritableArray p1,WritableArray p2){
       if (this.getTransientPageModule() != null && this.getTransientPageModule().isActive()) {
          WritableNativeArray writableNati = new WritableNativeArray();
          writableNati.pushString(p0);
          writableNati.pushArray(p1);
          writableNati.pushArray(p2);
          this.getTurboBridge().callFunction("receiveTouches", writableNati);
       }else {
          this.getRCTEventEmitter().receiveTouches(p0, p1, p2);
       }
       return;
    }
}
