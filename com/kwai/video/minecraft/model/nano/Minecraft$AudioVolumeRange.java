package com.kwai.video.minecraft.model.nano.Minecraft$AudioVolumeRange;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Double;

public final class Minecraft$AudioVolumeRange extends ModelBase	// class@000a3e
{

    public void Minecraft$AudioVolumeRange(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$AudioVolumeRange(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$AudioVolumeRange native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native double native_fadeTime(long p0);
    public static native void native_setFadeTime(long p0,double p1);
    public static native void native_setTimeRange(long p0,Minecraft$Range p1);
    public static native void native_setVolume(long p0,double p1);
    public static native Minecraft$Range native_timeRange(long p0);
    public static native double native_volume(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$AudioVolumeRange.class, "1")) {
          return;
       }
       Minecraft$AudioVolumeRange.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$AudioVolumeRange clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AudioVolumeRange.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AudioVolumeRange.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public double fadeTime(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AudioVolumeRange.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$AudioVolumeRange.native_fadeTime(this.nativeRef);
    }
    public native final long native_create();
    public void setFadeTime(double p0){
       Minecraft$AudioVolumeRange uAudioVolume = Minecraft$AudioVolumeRange.class;
       if (PatchProxy.isSupport(uAudioVolume) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uAudioVolume, "8")) {
          return;
       }
       Minecraft$AudioVolumeRange.native_setFadeTime(this.nativeRef, p0);
       return;
    }
    public void setTimeRange(Minecraft$Range p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$AudioVolumeRange.class, "4")) {
          return;
       }
       Minecraft$AudioVolumeRange.native_setTimeRange(this.nativeRef, p0);
       return;
    }
    public void setVolume(double p0){
       Minecraft$AudioVolumeRange uAudioVolume = Minecraft$AudioVolumeRange.class;
       if (PatchProxy.isSupport(uAudioVolume) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uAudioVolume, "6")) {
          return;
       }
       Minecraft$AudioVolumeRange.native_setVolume(this.nativeRef, p0);
       return;
    }
    public Minecraft$Range timeRange(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AudioVolumeRange.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AudioVolumeRange.native_timeRange(this.nativeRef);
    }
    public double volume(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AudioVolumeRange.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$AudioVolumeRange.native_volume(this.nativeRef);
    }
}
