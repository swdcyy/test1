package com.facebook.react.modules.fresco.FrescoModule;
import ie.a;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import yd.e;
import vc.h;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vc.h$b;
import android.content.Context;
import com.facebook.imagepipeline.producers.f;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.Map;
import hb.b;
import com.facebook.imagepipeline.producers.n;
import java.lang.Boolean;
import com.facebook.drawee.backends.pipeline.Fresco;
import java.lang.Thread;
import oe.a;
import java.lang.ThreadGroup;
import java.lang.Runnable;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.react.bridge.BaseJavaModule;
import android.content.ContextWrapper;
import cb.a;
import vc.j;
import ukd.a;
import ed.v;
import ed.d;
import ed.x;
import java.lang.ClassLoader;
import com.facebook.react.modules.fresco.FrescoModule$a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.Exception;

public class FrescoModule extends ReactContextBaseJavaModule implements a, LifecycleEventListener	// class@0012b8
{
    public long mAllocSize;
    public final boolean mClearOnDestroy;
    public h mConfig;
    public static boolean sHasBeenInitialized;

    public void FrescoModule(ReactApplicationContext p0){
       super(p0, e.W, null);
    }
    public void FrescoModule(ReactApplicationContext p0,boolean p1){
       super(p0, p1, null);
    }
    public void FrescoModule(ReactApplicationContext p0,boolean p1,h p2){
       super(p0);
       this.mAllocSize = 0;
       this.mClearOnDestroy = p1;
       this.mConfig = p2;
    }
    public static h getDefaultConfig(ReactContext p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FrescoModule.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FrescoModule.getDefaultConfigBuilder(p0).a();
    }
    public static h$b getDefaultConfigBuilder(ReactContext p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FrescoModule.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       h$b uob = h.y(p0);
       uob.c(new f(null, null, RealtimeSinceBootClock.get()));
       uob.b(false);
       return uob;
    }
    public static boolean hasBeenInitialized(){
       Object obj = PatchProxy.apply(null, null, FrescoModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (Fresco.hasBeenInitialized()) {
          FrescoModule.sHasBeenInitialized = true;
       }
       return FrescoModule.sHasBeenInitialized;
    }
    public static void initializeAsyncWithDefaultConfig(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, FrescoModule.class, "2")) {
          return;
       }
       if (!FrescoModule.hasBeenInitialized()) {
          new Thread(null, new a(p0)).start();
       }
       return;
    }
    public static void lambda$initializeAsyncWithDefaultConfig$0(Context p0){
       if (!FrescoModule.hasBeenInitialized()) {
          FrescoModule.sHasBeenInitialized = true;
          Fresco.initialize(p0.getApplicationContext(), FrescoModule.getDefaultConfig(new ReactContext(p0)));
       }
       return;
    }
    public void clearSensitiveData(){
       if (PatchProxy.applyVoid(null, this, FrescoModule.class, "3")) {
          return;
       }
       Fresco.getImagePipeline().clearCaches();
       return;
    }
    public String getName(){
       return "FrescoModule";
    }
    public void initialize(){
       if (PatchProxy.applyVoid(null, this, FrescoModule.class, "1")) {
          return;
       }
       super.initialize();
       this.getReactApplicationContext().addLifecycleEventListener(this);
       if (!FrescoModule.hasBeenInitialized()) {
          if (this.mConfig == null) {
             this.mConfig = FrescoModule.getDefaultConfig(this.getReactApplicationContext());
          }
          Fresco.initialize(this.getReactApplicationContext().getApplicationContext(), this.mConfig);
          FrescoModule.sHasBeenInitialized = true;
       }else if(this.mConfig != null){
          a.x("ReactNative", "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
       }
       this.mConfig = null;
       return;
    }
    public final void installBitmapAllocationHook(){
       String str = "mPoolStatsTracker";
       if (PatchProxy.applyVoid(null, this, FrescoModule.class, "8")) {
          return;
       }
       try{
          h oh = a.d(j.j(), "mConfig");
          x ox = a.d(oh.t().a(), str);
          Class[] uClassArray = new Class[]{x.class};
          a.o(oh.t().a(), str, Proxy.newProxyInstance(ox.getClass().getClassLoader(), uClassArray, new FrescoModule$a(this, ox)));
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
    public void onHostDestroy(){
       if (PatchProxy.applyVoid(null, this, FrescoModule.class, "7")) {
          return;
       }
       if (FrescoModule.hasBeenInitialized() && this.mClearOnDestroy != null) {
          Fresco.getImagePipeline().clearMemoryCaches();
       }
       return;
    }
    public void onHostPause(){
    }
    public void onHostResume(){
    }
}
