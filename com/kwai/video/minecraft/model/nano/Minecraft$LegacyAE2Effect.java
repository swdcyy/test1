package com.kwai.video.minecraft.model.nano.Minecraft$LegacyAE2Effect;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;

public final class Minecraft$LegacyAE2Effect extends MutableEffect	// class@000a5b
{

    public void Minecraft$LegacyAE2Effect(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_LegacyAE2Effect;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$LegacyAE2Effect(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_LegacyAE2Effect;
       NativeObjectManager.register(this, p0);
    }
    public static native String native_assetDir(long p0);
    public static native Minecraft$Range native_assetTimeRange(long p0);
    public static native void native_clear(long p0);
    public static native Minecraft$LegacyAE2Effect native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native int native_fillingMode(long p0);
    public static native void native_setAssetDir(long p0,String p1);
    public static native void native_setAssetTimeRange(long p0,Minecraft$Range p1);
    public static native void native_setFillingMode(long p0,int p1);
    public String assetDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$LegacyAE2Effect.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$LegacyAE2Effect.native_assetDir(this.nativeRef);
    }
    public Minecraft$Range assetTimeRange(){
       Object obj = PatchProxy.apply(null, this, Minecraft$LegacyAE2Effect.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$LegacyAE2Effect.native_assetTimeRange(this.nativeRef);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$LegacyAE2Effect.class, "1")) {
          return;
       }
       Minecraft$LegacyAE2Effect.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$LegacyAE2Effect clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$LegacyAE2Effect.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$LegacyAE2Effect.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public int fillingMode(){
       Object obj = PatchProxy.apply(null, this, Minecraft$LegacyAE2Effect.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$LegacyAE2Effect.native_fillingMode(this.nativeRef);
    }
    public native final long native_create();
    public void setAssetDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$LegacyAE2Effect.class, "6")) {
          return;
       }
       Minecraft$LegacyAE2Effect.native_setAssetDir(this.nativeRef, p0);
       return;
    }
    public void setAssetTimeRange(Minecraft$Range p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$LegacyAE2Effect.class, "4")) {
          return;
       }
       Minecraft$LegacyAE2Effect.native_setAssetTimeRange(this.nativeRef, p0);
       return;
    }
    public void setFillingMode(int p0){
       Minecraft$LegacyAE2Effect legacyAE2Eff = Minecraft$LegacyAE2Effect.class;
       if (PatchProxy.isSupport(legacyAE2Eff) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, legacyAE2Eff, "8")) {
          return;
       }
       Minecraft$LegacyAE2Effect.native_setFillingMode(this.nativeRef, p0);
       return;
    }
}
