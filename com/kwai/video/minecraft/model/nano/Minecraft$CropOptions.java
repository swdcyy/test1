package com.kwai.video.minecraft.model.nano.Minecraft$CropOptions;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.nano.Minecraft$Color;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;

public final class Minecraft$CropOptions extends ModelBase	// class@000a4a
{

    public void Minecraft$CropOptions(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$CropOptions(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$CropOptions native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native int native_height(long p0);
    public static native void native_setBorderPosLeftBottom(long p0,boolean p1);
    public static native void native_setBorderPosLeftTop(long p0,boolean p1);
    public static native void native_setBorderPosRightBottom(long p0,boolean p1);
    public static native void native_setBorderPosRightTop(long p0,boolean p1);
    public static native void native_setBorderRadius(long p0,float p1);
    public static native void native_setHeight(long p0,int p1);
    public static native void native_setOverlayColor(long p0,Minecraft$Color p1);
    public static native void native_setTransform(long p0,Minecraft$AssetTransform p1);
    public static native void native_setWidth(long p0,int p1);
    public static native Minecraft$AssetTransform native_transform(long p0);
    public static native int native_width(long p0);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$CropOptions.class, "1")) {
          return;
       }
       Minecraft$CropOptions.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$CropOptions clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$CropOptions.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$CropOptions.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public int height(){
       Object obj = PatchProxy.apply(null, this, Minecraft$CropOptions.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$CropOptions.native_height(this.nativeRef);
    }
    public native final long native_create();
    public void setBorderPosLeftBottom(boolean p0){
       Minecraft$CropOptions uCropOptions = Minecraft$CropOptions.class;
       if (PatchProxy.isSupport(uCropOptions) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uCropOptions, "12")) {
          return;
       }
       Minecraft$CropOptions.native_setBorderPosLeftBottom(this.nativeRef, p0);
       return;
    }
    public void setBorderPosLeftTop(boolean p0){
       Minecraft$CropOptions uCropOptions = Minecraft$CropOptions.class;
       if (PatchProxy.isSupport(uCropOptions) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uCropOptions, "11")) {
          return;
       }
       Minecraft$CropOptions.native_setBorderPosLeftTop(this.nativeRef, p0);
       return;
    }
    public void setBorderPosRightBottom(boolean p0){
       Minecraft$CropOptions uCropOptions = Minecraft$CropOptions.class;
       if (PatchProxy.isSupport(uCropOptions) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uCropOptions, "14")) {
          return;
       }
       Minecraft$CropOptions.native_setBorderPosRightBottom(this.nativeRef, p0);
       return;
    }
    public void setBorderPosRightTop(boolean p0){
       Minecraft$CropOptions uCropOptions = Minecraft$CropOptions.class;
       if (PatchProxy.isSupport(uCropOptions) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uCropOptions, "13")) {
          return;
       }
       Minecraft$CropOptions.native_setBorderPosRightTop(this.nativeRef, p0);
       return;
    }
    public void setBorderRadius(float p0){
       Minecraft$CropOptions uCropOptions = Minecraft$CropOptions.class;
       if (PatchProxy.isSupport(uCropOptions) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uCropOptions, "10")) {
          return;
       }
       Minecraft$CropOptions.native_setBorderRadius(this.nativeRef, p0);
       return;
    }
    public void setHeight(int p0){
       Minecraft$CropOptions uCropOptions = Minecraft$CropOptions.class;
       if (PatchProxy.isSupport(uCropOptions) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uCropOptions, "8")) {
          return;
       }
       Minecraft$CropOptions.native_setHeight(this.nativeRef, p0);
       return;
    }
    public void setOverlayColor(Minecraft$Color p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$CropOptions.class, "9")) {
          return;
       }
       Minecraft$CropOptions.native_setOverlayColor(this.nativeRef, p0);
       return;
    }
    public void setTransform(Minecraft$AssetTransform p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$CropOptions.class, "4")) {
          return;
       }
       Minecraft$CropOptions.native_setTransform(this.nativeRef, p0);
       return;
    }
    public void setWidth(int p0){
       Minecraft$CropOptions uCropOptions = Minecraft$CropOptions.class;
       if (PatchProxy.isSupport(uCropOptions) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uCropOptions, "6")) {
          return;
       }
       Minecraft$CropOptions.native_setWidth(this.nativeRef, p0);
       return;
    }
    public Minecraft$AssetTransform transform(){
       Object obj = PatchProxy.apply(null, this, Minecraft$CropOptions.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$CropOptions.native_transform(this.nativeRef);
    }
    public int width(){
       Object obj = PatchProxy.apply(null, this, Minecraft$CropOptions.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$CropOptions.native_width(this.nativeRef);
    }
}
