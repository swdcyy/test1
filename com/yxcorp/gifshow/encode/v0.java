package com.yxcorp.gifshow.encode.v0;
import java.lang.Object;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.encode.v0$a;
import java.lang.Enum;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import gq.a;
import q87.c;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import java.lang.StringBuilder;
import com.kuaishou.edit.draft.Workspace;
import com.kwai.video.editorsdk2.ExportTask;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkExportTaskStatEvent;
import com.kwai.video.editorsdk2.ExportTaskStatsInfo;
import java.lang.Throwable;
import java.util.HashMap;
import java.util.Map;
import com.yxcorp.utility.SystemUtil;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import com.yxcorp.utility.n;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.utility.TextUtils;
import xf6.g;
import kzc.d;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import java.lang.CharSequence;
import u07.t$a;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.encode.t0;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c;
import k2b.u1;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.video.clipkit.log.ClipEditExportLog;
import com.kwai.feature.post.api.feature.encode.model.VideoEncodeSDKInfo;
import com.kwai.video.clipkit.log.ClipEditExtraInfo;
import android.os.SystemClock;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import com.yxcorp.gifshow.encode.u0;
import java.util.List;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.util.Iterator;
import c26.c;
import com.kuaishou.edit.draft.Kuaishan;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import lnc.g7;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult$TemplateType;
import com.kwai.video.clipkit.mv.KwaiMvParam;
import com.kwai.FaceMagic.AE2.AE2Project;
import com.kwai.video.clipkit.mv.ClipMvUtils;
import com.kuaishou.edit.draft.AICutTheme;
import h69.j;
import pca.v1;
import java.lang.Runnable;
import t45.c;

public class v0	// class@000d53
{

