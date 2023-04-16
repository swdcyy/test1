package com.kwai.video.minecraft.model.nano.Minecraft$TimeEffectParam;
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
import java.lang.Integer;
import java.lang.Double;
import java.lang.Long;

public final class Minecraft$TimeEffectParam extends MutableEffect	// class@000a81
{

    public void Minecraft$TimeEffectParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_TimeEffectParam;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$TimeEffectParam(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_TimeEffectParam;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$TimeEffectParam native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native int native_effectRepeatTimes(long p0);
    public static native double native_effectSlowSpeed(long p0);
    public static native Minecraft$Range native_range(long p0);
    public static native void native_setEffectRepeatTimes(long p0,int p1);
    public static native void native_setEffectSlowSpeed(long p0,double p1);
    public static native void native_setId(long p0,long p1);
    public static native void native_setRange(long p0,Minecraft$Range p1);
    public static native void native_setTimeEffectType(long p0,int p1);
    public static native int native_timeEffectType(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$TimeEffectParam.class, "1")) {
          return;
       }
       Minecraft$TimeEffectParam.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$TimeEffectParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TimeEffectParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TimeEffectParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public int effectRepeatTimes(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TimeEffectParam.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$TimeEffectParam.native_effectRepeatTimes(this.nativeRef);
    }
    public double effectSlowSpeed(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TimeEffectParam.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$TimeEffectParam.native_effectSlowSpeed(this.nativeRef);
    }
    public native final long native_create();
    public Minecraft$Range range(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TimeEffectParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TimeEffectParam.native_range(this.nativeRef);
    }
    public void setEffectRepeatTimes(int p0){
       Minecraft$TimeEffectParam timeEffectPa = Minecraft$TimeEffectParam.class;
       if (PatchProxy.isSupport(timeEffectPa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, timeEffectPa, "10")) {
          return;
       }
       Minecraft$TimeEffectParam.native_setEffectRepeatTimes(this.nativeRef, p0);
       return;
    }
    public void setEffectSlowSpeed(double p0){
       Minecraft$TimeEffectParam timeEffectPa = Minecraft$TimeEffectParam.class;
       if (PatchProxy.isSupport(timeEffectPa) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, timeEffectPa, "8")) {
          return;
       }
       Minecraft$TimeEffectParam.native_setEffectSlowSpeed(this.nativeRef, p0);
       return;
    }
    public void setId(long p0){
       Minecraft$TimeEffectParam timeEffectPa = Minecraft$TimeEffectParam.class;
       if (PatchProxy.isSupport(timeEffectPa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, timeEffectPa, "11")) {
          return;
       }
       Minecraft$TimeEffectParam.native_setId(this.nativeRef, p0);
       return;
    }
    public void setRange(Minecraft$Range p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TimeEffectParam.class, "4")) {
          return;
       }
       Minecraft$TimeEffectParam.native_setRange(this.nativeRef, p0);
       return;
    }
    public void setTimeEffectType(int p0){
       Minecraft$TimeEffectParam timeEffectPa = Minecraft$TimeEffectParam.class;
       if (PatchProxy.isSupport(timeEffectPa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, timeEffectPa, "6")) {
          return;
       }
       Minecraft$TimeEffectParam.native_setTimeEffectType(this.nativeRef, p0);
       return;
    }
    public int timeEffectType(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TimeEffectParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$TimeEffectParam.native_timeEffectType(this.nativeRef);
    }
}
