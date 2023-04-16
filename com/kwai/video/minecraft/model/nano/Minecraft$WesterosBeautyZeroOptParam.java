package com.kwai.video.minecraft.model.nano.Minecraft$WesterosBeautyZeroOptParam;
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

public final class Minecraft$WesterosBeautyZeroOptParam extends MutableEffect	// class@000a98
{

    public void Minecraft$WesterosBeautyZeroOptParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_WesterosBeautyZeroOptParam;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$WesterosBeautyZeroOptParam(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_WesterosBeautyZeroOptParam;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$WesterosBeautyZeroOptParam native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native float native_intensity(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$WesterosBeautyZeroOptParam.class, "1")) {
          return;
       }
       Minecraft$WesterosBeautyZeroOptParam.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$WesterosBeautyZeroOptParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBeautyZeroOptParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$WesterosBeautyZeroOptParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public float intensity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBeautyZeroOptParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Minecraft$WesterosBeautyZeroOptParam.native_intensity(this.nativeRef);
    }
    public native final long native_create();
}
