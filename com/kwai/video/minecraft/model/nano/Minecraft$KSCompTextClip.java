package com.kwai.video.minecraft.model.nano.Minecraft$KSCompTextClip;
import com.kwai.video.minecraft.model.MutableClip;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$ClipType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.nano.Minecraft$TextResource;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.minecraft.model.nano.Minecraft$CompTextLayerInfoModel;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import com.kwai.video.minecraft.model.nano.Minecraft$PropertyKeyFrame;

public final class Minecraft$KSCompTextClip extends MutableClip	// class@000a56
{

    public void Minecraft$KSCompTextClip(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$ClipType.ClipType_KSCompTextClip;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$KSCompTextClip(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$ClipType.ClipType_KSCompTextClip;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$KSCompTextClip native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native boolean native_freezeFrame(long p0);
    public static native void native_setFreezeFrame(long p0,boolean p1);
    public static native void native_setLayerInfos(long p0,ArrayList p1);
    public static native void native_setPropertyKeyFrames(long p0,ArrayList p1);
    public static native void native_setResource(long p0,Minecraft$TextResource p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$KSCompTextClip.class, "1")) {
          return;
       }
       Minecraft$KSCompTextClip.native_clear(this.nativeRef);
       return;
    }
    public MutableClip clone(){
       return this.clone();
    }
    public Minecraft$KSCompTextClip clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSCompTextClip.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$KSCompTextClip.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public boolean freezeFrame(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSCompTextClip.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Minecraft$KSCompTextClip.native_freezeFrame(this.nativeRef);
    }
    public native final long native_create();
    public void setFreezeFrame(boolean p0){
       Minecraft$KSCompTextClip kSCompTextCl = Minecraft$KSCompTextClip.class;
       if (PatchProxy.isSupport(kSCompTextCl) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kSCompTextCl, "7")) {
          return;
       }
       Minecraft$KSCompTextClip.native_setFreezeFrame(this.nativeRef, p0);
       return;
    }
    public void setLayerInfos(Minecraft$CompTextLayerInfoModel[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$KSCompTextClip.class, "4")) {
          return;
       }
       Minecraft$KSCompTextClip.native_setLayerInfos(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setPropertyKeyFrames(Minecraft$PropertyKeyFrame[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$KSCompTextClip.class, "5")) {
          return;
       }
       Minecraft$KSCompTextClip.native_setPropertyKeyFrames(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setResource(Minecraft$TextResource p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$KSCompTextClip.class, "3")) {
          return;
       }
       Minecraft$KSCompTextClip.native_setResource(this.nativeRef, p0);
       return;
    }
}
