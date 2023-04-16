package com.kwai.video.minecraft.model.nano.Minecraft$YKitCutoutParam;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;

public final class Minecraft$YKitCutoutParam extends MutableEffect	// class@000aa1
{

    public void Minecraft$YKitCutoutParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_YKitCutoutParam;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$YKitCutoutParam(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_YKitCutoutParam;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$YKitCutoutParam native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setIsPreAnalysis(long p0,boolean p1);
    public static native void native_setModelLevel(long p0,int p1);
    public static native void native_setResourceKeys(long p0,ArrayList p1);
    public static native void native_setType(long p0,int p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$YKitCutoutParam.class, "1")) {
          return;
       }
       Minecraft$YKitCutoutParam.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$YKitCutoutParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$YKitCutoutParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$YKitCutoutParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setIsPreAnalysis(boolean p0){
       Minecraft$YKitCutoutParam yKitCutoutPa = Minecraft$YKitCutoutParam.class;
       if (PatchProxy.isSupport(yKitCutoutPa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, yKitCutoutPa, "3")) {
          return;
       }
       Minecraft$YKitCutoutParam.native_setIsPreAnalysis(this.nativeRef, p0);
       return;
    }
    public void setModelLevel(int p0){
       Minecraft$YKitCutoutParam yKitCutoutPa = Minecraft$YKitCutoutParam.class;
       if (PatchProxy.isSupport(yKitCutoutPa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, yKitCutoutPa, "6")) {
          return;
       }
       Minecraft$YKitCutoutParam.native_setModelLevel(this.nativeRef, p0);
       return;
    }
    public void setResourceKeys(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$YKitCutoutParam.class, "4")) {
          return;
       }
       Minecraft$YKitCutoutParam.native_setResourceKeys(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setType(int p0){
       Minecraft$YKitCutoutParam yKitCutoutPa = Minecraft$YKitCutoutParam.class;
       if (PatchProxy.isSupport(yKitCutoutPa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, yKitCutoutPa, "5")) {
          return;
       }
       Minecraft$YKitCutoutParam.native_setType(this.nativeRef, p0);
       return;
    }
}
