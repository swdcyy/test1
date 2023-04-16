package com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactBridge;
import java.util.concurrent.atomic.AtomicInteger;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.modules.diskcache.MetaDiskCache;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.ArrayList;
import com.facebook.react.bridge.JSIModuleRegistry;
import java.util.concurrent.atomic.AtomicBoolean;
import hg.a;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CatalystInstanceImpl$NativeExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutor$Type;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import java.util.concurrent.CopyOnWriteArrayList;
import com.facebook.react.bridge.JavaScriptModuleRegistry;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.CatalystInstanceImpl$JSProfilerTraceListener;
import com.facebook.react.bridge.CatalystInstanceImpl$BridgeCallback;
import java.util.Collection;
import com.facebook.react.bridge.ReactCallback;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.CatalystInstanceImpl$1;
import com.facebook.react.bridge.MemoryStatsCallback;
import java.util.HashMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.lang.Long;
import com.facebook.react.bridge.SharedResourceAllocator;
import java.util.Map;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import rd.f;
import android.os.SystemClock;
import cb.a;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.BridgeInvokeListener;
import java.util.List;
import com.facebook.react.bridge.CatalystInstanceImpl$PendingJSCall;
import yd.e;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.CatalystInstanceImpl$6;
import java.lang.Runnable;
import com.facebook.react.bridge.CatalystInstance$DestroyFinishedCallback;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.uimanager.f;
import com.facebook.react.uimanager.j;
import java.util.Objects;
import com.facebook.react.uimanager.c;
import com.facebook.react.uimanager.RenderProfileQueue;
import com.facebook.react.bridge.CatalystInstanceImpl$2;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.CatalystInstanceImpl$3;
import java.lang.System;
import com.facebook.react.bridge.BridgeHookInvoked;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.JSIModule;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.JavaScriptModule;
import td.c;
import vd.d;
import fe.a;
import java.lang.annotation.Annotation;
import java.lang.IllegalArgumentException;
import com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Iterator;
import od.a;
import td.d;
import java.lang.Integer;
import com.facebook.react.bridge.MemoryPressure;
import java.lang.Enum;
import td.b;
import java.lang.Boolean;
import com.facebook.react.bridge.CatalystInstanceImpl$5;
import com.facebook.react.bridge.CatalystInstanceImpl$4;
import com.facebook.react.bridge.NativeArrayInterface;
import android.content.res.AssetManager;
import java.lang.Exception;
import java.lang.Throwable;
import com.facebook.react.bridge.CatalystInstanceImpl$7;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import com.facebook.react.bridge.NativeModuleDidNotFindHandler;

public class CatalystInstanceImpl implements CatalystInstance	// class@0011b3
{
    public boolean enableMultiReactRootViewDispatcherFilter;
    public boolean mAcceptCalls;
    public BridgeHookInvoked mBridgeHookInvoked;
    public final CopyOnWriteArrayList mBridgeIdleListeners;
    public final CopyOnWriteArrayList mBridgeInvokeListeners;
    public CatalystInstance$DestroyFinishedCallback mDestroyFinishedCallback;
    public boolean mDestroyed;
    public NativeModuleDidNotFindHandler mDidNotFindHandler;
    public boolean mFinishDestroyed;
    public int mGroupId;
    public AtomicBoolean mHasNativeError;
    public final HybridData mHybridData;
    public boolean mInitialized;
    public boolean mJSBundleHasLoaded;
    public final JSBundleLoader mJSBundleLoader;
    public final ArrayList mJSCallsPendingInit;
    public final Object mJSCallsPendingInitLock;
    public final JSIModuleRegistry mJSIModuleRegistry;
    public final JavaScriptModuleRegistry mJSModuleRegistry;
    public boolean mJSThreadDestructionComplete;
    public JavaScriptContextHolder mJavaScriptContextHolder;
    public JavaScriptExecutor mJsExecutor;
    public final String mJsPendingCallsTitleForTrace;
    public long mLastGCTimeStamp;
    public final MetaDiskCache mMetaDiskCache;
    public final NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    public final NativeModuleRegistry mNativeModuleRegistry;
    public final MessageQueueThread mNativeModulesQueueThread;
    public boolean mNativeModulesThreadDestructionComplete;
    public final AtomicInteger mPendingJSCalls;
    public final ReactQueueConfigurationImpl mReactQueueConfiguration;
    public boolean mReportLoadMonitor;
    public String mSourceFilePath;
    public String mSourceURL;
    public final TraceListener mTraceListener;
    public Object mTrackableObject;
    public JSIModule mTurboModuleManagerJSIModule;
    public TurboModuleRegistry mTurboModuleRegistry;
    public int mUniqueId;
    public boolean mUseDeveloperSupport;
    public static final AtomicInteger sNextInstanceIdForTrace;

