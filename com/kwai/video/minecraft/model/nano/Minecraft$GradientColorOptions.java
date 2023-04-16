package com.kwai.video.minecraft.model.nano.Minecraft$GradientColorOptions;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.minecraft.model.nano.Minecraft$Color;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.lang.Float;

public final class Minecraft$GradientColorOptions extends MutableEffect	// class@000a53
{

    public void Minecraft$GradientColorOptions(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_GradientColorOptions;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$GradientColorOptions(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_GradientColorOptions;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$GradientColorOptions native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setColors(long p0,ArrayList p1);
    public static native void native_setEndPosX(long p0,float p1);
    public static native void native_setEndPosY(long p0,float p1);
    public static native void native_setStartPosX(long p0,float p1);
    public static native void native_setStartPosY(long p0,float p1);
    public static native void native_setStops(long p0,ArrayList p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$GradientColorOptions.class, "1")) {
          return;
       }
       Minecraft$GradientColorOptions.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$GradientColorOptions clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$GradientColorOptions.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$GradientColorOptions.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setColors(Minecraft$Color[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$GradientColorOptions.class, "7")) {
          return;
       }
       Minecraft$GradientColorOptions.native_setColors(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setEndPosX(float p0){
       Minecraft$GradientColorOptions gradientColo = Minecraft$GradientColorOptions.class;
       if (PatchProxy.isSupport(gradientColo) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, gradientColo, "5")) {
          return;
       }
       Minecraft$GradientColorOptions.native_setEndPosX(this.nativeRef, p0);
       return;
    }
    public void setEndPosY(float p0){
       Minecraft$GradientColorOptions gradientColo = Minecraft$GradientColorOptions.class;
       if (PatchProxy.isSupport(gradientColo) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, gradientColo, "6")) {
          return;
       }
       Minecraft$GradientColorOptions.native_setEndPosY(this.nativeRef, p0);
       return;
    }
    public void setStartPosX(float p0){
       Minecraft$GradientColorOptions gradientColo = Minecraft$GradientColorOptions.class;
       if (PatchProxy.isSupport(gradientColo) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, gradientColo, "3")) {
          return;
       }
       Minecraft$GradientColorOptions.native_setStartPosX(this.nativeRef, p0);
       return;
    }
    public void setStartPosY(float p0){
       Minecraft$GradientColorOptions gradientColo = Minecraft$GradientColorOptions.class;
       if (PatchProxy.isSupport(gradientColo) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, gradientColo, "4")) {
          return;
       }
       Minecraft$GradientColorOptions.native_setStartPosY(this.nativeRef, p0);
       return;
    }
    public void setStops(Float[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$GradientColorOptions.class, "8")) {
          return;
       }
       Minecraft$GradientColorOptions.native_setStops(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
}
