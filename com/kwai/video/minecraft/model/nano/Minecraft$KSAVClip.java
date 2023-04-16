package com.kwai.video.minecraft.model.nano.Minecraft$KSAVClip;
import com.kwai.video.minecraft.model.MutableClip;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$ClipType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import com.kwai.video.minecraft.model.nano.Minecraft$CropOptions;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeMapParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.nano.Minecraft$PropertyKeyFrame;
import java.lang.Double;
import java.lang.Integer;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;

public final class Minecraft$KSAVClip extends MutableClip	// class@000a55
{

    public void Minecraft$KSAVClip(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$ClipType.ClipType_KSAVClip;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$KSAVClip(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$ClipType.ClipType_KSAVClip;
       NativeObjectManager.register(this, p0);
    }
    public static native String native_aeRefId(long p0);
    public static native double native_assetSpeed(long p0);
    public static native Minecraft$AssetTransform native_assetTransform(long p0);
    public static native int native_assetTransformFlag(long p0);
    public static native void native_clear(long p0);
    public static native Minecraft$KSAVClip native_clone(long p0);
    public static native Minecraft$CropOptions native_cropOptions(long p0);
    public static native void native_destroy(long p0);
    public static native boolean native_improveHighResolutionUpscaleQuality(long p0);
    public static native boolean native_isRepeat(long p0);
    public static native boolean native_isReplaceable(long p0);
    public static native boolean native_isReversed(long p0);
    public static native int native_positioningMethod(long p0);
    public static native ArrayList native_propertyKeyFrames(long p0);
    public static native int native_renderType(long p0);
    public static native int native_rotationDeg(long p0);
    public static native void native_setAeRefId(long p0,String p1);
    public static native void native_setAssetSpeed(long p0,double p1);
    public static native void native_setAssetTransform(long p0,Minecraft$AssetTransform p1);
    public static native void native_setAssetTransformFlag(long p0,int p1);
    public static native void native_setBlendingMode(long p0,int p1);
    public static native void native_setCropOptions(long p0,Minecraft$CropOptions p1);
    public static native void native_setImproveHighResolutionUpscaleQuality(long p0,boolean p1);
    public static native void native_setIsRepeat(long p0,boolean p1);
    public static native void native_setIsReplaceable(long p0,boolean p1);
    public static native void native_setIsReversed(long p0,boolean p1);
    public static native void native_setMute(long p0,boolean p1);
    public static native void native_setPositioningMethod(long p0,int p1);
    public static native void native_setPropertyKeyFrames(long p0,ArrayList p1);
    public static native void native_setRenderType(long p0,int p1);
    public static native void native_setRotationDeg(long p0,int p1);
    public static native void native_setTimeMap(long p0,Minecraft$TimeMapParams p1);
    public static native void native_setWesterosFaceDetectMode(long p0,int p1);
    public static native Minecraft$TimeMapParams native_timeMap(long p0);
    public static native int native_westerosFaceDetectMode(long p0);
    public String aeRefId(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSAVClip.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$KSAVClip.native_aeRefId(this.nativeRef);
    }
    public double assetSpeed(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSAVClip.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$KSAVClip.native_assetSpeed(this.nativeRef);
    }
    public Minecraft$AssetTransform assetTransform(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSAVClip.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$KSAVClip.native_assetTransform(this.nativeRef);
    }
    public int assetTransformFlag(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSAVClip.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$KSAVClip.native_assetTransformFlag(this.nativeRef);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$KSAVClip.class, "1")) {
          return;
       }
       Minecraft$KSAVClip.native_clear(this.nativeRef);
       return;
    }
    public MutableClip clone(){
       return this.clone();
    }
    public Minecraft$KSAVClip clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSAVClip.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$KSAVClip.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public Minecraft$CropOptions cropOptions(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSAVClip.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$KSAVClip.native_cropOptions(this.nativeRef);
    }
    public boolean improveHighResolutionUpscaleQuality(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSAVClip.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Minecraft$KSAVClip.native_improveHighResolutionUpscaleQuality(this.nativeRef);
    }
    public boolean isRepeat(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSAVClip.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Minecraft$KSAVClip.native_isRepeat(this.nativeRef);
    }
    public boolean isReplaceable(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSAVClip.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Minecraft$KSAVClip.native_isReplaceable(this.nativeRef);
    }
    public boolean isReversed(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSAVClip.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Minecraft$KSAVClip.native_isReversed(this.nativeRef);
    }
    public native final long native_create();
    public int positioningMethod(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSAVClip.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$KSAVClip.native_positioningMethod(this.nativeRef);
    }
    public ImmutableArray propertyKeyFrames(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSAVClip.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(Minecraft$KSAVClip.native_propertyKeyFrames(this.nativeRef), Minecraft$PropertyKeyFrame.class);
    }
    public int renderType(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSAVClip.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$KSAVClip.native_renderType(this.nativeRef);
    }
    public int rotationDeg(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSAVClip.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$KSAVClip.native_rotationDeg(this.nativeRef);
    }
    public void setAeRefId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$KSAVClip.class, "33")) {
          return;
       }
       Minecraft$KSAVClip.native_setAeRefId(this.nativeRef, p0);
       return;
    }
    public void setAssetSpeed(double p0){
       Minecraft$KSAVClip kSAVClip = Minecraft$KSAVClip.class;
       if (PatchProxy.isSupport(kSAVClip) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, kSAVClip, "25")) {
          return;
       }
       Minecraft$KSAVClip.native_setAssetSpeed(this.nativeRef, p0);
       return;
    }
    public void setAssetTransform(Minecraft$AssetTransform p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$KSAVClip.class, "19")) {
          return;
       }
       Minecraft$KSAVClip.native_setAssetTransform(this.nativeRef, p0);
       return;
    }
    public void setAssetTransformFlag(int p0){
       Minecraft$KSAVClip kSAVClip = Minecraft$KSAVClip.class;
       if (PatchProxy.isSupport(kSAVClip) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kSAVClip, "17")) {
          return;
       }
       Minecraft$KSAVClip.native_setAssetTransformFlag(this.nativeRef, p0);
       return;
    }
    public void setBlendingMode(int p0){
       Minecraft$KSAVClip kSAVClip = Minecraft$KSAVClip.class;
       if (PatchProxy.isSupport(kSAVClip) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kSAVClip, "28")) {
          return;
       }
       Minecraft$KSAVClip.native_setBlendingMode(this.nativeRef, p0);
       return;
    }
    public void setCropOptions(Minecraft$CropOptions p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$KSAVClip.class, "21")) {
          return;
       }
       Minecraft$KSAVClip.native_setCropOptions(this.nativeRef, p0);
       return;
    }
    public void setImproveHighResolutionUpscaleQuality(boolean p0){
       Minecraft$KSAVClip kSAVClip = Minecraft$KSAVClip.class;
       if (PatchProxy.isSupport(kSAVClip) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kSAVClip, "8")) {
          return;
       }
       Minecraft$KSAVClip.native_setImproveHighResolutionUpscaleQuality(this.nativeRef, p0);
       return;
    }
    public void setIsRepeat(boolean p0){
       Minecraft$KSAVClip kSAVClip = Minecraft$KSAVClip.class;
       if (PatchProxy.isSupport(kSAVClip) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kSAVClip, "6")) {
          return;
       }
       Minecraft$KSAVClip.native_setIsRepeat(this.nativeRef, p0);
       return;
    }
    public void setIsReplaceable(boolean p0){
       Minecraft$KSAVClip kSAVClip = Minecraft$KSAVClip.class;
       if (PatchProxy.isSupport(kSAVClip) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kSAVClip, "35")) {
          return;
       }
       Minecraft$KSAVClip.native_setIsReplaceable(this.nativeRef, p0);
       return;
    }
    public void setIsReversed(boolean p0){
       Minecraft$KSAVClip kSAVClip = Minecraft$KSAVClip.class;
       if (PatchProxy.isSupport(kSAVClip) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kSAVClip, "4")) {
          return;
       }
       Minecraft$KSAVClip.native_setIsReversed(this.nativeRef, p0);
       return;
    }
    public void setMute(boolean p0){
       Minecraft$KSAVClip kSAVClip = Minecraft$KSAVClip.class;
       if (PatchProxy.isSupport(kSAVClip) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kSAVClip, "29")) {
          return;
       }
       Minecraft$KSAVClip.native_setMute(this.nativeRef, p0);
       return;
    }
    public void setPositioningMethod(int p0){
       Minecraft$KSAVClip kSAVClip = Minecraft$KSAVClip.class;
       if (PatchProxy.isSupport(kSAVClip) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kSAVClip, "15")) {
          return;
       }
       Minecraft$KSAVClip.native_setPositioningMethod(this.nativeRef, p0);
       return;
    }
    public void setPropertyKeyFrames(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$KSAVClip.class, "12")) {
          return;
       }
       Minecraft$KSAVClip.native_setPropertyKeyFrames(this.nativeRef, p0.getArrayList());
       return;
    }
    public void setPropertyKeyFrames(Minecraft$PropertyKeyFrame[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$KSAVClip.class, "13")) {
          return;
       }
       Minecraft$KSAVClip.native_setPropertyKeyFrames(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setRenderType(int p0){
       Minecraft$KSAVClip kSAVClip = Minecraft$KSAVClip.class;
       if (PatchProxy.isSupport(kSAVClip) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kSAVClip, "31")) {
          return;
       }
       Minecraft$KSAVClip.native_setRenderType(this.nativeRef, p0);
       return;
    }
    public void setRotationDeg(int p0){
       Minecraft$KSAVClip kSAVClip = Minecraft$KSAVClip.class;
       if (PatchProxy.isSupport(kSAVClip) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kSAVClip, "10")) {
          return;
       }
       Minecraft$KSAVClip.native_setRotationDeg(this.nativeRef, p0);
       return;
    }
    public void setTimeMap(Minecraft$TimeMapParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$KSAVClip.class, "27")) {
          return;
       }
       Minecraft$KSAVClip.native_setTimeMap(this.nativeRef, p0);
       return;
    }
    public void setWesterosFaceDetectMode(int p0){
       Minecraft$KSAVClip kSAVClip = Minecraft$KSAVClip.class;
       if (PatchProxy.isSupport(kSAVClip) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kSAVClip, "23")) {
          return;
       }
       Minecraft$KSAVClip.native_setWesterosFaceDetectMode(this.nativeRef, p0);
       return;
    }
    public Minecraft$TimeMapParams timeMap(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSAVClip.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$KSAVClip.native_timeMap(this.nativeRef);
    }
    public int westerosFaceDetectMode(){
       Object obj = PatchProxy.apply(null, this, Minecraft$KSAVClip.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$KSAVClip.native_westerosFaceDetectMode(this.nativeRef);
    }
}
