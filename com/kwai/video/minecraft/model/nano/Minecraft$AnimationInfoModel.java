package com.kwai.video.minecraft.model.nano.Minecraft$AnimationInfoModel;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.nano.Minecraft$VideoEffectModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Minecraft$AnimationInfoModel extends ModelBase	// class@000a35
{

    public void Minecraft$AnimationInfoModel(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$AnimationInfoModel(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$AnimationInfoModel native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setSubInEffect(long p0,Minecraft$VideoEffectModel p1);
    public static native void native_setSubOutEffect(long p0,Minecraft$VideoEffectModel p1);
    public static native void native_setSubRepeatEffect(long p0,Minecraft$VideoEffectModel p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$AnimationInfoModel.class, "1")) {
          return;
       }
       Minecraft$AnimationInfoModel.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$AnimationInfoModel clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AnimationInfoModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AnimationInfoModel.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setSubInEffect(Minecraft$VideoEffectModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$AnimationInfoModel.class, "3")) {
          return;
       }
       Minecraft$AnimationInfoModel.native_setSubInEffect(this.nativeRef, p0);
       return;
    }
    public void setSubOutEffect(Minecraft$VideoEffectModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$AnimationInfoModel.class, "4")) {
          return;
       }
       Minecraft$AnimationInfoModel.native_setSubOutEffect(this.nativeRef, p0);
       return;
    }
    public void setSubRepeatEffect(Minecraft$VideoEffectModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$AnimationInfoModel.class, "5")) {
          return;
       }
       Minecraft$AnimationInfoModel.native_setSubRepeatEffect(this.nativeRef, p0);
       return;
    }
}
