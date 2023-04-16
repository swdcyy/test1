package com.facebook.react.a;
import android.content.Context;
import android.app.Activity;
import je.a;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.JSBundleLoader;
import java.lang.String;
import java.util.List;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.uimanager.g;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.modules.diskcache.e;
import com.facebook.react.devsupport.RedBoxHandler;
import ae.b;
import com.facebook.react.bridge.DynamicRegisterHandler;
import com.facebook.react.bridge.JSIModulePackage;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Boolean;
import rd.a;
import ze.c;
import yd.e;
import hg.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zd.c;
import rd.v;
import zd.a;
import java.lang.Integer;
import java.lang.reflect.Constructor;
import ae.e;
import rd.f;
import mb.b;
import mb.c;
import nb.a;
import lb.a;
import rd.b;
import com.facebook.react.a$c;
import ukd.a;
import wd.a;
import rd.h;
import java.util.Collection;
import rd.p;
import rd.q;
import com.facebook.react.modules.core.ReactChoreographer;
import java.lang.RuntimeException;
import java.lang.Throwable;
import rd.z;
import com.facebook.soloader.SoLoader;
import android.content.Intent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.bridge.NativeModule;
import cb.a;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.util.Set;
import ze.v;
import com.facebook.react.ReactRootView;
import javax.inject.Provider;
import od.a;
import java.lang.ref.WeakReference;
import android.view.Window;
import android.view.View;
import a2.i0;
import rd.w;
import android.view.View$OnAttachStateChangeListener;
import android.net.Uri;
import rd.c0;
import rd.g;
import hg.b$b;
import hg.b;
import rd.e0;
import rd.d;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Iterable;
import rd.i0;
import ge.b;
import rd.h0;
import rd.a0;
import rd.d0;
import com.facebook.react.bridge.ModuleHolder;
import java.lang.IllegalStateException;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactMarkerConstants;
import java.lang.Enum;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.a$j;
import me.a;
import com.facebook.react.a$e;
import ae.g;
import com.facebook.react.a$k;
import java.lang.Thread;
import com.facebook.react.a$f;
import java.lang.ThreadGroup;
import java.lang.Runnable;
import com.facebook.react.a$g;
import com.yxcorp.utility.AsyncTask;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.a$h;
import com.facebook.react.a$i;
import com.facebook.react.a$a;
import com.facebook.react.transientpage.TransientBundleLoaderSpec;
import xe.a;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import com.facebook.react.bridge.MemoryPressureListener;
import rd.t;
import com.facebook.react.bridge.UIManager;
import ze.t0;
import android.os.Bundle;
import android.view.ViewGroup;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.a$b;
import com.facebook.react.bridge.JSIModuleSpec;
import com.facebook.react.a$d;
import com.facebook.react.bridge.JavaScriptExecutor;
import java.io.File;
import ua.a;
import com.facebook.react.modules.diskcache.MetaDiskCache;
import com.facebook.react.bridge.CatalystInstanceImpl$Builder;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.bridge.CatalystInstanceImpl;
import rd.o;
import com.facebook.react.bridge.CatalystInstance$DestroyFinishedCallback;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import rd.r;
import com.facebook.react.bridge.NativeModuleDidNotFindHandler;
import com.facebook.base.tracing.TracingManager;
import com.facebook.react.uimanager.ViewManager;
import rd.j0;
import rd.e;
import java.util.Objects;
import android.content.ComponentCallbacks;
import rd.s;
import qf.c;
import java.util.Map$Entry;
import eb.b;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.react.modules.fabric.ReactFabric;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.modules.appregistry.AppRegistry;
import java.lang.Exception;

public class a	// class@00117e
{
    public boolean A;
    public int B;
    public int C;
    public MetaDiskCache D;
    public Object E;
    public Set a;
    public LifecycleState b;
    public a$j c;
    public Thread d;
    public final JavaScriptExecutorFactory e;
    public final DynamicRegisterHandler f;
    public final JSBundleLoader g;
    public final String h;
    public final List i;
    public final e j;
    public final boolean k;
    public final NotThreadSafeBridgeIdleDebugListener l;
    public final Object m;
    public ReactContext n;
    public final Context o;
    public a p;
    public Activity q;
    public final Collection r;
    public boolean s;
    public Boolean t;
    public final f u;
    public final NativeModuleCallExceptionHandler v;
    public final e w;
    public final JSIModulePackage x;
    public List y;
    public a z;
    public static final String F = "a";

