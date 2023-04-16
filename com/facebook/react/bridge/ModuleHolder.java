package com.facebook.react.bridge.ModuleHolder;
import java.util.concurrent.atomic.AtomicInteger;
import com.facebook.react.bridge.NativeModule;
import java.lang.Object;
import java.lang.String;
import com.facebook.react.module.model.ReactModuleInfo;
import java.lang.Class;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import mb.b;
import mb.c;
import nb.a;
import lb.a;
import javax.inject.Provider;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMarker;
import java.lang.StringBuilder;
import hg.b$b;
import hg.b;
import od.a;
import java.lang.Throwable;
import cb.a;
import java.lang.Enum;
import java.lang.Boolean;

public class ModuleHolder	// class@001205
{
    public boolean mInitializable;
    public final int mInstanceKey;
    public boolean mIsCreating;
    public boolean mIsInitializing;
    public NativeModule mModule;
    public final String mName;
    public Provider mProvider;
    public final ReactModuleInfo mReactModuleInfo;
    public final int mUniqueId;
    public static final AtomicInteger sInstanceKeyCounter;

    static {
       ModuleHolder.sInstanceKeyCounter = new AtomicInteger(1);
    }
    public void ModuleHolder(NativeModule p0,int p1){
       super();
       this.mInstanceKey = ModuleHolder.sInstanceKeyCounter.getAndIncrement();
       this.mUniqueId = p1;
       String name = p0.getName();
       this.mName = name;
       ReactModuleInfo reactModuleI = new ReactModuleInfo(p0.getName(), p0.getClass().getSimpleName(), p0.canOverrideExistingModule(), true, true, CxxModuleWrapper.class.isAssignableFrom(p0.getClass()), TurboModule.class.isAssignableFrom(p0.getClass()));
       this.mReactModuleInfo = v8;
       this.mModule = p0;
       Object[] objArray = new Object[]{name};
       c.a().c(a.e, "NativeModule init: %s", objArray);
    }
    public void ModuleHolder(ReactModuleInfo p0,Provider p1,int p2){
       super();
       this.mInstanceKey = ModuleHolder.sInstanceKeyCounter.getAndIncrement();
       this.mUniqueId = p2;
       this.mName = p0.b();
       this.mProvider = p1;
       this.mReactModuleInfo = p0;
       if (p0.c()) {
          this.mModule = this.create();
       }
       return;
    }
    public final NativeModule create(){
       Object[] objArray = null;
       ModuleHolder obj = PatchProxy.apply(objArray, this, ModuleHolder.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 1;
       int i1 = 0;
       boolean b = (this.mModule == null)? true: false;
       SoftAssertions.assertCondition(b, "Creating an already created module.");
       ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, this.mName, this.mInstanceKey);
       b.a(0, "ModuleHolder.createModule:"+this.mName).d("name", this.mName).e();
       Object[] objArray1 = new Object[i];
       objArray1[i1] = this.mName;
       c.a().c(a.e, "NativeModule init: %s", objArray1);
       obj = this.mProvider;
       a.c(obj);
       NativeModule nativeModule = obj.get();
       this.mProvider = objArray;
       _monitor_enter(this);
       this.mModule = nativeModule;
       if (this.mInitializable == null || this.mIsInitializing != null) {
          i = 0;
       }
       _monitor_exit(this);
       if (i) {
          this.doInitialize(nativeModule);
       }
       ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END, this.mName, this.mInstanceKey);
       b.b(0, "ModuleHolder.createModule:"+this.mName).e();
       return nativeModule;
    }
    public synchronized void destroy(){
       if (PatchProxy.applyVoid(null, this, ModuleHolder.class, "2")) {
          return;
       }
       ModuleHolder tmModule = this.mModule;
       if (tmModule != null) {
          tmModule.onCatalystInstanceDestroy();
       }
       return;
    }
    public final void doInitialize(NativeModule p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, ModuleHolder.class, "10")) {
          return;
       }
       b.a(0, "ModuleHolder.initialize:"+this.mName).d("name", this.mName).e();
       ReactMarker.logMarkerWithUniqueId(ReactMarkerConstants.INITIALIZE_MODULE_START.name(), this.mName, this.mInstanceKey, this.mUniqueId);
       _monitor_enter(this);
       b = true;
       boolean b1 = false;
       if (this.mInitializable != null && this.mIsInitializing == null) {
          this.mIsInitializing = b;
       }else {
          b = false;
       }
       _monitor_exit(this);
       if (b) {
          p0.initialize();
          _monitor_enter(this);
          this.mIsInitializing = b1;
          _monitor_exit(this);
       }
       ReactMarker.logMarkerWithUniqueId(ReactMarkerConstants.INITIALIZE_MODULE_END.name(), this.mName, this.mInstanceKey, this.mUniqueId);
       b.b(0, "ModuleHolder.initialize:"+this.mName).e();
       return;
    }
    public boolean getCanOverrideExistingModule(){
       Object obj = PatchProxy.apply(null, this, ModuleHolder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mReactModuleInfo.b;
    }
    public String getClassName(){
       Object obj = PatchProxy.apply(null, this, ModuleHolder.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mReactModuleInfo.f;
    }
    public boolean getHasConstants(){
       Object obj = PatchProxy.apply(null, this, ModuleHolder.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mReactModuleInfo.d;
    }
    public NativeModule getModule(){
       ModuleHolder obj = PatchProxy.apply(null, this, ModuleHolder.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       _monitor_enter(this);
       obj = this.mModule;
       if (obj != null) {
          _monitor_exit(this);
          return obj;
       }else {
          boolean b = true;
          if (this.mIsCreating == null) {
             this.mIsCreating = b;
          }else {
             b = false;
          }
          _monitor_exit(this);
          if (b) {
             _monitor_enter(this);
             this.mIsCreating = false;
             this.notifyAll();
             _monitor_exit(this);
             return this.create();
          }else {
             _monitor_enter(this);
             try{
                obj = this.mModule;
                while (obj == null && this.mIsCreating != null) {
                   this.wait();
                }
                a.c(obj);
                _monitor_exit(this);
                return obj;
             }catch(java.lang.InterruptedException e0){
             }
          }
       }
    }
    public String getName(){
       return this.mName;
    }
    public synchronized boolean hasInstance(){
       boolean b = (this.mModule != null)? true: false;
       return b;
    }
    public boolean isCxxModule(){
       Object obj = PatchProxy.apply(null, this, ModuleHolder.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mReactModuleInfo.e;
    }
    public boolean isTurboModule(){
       Object obj = PatchProxy.apply(null, this, ModuleHolder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mReactModuleInfo.a();
    }
    public void markInitializable(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ModuleHolder.class, "1")) {
          return;
       }
       _monitor_enter(this);
       boolean b = true;
       this.mInitializable = b;
       boolean b1 = false;
       if (this.mModule != null) {
          if (this.mIsInitializing == null) {
             b1 = true;
          }
          a.a(b1);
          objArray = this.mModule;
       }else {
          b = false;
       }
       _monitor_exit(this);
       if (b) {
          this.doInitialize(objArray);
       }
       return;
    }
}
