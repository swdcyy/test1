package com.kwai.video.minecraft.model.MutableClip;
import com.kwai.video.minecraft.model.Clip;
import com.kwai.video.minecraft.model.MutableComposable;
import com.kwai.video.minecraft.model.MutableItem;
import com.kwai.video.minecraft.model.ErrorStatus;
import com.kwai.video.minecraft.model.TimeRange;
import java.lang.String;
import com.kwai.video.minecraft.model.MutableMediaReference;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$ClipType;
import com.kwai.video.minecraft.model.MediaReference;

public abstract class MutableClip extends MutableItem implements Clip, MutableComposable	// class@000a0d
{
    public MinecraftModelDefine$ClipType concreteType;

    public void MutableClip(){
       super();
    }
    public static native TimeRange native_availableRange(long p0,ErrorStatus p1);
    public static native String native_clipId(long p0);
    public static native MutableClip native_clone(long p0);
    public static native MutableMediaReference native_mutableMediaReference(long p0);
    public static native void native_setClipId(long p0,String p1);
    public static native void native_setMediaReference(long p0,MutableMediaReference p1);
    public TimeRange availableRange(ErrorStatus p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MutableClip.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableClip.native_availableRange(this.nativeRef, p0);
    }
    public String clipId(){
       Object obj = PatchProxy.apply(null, this, MutableClip.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableClip.native_clipId(this.nativeRef);
    }
    public MutableClip clone(){
       Object obj = PatchProxy.apply(null, this, MutableClip.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableClip.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public MinecraftModelDefine$ClipType getClipType(){
       return this.concreteType;
    }
    public MediaReference mediaReference(){
       Object obj = PatchProxy.apply(null, this, MutableClip.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableClip.native_mutableMediaReference(this.nativeRef);
    }
    public MutableMediaReference mutableMediaReference(){
       Object obj = PatchProxy.apply(null, this, MutableClip.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MutableClip.native_mutableMediaReference(this.nativeRef);
    }
    public void setClipId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableClip.class, "5")) {
          return;
       }
       MutableClip.native_setClipId(this.nativeRef, p0);
       return;
    }
    public void setMediaReference(MutableMediaReference p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MutableClip.class, "7")) {
          return;
       }
       MutableClip.native_setMediaReference(this.nativeRef, p0);
       return;
    }
}
