package com.kwai.video.minecraft.model.nano.Minecraft$PaddingAreaOptions;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.nano.Minecraft$Color;
import com.kwai.video.minecraft.model.nano.Minecraft$BlurOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$PaddingAreaImageOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$GradientColorOptions;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class Minecraft$PaddingAreaOptions extends MutableEffect	// class@000a63
{

    public void Minecraft$PaddingAreaOptions(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_PaddingAreaOptions;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$PaddingAreaOptions(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_PaddingAreaOptions;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$PaddingAreaOptions native_clone(long p0);
    public static native Minecraft$Color native_color(long p0);
    public static native Minecraft$BlurOptions native_currentFrameBlurOptions(long p0);
    public static native void native_destroy(long p0);
    public static native Minecraft$PaddingAreaImageOptions native_image(long p0);
    public static native void native_setColor(long p0,Minecraft$Color p1);
    public static native void native_setCurrentFrameBlurOptions(long p0,Minecraft$BlurOptions p1);
    public static native void native_setGradientColor(long p0,Minecraft$GradientColorOptions p1);
    public static native void native_setImage(long p0,Minecraft$PaddingAreaImageOptions p1);
    public static native void native_setUseCurrentFrame(long p0,boolean p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$PaddingAreaOptions.class, "1")) {
          return;
       }
       Minecraft$PaddingAreaOptions.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$PaddingAreaOptions clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$PaddingAreaOptions.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$PaddingAreaOptions.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public Minecraft$Color color(){
       Object obj = PatchProxy.apply(null, this, Minecraft$PaddingAreaOptions.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$PaddingAreaOptions.native_color(this.nativeRef);
    }
    public Minecraft$BlurOptions currentFrameBlurOptions(){
       Object obj = PatchProxy.apply(null, this, Minecraft$PaddingAreaOptions.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$PaddingAreaOptions.native_currentFrameBlurOptions(this.nativeRef);
    }
    public Minecraft$PaddingAreaImageOptions image(){
       Object obj = PatchProxy.apply(null, this, Minecraft$PaddingAreaOptions.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$PaddingAreaOptions.native_image(this.nativeRef);
    }
    public native final long native_create();
    public void setColor(Minecraft$Color p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$PaddingAreaOptions.class, "4")) {
          return;
       }
       Minecraft$PaddingAreaOptions.native_setColor(this.nativeRef, p0);
       return;
    }
    public void setCurrentFrameBlurOptions(Minecraft$BlurOptions p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$PaddingAreaOptions.class, "8")) {
          return;
       }
       Minecraft$PaddingAreaOptions.native_setCurrentFrameBlurOptions(this.nativeRef, p0);
       return;
    }
    public void setGradientColor(Minecraft$GradientColorOptions p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$PaddingAreaOptions.class, "9")) {
          return;
       }
       Minecraft$PaddingAreaOptions.native_setGradientColor(this.nativeRef, p0);
       return;
    }
    public void setImage(Minecraft$PaddingAreaImageOptions p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$PaddingAreaOptions.class, "6")) {
          return;
       }
       Minecraft$PaddingAreaOptions.native_setImage(this.nativeRef, p0);
       return;
    }
    public void setUseCurrentFrame(boolean p0){
       Minecraft$PaddingAreaOptions paddingAreaO = Minecraft$PaddingAreaOptions.class;
       if (PatchProxy.isSupport(paddingAreaO) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, paddingAreaO, "10")) {
          return;
       }
       Minecraft$PaddingAreaOptions.native_setUseCurrentFrame(this.nativeRef, p0);
       return;
    }
}
