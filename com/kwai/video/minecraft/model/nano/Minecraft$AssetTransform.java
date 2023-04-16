package com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Double;

public final class Minecraft$AssetTransform extends ModelBase	// class@000a36
{

    public void Minecraft$AssetTransform(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$AssetTransform(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native double native_anchorX(long p0);
    public static native double native_anchorY(long p0);
    public static native void native_clear(long p0);
    public static native Minecraft$AssetTransform native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native boolean native_flipX(long p0);
    public static native boolean native_flipY(long p0);
    public static native double native_opacity(long p0);
    public static native double native_positionX(long p0);
    public static native double native_positionY(long p0);
    public static native double native_rotate(long p0);
    public static native double native_scaleX(long p0);
    public static native double native_scaleY(long p0);
    public static native void native_setAnchorX(long p0,double p1);
    public static native void native_setAnchorY(long p0,double p1);
    public static native void native_setOpacity(long p0,double p1);
    public static native void native_setPositionX(long p0,double p1);
    public static native void native_setPositionY(long p0,double p1);
    public static native void native_setRotate(long p0,double p1);
    public static native void native_setScaleX(long p0,double p1);
    public static native void native_setScaleY(long p0,double p1);
    public double anchorX(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AssetTransform.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$AssetTransform.native_anchorX(this.nativeRef);
    }
    public double anchorY(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AssetTransform.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$AssetTransform.native_anchorY(this.nativeRef);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$AssetTransform.class, "1")) {
          return;
       }
       Minecraft$AssetTransform.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$AssetTransform clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AssetTransform.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$AssetTransform.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public boolean flipX(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AssetTransform.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Minecraft$AssetTransform.native_flipX(this.nativeRef);
    }
    public boolean flipY(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AssetTransform.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Minecraft$AssetTransform.native_flipY(this.nativeRef);
    }
    public native final long native_create();
    public double opacity(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AssetTransform.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$AssetTransform.native_opacity(this.nativeRef);
    }
    public double positionX(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AssetTransform.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$AssetTransform.native_positionX(this.nativeRef);
    }
    public double positionY(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AssetTransform.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$AssetTransform.native_positionY(this.nativeRef);
    }
    public double rotate(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AssetTransform.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$AssetTransform.native_rotate(this.nativeRef);
    }
    public double scaleX(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AssetTransform.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$AssetTransform.native_scaleX(this.nativeRef);
    }
    public double scaleY(){
       Object obj = PatchProxy.apply(null, this, Minecraft$AssetTransform.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$AssetTransform.native_scaleY(this.nativeRef);
    }
    public void setAnchorX(double p0){
       Minecraft$AssetTransform uAssetTransf = Minecraft$AssetTransform.class;
       if (PatchProxy.isSupport(uAssetTransf) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uAssetTransf, "4")) {
          return;
       }
       Minecraft$AssetTransform.native_setAnchorX(this.nativeRef, p0);
       return;
    }
    public void setAnchorY(double p0){
       Minecraft$AssetTransform uAssetTransf = Minecraft$AssetTransform.class;
       if (PatchProxy.isSupport(uAssetTransf) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uAssetTransf, "6")) {
          return;
       }
       Minecraft$AssetTransform.native_setAnchorY(this.nativeRef, p0);
       return;
    }
    public void setOpacity(double p0){
       Minecraft$AssetTransform uAssetTransf = Minecraft$AssetTransform.class;
       if (PatchProxy.isSupport(uAssetTransf) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uAssetTransf, "18")) {
          return;
       }
       Minecraft$AssetTransform.native_setOpacity(this.nativeRef, p0);
       return;
    }
    public void setPositionX(double p0){
       Minecraft$AssetTransform uAssetTransf = Minecraft$AssetTransform.class;
       if (PatchProxy.isSupport(uAssetTransf) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uAssetTransf, "8")) {
          return;
       }
       Minecraft$AssetTransform.native_setPositionX(this.nativeRef, p0);
       return;
    }
    public void setPositionY(double p0){
       Minecraft$AssetTransform uAssetTransf = Minecraft$AssetTransform.class;
       if (PatchProxy.isSupport(uAssetTransf) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uAssetTransf, "10")) {
          return;
       }
       Minecraft$AssetTransform.native_setPositionY(this.nativeRef, p0);
       return;
    }
    public void setRotate(double p0){
       Minecraft$AssetTransform uAssetTransf = Minecraft$AssetTransform.class;
       if (PatchProxy.isSupport(uAssetTransf) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uAssetTransf, "16")) {
          return;
       }
       Minecraft$AssetTransform.native_setRotate(this.nativeRef, p0);
       return;
    }
    public void setScaleX(double p0){
       Minecraft$AssetTransform uAssetTransf = Minecraft$AssetTransform.class;
       if (PatchProxy.isSupport(uAssetTransf) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uAssetTransf, "12")) {
          return;
       }
       Minecraft$AssetTransform.native_setScaleX(this.nativeRef, p0);
       return;
    }
    public void setScaleY(double p0){
       Minecraft$AssetTransform uAssetTransf = Minecraft$AssetTransform.class;
       if (PatchProxy.isSupport(uAssetTransf) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, uAssetTransf, "14")) {
          return;
       }
       Minecraft$AssetTransform.native_setScaleY(this.nativeRef, p0);
       return;
    }
}
