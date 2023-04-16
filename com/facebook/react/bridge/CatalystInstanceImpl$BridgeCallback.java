package com.facebook.react.bridge.CatalystInstanceImpl$BridgeCallback;
import com.facebook.react.bridge.ReactCallback;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JavaScriptExecutor$Type;
import java.lang.Object;
import java.lang.ref.WeakReference;
import com.facebook.cache.common.CacheKey;
import java.nio.ByteBuffer;
import java.lang.String;
import yd.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.facebook.react.bridge.NativeModuleDidNotFindHandler;
import com.facebook.react.modules.diskcache.MetaDiskCache;
import java.lang.Number;
import com.facebook.react.bridge.SharedResourceAllocator;
import java.lang.Integer;
import com.facebook.react.modules.diskcache.MetaDiskCache$EventType;
import java.util.Map;
import vd.d;
import ta.d;
import java.lang.StringBuilder;
import java.lang.Enum;
import ne.a;
import ne.b;
import com.facebook.react.bridge.JavaScriptExecutor;
import bolts.Task;
import java.lang.Throwable;
import com.facebook.react.modules.diskcache.e;
import com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModuleRegistry;
import java.lang.Long;
import od.a;
import com.facebook.react.bridge.CodeCacheResult;
import ne.h;
import java.util.concurrent.Callable;
import java.nio.Buffer;
import td.k;
import java.lang.Runnable;
import ne.b$b;
import java.util.zip.CRC32;
import com.facebook.react.bridge.JSBundleLoader;

public class CatalystInstanceImpl$BridgeCallback implements ReactCallback	// class@0011ae
{
    public final int mGroupId;
    public final WeakReference mOuter;
    public final JavaScriptExecutor$Type mType;

