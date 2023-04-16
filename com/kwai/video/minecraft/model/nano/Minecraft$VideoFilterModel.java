package com.kwai.video.minecraft.model.nano.Minecraft$VideoFilterModel;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Minecraft$VideoFilterModel extends MutableEffect	// class@000a94
{

    public void Minecraft$VideoFilterModel(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_VideoFilterModel;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$VideoFilterModel(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_VideoFilterModel;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$VideoFilterModel native_clone(long p0);
    public static native void native_destroy(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$VideoFilterModel.class, "1")) {
          return;
       }
       Minecraft$VideoFilterModel.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$VideoFilterModel clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$VideoFilterModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$VideoFilterModel.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
}
