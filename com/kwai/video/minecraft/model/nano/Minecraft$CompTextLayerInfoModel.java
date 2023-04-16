package com.kwai.video.minecraft.model.nano.Minecraft$CompTextLayerInfoModel;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.nano.Minecraft$AnimationInfoModel;
import com.kwai.video.minecraft.model.nano.Minecraft$TextResource;
import com.kwai.video.minecraft.model.nano.Minecraft$TextInfoModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class Minecraft$CompTextLayerInfoModel extends ModelBase	// class@000a49
{

    public void Minecraft$CompTextLayerInfoModel(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$CompTextLayerInfoModel(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$CompTextLayerInfoModel native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setAnimationInfo(long p0,Minecraft$AnimationInfoModel p1);
    public static native void native_setFlowerResource(long p0,Minecraft$TextResource p1);
    public static native void native_setIsLock(long p0,boolean p1);
    public static native void native_setTextInfo(long p0,Minecraft$TextInfoModel p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$CompTextLayerInfoModel.class, "1")) {
          return;
       }
       Minecraft$CompTextLayerInfoModel.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$CompTextLayerInfoModel clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$CompTextLayerInfoModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$CompTextLayerInfoModel.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setAnimationInfo(Minecraft$AnimationInfoModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$CompTextLayerInfoModel.class, "4")) {
          return;
       }
       Minecraft$CompTextLayerInfoModel.native_setAnimationInfo(this.nativeRef, p0);
       return;
    }
    public void setFlowerResource(Minecraft$TextResource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$CompTextLayerInfoModel.class, "6")) {
          return;
       }
       Minecraft$CompTextLayerInfoModel.native_setFlowerResource(this.nativeRef, p0);
       return;
    }
    public void setIsLock(boolean p0){
       Minecraft$CompTextLayerInfoModel uCompTextLay = Minecraft$CompTextLayerInfoModel.class;
       if (PatchProxy.isSupport(uCompTextLay) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uCompTextLay, "5")) {
          return;
       }
       Minecraft$CompTextLayerInfoModel.native_setIsLock(this.nativeRef, p0);
       return;
    }
    public void setTextInfo(Minecraft$TextInfoModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$CompTextLayerInfoModel.class, "3")) {
          return;
       }
       Minecraft$CompTextLayerInfoModel.native_setTextInfo(this.nativeRef, p0);
       return;
    }
}