    public void CatalystInstanceImpl$BridgeCallback(CatalystInstanceImpl p0,JavaScriptExecutor$Type p1,int p2){
       super();
       this.mOuter = new WeakReference(p0);
       this.mType = p1;
       this.mGroupId = p2;
    }
    public static void a(CatalystInstanceImpl$BridgeCallback p0,CacheKey p1,ByteBuffer p2,int p3,String p4){
       p0.lambda$updateCodeCache$0(p1, p2, p3, p4);
    }
    private void lambda$updateCodeCache$0(CacheKey p0,ByteBuffer p1,int p2,String p3){
       this.updateCodeCacheImpl(p0, p1, p2, p3);
    }
    public boolean canShareRuntime(){
       return e.z;
    }
    public void decrementPendingJSCalls(){
       if (PatchProxy.applyVoid(null, this, CatalystInstanceImpl$BridgeCallback.class, "3")) {
          return;
       }
       CatalystInstanceImpl uCatalystIns = this.mOuter.get();
       if (uCatalystIns != null) {
          uCatalystIns.decrementPendingJSCalls();
       }
       return;
    }
    public boolean didNotFindModule(String p0){
       CatalystInstanceImpl obj = PatchProxy.applyOneRefs(p0, this, CatalystInstanceImpl$BridgeCallback.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mOuter.get();
       if (obj != null) {
          return obj.mDidNotFindHandler.didNotFindModule(obj, p0);
       }
       return false;
    }
    public final MetaDiskCache getMetaDiskCache(){
       CatalystInstanceImpl obj = PatchProxy.apply(null, this, CatalystInstanceImpl$BridgeCallback.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mOuter.get();
       if (obj != null) {
          return obj.mMetaDiskCache;
       }
       return null;
    }
    public long getSharedIsolateHandler(){
       Object obj = PatchProxy.apply(null, this, CatalystInstanceImpl$BridgeCallback.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return SharedResourceAllocator.getInstance().getSharedIsolateHandler(this.mGroupId, this.mType);
    }
    public final int getUniqueId(){
       CatalystInstanceImpl obj = PatchProxy.apply(null, this, CatalystInstanceImpl$BridgeCallback.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mOuter.get();
       if (obj != null) {
          return obj.mUniqueId;
       }
       return -1;
    }
    public ByteBuffer getValidatedCodeCache(int p0,String p1){
       CatalystInstanceImpl$BridgeCallback uBridgeCallb = CatalystInstanceImpl$BridgeCallback.class;
       if (PatchProxy.isSupport(uBridgeCallb)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uBridgeCallb, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 5;
       this.handleEventIfNeeded(i, MetaDiskCache$EventType.EVALUATE_JS_WITH_CACHE, d.d("Url", p1));
       MetaDiskCache metaDiskCach = this.getMetaDiskCache();
       if (metaDiskCach == null) {
          this.handleEventIfNeeded(6, MetaDiskCache$EventType.GET_DISK_CACHE_DESTROY, d.d("Url", p1));
       }else {
          d uod = new d(p0+"_"+this.mType.toString());
          if (!metaDiskCach.b(uod)) {
             this.handleEventIfNeeded(i, MetaDiskCache$EventType.GET_CACHE_MISS, d.d("Url", p1));
          }else {
             a uoa = metaDiskCach.d(uod);
             if (uoa != null) {
                MetaDiskCache$EventType gET_CACHE_HI = MetaDiskCache$EventType.GET_CACHE_HIT;
                String str = "From";
                String str1 = (uoa.d != null)? "Memory": "File";
                this.handleEventIfNeeded(i, gET_CACHE_HI, d.e("Url", p1, str, str1));
                if (JavaScriptExecutor.isValidCodeCacheVersion(this.mType, uoa.g().e, uoa.g().f)) {
                   ByteBuffer uByteBuffer = uoa.f(true);
                   if (uByteBuffer != null) {
                      this.handleEventIfNeeded(4, MetaDiskCache$EventType.GET_FINISHED, d.d("Url", p1));
                      return uByteBuffer;
                   }else {
                      this.handleEventIfNeeded(6, MetaDiskCache$EventType.GET_INVALID_CRC, d.d("Url", p1));
                   }
                }else {
                   this.handleEventIfNeeded(6, MetaDiskCache$EventType.GET_INVALID_CACHE_VERSION, d.d("Url", p1));
                }
             }else {
                this.handleEventIfNeeded(4, MetaDiskCache$EventType.GET_CACHE_NULL, d.d("Url", p1));
             }
             metaDiskCach.g(uod);
          }
       }
       this.handleEventIfNeeded(4, MetaDiskCache$EventType.GET_FINISHED, d.d("Url", p1));
       return null;
    }
    public final void handleEventIfNeeded(int p0,MetaDiskCache$EventType p1,Map p2){
       if (PatchProxy.isSupport(CatalystInstanceImpl$BridgeCallback.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, CatalystInstanceImpl$BridgeCallback.class, "11")) {
          return;
       }
       this.handleEventIfNeeded(p0, p1, p2, null);
       return;
    }
    public final void handleEventIfNeeded(int p0,MetaDiskCache$EventType p1,Map p2,Throwable p3){
       if (PatchProxy.isSupport(CatalystInstanceImpl$BridgeCallback.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, CatalystInstanceImpl$BridgeCallback.class, "12")) {
          return;
       }
       CatalystInstanceImpl uCatalystIns = this.mOuter.get();
       MetaDiskCache metaDiskCach = null;
       if (uCatalystIns != null) {
          uCatalystIns = uCatalystIns.mMetaDiskCache;
          if (uCatalystIns != null) {
             _monitor_enter(uCatalystIns);
             metaDiskCach = uCatalystIns.h;
             _monitor_exit(uCatalystIns);
          }
       }
       if (metaDiskCach != null) {
          p2.put("HostId", String.valueOf(this.getUniqueId()));
          p2.put("EngineType", this.mType.toString());
          metaDiskCach.a(p0, p1, p2, p3);
       }
       return;
    }
    public void incrementPendingJSCalls(){
       if (PatchProxy.applyVoid(null, this, CatalystInstanceImpl$BridgeCallback.class, "2")) {
          return;
       }
       CatalystInstanceImpl uCatalystIns = this.mOuter.get();
       if (uCatalystIns != null) {
          uCatalystIns.incrementPendingJSCalls();
       }
       return;
    }
    public void onBatchComplete(){
       if (PatchProxy.applyVoid(null, this, CatalystInstanceImpl$BridgeCallback.class, "1")) {
          return;
       }
       CatalystInstanceImpl uCatalystIns = this.mOuter.get();
       if (uCatalystIns != null) {
          if (e.O) {
             UIManagerModule uIManagerMod = uCatalystIns.getTurboModuleRegistry().a("UIManagerTurbo");
             if (uIManagerMod != null) {
                uIManagerMod.onBatchComplete();
             }
          }else {
             uCatalystIns.mNativeModuleRegistry.onBatchComplete();
          }
       }
       return;
    }
    public void registerSharedIsolateHandler(long p0){
       CatalystInstanceImpl$BridgeCallback uBridgeCallb = CatalystInstanceImpl$BridgeCallback.class;
       if (PatchProxy.isSupport(uBridgeCallb) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uBridgeCallb, "14")) {
          return;
       }
       SharedResourceAllocator.getInstance().registerSharedIsolateHandler(this.mGroupId, this.mType, p0);
       return;
    }
    public int unregisterSharedIsolateHandler(long p0){
       CatalystInstanceImpl$BridgeCallback uBridgeCallb = CatalystInstanceImpl$BridgeCallback.class;
       if (PatchProxy.isSupport(uBridgeCallb)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uBridgeCallb, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return SharedResourceAllocator.getInstance().unregisterSharedIsolateHandler(this.mGroupId, this.mType, p0);
    }
    public void updateCodeCache(int p0,ByteBuffer p1,int p2,int p3,String p4){
       CatalystInstanceImpl$BridgeCallback uBridgeCallb = CatalystInstanceImpl$BridgeCallback.class;
       int i = 5;
       if (PatchProxy.isSupport(uBridgeCallb)) {
          Object[] objArray = new Object[i];
          objArray[0] = Integer.valueOf(p0);
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = p4;
          if (PatchProxy.applyVoid(objArray, this, uBridgeCallb, "7")) {
             return;
          }
       }
       a.a(p1.isDirect());
       MetaDiskCache metaDiskCach = this.getMetaDiskCache();
       String str = "Url";
       if (metaDiskCach == null) {
          this.handleEventIfNeeded(6, MetaDiskCache$EventType.PUT_DISK_CACHE_DESTROY, d.d(str, p4));
          return;
       }else {
          d uod = new d(p0+"_"+this.mType.toString());
          String str1 = "Result";
          if (p3 == CodeCacheResult.GOOD_END.ordinal()) {
             if (!PatchProxy.applyVoidOneRefs(uod, metaDiskCach, MetaDiskCache.class, "5")) {
                Task.call(new h(metaDiskCach, uod));
             }
             this.handleEventIfNeeded(i, MetaDiskCache$EventType.PUT_FINISHED, d.e(str, p4, str1, String.valueOf(p3)));
          }else if(p3 == CodeCacheResult.REQUEST_UPDATE.ordinal()){
             ByteBuffer uByteBuffer = ByteBuffer.allocate((p2 + 32));
             uByteBuffer.position(32);
             uByteBuffer.put(p1).flip();
             k ok = new k(this, uod, uByteBuffer, p2, p4);
             metaDiskCach.h(uByteBuffer.put(p1));
          }else {
             this.handleEventIfNeeded(6, MetaDiskCache$EventType.PUT_RESULT_EXCEPTION, d.e(str, p4, str1, String.valueOf(p3)));
             metaDiskCach.g(uod);
          }
          return;
       }
    }
    public final void updateCodeCacheImpl(CacheKey p0,ByteBuffer p1,int p2,String p3){
       if (PatchProxy.isSupport(CatalystInstanceImpl$BridgeCallback.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, CatalystInstanceImpl$BridgeCallback.class, "8")) {
          return;
       }
       a.a((p1.isDirect() ^ 0x01));
       MetaDiskCache metaDiskCach = this.getMetaDiskCache();
       if (metaDiskCach == null) {
          this.handleEventIfNeeded(6, MetaDiskCache$EventType.PUT_DISK_CACHE_DESTROY, d.d("Url", p3));
          return;
       }else {
          int i = 5;
          try{
             b$b uob = new b$b();
             super();
             this.update(p1.array(), 32, p2);
             p1.rewind();
             uob.e = JavaScriptExecutor.getRuntimeVersion(this.mType);
             uob.d = JavaScriptExecutor.getCachedDataVersion(this.mType);
             uob.c = p2;
             uob.b = (int)this.getValue();
             uob.a = 0;
             uob.f = 0;
             a uoa = a.c(metaDiskCach, p1, uob.a());
             if (uoa != null) {
                metaDiskCach.e(p0, uoa);
                this.handleEventIfNeeded(i, MetaDiskCache$EventType.PUT_CACHE_UPDATED, d.d("Url", p3));
             }else {
                this.handleEventIfNeeded(6, MetaDiskCache$EventType.PUT_META_VERIFY_ERROR, d.d("Url", p3));
             }
          }catch(java.lang.Exception e9){
             this.handleEventIfNeeded(6, MetaDiskCache$EventType.PUT_META_VERIFY_ERROR, d.d("Url", p3), e9);
          }
          this.handleEventIfNeeded(i, MetaDiskCache$EventType.PUT_FINISHED, d.d("Url", p3));
          return;
       }
    }
    public boolean useCodeCache(String p0){
       CatalystInstanceImpl obj = PatchProxy.applyOneRefs(p0, this, CatalystInstanceImpl$BridgeCallback.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!e.e) {
          return b;
       }
       this.handleEventIfNeeded(5, MetaDiskCache$EventType.EVALUATE_START, d.d("Url", p0));
       obj = this.mOuter.get();
       int i = (obj == null || obj.mJSBundleLoader.useCodeCache(p0))? 1: 0;
       if (JavaScriptExecutor.supportCodeCache(this.mType) && i) {
          b = true;
       }
       return b;
    }
}
