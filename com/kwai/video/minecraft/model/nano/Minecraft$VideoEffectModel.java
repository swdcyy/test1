package com.kwai.video.minecraft.model.nano.Minecraft$VideoEffectModel;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Minecraft$VideoEffectModel extends MutableEffect	// class@000a92
{

    public void Minecraft$VideoEffectModel(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_VideoEffectModel;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$VideoEffectModel(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_VideoEffectModel;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$VideoEffectModel native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native String native_path(long p0);
    public static native void native_setName(long p0,String p1);
    public static native void native_setPath(long p0,String p1);
    public static native void native_setResID(long p0,String p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$VideoEffectModel.class, "1")) {
          return;
       }
       Minecraft$VideoEffectModel.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$VideoEffectModel clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$VideoEffectModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$VideoEffectModel.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public String path(){
       Object obj = PatchProxy.apply(null, this, Minecraft$VideoEffectModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$VideoEffectModel.native_path(this.nativeRef);
    }
    public void setName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$VideoEffectModel.class, "6")) {
          return;
       }
       Minecraft$VideoEffectModel.native_setName(this.nativeRef, p0);
       return;
    }
    public void setPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$VideoEffectModel.class, "4")) {
          return;
       }
       Minecraft$VideoEffectModel.native_setPath(this.nativeRef, p0);
       return;
    }
    public void setResID(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$VideoEffectModel.class, "5")) {
          return;
       }
       Minecraft$VideoEffectModel.native_setResID(this.nativeRef, p0);
       return;
    }
}
