package com.kwai.video.minecraft.model.nano.Minecraft$VisualEffectParam;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.nano.Minecraft$VisualEffectCameraMovementParams;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Integer;

public final class Minecraft$VisualEffectParam extends MutableEffect	// class@000a96
{

    public void Minecraft$VisualEffectParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_VisualEffectParam;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$VisualEffectParam(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_VisualEffectParam;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$VisualEffectParam native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native Minecraft$VisualEffectCameraMovementParams native_getCameraMovementParams(long p0);
    public static native int native_getVisualEffectParamsCase(long p0);
    public static native long native_id(long p0);
    public static native Minecraft$Range native_range(long p0);
    public static native void native_setCameraMovementParams(long p0,Minecraft$VisualEffectCameraMovementParams p1);
    public static native void native_setId(long p0,long p1);
    public static native void native_setRange(long p0,Minecraft$Range p1);
    public static native void native_setVisualEffectType(long p0,int p1);
    public static native int native_visualEffectType(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$VisualEffectParam.class, "1")) {
          return;
       }
       Minecraft$VisualEffectParam.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$VisualEffectParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$VisualEffectParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$VisualEffectParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public Minecraft$VisualEffectCameraMovementParams getCameraMovementParams(){
       Object obj = PatchProxy.apply(null, this, Minecraft$VisualEffectParam.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.hasCameraMovementParams()) {
          return Minecraft$VisualEffectParam.native_getCameraMovementParams(this.nativeRef);
       }
       return null;
    }
    public int getVisualEffectParamsCase(){
       Object obj = PatchProxy.apply(null, this, Minecraft$VisualEffectParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$VisualEffectParam.native_getVisualEffectParamsCase(this.nativeRef);
    }
    public boolean hasCameraMovementParams(){
       Object obj = PatchProxy.apply(null, this, Minecraft$VisualEffectParam.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getVisualEffectParamsCase() == 4)? true: false;
       return b;
    }
    public long id(){
       Object obj = PatchProxy.apply(null, this, Minecraft$VisualEffectParam.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return Minecraft$VisualEffectParam.native_id(this.nativeRef);
    }
    public native final long native_create();
    public Minecraft$Range range(){
       Object obj = PatchProxy.apply(null, this, Minecraft$VisualEffectParam.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$VisualEffectParam.native_range(this.nativeRef);
    }
    public void setCameraMovementParams(Minecraft$VisualEffectCameraMovementParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$VisualEffectParam.class, "12")) {
          return;
       }
       Minecraft$VisualEffectParam.native_setCameraMovementParams(this.nativeRef, p0);
       return;
    }
    public void setId(long p0){
       Minecraft$VisualEffectParam visualEffect = Minecraft$VisualEffectParam.class;
       if (PatchProxy.isSupport(visualEffect) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, visualEffect, "9")) {
          return;
       }
       Minecraft$VisualEffectParam.native_setId(this.nativeRef, p0);
       return;
    }
    public void setRange(Minecraft$Range p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$VisualEffectParam.class, "5")) {
          return;
       }
       Minecraft$VisualEffectParam.native_setRange(this.nativeRef, p0);
       return;
    }
    public void setVisualEffectType(int p0){
       Minecraft$VisualEffectParam visualEffect = Minecraft$VisualEffectParam.class;
       if (PatchProxy.isSupport(visualEffect) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, visualEffect, "7")) {
          return;
       }
       Minecraft$VisualEffectParam.native_setVisualEffectType(this.nativeRef, p0);
       return;
    }
    public int visualEffectType(){
       Object obj = PatchProxy.apply(null, this, Minecraft$VisualEffectParam.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$VisualEffectParam.native_visualEffectType(this.nativeRef);
    }
}
