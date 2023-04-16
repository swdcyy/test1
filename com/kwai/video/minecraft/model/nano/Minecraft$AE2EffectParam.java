package com.kwai.video.minecraft.model.nano.Minecraft$AE2EffectParam;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import com.kwai.video.minecraft.model.nano.Minecraft$AE2EffectTextAsset;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;

public final class Minecraft$AE2EffectParam extends ModelBase	// class@000a2c
{

    public void Minecraft$AE2EffectParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$AE2EffectParam(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native String native_assetDir(long p0);
    public static native void native_clear(long p0);
    public static native Minecraft$AE2EffectParam native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native Minecraft$Range native_displayRange(long p0);
    public static native int native_fillingMode(long p0);
    public static native void native_setDisplayRange(long p0,Minecraft$Range p1);
    public static native Minecraft$AE2EffectTextAsset native_textAssets_getItem(long p0,int p1);
    public static native int native_textAssets_size(long p0);
    public String assetDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AE2EffectParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AE2EffectParam.native_assetDir(this.nativeRef);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$AE2EffectParam.class, "1")) {
          return;
       }
       Minecraft$AE2EffectParam.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$AE2EffectParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AE2EffectParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AE2EffectParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public Minecraft$Range displayRange(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AE2EffectParam.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AE2EffectParam.native_displayRange(this.nativeRef);
    }
    public int fillingMode(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AE2EffectParam.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$AE2EffectParam.native_fillingMode(this.nativeRef);
    }
    public native final long native_create();
    public void setDisplayRange(Minecraft$Range p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$AE2EffectParam.class, "5")) {
          return;
       }
       Minecraft$AE2EffectParam.native_setDisplayRange(this.nativeRef, p0);
       return;
    }
    public Minecraft$AE2EffectTextAsset textAssets(int p0){
       Minecraft$AE2EffectParam uAE2EffectPa = Minecraft$AE2EffectParam.class;
       if (PatchProxy.isSupport(uAE2EffectPa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAE2EffectPa, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Minecraft$AE2EffectParam.native_textAssets_getItem(this.nativeRef, p0);
    }
    public int textAssetsSize(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AE2EffectParam.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$AE2EffectParam.native_textAssets_size(this.nativeRef);
    }
}
