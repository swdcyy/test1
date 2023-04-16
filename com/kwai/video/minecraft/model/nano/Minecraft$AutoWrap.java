package com.kwai.video.minecraft.model.nano.Minecraft$AutoWrap;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import java.lang.Double;
import java.lang.Boolean;

public final class Minecraft$AutoWrap extends ModelBase	// class@000a40
{

    public void Minecraft$AutoWrap(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$AutoWrap(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$AutoWrap native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setCurrentScale(long p0,float p1);
    public static native void native_setDocWidth(long p0,double p1);
    public static native void native_setHadAdjustMaxWidth(long p0,boolean p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$AutoWrap.class, "1")) {
          return;
       }
       Minecraft$AutoWrap.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$AutoWrap clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AutoWrap.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AutoWrap.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setCurrentScale(float p0){
       Minecraft$AutoWrap uAutoWrap = Minecraft$AutoWrap.class;
       if (PatchProxy.isSupport(uAutoWrap) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uAutoWrap, "4")) {
          return;
       }
       Minecraft$AutoWrap.native_setCurrentScale(this.nativeRef, p0);
       return;
    }
    public void setDocWidth(double p0){
       Minecraft$AutoWrap uAutoWrap = Minecraft$AutoWrap.class;
       if (PatchProxy.isSupport(uAutoWrap) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uAutoWrap, "5")) {
          return;
       }
       Minecraft$AutoWrap.native_setDocWidth(this.nativeRef, p0);
       return;
    }
    public void setHadAdjustMaxWidth(boolean p0){
       Minecraft$AutoWrap uAutoWrap = Minecraft$AutoWrap.class;
       if (PatchProxy.isSupport(uAutoWrap) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAutoWrap, "3")) {
          return;
       }
       Minecraft$AutoWrap.native_setHadAdjustMaxWidth(this.nativeRef, p0);
       return;
    }
}
