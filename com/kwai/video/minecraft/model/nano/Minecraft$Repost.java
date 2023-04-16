package com.kwai.video.minecraft.model.nano.Minecraft$Repost;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.util.ArrayList;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import com.kwai.video.editorsdk2.model.ImmutableMap;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.lang.Integer;

public final class Minecraft$Repost extends ModelBase	// class@000a6b
{

    public void Minecraft$Repost(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$Repost(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$Repost native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setAnimBeziers(long p0,ArrayList p1);
    public static native void native_setAnimTime(long p0,float p1);
    public static native void native_setCropOptionsMap(long p0,Map p1);
    public static native void native_setCtHeadTime(long p0,float p1);
    public static native void native_setCtRollBeziers(long p0,ArrayList p1);
    public static native void native_setCtRollSpeed(long p0,float p1);
    public static native void native_setCtTailTime(long p0,float p1);
    public static native void native_setFrameRate(long p0,float p1);
    public static native void native_setMaterial(long p0,ArrayList p1);
    public static native void native_setMinProjectTime(long p0,float p1);
    public static native void native_setPhotoFrameHeight(long p0,int p1);
    public static native void native_setPhotoFrameWidth(long p0,int p1);
    public static native void native_setType(long p0,int p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$Repost.class, "1")) {
          return;
       }
       Minecraft$Repost.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$Repost clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$Repost.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$Repost.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setAnimBeziers(Float[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$Repost.class, "8")) {
          return;
       }
       Minecraft$Repost.native_setAnimBeziers(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setAnimTime(float p0){
       Minecraft$Repost repost = Minecraft$Repost.class;
       if (PatchProxy.isSupport(repost) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, repost, "9")) {
          return;
       }
       Minecraft$Repost.native_setAnimTime(this.nativeRef, p0);
       return;
    }
    public void setCropOptionsMap(ImmutableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$Repost.class, "15")) {
          return;
       }
       Minecraft$Repost.native_setCropOptionsMap(this.nativeRef, p0.getMap());
       return;
    }
    public void setCtHeadTime(float p0){
       Minecraft$Repost repost = Minecraft$Repost.class;
       if (PatchProxy.isSupport(repost) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, repost, "10")) {
          return;
       }
       Minecraft$Repost.native_setCtHeadTime(this.nativeRef, p0);
       return;
    }
    public void setCtRollBeziers(Float[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$Repost.class, "7")) {
          return;
       }
       Minecraft$Repost.native_setCtRollBeziers(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setCtRollSpeed(float p0){
       Minecraft$Repost repost = Minecraft$Repost.class;
       if (PatchProxy.isSupport(repost) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, repost, "12")) {
          return;
       }
       Minecraft$Repost.native_setCtRollSpeed(this.nativeRef, p0);
       return;
    }
    public void setCtTailTime(float p0){
       Minecraft$Repost repost = Minecraft$Repost.class;
       if (PatchProxy.isSupport(repost) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, repost, "11")) {
          return;
       }
       Minecraft$Repost.native_setCtTailTime(this.nativeRef, p0);
       return;
    }
    public void setFrameRate(float p0){
       Minecraft$Repost repost = Minecraft$Repost.class;
       if (PatchProxy.isSupport(repost) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, repost, "13")) {
          return;
       }
       Minecraft$Repost.native_setFrameRate(this.nativeRef, p0);
       return;
    }
    public void setMaterial(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$Repost.class, "3")) {
          return;
       }
       Minecraft$Repost.native_setMaterial(this.nativeRef, p0.getArrayList());
       return;
    }
    public void setMinProjectTime(float p0){
       Minecraft$Repost repost = Minecraft$Repost.class;
       if (PatchProxy.isSupport(repost) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, repost, "14")) {
          return;
       }
       Minecraft$Repost.native_setMinProjectTime(this.nativeRef, p0);
       return;
    }
    public void setPhotoFrameHeight(int p0){
       Minecraft$Repost repost = Minecraft$Repost.class;
       if (PatchProxy.isSupport(repost) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, repost, "6")) {
          return;
       }
       Minecraft$Repost.native_setPhotoFrameHeight(this.nativeRef, p0);
       return;
    }
    public void setPhotoFrameWidth(int p0){
       Minecraft$Repost repost = Minecraft$Repost.class;
       if (PatchProxy.isSupport(repost) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, repost, "5")) {
          return;
       }
       Minecraft$Repost.native_setPhotoFrameWidth(this.nativeRef, p0);
       return;
    }
    public void setType(int p0){
       Minecraft$Repost repost = Minecraft$Repost.class;
       if (PatchProxy.isSupport(repost) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, repost, "4")) {
          return;
       }
       Minecraft$Repost.native_setType(this.nativeRef, p0);
       return;
    }
}
