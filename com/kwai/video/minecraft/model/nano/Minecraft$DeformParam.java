package com.kwai.video.minecraft.model.nano.Minecraft$DeformParam;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Float;
import java.lang.Integer;

public final class Minecraft$DeformParam extends MutableEffect	// class@000a4c
{

    public void Minecraft$DeformParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_DeformParam;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$DeformParam(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_DeformParam;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$DeformParam native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native float native_intensity(long p0);
    public static native int native_mode(long p0);
    public static native void native_setIntensity(long p0,float p1);
    public static native void native_setMode(long p0,int p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$DeformParam.class, "1")) {
          return;
       }
       Minecraft$DeformParam.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$DeformParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$DeformParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$DeformParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public float intensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$DeformParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$DeformParam.native_intensity(this.nativeRef);
    }
    public int mode(){
       Object obj = PatchProxy.apply(null, this, Minecraft$DeformParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$DeformParam.native_mode(this.nativeRef);
    }
    public native final long native_create();
    public void setIntensity(float p0){
       Minecraft$DeformParam uDeformParam = Minecraft$DeformParam.class;
       if (PatchProxy.isSupport(uDeformParam) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uDeformParam, "6")) {
          return;
       }
       Minecraft$DeformParam.native_setIntensity(this.nativeRef, p0);
       return;
    }
    public void setMode(int p0){
       Minecraft$DeformParam uDeformParam = Minecraft$DeformParam.class;
       if (PatchProxy.isSupport(uDeformParam) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uDeformParam, "4")) {
          return;
       }
       Minecraft$DeformParam.native_setMode(this.nativeRef, p0);
       return;
    }
}
