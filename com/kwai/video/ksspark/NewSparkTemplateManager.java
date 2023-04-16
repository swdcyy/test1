package com.kwai.video.ksspark.NewSparkTemplateManager;
import com.kwai.video.ksspark.NewSparkLocalSoLoader;
import java.lang.String;
import ekd.v0;
import java.lang.StringBuilder;
import java.lang.System;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import com.kwai.video.ksspark.NewSparkTemplateManager$SparkTemplateDelegate;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.kwai.video.ksspark.NewSparkTemplateDefine;
import com.kwai.video.ksspark.model.VideoProjectWrapper;
import com.kwai.video.minecraft.model.MutableTimeline;
import com.kwai.video.ksspark.NewSparkConstructListener;
import java.util.Map;
import java.util.ArrayList;
import com.kwai.video.ksspark.NewSparkTemplateManager$TemplateSummary;
import com.kwai.video.ksspark.NewSparkDownloadService;
import com.kwai.video.ksspark.NewSparkHttpService;
import com.kwai.video.ksspark.NewSparkLogInterface;
import com.kwai.video.ksspark.NewSparkLog;
import java.lang.Number;
import com.kwai.video.ksspark.model.TemplateInfo;

public class NewSparkTemplateManager	// class@000932
{
    public final long mNativeTemplateManagerAddress;
    public static NewSparkTemplateManager$SparkTemplateDelegate sharedDelegate;

