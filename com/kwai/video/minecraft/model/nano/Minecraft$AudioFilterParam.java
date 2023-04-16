package com.kwai.video.minecraft.model.nano.Minecraft$AudioFilterParam;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Double;

public final class Minecraft$AudioFilterParam extends MutableEffect	// class@000a39
{

    public void Minecraft$AudioFilterParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_AudioFilterParam;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$AudioFilterParam(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_AudioFilterParam;
       NativeObjectManager.register(this, p0);
    }
    public static native int native_audioChangeType(long p0);
    public static native void native_clear(long p0);
    public static native Minecraft$AudioFilterParam native_clone(long p0);
    public static native String native_denoiseModelDir(long p0);
    public static native void native_destroy(long p0);
    public static native int native_getTargetLoudnessOneofCase(long p0);
    public static native void native_setAgcTargetEnergy(long p0,int p1);
    public static native void native_setAudioChangeType(long p0,int p1);
    public static native void native_setAudioEffectType(long p0,int p1);
    public static native void native_setDenoiseModelDir(long p0,String p1);
    public static native void native_setEnableAgc(long p0,boolean p1);
    public static native void native_setEnableAutoGain(long p0,boolean p1);
    public static native void native_setEnableDenoise(long p0,boolean p1);
    public static native void native_setId(long p0,long p1);
    public static native void native_setLoudness(long p0,double p1);
    public static native void native_setNoiseLevel(long p0,int p1);
    public static native void native_setOriginAudioMaxValue(long p0,int p1);
    public static native void native_setPitch(long p0,int p1);
    public static native void native_setQualityLevel(long p0,int p1);
    public static native void native_setTimbre(long p0,int p1);
    public int audioChangeType(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AudioFilterParam.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$AudioFilterParam.native_audioChangeType(this.nativeRef);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$AudioFilterParam.class, "1")) {
          return;
       }
       Minecraft$AudioFilterParam.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$AudioFilterParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AudioFilterParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AudioFilterParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public String denoiseModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AudioFilterParam.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AudioFilterParam.native_denoiseModelDir(this.nativeRef);
    }
    public int getTargetLoudnessOneofCase(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AudioFilterParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$AudioFilterParam.native_getTargetLoudnessOneofCase(this.nativeRef);
    }
    public boolean hasTargetLoudness(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AudioFilterParam.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getTargetLoudnessOneofCase() == 19)? true: false;
       return b;
    }
    public native final long native_create();
    public void setAgcTargetEnergy(int p0){
       Minecraft$AudioFilterParam uAudioFilter = Minecraft$AudioFilterParam.class;
       if (PatchProxy.isSupport(uAudioFilter) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAudioFilter, "10")) {
          return;
       }
       Minecraft$AudioFilterParam.native_setAgcTargetEnergy(this.nativeRef, p0);
       return;
    }
    public void setAudioChangeType(int p0){
       Minecraft$AudioFilterParam uAudioFilter = Minecraft$AudioFilterParam.class;
       if (PatchProxy.isSupport(uAudioFilter) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAudioFilter, "5")) {
          return;
       }
       Minecraft$AudioFilterParam.native_setAudioChangeType(this.nativeRef, p0);
       return;
    }
    public void setAudioEffectType(int p0){
       Minecraft$AudioFilterParam uAudioFilter = Minecraft$AudioFilterParam.class;
       if (PatchProxy.isSupport(uAudioFilter) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAudioFilter, "6")) {
          return;
       }
       Minecraft$AudioFilterParam.native_setAudioEffectType(this.nativeRef, p0);
       return;
    }
    public void setDenoiseModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$AudioFilterParam.class, "20")) {
          return;
       }
       Minecraft$AudioFilterParam.native_setDenoiseModelDir(this.nativeRef, p0);
       return;
    }
    public void setEnableAgc(boolean p0){
       Minecraft$AudioFilterParam uAudioFilter = Minecraft$AudioFilterParam.class;
       if (PatchProxy.isSupport(uAudioFilter) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAudioFilter, "8")) {
          return;
       }
       Minecraft$AudioFilterParam.native_setEnableAgc(this.nativeRef, p0);
       return;
    }
    public void setEnableAutoGain(boolean p0){
       Minecraft$AudioFilterParam uAudioFilter = Minecraft$AudioFilterParam.class;
       if (PatchProxy.isSupport(uAudioFilter) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAudioFilter, "16")) {
          return;
       }
       Minecraft$AudioFilterParam.native_setEnableAutoGain(this.nativeRef, p0);
       return;
    }
    public void setEnableDenoise(boolean p0){
       Minecraft$AudioFilterParam uAudioFilter = Minecraft$AudioFilterParam.class;
       if (PatchProxy.isSupport(uAudioFilter) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAudioFilter, "7")) {
          return;
       }
       Minecraft$AudioFilterParam.native_setEnableDenoise(this.nativeRef, p0);
       return;
    }
    public void setId(long p0){
       Minecraft$AudioFilterParam uAudioFilter = Minecraft$AudioFilterParam.class;
       if (PatchProxy.isSupport(uAudioFilter) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAudioFilter, "9")) {
          return;
       }
       Minecraft$AudioFilterParam.native_setId(this.nativeRef, p0);
       return;
    }
    public void setLoudness(double p0){
       Minecraft$AudioFilterParam uAudioFilter = Minecraft$AudioFilterParam.class;
       if (PatchProxy.isSupport(uAudioFilter) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uAudioFilter, "17")) {
          return;
       }
       Minecraft$AudioFilterParam.native_setLoudness(this.nativeRef, p0);
       return;
    }
    public void setNoiseLevel(int p0){
       Minecraft$AudioFilterParam uAudioFilter = Minecraft$AudioFilterParam.class;
       if (PatchProxy.isSupport(uAudioFilter) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAudioFilter, "12")) {
          return;
       }
       Minecraft$AudioFilterParam.native_setNoiseLevel(this.nativeRef, p0);
       return;
    }
    public void setOriginAudioMaxValue(int p0){
       Minecraft$AudioFilterParam uAudioFilter = Minecraft$AudioFilterParam.class;
       if (PatchProxy.isSupport(uAudioFilter) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAudioFilter, "11")) {
          return;
       }
       Minecraft$AudioFilterParam.native_setOriginAudioMaxValue(this.nativeRef, p0);
       return;
    }
    public void setPitch(int p0){
       Minecraft$AudioFilterParam uAudioFilter = Minecraft$AudioFilterParam.class;
       if (PatchProxy.isSupport(uAudioFilter) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAudioFilter, "13")) {
          return;
       }
       Minecraft$AudioFilterParam.native_setPitch(this.nativeRef, p0);
       return;
    }
    public void setQualityLevel(int p0){
       Minecraft$AudioFilterParam uAudioFilter = Minecraft$AudioFilterParam.class;
       if (PatchProxy.isSupport(uAudioFilter) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAudioFilter, "15")) {
          return;
       }
       Minecraft$AudioFilterParam.native_setQualityLevel(this.nativeRef, p0);
       return;
    }
    public void setTimbre(int p0){
       Minecraft$AudioFilterParam uAudioFilter = Minecraft$AudioFilterParam.class;
       if (PatchProxy.isSupport(uAudioFilter) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAudioFilter, "14")) {
          return;
       }
       Minecraft$AudioFilterParam.native_setTimbre(this.nativeRef, p0);
       return;
    }
}
