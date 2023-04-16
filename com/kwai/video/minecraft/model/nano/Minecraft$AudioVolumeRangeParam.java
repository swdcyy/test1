package com.kwai.video.minecraft.model.nano.Minecraft$AudioVolumeRangeParam;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Double;

public final class Minecraft$AudioVolumeRangeParam extends MutableEffect	// class@000a3f
{

    public void Minecraft$AudioVolumeRangeParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_AudioVolumeRangeParam;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$AudioVolumeRangeParam(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_AudioVolumeRangeParam;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$AudioVolumeRangeParam native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native double native_fadeinDuration(long p0);
    public static native double native_fadeoutDuration(long p0);
    public static native void native_setFadeinDuration(long p0,double p1);
    public static native void native_setFadeoutDuration(long p0,double p1);
    public static native void native_setTimeRange(long p0,Minecraft$Range p1);
    public static native void native_setVolume(long p0,double p1);
    public static native Minecraft$Range native_timeRange(long p0);
    public static native double native_volume(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$AudioVolumeRangeParam.class, "1")) {
          return;
       }
       Minecraft$AudioVolumeRangeParam.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$AudioVolumeRangeParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AudioVolumeRangeParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AudioVolumeRangeParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public double fadeinDuration(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AudioVolumeRangeParam.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$AudioVolumeRangeParam.native_fadeinDuration(this.nativeRef);
    }
    public double fadeoutDuration(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AudioVolumeRangeParam.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$AudioVolumeRangeParam.native_fadeoutDuration(this.nativeRef);
    }
    public native final long native_create();
    public void setFadeinDuration(double p0){
       Minecraft$AudioVolumeRangeParam uAudioVolume = Minecraft$AudioVolumeRangeParam.class;
       if (PatchProxy.isSupport(uAudioVolume) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uAudioVolume, "8")) {
          return;
       }
       Minecraft$AudioVolumeRangeParam.native_setFadeinDuration(this.nativeRef, p0);
       return;
    }
    public void setFadeoutDuration(double p0){
       Minecraft$AudioVolumeRangeParam uAudioVolume = Minecraft$AudioVolumeRangeParam.class;
       if (PatchProxy.isSupport(uAudioVolume) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uAudioVolume, "10")) {
          return;
       }
       Minecraft$AudioVolumeRangeParam.native_setFadeoutDuration(this.nativeRef, p0);
       return;
    }
    public void setTimeRange(Minecraft$Range p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$AudioVolumeRangeParam.class, "4")) {
          return;
       }
       Minecraft$AudioVolumeRangeParam.native_setTimeRange(this.nativeRef, p0);
       return;
    }
    public void setVolume(double p0){
       Minecraft$AudioVolumeRangeParam uAudioVolume = Minecraft$AudioVolumeRangeParam.class;
       if (PatchProxy.isSupport(uAudioVolume) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uAudioVolume, "6")) {
          return;
       }
       Minecraft$AudioVolumeRangeParam.native_setVolume(this.nativeRef, p0);
       return;
    }
    public Minecraft$Range timeRange(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AudioVolumeRangeParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AudioVolumeRangeParam.native_timeRange(this.nativeRef);
    }
    public double volume(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AudioVolumeRangeParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$AudioVolumeRangeParam.native_volume(this.nativeRef);
    }
}
