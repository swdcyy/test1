package com.kwai.video.minecraft.model.nano.Minecraft$VisualEffectCameraMovementParams;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import java.lang.Number;

public final class Minecraft$VisualEffectCameraMovementParams extends MutableEffect	// class@000a95
{

    public void Minecraft$VisualEffectCameraMovementParams(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_VisualEffectCameraMovementParams;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$VisualEffectCameraMovementParams(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_VisualEffectCameraMovementParams;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$VisualEffectCameraMovementParams native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setStartBoxH(long p0,float p1);
    public static native void native_setStartBoxW(long p0,float p1);
    public static native void native_setStartX(long p0,float p1);
    public static native void native_setStartY(long p0,float p1);
    public static native void native_setTargetBoxH(long p0,float p1);
    public static native void native_setTargetBoxW(long p0,float p1);
    public static native void native_setTargetX(long p0,float p1);
    public static native void native_setTargetY(long p0,float p1);
    public static native float native_startBoxH(long p0);
    public static native float native_startBoxW(long p0);
    public static native float native_startX(long p0);
    public static native float native_startY(long p0);
    public static native float native_targetBoxH(long p0);
    public static native float native_targetBoxW(long p0);
    public static native float native_targetX(long p0);
    public static native float native_targetY(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$VisualEffectCameraMovementParams.class, "1")) {
          return;
       }
       Minecraft$VisualEffectCameraMovementParams.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$VisualEffectCameraMovementParams clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$VisualEffectCameraMovementParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$VisualEffectCameraMovementParams.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setStartBoxH(float p0){
       Minecraft$VisualEffectCameraMovementParams visualEffect = Minecraft$VisualEffectCameraMovementParams.class;
       if (PatchProxy.isSupport(visualEffect) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, visualEffect, "10")) {
          return;
       }
       Minecraft$VisualEffectCameraMovementParams.native_setStartBoxH(this.nativeRef, p0);
       return;
    }
    public void setStartBoxW(float p0){
       Minecraft$VisualEffectCameraMovementParams visualEffect = Minecraft$VisualEffectCameraMovementParams.class;
       if (PatchProxy.isSupport(visualEffect) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, visualEffect, "8")) {
          return;
       }
       Minecraft$VisualEffectCameraMovementParams.native_setStartBoxW(this.nativeRef, p0);
       return;
    }
    public void setStartX(float p0){
       Minecraft$VisualEffectCameraMovementParams visualEffect = Minecraft$VisualEffectCameraMovementParams.class;
       if (PatchProxy.isSupport(visualEffect) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, visualEffect, "4")) {
          return;
       }
       Minecraft$VisualEffectCameraMovementParams.native_setStartX(this.nativeRef, p0);
       return;
    }
    public void setStartY(float p0){
       Minecraft$VisualEffectCameraMovementParams visualEffect = Minecraft$VisualEffectCameraMovementParams.class;
       if (PatchProxy.isSupport(visualEffect) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, visualEffect, "6")) {
          return;
       }
       Minecraft$VisualEffectCameraMovementParams.native_setStartY(this.nativeRef, p0);
       return;
    }
    public void setTargetBoxH(float p0){
       Minecraft$VisualEffectCameraMovementParams visualEffect = Minecraft$VisualEffectCameraMovementParams.class;
       if (PatchProxy.isSupport(visualEffect) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, visualEffect, "18")) {
          return;
       }
       Minecraft$VisualEffectCameraMovementParams.native_setTargetBoxH(this.nativeRef, p0);
       return;
    }
    public void setTargetBoxW(float p0){
       Minecraft$VisualEffectCameraMovementParams visualEffect = Minecraft$VisualEffectCameraMovementParams.class;
       if (PatchProxy.isSupport(visualEffect) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, visualEffect, "16")) {
          return;
       }
       Minecraft$VisualEffectCameraMovementParams.native_setTargetBoxW(this.nativeRef, p0);
       return;
    }
    public void setTargetX(float p0){
       Minecraft$VisualEffectCameraMovementParams visualEffect = Minecraft$VisualEffectCameraMovementParams.class;
       if (PatchProxy.isSupport(visualEffect) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, visualEffect, "12")) {
          return;
       }
       Minecraft$VisualEffectCameraMovementParams.native_setTargetX(this.nativeRef, p0);
       return;
    }
    public void setTargetY(float p0){
       Minecraft$VisualEffectCameraMovementParams visualEffect = Minecraft$VisualEffectCameraMovementParams.class;
       if (PatchProxy.isSupport(visualEffect) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, visualEffect, "14")) {
          return;
       }
       Minecraft$VisualEffectCameraMovementParams.native_setTargetY(this.nativeRef, p0);
       return;
    }
    public float startBoxH(){
       Object obj = PatchProxy.apply(null, this, Minecraft$VisualEffectCameraMovementParams.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$VisualEffectCameraMovementParams.native_startBoxH(this.nativeRef);
    }
    public float startBoxW(){
       Object obj = PatchProxy.apply(null, this, Minecraft$VisualEffectCameraMovementParams.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$VisualEffectCameraMovementParams.native_startBoxW(this.nativeRef);
    }
    public float startX(){
       Object obj = PatchProxy.apply(null, this, Minecraft$VisualEffectCameraMovementParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$VisualEffectCameraMovementParams.native_startX(this.nativeRef);
    }
    public float startY(){
       Object obj = PatchProxy.apply(null, this, Minecraft$VisualEffectCameraMovementParams.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$VisualEffectCameraMovementParams.native_startY(this.nativeRef);
    }
    public float targetBoxH(){
       Object obj = PatchProxy.apply(null, this, Minecraft$VisualEffectCameraMovementParams.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$VisualEffectCameraMovementParams.native_targetBoxH(this.nativeRef);
    }
    public float targetBoxW(){
       Object obj = PatchProxy.apply(null, this, Minecraft$VisualEffectCameraMovementParams.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$VisualEffectCameraMovementParams.native_targetBoxW(this.nativeRef);
    }
    public float targetX(){
       Object obj = PatchProxy.apply(null, this, Minecraft$VisualEffectCameraMovementParams.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$VisualEffectCameraMovementParams.native_targetX(this.nativeRef);
    }
    public float targetY(){
       Object obj = PatchProxy.apply(null, this, Minecraft$VisualEffectCameraMovementParams.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$VisualEffectCameraMovementParams.native_targetY(this.nativeRef);
    }
}
