package com.kwai.video.minecraft.model.nano.Minecraft$ResourcePathConfig;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Minecraft$ResourcePathConfig extends ModelBase	// class@000a6d
{

    public void Minecraft$ResourcePathConfig(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$ResourcePathConfig(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native String native_aieditMattingModelDir(long p0);
    public static native String native_beautyPath(long p0);
    public static native void native_clear(long p0);
    public static native Minecraft$ResourcePathConfig native_clone(long p0);
    public static native String native_colorFilterPath(long p0);
    public static native void native_destroy(long p0);
    public static native String native_face3DResourceDir(long p0);
    public static native String native_magicFingerPath(long p0);
    public static native String native_metalLibPath(long p0);
    public static native String native_mmuAnimojiModelDir(long p0);
    public static native String native_mmuBasewhiteModelDir(long p0);
    public static native String native_mmuEarModelDir(long p0);
    public static native String native_mmuFacepropModelDir(long p0);
    public static native String native_mmuMemojiModelDir(long p0);
    public static native String native_mmuModelDir(long p0);
    public static native String native_photoMovieThemePath(long p0);
    public static native void native_setAieditMattingModelDir(long p0,String p1);
    public static native void native_setBeautyPath(long p0,String p1);
    public static native void native_setColorFilterPath(long p0,String p1);
    public static native void native_setFace3DResourceDir(long p0,String p1);
    public static native void native_setMagicFingerPath(long p0,String p1);
    public static native void native_setMetalLibPath(long p0,String p1);
    public static native void native_setMmuAnimojiModelDir(long p0,String p1);
    public static native void native_setMmuBasewhiteModelDir(long p0,String p1);
    public static native void native_setMmuEarModelDir(long p0,String p1);
    public static native void native_setMmuFacepropModelDir(long p0,String p1);
    public static native void native_setMmuMemojiModelDir(long p0,String p1);
    public static native void native_setMmuModelDir(long p0,String p1);
    public static native void native_setPhotoMovieThemePath(long p0,String p1);
    public static native void native_setVisualEffectPath(long p0,String p1);
    public static native void native_setWesterosAbTestJson(long p0,String p1);
    public static native void native_setWesterosDeformJsonPath(long p0,String p1);
    public static native void native_setYlabAnimalLandmarksModelDir(long p0,String p1);
    public static native void native_setYlabArModelDir(long p0,String p1);
    public static native void native_setYlabBeautifyAibrightDir(long p0,String p1);
    public static native void native_setYlabBeautifyAideflawDir(long p0,String p1);
    public static native void native_setYlabBeautifyAssetsResourceDir(long p0,String p1);
    public static native void native_setYlabBeautifyBacklightDir(long p0,String p1);
    public static native void native_setYlabBeautifyStrategyDir(long p0,String p1);
    public static native void native_setYlabClothSegModelDir(long p0,String p1);
    public static native void native_setYlabFaceAttributesModelDir(long p0,String p1);
    public static native void native_setYlabFaceSegModelDir(long p0,String p1);
    public static native void native_setYlabGeneralHandposeModelDir(long p0,String p1);
    public static native void native_setYlabGestureModelDir(long p0,String p1);
    public static native void native_setYlabHairDirModelDir(long p0,String p1);
    public static native void native_setYlabHairModelDir(long p0,String p1);
    public static native void native_setYlabHandSegModelDir(long p0,String p1);
    public static native void native_setYlabHeadSegModelDir(long p0,String p1);
    public static native void native_setYlabKeypointModelDir(long p0,String p1);
    public static native void native_setYlabLandmarkModelDir(long p0,String p1);
    public static native void native_setYlabMattingModelDir(long p0,String p1);
    public static native void native_setYlabModelDir(long p0,String p1);
    public static native void native_setYlabNailSegModelDir(long p0,String p1);
    public static native void native_setYlabParsingModelDir(long p0,String p1);
    public static native void native_setYlabPlaneModelDir(long p0,String p1);
    public static native void native_setYlabPoseModelDir(long p0,String p1);
    public static native void native_setYlabSceneModelDir(long p0,String p1);
    public static native void native_setYlabSkinSegModelDir(long p0,String p1);
    public static native void native_setYlabSkyModelDir(long p0,String p1);
    public static native String native_visualEffectPath(long p0);
    public static native String native_westerosAbTestJson(long p0);
    public static native String native_westerosDeformJsonPath(long p0);
    public static native String native_ylabAnimalLandmarksModelDir(long p0);
    public static native String native_ylabArModelDir(long p0);
    public static native String native_ylabBeautifyAibrightDir(long p0);
    public static native String native_ylabBeautifyAideflawDir(long p0);
    public static native String native_ylabBeautifyAssetsResourceDir(long p0);
    public static native String native_ylabBeautifyBacklightDir(long p0);
    public static native String native_ylabBeautifyStrategyDir(long p0);
    public static native String native_ylabClothSegModelDir(long p0);
    public static native String native_ylabFaceAttributesModelDir(long p0);
    public static native String native_ylabFaceSegModelDir(long p0);
    public static native String native_ylabGeneralHandposeModelDir(long p0);
    public static native String native_ylabGestureModelDir(long p0);
    public static native String native_ylabHairDirModelDir(long p0);
    public static native String native_ylabHairModelDir(long p0);
    public static native String native_ylabHandSegModelDir(long p0);
    public static native String native_ylabHeadSegModelDir(long p0);
    public static native String native_ylabKeypointModelDir(long p0);
    public static native String native_ylabLandmarkModelDir(long p0);
    public static native String native_ylabMattingModelDir(long p0);
    public static native String native_ylabModelDir(long p0);
    public static native String native_ylabNailSegModelDir(long p0);
    public static native String native_ylabParsingModelDir(long p0);
    public static native String native_ylabPlaneModelDir(long p0);
    public static native String native_ylabPoseModelDir(long p0);
    public static native String native_ylabSceneModelDir(long p0);
    public static native String native_ylabSkinSegModelDir(long p0);
    public static native String native_ylabSkyModelDir(long p0);
    public String aieditMattingModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_aieditMattingModelDir(this.nativeRef);
    }
    public String beautyPath(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_beautyPath(this.nativeRef);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$ResourcePathConfig.class, "1")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$ResourcePathConfig clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public String colorFilterPath(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_colorFilterPath(this.nativeRef);
    }
    public String face3DResourceDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "75");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_face3DResourceDir(this.nativeRef);
    }
    public String magicFingerPath(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_magicFingerPath(this.nativeRef);
    }
    public String metalLibPath(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_metalLibPath(this.nativeRef);
    }
    public String mmuAnimojiModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_mmuAnimojiModelDir(this.nativeRef);
    }
    public String mmuBasewhiteModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_mmuBasewhiteModelDir(this.nativeRef);
    }
    public String mmuEarModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_mmuEarModelDir(this.nativeRef);
    }
    public String mmuFacepropModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_mmuFacepropModelDir(this.nativeRef);
    }
    public String mmuMemojiModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_mmuMemojiModelDir(this.nativeRef);
    }
    public String mmuModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "79");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_mmuModelDir(this.nativeRef);
    }
    public native final long native_create();
    public String photoMovieThemePath(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_photoMovieThemePath(this.nativeRef);
    }
    public void setAieditMattingModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "26")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setAieditMattingModelDir(this.nativeRef, p0);
       return;
    }
    public void setBeautyPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "6")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setBeautyPath(this.nativeRef, p0);
       return;
    }
    public void setColorFilterPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "4")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setColorFilterPath(this.nativeRef, p0);
       return;
    }
    public void setFace3DResourceDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "76")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setFace3DResourceDir(this.nativeRef, p0);
       return;
    }
    public void setMagicFingerPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "10")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setMagicFingerPath(this.nativeRef, p0);
       return;
    }
    public void setMetalLibPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "24")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setMetalLibPath(this.nativeRef, p0);
       return;
    }
    public void setMmuAnimojiModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "64")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setMmuAnimojiModelDir(this.nativeRef, p0);
       return;
    }
    public void setMmuBasewhiteModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "66")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setMmuBasewhiteModelDir(this.nativeRef, p0);
       return;
    }
    public void setMmuEarModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "70")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setMmuEarModelDir(this.nativeRef, p0);
       return;
    }
    public void setMmuFacepropModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "68")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setMmuFacepropModelDir(this.nativeRef, p0);
       return;
    }
    public void setMmuMemojiModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "72")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setMmuMemojiModelDir(this.nativeRef, p0);
       return;
    }
    public void setMmuModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "80")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setMmuModelDir(this.nativeRef, p0);
       return;
    }
    public void setPhotoMovieThemePath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "12")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setPhotoMovieThemePath(this.nativeRef, p0);
       return;
    }
    public void setVisualEffectPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "8")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setVisualEffectPath(this.nativeRef, p0);
       return;
    }
    public void setWesterosAbTestJson(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "18")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setWesterosAbTestJson(this.nativeRef, p0);
       return;
    }
    public void setWesterosDeformJsonPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "14")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setWesterosDeformJsonPath(this.nativeRef, p0);
       return;
    }
    public void setYlabAnimalLandmarksModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "44")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabAnimalLandmarksModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabArModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "54")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabArModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabBeautifyAibrightDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "84")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabBeautifyAibrightDir(this.nativeRef, p0);
       return;
    }
    public void setYlabBeautifyAideflawDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "88")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabBeautifyAideflawDir(this.nativeRef, p0);
       return;
    }
    public void setYlabBeautifyAssetsResourceDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "78")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabBeautifyAssetsResourceDir(this.nativeRef, p0);
       return;
    }
    public void setYlabBeautifyBacklightDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "86")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabBeautifyBacklightDir(this.nativeRef, p0);
       return;
    }
    public void setYlabBeautifyStrategyDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "82")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabBeautifyStrategyDir(this.nativeRef, p0);
       return;
    }
    public void setYlabClothSegModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "52")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabClothSegModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabFaceAttributesModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "40")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabFaceAttributesModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabFaceSegModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "56")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabFaceSegModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabGeneralHandposeModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "36")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabGeneralHandposeModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabGestureModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "28")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabGestureModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabHairDirModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "74")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabHairDirModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabHairModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "30")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabHairModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabHandSegModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "58")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabHandSegModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabHeadSegModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "60")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabHeadSegModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabKeypointModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "42")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabKeypointModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabLandmarkModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "34")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabLandmarkModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabMattingModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "20")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabMattingModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "16")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabNailSegModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "50")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabNailSegModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabParsingModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "46")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabParsingModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabPlaneModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "62")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabPlaneModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabPoseModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "32")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabPoseModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabSceneModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "22")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabSceneModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabSkinSegModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "48")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabSkinSegModelDir(this.nativeRef, p0);
       return;
    }
    public void setYlabSkyModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$ResourcePathConfig.class, "38")) {
          return;
       }
       Minecraft$ResourcePathConfig.native_setYlabSkyModelDir(this.nativeRef, p0);
       return;
    }
    public String visualEffectPath(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_visualEffectPath(this.nativeRef);
    }
    public String westerosAbTestJson(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_westerosAbTestJson(this.nativeRef);
    }
    public String westerosDeformJsonPath(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_westerosDeformJsonPath(this.nativeRef);
    }
    public String ylabAnimalLandmarksModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabAnimalLandmarksModelDir(this.nativeRef);
    }
    public String ylabArModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabArModelDir(this.nativeRef);
    }
    public String ylabBeautifyAibrightDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "83");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabBeautifyAibrightDir(this.nativeRef);
    }
    public String ylabBeautifyAideflawDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "87");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabBeautifyAideflawDir(this.nativeRef);
    }
    public String ylabBeautifyAssetsResourceDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "77");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabBeautifyAssetsResourceDir(this.nativeRef);
    }
    public String ylabBeautifyBacklightDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabBeautifyBacklightDir(this.nativeRef);
    }
    public String ylabBeautifyStrategyDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabBeautifyStrategyDir(this.nativeRef);
    }
    public String ylabClothSegModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabClothSegModelDir(this.nativeRef);
    }
    public String ylabFaceAttributesModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabFaceAttributesModelDir(this.nativeRef);
    }
    public String ylabFaceSegModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabFaceSegModelDir(this.nativeRef);
    }
    public String ylabGeneralHandposeModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabGeneralHandposeModelDir(this.nativeRef);
    }
    public String ylabGestureModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabGestureModelDir(this.nativeRef);
    }
    public String ylabHairDirModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabHairDirModelDir(this.nativeRef);
    }
    public String ylabHairModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabHairModelDir(this.nativeRef);
    }
    public String ylabHandSegModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabHandSegModelDir(this.nativeRef);
    }
    public String ylabHeadSegModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabHeadSegModelDir(this.nativeRef);
    }
    public String ylabKeypointModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabKeypointModelDir(this.nativeRef);
    }
    public String ylabLandmarkModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabLandmarkModelDir(this.nativeRef);
    }
    public String ylabMattingModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabMattingModelDir(this.nativeRef);
    }
    public String ylabModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabModelDir(this.nativeRef);
    }
    public String ylabNailSegModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabNailSegModelDir(this.nativeRef);
    }
    public String ylabParsingModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabParsingModelDir(this.nativeRef);
    }
    public String ylabPlaneModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabPlaneModelDir(this.nativeRef);
    }
    public String ylabPoseModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabPoseModelDir(this.nativeRef);
    }
    public String ylabSceneModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabSceneModelDir(this.nativeRef);
    }
    public String ylabSkinSegModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabSkinSegModelDir(this.nativeRef);
    }
    public String ylabSkyModelDir(){
       Object obj = PatchProxy.apply(null, this, Minecraft$ResourcePathConfig.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$ResourcePathConfig.native_ylabSkyModelDir(this.nativeRef);
    }
}
