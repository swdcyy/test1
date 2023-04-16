package com.kwai.video.minecraft.model.nano.Minecraft$EnhanceFilterParam;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.nano.Minecraft$EnhanceFilterParamPrivate;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class Minecraft$EnhanceFilterParam extends MutableEffect	// class@000a50
{

    public void Minecraft$EnhanceFilterParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_EnhanceFilterParam;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$EnhanceFilterParam(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_EnhanceFilterParam;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$EnhanceFilterParam native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native boolean native_enableEnhanceFilter(long p0);
    public static native Minecraft$EnhanceFilterParamPrivate native_privateData(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$EnhanceFilterParam.class, "1")) {
          return;
       }
       Minecraft$EnhanceFilterParam.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$EnhanceFilterParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EnhanceFilterParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$EnhanceFilterParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public boolean enableEnhanceFilter(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EnhanceFilterParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Minecraft$EnhanceFilterParam.native_enableEnhanceFilter(this.nativeRef);
    }
    public native final long native_create();
    public Minecraft$EnhanceFilterParamPrivate privateData(){
       Object obj = PatchProxy.apply(null, this, Minecraft$EnhanceFilterParam.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$EnhanceFilterParam.native_privateData(this.nativeRef);
    }
}
