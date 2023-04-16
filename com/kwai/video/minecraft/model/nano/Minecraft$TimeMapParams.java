package com.kwai.video.minecraft.model.nano.Minecraft$TimeMapParams;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeMapKeyFrame;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.lang.Integer;
import java.lang.Number;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.lang.Double;
import java.lang.Boolean;

public final class Minecraft$TimeMapParams extends ModelBase	// class@000a83
{

    public void Minecraft$TimeMapParams(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$TimeMapParams(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$TimeMapParams native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native ArrayList native_keyFrames(long p0);
    public static native Minecraft$TimeMapKeyFrame native_keyFrames_getItem(long p0,int p1);
    public static native void native_keyFrames_setItem(long p0,int p1,Minecraft$TimeMapKeyFrame p2);
    public static native int native_keyFrames_size(long p0);
    public static native double native_originalDuration(long p0);
    public static native void native_setInsertFrameType(long p0,int p1);
    public static native void native_setKeyFrames(long p0,ArrayList p1);
    public static native void native_setOriginalDuration(long p0,double p1);
    public static native void native_setUseInsertFrame(long p0,boolean p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$TimeMapParams.class, "1")) {
          return;
       }
       Minecraft$TimeMapParams.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$TimeMapParams clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TimeMapParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TimeMapParams.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public ImmutableArray keyFrames(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TimeMapParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(Minecraft$TimeMapParams.native_keyFrames(this.nativeRef), Minecraft$TimeMapKeyFrame.class);
    }
    public Minecraft$TimeMapKeyFrame keyFrames(int p0){
       Minecraft$TimeMapParams timeMapParam = Minecraft$TimeMapParams.class;
       if (PatchProxy.isSupport(timeMapParam)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, timeMapParam, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Minecraft$TimeMapParams.native_keyFrames_getItem(this.nativeRef, p0);
    }
    public void keyFramesSetItem(int p0,Minecraft$TimeMapKeyFrame p1){
       Minecraft$TimeMapParams timeMapParam = Minecraft$TimeMapParams.class;
       if (PatchProxy.isSupport(timeMapParam) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, timeMapParam, "7")) {
          return;
       }
       Minecraft$TimeMapParams.native_keyFrames_setItem(this.nativeRef, p0, p1);
       return;
    }
    public int keyFramesSize(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TimeMapParams.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$TimeMapParams.native_keyFrames_size(this.nativeRef);
    }
    public native final long native_create();
    public double originalDuration(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TimeMapParams.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$TimeMapParams.native_originalDuration(this.nativeRef);
    }
    public void setInsertFrameType(int p0){
       Minecraft$TimeMapParams timeMapParam = Minecraft$TimeMapParams.class;
       if (PatchProxy.isSupport(timeMapParam) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, timeMapParam, "11")) {
          return;
       }
       Minecraft$TimeMapParams.native_setInsertFrameType(this.nativeRef, p0);
       return;
    }
    public void setKeyFrames(Minecraft$TimeMapKeyFrame[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TimeMapParams.class, "4")) {
          return;
       }
       Minecraft$TimeMapParams.native_setKeyFrames(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setOriginalDuration(double p0){
       Minecraft$TimeMapParams timeMapParam = Minecraft$TimeMapParams.class;
       if (PatchProxy.isSupport(timeMapParam) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, timeMapParam, "9")) {
          return;
       }
       Minecraft$TimeMapParams.native_setOriginalDuration(this.nativeRef, p0);
       return;
    }
    public void setUseInsertFrame(boolean p0){
       Minecraft$TimeMapParams timeMapParam = Minecraft$TimeMapParams.class;
       if (PatchProxy.isSupport(timeMapParam) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, timeMapParam, "10")) {
          return;
       }
       Minecraft$TimeMapParams.native_setUseInsertFrame(this.nativeRef, p0);
       return;
    }
}
