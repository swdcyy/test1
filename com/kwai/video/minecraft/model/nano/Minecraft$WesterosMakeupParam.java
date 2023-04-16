package com.kwai.video.minecraft.model.nano.Minecraft$WesterosMakeupParam;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosMakeupAdjust;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosMakeupResource;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;

public final class Minecraft$WesterosMakeupParam extends MutableEffect	// class@000a9e
{

    public void Minecraft$WesterosMakeupParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_WesterosMakeupParam;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$WesterosMakeupParam(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_WesterosMakeupParam;
       NativeObjectManager.register(this, p0);
    }
    public static native ArrayList native_adjusts(long p0);
    public static native Minecraft$WesterosMakeupAdjust native_adjusts_getItem(long p0,int p1);
    public static native void native_clear(long p0);
    public static native Minecraft$WesterosMakeupParam native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native boolean native_maleConfig(long p0);
    public static native ArrayList native_resources(long p0);
    public static native void native_setAdjusts(long p0,ArrayList p1);
    public static native void native_setResources(long p0,ArrayList p1);
    public ImmutableArray adjusts(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosMakeupParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(Minecraft$WesterosMakeupParam.native_adjusts(this.nativeRef), Minecraft$WesterosMakeupAdjust.class);
    }
    public Minecraft$WesterosMakeupAdjust adjusts(int p0){
       Minecraft$WesterosMakeupParam westerosMake = Minecraft$WesterosMakeupParam.class;
       if (PatchProxy.isSupport(westerosMake)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, westerosMake, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Minecraft$WesterosMakeupParam.native_adjusts_getItem(this.nativeRef, p0);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$WesterosMakeupParam.class, "1")) {
          return;
       }
       Minecraft$WesterosMakeupParam.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$WesterosMakeupParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosMakeupParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$WesterosMakeupParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public boolean maleConfig(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosMakeupParam.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Minecraft$WesterosMakeupParam.native_maleConfig(this.nativeRef);
    }
    public native final long native_create();
    public ImmutableArray resources(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosMakeupParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(Minecraft$WesterosMakeupParam.native_resources(this.nativeRef), Minecraft$WesterosMakeupResource.class);
    }
    public void setAdjusts(Minecraft$WesterosMakeupAdjust[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$WesterosMakeupParam.class, "6")) {
          return;
       }
       Minecraft$WesterosMakeupParam.native_setAdjusts(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setResources(Minecraft$WesterosMakeupResource[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$WesterosMakeupParam.class, "4")) {
          return;
       }
       Minecraft$WesterosMakeupParam.native_setResources(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
}
