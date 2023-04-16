package com.kwai.video.clipkit.log.ClipEditLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.Object;
import com.kwai.video.clipkit.log.ClipEditExtraInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import org.json.JSONObject;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import org.json.JSONArray;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.nano.Minecraft$KSAVClip;
import java.lang.Math;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.KSClipLog;
import org.json.JSONException;
import jr4.c$a;
import com.kwai.robust.PatchProxyResult;
import c97.d;
import r97.a0;
import r97.h0;
import r97.j0;
import kr4.a$f;
import java.lang.Number;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.Double;
import com.kwai.video.clipkit.ClipKitUtils;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$VideoColorProperties;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;
import com.kwai.video.clipkit.log.ClipEditExportLog;
import com.kwai.video.clipkit.log.ClipEditImageExportLog;
import com.kwai.video.clipkit.log.ClipEditImageImportLog;
import com.kwai.video.clipkit.log.ClipEditImagePublishLog;
import com.kwai.video.clipkit.log.ClipEditImportLog;
import com.kwai.video.clipkit.post.ClipEditPostBaseLog;
import com.kwai.video.clipkit.log.ClipVideoQualityEvaluateLog;
import ev7.a;
import java.lang.Runnable;
import ev7.c;
import ev7.d;
import com.kwai.video.clipkit.log.ClipEditImagePreviewLog;
import ev7.e;
import ev7.f;
import ev7.h;
import com.kwai.video.clipkit.log.ClipEditPreviewLog;
import com.kwai.video.editorsdk2.PreviewPlayerQosInfo;
import android.content.Context;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import java.lang.Boolean;
import java.lang.Throwable;
import java.lang.IllegalArgumentException;
import ev7.i;
import ev7.g;
import r97.q$a;
import r97.q;
import com.google.protobuf.nano.MessageNano;
import r97.o$a;
import r97.o;
import ev7.b;

public class ClipEditLogger	// class@001a90
{
    public static ExecutorService sExecutorService;
    public static boolean sOpenExportLog;

