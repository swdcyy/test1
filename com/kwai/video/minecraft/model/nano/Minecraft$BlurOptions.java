package com.kwai.video.minecraft.model.nano.Minecraft$BlurOptions;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Double;
import java.lang.Integer;

public final class Minecraft$BlurOptions extends MutableEffect	// class@000a44
{

    public void Minecraft$BlurOptions(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_BlurOptions;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$BlurOptions(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_BlurOptions;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$BlurOptions native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setGaussianBlurRadius(long p0,double p1);
    public static native void native_setType(long p0,int p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$BlurOptions.class, "1")) {
          return;
       }
       Minecraft$BlurOptions.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$BlurOptions clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$BlurOptions.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$BlurOptions.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setGaussianBlurRadius(double p0){
       Minecraft$BlurOptions uBlurOptions = Minecraft$BlurOptions.class;
       if (PatchProxy.isSupport(uBlurOptions) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uBlurOptions, "4")) {
          return;
       }
       Minecraft$BlurOptions.native_setGaussianBlurRadius(this.nativeRef, p0);
       return;
    }
    public void setType(int p0){
       Minecraft$BlurOptions uBlurOptions = Minecraft$BlurOptions.class;
       if (PatchProxy.isSupport(uBlurOptions) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBlurOptions, "3")) {
          return;
       }
       Minecraft$BlurOptions.native_setType(this.nativeRef, p0);
       return;
    }
}
