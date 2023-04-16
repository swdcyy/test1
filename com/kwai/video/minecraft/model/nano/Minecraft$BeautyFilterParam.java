package com.kwai.video.minecraft.model.nano.Minecraft$BeautyFilterParam;
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
import java.lang.Long;

public final class Minecraft$BeautyFilterParam extends MutableEffect	// class@000a43
{

    public void Minecraft$BeautyFilterParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_BeautyFilterParam;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$BeautyFilterParam(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_BeautyFilterParam;
       NativeObjectManager.register(this, p0);
    }
    public static native int native_bright(long p0);
    public static native void native_clear(long p0);
    public static native Minecraft$BeautyFilterParam native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setBright(long p0,int p1);
    public static native void native_setId(long p0,long p1);
    public static native void native_setQuality(long p0,int p1);
    public static native void native_setSoft(long p0,int p1);
    public static native void native_setType(long p0,int p1);
    public static native int native_soft(long p0);
    public static native int native_type(long p0);
    public int bright(){
       Object obj = PatchProxy.apply(null, this, Minecraft$BeautyFilterParam.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$BeautyFilterParam.native_bright(this.nativeRef);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$BeautyFilterParam.class, "1")) {
          return;
       }
       Minecraft$BeautyFilterParam.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$BeautyFilterParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$BeautyFilterParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$BeautyFilterParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setBright(int p0){
       Minecraft$BeautyFilterParam uBeautyFilte = Minecraft$BeautyFilterParam.class;
       if (PatchProxy.isSupport(uBeautyFilte) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBeautyFilte, "8")) {
          return;
       }
       Minecraft$BeautyFilterParam.native_setBright(this.nativeRef, p0);
       return;
    }
    public void setId(long p0){
       Minecraft$BeautyFilterParam uBeautyFilte = Minecraft$BeautyFilterParam.class;
       if (PatchProxy.isSupport(uBeautyFilte) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uBeautyFilte, "9")) {
          return;
       }
       Minecraft$BeautyFilterParam.native_setId(this.nativeRef, p0);
       return;
    }
    public void setQuality(int p0){
       Minecraft$BeautyFilterParam uBeautyFilte = Minecraft$BeautyFilterParam.class;
       if (PatchProxy.isSupport(uBeautyFilte) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBeautyFilte, "10")) {
          return;
       }
       Minecraft$BeautyFilterParam.native_setQuality(this.nativeRef, p0);
       return;
    }
    public void setSoft(int p0){
       Minecraft$BeautyFilterParam uBeautyFilte = Minecraft$BeautyFilterParam.class;
       if (PatchProxy.isSupport(uBeautyFilte) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBeautyFilte, "6")) {
          return;
       }
       Minecraft$BeautyFilterParam.native_setSoft(this.nativeRef, p0);
       return;
    }
    public void setType(int p0){
       Minecraft$BeautyFilterParam uBeautyFilte = Minecraft$BeautyFilterParam.class;
       if (PatchProxy.isSupport(uBeautyFilte) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBeautyFilte, "4")) {
          return;
       }
       Minecraft$BeautyFilterParam.native_setType(this.nativeRef, p0);
       return;
    }
    public int soft(){
       Object obj = PatchProxy.apply(null, this, Minecraft$BeautyFilterParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$BeautyFilterParam.native_soft(this.nativeRef);
    }
    public int type(){
       Object obj = PatchProxy.apply(null, this, Minecraft$BeautyFilterParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$BeautyFilterParam.native_type(this.nativeRef);
    }
}
