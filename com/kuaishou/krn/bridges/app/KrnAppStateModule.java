package com.kuaishou.krn.bridges.app.KrnAppStateModule;
import com.kuaishou.krn.lifecycle.AppLifecycleManager$c;
import com.kuaishou.krn.base.KrnBridge;
import com.kuaishou.krn.bridges.app.KrnAppStateModule$a;
import nsd.u;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import com.kuaishou.krn.bridges.app.KrnAppStateModule$mMemoryEventListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.Lifecycle$State;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.krn.bridges.app.KrnAppStateModule$mMemoryEventListener$2$a;
import com.facebook.react.bridge.Callback;
import com.kuaishou.krn.log.sample.KdsMemoryWarningSampler;
import com.kuaishou.krn.apm.MemoryMonitor;
import com.kuaishou.krn.bridges.app.KrnAppStateModule$getMemoryInfo$1;
import msd.l;
import android.app.ActivityManager$MemoryInfo;
import java.lang.Integer;
import java.lang.Boolean;
import ik0.m;
import com.kuaishou.krn.delegate.KrnDelegate;
import com.facebook.react.bridge.BaseJavaModule;
import com.kuaishou.krn.lifecycle.AppLifecycleManager;
import com.kuaishou.krn.lifecycle.AppLifecycleManager$b;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.ComponentCallbacks;
import com.kuaishou.krn.lifecycle.JSLifecycleManager;
import qrd.l1;
import com.facebook.react.bridge.ReactContext;
import com.kuaishou.krn.NativeToJsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import yj0.a;
import java.util.Objects;
import java.util.List;

public final class KrnAppStateModule extends KrnBridge implements AppLifecycleManager$c	// class@00080a
{
    public final p mMemoryEventListener$delegate;
    public final WeakReference weakApplicationContext;
    public static final KrnAppStateModule$a Companion;