    public void v0(){
       super();
    }
    public static int a(Workspace$Type p0,Workspace$Source p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, v0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       switch (v0$a.a[p0.ordinal()]){
           case 1:
             if (p1 != Workspace$Source.CAPTURE && (p1 != Workspace$Source.FOLLOW_SHOOT && (p1 == Workspace$Source.SAME_FRAME || p1 == Workspace$Source.JUXING))) {
                return 4;
             }
             if (p1 == Workspace$Source.IMPORT_CLIP || p1 == Workspace$Source.IMPORT_MIXED) {
                return 1;
             }
             if (p1 == Workspace$Source.SHARE) {
                return 22;
             }
             if (p1 == Workspace$Source.IMPORT) {
                return 23;
             }
             if (p1 == Workspace$Source.VIDEO_RECREATION || p1 == Workspace$Source.MERCHANT_COMMENT_RECREATION) {
                return 20;
             }
             if (p1 == Workspace$Source.MUSIC_RECREATION) {
                return 24;
             }
             if (p1 == Workspace$Source.PICTURE_RECREATION) {
                return 21;
             }
             return 19;
             break;
           case 2:
             return 16;
           case 3:
             return 3;
           case 4:
             return 14;
           case 5:
             return 15;
           case 6:
             return 5;
           case 7:
             return 17;
           case 8:
             if (p1 == Workspace$Source.ANNUAL_ALBUM_2022 || p1 == Workspace$Source.ANNUAL_ALBUM_2022_LOCAL) {
                return 28;
             }
             return 11;
             break;
           default:
             return 0;
       }
    }
    public static int b(PostEncodeInfo p0){
       Object[] obj2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       v0 ov0 = v0.class;
       Object[] obj = null;
       PostEncodeInfo obj1 = PatchProxy.applyOneRefs(p0, obj, ov0, "3");
       if (obj1 != patchProxyRe) {
          return obj1.intValue();
       }
       obj1 = p0.mWorkspace;
       int i = 0;
       if (obj1 == null) {
          Object[] objArray = new Object[i];
          a.D().w("ExportLoggerUtil", "getVideoType workspace is null", objArray);
          obj2 = PatchProxy.applyOneRefs(p0, obj, ov0, "5");
          if (obj2 != patchProxyRe) {
             i = obj2.intValue();
          }else if(p0.isStoryMood()){
             boolean b = p0.isSinglePicture();
             obj = new Object[i];
             a.D().w("ExportLoggerUtil", "getNoWorkSpaceVideoType: StoryMood, isSinglePicture: "+b, obj);
             i = (b)? 25: 26;
          }else if(p0.getVideoType() > 0){
             i = p0.getVideoType();
          }
          return i;
       }else {
          obj2 = new Object[i];
          a.D().w("ExportLoggerUtil", "getVideoType workspace type="+obj1.getType()+" source="+obj1.getSource(), obj2);
          if (obj1.getType() == Workspace$Type.KTV_SONG && obj1.getAssetsCount() == 1) {
             return 18;
          }
          return obj1.getSource().a(obj1.getType(), obj1.getSource());
       }
    }
    public static void c(ExportTask p0,String p1,Workspace p2){
       int i;
       ExportTaskStatsInfo exportTaskSt;
       Map map;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, v0.class, "1")) {
          return;
       }
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       if (p0 != null) {
          ClientStat$EditorSdkExportTaskStatEvent uEditorSdkEx = new ClientStat$EditorSdkExportTaskStatEvent();
          try{
             i = 0;
             exportTaskSt = p0.getExportTaskStats();
          }catch(java.lang.Exception e9){
             a.D().z("ExportLoggerUtil", "log error getExportTaskStats", e9);
             exportTaskSt = i;
          }
          if (exportTaskSt == null) {
             return;
          }else {
             HashMap hashMap = new HashMap();
             String str = "unknown";
             String str1 = (p2 != null && p2.getType() != null)? p2.getType().toString(): str;
             hashMap.put("workspace", str1);
             if (p2 != null && p2.getSource() != null) {
                str = p2.getSource().toString();
             }
             hashMap.put("workspaceSource", str);
             try{
                exportTaskSt.insertExtraKeyValueIntoExportStats(hashMap);
                map = exportTaskSt.serializeToMap();
             }catch(java.lang.Exception e9){
                a.D().z("ExportLoggerUtil", "log error serializeToMap", e9);
             }
             if (map == null) {
                return;
             }else {
                String str2 = SystemUtil.g();
                try{
                   EditorSdk2Utils.insertBoardPlatformIntoExportStatsMap(map, str2);
                   Point point = n.s(a.a().a());
                   EditorSdk2Utils.insertScreenSizeIntoExportStatsMap(map, point.x, point.y);
                   EditorSdk2Utils.insertTotalMemorySizeIntoExportStatsMap(map, (int)(SystemUtil.t() / 1024));
                   str2 = a.a.q(map);
                   uEditorSdkEx.statsSessionId = TextUtils.k(p1);
                   uEditorSdkEx.editorMeta = str2;
                   statPackage.editorSdkExportTaskStatEvent = uEditorSdkEx;
                   if (a.a().c() && g.i0()) {
                      d uod = new d(ActivityContext.g().e());
                      uod.z0(str2);
                      uod.Q0(R.string.arg_RES_7f1041f7);
                      uod.z(false);
                      uod.L(t0.b);
                      uod.X();
                   }
                }catch(java.lang.Exception e9){
                   a.D().z("ExportLoggerUtil", (SystemUtil.t() / 1024), e9);
                   return;
                }
             }
          }
       }
       u1.j0(statPackage);
       return;
    }
    public static void d(ExportTask p0,PostEncodeInfo p1,int p2,Boolean p3){
       int i;
       ExportTaskStatsInfo uExportTaskS;
       String str3;
       Map map;
       int i2;
       EncodeInfo uEncodeInfo = p1;
       if (PatchProxy.isSupport(v0.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, null, v0.class, "2")) {
          return;
       }
       EncodeInfo mTranscodeRe = uEncodeInfo.mTranscodeReason;
       boolean b = true;
       if (mTranscodeRe == 0x2710) {
          i = -1;
       }else if(mTranscodeRe >= 1000 && EditorSdk2Utils.getEnableSkipVideoTranscode() > 0){
          i = 0;
       }else {
          i = 1;
       }
       PostEncodeInfo mWorkspace = uEncodeInfo.mWorkspace;
       EncodeInfo mSessionId = uEncodeInfo.mSessionId;
       PostEncodeInfo mResult = uEncodeInfo.mResult;
       ClipEditExportLog uClipEditExp = new ClipEditExportLog();
       uClipEditExp.context = a.a().a();
       uClipEditExp.skipTranscode = i;
       uClipEditExp.transcodeReason = uEncodeInfo.mTranscodeReason;
       PostEncodeInfo mVideoEncode = uEncodeInfo.mVideoEncodeSDKInfo;
       if (mVideoEncode != null) {
          uClipEditExp.project = mVideoEncode.mProject;
       }
       ClipEditExtraInfo uClipEditExt = new ClipEditExtraInfo();
       uClipEditExp.extraInfo = uClipEditExt;
       uClipEditExt.appMap = new HashMap();
       uClipEditExt = uClipEditExp.extraInfo.appMap;
       uClipEditExt.put("isOldLog", String.valueOf(p3));
       String str = "workspaceSource";
       if (mWorkspace != null) {
          uClipEditExp.extraInfo.appMap.put(str, String.valueOf(mWorkspace.getSourceValue()));
          uClipEditExt = uClipEditExp.extraInfo.appMap;
          uClipEditExt.put("workspaceType", String.valueOf(mWorkspace.getTypeValue()));
       }
       int i1 = p2;
       uClipEditExp.encodeStartTime = (i1 == b)? SystemClock.elapsedRealtime(): SystemClock.elapsedRealtime();
       String str1 = null;
       if (p0 != null) {
          EditorSdk2$EditorSdkError error = p0.getError();
          try{
             uClipEditExp.editorError = error;
             uExportTaskS = p0.getExportTaskStats();
          }catch(java.lang.Exception e0){
             a.D().z("ExportLoggerUtil", "report error getExportTaskStats", e0);
             uExportTaskS = str1;
          }
          if (uExportTaskS == null) {
             return;
          }else {
             HashMap hashMap = new HashMap();
             String str2 = "unknown";
             str3 = (mWorkspace != null && mWorkspace.getType() != null)? mWorkspace.getType().toString(): str2;
             hashMap.put("workspace", str3);
             if (mWorkspace != null && mWorkspace.getSource() != null) {
                str2 = mWorkspace.getSource().toString();
             }
             hashMap.put(str, str2);
             try{
                uExportTaskS.insertExtraKeyValueIntoExportStats(hashMap);
                map = uExportTaskS.serializeToMap();
             }catch(java.lang.Exception e0){
                a.D().z("ExportLoggerUtil", "report error serializeToMap", e0);
                map = str1;
             }
             if (map == null) {
                return;
             }else if(uExportTaskS.getTemplateScore() - null > 0){
                uClipEditExp.extraInfo.templateScore = uExportTaskS.getTemplateScore();
                uClipEditExp.extraInfo.templateScoreVersion = uExportTaskS.getTemplateScoreVersion();
                Object[] objArray = new Object[0];
                a.D().w("ExportLoggerUtil", "get templateScore from stats:"+uClipEditExp.extraInfo.templateScore, objArray);
             }
             EditorSdk2Utils.insertBoardPlatformIntoExportStatsMap(map, SystemUtil.g());
             str = p1.getDeliveryParamsInfo();
             str2 = "export_task_stat";
             if (!TextUtils.x(str) && map.containsKey(str2)) {
                map.get(str2).put("delivery_params_info", a.a.h(str, Map.class));
             }
             try{
                Point point = n.s(a.a().a());
                EditorSdk2Utils.insertScreenSizeIntoExportStatsMap(map, point.x, point.y);
                EditorSdk2Utils.insertTotalMemorySizeIntoExportStatsMap(map, (int)(SystemUtil.t() / 1024));
                ClipEditExportLog editorError = uClipEditExp.editorError;
                i2 = (editorError != null && editorError.code())? 8: i1;
                String str4 = a.a.q(map);
                if (a.a().c() && g.i0()) {
                   d uod = new d(ActivityContext.g().e());
                   uod.z0(str4);
                   uod.Q0(R.string.arg_RES_7f1041f7);
                   uod.z(0);
                   uod.L(u0.b);
                   uod.X();
                }
                Iterator iterator = EditorSdk2UtilsV2.getYKitStats().iterator();
                while (iterator.hasNext()) {
                   u1.R("YTECH_STAT_INFO", iterator.next(), 26);
                }
                if (map.containsKey(str2)) {
                   Map map1 = map.get(str2);
                   Integer integer = map1.get("transcode_result");
                   Integer integer1 = map1.get("transcode_reason");
                   if (integer != null && integer1 != null) {
                      uClipEditExp.skipTranscode = integer.intValue() - 1;
                      uClipEditExp.transcodeReason = integer1.intValue();
                   }
                }
                uClipEditExp.setEncodeQos(map);
             }catch(java.lang.Exception e0){
                a.D().z("ExportLoggerUtil", "log error getExportTaskStats", e0);
                return;
             }
          }
       }else {
          i2 = i1;
       }
       uClipEditExp.videoType = map.b(p1);
       Object[] objArray1 = new Object[0];
       a.D().w("ExportLoggerUtil", "getVideoType ="+uClipEditExp.videoType, objArray1);
       if (mWorkspace != null && mResult != null) {
          str3 = mResult.getTemplateId();
          KSTemplateDetailInfo kSTemplateDe = g7.g(mWorkspace.getKuaishan().getExtraInfo());
          i1 = p1.getTemplateGrade();
          if (kSTemplateDe != null) {
             i1 = kSTemplateDe.getTemplateGrade();
             str1 = kSTemplateDe.getTemplateName();
             kSTemplateDe = kSTemplateDe.mTemplateBiz;
          }else {
             str1 = "";
             String str6 = str1;
          }
          if (mWorkspace.getType() == Workspace$Type.AI_CUT || (mWorkspace.getType() == Workspace$Type.ALBUM_MOVIE && mWorkspace.getSource() == Workspace$Source.AI_CUT_STYLE)) {
             if (!TextUtils.x(str3) && !TextUtils.n(str3, "-1")) {
                String str5 = (mWorkspace.getAiCutThemesList() != null && !mWorkspace.getAiCutThemesList().isEmpty())? mWorkspace.getAiCutThemesList().get(0).getName(): str1;
                int i3 = (j.i(mWorkspace))? 4: 3;
                g7.n(uClipEditExp.extraInfo, str3, i3, p1.getEncodedWidth(), p1.getEncodedHeight(), false, false, i1, str5, kSTemplateDe);
             }
          }else if(mWorkspace.getType() == Workspace$Type.KUAISHAN || (mWorkspace.getType() == Workspace$Type.PHOTO_MOVIE && mResult.g() != null)){
             ClipEditExportLog extraInfo = uClipEditExp.extraInfo;
             extraInfo.templateId = str3;
             extraInfo.templateGrade = i1;
             extraInfo.templateName = str1;
             extraInfo.templateBusiness = kSTemplateDe;
             if (mResult.g().getTemplateType() == EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_MV) {
                b = 2;
             }
             extraInfo.templateType = b;
             uClipEditExp.extraInfo.templateWidth = mResult.g().getVideoWidth();
             uClipEditExp.extraInfo.templateHeight = mResult.g().getVideoHeight();
             uClipEditExp.extraInfo.hasOnlineEffect = mResult.e();
             uClipEditExp.extraInfo.hasFacemagicEffect = mResult.f();
             ClipEditExportLog extraInfo1 = uClipEditExp.extraInfo;
             if (extraInfo1.templateType == 2) {
                extraInfo1.templateScore = ClipMvUtils.getTemplateScore(ClipMvUtils.getAE2ProjectFromMVParam(mResult.g().getMVParam()));
                uClipEditExp.extraInfo.templateScoreVersion = ClipMvUtils.getTemplateScoreVersion(ClipMvUtils.getAE2ProjectFromMVParam(mResult.g().getMVParam()));
                Object[] objArray2 = new Object[0];
                a.D().w("ExportLoggerUtil", "get templateScore from clipkit:"+uClipEditExp.extraInfo.templateScore, objArray2);
             }
          }
       }
    label_0392 :
       c.a(new v1(i2, mSessionId, uClipEditExp));
       return;
    }
}
