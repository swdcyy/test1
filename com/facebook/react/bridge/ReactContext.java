package com.facebook.react.bridge.ReactContext;
import android.content.ContextWrapper;
import android.content.Context;
import java.util.concurrent.CopyOnWriteArraySet;
import com.facebook.react.common.LifecycleState;
import java.lang.Runnable;
import yd.e;
import com.facebook.react.bridge.ActivityEventListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.InputEventListener;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext$3;
import java.lang.Enum;
import com.facebook.react.bridge.ReactContext$1;
import java.lang.RuntimeException;
import com.facebook.react.bridge.ScrollEventListener;
import com.facebook.react.bridge.WindowFocusChangeListener;
import od.a;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.UiThreadUtil;
import td.m;
import com.facebook.react.bridge.CatalystInstance$DestroyFinishedCallback;
import com.facebook.react.bridge.CatalystInstance;
import com.kwai.robust.PatchProxyResult;
import cb.a;
import android.app.Activity;
import java.lang.ref.WeakReference;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactContext$ExceptionHandlerWrapper;
import com.facebook.react.views.scroll.FpsListener;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.NativeModule;
import android.view.LayoutInflater;
import java.lang.Exception;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.lang.Boolean;
import com.facebook.react.bridge.ReactContext$2;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import java.lang.IllegalStateException;
import java.lang.IllegalArgumentException;
import android.content.Intent;
import java.lang.Integer;
import java.util.Iterator;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import android.os.Bundle;

public class ReactContext extends ContextWrapper	// class@001220
{
    public final CopyOnWriteArraySet mActivityEventListeners;
    public CatalystInstance mCatalystInstance;
    public WeakReference mCurrentActivity;
    public NativeModuleCallExceptionHandler mExceptionHandlerWrapper;
    public FpsListener mFpsListener;
    public LayoutInflater mInflater;
    public final CopyOnWriteArraySet mInputEventListeners;
    public MessageQueueThread mJSMessageQueueThread;
    public final CopyOnWriteArraySet mLifecycleEventListeners;
    public LifecycleState mLifecycleState;
    public NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    public MessageQueueThread mNativeModulesMessageQueueThread;
    public final CopyOnWriteArraySet mScrollEventListeners;
    public MessageQueueThread mUiMessageQueueThread;
    public final CopyOnWriteArraySet mWindowFocusEventListeners;

