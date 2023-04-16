package com.facebook.react.bridge.CatalystInstanceImpl$Builder;
import java.lang.Object;
import com.facebook.react.bridge.CatalystInstanceImpl;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import od.a;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.modules.diskcache.MetaDiskCache;
import com.facebook.react.bridge.CatalystInstanceImpl$1;

public class CatalystInstanceImpl$Builder	// class@0011af
{
    public int mGroupId;
    public JSBundleLoader mJSBundleLoader;
    public JavaScriptExecutor mJSExecutor;
    public MetaDiskCache mMetaDiskCache;
    public NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    public ReactQueueConfigurationSpec mReactQueueConfigurationSpec;
    public NativeModuleRegistry mRegistry;
    public int mUniqueId;
    public boolean mUseDeveloperSupport;

    public void CatalystInstanceImpl$Builder(){
       super();
    }
    public CatalystInstanceImpl build(){
       Object obj = PatchProxy.apply(null, this, CatalystInstanceImpl$Builder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       CatalystInstanceImpl$Builder tmReactQueue = this.mReactQueueConfigurationSpec;
       a.c(tmReactQueue);
       CatalystInstanceImpl$Builder uBuilder = tmReactQueue;
       tmReactQueue = this.mJSExecutor;
       a.c(tmReactQueue);
       CatalystInstanceImpl$Builder uBuilder1 = tmReactQueue;
       tmReactQueue = this.mRegistry;
       a.c(tmReactQueue);
       CatalystInstanceImpl$Builder uBuilder2 = tmReactQueue;
       tmReactQueue = this.mJSBundleLoader;
       a.c(tmReactQueue);
       CatalystInstanceImpl$Builder uBuilder3 = tmReactQueue;
       tmReactQueue = this.mNativeModuleCallExceptionHandler;
       a.c(tmReactQueue);
       CatalystInstanceImpl$Builder uBuilder4 = tmReactQueue;
       CatalystInstanceImpl uCatalystIns = new CatalystInstanceImpl(uBuilder, uBuilder1, uBuilder2, uBuilder3, this.mMetaDiskCache, uBuilder4, this.mUniqueId, this.mGroupId, this.mUseDeveloperSupport, null);
       return obj;
    }
    public CatalystInstanceImpl$Builder setGroupId(int p0){
       this.mGroupId = p0;
       return this;
    }
    public CatalystInstanceImpl$Builder setJSBundleLoader(JSBundleLoader p0){
       this.mJSBundleLoader = p0;
       return this;
    }
    public CatalystInstanceImpl$Builder setJSExecutor(JavaScriptExecutor p0){
       this.mJSExecutor = p0;
       return this;
    }
    public CatalystInstanceImpl$Builder setMetaDiskCache(MetaDiskCache p0){
       this.mMetaDiskCache = p0;
       return this;
    }
    public CatalystInstanceImpl$Builder setNativeModuleCallExceptionHandler(NativeModuleCallExceptionHandler p0){
       this.mNativeModuleCallExceptionHandler = p0;
       return this;
    }
    public CatalystInstanceImpl$Builder setReactQueueConfigurationSpec(ReactQueueConfigurationSpec p0){
       this.mReactQueueConfigurationSpec = p0;
       return this;
    }
    public CatalystInstanceImpl$Builder setRegistry(NativeModuleRegistry p0){
       this.mRegistry = p0;
       return this;
    }
    public CatalystInstanceImpl$Builder setUniqueId(int p0){
       this.mUniqueId = p0;
       return this;
    }
    public CatalystInstanceImpl$Builder useDeveloperSupport(boolean p0){
       this.mUseDeveloperSupport = p0;
       return this;
    }
}
