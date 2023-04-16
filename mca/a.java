package mca.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.util.Map;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import java.util.HashMap;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.minecraft.model.nano.Minecraft$InputFileOptions;
import java.lang.Double;
import java.lang.Boolean;
import com.kwai.video.clipkit.config.ClipKitConfigManager;
import com.kwai.video.clipkit.config.ClipKitConfig;
import com.kwai.video.clipkit.config.EditorEncodeConfig;
import android.util.Pair;
import java.lang.Integer;
import ykd.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import km6.f;
import qr4.k$e;
import qr4.m$p;
import qr4.k$f;
import ekd.j;
import qr4.i;
import qr4.k$j;
import qr4.m$k0;
import qr4.k$l;
import com.google.protobuf.nano.MessageNano;
import com.kwai.video.minecraft.model.nano.Minecraft$ResourcePathConfig;
import wkd.b;
import j80.c;
import java.io.File;
import com.yxcorp.gifshow.util.resource.Category;
import qi9.d;
import boc.e;
import com.yxcorp.gifshow.util.resource.MagicModel;
import com.yxcorp.utility.Log;
import mca.a$a;
import com.kwai.video.editorsdk2.logger.EditorSdkDebugLogger;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import ekd.k1;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.aicut.ui.loading.a;
import android.content.Context;
import com.kwai.ksvideorendersdk.EditorSDKSoLoader$Handler;
import com.yxcorp.gifshow.media.model.EditorSdkDecodeConfig;
import java.lang.reflect.Type;
import i80.a;
import u6b.a;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$AndroidDecoderConfig;
import com.yxcorp.utility.TextUtils;
import com.kwai.video.clipkit.hardware.ClipDPHardwareConfigManager;
import xf6.g;
import java.lang.CharSequence;
import com.kwai.framework.abtest.f;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import cj9.b;
import com.yxcorp.gifshow.media.model.EncodeConfig$ImportEncodeConfig;
import com.kwai.video.devicepersona.hardware.HDRDecoderInfo;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager;
import com.yxcorp.utility.SystemUtil;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import android.os.Build$VERSION;
import java.lang.Math;
import com.kwai.video.devicepersona.benchmark.BenchmarkEncodeProfile;
import xf6.l;

public class a	// class@002fd2
{
    public static boolean a;

