package com.kwai.video.minecraft.model.nano.Minecraft$AE2EffectTextAsset;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Minecraft$AE2EffectTextAsset extends ModelBase	// class@000a2d
{

    public void Minecraft$AE2EffectTextAsset(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$AE2EffectTextAsset(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$AE2EffectTextAsset native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native String native_fullPath(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$AE2EffectTextAsset.class, "1")) {
          return;
       }
       Minecraft$AE2EffectTextAsset.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$AE2EffectTextAsset clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AE2EffectTextAsset.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AE2EffectTextAsset.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public String fullPath(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AE2EffectTextAsset.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AE2EffectTextAsset.native_fullPath(this.nativeRef);
    }
    public native final long native_create();
}