    public void ReactContext(Context p0){
       super(p0);
       this.mLifecycleEventListeners = new CopyOnWriteArraySet();
       this.mActivityEventListeners = new CopyOnWriteArraySet();
       this.mWindowFocusEventListeners = new CopyOnWriteArraySet();
       this.mScrollEventListeners = new CopyOnWriteArraySet();
       this.mInputEventListeners = new CopyOnWriteArraySet();
       this.mLifecycleState = LifecycleState.BEFORE_CREATE;
       this.initFpsListener();
    }
    public static void a(ReactContext p0,Runnable p1){
       p0.lambda$destroy$0(p1);
    }
    private void lambda$destroy$0(Runnable p0){
       if (p0 != null) {
          p0.run();
       }
       if (e.J) {
          this.mCatalystInstance = null;
       }
       return;
    }
    public void addActivityEventListener(ActivityEventListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext.class, "13")) {
          return;
       }
       this.mActivityEventListeners.add(p0);
       return;
    }
    public void addInputEventListener(InputEventListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext.class, "19")) {
          return;
       }
       this.mInputEventListeners.add(p0);
       return;
    }
    public void addLifecycleEventListener(LifecycleEventListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext.class, "11")) {
          return;
       }
       this.mLifecycleEventListeners.add(p0);
       if (this.hasActiveCatalystInstance()) {
          int i = ReactContext$3.$SwitchMap$com$facebook$react$common$LifecycleState[this.mLifecycleState.ordinal()];
          if (i != 1 && i != 2) {
             if (i == 3) {
                this.runOnUiQueueThread(new ReactContext$1(this, p0));
             }else {
                throw new RuntimeException("Unhandled lifecycle state.");
             }
          }
       }
       return;
    }
    public void addScrollEventListener(ScrollEventListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext.class, "17")) {
          return;
       }
       this.mScrollEventListeners.add(p0);
       return;
    }
    public void addWindowFocusChangeListener(WindowFocusChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext.class, "15")) {
          return;
       }
       this.mWindowFocusEventListeners.add(p0);
       return;
    }
    public void assertOnJSQueueThread(){
       if (PatchProxy.applyVoid(null, this, ReactContext.class, "37")) {
          return;
       }
       ReactContext tmJSMessageQ = this.mJSMessageQueueThread;
       a.c(tmJSMessageQ);
       tmJSMessageQ.assertIsOnThread();
       return;
    }
    public void assertOnNativeModulesQueueThread(){
       if (PatchProxy.applyVoid(null, this, ReactContext.class, "33")) {
          return;
       }
       ReactContext tmNativeModu = this.mNativeModulesMessageQueueThread;
       a.c(tmNativeModu);
       tmNativeModu.assertIsOnThread();
       return;
    }
    public void assertOnNativeModulesQueueThread(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext.class, "34")) {
          return;
       }
       ReactContext tmNativeModu = this.mNativeModulesMessageQueueThread;
       a.c(tmNativeModu);
       tmNativeModu.assertIsOnThread(p0);
       return;
    }
    public void assertOnUiQueueThread(){
       if (PatchProxy.applyVoid(null, this, ReactContext.class, "30")) {
          return;
       }
       ReactContext tmUiMessageQ = this.mUiMessageQueueThread;
       a.c(tmUiMessageQ);
       tmUiMessageQ.assertIsOnThread();
       return;
    }
    public void destroy(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext.class, "25")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       ReactContext tmCatalystIn = this.mCatalystInstance;
       if (tmCatalystIn != null) {
          tmCatalystIn.destroy(new m(this, p0));
       }else if(p0 != null){
          p0.run();
       }
       if (e.m) {
          this.mLifecycleEventListeners.clear();
          this.mActivityEventListeners.clear();
          this.mWindowFocusEventListeners.clear();
       }
       this.mScrollEventListeners.clear();
       this.mInputEventListeners.clear();
       return;
    }
    public CatalystInstance getCatalystInstance(){
       Object obj = PatchProxy.apply(null, this, ReactContext.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.sanityCheck();
       if (!this.hasCatalystInstance()) {
          a.g("ReactNative", "getCatalystInstance is null");
       }
       return this.mCatalystInstance;
    }
    public Activity getCurrentActivity(){
       ReactContext obj = PatchProxy.apply(null, this, ReactContext.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCurrentActivity;
       if (obj == null) {
          return null;
       }
       return obj.get();
    }
    public NativeModuleCallExceptionHandler getExceptionHandler(){
       Object obj = PatchProxy.apply(null, this, ReactContext.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mExceptionHandlerWrapper == null) {
          this.mExceptionHandlerWrapper = new ReactContext$ExceptionHandlerWrapper(this);
       }
       return this.mExceptionHandlerWrapper;
    }
    public FpsListener getFpsListener(){
       return this.mFpsListener;
    }
    public JavaScriptModule getJSModule(Class p0){
       ReactContext obj = PatchProxy.applyOneRefs(p0, this, ReactContext.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.sanityCheck();
       obj = this.mCatalystInstance;
       if (obj != null) {
          return obj.getJSModule(p0);
       }
       throw new RuntimeException("Tried to access a JS module before the React instance was fully set up. Calls to ReactContext#getJSModule should only happen once initialize\(\) has been called on your native module.");
    }
    public JavaScriptContextHolder getJavaScriptContextHolder(){
       Object obj = PatchProxy.apply(null, this, ReactContext.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mCatalystInstance.getJavaScriptContextHolder();
    }
    public LifecycleState getLifecycleState(){
       return this.mLifecycleState;
    }
    public NativeModule getNativeModule(Class p0){
       ReactContext obj = PatchProxy.applyOneRefs(p0, this, ReactContext.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.sanityCheck();
       obj = this.mCatalystInstance;
       if (obj != null) {
          return obj.getNativeModule(p0);
       }
       throw new RuntimeException("Trying to call native module before CatalystInstance has been set!");
    }
    public Object getSystemService(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactContext.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!("layout_inflater").equals(p0)) {
          return this.getBaseContext().getSystemService(p0);
       }
       if (this.mInflater == null) {
          this.mInflater = LayoutInflater.from(this.getBaseContext()).cloneInContext(this);
       }
       return this.mInflater;
    }
    public void handleCaughtException(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext.class, "41")) {
          return;
       }
       ReactContext tmNativeModu = this.mNativeModuleCallExceptionHandler;
       if (tmNativeModu != null) {
          tmNativeModu.handleCaughtException(p0);
       }
       return;
    }
    public void handleException(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext.class, "40")) {
          return;
       }
       ReactContext tmCatalystIn = this.mCatalystInstance;
       boolean b = true;
       boolean b1 = (tmCatalystIn != null)? true: false;
       boolean b2 = (b1 && !tmCatalystIn.isDestroyed())? true: false;
       ReactContext tmNativeModu = this.mNativeModuleCallExceptionHandler;
       if (tmNativeModu == null) {
          b = false;
       }
       if (b2 && b) {
          tmNativeModu.handleException(p0);
       }else {
          a.h("ReactNative-Crash", "Unable to handle Exception - catalystInstanceVariableExists: "+b1+" - isCatalystInstanceAlive: "+b2+" - hasExceptionHandler: "+b, p0);
       }
       return;
    }
    public boolean hasActiveCatalystInstance(){
       ReactContext obj = PatchProxy.apply(null, this, ReactContext.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mCatalystInstance;
       boolean b = (obj != null && !obj.isDestroyed())? true: false;
       return b;
    }
    public boolean hasCatalystInstance(){
       boolean b = (this.mCatalystInstance != null)? true: false;
       return b;
    }
    public boolean hasCurrentActivity(){
       ReactContext obj = PatchProxy.apply(null, this, ReactContext.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mCurrentActivity;
       boolean b = (obj != null && obj.get() != null)? true: false;
       return b;
    }
    public boolean hasNativeModule(Class p0){
       ReactContext obj = PatchProxy.applyOneRefs(p0, this, ReactContext.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.sanityCheck();
       obj = this.mCatalystInstance;
       if (obj != null) {
          return obj.hasNativeModule(p0);
       }
       throw new RuntimeException("Trying to call native module before CatalystInstance has been set!");
    }
    public final void initFpsListener(){
       if (PatchProxy.applyVoid(null, this, ReactContext.class, "47")) {
          return;
       }
       this.mFpsListener = new ReactContext$2(this, new WeakReference(this));
       return;
    }
    public void initializeMessageQueueThreads(ReactQueueConfiguration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext.class, "2")) {
          return;
       }
       if (this.mUiMessageQueueThread != null || (this.mNativeModulesMessageQueueThread != null || this.mJSMessageQueueThread != null)) {
          throw new IllegalStateException("Message queue threads already initialized");
       }
       this.mUiMessageQueueThread = p0.getUIQueueThread();
       this.mNativeModulesMessageQueueThread = p0.getNativeModulesQueueThread();
       this.mJSMessageQueueThread = p0.getJSQueueThread();
       return;
    }
    public void initializeWithInstance(CatalystInstance p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext.class, "1")) {
          return;
       }
       if (p0 == null) {
          throw new IllegalArgumentException("CatalystInstance cannot be null.");
       }
       if (this.mCatalystInstance != null) {
          throw new IllegalStateException("ReactContext has been already initialized");
       }
       this.mCatalystInstance = p0;
       this.initializeMessageQueueThreads(p0.getReactQueueConfiguration());
       return;
    }
    public boolean isOnJSQueueThread(){
       ReactContext obj = PatchProxy.apply(null, this, ReactContext.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mJSMessageQueueThread;
       a.c(obj);
       return obj.isOnThread();
    }
    public boolean isOnNativeModulesQueueThread(){
       ReactContext obj = PatchProxy.apply(null, this, ReactContext.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mNativeModulesMessageQueueThread;
       a.c(obj);
       return obj.isOnThread();
    }
    public boolean isOnUiQueueThread(){
       ReactContext obj = PatchProxy.apply(null, this, ReactContext.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mUiMessageQueueThread;
       a.c(obj);
       return obj.isOnThread();
    }
    public void onActivityResult(Activity p0,int p1,int p2,Intent p3){
       if (PatchProxy.isSupport(ReactContext.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, ReactContext.class, "26")) {
          return;
       }
       Iterator iterator = this.mActivityEventListeners.iterator();
       while (iterator.hasNext()) {
          ActivityEventListener uActivityEve = iterator.next();
          try{
             uActivityEve.onActivityResult(p0, p1, p2, p3);
          }catch(java.lang.RuntimeException e1){
             this.handleException(e1);
             goto label_0024 ;
          }
       }
       return;
    }
    public void onHostDestroy(){
       if (PatchProxy.applyVoid(null, this, ReactContext.class, "24")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       this.mLifecycleState = LifecycleState.BEFORE_CREATE;
       Iterator iterator = this.mLifecycleEventListeners.iterator();
       while (iterator.hasNext()) {
          LifecycleEventListener lifecycleEve = iterator.next();
          try{
             lifecycleEve.onHostDestroy();
          }catch(java.lang.RuntimeException e2){
             this.handleException(e2);
             goto label_0019 ;
          }
       }
       this.mCurrentActivity = null;
       return;
    }
    public void onHostPause(){
       if (PatchProxy.applyVoid(null, this, ReactContext.class, "23")) {
          return;
       }
       this.mLifecycleState = LifecycleState.BEFORE_RESUME;
       ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_START);
       Iterator iterator = this.mLifecycleEventListeners.iterator();
       while (iterator.hasNext()) {
          LifecycleEventListener lifecycleEve = iterator.next();
          try{
             lifecycleEve.onHostPause();
          }catch(java.lang.RuntimeException e1){
             this.handleException(e1);
             goto label_001b ;
          }
       }
       ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_END);
       return;
    }
    public void onHostResume(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext.class, "21")) {
          return;
       }
       this.mLifecycleState = LifecycleState.RESUMED;
       this.mCurrentActivity = new WeakReference(p0);
       ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_START);
       Iterator iterator = this.mLifecycleEventListeners.iterator();
       while (iterator.hasNext()) {
          LifecycleEventListener lifecycleEve = iterator.next();
          try{
             lifecycleEve.onHostResume();
          }catch(java.lang.RuntimeException e0){
             this.handleException(e0);
             goto label_0021 ;
          }
       }
       ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_END);
       return;
    }
    public void onInputEvent(){
       if (PatchProxy.applyVoid(null, this, ReactContext.class, "29")) {
          return;
       }
       Iterator iterator = this.mInputEventListeners.iterator();
       while (iterator.hasNext()) {
          InputEventListener inputEventLi = iterator.next();
          try{
             inputEventLi.onEditTextChanged();
          }catch(java.lang.RuntimeException e1){
             this.handleException(e1);
             goto label_0012 ;
          }
       }
       return;
    }
    public void onNewIntent(Activity p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactContext.class, "22")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       this.mCurrentActivity = new WeakReference(p0);
       Iterator iterator = this.mActivityEventListeners.iterator();
       while (iterator.hasNext()) {
          ActivityEventListener uActivityEve = iterator.next();
          try{
             uActivityEve.onNewIntent(p1);
          }catch(java.lang.RuntimeException e0){
             this.handleException(e0);
             goto label_001b ;
          }
       }
       return;
    }
    public void onScrollEvent(boolean p0,String p1){
       if (PatchProxy.isSupport(ReactContext.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, ReactContext.class, "28")) {
          return;
       }
       Iterator iterator = this.mScrollEventListeners.iterator();
       while (iterator.hasNext()) {
          try{
             ScrollEventListener scrollEventL = iterator.next();
             if (p0) {
                scrollEventL.onScrollBegin(p1);
             }else {
                scrollEventL.onScrollEnd(p1);
             }
          }catch(java.lang.RuntimeException e1){
             this.handleException(e1);
             goto label_001d ;
          }
       }
       return;
    }
    public void onWindowFocusChange(boolean p0){
       if (PatchProxy.isSupport(ReactContext.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ReactContext.class, "27")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       Iterator iterator = this.mWindowFocusEventListeners.iterator();
       while (iterator.hasNext()) {
          WindowFocusChangeListener windowFocusC = iterator.next();
          try{
             windowFocusC.onWindowFocusChange(p0);
          }catch(java.lang.RuntimeException e1){
             this.handleException(e1);
             goto label_0020 ;
          }
       }
       return;
    }
    public void removeActivityEventListener(ActivityEventListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext.class, "14")) {
          return;
       }
       this.mActivityEventListeners.remove(p0);
       return;
    }
    public void removeInputEventListener(InputEventListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext.class, "20")) {
          return;
       }
       this.mInputEventListeners.remove(p0);
       return;
    }
    public void removeLifecycleEventListener(LifecycleEventListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext.class, "12")) {
          return;
       }
       this.mLifecycleEventListeners.remove(p0);
       return;
    }
    public void removeScrollEventListener(ScrollEventListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext.class, "18")) {
          return;
       }
       this.mScrollEventListeners.remove(p0);
       return;
    }
    public void removeWindowFocusChangeListener(WindowFocusChangeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext.class, "16")) {
          return;
       }
       this.mWindowFocusEventListeners.remove(p0);
       return;
    }
    public void resetPerfStats(){
       if (PatchProxy.applyVoid(null, this, ReactContext.class, "3")) {
          return;
       }
       ReactContext tmNativeModu = this.mNativeModulesMessageQueueThread;
       if (tmNativeModu != null) {
          tmNativeModu.resetPerfStats();
       }
       tmNativeModu = this.mJSMessageQueueThread;
       if (tmNativeModu != null) {
          tmNativeModu.resetPerfStats();
       }
       return;
    }
    public void runOnJSQueueThread(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext.class, "39")) {
          return;
       }
       ReactContext tmJSMessageQ = this.mJSMessageQueueThread;
       a.c(tmJSMessageQ);
       tmJSMessageQ.runOnQueue(p0);
       return;
    }
    public void runOnNativeModulesQueueThread(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext.class, "36")) {
          return;
       }
       ReactContext tmNativeModu = this.mNativeModulesMessageQueueThread;
       a.c(tmNativeModu);
       tmNativeModu.runOnQueue(p0);
       return;
    }
    public void runOnUiQueueThread(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext.class, "32")) {
          return;
       }
       ReactContext tmUiMessageQ = this.mUiMessageQueueThread;
       a.c(tmUiMessageQ);
       tmUiMessageQ.runOnQueue(p0);
       return;
    }
    public final void sanityCheck(){
       if (PatchProxy.applyVoid(null, this, ReactContext.class, "9")) {
          return;
       }
       if (e.m) {
          ReactContext tmCatalystIn = this.mCatalystInstance;
          if (tmCatalystIn != null && tmCatalystIn.finishDestroyed()) {
             this.handleCaughtException(new ReactNoCrashSoftException("getCatalystInstance after destroyed"));
          }
       }
       return;
    }
    public void setNativeModuleCallExceptionHandler(NativeModuleCallExceptionHandler p0){
       this.mNativeModuleCallExceptionHandler = p0;
    }
    public boolean startActivityForResult(Intent p0,int p1,Bundle p2){
       Activity obj;
       if (PatchProxy.isSupport(ReactContext.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactContext.class, "44");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.getCurrentActivity();
       a.c(obj);
       obj.startActivityForResult(p0, p1, p2);
       return true;
    }
}
