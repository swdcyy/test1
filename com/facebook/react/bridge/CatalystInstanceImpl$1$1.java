package com.facebook.react.bridge.CatalystInstanceImpl$1$1;
import java.lang.Runnable;
import com.facebook.react.bridge.CatalystInstanceImpl$1;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import cb.a;
import android.os.AsyncTask;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.CatalystInstanceImpl;
import ze.m;
import java.util.Objects;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import android.util.SparseArray;
import java.lang.Integer;
import java.util.Iterator;
import android.view.View;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.JSIModuleRegistry;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.CopyOnWriteArrayList;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.MessageQueueThread;
import td.g;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.CatalystInstanceImpl$1$1$1;
import td.e;
import yd.e;
import td.f;
import td.h;

public class CatalystInstanceImpl$1$1 implements Runnable	// class@0011a6
{
    public final CatalystInstanceImpl$1 this$1;

    public void CatalystInstanceImpl$1$1(CatalystInstanceImpl$1 p0){
       this.this$1 = p0;
       super();
    }
    public static void a(CatalystInstanceImpl$1$1 p0){
       p0.lambda$run$0();
    }
    public static void b(CatalystInstanceImpl$1$1 p0,Runnable p1,Runnable p2){
       p0.lambda$run$2(p1, p2);
    }
    public static void c(CatalystInstanceImpl$1$1 p0,Runnable p1,Runnable p2){
       p0.lambda$null$1(p1, p2);
    }
    private void lambda$null$1(Runnable p0,Runnable p1){
       a.x("ReactNativeDestroy", "Catalyst runOnUIThread "+this.this$1.this$0.hashCode());
       p0.run();
       AsyncTask.execute(p1);
    }
    private void lambda$run$0(){
       m nativeViewHi = this.this$1.this$0.getNativeModule(UIManagerModule.class).getNativeViewHierarchyManager();
       Objects.requireNonNull(nativeViewHi);
       if (PatchProxy.applyVoid(null, nativeViewHi, m.class, "38")) {
       }else {
          ArrayList uArrayList = new ArrayList();
          for (int i = 0; i < nativeViewHi.a.size(); i = i + 1) {
             uArrayList.add(Integer.valueOf(nativeViewHi.a.keyAt(i)));
          }
          a.g(m.n, "dropping views "+uArrayList);
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             View view = nativeViewHi.a.get(iterator.next().intValue());
             if (view != null) {
                nativeViewHi.E(view);
             }
          }
       }
       return;
    }
    private void lambda$run$2(Runnable p0,Runnable p1){
       this.this$1.this$0.mNativeModuleRegistry.notifyJSInstanceDestroy();
       this.this$1.this$0.mJSIModuleRegistry.notifyJSInstanceDestroy();
       int i = 0;
       if (!this.this$1.this$0.mPendingJSCalls.getAndSet(i)) {
          i = 1;
       }
       if (!this.this$1.this$0.mBridgeIdleListeners.isEmpty()) {
          Iterator iterator = this.this$1.this$0.mBridgeIdleListeners.iterator();
          while (iterator.hasNext()) {
             NotThreadSafeBridgeIdleDebugListener notThreadSaf = iterator.next();
             if (!i) {
                notThreadSaf.onTransitionToBridgeIdle();
             }
             notThreadSaf.onBridgeDestroyed();
          }
       }
       a.x("ReactNativeDestroy", "Catalyst runOnNativeModuleThread2 "+this.this$1.this$0.hashCode());
       this.this$1.this$0.getReactQueueConfiguration().getUIQueueThread().runOnQueue(new g(this, p0, p1));
       return;
    }
    public static void lambda$run$3(Runnable p0){
       AsyncTask.execute(p0);
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, CatalystInstanceImpl$1$1.class, "1")) {
          return;
       }
       CatalystInstanceImpl mTurboModule = this.this$1.this$0.mTurboModuleManagerJSIModule;
       if (mTurboModule != null) {
          mTurboModule.onCatalystInstanceDestroy();
       }
       a.x("ReactNativeDestroy", "Catalyst runOnJSThread "+this.this$1.this$0.hashCode());
       CatalystInstanceImpl$1$1$1 u1$1$1 = new CatalystInstanceImpl$1$1$1(this);
       e uoe = new e(this);
       if (e.l) {
          this.this$1.this$0.getReactQueueConfiguration().getNativeModulesQueueThread().runOnQueue(new f(this, uoe, u1$1$1));
       }else {
          this.this$1.this$0.getReactQueueConfiguration().getUIQueueThread().runOnQueue(new h(u1$1$1));
       }
       return;
    }
}
