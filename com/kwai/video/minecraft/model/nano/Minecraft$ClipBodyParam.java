package com.kwai.video.minecraft.model.nano.Minecraft$ClipBodyParam;
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

public final class Minecraft$ClipBodyParam extends MutableEffect	// class@000a46
{

    public void Minecraft$ClipBodyParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_ClipBodyParam;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$ClipBodyParam(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_ClipBodyParam;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native int native_clipBodyType(long p0);
    public static native Minecraft$ClipBodyParam native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setClipBodyType(long p0,int p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$ClipBodyParam.class, "1")) {
          return;
       }
       Minecraft$ClipBodyParam.native_clear(this.nativeRef);
       return;
    }
    public int clipBodyType(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ClipBodyParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$ClipBodyParam.native_clipBodyType(this.nativeRef);
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$ClipBodyParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ClipBodyParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ClipBodyParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setClipBodyType(int p0){
       Minecraft$ClipBodyParam uClipBodyPar = Minecraft$ClipBodyParam.class;
       if (PatchProxy.isSupport(uClipBodyPar) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uClipBodyPar, "4")) {
          return;
       }
       Minecraft$ClipBodyParam.native_setClipBodyType(this.nativeRef, p0);
       return;
    }
}