    public void a(){
       super();
    }
    public static int A(){
       Object obj = PatchProxy.apply(null, null, a.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("editor_mediacodec_encode_color_system", 0);
    }
    public static void B(){
       if (PatchProxy.applyVoid(null, null, a.class, "9")) {
          return;
       }
       Map map = MagicEmojiResourceHelper.m();
       if (map.isEmpty()) {
          return;
       }
       EditorSdk2Utils.updateResourcePathConfigMap(EditorSdk2Utils.createDynamicResourcePathConfigMap(map));
       return;
    }
    public static EditorSdk2V2$VideoEditorProject a(String[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.u();
       return EditorSdk2UtilsV2.createProjectWithFileArray(p0);
    }
    public static EditorSdk2V2$VideoEditorProject b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.u();
       return EditorSdk2UtilsV2.createProjectWithFile(p0);
    }
    public static EditorSdk2V2$VideoEditorProject c(String[] p0,double p1,Minecraft$InputFileOptions p2,String p3){
       if (PatchProxy.isSupport(a.class)) {
          p2 = PatchProxy.applyFourRefs(p0, Double.valueOf(p1), null, p3, null, a.class, "4");
          if (p2 != PatchProxyResult.class) {
             return p2;
          }
       }
       a.u();
       return EditorSdk2UtilsV2.createProjectWithPhotoArray(p0, p1, null, p3);
    }
    public static boolean d(){
       Object obj = PatchProxy.apply(null, null, a.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("editor_disable_mipmap", false);
    }
    public static long e(){
       Object obj = PatchProxy.apply(null, null, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (long)a.t().a("editor_media_codec_bframe_count", 0);
    }
    public static boolean f(){
       Object obj = PatchProxy.apply(null, null, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("editor_color_system", false);
    }
    public static boolean g(){
       Object obj = PatchProxy.apply(null, null, a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("editor_ffmpeg_deocde_invalid_data", false);
    }
    public static boolean h(){
       Object obj = PatchProxy.apply(null, null, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("editHDRToSDR", false);
    }
    public static boolean i(){
       Object obj = PatchProxy.apply(null, null, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("editor_enable_export_hevc_android", false);
    }
    public static boolean j(){
       Object obj = PatchProxy.apply(null, null, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("editor_enable_mcbb_size_change", false);
    }
    public static boolean k(){
       Object obj = PatchProxy.apply(null, null, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("editor_media_codec_adapt_pixel_flexible", false);
    }
    public static int l(){
       EditorEncodeConfig obj = PatchProxy.apply(null, null, a.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (a.a) {
          return EditorSdk2Utils.getEnableSkipVideoTranscode();
       }
       obj = null;
       ClipKitConfig config = ClipKitConfigManager.getInstance().getConfig();
       if (config != null && config.getEditorEncodeConfig() != null) {
          obj = config.getEditorEncodeConfig().enableSkipVideoTranscode;
       }
       return obj;
    }
    public static String m(){
       Object obj = PatchProxy.apply(null, null, a.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().c("editor_encode_pre_analyze_str", "");
    }
    public static Pair n(EditorSdk2V2$VideoEditorProject p0,int p1,int p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, a.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0.setProjectOutputWidth(a.s(p0));
       p0.setProjectOutputHeight(a.r(p0));
       Object[] objArray = new Object[0];
       a.C().w("EditorSdkUtil", "getExportSizeForceSetProjectOutputDimension maxWidth:"+p1+",maxHeight:"+p2+",project.projectOutputWidth\(\):"+p0.projectOutputWidth()+",project.projectOutputHeight\(\):"+p0.projectOutputHeight(), objArray);
       return EditorSdk2UtilsV2.getExportSize(p0, p1, p2);
    }
    public static int o(){
       EditorEncodeConfig obj = PatchProxy.apply(null, null, a.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (a.a) {
          return EditorSdk2Utils.getExportVersion();
       }
       obj = 1;
       ClipKitConfig config = ClipKitConfigManager.getInstance().getConfig();
       if (config != null && config.getEditorEncodeConfig() != null) {
          obj = config.getEditorEncodeConfig().exportVersion;
       }
       return obj;
    }
    public static byte[] p(VideoContext p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (f.f(p0) || f.g(p0)) {
          return a.q(p0.w(), p0.u(), f.e(p0));
       }
       Object[] objArray = new Object[0];
       a.C().w("EditorSdkUtil", "getInfoBytes\(\)  should not write magic and kuaishan sei", objArray);
       byte[] uobyteArray = new byte[0];
       return uobyteArray;
    }
    public static byte[] q(k$e[] p0,m$p p1,k$f[] p2){
       Object[] objArray;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || (j.h(p0) && (p1 == null && (p2 == null || j.h(p2))))) {
          objArray = new Object[0];
          a.C().w("EditorSdkUtil", "getInfoBytes\(\) kuaishan and magicEmojis and magicFaceEffectRanges are null", objArray);
          byte[] uobyteArray = new byte[0];
          return uobyteArray;
       }else {
          i oi = new i();
          if (p0 != null && !j.h(p0)) {
             k$j oj = new k$j();
             oj.u = p0;
             oi.c = oj;
             Object[] objArray1 = new Object[0];
             a.C().w("EditorSdkUtil", "getInfoBytes\(\) find magicEmojis.size="+p0.length, objArray1);
          }
          if (p1 != null) {
             m$k0 ok0 = new m$k0();
             ok0.I = p1;
             oi.b = ok0;
             objArray = new Object[0];
             a.C().w("EditorSdkUtil", "getInfoBytes\(\) find kuaishan", objArray);
          }
          if (p2 != null && p2.length > 0) {
             k$l ol = new k$l();
             ol.g = p2;
             if (oi.c == null) {
                oi.c = new k$j();
             }
             k$l[] olArray = new k$l[]{ol};
             objArray.t = olArray;
             objArray = new Object[0];
             a.C().w("EditorSdkUtil", "getInfoBytes\(\) find magicFaceEffectRange", objArray);
          }
          return MessageNano.toByteArray(oi);
       }
    }
    public static int r(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 != null && p0.projectOutputHeight() > 0) {
          return p0.projectOutputHeight();
       }
       return EditorSdk2UtilsV2.getComputedHeight(p0);
    }
    public static int s(EditorSdk2V2$VideoEditorProject p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 != null && p0.projectOutputWidth() > 0) {
          return p0.projectOutputWidth();
       }
       return EditorSdk2UtilsV2.getComputedWidth(p0);
    }
    public static Minecraft$ResourcePathConfig t(){
       Minecraft$ResourcePathConfig obj = PatchProxy.apply(null, null, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Minecraft$ResourcePathConfig();
       obj.setColorFilterPath(b.a(-1504323719).m()+"/filter_resource/");
       obj.setPhotoMovieThemePath(Category.THEME.getResourceDir());
       obj.setVisualEffectPath(Category.EFFECT.getResourceDir());
       obj.setMagicFingerPath(Category.MAGIC_FINGER.getResourceDir());
       obj.setWesterosDeformJsonPath(MagicEmojiResourceHelper.d());
       obj.setFace3DResourceDir(MagicEmojiResourceHelper.e());
       obj.setWesterosAbTestJson(d.a());
       MagicModel c = e.c;
       obj.setYlabModelDir(c.getResourceDir());
       obj.setYlabAnimalLandmarksModelDir(e.d.getResourceDir());
       obj.setYlabArModelDir(e.j.getResourceDir());
       obj.setYlabClothSegModelDir(e.i.getResourceDir());
       obj.setYlabFaceAttributesModelDir(e.l.getResourceDir());
       obj.setYlabFaceSegModelDir(e.m.getResourceDir());
       obj.setYlabGeneralHandposeModelDir(e.r.getResourceDir());
       obj.setYlabGestureModelDir(e.z.getResourceDir());
       obj.setYlabHairModelDir(e.s.getResourceDir());
       obj.setYlabHairDirModelDir(e.n.getResourceDir());
       obj.setYlabHandSegModelDir(e.t.getResourceDir());
       obj.setYlabHeadSegModelDir(e.u.getResourceDir());
       obj.setYlabKeypointModelDir(e.o.getResourceDir());
       obj.setYlabLandmarkModelDir(c.getResourceDir());
       c = e.w;
       obj.setYlabMattingModelDir(c.getResourceDir());
       obj.setYlabNailSegModelDir(e.q.getResourceDir());
       obj.setYlabPlaneModelDir(e.x.getResourceDir());
       obj.setYlabPoseModelDir(e.v.getResourceDir());
       obj.setYlabSceneModelDir(Category.MAGIC_YCNN_SCENE.getResourceDir());
       obj.setYlabSkinSegModelDir(e.p.getResourceDir());
       obj.setYlabSkyModelDir(e.y.getResourceDir());
       obj.setYlabBeautifyAssetsResourceDir(e.B.getResourceDir());
       obj.setYlabBeautifyStrategyDir(e.D.getResourceDir());
       obj.setYlabBeautifyAibrightDir(e.E.getResourceDir());
       obj.setYlabBeautifyBacklightDir(e.F.getResourceDir());
       obj.setYlabBeautifyAideflawDir(e.G.getResourceDir());
       obj.setMmuAnimojiModelDir(e.b.getResourceDir());
       obj.setMmuBasewhiteModelDir(e.e.getResourceDir());
       obj.setMmuEarModelDir(e.f.getResourceDir());
       obj.setMmuFacepropModelDir(e.h.getResourceDir());
       obj.setMmuMemojiModelDir(e.k.getResourceDir());
       obj.setAieditMattingModelDir(c.getResourceDir());
       Log.g("EditorSdkUtil", "getSdkPathConfig: config="+obj);
       return obj;
    }
    public static synchronized void u(){
       _monitor_enter(a.class);
       if (PatchProxy.applyVoid(null, null, a.class, "6")) {
          _monitor_exit(a.class);
          return;
       }else {
          a.v();
          _monitor_exit(a.class);
          return;
       }
    }
    public static synchronized boolean v(){
       boolean b1;
       _monitor_enter(a.class);
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, a.class, "7");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(a.class);
          return obj.booleanValue();
       }else if(a.a){
          _monitor_exit(a.class);
          return true;
       }else {
          boolean b = false;
          try{
             EditorSdkLogger.setDebugLogger(new a$a());
             Log.g("sdkCost", "init start");
             EditorSdk2Utils.initJni(a.a().a(), a.a, objArray);
             EditorSdk2Utils.updateResourcePathConfig(a.t());
             Log.g("sdkCost", "step 1 cost: "+k1.t(k1.i()));
             EditorSdk2Utils.setDeliveryParamsConfig(ClipKitConfigManager.getInstance().getMVConfig());
             long l = k1.i();
             EditorSdkDecodeConfig uEditorSdkDe = a.a(EditorSdkDecodeConfig.class);
             if (uEditorSdkDe == null) {
                uEditorSdkDe = new EditorSdkDecodeConfig();
                Pair pair = a.a(a.a().a());
                uEditorSdkDe.mTvdType = pair.first;
                uEditorSdkDe.mCvdType = pair.second;
             }
             EditorSdk2$AndroidDecoderConfig uAndroidDeco = new EditorSdk2$AndroidDecoderConfig();
             uAndroidDeco.setTvdType(TextUtils.i(uEditorSdkDe.mTvdType, "sw"));
             uAndroidDeco.setCvdType(TextUtils.i(uEditorSdkDe.mCvdType, "sw"));
             uAndroidDeco.setCvdCacheOn(TextUtils.i(uEditorSdkDe.mCvdCacheOn, "false"));
             uAndroidDeco.setHevcDecoderName(TextUtils.i(uEditorSdkDe.mHevcDecoderName, "default"));
             boolean b2 = ClipDPHardwareConfigManager.getInstance().isUseDecodeConfigs();
             Log.g("hwcfg_EditorSdkUtil", "ClipDPHardwareConfigManager isUseDecodeConfigs "+b2);
             if (b2) {
                uAndroidDeco = ClipDPHardwareConfigManager.getInstance().getAndroidDecodeConfig();
             }
             String str = (a.t().d("kw265UsePthread", b))? "1": "0";
             uAndroidDeco.setKw265UsePthread(str);
             EditorSdk2Utils.setAndroidDecoderConfig(uAndroidDeco);
             Log.g("sdkCost", "step 2 cost: "+k1.t(l));
             l = k1.i();
             str = a.t().c("renderSdkRGInGif", "default");
             if (g.r() || TextUtils.n(str, "off")) {
                EditorSdk2Utils.setGlobalExportRenderGraphBackend(true);
                EditorSdk2Utils.setGlobalPreviewRenderGraphBackend(true);
                EditorSdk2Utils.setGlobalThumbnailRenderGraphBackend(true);
             }
             b2 = f.a("editorAe2CgeBackend");
             EditorSdk2Utils.setGlobalEnableAE2CgeBackend(b2);
             Object[] objArray1 = new Object[b];
             a.C().w("EditorSdkUtil", "EnableAE2CgeBackend"+b2, objArray1);
             b2 = (g.K() || a.t().d("editor_mediaserved_memory_reduce", b))? true: false;
             EditorSdk2Utils.setGlobalEnableMediaservedMemoryReduce(b2);
             b2 = (g.v() || a.t().d("editor_open_decoder_reuse", b))? true: false;
             EditorSdk2Utils.setGlobalEditorOpenDecoderReuse(b2);
             EditorSdk2Utils.setGlobalMultiTvdBufferCapacity(a.t().a("editor_multi_tvd_buffer_capacity", 10));
             EditorSdk2Utils.setExportCapeBitrateLimit(a.t().c("editorExportCapeBitrateLimit", "{}"));
             EditorSdk2Utils.setEnableFFmpegDecodeHDRVideo(a.t().d("editorFFmpegSupportDecodeHDR", b));
             if (ClipKitConfigManager.getInstance().getConfig() != null && ClipKitConfigManager.getInstance().getConfig().getEditorEncodeConfig() != null) {
                EditorSdk2Utils.setExportVersion(a.o());
                EditorSdk2Utils.setEnableSkipVideoTranscode(a.l());
             }
             Log.g("sdkCost", "step 3 cost: "+k1.t(l));
             l = k1.i();
             str = g.d0();
             if (str != null && str.length() > 0) {
                String[] stringArray = str.split(",");
                uAndroidDeco.setTvdType(stringArray[b]);
                uAndroidDeco.setCvdType(stringArray[1]);
                uAndroidDeco.setCvdCacheOn(stringArray[2]);
                if (stringArray.length >= 4) {
                   uAndroidDeco.setHevcDecoderName(TextUtils.i(stringArray[3], "default"));
                }else {
                   uAndroidDeco.setHevcDecoderName("default");
                }
                EditorSdk2Utils.setAndroidDecoderConfig(uAndroidDeco);
             }
             Log.g("sdkCost", "step 4 cost: "+k1.t(l));
             l = k1.i();
             a.a = true;
             Log.g("AdvEditUtil", "init success");
             if (b.c() != null && b.c().getImportEncodeConfig() != null) {
                EditorSdk2Utils.setGlobalMaxFrameRate((double)b.c().getImportEncodeConfig().mMaxFrameRate);
             }
             b2 = a.h();
             HDRDecoderInfo hDRDecoderIn = ClipDPHardwareConfigManager.getInstance().getHDRDecoderInfo();
             boolean b3 = (hDRDecoderIn != null && (hDRDecoderIn.maxLongEdge > null && (hDRDecoderIn.colorAccurate == null && hDRDecoderIn.isColorAccurateAffectedByOsVersion == null)))? true: false;
             Log.g("EditorSdkUtil", "dp hdr: enable = "+b2+", support && inaccurate = "+b3);
             b2 = (b2 && b3)? true: false;
             EditorSdk2Utils.setGlobalEnableAndroidHDRPreview(b2);
             EditorSdk2Utils.setGlobalEnableAndroidHEVCExport(a.i());
             EditorSdk2Utils.setEnableMediaCodecAdaptPixelFlexible(a.k());
             EditorSdk2Utils.setEnableMcbbSizeChange(a.j());
             EditorSdk2Utils.setGlobalMediaCodecBFrameFixType((int)a.e());
             b2 = (g.s() || a.f())? true: false;
             EditorSdk2Utils.setEnableColorSystem(b2);
             EditorSdk2Utils.setGlobalDisableMipmap(a.d());
             if (g.u() != -1) {
                EditorSdk2Utils.setEditorMediaCodecEcodeColorSystem(g.u());
             }else {
                EditorSdk2Utils.setEditorMediaCodecEcodeColorSystem(a.A());
             }
             EditorSdk2Utils.setMaxFallbackTimesForPtsCheck((int)a.z());
             EditorSdk2Utils.setGlobalEncodePreAnalyzeStr(a.m());
             EditorSdk2Utils.setMaxFFmpegDecodeThreadCount(a.t().a("sdkEGLThreadMaxNum", b));
             EditorSdk2Utils.setGlobalEnableFFmpegDecodeInvalidData(a.g());
             b2 = (!a.t().d("disableIllegalInfoDetect", b))? true: false;
             EditorSdk2Utils.setEnableYtechPoliticDetect(b2);
             b2 = (g.t() || a.t().d("editor_export_onstuck", b))? true: false;
             EditorSdk2Utils.setEnableFixKuaiyingStuck(b2);
             EditorSdk2Utils.setEnableMediaCodecStartAsync(b2);
             EditorSdk2Utils.setStuckDetectThresHold(a.t().a("editor_stuck_detect_threshold", 12));
             Log.g("sdkCost", "step 5 cost: "+k1.t(l));
          }catch(java.lang.Exception e2){
             Log.g("sdkCost", "initializeSDKIfNeeded init failed : "+e2);
             if (SystemUtil.J()) {
                Log.g("EditorSdkUtil", "report exception to keep");
                ExceptionHandler.handleCaughtException(new RuntimeException("init sdk exception", e2));
             }
             b1 = false;
          }
          _monitor_exit(a.class);
          return b1;
       }
    }
    public static boolean w(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uoa, "21");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (Build$VERSION.SDK_INT < 24) {
          Object[] objArray = new Object[0];
          a.C().w("EditorSdkUtil", "isHwEncodeSupported os version lower N", objArray);
          return 0;
       }else {
          boolean b = ClipDPHardwareConfigManager.getInstance().isUseEncodeConfigs();
          Object[] objArray1 = new Object[0];
          a.C().w("hwcfg_EditorSdkUtil", "isHwEncodeSupported width "+p0+" height "+p1+", isUseDPEncodeConfigs "+b, objArray1);
          if (b) {
             boolean b1 = ClipDPHardwareConfigManager.getInstance().isSupportEncode(a.a().a(), "avc", Math.max(p0, p1), 0, true, BenchmarkEncodeProfile.MAIN, 2);
             Object[] objArray2 = new Object[0];
             a.C().w("hwcfg_EditorSdkUtil", "isHwEncodeSupported ClipDPHardwareConfigManager return "+b1, objArray2);
             return b1;
          }else {
             return 0;
          }
       }
    }
    public static boolean x(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (l.c("key_enable_image_clipkit_param", b) || a.t().d("androidImageEditStrategy", b)) {
          b = true;
       }
       return b;
    }
    public static boolean y(){
       return a.a;
    }
    public static long z(){
       Object obj = PatchProxy.apply(null, null, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (long)a.t().a("max_fallback_times_for_pts_check", 0);
    }
}
