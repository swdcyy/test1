package com.kwai.video.minecraft.model.nano.Minecraft$WesterosFaceMagicParam;
import com.kwai.video.minecraft.model.MutableEffect;
import com.kwai.video.minecraft.model.ModelBase;
import com.kwai.video.minecraft.model.MinecraftModelDefine$EffectType;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosEffectLookupParam;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;

public final class Minecraft$WesterosFaceMagicParam extends MutableEffect	// class@000a9c
{

    public void Minecraft$WesterosFaceMagicParam(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_WesterosFaceMagicParam;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$WesterosFaceMagicParam(long p0){
       super();
       this.nativeRef = p0;
       this.concreteType = MinecraftModelDefine$EffectType.EffectType_WesterosFaceMagicParam;
       NativeObjectManager.register(this, p0);
    }
    public static native String native_assetDir(long p0);
    public static native void native_clear(long p0);
    public static native Minecraft$WesterosFaceMagicParam native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native Minecraft$WesterosEffectLookupParam native_getEffectLookupParam(long p0);
    public static native int native_getEffectParamsCase(long p0);
    public static native String native_indexFile(long p0);
    public static native String native_indexFile720(long p0);
    public static native void native_setAssetDir(long p0,String p1);
    public static native void native_setEffectLookupParam(long p0,Minecraft$WesterosEffectLookupParam p1);
    public static native void native_setIndexFile(long p0,String p1);
    public static native void native_setIndexFile720(long p0,String p1);
    public static native void native_setNoNeedFaceDetect(long p0,boolean p1);
    public static native void native_setTrackAssetTimeRange(long p0,Minecraft$Range p1);
    public String assetDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosFaceMagicParam.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$WesterosFaceMagicParam.native_assetDir(this.nativeRef);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$WesterosFaceMagicParam.class, "1")) {
          return;
       }
       Minecraft$WesterosFaceMagicParam.native_clear(this.nativeRef);
       return;
    }
    public MutableEffect clone(){
       return this.clone();
    }
    public Minecraft$WesterosFaceMagicParam clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosFaceMagicParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$WesterosFaceMagicParam.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public Minecraft$WesterosEffectLookupParam getEffectLookupParam(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosFaceMagicParam.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.hasEffectLookupParam()) {
          return Minecraft$WesterosFaceMagicParam.native_getEffectLookupParam(this.nativeRef);
       }
       return null;
    }
    public int getEffectParamsCase(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosFaceMagicParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$WesterosFaceMagicParam.native_getEffectParamsCase(this.nativeRef);
    }
    public boolean hasEffectLookupParam(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosFaceMagicParam.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getEffectParamsCase() == 7)? true: false;
       return b;
    }
    public String indexFile(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosFaceMagicParam.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$WesterosFaceMagicParam.native_indexFile(this.nativeRef);
    }
    public String indexFile720(){
       Object obj = PatchProxy.apply(null, this, Minecraft$WesterosFaceMagicParam.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$WesterosFaceMagicParam.native_indexFile720(this.nativeRef);
    }
    public native final long native_create();
    public void setAssetDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$WesterosFaceMagicParam.class, "5")) {
          return;
       }
       Minecraft$WesterosFaceMagicParam.native_setAssetDir(this.nativeRef, p0);
       return;
    }
    public void setEffectLookupParam(Minecraft$WesterosEffectLookupParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$WesterosFaceMagicParam.class, "14")) {
          return;
       }
       Minecraft$WesterosFaceMagicParam.native_setEffectLookupParam(this.nativeRef, p0);
       return;
    }
    public void setIndexFile(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$WesterosFaceMagicParam.class, "7")) {
          return;
       }
       Minecraft$WesterosFaceMagicParam.native_setIndexFile(this.nativeRef, p0);
       return;
    }
    public void setIndexFile720(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$WesterosFaceMagicParam.class, "9")) {
          return;
       }
       Minecraft$WesterosFaceMagicParam.native_setIndexFile720(this.nativeRef, p0);
       return;
    }
    public void setNoNeedFaceDetect(boolean p0){
       Minecraft$WesterosFaceMagicParam westerosFace = Minecraft$WesterosFaceMagicParam.class;
       if (PatchProxy.isSupport(westerosFace) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, westerosFace, "11")) {
          return;
       }
       Minecraft$WesterosFaceMagicParam.native_setNoNeedFaceDetect(this.nativeRef, p0);
       return;
    }
    public void setTrackAssetTimeRange(Minecraft$Range p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$WesterosFaceMagicParam.class, "10")) {
          return;
       }
       Minecraft$WesterosFaceMagicParam.native_setTrackAssetTimeRange(this.nativeRef, p0);
       return;
    }
}