    static {
       if (NewSparkLocalSoLoader.autoLoadSo) {
          "converter".b("converter");
       }
       EditorSdkLogger.w("NewSparkTemplateManager", "xbuild_spark_"+System.currentTimeMillis());
    }
    public void NewSparkTemplateManager(NewSparkTemplateManager$SparkTemplateDelegate p0){
       super();
       NewSparkTemplateManager.sharedDelegate = p0;
       this.mNativeTemplateManagerAddress = NewSparkTemplateManager.nativeCreateTemplateManager();
    }
    public static String aeBuiltinResPath(){
       NewSparkTemplateManager$SparkTemplateDelegate obj = PatchProxy.apply(null, null, NewSparkTemplateManager.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = NewSparkTemplateManager.sharedDelegate;
       if (obj == null || obj.aeBuiltinResPath() == null) {
          return "";
       }
       return NewSparkTemplateManager.sharedDelegate.aeBuiltinResPath();
    }
    public static void cancelConstruct(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, NewSparkTemplateManager.class, "9")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          NewSparkTemplateManager.nativeCancelConstruct(p0);
       }
       return;
    }
    public static boolean checkVersion(){
       Object obj = PatchProxy.apply(null, null, NewSparkTemplateManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = NewSparkTemplateManager.nativeFallbackTemplateVersion();
       int i1 = NewSparkTemplateDefine.fallbackTemplateVersion;
       if (NewSparkTemplateManager.templateVersion() == NewSparkTemplateDefine.templateVersion && i == i1) {
          return true;
       }
       EditorSdkLogger.e("NewSparkTemplateManager", "native version != java version。联系liyishan更新 ksspark");
       return false;
    }
    public static String dynamicTextRootPath(){
       return "";
    }
    public static String fontPath(String p0){
       NewSparkTemplateManager$SparkTemplateDelegate obj = PatchProxy.applyOneRefs(p0, null, NewSparkTemplateManager.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = NewSparkTemplateManager.sharedDelegate;
       if (obj == null || obj.fontPath(p0) == null) {
          return "";
       }
       return NewSparkTemplateManager.sharedDelegate.fontPath(p0);
    }
    public static native void nativeCancelConstruct(String p0);
    public static native void nativeClearCutOutCache();
    public static native MutableTimeline nativeCompileTemplateInfo(long p0,long p1,VideoProjectWrapper p2);
    public static native boolean nativeConstructSparkAsync(long p0,long p1,String p2,NewSparkConstructListener p3);
    public static native VideoProjectWrapper nativeConstructSparkWithResMapSync(long p0,long p1,Map p2);
    public static native long nativeCreateTemplateManager();
    public static native void nativeDelete(long p0);
    public static native void nativeDeleteTemplateInfo(long p0);
    public static native void nativeDeleteTemplateManager(long p0);
    public static native int nativeFallbackTemplateVersion();
    public static native int nativeGetAssetHeight(long p0,long p1);
    public static native String nativeGetAssetPath(long p0,long p1);
    public static native double nativeGetAssetPlaybackStart(long p0,long p1);
    public static native double nativeGetAssetRenderPosDuration(long p0,long p1);
    public static native double nativeGetAssetScaleX(long p0,long p1);
    public static native double nativeGetAssetScaleY(long p0,long p1);
    public static native int nativeGetAssetWidth(long p0,long p1);
    public static native int nativeGetHeight(long p0);
    public static native String nativeGetPath(long p0);
    public static native ArrayList nativeGetReplaceableAssets(long p0);
    public static native boolean nativeGetTemplateSummary(NewSparkTemplateManager$TemplateSummary p0,String p1);
    public static native int nativeGetWidth(long p0);
    public static native void nativeInitLogModule();
    public static native boolean nativeIsNewSpark(long p0,String p1);
    public static native long nativeParseTemplateData(long p0,String p1);
    public static native int nativeProjectDuration(long p0);
    public static native int nativeProjectVersion(long p0);
    public static native void nativeSetCutOutCache(String p0,double p1);
    public static native void nativeSetDownloadService(NewSparkDownloadService p0);
    public static native void nativeSetHttpService(NewSparkHttpService p0);
    public static native void nativeSetSpecialMaterialZtHost(String p0);
    public static native int nativeTemplateVersion();
    public static native void nativeUpdateReplaceableAsset(long p0,long p1,double p2,double p3,String p4);
    public static String projectPlaceHolderImagePath(){
       NewSparkTemplateManager$SparkTemplateDelegate obj = PatchProxy.apply(null, null, NewSparkTemplateManager.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = NewSparkTemplateManager.sharedDelegate;
       if (obj == null || obj.projectPlaceHolderImagePath() == null) {
          return "";
       }
       return NewSparkTemplateManager.sharedDelegate.projectPlaceHolderImagePath();
    }
    public static void setDownloadService(NewSparkDownloadService p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, NewSparkTemplateManager.class, "12")) {
          return;
       }
       NewSparkTemplateManager.nativeSetDownloadService(p0);
       return;
    }
    public static void setHttpService(NewSparkHttpService p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, NewSparkTemplateManager.class, "11")) {
          return;
       }
       NewSparkTemplateManager.nativeSetHttpService(p0);
       return;
    }
    public static void setNewSparkLogger(NewSparkLogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, NewSparkTemplateManager.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       NewSparkLog.setLogger(p0);
       NewSparkTemplateManager.nativeInitLogModule();
       return;
    }
    public static void setSpecialMaterialZtHost(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, NewSparkTemplateManager.class, "13")) {
          return;
       }
       NewSparkTemplateManager.nativeSetSpecialMaterialZtHost(p0);
       return;
    }
    public static NewSparkTemplateManager$TemplateSummary summary(String p0){
       NewSparkTemplateManager$TemplateSummary obj = PatchProxy.applyOneRefs(p0, null, NewSparkTemplateManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new NewSparkTemplateManager$TemplateSummary();
       if (NewSparkTemplateManager.nativeGetTemplateSummary(obj, p0)) {
          return obj;
       }
       return null;
    }
    public static int templateVersion(){
       Object obj = PatchProxy.apply(null, null, NewSparkTemplateManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return NewSparkTemplateManager.nativeTemplateVersion();
    }
    public static String trailerSubtitlePath(String p0){
       NewSparkTemplateManager$SparkTemplateDelegate obj = PatchProxy.applyOneRefs(p0, null, NewSparkTemplateManager.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = NewSparkTemplateManager.sharedDelegate;
       if (obj == null || obj.getTrailerSubtitlePath(p0) == null) {
          return "";
       }
       return NewSparkTemplateManager.sharedDelegate.getTrailerSubtitlePath(p0);
    }
    public static String trailerTitlePath(String p0){
       NewSparkTemplateManager$SparkTemplateDelegate obj = PatchProxy.applyOneRefs(p0, null, NewSparkTemplateManager.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = NewSparkTemplateManager.sharedDelegate;
       if (obj == null || obj.getTrailerTitlePath(p0) == null) {
          return "";
       }
       return NewSparkTemplateManager.sharedDelegate.getTrailerTitlePath(p0);
    }
    public MutableTimeline compileTemplateData(TemplateInfo p0,VideoProjectWrapper p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, NewSparkTemplateManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return NewSparkTemplateManager.nativeCompileTemplateInfo(this.mNativeTemplateManagerAddress, p0.getNativeInfoAddress(), p1);
    }
    public void constructSparkAsync(TemplateInfo p0,String p1,NewSparkConstructListener p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, NewSparkTemplateManager.class, "8")) {
          return;
       }
       if (p0 == null || (!TextUtils.x(p1) && p2 != null)) {
          NewSparkTemplateManager.nativeConstructSparkAsync(this.mNativeTemplateManagerAddress, p0.getNativeInfoAddress(), p1, p2);
       }
    label_0025 :
       return;
    }
    public VideoProjectWrapper constructSparkWithResMapSync(TemplateInfo p0,Map p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, NewSparkTemplateManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return NewSparkTemplateManager.nativeConstructSparkWithResMapSync(this.mNativeTemplateManagerAddress, p0.getNativeInfoAddress(), p1);
    }
    public boolean isNewSpark(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewSparkTemplateManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       NewSparkTemplateManager.checkVersion();
       return NewSparkTemplateManager.nativeIsNewSpark(this.mNativeTemplateManagerAddress, p0);
    }
    public TemplateInfo parseTemplateData(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewSparkTemplateManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long l = NewSparkTemplateManager.nativeParseTemplateData(this.mNativeTemplateManagerAddress, p0);
       if (l <= 0) {
          return null;
       }
       return new TemplateInfo(l);
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, NewSparkTemplateManager.class, "19")) {
          return;
       }
       NewSparkTemplateManager.nativeDeleteTemplateManager(this.mNativeTemplateManagerAddress);
       return;
    }
}
