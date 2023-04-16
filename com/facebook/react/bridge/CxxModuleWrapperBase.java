package com.facebook.react.bridge.CxxModuleWrapperBase;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactBridge;
import com.facebook.jni.HybridData;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class CxxModuleWrapperBase implements NativeModule	// class@0011b8
{
    public HybridData mHybridData;

    static {
       ReactBridge.staticInit();
    }
    public void CxxModuleWrapperBase(HybridData p0){
       super();
       this.mHybridData = p0;
    }
    public boolean canOverrideExistingModule(){
       return false;
    }
    public native String getName();
    public void initialize(){
    }
    public void onCatalystInstanceDestroy(){
       if (PatchProxy.applyVoid(null, this, CxxModuleWrapperBase.class, "1")) {
          return;
       }
       this.mHybridData.a();
       return;
    }
    public void resetModule(HybridData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CxxModuleWrapperBase.class, "2")) {
          return;
       }
       CxxModuleWrapperBase tmHybridData = this.mHybridData;
       if (p0 != tmHybridData) {
          tmHybridData.a();
          this.mHybridData = p0;
       }
       return;
    }
}
