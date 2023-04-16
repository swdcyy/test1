package com.kwai.video.minecraft.model.nano.Minecraft$TemplateClip;
import com.kwai.video.minecraft.model.MutableClip;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$ClipType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.nano.Minecraft$AICut;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.nano.Minecraft$KSAVClip;
import com.kwai.video.minecraft.model.nano.Minecraft$Opening;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import com.kwai.video.minecraft.model.nano.Minecraft$CropOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$Repost;
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

public final class Minecraft$TemplateClip extends MutableClip	// class@000a79
{

    public void Minecraft$TemplateClip(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$ClipType.ClipType_TemplateClip;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$TemplateClip(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$ClipType.ClipType_TemplateClip;
       NativeObjectManager.register(this, p0);
    }
    public static native Minecraft$AICut native_aicut(long p0);
    public static native void native_clear(long p0);
    public static native Minecraft$TemplateClip native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native ArrayList native_irreplaceableClips(long p0);
    public static native Minecraft$KSAVClip native_irreplaceableClips_getItem(long p0,int p1);
    public static native int native_irreplaceableClips_size(long p0);
    public static native Minecraft$Opening native_opening(long p0);
    public static native ArrayList native_replaceableClips(long p0);
    public static native void native_setAicut(long p0,Minecraft$AICut p1);
    public static native void native_setAssetTransform(long p0,Minecraft$AssetTransform p1);
    public static native void native_setAssetTransformFlag(long p0,int p1);
    public static native void native_setCropOptions(long p0,Minecraft$CropOptions p1);
    public static native void native_setIrreplaceableClips(long p0,ArrayList p1);
    public static native void native_setOpening(long p0,Minecraft$Opening p1);
    public static native void native_setPositioningMethod(long p0,int p1);
    public static native void native_setReplaceableClips(long p0,ArrayList p1);
    public static native void native_setRepost(long p0,Minecraft$Repost p1);
    public static native void native_setTemplateType(long p0,int p1);
    public static native int native_templateType(long p0);
    public Minecraft$AICut aicut(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TemplateClip.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TemplateClip.native_aicut(this.nativeRef);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$TemplateClip.class, "1")) {
          return;
       }
       Minecraft$TemplateClip.native_clear(this.nativeRef);
       return;
    }
    public MutableClip clone(){
       return this.clone();
    }
    public Minecraft$TemplateClip clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TemplateClip.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TemplateClip.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public ImmutableArray irreplaceableClips(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TemplateClip.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(Minecraft$TemplateClip.native_irreplaceableClips(this.nativeRef), Minecraft$KSAVClip.class);
    }
    public Minecraft$KSAVClip irreplaceableClips(int p0){
       Minecraft$TemplateClip templateClip = Minecraft$TemplateClip.class;
       if (PatchProxy.isSupport(templateClip)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, templateClip, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Minecraft$TemplateClip.native_irreplaceableClips_getItem(this.nativeRef, p0);
    }
    public int irreplaceableClipsSize(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TemplateClip.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$TemplateClip.native_irreplaceableClips_size(this.nativeRef);
    }
    public native final long native_create();
    public Minecraft$Opening opening(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TemplateClip.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TemplateClip.native_opening(this.nativeRef);
    }
    public ImmutableArray replaceableClips(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TemplateClip.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(Minecraft$TemplateClip.native_replaceableClips(this.nativeRef), Minecraft$KSAVClip.class);
    }
    public void setAicut(Minecraft$AICut p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TemplateClip.class, "20")) {
          return;
       }
       Minecraft$TemplateClip.native_setAicut(this.nativeRef, p0);
       return;
    }
    public void setAssetTransform(Minecraft$AssetTransform p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TemplateClip.class, "13")) {
          return;
       }
       Minecraft$TemplateClip.native_setAssetTransform(this.nativeRef, p0);
       return;
    }
    public void setAssetTransformFlag(int p0){
       Minecraft$TemplateClip templateClip = Minecraft$TemplateClip.class;
       if (PatchProxy.isSupport(templateClip) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, templateClip, "14")) {
          return;
       }
       Minecraft$TemplateClip.native_setAssetTransformFlag(this.nativeRef, p0);
       return;
    }
    public void setCropOptions(Minecraft$CropOptions p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TemplateClip.class, "12")) {
          return;
       }
       Minecraft$TemplateClip.native_setCropOptions(this.nativeRef, p0);
       return;
    }
    public void setIrreplaceableClips(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TemplateClip.class, "8")) {
          return;
       }
       Minecraft$TemplateClip.native_setIrreplaceableClips(this.nativeRef, p0.getArrayList());
       return;
    }
    public void setIrreplaceableClips(Minecraft$KSAVClip[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TemplateClip.class, "9")) {
          return;
       }
       Minecraft$TemplateClip.native_setIrreplaceableClips(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setOpening(Minecraft$Opening p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TemplateClip.class, "17")) {
          return;
       }
       Minecraft$TemplateClip.native_setOpening(this.nativeRef, p0);
       return;
    }
    public void setPositioningMethod(int p0){
       Minecraft$TemplateClip templateClip = Minecraft$TemplateClip.class;
       if (PatchProxy.isSupport(templateClip) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, templateClip, "15")) {
          return;
       }
       Minecraft$TemplateClip.native_setPositioningMethod(this.nativeRef, p0);
       return;
    }
    public void setReplaceableClips(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TemplateClip.class, "6")) {
          return;
       }
       Minecraft$TemplateClip.native_setReplaceableClips(this.nativeRef, p0.getArrayList());
       return;
    }
    public void setRepost(Minecraft$Repost p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TemplateClip.class, "18")) {
          return;
       }
       Minecraft$TemplateClip.native_setRepost(this.nativeRef, p0);
       return;
    }
    public void setTemplateType(int p0){
       Minecraft$TemplateClip templateClip = Minecraft$TemplateClip.class;
       if (PatchProxy.isSupport(templateClip) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, templateClip, "4")) {
          return;
       }
       Minecraft$TemplateClip.native_setTemplateType(this.nativeRef, p0);
       return;
    }
    public int templateType(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TemplateClip.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$TemplateClip.native_templateType(this.nativeRef);
    }
}