    static {
       ClipEditLogger.sExecutorService = Executors.newSingleThreadExecutor();
       ClipEditLogger.sOpenExportLog = true;
    }
    public void ClipEditLogger(){
       super();
    }
    public static void addDataToExtraInfoIfNeed(int p0,ClipEditExtraInfo p1){
       ClipEditLogger uClipEditLog = ClipEditLogger.class;
       if (PatchProxy.isSupport(uClipEditLog) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uClipEditLog, "20")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       if (p0 == 1) {
          p1.appMap.put("postBusiness", "kuaiyingUpload");
       }
       return;
    }
    public static void addProjectJsonObject(JSONObject p0,EditorSdk2V2$VideoEditorProject p1){
       int i1;
       int i2;
       int i3;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ClipEditLogger.class, "18")) {
          return;
       }
       try{
          if (p1 == null || (p1.trackAssets() != null && p1.trackAssetsSize())) {
             p0.put("isPhotoMovieProject", p1.isKwaiPhotoMovie());
             JSONArray jSONArray = new JSONArray();
             p0.put("assetInfo", jSONArray);
             ArrayList arrayList = p1.trackAssets().getArrayList();
             int i = Integer.MAX_VALUE;
             if (arrayList != null && !arrayList.isEmpty()) {
                Iterator iterator = arrayList.iterator();
                i1 = Integer.MAX_VALUE;
                i2 = 0;
                i3 = 0;
                while (iterator.hasNext()) {
                   EditorSdk2V2$TrackAsset trackAsset = iterator.next();
                   if (trackAsset != null) {
                      JSONObject jSONObject = new JSONObject();
                      ClipEditLogger.getAssetInfoFromTrackAsset(trackAsset.getMainClip(), jSONObject);
                      jSONArray.put(jSONObject);
                      int i4 = jSONObject.optInt("width", -1);
                      int i5 = jSONObject.optInt("height", -1);
                      i2 = Math.max(i2, i4);
                      i3 = Math.max(i3, i5);
                      i = Math.min(i, i4);
                      i1 = Math.min(i1, i5);
                   }
                }
             }else {
                i1 = Integer.MAX_VALUE;
                i2 = 0;
                i3 = 0;
             }
             p0.put("assetsMaxWidth", i2);
             p0.put("assetsMaxHeight", i3);
             p0.put("assetsMinWidth", i);
             p0.put("assetsMinHeight", i1);
          }
       }catch(org.json.JSONException e9){
          KSClipLog.e("ClipEditLogger", "addProjectJsonObject put JSON error "+e9);
          e9.printStackTrace();
       }
       return;
    }
    public static void addProjectsJsonObject(JSONObject p0,ArrayList p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ClipEditLogger.class, "17")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       try{
          JSONArray jSONArray = new JSONArray();
          p0.put("assetInfo", jSONArray);
          Iterator iterator = p1.iterator();
          int i = Integer.MAX_VALUE;
          int i1 = Integer.MAX_VALUE;
          int i2 = 0;
          int i3 = 0;
          while (iterator.hasNext()) {
             EditorSdk2V2$VideoEditorProject videoEditorP = iterator.next();
             if (videoEditorP != null && (videoEditorP.trackAssets() == null || !videoEditorP.trackAssetsSize())) {
                return;
             }
             ArrayList arrayList = videoEditorP.trackAssets().getArrayList();
             if (arrayList != null && !arrayList.isEmpty()) {
                Iterator iterator1 = arrayList.iterator();
                while (iterator1.hasNext()) {
                   EditorSdk2V2$TrackAsset trackAsset = iterator1.next();
                   if (trackAsset != null) {
                      JSONObject jSONObject = new JSONObject();
                      ClipEditLogger.getAssetInfoFromTrackAsset(trackAsset.getMainClip(), jSONObject);
                      jSONArray.put(jSONObject);
                      int i4 = jSONObject.optInt("width", -1);
                      int i5 = jSONObject.optInt("height", -1);
                      i2 = Math.max(i2, i4);
                      i3 = Math.max(i3, i5);
                      i = Math.min(i, i4);
                      i1 = Math.min(i1, i5);
                   }
                }
             }
             p0.put("assetsMaxWidth", i2);
             p0.put("assetsMaxHeight", i3);
             p0.put("assetsMinWidth", i);
             p0.put("assetsMinHeight", i1);
          }
       }catch(org.json.JSONException e10){
          KSClipLog.e("ClipEditLogger", "addProjectJsonObject put JSON error "+e10);
          e10.printStackTrace();
       }
       return;
    }
    public static c$a buildVpStatEvent(){
       Object[] objArray = null;
       c$a obj = PatchProxy.apply(objArray, objArray, ClipEditLogger.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c$a();
       j0 oj0 = d.a().g().j(objArray);
       a$f uof = new a$f();
       obj.a = uof;
       if (oj0 != null) {
          uof.c = oj0.a();
          obj.a.a = oj0.b();
          obj.a.d = ClipEditLogger.convertPageType(oj0.c());
          obj.a.b = oj0.d();
       }
       j0 oj01 = d.a().g().K(objArray);
       a$f uof1 = new a$f();
       obj.c = uof1;
       if (oj01 != null) {
          uof1.c = oj01.a();
          obj.c.a = oj01.b();
          obj.c.b = oj01.d();
       }
       return obj;
    }
    public static int convertPageType(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipEditLogger.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = -1;
       int i = p0.hashCode();
       if (i != -1999289321) {
          if (i != -1057247979) {
             if (i != 2285) {
                if (i == 0x241c4f && p0.equals("MINA")) {
                   obj = 2;
                }
             }else if(p0.equals("H5")){
                obj = 1;
             }
          }else if(p0.equals("UNKNOWN_PAGE_TYPE")){
             obj = 3;
          }
       }else if(p0.equals("NATIVE")){
          obj = 0;
       }
       if (obj) {
          if (obj != 1) {
             if (obj != 2) {
                return 0;
             }else {
                return 3;
             }
          }else {
             return 2;
          }
       }else {
          return 1;
       }
    }
    public static void getAssetInfoFromTrackAsset(Minecraft$KSAVClip p0,JSONObject p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ClipEditLogger.class, "19")) {
          return;
       }
       try{
          p1.put("width", EditorSdk2UtilsV2.getReplaceableAVClipWidth(p0));
          p1.put("height", EditorSdk2UtilsV2.getReplaceableAVClipHeight(p0));
          int i = 1;
          Object[] objArray = new Object[i];
          int i1 = 0;
          objArray[i1] = Double.valueOf(EditorSdk2UtilsV2.getAVClipFps(p0));
          p1.put("fps", String.format("%.1f", objArray));
          p1.put("codecName", ClipKitUtils.getAVClipCodecName(p0));
          String str = "hdrFlag";
          if (ClipKitUtils.avClipIsHDRVideo(p0)) {
             i1 = 1;
          }
          p1.put(str, i1);
          EditorSdk2$VideoColorProperties aVClipColorP = ClipKitUtils.getAVClipColorProperties(p0);
          if (aVClipColorP != null) {
             p1.put("colorSpace", aVClipColorP.colorSpace());
             p1.put("colorPrimaries", aVClipColorP.colorPrimaries());
             p1.put("colorTransfer", aVClipColorP.colorTrc());
             p1.put("colorRange", aVClipColorP.colorRange());
          }
          if (!TextUtils.isEmpty(EditorSdk2UtilsV2.getPathOfAVClip(p0))) {
             File uFile = new File(EditorSdk2UtilsV2.getPathOfAVClip(p0));
             if (uFile.exists()) {
                p1.put("fileSize", uFile.length());
             }
          }
          if (!TextUtils.isEmpty(EditorSdk2UtilsV2.getPathOfAVClip(p0))) {
             str = ClipKitUtils.getExtensionLowerCaseName(EditorSdk2UtilsV2.getPathOfAVClip(p0));
             if (("gif").equals(str)) {
                i = 3;
             }else if(("webp").equals(str)){
                i = 4;
             }else if(EditorSdk2UtilsV2.isSingleImagePath(EditorSdk2UtilsV2.getPathOfAVClip(p0))){
                i = 2;
             }
          }
          p1.put("fileType", i);
          p1.put("duration", (long)(EditorSdk2UtilsV2.avClipProbedFileDuration(p0) * 0x408f400000000000));
       }catch(org.json.JSONException e6){
          KSClipLog.e("ClipEditLogger", "getAssetInfoFromTrackAsset put JSON error "+e6);
          e6.printStackTrace();
       }
       return;
    }
    public static void lambda$reportExportLog$2(ClipEditExportLog p0,String p1,int p2){
       KSClipLog.v("ClipEditLogger", p1+" : status:"+p2+",reportExportLog:"+p0.toJson());
       c$a uoa = ClipEditLogger.buildVpStatEvent();
       uoa.b = "VP_EDITEXPORT";
       uoa.d = p0.toJson();
       uoa.e = p2;
       uoa.f = p1;
       ClipEditLogger.reportVpStatEvent(uoa, true);
    }
    public static void lambda$reportImageExportLog$6(ClipEditImageExportLog p0,String p1){
       String str = p0.toJson();
       KSClipLog.v("ClipEditLogger", "reportImageExportLog:"+str);
       c$a uoa = ClipEditLogger.buildVpStatEvent();
       uoa.f = p1;
       uoa.b = "VP_EDIT_IMAGE_EXPORT";
       uoa.d = str;
       ClipEditLogger.reportVpStatEvent(uoa, true);
    }
    public static void lambda$reportImageImportLog$5(ClipEditImageImportLog p0,String p1){
       String str = p0.toJson();
       KSClipLog.v("ClipEditLogger", "reportImageImportLog:"+str);
       c$a uoa = ClipEditLogger.buildVpStatEvent();
       uoa.f = p1;
       uoa.b = "VP_EDIT_IMAGE_IMPORT";
       uoa.d = str;
       ClipEditLogger.reportVpStatEvent(uoa, true);
    }
    public static void lambda$reportImagePublishLog$7(ClipEditImagePublishLog p0,String p1){
       String str = p0.toJson();
       KSClipLog.v("ClipEditLogger", "reportImagePublishLog:"+str);
       c$a uoa = ClipEditLogger.buildVpStatEvent();
       uoa.f = p1;
       uoa.b = "VP_EDIT_IMAGE_PUBLISH";
       uoa.d = str;
       ClipEditLogger.reportVpStatEvent(uoa, true);
    }
    public static void lambda$reportImportLog$1(ClipEditImportLog p0,int p1){
       String str = p0.toJson();
       KSClipLog.v("ClipEditLogger", "status:"+p1+",reportImportLog:"+str);
       c$a uoa = ClipEditLogger.buildVpStatEvent();
       uoa.b = "VP_EDITIMPORT";
       uoa.d = str;
       uoa.e = p1;
       uoa.f = p0.sessionId;
       ClipEditLogger.reportVpStatEvent(uoa, true);
    }
    public static void lambda$reportPostLog$0(ClipEditPostBaseLog p0,int p1){
       String str = p0.toJson();
       KSClipLog.v("ClipEditLogger", "status:"+p1+",reportPostLog:"+str);
       c$a uoa = ClipEditLogger.buildVpStatEvent();
       uoa.b = "VP_EDITPOST";
       uoa.d = str;
       uoa.e = p1;
       uoa.f = p0.getSessionId();
       ClipEditLogger.reportVpStatEvent(uoa, true);
    }
    public static void lambda$reportThumbnailLog$3(String p0,int p1,String p2){
       c$a uoa = ClipEditLogger.buildVpStatEvent();
       uoa.b = "VP_EDIT_THUMBNAIL";
       uoa.d = p0;
       uoa.e = p1;
       uoa.f = p2;
       ClipEditLogger.reportVpStatEvent(uoa, false);
       KSClipLog.v("ClipEditLogger", p2+" : status:"+p1+",reportThumbnailLog:"+p0);
    }
    public static void lambda$reportVideoEvaluateTaskLog$8(ClipVideoQualityEvaluateLog p0,int p1,String p2){
       String str = (p0 != null)? p0.toJson(): "";
       c$a uoa = ClipEditLogger.buildVpStatEvent();
       uoa.b = "VP_VIDEO_QUALITY_EVALUATE";
       uoa.d = str;
       uoa.e = p1;
       uoa.f = p2;
       ClipEditLogger.reportVpStatEvent(uoa, true);
       return;
    }
    public static void lambda$reportWatermarkLog$4(ClipEditExportLog p0,String p1,int p2){
       String str = p0.toJson();
       KSClipLog.v("ClipEditLogger", p1+" : status:"+p2+",reportASubAssetLog:"+str);
       c$a uoa = ClipEditLogger.buildVpStatEvent();
       uoa.b = "VP_EXPORT_WATERMARK";
       uoa.d = str;
       uoa.f = p1;
       uoa.e = p2;
       ClipEditLogger.reportVpStatEvent(uoa, true);
    }
    public static void reportExportLog(int p0,String p1,ClipEditExportLog p2){
       if (PatchProxy.isSupport(ClipEditLogger.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, ClipEditLogger.class, "7")) {
          return;
       }
       if (!ClipEditLogger.sOpenExportLog) {
          return;
       }
       ClipEditLogger.sExecutorService.execute(new a(p2, p1, p0));
       return;
    }
    public static void reportImageExportLog(String p0,ClipEditImageExportLog p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ClipEditLogger.class, "12")) {
          return;
       }
       ClipEditLogger.sExecutorService.execute(new c(p1, p0));
       return;
    }
    public static void reportImageImportLog(String p0,ClipEditImageImportLog p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ClipEditLogger.class, "10")) {
          return;
       }
       ClipEditLogger.sExecutorService.execute(new d(p1, p0));
       return;
    }
    public static void reportImagePreviewLog(String p0,ClipEditImagePreviewLog p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ClipEditLogger.class, "11")) {
          return;
       }
       String str = p1.toJson();
       KSClipLog.v("ClipEditLogger", "reportImagePreviewLog:"+str);
       c$a uoa = ClipEditLogger.buildVpStatEvent();
       uoa.f = p0;
       uoa.b = "VP_EDIT_IMAGE_PREVIEW";
       uoa.d = str;
       ClipEditLogger.reportVpStatEvent(uoa, true);
       return;
    }
    public static void reportImagePublishLog(String p0,ClipEditImagePublishLog p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ClipEditLogger.class, "13")) {
          return;
       }
       ClipEditLogger.sExecutorService.execute(new e(p1, p0));
       return;
    }
    public static void reportImportLog(int p0,ClipEditImportLog p1){
       ClipEditLogger uClipEditLog = ClipEditLogger.class;
       if (PatchProxy.isSupport(uClipEditLog) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uClipEditLog, "2")) {
          return;
       }
       ClipEditLogger.sExecutorService.execute(new f(p1, p0));
       return;
    }
    public static void reportMcRealTimeLog(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ClipEditLogger.class, "5")) {
          return;
       }
       KSClipLog.v("ClipEditLogger", "mc realTimeLog:"+p1);
       c$a uoa = ClipEditLogger.buildVpStatEvent();
       uoa.b = "VP_MC_REALTIME_STAT";
       uoa.d = p1;
       uoa.f = p0;
       ClipEditLogger.reportVpStatEvent(uoa, false);
       return;
    }
    public static void reportMcSummaryLog(int p0,String p1,String p2){
       if (PatchProxy.isSupport(ClipEditLogger.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, ClipEditLogger.class, "6")) {
          return;
       }
       KSClipLog.v("ClipEditLogger", "mc realTimeLog:"+p2);
       c$a uoa = ClipEditLogger.buildVpStatEvent();
       uoa.b = "VP_MC_SUMMERY_STAT";
       uoa.d = p2;
       uoa.f = p1;
       uoa.e = p0;
       ClipEditLogger.reportVpStatEvent(uoa, true);
       return;
    }
    public static void reportPostLog(int p0,ClipEditPostBaseLog p1){
       ClipEditLogger uClipEditLog = ClipEditLogger.class;
       if (PatchProxy.isSupport(uClipEditLog) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uClipEditLog, "1")) {
          return;
       }
       ClipEditLogger.sExecutorService.execute(new h(p1, p0));
       return;
    }
    public static void reportPreviewLog(int p0,String p1,ClipEditPreviewLog p2){
       if (PatchProxy.isSupport(ClipEditLogger.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, ClipEditLogger.class, "3")) {
          return;
       }
       String str = p2.toJson();
       KSClipLog.v("ClipEditLogger", "status:"+p0+",previewLog:"+str);
       c$a uoa = ClipEditLogger.buildVpStatEvent();
       uoa.b = "VP_EDITPREVIEW";
       uoa.d = str;
       uoa.e = p0;
       uoa.f = p1;
       ClipEditLogger.reportVpStatEvent(uoa, true);
       return;
    }
    public static void reportRealTimeLog(String p0,PreviewPlayerQosInfo p1,ClipEditExtraInfo p2,Context p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, ClipEditLogger.class, "4")) {
          return;
       }
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("qos", p1.getJson());
          if (p2 != null) {
             jSONObject.put("extraInfo", p2.toJsonObject());
          label_002b :
             jSONObject.put("tag", "5.6.1.4");
             JSONObject jSONObject1 = new JSONObject();
             if (p3 != null) {
                Intent intent = UniversalReceiver.e(p3, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intent != null) {
                   jSONObject1.put("battery_level", ((intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1)));
                   boolean intExtra = intent.getIntExtra("status", -1);
                   intExtra = (intExtra == 2 || intExtra == 5)? true: false;
                   jSONObject1.put("is_charging", Boolean.valueOf(intExtra));
                }
             }
             jSONObject.put("status", jSONObject1);
             String str = jSONObject.toString();
             KSClipLog.v("ClipEditLogger", "realTimeLog:"+str);
             c$a uoa = ClipEditLogger.buildVpStatEvent();
             uoa.b = "VP_EDITPREVIEW_STAT";
             uoa.d = str;
             uoa.f = p0;
             ClipEditLogger.reportVpStatEvent(uoa, false);
          }else {
             goto label_002b ;
          }
       }catch(java.lang.IllegalArgumentException e8){
          KSClipLog.e("ClipEditLogger", "reportRealTimeLog error:"+e8.getMessage(), e8);
       }catch(org.json.JSONException e8){
          KSClipLog.e("ClipEditLogger", "reportRealTimeLog error", e8);
       }
       return;
    }
    public static void reportThumbnailLog(int p0,String p1,String p2){
       if (PatchProxy.isSupport(ClipEditLogger.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, ClipEditLogger.class, "8")) {
          return;
       }
       ClipEditLogger.sExecutorService.execute(new i(p2, p0, p1));
       return;
    }
    public static void reportVideoEvaluateTaskLog(int p0,String p1,ClipVideoQualityEvaluateLog p2){
       if (PatchProxy.isSupport(ClipEditLogger.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, ClipEditLogger.class, "21")) {
          return;
       }
       ClipEditLogger.sExecutorService.execute(new g(p2, p0, p1));
       return;
    }
    public static void reportVpStatEvent(c$a p0,boolean p1){
       ClipEditLogger uClipEditLog = ClipEditLogger.class;
       if (PatchProxy.isSupport(uClipEditLog) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uClipEditLog, "15")) {
          return;
       }
       if (p0.d == null) {
          p0.d = "";
       }
       q$a uoa = q.a();
       uoa.g("vp_stat_event");
       uoa.f(MessageNano.toByteArray(p0));
       uoa.c(o.builder().g(p1).i("KSClipKit").b());
       d.a().g().m(uoa.b());
       return;
    }
    public static void reportWatermarkLog(int p0,String p1,ClipEditExportLog p2){
       if (PatchProxy.isSupport(ClipEditLogger.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, ClipEditLogger.class, "9")) {
          return;
       }
       ClipEditLogger.sExecutorService.execute(new b(p2, p1, p0));
       return;
    }
    public static void setOpenExportLog(boolean p0){
       ClipEditLogger.sOpenExportLog = p0;
    }
}
