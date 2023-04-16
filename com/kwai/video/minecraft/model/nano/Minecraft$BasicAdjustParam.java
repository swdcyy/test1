package com.kwai.video.minecraft.model.nano.Minecraft$BasicAdjustParam;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Float;

public final class Minecraft$BasicAdjustParam extends ModelBase	// class@000a42
{

    public void Minecraft$BasicAdjustParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$BasicAdjustParam(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native float native_brightnessIntensity(long p0);
    public static native void native_clear(long p0);
    public static native Minecraft$BasicAdjustParam native_clone(long p0);
    public static native float native_contrastIntensity(long p0);
    public static native void native_destroy(long p0);
    public static native float native_saturationIntensity(long p0);
    public static native void native_setBrightnessIntensity(long p0,float p1);
    public static native void native_setContrastIntensity(long p0,float p1);
    public static native void native_setSaturationIntensity(long p0,float p1);
    public static native void native_setSharpenIntensity(long p0,float p1);
    public static native void native_setTemperatureIntensity(long p0,float p1);
    public static native float native_sharpenIntensity(long p0);
    public static native float native_temperatureIntensity(long p0);
    public float brightnessIntensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$BasicAdjustParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$BasicAdjustParam.native_brightnessIntensity(this.nativeRef);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$BasicAdjustParam.class, "1")) {
          return;
       }
       Minecraft$BasicAdjustParam.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$BasicAdjustParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$BasicAdjustParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$BasicAdjustParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public float contrastIntensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$BasicAdjustParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$BasicAdjustParam.native_contrastIntensity(this.nativeRef);
    }
    public native final long native_create();
    public float saturationIntensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$BasicAdjustParam.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$BasicAdjustParam.native_saturationIntensity(this.nativeRef);
    }
    public void setBrightnessIntensity(float p0){
       Minecraft$BasicAdjustParam uBasicAdjust = Minecraft$BasicAdjustParam.class;
       if (PatchProxy.isSupport(uBasicAdjust) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uBasicAdjust, "4")) {
          return;
       }
       Minecraft$BasicAdjustParam.native_setBrightnessIntensity(this.nativeRef, p0);
       return;
    }
    public void setContrastIntensity(float p0){
       Minecraft$BasicAdjustParam uBasicAdjust = Minecraft$BasicAdjustParam.class;
       if (PatchProxy.isSupport(uBasicAdjust) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uBasicAdjust, "6")) {
          return;
       }
       Minecraft$BasicAdjustParam.native_setContrastIntensity(this.nativeRef, p0);
       return;
    }
    public void setSaturationIntensity(float p0){
       Minecraft$BasicAdjustParam uBasicAdjust = Minecraft$BasicAdjustParam.class;
       if (PatchProxy.isSupport(uBasicAdjust) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uBasicAdjust, "8")) {
          return;
       }
       Minecraft$BasicAdjustParam.native_setSaturationIntensity(this.nativeRef, p0);
       return;
    }
    public void setSharpenIntensity(float p0){
       Minecraft$BasicAdjustParam uBasicAdjust = Minecraft$BasicAdjustParam.class;
       if (PatchProxy.isSupport(uBasicAdjust) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uBasicAdjust, "12")) {
          return;
       }
       Minecraft$BasicAdjustParam.native_setSharpenIntensity(this.nativeRef, p0);
       return;
    }
    public void setTemperatureIntensity(float p0){
       Minecraft$BasicAdjustParam uBasicAdjust = Minecraft$BasicAdjustParam.class;
       if (PatchProxy.isSupport(uBasicAdjust) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uBasicAdjust, "10")) {
          return;
       }
       Minecraft$BasicAdjustParam.native_setTemperatureIntensity(this.nativeRef, p0);
       return;
    }
    public float sharpenIntensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$BasicAdjustParam.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$BasicAdjustParam.native_sharpenIntensity(this.nativeRef);
    }
    public float temperatureIntensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$BasicAdjustParam.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$BasicAdjustParam.native_temperatureIntensity(this.nativeRef);
    }
}
