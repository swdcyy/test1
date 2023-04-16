package com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule$a;
import android.os.Handler;
import android.os.Looper;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.String;
import java.lang.Object;
import android.view.accessibility.AccessibilityManager;
import android.content.ContentResolver;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.provider.Settings$Global;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.BaseJavaModule;
import android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener;
import android.database.ContentObserver;
import android.net.Uri;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;

public class AccessibilityInfoModule extends ReactContextBaseJavaModule implements LifecycleEventListener	// class@001270
{
    public final ContentObserver animationScaleObserver;
    public AccessibilityManager mAccessibilityManager;
    public final ContentResolver mContentResolver;
    public boolean mReduceMotionEnabled;
    public boolean mTouchExplorationEnabled;
    public AccessibilityInfoModule$b mTouchExplorationStateChangeListener;

    public void AccessibilityInfoModule(ReactApplicationContext p0){
       super(p0);
       this.animationScaleObserver = new AccessibilityInfoModule$a(this, new Handler(Looper.getMainLooper()));
       this.mReduceMotionEnabled = false;
       this.mTouchExplorationEnabled = false;
       this.mAccessibilityManager = p0.getApplicationContext().getSystemService("accessibility");
       this.mContentResolver = this.getReactApplicationContext().getContentResolver();
       this.mTouchExplorationEnabled = this.mAccessibilityManager.isTouchExplorationEnabled();
       this.mReduceMotionEnabled = this.getIsReduceMotionEnabledValue();
       this.mTouchExplorationStateChangeListener = new AccessibilityInfoModule$b(this, null);
    }
    public void announceForAccessibility(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AccessibilityInfoModule.class, "10")) {
          return;
       }
       AccessibilityInfoModule tmAccessibil = this.mAccessibilityManager;
       if (tmAccessibil != null && tmAccessibil.isEnabled()) {
          AccessibilityEvent uAccessibili = AccessibilityEvent.obtain(0x4000);
          uAccessibili.getText().add(p0);
          uAccessibili.setClassName(AccessibilityInfoModule.class.getName());
          uAccessibili.setPackageName(this.getReactApplicationContext().getPackageName());
          this.mAccessibilityManager.sendAccessibilityEvent(uAccessibili);
       }
       return;
    }
    public final boolean getIsReduceMotionEnabledValue(){
       String obj = PatchProxy.apply(null, this, AccessibilityInfoModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = Settings$Global.getString(this.mContentResolver, "transition_animation_scale");
       boolean b = (obj != null && obj.equals("0.0"))? true: false;
       return b;
    }
    public String getName(){
       return "AccessibilityInfo";
    }
    public void initialize(){
       if (PatchProxy.applyVoid(null, this, AccessibilityInfoModule.class, "8")) {
          return;
       }
       this.getReactApplicationContext().addLifecycleEventListener(this);
       this.updateAndSendTouchExplorationChangeEvent(this.mAccessibilityManager.isTouchExplorationEnabled());
       this.updateAndSendReduceMotionChangeEvent();
       return;
    }
    public void isReduceMotionEnabled(Callback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AccessibilityInfoModule.class, "2")) {
          return;
       }
       Object[] objArray = new Object[]{Boolean.valueOf(this.mReduceMotionEnabled)};
       p0.invoke(objArray);
       return;
    }
    public void isTouchExplorationEnabled(Callback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AccessibilityInfoModule.class, "3")) {
          return;
       }
       Object[] objArray = new Object[]{Boolean.valueOf(this.mTouchExplorationEnabled)};
       p0.invoke(objArray);
       return;
    }
    public void onCatalystInstanceDestroy(){
       if (PatchProxy.applyVoid(null, this, AccessibilityInfoModule.class, "9")) {
          return;
       }
       super.onCatalystInstanceDestroy();
       this.getReactApplicationContext().removeLifecycleEventListener(this);
       return;
    }
    public void onHostDestroy(){
    }
    public void onHostPause(){
       if (PatchProxy.applyVoid(null, this, AccessibilityInfoModule.class, "7")) {
          return;
       }
       this.mAccessibilityManager.removeTouchExplorationStateChangeListener(this.mTouchExplorationStateChangeListener);
       this.mContentResolver.unregisterContentObserver(this.animationScaleObserver);
       return;
    }
    public void onHostResume(){
       if (PatchProxy.applyVoid(null, this, AccessibilityInfoModule.class, "6")) {
          return;
       }
       this.mAccessibilityManager.addTouchExplorationStateChangeListener(this.mTouchExplorationStateChangeListener);
       this.mContentResolver.registerContentObserver(Settings$Global.getUriFor("transition_animation_scale"), false, this.animationScaleObserver);
       this.updateAndSendTouchExplorationChangeEvent(this.mAccessibilityManager.isTouchExplorationEnabled());
       this.updateAndSendReduceMotionChangeEvent();
       return;
    }
    public void updateAndSendReduceMotionChangeEvent(){
       if (PatchProxy.applyVoid(null, this, AccessibilityInfoModule.class, "4")) {
          return;
       }
       boolean isReduceMoti = this.getIsReduceMotionEnabledValue();
       if (this.mReduceMotionEnabled != isReduceMoti) {
          this.mReduceMotionEnabled = isReduceMoti;
          ReactApplicationContext reactApplica = this.getReactApplicationContextIfActiveOrWarn();
          if (reactApplica != null) {
             reactApplica.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit("reduceMotionDidChange", Boolean.valueOf(this.mReduceMotionEnabled));
          }
       }
       return;
    }
    public void updateAndSendTouchExplorationChangeEvent(boolean p0){
       AccessibilityInfoModule uAccessibili = AccessibilityInfoModule.class;
       if (PatchProxy.isSupport(uAccessibili) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAccessibili, "5")) {
          return;
       }
       if (this.mTouchExplorationEnabled != p0) {
          this.mTouchExplorationEnabled = p0;
          if (this.getReactApplicationContextIfActiveOrWarn() != null) {
             this.getReactApplicationContext().getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit("touchExplorationDidChange", Boolean.valueOf(this.mTouchExplorationEnabled));
          }
       }
       return;
    }
}
