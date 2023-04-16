package com.kwai.video.minecraft.model.nano.Minecraft$TouchEffectParam;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import java.lang.Integer;

public final class Minecraft$TouchEffectParam extends ModelBase	// class@000a88
{

    public void Minecraft$TouchEffectParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$TouchEffectParam(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$TouchEffectParam native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setId(long p0,long p1);
    public static native void native_setRange(long p0,Minecraft$Range p1);
    public static native void native_setTouchEffectType(long p0,int p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$TouchEffectParam.class, "1")) {
          return;
       }
       Minecraft$TouchEffectParam.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$TouchEffectParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TouchEffectParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TouchEffectParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setId(long p0){
       Minecraft$TouchEffectParam touchEffectP = Minecraft$TouchEffectParam.class;
       if (PatchProxy.isSupport(touchEffectP) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, touchEffectP, "5")) {
          return;
       }
       Minecraft$TouchEffectParam.native_setId(this.nativeRef, p0);
       return;
    }
    public void setRange(Minecraft$Range p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TouchEffectParam.class, "3")) {
          return;
       }
       Minecraft$TouchEffectParam.native_setRange(this.nativeRef, p0);
       return;
    }
    public void setTouchEffectType(int p0){
       Minecraft$TouchEffectParam touchEffectP = Minecraft$TouchEffectParam.class;
       if (PatchProxy.isSupport(touchEffectP) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, touchEffectP, "4")) {
          return;
       }
       Minecraft$TouchEffectParam.native_setTouchEffectType(this.nativeRef, p0);
       return;
    }
}
