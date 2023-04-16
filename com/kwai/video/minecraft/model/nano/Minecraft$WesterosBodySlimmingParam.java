package com.kwai.video.minecraft.model.nano.Minecraft$WesterosBodySlimmingParam;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosBodySlimmingAdjust;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Number;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;

public final class Minecraft$WesterosBodySlimmingParam extends MutableEffect	// class@000a9a
{

    public void Minecraft$WesterosBodySlimmingParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_WesterosBodySlimmingParam;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$WesterosBodySlimmingParam(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_WesterosBodySlimmingParam;
       NativeObjectManager.register(this, p0);
    }
    public static native ArrayList native_adjusts(long p0);
    public static native Minecraft$WesterosBodySlimmingAdjust native_adjusts_getItem(long p0,int p1);
    public static native int native_adjusts_size(long p0);
    public static native void native_clear(long p0);
    public static native Minecraft$WesterosBodySlimmingParam native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setAdjusts(long p0,ArrayList p1);
    public ImmutableArray adjusts(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBodySlimmingParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(Minecraft$WesterosBodySlimmingParam.native_adjusts(this.nativeRef), Minecraft$WesterosBodySlimmingAdjust.class);
    }
    public Minecraft$WesterosBodySlimmingAdjust adjusts(int p0){
       Minecraft$WesterosBodySlimmingParam westerosBody = Minecraft$WesterosBodySlimmingParam.class;
       if (PatchProxy.isSupport(westerosBody)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, westerosBody, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Minecraft$WesterosBodySlimmingParam.native_adjusts_getItem(this.nativeRef, p0);
    }
    public int adjustsSize(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBodySlimmingParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$WesterosBodySlimmingParam.native_adjusts_size(this.nativeRef);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$WesterosBodySlimmingParam.class, "1")) {
          return;
       }
       Minecraft$WesterosBodySlimmingParam.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$WesterosBodySlimmingParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosBodySlimmingParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$WesterosBodySlimmingParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setAdjusts(Minecraft$WesterosBodySlimmingAdjust[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$WesterosBodySlimmingParam.class, "4")) {
          return;
       }
       Minecraft$WesterosBodySlimmingParam.native_setAdjusts(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
}
