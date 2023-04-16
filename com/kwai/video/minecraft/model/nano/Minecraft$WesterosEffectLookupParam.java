package com.kwai.video.minecraft.model.nano.Minecraft$WesterosEffectLookupParam;
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
import java.lang.Integer;
import java.lang.Float;

public final class Minecraft$WesterosEffectLookupParam extends MutableEffect	// class@000a9b
{

    public void Minecraft$WesterosEffectLookupParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_WesterosEffectLookupParam;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$WesterosEffectLookupParam(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_WesterosEffectLookupParam;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$WesterosEffectLookupParam native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native int native_dimension(long p0);
    public static native float native_intensity(long p0);
    public static native int native_resType(long p0);
    public static native void native_setDimension(long p0,int p1);
    public static native void native_setIntensity(long p0,float p1);
    public static native void native_setResType(long p0,int p1);
    public static native void native_setType(long p0,int p1);
    public static native int native_type(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$WesterosEffectLookupParam.class, "1")) {
          return;
       }
       Minecraft$WesterosEffectLookupParam.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$WesterosEffectLookupParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosEffectLookupParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$WesterosEffectLookupParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public int dimension(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosEffectLookupParam.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$WesterosEffectLookupParam.native_dimension(this.nativeRef);
    }
    public float intensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosEffectLookupParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$WesterosEffectLookupParam.native_intensity(this.nativeRef);
    }
    public native final long native_create();
    public int resType(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosEffectLookupParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$WesterosEffectLookupParam.native_resType(this.nativeRef);
    }
    public void setDimension(int p0){
       Minecraft$WesterosEffectLookupParam westerosEffe = Minecraft$WesterosEffectLookupParam.class;
       if (PatchProxy.isSupport(westerosEffe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, westerosEffe, "10")) {
          return;
       }
       Minecraft$WesterosEffectLookupParam.native_setDimension(this.nativeRef, p0);
       return;
    }
    public void setIntensity(float p0){
       Minecraft$WesterosEffectLookupParam westerosEffe = Minecraft$WesterosEffectLookupParam.class;
       if (PatchProxy.isSupport(westerosEffe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, westerosEffe, "6")) {
          return;
       }
       Minecraft$WesterosEffectLookupParam.native_setIntensity(this.nativeRef, p0);
       return;
    }
    public void setResType(int p0){
       Minecraft$WesterosEffectLookupParam westerosEffe = Minecraft$WesterosEffectLookupParam.class;
       if (PatchProxy.isSupport(westerosEffe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, westerosEffe, "4")) {
          return;
       }
       Minecraft$WesterosEffectLookupParam.native_setResType(this.nativeRef, p0);
       return;
    }
    public void setType(int p0){
       Minecraft$WesterosEffectLookupParam westerosEffe = Minecraft$WesterosEffectLookupParam.class;
       if (PatchProxy.isSupport(westerosEffe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, westerosEffe, "8")) {
          return;
       }
       Minecraft$WesterosEffectLookupParam.native_setType(this.nativeRef, p0);
       return;
    }
    public int type(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosEffectLookupParam.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$WesterosEffectLookupParam.native_type(this.nativeRef);
    }
}