    public void a(Context p0,Activity p1,a p2,JavaScriptExecutorFactory p3,JSBundleLoader p4,String p5,List p6,boolean p7,NotThreadSafeBridgeIdleDebugListener p8,LifecycleState p9,g p10,NativeModuleCallExceptionHandler p11,e p12,RedBoxHandler p13,boolean p14,b p15,DynamicRegisterHandler p16,int p17,int p18,JSIModulePackage p19,Map p20,int p21){
       a uoa;
       Set set = this;
       Context uContext = p0;
       String str = p5;
       boolean b = p7;
       Object obj = p19;
       super();
       set.a = new CopyOnWriteArraySet();
       set.m = new Object();
       set.r = Collections.synchronizedList(new ArrayList());
       set.s = false;
       set.t = Boolean.FALSE;
       set.z = new a();
       set.A = false;
       set.D = null;
       set.E = null;
       set.B = this.hashCode();
       set.C = p21;
       a.v(p0);
       c.g(p0);
       if (b) {
          e.D = false;
          e.O = false;
       }
       set.o = uContext;
       set.q = p1;
       set.p = p2;
       set.e = p3;
       set.g = p4;
       set.h = str;
       ArrayList uArrayList = new ArrayList();
       set.i = uArrayList;
       set.k = b;
       set.f = p16;
       long l = 0;
       a.a(l, "ReactInstanceManager.initDevSupportManager");
       v ov = PatchProxy.apply(null, set, a.class, "4");
       if (ov != PatchProxyResult.class) {
       }else {
          ov = new v(set);
       }
       if (!b) {
          uoa = new a();
       }else {
          try{
             Class[] uClassArray = new Class[]{Context.class,c.class,String.class,Boolean.TYPE,RedBoxHandler.class,b.class,Integer.TYPE,Map.class};
             int i = 1;
             Object[] objArray1 = new Object[]{uContext,ov,str,Boolean.TRUE,p13,p15,Integer.valueOf(p17),p20};
             uoa = Class.forName("com.facebook.react.devsupport.DevSupportManagerImpl").getConstructor(uClassArray).newInstance(objArray1);
          }catch(java.lang.Exception e0){
             throw new RuntimeException("Requested enabled DevSupportManager, but DevSupportManagerImpl class was not found or could not be created", e0);
          }
       }
       a uoa1 = uoa;
       set.j = uoa1;
       a.c(l, "ReactInstanceManager.initDevSupportManager");
       set.l = p8;
       set.b = p9;
       set.u = new f(uContext);
       set.v = p11;
       set.w = p12;
       _monitor_enter(uArrayList);
       c.a().b(a.c, "RNCore: Use Split Packages");
       a uoa2 = uoa1;
       b uob = new b(this, new a$c(set), p10, p14, p18, set.B);
       uArrayList.add(uContext);
       if (b) {
          Object[] objArray = new Object[false];
          uArrayList.add(a.l("com.facebook.react.DebugCorePackage", objArray));
       }
       if (a.a) {
          uArrayList.add(new h());
       }
       uArrayList.addAll(p6);
       _monitor_exit(uArrayList);
       p op = PatchProxy.applyOneRefs(obj, set, a.class, "2");
       if (op != PatchProxyResult.class) {
       }else if(e.D){
          op = (set.x == null)? new p(set): new q(set, obj);
       }else {
          op = obj;
       }
       set.x = op;
       if (!PatchProxy.applyVoid(null, null, ReactChoreographer.class, "1") && ReactChoreographer.g == null) {
          ReactChoreographer.g = new ReactChoreographer();
       }
       if (b) {
          uoa2.n();
       }
       return;
    }
    public static z f(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new z();
    }
    public static void v(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "8")) {
          return;
       }
       SoLoader.a(p0, false);
       return;
    }
    public void A(Activity p0,int p1,int p2,Intent p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, a.class, "26")) {
          return;
       }
       ReactContext reactContext = this.n();
       if (reactContext != null) {
          reactContext.onActivityResult(p0, p1, p2, p3);
       }
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, a.class, "13")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       a tn = this.n;
       if (tn == null || !tn.hasActiveCatalystInstance()) {
          a.x("ReactNative", "Instance detached from instance manager");
          this.w();
       }else {
          tn.getNativeModule(DeviceEventManagerModule.class).emitHardwareBackPressed();
       }
       return;
    }
    public void C(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "20")) {
          return;
       }
       a.x("ReactNative", "onHostDestroy: activity="+this.a(p0)+", instance="+this);
       a tz = this.z;
       tz.d(p0);
       tz.b(p0);
       a tz1 = this.z;
       Activity uActivity = null;
       tz1.b(uActivity);
       if (!(tz1.b.isEmpty() ^ 0x01)) {
          UiThreadUtil.assertOnUiThread();
          tz1 = this.a;
          _monitor_enter(tz1);
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             v ov = iterator.next();
             if (ov instanceof ReactRootView) {
                ov.m();
             }
          }
          _monitor_exit(tz1);
          if (this.k != null) {
             this.j.f(false);
          }
          this.x();
          this.q = uActivity;
          a.x("ReactNative", "onHostDestroy: set current activity to null, instance="+this);
       }
       return;
    }
    public void D(Activity p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "17")) {
          return;
       }
       a.x("ReactNative", "onHostPause: activity="+this.a(p0)+"currentActivity="+this.a(this.q)+", instance="+this);
       if (e.P && this.A != null) {
          a.x("ReactNative", "suppress onHostPause due to has destroyed");
          return;
       }else {
          Activity uActivity = this.z.a();
          this.z.d(p0);
          if (this.q != uActivity) {
             a.x("ReactNative", "Pause an activity that is not the current foreground activity, currentForegroundActivity: "+this.a(uActivity)+" activity: "+this.a(p0)+" mCurrentActivity: "+this.a(this.q));
             return;
          }else if(e.q.get().booleanValue()){
             a.c(this.q);
             boolean b = (p0 == this.q)? true: false;
             a.b(b, "Pausing an activity that is not the current activity, this is incorrect! Current activity: "+this.q.getClass().getSimpleName()+" Paused activity: "+p0.getClass().getSimpleName());
          }
          UiThreadUtil.assertOnUiThread();
          a uoa1 = null;
          this.p = uoa1;
          if (this.k != null) {
             this.j.f(false);
          }
          _monitor_enter(this);
          if (PatchProxy.applyVoid(uoa1, this, uoa, "23")) {
             _monitor_exit(this);
          }else {
             ReactContext reactContext = this.n();
             if (reactContext != null) {
                if (this.b == LifecycleState.BEFORE_CREATE) {
                   reactContext.onHostResume(this.q);
                   reactContext.onHostPause();
                }else if(this.b == LifecycleState.RESUMED){
                   reactContext.onHostPause();
                }
             }
             this.b = LifecycleState.BEFORE_RESUME;
             _monitor_exit(this);
          }
          return;
       }
    }
    public void E(Activity p0,a p1){
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "18")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       a.x("ReactNative", "onHostResume: activity="+this.a(p0)+"currentActivity="+this.a(this.q)+", instance="+this);
       Activity uActivity = this.z.a();
       a tz = this.z;
       Iterator iterator = tz.a.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (iterator.next().get() != p0) {
                continue ;
             }
          }else {
             tz.a.add(new WeakReference(p0));
             iterator = tz.b.iterator();
             do {
                if (iterator.hasNext()) {
                   if (iterator.next().get() != p0) {
                      continue ;
                   }
                }else {
                   tz.b.add(new WeakReference(p0));
                }
             } while (iterator.next().get() == p0);
          }
          if (uActivity != null && uActivity != p0) {
             a.x("ReactNative", "Resume an activity when last foreground activity is not null, lastForegroundActivity: "+this.a(uActivity)+" activity: "+this.a(p0)+" currentActivity: "+this.a(this.q));
             return;
          }else {
             this.p = p1;
             if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "19")) {
                UiThreadUtil.assertOnUiThread();
                this.q = p0;
                if (this.k != null) {
                   View decorView = p0.getWindow().getDecorView();
                   if (!i0.X(decorView)) {
                      decorView.addOnAttachStateChangeListener(new w(this, decorView));
                   }else {
                      this.j.f(true);
                   }
                }
                this.y(false);
                break ;
             }
             break ;
          }
       }
       return;
    }
    public void F(){
       if (PatchProxy.applyVoid(null, this, a.class, "42")) {
          return;
       }
       this.K(this.e, JSBundleLoader.createCachedBundleFromNetworkLoader(this.j.m(), this.j.s()));
       return;
    }
    public void G(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "15")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       ReactContext reactContext = this.n();
       if (reactContext == null) {
          a.x("ReactNative", "Instance detached from instance manager");
       }else {
          String action = p0.getAction();
          Uri data = p0.getData();
          if (data != null && (("android.intent.action.VIEW").equals(action) || ("android.nfc.action.NDEF_DISCOVERED").equals(action))) {
             reactContext.getNativeModule(DeviceEventManagerModule.class).emitNewIntentReceived(data);
          }
          reactContext.onNewIntent(this.q, p0);
       }
       return;
    }
    public void H(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "27")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       ReactContext reactContext = this.n();
       if (reactContext != null) {
          reactContext.onWindowFocusChange(p0);
       }
       return;
    }
    public final void I(c0 p0,g p1){
       Iterable nativeModule;
       g a;
       g b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "61")) {
          return;
       }
       long l = 0;
       b.a(l, "processPackage").d("className", p0.getClass().getSimpleName()).e();
       if (v3 = p0 instanceof e0) {
          p0.b();
       }
       a tB = this.B;
       if (p0 instanceof d) {
          nativeModule = p0.getNativeModuleIterator(p1.a, tB);
       }else if(p0 instanceof i0){
          i0 oi0 = p0;
          nativeModule = new h0(oi0, oi0.d().a().entrySet().iterator(), p1.a, tB);
       }else {
          a = p1.a;
          b = p1.b;
          a.a("ReactNative", p0.getClass().getSimpleName()+" is not a LazyReactPackage, falling back to old version.");
          List list = (p0 instanceof a0)? p0.a(a, b): p0.createNativeModules(a);
          nativeModule = new d0(list, tB);
       }
       Iterator iterator = nativeModule.iterator();
       while (true) {
          if (iterator.hasNext()) {
             ModuleHolder moduleHolder = iterator.next();
             String name = moduleHolder.getName();
             if (p1.c.containsKey(name)) {
                ModuleHolder moduleHolder1 = p1.c.get(name);
                if (moduleHolder.getCanOverrideExistingModule()) {
                   p1.c.remove(moduleHolder1);
                }else {
                   throw new IllegalStateException("Native module "+name+" tried to override "+moduleHolder1.getClassName()+". Check the getPackages\(\) method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true. This error may also be present if the package is present only once in getPackages\(\) but is also automatically added later during build time by autolinking. Try removing the existing entry and rebuild.");
                }
             }
             p1.c.put(name, moduleHolder);
          }else if(v3){
             p0.a();
             break ;
          }
          break ;
       }
       b.b(l, "processPackage").e();
       return;
    }
    public final NativeModuleRegistry J(ReactApplicationContext p0,List p1,boolean p2){
       g obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "60");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new g(p0, this);
       ReactMarker.logMarkerWithUniqueId(ReactMarkerConstants.PROCESS_PACKAGES_START.name(), "", this.B);
       a ti = this.i;
       _monitor_enter(ti);
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          c0 uoc0 = iterator.next();
          if (p2 && this.i.contains(uoc0)) {
             continue ;
          }else {
             a.a(0, "createAndProcessCustomReactPackage");
             if (p2) {
                this.i.add(uoc0);
             }
             this.I(uoc0, obj);
             a.c(0, "createAndProcessCustomReactPackage");
          }
       }
       _monitor_exit(ti);
       ReactMarker.logMarkerWithUniqueId(ReactMarkerConstants.PROCESS_PACKAGES_END.name(), "", this.B);
       ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
       a.a(0, "buildNativeModuleRegistry");
       a.c(0, "buildNativeModuleRegistry");
       ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
       return new NativeModuleRegistry(obj.a, obj.c);
    }
    public final void K(JavaScriptExecutorFactory p0,JSBundleLoader p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "43")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       a$j oj = new a$j(this, p0, p1);
       if (this.d == null) {
          this.O(oj);
       }else {
          this.c = oj;
       }
       return;
    }
    public void L(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       c.a().b(a.c, "RNCore: load from BundleLoader");
       this.K(this.e, this.g);
       return;
    }
    public final void M(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       c.a().b(a.c, "RNCore: recreateReactContextInBackground");
       UiThreadUtil.assertOnUiThread();
       if (this.k != null && this.h != null) {
          a uoa = this.j.y();
          if (this.g == null) {
             this.j.F();
          }else {
             this.j.G(new a$e(this, uoa));
          }
          return;
       }else {
          this.L();
          return;
       }
    }
    public void N(a$k p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "39")) {
          return;
       }
       this.r.remove(p0);
       return;
    }
    public void O(a$j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "44")) {
          return;
       }
       a.a(0, "ReactInstanceManager.runCreateReactContextOnNewThread\(\)");
       UiThreadUtil.assertOnUiThread();
       a ta = this.a;
       _monitor_enter(ta);
       a tm = this.m;
       _monitor_enter(tm);
       if (this.n != null) {
          this.T(this.n);
          this.n = null;
       }
       _monitor_exit(tm);
       _monitor_exit(ta);
       this.d = new Thread(null, new a$f(this, p0), "create_react_context");
       ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
       if (e.X) {
          AsyncTask.d(new a$g(this));
       }else {
          this.d.start();
       }
       a.c(0, "ReactInstanceManager.runCreateReactContextOnNewThread\(\)");
       return;
    }
    public void P(ReactApplicationContext p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "59")) {
          return;
       }
       a.c(p0.getCatalystInstance());
       ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
       a.a(0, "runJSBundle");
       p0.getCatalystInstance().runJSBundle();
       a.c(0, "runJSBundle");
       return;
    }
    public void Q(ReactApplicationContext p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "51")) {
          return;
       }
       ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
       ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
       a.a(0, "setupReactContext");
       a ta = this.a;
       _monitor_enter(ta);
       a tm = this.m;
       _monitor_enter(tm);
       a.c(p0);
       this.n = p0;
       _monitor_exit(tm);
       CatalystInstance catalystInst = p0.getCatalystInstance();
       a.c(catalystInst);
       catalystInst.initialize();
       this.j.h(p0);
       _monitor_enter(this);
       if (PatchProxy.applyVoid(null, this, uoa, "25")) {
          _monitor_exit(this);
       }else if(this.b == LifecycleState.RESUMED){
          this.y(true);
       }
       _monitor_exit(this);
       ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          this.d(iterator.next());
       }
       ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
       _monitor_exit(ta);
       a$k[] okArray = new a$k[this.r.size()];
       UiThreadUtil.runOnUiThread(new a$h(this, this.r.toArray(okArray), p0));
       a.c(0, "setupReactContext");
       ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
       p0.runOnJSQueueThread(new a$i(this));
       p0.runOnNativeModulesQueueThread(new a$a(this));
       return;
    }
    public boolean R(ReactContext p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       TransientBundleLoaderSpec transientBun = a.a(p0);
       if (transientBun != null) {
          return transientBun.loadFirstPage(null, false);
       }
       return false;
    }
    public void S(){
       if (PatchProxy.applyVoid(null, this, a.class, "29")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       this.j.z();
       return;
    }
    public final void T(ReactContext p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "54")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "56")) {
          a$k[] okArray = new a$k[this.r.size()];
          okArray = this.r.toArray(okArray);
          int len = okArray.length;
          int i = 0;
          while (i < len) {
             object oobject = okArray[i];
             if (oobject != null) {
                oobject.e(p0);
             }
             i = i + 1;
          }
       }
       UiThreadUtil.assertOnUiThread();
       if (this.b == LifecycleState.RESUMED) {
          p0.onHostPause();
       }
       uoa = this.a;
       _monitor_enter(uoa);
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          this.g(iterator.next());
       }
       _monitor_exit(uoa);
       this.u.a(p0.getCatalystInstance());
       p0.destroy(new t(this, p0));
       this.j.A(p0);
       return;
    }
    public boolean U(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.V(null);
    }
    public boolean V(String p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (e.R) {
          obj = this.f;
          if (obj != null) {
             if (p0 != null) {
                obj.syncLoadPluginIfPluginIsUnLoad(p0);
             }
             List krnReactPack = this.f.getKrnReactPackages();
             obj = this.i;
             _monitor_enter(obj);
             if (this.i.containsAll(krnReactPack)) {
                a.a("ReactNative", "ReactInstanceManager.updatePackages\(\),but mPackages contains All newPackages");
                _monitor_exit(obj);
                return b;
             }else {
                _monitor_exit(obj);
                if (this.t()) {
                   a.a("ReactNative", "ReactInstanceManager.updatePackages\(\), start processPackages");
                   b = true;
                   this.n().getCatalystInstance().extendNativeModules(this.J(this.n(), krnReactPack, b));
                }
                return b;
             }
          }
       }
       a.a("ReactNative", "didNotFindViewManager Name: "+p0+",and enableKrnLazyRegisterPackage is false or mDynamicRegisterHandler is null");
       return b;
    }
    public final String a(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "null";
       }
       return p0.getClass().getSimpleName()+"@"+p0.hashCode();
    }
    public void b(a$k p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "38")) {
          return;
       }
       this.r.add(p0);
       return;
    }
    public void c(ReactApplicationContext p0){
       Bundle obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "50")) {
          return;
       }
       a ta = this.a;
       _monitor_enter(ta);
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          v ov = iterator.next();
          if (ov.getAttachType() == -3) {
             boolean rootViewTag = ov.getRootViewTag();
             if (PatchProxy.isSupport(a.class)) {
                obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(rootViewTag), this, a.class, "47");
                if (obj != PatchProxyResult.class) {
                   rootViewTag = obj.booleanValue();
                }else {
                label_0046 :
                   TransientBundleLoaderSpec transientBun1 = a.a(p0);
                   rootViewTag = (transientBun1 != null)? transientBun1.shouldAttachFirstPage(p0, rootViewTag): false;
                }
             }else {
                goto label_0046 ;
             }
             if (rootViewTag) {
                UIManager uIManager = t0.a(p0, ov.getUIManagerType());
                obj = ov.getAppProperties();
                ViewGroup rootViewGrou = ov.getRootViewGroup();
                WritableNativeMap writableNati = (obj == null)? new WritableNativeMap(): Arguments.fromBundle(obj);
                ov.setRootViewTag(uIManager.addRootView(rootViewGrou, writableNati, ov.getInitialUITemplate()));
                ov.setAttachType(1);
                ov.a(p0);
                if (PatchProxy.applyVoidTwoRefs(p0, ov, this, a.class, "48")) {
                   continue ;
                }else {
                   TransientBundleLoaderSpec transientBun = a.a(p0);
                   if (transientBun != null) {
                      transientBun.notifyFirstPageAttached(p0, ov);
                   }
                }
             }
          }
       }
       _monitor_exit(ta);
       return;
    }
    public void d(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "52")) {
          return;
       }
       a.a(0, "attachRootViewToInstance");
       if (p0.getAttachType() == 1) {
          return;
       }
       UIManager uIManager = t0.a(this.n, p0.getUIManagerType());
       int rootViewTag = p0.getRootViewTag();
       if (p0.getAttachType() == -3) {
          Bundle appPropertie = p0.getAppProperties();
          ViewGroup rootViewGrou = p0.getRootViewGroup();
          WritableNativeMap writableNati = (appPropertie == null)? new WritableNativeMap(): Arguments.fromBundle(appPropertie);
          rootViewTag = uIManager.addRootView(rootViewGrou, writableNati, p0.getInitialUITemplate());
          p0.setRootViewTag(rootViewTag);
          p0.setAttachType(1);
       }
       if (p0.getUIManagerType() == 2) {
          uIManager.updateRootLayoutSpecs(rootViewTag, p0.getWidthMeasureSpec(), p0.getHeightMeasureSpec());
          p0.setShouldLogContentAppeared(1);
       }else {
          p0.c();
       }
       UiThreadUtil.runOnUiThread(new a$b(this, rootViewTag, p0));
       a.c(0, "attachRootViewToInstance");
       return;
    }
    public final JSIModuleSpec e(ReactApplicationContext p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$d(this, p0);
    }
    public final void g(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "30")) {
          return;
       }
       p0.getRootViewGroup().removeAllViews();
       p0.getRootViewGroup().setId(-1);
       p0.setAttachType(-3);
       return;
    }
    public ReactApplicationContext h(JavaScriptExecutor p0,JSBundleLoader p1){
       a uoa = a.class;
       ReactApplicationContext obj = PatchProxy.applyTwoRefs(p0, p1, this, uoa, "58");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ReactMarker.logMarkerWithUniqueId(ReactMarkerConstants.CREATE_REACT_CONTEXT_START.name(), p0.getName(), this.B);
       obj = new ReactApplicationContext(this.o);
       a tv = this.v;
       if (tv == null) {
          tv = this.j;
       }
       obj.setNativeModuleCallExceptionHandler(tv);
       boolean b = false;
       NativeModuleRegistry nativeModule = this.J(obj, this.i, b);
       if (e.e && this.D == null) {
          this.D = MetaDiskCache.c(null, this.o.getFilesDir().getAbsolutePath(), this.w);
       }
       ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
       long l = 0;
       String str = "createCatalystInstance";
       a.a(l, str);
       CatalystInstanceImpl uCatalystIns = new CatalystInstanceImpl$Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(p0).setRegistry(nativeModule).setJSBundleLoader(p1).setNativeModuleCallExceptionHandler(tv).setMetaDiskCache(this.D).setUniqueId(this.B).setGroupId(this.C).useDeveloperSupport(this.k).build();
       if (!PatchProxy.applyVoidOneRefs(uCatalystIns, this, uoa, "55")) {
          a$k[] okArray = new a$k[this.r.size()];
          okArray = this.r.toArray(okArray);
          int len = okArray.length;
          while (b < len) {
             object oobject = okArray[b];
             if (oobject != null) {
                oobject.d(uCatalystIns);
             }
             b = b + 1;
          }
       }
       a.c(l, str);
       ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
       obj.initializeWithInstance(uCatalystIns);
       WeakReference weakReferenc = new WeakReference(this);
       uCatalystIns.setDestroyFinishedCallback(new o(weakReferenc, obj));
       tv = this.x;
       if (tv != null) {
          uCatalystIns.addJSIModules(tv.getJSIModules(obj, uCatalystIns.getJavaScriptContextHolder()));
          if (e.D) {
             JSIModule jSIModule = uCatalystIns.getJSIModule(JSIModuleType.TurboModuleManager);
             uCatalystIns.setTurboModuleManager(jSIModule);
             Iterator iterator = jSIModule.c().iterator();
             while (iterator.hasNext()) {
                jSIModule.a(iterator.next());
             }
          }
       }
       tv = this.l;
       if (tv != null) {
          uCatalystIns.addBridgeIdleDebugListener(tv);
       }
       uCatalystIns.setDidNotFindHandler(new r(weakReferenc));
       uCatalystIns.setGlobalVariable("__nativeEnableGetConstantsOpt", "true");
       if (TracingManager.d) {
          uCatalystIns.setGlobalVariable("__RCTProfileIsProfiling", "true");
       }
       if (this.R(obj)) {
          if (!PatchProxy.applyVoidTwoRefs(obj, uCatalystIns, this, uoa, "49")) {
             TransientBundleLoaderSpec transientBun = a.a(obj);
             if (transientBun != null) {
                transientBun.loadFirstPage(uCatalystIns, true);
             }
          }
       }else {
          this.P(obj);
       }
       return obj;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       if (this.s == null) {
          this.s = true;
          this.M();
       }
       return;
    }
    public ViewManager j(String p0){
       ViewManager viewManager;
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       _monitor_enter(obj);
       ReactApplicationContext reactApplica = this.n();
       if (reactApplica == null || !reactApplica.hasActiveCatalystInstance()) {
          a.g("ReactNative", "ReactInstanceManager.createViewManager viewManagerName: "+p0+", getCurrentReactContext == null ");
          _monitor_exit(obj);
          return null;
       }else {
          _monitor_exit(obj);
          a ti = this.i;
          _monitor_enter(ti);
          Iterator iterator = this.i.iterator();
          while (true) {
             if (iterator.hasNext()) {
                c0 uoc0 = iterator.next();
                if (uoc0 instanceof j0) {
                   viewManager = uoc0.createViewManager(reactApplica, p0);
                   if (viewManager != null) {
                      break ;
                   }
                }else if(uoc0 instanceof e){
                   viewManager = uoc0.createViewManager(reactApplica, p0);
                   if (viewManager != null) {
                      _monitor_exit(ti);
                      return viewManager;
                   }
                }
             }else {
                _monitor_exit(ti);
                return null;
             }
          }
          _monitor_exit(ti);
          return viewManager;
       }
    }
    public void k(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "21")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       c.a().b(a.c, "RNCore: Destroy");
       this.A = true;
       this.t = Boolean.TRUE;
       boolean b = false;
       if (this.k != null) {
          this.j.f(b);
          this.j.k();
       }
       this.x();
       if (this.d != null) {
          this.d = objArray;
       }
       a tu = this.u;
       Objects.requireNonNull(tu);
       this.o.getApplicationContext().unregisterComponentCallbacks(tu);
       tu = this.m;
       _monitor_enter(tu);
       if (this.n != null) {
          a.g("ReactNative", "ReactInstanceManager.destroy  "+this.n+"  "+this.n.getCatalystInstance());
          if (e.N && this.n.hasCatalystInstance()) {
             this.u.a(this.n.getCatalystInstance());
          }
          this.n.destroy(new s(this, this.n));
          this.n = objArray;
       }
       _monitor_exit(tu);
       this.s = b;
       this.q = objArray;
       this.z.a.clear();
       c uoc = c.a();
       _monitor_enter(uoc);
       if (PatchProxy.applyVoid(objArray, uoc, c.class, "2")) {
          _monitor_exit(uoc);
       }else {
          uoc.a.clear();
          _monitor_exit(uoc);
       }
       this.t = Boolean.FALSE;
       a tt = this.t;
       _monitor_enter(tt);
       this.t.notifyAll();
       _monitor_exit(tt);
       tu = this.D;
       if (tu != null) {
          Objects.requireNonNull(tu);
          if (!PatchProxy.applyVoid(objArray, tu, MetaDiskCache.class, "21")) {
             Iterator iterator = tu.g.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                if (uEntry.getValue().get() != null) {
                   uEntry.getValue().get().o(MemoryTrimType.OnAppBackgrounded);
                }
             }
          }
       }
       a.x("ReactNative", "ReactInstanceManager is destroyed. "+this);
       return;
    }
    public final void l(v p0,CatalystInstance p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "53")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       if (p0.getUIManagerType() == 2) {
          p1.getJSModule(ReactFabric.class).unmountComponentAtNode(p0.getRootViewTag());
       }else {
          p1.getJSModule(AppRegistry.class).unmountApplicationComponentAtRootTag(p0.getRootViewTag());
       }
       return;
    }
    public Set m(){
       return this.a;
    }
    public ReactContext n(){
       a tm = this.m;
       _monitor_enter(tm);
       _monitor_exit(tm);
       return this.n;
    }
    public e o(){
       return this.j;
    }
    public int p(){
       return this.C;
    }
    public List q(ReactApplicationContext p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
       a.a(0, "createAllViewManagers");
       if (this.y == null) {
          obj = this.i;
          _monitor_enter(obj);
          if (this.y == null) {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = this.i.iterator();
             while (iterator.hasNext()) {
                uArrayList.addAll(iterator.next().createViewManagers(p0));
             }
             this.y = uArrayList;
             _monitor_exit(obj);
             a.c(0, "createAllViewManagers");
             ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
             return uArrayList;
          }else {
             _monitor_exit(obj);
          }
       }
       a.c(0, "createAllViewManagers");
       ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
       return this.y;
    }
    public int r(){
       return this.B;
    }
    public void s(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "45")) {
          return;
       }
       boolean b = false;
       this.s = b;
       this.d = null;
       if (this.k != null && p0 instanceof Exception) {
          this.j.handleException(p0);
       }
       a$k[] okArray = new a$k[this.r.size()];
       okArray = this.r.toArray(okArray);
       int len = okArray.length;
       while (b < len) {
          object oobject = okArray[b];
          if (oobject != null) {
             oobject.b(this, p0);
          }
          b = b + 1;
       }
       return;
    }
    public boolean t(){
       Object obj = PatchProxy.apply(null, this, a.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.d == null && this.n() != null)? true: false;
       return b;
    }
    public boolean u(){
       return this.s;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, a.class, "14")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       a tp = this.p;
       if (tp != null) {
          tp.X0();
       }
       return;
    }
    public synchronized final void x(){
       if (PatchProxy.applyVoid(null, this, a.class, "24")) {
          return;
       }
       ReactContext reactContext = this.n();
       if (reactContext != null) {
          if (this.b == LifecycleState.RESUMED) {
             reactContext.onHostPause();
             this.b = LifecycleState.BEFORE_RESUME;
          }
          if (this.b == LifecycleState.BEFORE_RESUME) {
             reactContext.onHostDestroy();
          }
       }
       this.b = LifecycleState.BEFORE_CREATE;
       return;
    }
    public synchronized final void y(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "22")) {
          return;
       }
       ReactContext reactContext = this.n();
       if (reactContext != null && (!p0 && (this.b == LifecycleState.BEFORE_RESUME || this.b == LifecycleState.BEFORE_CREATE))) {
          reactContext.onHostResume(this.q);
       }
       this.b = LifecycleState.RESUMED;
       return;
    }
    public final void z(ReactContext p0,CatalystInstance p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "57")) {
          return;
       }
       a$k[] okArray = new a$k[this.r.size()];
       okArray = this.r.toArray(okArray);
       int len = okArray.length;
       int i = 0;
       while (i < len) {
          object oobject = okArray[i];
          if (oobject != null) {
             oobject.c(p0, p1);
          }
          i = i + 1;
       }
       return;
    }
}