    static {
       KrnAppStateModule.Companion = new KrnAppStateModule$a(null);
    }
    public void KrnAppStateModule(ReactApplicationContext p0){
       a.p(p0, "reactContext");
       super(p0);
       this.weakApplicationContext = new WeakReference(p0);
       this.mMemoryEventListener$delegate = s.c(new KrnAppStateModule$mMemoryEventListener$2(this));
    }
    public final String getAppState(){
       String obj = PatchProxy.apply(null, this, KrnAppStateModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.getLifeAppState().isAtLeast(Lifecycle$State.STARTED))? "active": "background";
       return obj;
    }
    public final WritableMap getCurrentAppState(){
       WritableMap obj = PatchProxy.apply(null, this, KrnAppStateModule.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Arguments.createMap();
       obj.putString("appState", this.getAppState());
       a.o(obj, "Arguments.createMap\(\).ap¡­te\", getAppState\(\)\)\n    }");
       return obj;
    }
    public final Lifecycle$State getLifeAppState(){
       LifecycleOwner obj = PatchProxy.apply(null, this, KrnAppStateModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ProcessLifecycleOwner.get();
       a.o(obj, "ProcessLifecycleOwner.get\(\)");
       Lifecycle lifecycle = obj.getLifecycle();
       a.o(lifecycle, "ProcessLifecycleOwner.get\(\).lifecycle");
       Lifecycle$State currentState = lifecycle.getCurrentState();
       a.o(currentState, "ProcessLifecycleOwner.get\(\).lifecycle.currentState");
       return currentState;
    }
    public final KrnAppStateModule$mMemoryEventListener$2$a getMMemoryEventListener(){
       Object obj = PatchProxy.apply(null, this, KrnAppStateModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mMemoryEventListener$delegate.getValue();
    }
    public final void getMemoryInfo(Callback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnAppStateModule.class, "7")) {
          return;
       }
       a.p(p0, "callback");
       if (KdsMemoryWarningSampler.d.b()) {
          MemoryMonitor.m.g(new KrnAppStateModule$getMemoryInfo$1(this, p0));
       }
       return;
    }
    public final WritableMap getMemoryInfoSync(){
       Object[] objArray = null;
       WritableMap obj = PatchProxy.apply(objArray, this, KrnAppStateModule.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Arguments.createMap();
       if (KdsMemoryWarningSampler.d.b()) {
          ActivityManager$MemoryInfo memoryInfo = MemoryMonitor.m.g(objArray);
          if (memoryInfo != null) {
             obj.putDouble("totalMemMB", (double)memoryInfo.totalMem);
             obj.putDouble("availMemMB", (double)memoryInfo.availMem);
             obj.putDouble("thresholdMB", (double)memoryInfo.threshold);
             obj.putBoolean("isLowMemory", memoryInfo.lowMemory);
          }
       }
       a.o(obj, "result");
       return obj;
    }
    public String getName(){
       return "KRNAppState";
    }
    public final boolean getPageVisibleState(int p0){
       KrnAppStateModule krnAppStateM = KrnAppStateModule.class;
       if (PatchProxy.isSupport(krnAppStateM)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, krnAppStateM, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       m rNView = this.getRNView(p0);
       if (rNView != null) {
          KrnDelegate krnDelegate = rNView.getKrnDelegate();
          if (krnDelegate != null) {
             krnDelegate = krnDelegate.k;
          label_002d :
             return krnDelegate;
          }
       }
       boolean b = false;
       goto label_002d ;
    }
    public void initialize(){
       if (PatchProxy.applyVoid(null, this, KrnAppStateModule.class, "4")) {
          return;
       }
       super.initialize();
       AppLifecycleManager.d.a().b(this);
       ReactContextBaseJavaModule tmReactAppli = this.mReactApplicationContext;
       if (tmReactAppli != null) {
          Context applicationC = tmReactAppli.getApplicationContext();
          if (applicationC != null) {
             applicationC.registerComponentCallbacks(this.getMMemoryEventListener());
          }
       }
       return;
    }
    public final void notifyAppStateToJs(){
       Iterator iterator;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KrnAppStateModule.class, "11")) {
          return;
       }
       ReactApplicationContext reactApplica = this.getReactApplicationContext();
       String str = "reactApplicationContext";
       a.o(reactApplica, str);
       String appState = this.getAppState();
       if (!PatchProxy.applyVoidTwoRefs(reactApplica, appState, objArray, JSLifecycleManager.class, "5")) {
          a.p(reactApplica, str);
          a.p(appState, "state");
          WritableMap writableMap = Arguments.createMap();
          writableMap.putString("appState", appState);
          NativeToJsKt.e(reactApplica, "krnAppStateDidChange", writableMap);
          int i = appState.hashCode();
          if (i != -1422950650) {
             if (i != -1332194002 || (appState.equals("background") && !PatchProxy.applyVoidOneRefs(reactApplica, objArray, JSLifecycleManager.class, "9"))) {
                a.p(reactApplica, str);
                iterator = JSLifecycleManager.b.a().iterator();
                while (iterator.hasNext()) {
                   iterator.next().c(reactApplica);
                }
             }
          }else if(!appState.equals("active") || PatchProxy.applyVoidOneRefs(reactApplica, objArray, JSLifecycleManager.class, "8")){
             a.p(reactApplica, str);
             iterator = JSLifecycleManager.b.a().iterator();
             while (iterator.hasNext()) {
                iterator.next().a(reactApplica);
             }
          }
       }
       return;
    }
    public void onBackground(){
       if (PatchProxy.applyVoid(null, this, KrnAppStateModule.class, "9")) {
          return;
       }
       this.notifyAppStateToJs();
       return;
    }
    public void onCatalystInstanceDestroy(){
       if (PatchProxy.applyVoid(null, this, KrnAppStateModule.class, "12")) {
          return;
       }
       super.onCatalystInstanceDestroy();
       AppLifecycleManager uAppLifecycl = AppLifecycleManager.d.a();
       Objects.requireNonNull(uAppLifecycl);
       if (!PatchProxy.applyVoidOneRefs(this, uAppLifecycl, AppLifecycleManager.class, "2")) {
          a.p(this, "lifecycleListener");
          uAppLifecycl.b.remove(this);
       }
       ReactContextBaseJavaModule tmReactAppli = this.mReactApplicationContext;
       if (tmReactAppli != null) {
          Context applicationC = tmReactAppli.getApplicationContext();
          if (applicationC != null) {
             applicationC.unregisterComponentCallbacks(this.getMMemoryEventListener());
          }
       }
       return;
    }
    public void onForeground(){
       if (PatchProxy.applyVoid(null, this, KrnAppStateModule.class, "10")) {
          return;
       }
       this.notifyAppStateToJs();
       return;
    }
}