    static {
       ReactBridge.staticInit();
       CatalystInstanceImpl.sNextInstanceIdForTrace = new AtomicInteger(1);
    }
    public void CatalystInstanceImpl(ReactQueueConfigurationSpec p0,JavaScriptExecutor p1,NativeModuleRegistry p2,JSBundleLoader p3,MetaDiskCache p4,NativeModuleCallExceptionHandler p5,int p6,int p7,boolean p8){
       CatalystInstanceImpl uCatalystIns = this;
       super();
       uCatalystIns.mPendingJSCalls = new AtomicInteger(0);
       uCatalystIns.mJsPendingCallsTitleForTrace = "pending_js_calls_instance"+CatalystInstanceImpl.sNextInstanceIdForTrace.getAndIncrement();
       uCatalystIns.mDestroyed = false;
       uCatalystIns.mFinishDestroyed = false;
       uCatalystIns.mNativeModulesThreadDestructionComplete = false;
       uCatalystIns.mJSThreadDestructionComplete = false;
       uCatalystIns.mJSCallsPendingInit = new ArrayList();
       uCatalystIns.mJSCallsPendingInitLock = new Object();
       uCatalystIns.mJSIModuleRegistry = new JSIModuleRegistry();
       uCatalystIns.mInitialized = false;
       uCatalystIns.mAcceptCalls = false;
       uCatalystIns.mSourceFilePath = "";
       uCatalystIns.mTurboModuleRegistry = null;
       uCatalystIns.mTurboModuleManagerJSIModule = null;
       uCatalystIns.mLastGCTimeStamp = 0;
       uCatalystIns.mTrackableObject = null;
       uCatalystIns.mHasNativeError = new AtomicBoolean(0);
       uCatalystIns.enableMultiReactRootViewDispatcherFilter = false;
       a.a(0, "createCatalystInstanceImpl");
       uCatalystIns.mUniqueId = p6;
       uCatalystIns.mGroupId = p7;
       uCatalystIns.mHybridData = CatalystInstanceImpl.initHybrid();
       ReactQueueConfigurationImpl reactQueueCo = ReactQueueConfigurationImpl.create(p0, new CatalystInstanceImpl$NativeExceptionHandler(this), uCatalystIns.mGroupId, p1.getType());
       uCatalystIns.mReactQueueConfiguration = reactQueueCo;
       uCatalystIns.mBridgeIdleListeners = new CopyOnWriteArrayList();
       uCatalystIns.mBridgeInvokeListeners = new CopyOnWriteArrayList();
       uCatalystIns.mNativeModuleRegistry = p2;
       uCatalystIns.mJSModuleRegistry = new JavaScriptModuleRegistry();
       uCatalystIns.mJSBundleLoader = p3;
       uCatalystIns.mNativeModuleCallExceptionHandler = p5;
       MessageQueueThread nativeModule = reactQueueCo.getNativeModulesQueueThread();
       uCatalystIns.mNativeModulesQueueThread = nativeModule;
       uCatalystIns.mTraceListener = new CatalystInstanceImpl$JSProfilerTraceListener(this);
       uCatalystIns.mMetaDiskCache = p4;
       a.c(0, "createCatalystInstanceImpl");
       uCatalystIns.mUseDeveloperSupport = p8;
       a.a(0, "initializeCxxBridge");
       MessageQueueThread jSQueueThrea = reactQueueCo.getJSQueueThread();
       this.initializeBridge(new CatalystInstanceImpl$BridgeCallback(this, p1.getType(), uCatalystIns.mGroupId), p1, jSQueueThrea, nativeModule, p2.getJavaModules(this), p2.getCxxModules(), uCatalystIns.mUniqueId);
       a.c(0, "initializeCxxBridge");
       uCatalystIns.mJavaScriptContextHolder = super(this.getJavaScriptContext());
       uCatalystIns.mJsExecutor = p1;
    }
    public void CatalystInstanceImpl(ReactQueueConfigurationSpec p0,JavaScriptExecutor p1,NativeModuleRegistry p2,JSBundleLoader p3,MetaDiskCache p4,NativeModuleCallExceptionHandler p5,int p6,int p7,boolean p8,CatalystInstanceImpl$1 p9){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }
    public static void a(CatalystInstanceImpl p0,int p1){
       p0.lambda$handleMemoryPressure$0(p1);
    }
    public static void b(CatalystInstanceImpl p0,MemoryStatsCallback p1){
       p0.lambda$getMemoryStats$1(p1);
    }
    public static void c(CatalystInstanceImpl p0,MemoryStatsCallback p1){
       p0.lambda$getUIMemoryStats$2(p1);
    }
    public static native HybridData initHybrid();
    private void lambda$getMemoryStats$1(MemoryStatsCallback p0){
       HashMap hashMap = new HashMap();
       ReadableNativeMap readableNati = this.jniGetMemoryStats();
       ReadableMapKeySetIterator readableMapK = readableNati.keySetIterator();
       while (readableMapK.hasNextKey()) {
          String str = readableMapK.nextKey();
          hashMap.put(str, Long.valueOf((long)readableNati.getInt(str)));
       }
       hashMap.put("SharedRuntimeCount", Long.valueOf((long)SharedResourceAllocator.getInstance().getSharedCount(this.mGroupId, this.getJsExecutor().getType())));
       p0.onMemoryStatsCollected(hashMap);
       return;
    }
    private void lambda$getUIMemoryStats$2(MemoryStatsCallback p0){
       this.getNativeModule(UIManagerModule.class).getUIMemoryStats(p0);
    }
    private void lambda$handleMemoryPressure$0(int p0){
       if (this.mDestroyed == null) {
          this.jniHandleMemoryPressure(f.b(p0));
          this.mLastGCTimeStamp = SystemClock.elapsedRealtime();
          a.k("ReactNative", "Finish handleMemoryPressure "+this+" level: "+p0);
       }
       return;
    }
    public void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CatalystInstanceImpl.class, "27")) {
          return;
       }
       this.mBridgeIdleListeners.add(p0);
       return;
    }
    public void addBridgeInvokeListener(BridgeInvokeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CatalystInstanceImpl.class, "29")) {
          return;
       }
       this.mBridgeInvokeListeners.add(p0);
       return;
    }
    public void addJSIModules(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CatalystInstanceImpl.class, "31")) {
          return;
       }
       this.mJSIModuleRegistry.registerModules(p0);
       return;
    }
    public void callFunction(CatalystInstanceImpl$PendingJSCall p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CatalystInstanceImpl.class, "10")) {
          return;
       }
       if (e.n) {
          a.x("ReactNativeDestroy", this+":"+this.mDestroyed+":"+this.mAcceptCalls+" callFunction "+p0.toString());
       }
       if (this.mDestroyed != null) {
          a.x("ReactNative", "Calling JS function after bridge has been destroyed: "+p0.toString());
          return;
       }else if(this.mAcceptCalls == null){
          CatalystInstanceImpl tmJSCallsPen = this.mJSCallsPendingInitLock;
          _monitor_enter(tmJSCallsPen);
          if (this.mAcceptCalls == null) {
             this.mJSCallsPendingInit.add(p0);
             _monitor_exit(tmJSCallsPen);
             return;
          }else {
             _monitor_exit(tmJSCallsPen);
          }
       }
       p0.call(this);
       return;
    }
    public void callFunction(String p0,String p1,NativeArray p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, CatalystInstanceImpl.class, "9")) {
          return;
       }
       this.callFunction(new CatalystInstanceImpl$PendingJSCall(p0, p1, p2));
       return;
    }
    public void decrementPendingJSCalls(){
       if (PatchProxy.applyVoid(null, this, CatalystInstanceImpl.class, "34")) {
          return;
       }
       CatalystInstanceImpl uCatalystIns = (!this.mPendingJSCalls.decrementAndGet())? 1: null;
       if (uCatalystIns && !this.mBridgeIdleListeners.isEmpty()) {
          this.mNativeModulesQueueThread.runOnQueue(new CatalystInstanceImpl$6(this));
       }
       return;
    }
    public void destroy(CatalystInstance$DestroyFinishedCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CatalystInstanceImpl.class, "13")) {
          return;
       }
       a.x("ReactNative", "CatalystInstanceImpl.destroy\(\) start, instanceKey: "+this.hashCode());
       UiThreadUtil.assertOnUiThread();
       if (e.I) {
          this.destroyV2(p0);
       }else {
          this.destroyV1(p0);
       }
       return;
    }
    public void destroyV1(CatalystInstance$DestroyFinishedCallback p0){
       j a;
       if (PatchProxy.applyVoidOneRefs(p0, this, CatalystInstanceImpl.class, "14")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       if (this.mDestroyed != null) {
          return;
       }
       a.x("ReactNativeDestroy", "Catalyst start destroy "+this.hashCode());
       ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_START, this.hashCode());
       this.mDestroyed = true;
       if (e.r) {
          a = this.getNativeModule(UIManagerModule.class).getUIImplementation().k().A;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoid(null, a, c.class, "26")) {
             c f = a.f;
             if (f != null) {
                f.e = 0;
             }
          }
       }
       this.mNativeModulesQueueThread.runOnQueue(new CatalystInstanceImpl$1(this, p0));
       return;
    }
    public void destroyV2(CatalystInstance$DestroyFinishedCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CatalystInstanceImpl.class, "15")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       if (this.mDestroyed != null) {
          return;
       }
       ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_START, this.hashCode());
       this.mDestroyed = true;
       this.mNativeModulesThreadDestructionComplete = false;
       this.mJSThreadDestructionComplete = false;
       this.mNativeModulesQueueThread.runOnQueue(new CatalystInstanceImpl$2(this));
       this.getReactQueueConfiguration().getJSQueueThread().runOnQueue(new CatalystInstanceImpl$3(this));
       long l = System.currentTimeMillis();
       while (this.mNativeModulesThreadDestructionComplete == null || this.mJSThreadDestructionComplete == null) {
          long l1 = System.currentTimeMillis() - l;
          if (l1 - 100 > 0) {
             break ;
          }
       }
       this.mJavaScriptContextHolder.clear();
       this.mHybridData.a();
       this.getReactQueueConfiguration().destroy();
       ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_END, this.hashCode());
       this.mFinishDestroyed = true;
       if (p0 != null) {
          p0.onDestroyFinished();
       }
       return;
    }
    public boolean enableReportLoadMonitor(){
       return this.mReportLoadMonitor;
    }
    public void extendNativeModules(NativeModuleRegistry p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CatalystInstanceImpl.class, "1")) {
          return;
       }
       this.mNativeModuleRegistry.registerModules(p0);
       this.jniExtendNativeModules(p0.getJavaModules(this), p0.getCxxModules());
       return;
    }
    public boolean finishDestroyed(){
       return this.mFinishDestroyed;
    }
    public BridgeHookInvoked getBridgeHookInvoked(){
       return this.mBridgeHookInvoked;
    }
    public List getBridgeInvokeListeners(){
       return this.mBridgeInvokeListeners;
    }
    public int getGroupId(){
       return this.mGroupId;
    }
    public native CallInvokerHolderImpl getJSCallInvokerHolder();
    public CallInvokerHolder getJSCallInvokerHolder(){
       return this.getJSCallInvokerHolder();
    }
    public JSIModule getJSIModule(JSIModuleType p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CatalystInstanceImpl.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mJSIModuleRegistry.getModule(p0);
    }
    public JavaScriptModule getJSModule(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CatalystInstanceImpl.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mJSModuleRegistry.getJavaScriptModule(this, p0);
    }
    public native final long getJavaScriptContext();
    public JavaScriptContextHolder getJavaScriptContextHolder(){
       return this.mJavaScriptContextHolder;
    }
    public JavaScriptExecutor getJsExecutor(){
       return this.mJsExecutor;
    }
    public void getMemoryStats(MemoryStatsCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CatalystInstanceImpl.class, "25")) {
          return;
       }
       if (this.mDestroyed == null) {
          this.getReactQueueConfiguration().getJSQueueThread().runOnQueue(new c(this, p0));
       }else {
          p0.onMemoryStatsCollected(d.b());
       }
       return;
    }
    public boolean getMultiReactRootViewDispatcherFilter(){
       return this.enableMultiReactRootViewDispatcherFilter;
    }
    public final String getNameFromAnnotation(Class p0){
       a obj = PatchProxy.applyOneRefs(p0, this, CatalystInstanceImpl.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getAnnotation(a.class);
       if (obj != null) {
          return obj.name();
       }
       throw new IllegalArgumentException("Could not find @ReactModule annotation in "+p0.getCanonicalName());
    }
    public native CallInvokerHolderImpl getNativeCallInvokerHolder();
    public CallInvokerHolder getNativeCallInvokerHolder(){
       return this.getNativeCallInvokerHolder();
    }
    public NativeModule getNativeModule(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CatalystInstanceImpl.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getNativeModule(this.getNameFromAnnotation(p0));
    }
    public NativeModule getNativeModule(String p0){
       TurboModule obj = PatchProxy.applyOneRefs(p0, this, CatalystInstanceImpl.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e.D && (e.O && p0.equals("UIManager"))) {
          p0 = "UIManagerTurbo";
       }
    label_0021 :
       if (this.getTurboModuleRegistry() != null) {
          obj = this.getTurboModuleRegistry().a(p0);
          if (obj != null) {
             return obj;
          }
       }
       return this.mNativeModuleRegistry.getModule(p0);
    }
    public Collection getNativeModules(){
       ArrayList obj = PatchProxy.apply(null, this, CatalystInstanceImpl.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.addAll(this.mNativeModuleRegistry.getAllModules());
       if (this.getTurboModuleRegistry() != null) {
          Iterator iterator = this.getTurboModuleRegistry().d().iterator();
          while (iterator.hasNext()) {
             obj.add(iterator.next());
          }
       }
       return obj;
    }
    public ReactQueueConfiguration getReactQueueConfiguration(){
       return this.mReactQueueConfiguration;
    }
    public String getSourceFilePath(){
       return this.mSourceFilePath;
    }
    public String getSourceURL(){
       return this.mSourceURL;
    }
    public TurboModuleRegistry getTurboModuleRegistry(){
       Object[] objArray = null;
       CatalystInstanceImpl obj = PatchProxy.apply(objArray, this, CatalystInstanceImpl.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!e.D) {
          return objArray;
       }
       obj = this.mTurboModuleRegistry;
       a.d(obj, "TurboModules are enabled, but mTurboModuleRegistry hasn\'t been set.");
       return obj;
    }
    public void getUIMemoryStats(MemoryStatsCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CatalystInstanceImpl.class, "26")) {
          return;
       }
       if (this.mDestroyed == null && e.v) {
          this.getReactQueueConfiguration().getNativeModulesQueueThread().runOnQueue(new d(this, p0));
       }else {
          p0.onMemoryStatsCollected(d.b());
       }
       return;
    }
    public int getUniqueId(){
       return this.mUniqueId;
    }
    public void handleMemoryPressure(int p0){
       CatalystInstanceImpl uCatalystIns = CatalystInstanceImpl.class;
       if (PatchProxy.isSupport(uCatalystIns) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uCatalystIns, "24")) {
          return;
       }
       if (this.mDestroyed == null && e.w) {
          long l = (f.b(p0) > MemoryPressure.NONE.ordinal())? 1: 0;
          if (l) {
             l = SystemClock.elapsedRealtime();
             if (this.mLastGCTimeStamp - Long.MAX_VALUE && (l - this.mLastGCTimeStamp) - 2000 >= 0) {
                this.mLastGCTimeStamp = Long.MAX_VALUE;
                this.getReactQueueConfiguration().getJSQueueThread().runOnQueue(new b(this, p0));
             }
          }
       }
    label_005a :
       return;
    }
    public boolean hasNativeError(){
       Object obj = PatchProxy.apply(null, this, CatalystInstanceImpl.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mHasNativeError.get();
    }
    public boolean hasNativeModule(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CatalystInstanceImpl.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String nameFromAnno = this.getNameFromAnnotation(p0);
       boolean b = (this.getTurboModuleRegistry() != null && this.getTurboModuleRegistry().b(nameFromAnno))? true: this.mNativeModuleRegistry.hasModule(nameFromAnno);
       return b;
    }
    public boolean hasRunJSBundle(){
       CatalystInstanceImpl tmJSCallsPen = this.mJSCallsPendingInitLock;
       _monitor_enter(tmJSCallsPen);
       boolean b = (this.mJSBundleHasLoaded != null && this.mAcceptCalls != null)? true: false;
       _monitor_exit(tmJSCallsPen);
       return b;
    }
    public void incrementPendingJSCalls(){
       if (PatchProxy.applyVoid(null, this, CatalystInstanceImpl.class, "33")) {
          return;
       }
       CatalystInstanceImpl uCatalystIns = (!this.mPendingJSCalls.getAndIncrement())? 1: null;
       if (uCatalystIns && !this.mBridgeIdleListeners.isEmpty()) {
          this.mNativeModulesQueueThread.runOnQueue(new CatalystInstanceImpl$5(this));
       }
       return;
    }
    public void initialize(){
       if (PatchProxy.applyVoid(null, this, CatalystInstanceImpl.class, "16")) {
          return;
       }
       a.b((this.mInitialized ^ 1), "This catalyst instance has already been initialized");
       a.b(this.mAcceptCalls, "RunJSBundle hasn\'t completed.");
       this.mInitialized = true;
       this.mNativeModulesQueueThread.runOnQueue(new CatalystInstanceImpl$4(this));
       return;
    }
    public native final void initializeBridge(ReactCallback p0,JavaScriptExecutor p1,MessageQueueThread p2,MessageQueueThread p3,Collection p4,Collection p5,int p6);
    public void invokeCallback(int p0,NativeArrayInterface p1){
       CatalystInstanceImpl uCatalystIns = CatalystInstanceImpl.class;
       if (PatchProxy.isSupport(uCatalystIns) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uCatalystIns, "11")) {
          return;
       }
       if (this.mDestroyed != null) {
          a.x("ReactNative", "Invoking JS callback after bridge has been destroyed.");
          return;
       }else {
          this.jniCallJSCallback(p0, p1, false, false);
          return;
       }
    }
    public void invokeCallback(Boolean p0,int p1,NativeArrayInterface p2){
       if (PatchProxy.isSupport(CatalystInstanceImpl.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, CatalystInstanceImpl.class, "12")) {
          return;
       }
       if (this.mDestroyed != null) {
          a.x("ReactNative", "Invoking JS callback after bridge has been destroyed.");
          return;
       }else {
          this.jniCallJSCallback(p1, p2, true, p0.booleanValue());
          return;
       }
    }
    public boolean isDestroyed(){
       return this.mDestroyed;
    }
    public native final void jniCallJSCallback(int p0,NativeArray p1,boolean p2,boolean p3);
    public native void jniCallJSFunction(String p0,String p1,NativeArray p2);
    public native final void jniExtendNativeModules(Collection p0,Collection p1);
    public native final ReadableNativeMap jniGetMemoryStats();
    public native final void jniHandleMemoryPressure(int p0);
    public native final void jniLoadScriptFromAssets(AssetManager p0,String p1,String p2,boolean p3);
    public native final void jniLoadScriptFromAssetsWithKey(AssetManager p0,String p1,boolean p2,String p3);
    public native final void jniLoadScriptFromFile(String p0,String p1,boolean p2);
    public native final void jniLoadScriptFromFileWithKey(String p0,String p1,boolean p2,String p3);
    public native final void jniRegisterSegment(int p0,String p1);
    public native final void jniSetSourceURL(String p0);
    public void loadScriptFromAssets(AssetManager p0,String p1,String p2,boolean p3){
       if (PatchProxy.isSupport(CatalystInstanceImpl.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, CatalystInstanceImpl.class, "4")) {
          return;
       }
       this.mSourceURL = p2;
       this.jniLoadScriptFromAssets(p0, p1, p2, p3);
       return;
    }
    public void loadScriptFromAssets(AssetManager p0,String p1,boolean p2,String p3){
       if (PatchProxy.isSupport(CatalystInstanceImpl.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, CatalystInstanceImpl.class, "5")) {
          return;
       }
       this.jniLoadScriptFromAssetsWithKey(p0, p1, p2, p3);
       return;
    }
    public void loadScriptFromFile(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(CatalystInstanceImpl.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, CatalystInstanceImpl.class, "6")) {
          return;
       }
       this.mSourceFilePath = (this.mUseDeveloperSupport != null)? p1: p0;
       this.mSourceURL = p1;
       this.jniLoadScriptFromFile(p0, p1, p2);
       return;
    }
    public void loadScriptFromFile(String p0,String p1,boolean p2,String p3){
       if (PatchProxy.isSupport(CatalystInstanceImpl.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, CatalystInstanceImpl.class, "7")) {
          return;
       }
       this.jniLoadScriptFromFileWithKey(p0, p1, p2, p3);
       return;
    }
    public void onNativeException(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CatalystInstanceImpl.class, "35")) {
          return;
       }
       this.mHasNativeError.set(true);
       int i = this.mDestroyed ^ true;
       a.y("ReactNative", "onNativeException, instanceKey: "+this.hashCode()+", isCatalystInstanceAlive: "+i, p0);
       if (i) {
          this.mNativeModuleCallExceptionHandler.handleException(p0);
       }
       this.mReactQueueConfiguration.getUIQueueThread().runOnQueue(new CatalystInstanceImpl$7(this));
       return;
    }
    public void registerSegment(int p0,String p1){
       CatalystInstanceImpl uCatalystIns = CatalystInstanceImpl.class;
       if (PatchProxy.isSupport(uCatalystIns) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uCatalystIns, "3")) {
          return;
       }
       this.jniRegisterSegment(p0, p1);
       return;
    }
    public void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CatalystInstanceImpl.class, "28")) {
          return;
       }
       this.mBridgeIdleListeners.remove(p0);
       return;
    }
    public void removeBridgeInvokeListener(BridgeInvokeListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CatalystInstanceImpl.class, "30")) {
          return;
       }
       this.mBridgeInvokeListeners.remove(p0);
       return;
    }
    public void runJSBundle(){
       if (PatchProxy.applyVoid(null, this, CatalystInstanceImpl.class, "8")) {
          return;
       }
       a.b((this.mJSBundleHasLoaded ^ 1), "JS bundle was already loaded!");
       this.mJSBundleLoader.loadScript(this);
       CatalystInstanceImpl tmJSCallsPen = this.mJSCallsPendingInitLock;
       _monitor_enter(tmJSCallsPen);
       this.mAcceptCalls = true;
       Iterator iterator = this.mJSCallsPendingInit.iterator();
       while (iterator.hasNext()) {
          iterator.next().call(this);
       }
       this.mJSCallsPendingInit.clear();
       this.mJSBundleHasLoaded = true;
       _monitor_exit(tmJSCallsPen);
       return;
    }
    public void setBridgeHookInvoked(BridgeHookInvoked p0){
       this.mBridgeHookInvoked = p0;
    }
    public void setDestroyFinishedCallback(CatalystInstance$DestroyFinishedCallback p0){
       this.mDestroyFinishedCallback = p0;
    }
    public void setDidNotFindHandler(NativeModuleDidNotFindHandler p0){
       this.mDidNotFindHandler = p0;
    }
    public native void setGlobalVariable(String p0,String p1);
    public void setMultiReactRootViewDispatcherFilter(boolean p0){
       this.enableMultiReactRootViewDispatcherFilter = p0;
    }
    public void setReportLoadMonitor(boolean p0){
       this.mReportLoadMonitor = p0;
    }
    public void setSourceURLs(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CatalystInstanceImpl.class, "2")) {
          return;
       }
       this.mSourceFilePath = p0;
       this.mSourceURL = p0;
       this.jniSetSourceURL(p1);
       return;
    }
    public void setTurboModuleManager(JSIModule p0){
       this.mTurboModuleRegistry = p0;
       this.mTurboModuleManagerJSIModule = p0;
    }
    public boolean useDeveloperSupport(){
       return this.mUseDeveloperSupport;
    }
}
