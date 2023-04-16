package com.kwai.video.minecraft.model.nano.Minecraft$SubAssetAnimationKeyFrame;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Double;
import java.lang.Integer;

public final class Minecraft$SubAssetAnimationKeyFrame extends ModelBase	// class@000a76
{

    public void Minecraft$SubAssetAnimationKeyFrame(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$SubAssetAnimationKeyFrame(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native Minecraft$AssetTransform native_assetTransformation(long p0);
    public static native void native_clear(long p0);
    public static native Minecraft$SubAssetAnimationKeyFrame native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native double native_duration(long p0);
    public static native void native_setAssetTransformation(long p0,Minecraft$AssetTransform p1);
    public static native void native_setDuration(long p0,double p1);
    public static native void native_setTiming(long p0,int p1);
    public static native int native_timing(long p0);
    public Minecraft$AssetTransform assetTransformation(){
       Object obj = PatchProxy.apply(null, this, Minecraft$SubAssetAnimationKeyFrame.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$SubAssetAnimationKeyFrame.native_assetTransformation(this.nativeRef);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$SubAssetAnimationKeyFrame.class, "1")) {
          return;
       }
       Minecraft$SubAssetAnimationKeyFrame.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$SubAssetAnimationKeyFrame clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$SubAssetAnimationKeyFrame.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$SubAssetAnimationKeyFrame.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public double duration(){
       Object obj = PatchProxy.apply(null, this, Minecraft$SubAssetAnimationKeyFrame.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$SubAssetAnimationKeyFrame.native_duration(this.nativeRef);
    }
    public native final long native_create();
    public void setAssetTransformation(Minecraft$AssetTransform p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$SubAssetAnimationKeyFrame.class, "8")) {
          return;
       }
       Minecraft$SubAssetAnimationKeyFrame.native_setAssetTransformation(this.nativeRef, p0);
       return;
    }
    public void setDuration(double p0){
       Minecraft$SubAssetAnimationKeyFrame subAssetAnim = Minecraft$SubAssetAnimationKeyFrame.class;
       if (PatchProxy.isSupport(subAssetAnim) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, subAssetAnim, "4")) {
          return;
       }
       Minecraft$SubAssetAnimationKeyFrame.native_setDuration(this.nativeRef, p0);
       return;
    }
    public void setTiming(int p0){
       Minecraft$SubAssetAnimationKeyFrame subAssetAnim = Minecraft$SubAssetAnimationKeyFrame.class;
       if (PatchProxy.isSupport(subAssetAnim) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, subAssetAnim, "6")) {
          return;
       }
       Minecraft$SubAssetAnimationKeyFrame.native_setTiming(this.nativeRef, p0);
       return;
    }
    public int timing(){
       Object obj = PatchProxy.apply(null, this, Minecraft$SubAssetAnimationKeyFrame.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$SubAssetAnimationKeyFrame.native_timing(this.nativeRef);
    }
}
