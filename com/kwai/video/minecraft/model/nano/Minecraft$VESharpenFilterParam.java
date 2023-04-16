package com.kwai.video.minecraft.model.nano.Minecraft$VESharpenFilterParam;
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
import java.lang.Integer;

public final class Minecraft$VESharpenFilterParam extends MutableEffect	// class@000a8e
{

    public void Minecraft$VESharpenFilterParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_VESharpenFilterParam;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$VESharpenFilterParam(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_VESharpenFilterParam;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$VESharpenFilterParam native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setIntensity(long p0,float p1);
    public static native void native_setPerformance(long p0,int p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$VESharpenFilterParam.class, "1")) {
          return;
       }
       Minecraft$VESharpenFilterParam.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$VESharpenFilterParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$VESharpenFilterParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$VESharpenFilterParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setIntensity(float p0){
       Minecraft$VESharpenFilterParam vESharpenFil = Minecraft$VESharpenFilterParam.class;
       if (PatchProxy.isSupport(vESharpenFil) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, vESharpenFil, "3")) {
          return;
       }
       Minecraft$VESharpenFilterParam.native_setIntensity(this.nativeRef, p0);
       return;
    }
    public void setPerformance(int p0){
       Minecraft$VESharpenFilterParam vESharpenFil = Minecraft$VESharpenFilterParam.class;
       if (PatchProxy.isSupport(vESharpenFil) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, vESharpenFil, "4")) {
          return;
       }
       Minecraft$VESharpenFilterParam.native_setPerformance(this.nativeRef, p0);
       return;
    }
}
