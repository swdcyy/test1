package com.yxcorp.gifshow.encode.u;
import java.lang.Runnable;
import com.yxcorp.gifshow.encode.EncodeManager;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import com.yxcorp.gifshow.encode.EncodeManager$d;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dq.a;
import q87.c;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import com.kwai.feature.post.api.feature.encode.model.VideoEncodeSDKInfo;
import com.kwai.video.editorsdk2.DeliveryParamsManager;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import java.lang.StringBuilder;
import com.kwai.video.editorsdk2.model.ModelBase;
import com.yxcorp.gifshow.encode.EncodeManager$EncodeInfoWidthHeightUsedException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import d26.b;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$EncodeParams;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$Rational;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import ekd.j;
import java.util.Iterator;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import java.lang.Number;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedStream;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.minecraft.model.nano.Minecraft$MagicTouchOverall;
import com.kwai.video.minecraft.model.nano.Minecraft$TimeEffectParam;
import com.kwai.video.minecraft.model.nano.Minecraft$VisualEffectParam;
import java.lang.Iterable;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.yxcorp.gifshow.encode.n;
import ok.o;
import qk.y;
import java.lang.RuntimeException;
import lnc.i1;
import com.kwai.video.minecraft.model.nano.Minecraft$TransitionParam;
import java.lang.Math;
import com.kwai.video.minecraft.model.nano.Minecraft$EnhanceFilterParam;
import java.util.Map;
import java.util.Set;
import java.util.Map$Entry;
import com.kwai.sdk.switchconfig.a;
import xf6.g;
import wba.u;
import kotlin.jvm.internal.a;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils;
import java.io.File;
import qkd.b;
import haa.f;
import com.kuaishou.edit.draft.Workspace;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.util.Collection;
import ekd.q;
import com.kuaishou.edit.draft.Music;
import com.yxcorp.gifshow.media.util.c;
import com.kuaishou.edit.draft.TimeRange;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import java.lang.System;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kwai.framework.abtest.f;
import com.kuaishou.edit.draft.Workspace$Source;
import wba.p0;
import wba.d0;
import com.kwai.video.editorsdk2.ExportTask;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.kwai.video.editorsdk2.ExportTaskNoQueueing;
import com.yxcorp.gifshow.postwork.e;
import pca.a0;
import pca.z;
import com.kwai.video.editorsdk2.EncodeSpeedProvider;
import pca.y;
import com.kwai.video.editorsdk2.UploadDecisionMaker;
import zxa.a;
import com.kwai.video.clipkit.mv.KwaiMvParam;
import c26.c;
import com.kwai.FaceMagic.AE2.AE2Project;
import java.lang.Integer;
import com.yxcorp.gifshow.postwork.a;
import r26.a;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import dnc.x0;
import d26.a;
import wkd.b;
import com.yxcorp.gifshow.upload.UploadInfo;
import zxa.b;
import com.yxcorp.gifshow.encode.w;
import com.kwai.video.editorsdk2.ExportEventListener;
import pca.i0;
import com.kwai.video.editorsdk2.ExportTask$RealtimeStatsListenerMc;
import com.kwai.video.clipkit.log.ClipEditLogger;
import rca.b;
import com.kuaishou.android.post.funnel.PostFunnelManager;
import com.kuaishou.android.post.funnel.PostFunnelManager$a;
import v46.b;
import com.yxcorp.gifshow.encode.utils.EncodeFunnel$funnelStart$1;
import msd.l;
import com.yxcorp.gifshow.encode.v0;
import w46.b;
import java.lang.Exception;

public final class u implements Runnable	// class@000d4f
{
    public final EncodeManager b;
    public final PostEncodeInfo c;
    public final EncodeManager$d d;
    public final EditorSdk2V2$VideoEditorProject e;
    public final String f;
    public final String g;

    public void u(EncodeManager p0,PostEncodeInfo p1,EncodeManager$d p2,EditorSdk2V2$VideoEditorProject p3,String p4,String p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void run(){
       String str1;
       String str2;
       Object[] objArray3;
       EditorSdk2$ExportOptions uExportOptio2;
       String str3;
       Object[] objArray5;
       int b1;
       u ou2;
       EditorSdk2$ExportOptions uExportOptio3;
       EditorSdk2$ExportOptions uExportOptio4;
       EditorSdk2V2$VideoEditorProject videoEditorP;
       u ou3;
       String sessionId;
       boolean b3;
       b a;
       int i3;
       Music music;
       EncodeManager uEncodeManag3;
       double d1;
       EditorSdk2$Rational obj1;
       EditorSdk2$ProbedStream obj2;
       EditorSdk2V2$TrackAsset trackAsset;
       u ou = this;
       u b = ou.b;
       u c = ou.c;
       u d = ou.d;
       u e = ou.e;
       u f = ou.f;
       u g = ou.g;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = ":";
       EncodeManager uEncodeManag = EncodeManager.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(uEncodeManag)) {
          Object[] objArray = new Object[]{c,d,e,f,g};
          if (!PatchProxy.applyVoid(objArray, b, uEncodeManag, "34")) {
             try{
             label_0039 :
                Object[] objArray1 = new Object[i1];
                str1 = "EncodeManager";
                a.D().w(str1, "encodeInMainThread", objArray1);
                if (c.getStatus() == EncodeInfo$Status.CANCELED) {
                   objArray = new Object[i1];
                   a.D().w(str1, "encodeInMainThread: task is canceled", objArray);
                }else {
                   PostLogger postLogger = new PostLogger().c(str1).e(str1);
                   postLogger.k(c.getSessionId());
                   postLogger.h(PostSubTaskEvent.ENCODE_EXPORT).i(String.valueOf(c.getId())).j(PostLogger$Status.BEGIN).d();
                   PostEncodeInfo mVideoEncode = c.mVideoEncodeSDKInfo;
                   if (mVideoEncode != null) {
                      VideoEncodeSDKInfo mProject = mVideoEncode.mProject;
                      if (mProject != null) {
                      label_0094 :
                         EditorSdk2$ExportOptions uExportOptio = (b.j().uesDeliveryParamsConfig().booleanValue())? b.i(c, mProject): null;
                         EditorSdk2$ExportOptions uExportOptio1 = b.h(c, mProject);
                         Object[] objArray2 = new Object[0];
                         a.D().w(str1, "exportOptionsV1:"+uExportOptio1.toString(), objArray2);
                         if (uExportOptio != null) {
                            objArray3 = new Object[0];
                            a.D().w(str1, "exportOptionsV2:"+uExportOptio.toString(), objArray3);
                            b.j().compareExportOptions(uExportOptio1, uExportOptio);
                            uExportOptio2 = uExportOptio;
                         }else {
                            uExportOptio2 = uExportOptio1;
                         }
                         if (uExportOptio2.width() <= 0 && uExportOptio2.height() <= 0) {
                            uExportOptio2.setWidth(c.getWidth());
                            uExportOptio2.setHeight(c.getHeight());
                            ExceptionHandler.handleCaughtException(new EncodeManager$EncodeInfoWidthHeightUsedException("encodeInMainThread can not do this videoEditorProject:"+e+",outputExt:"+f));
                         }
                         if (c.isTranscodeDegrade()) {
                            uExportOptio2.setOpenUploadDecision(false);
                         }
                         d.c.v = uExportOptio2.x264Params();
                         c.mEncodeParams.mVideoBitrate = (int)uExportOptio2.videoBitrate();
                         c.mEncodeParams.mVideoGopSize = uExportOptio2.videoGopSize();
                         c.mEncodeParams.mX264Params = uExportOptio2.x264Params();
                         c.mEncodeParams.mX264Preset = uExportOptio2.x264Preset();
                         Object[] objArray4 = new Object[0];
                         a.D().w(str1, "encodeInMainThread exportOptions width: "+uExportOptio2.width()+", height: "+uExportOptio2.height(), objArray4);
                         Iterator obj = PatchProxy.applyTwoRefs(e, c, b, uEncodeManag, "31");
                         if (obj != patchProxyRe) {
                         }else if(j.h(e.trackAssets().toNormalArray())){
                            obj = null;
                         }else {
                            i1 = 30;
                            if (c.isKtvMultiPicSong()) {
                               obj = e.animatedSubAssets().iterator();
                               while (true) {
                                  if (obj.hasNext()) {
                                     sessionId = obj.next().opaque();
                                     str3 = (!TextUtils.x(sessionId) && sessionId.startsWith("lyric-"))? 1: null;
                                     if (str3) {
                                        objArray5 = new Object[0];
                                        a.D().w(str1, " K歌照片, 导出帧率为30", objArray5);
                                        obj = EditorSdk2Utils.createRational(i1, 1);
                                     }
                                  }
                               }
                            }
                            if (!e.isKwaiPhotoMovie()) {
                               obj1 = PatchProxy.applyOneRefs(e, b, uEncodeManag, "42");
                               if (obj1 != patchProxyRe) {
                                  d1 = obj1.doubleValue();
                               }else if(!j.h(e.trackAssets().toNormalArray())){
                                  trackAsset = e.trackAssets(0);
                               }else {
                                  trackAsset = null;
                               }
                               obj2 = EditorSdk2UtilsV2.trackAssetProbedVideoStream(trackAsset);
                               obj1 = (obj2 != null)? obj2.avgFrameRate(): null;
                               if (obj1 != null) {
                                  u ou4 = null;
                                  if (obj1.den() - ou4 > 0 && obj1.num() - ou4 > 0) {
                                     d1 = (double)obj1.num() / (double)obj1.den();
                                  }
                               }
                               ImmutableArray immutableArr = 0xbff0000000000000;
                               if (d1 - null > 0 && d1 - 0x4000020c49ba5e35 < 0) {
                                  if (e.touchData() != null && !j.h(e.touchData().toNormalArray())) {
                                     objArray5 = new Object[0];
                                     a.D().w(str1, "非直接编辑的照片电影 魔法手指, 导出帧率为20", objArray5);
                                     obj1 = b.p();
                                  }else if(e.timeEffect() != null && e.timeEffect().timeEffectType()){
                                     objArray5 = new Object[0];
                                     a.D().w(str1, "非直接编辑的照片电影 时间特效, 导出帧率为20", objArray5);
                                     obj1 = b.p();
                                  }else if(e.visualEffects() != null && !j.h(e.visualEffects().toNormalArray())){
                                     objArray5 = new Object[0];
                                     a.D().w(str1, "非直接编辑的照片电影 滤镜特效, 导出帧率为20", objArray5);
                                     obj1 = b.p();
                                  }else {
                                     i3 = 0;
                                     if (c.usedBeatSync()) {
                                        objArray5 = new Object[i3];
                                        a.D().w(str1, "照片电影卡点, 导出帧率为20", objArray5);
                                        obj1 = b.p();
                                     }
                                  }
                               }
                            }
                         label_02e9 :
                            if (c.isNeedIncreaseFps()) {
                               a uoa2 = (y.o(Lists.c(e.trackAssets()), n.b) >= 0)? 1: null;
                               if (j.h(e.trackAssets().toNormalArray())) {
                                  i1.c(new RuntimeException("adjustVideoFrameRate error trackAsset is empty"));
                               }
                               if (uoa2) {
                                  EditorSdk2V2$TrackAsset[] trackAssetAr = e.trackAssets().toNormalArray();
                                  int len = trackAssetAr.length;
                                  i1 = 0;
                                  while (true) {
                                     if (i1 < len) {
                                        object oobject = trackAssetAr[i1];
                                        if (oobject.transitionParam() != null && oobject.transitionParam().type()) {
                                           trackAssetAr = 1;
                                        label_0344 :
                                           if (trackAssetAr) {
                                              objArray5 = new Object[0];
                                              a.D().w(str1, "adjustVideoFrameRate 多段导入/影集 如果里面有视频且有转场，那么强制输出为 max\(30, min\(60, trackAsset 中的最高帧率\)\) 帧，不然如果视频帧率很低转场会卡顿", objArray5);
                                              obj2 = PatchProxy.applyOneRefs(e, b, uEncodeManag, "32");
                                              if (obj2 != patchProxyRe) {
                                                 b1 = obj2.intValue();
                                              }else {
                                                 obj = e.trackAssets().iterator();
                                                 i3 = 30;
                                                 while (obj.hasNext()) {
                                                    i3 = (int)Math.max((double)i3, Math.ceil(EditorSdk2UtilsV2.getTrackAssetFps(obj.next())));
                                                 }
                                                 b1 = i3;
                                              }
                                              obj1 = EditorSdk2Utils.createRational(Math.max(30, Math.min(b1, 60)), 1);
                                           label_03c4 :
                                              objArray3 = new Object[0];
                                              a.D().w(str1, "encodeInMainThread adjustedVideoFrameRate:"+obj, objArray3);
                                              if (obj != null) {
                                                 uExportOptio2.setVideoFrameRate(obj);
                                              }
                                              if (e.enhanceFilter() != null) {
                                                 str3 = "";
                                                 obj = EditorSdk2Utils.convertEnhanceFilterParamToStringMap(e.enhanceFilter()).entrySet().iterator();
                                                 while (obj.hasNext()) {
                                                    Map$Entry uEntry = obj.next();
                                                    String key = uEntry.getKey();
                                                    Iterator iterator = obj;
                                                    String str4 = "VE_"+key;
                                                    if (TextUtils.n(key, "g_type")) {
                                                       str4 = "VE_gray";
                                                    }else if(TextUtils.n(key, "h_type")){
                                                       str4 = "VE_dehaze";
                                                    }else if(TextUtils.n(key, "wb")){
                                                       str4 = "VE_wb";
                                                    }else if(TextUtils.n(key, "enable")){
                                                       str4 = "enableVE";
                                                    }
                                                    str3 = str3+"["+str4+str+uEntry.getValue()+"]";
                                                    obj = iterator;
                                                 }
                                                 if (!TextUtils.x(uExportOptio2.comment())) {
                                                    uExportOptio2.setComment(uExportOptio2.comment()+str3);
                                                 }else {
                                                    uExportOptio2.setComment(str3);
                                                 }
                                              }
                                              i = 0;
                                              objArray5 = new Object[i];
                                              a.D().w(str1, "encode options comment:"+uExportOptio2.comment(), objArray5);
                                              b1 = (a.t().d("enable_tvd_v2", i) || g.a0())? true: false;
                                              uExportOptio2.setEnableTvdV2(b1);
                                              uExportOptio2.setMediaCodecEncoderMaxPendingCount((int)a.t().b("mediaCodecEncoderMaxPendingCount", 0));
                                              PostEncodeInfo mWorkspace = c.mWorkspace;
                                              EncodeInfo mWorkspaceDi = c.mWorkspaceDirectory;
                                              PostEncodeInfo postEncodeIn = mWorkspace;
                                              String str5 = "EncodeManager";
                                              EncodeInfo uEncodeInfo = mWorkspaceDi;
                                              str = str1;
                                              u ou1 = g;
                                              PatchProxyResult patchProxyRe1 = patchProxyRe;
                                              EncodeInfo uEncodeInfo1 = mWorkspaceDi;
                                              PostEncodeInfo postEncodeIn1 = mWorkspace;
                                              EncodeManager uEncodeManag2 = uEncodeManag;
                                              if (!PatchProxy.applyVoidFourRefs(e, postEncodeIn, uEncodeInfo, str5, 0, u.class, "15")) {
                                                 str3 = str5;
                                                 a.p(str3, "logTag");
                                                 if (postEncodeIn1 != null && uEncodeInfo1 != null) {
                                                    b1 = false;
                                                    EditorSdk2V2$AudioAsset uAudioAsset = AudioAssetUtils.c(b1, e);
                                                    if (uAudioAsset != null) {
                                                       a.o(uAudioAsset, "AudioAssetUtils.getAudio\x20\x02roject\)\n        ?: return\x00");
                                                       if (!b.S(new File(uAudioAsset.assetPath()))) {
                                                          objArray4 = new Object[b1];
                                                          f.D().w(str3, "project music file is invalid", objArray4);
                                                          List list = DraftUtils.w(postEncodeIn1);
                                                          if (!q.f(list)) {
                                                             a.m(list);
                                                             obj = list.iterator();
                                                             Object[] objArray6 = null;
                                                             while (obj.hasNext()) {
                                                                music = obj.next();
                                                                if (!u.j(music)) {
                                                                   Music music1 = music;
                                                                }else {
                                                                   continue ;
                                                                }
                                                             }
                                                             File uFile = DraftUtils.v(uEncodeInfo1, postEncodeIn1);
                                                             if (!b.S(uFile)) {
                                                                uFile = DraftUtils.A(uEncodeInfo1, postEncodeIn1);
                                                                uEncodeManag3 = 1;
                                                             }else {
                                                                uEncodeManag3 = null;
                                                             }
                                                             if (!b.S(uFile)) {
                                                                objArray6 = new Object[0];
                                                                f.D().w(str3, "draft music file is invalid", objArray6);
                                                             }else {
                                                                a.m(uFile);
                                                                uAudioAsset.setAssetPath(uFile.getPath());
                                                                d1 = (b.S(uFile))? (double)c.i(uFile.getAbsolutePath()): 0;
                                                                if (uEncodeManag3 != null) {
                                                                   TimeRange timeRange = DraftUtils.z(objArray6);
                                                                   if (timeRange != null) {
                                                                      double start = timeRange.getStart();
                                                                      ou2 = e;
                                                                      uExportOptio3 = uExportOptio2;
                                                                      uAudioAsset.setClippedRange(EditorSdk2UtilsV2.createTimeRange(start, Math.min(timeRange.getDuration(), ((d1 / (double)1000) - start))));
                                                                   label_05e0 :
                                                                      String outputPath = c.getOutputPath();
                                                                      File parentFile = new File(outputPath).getParentFile();
                                                                      if (parentFile != null && !parentFile.exists()) {
                                                                         objArray5 = new Object[0];
                                                                         a.D().w(str, "create path: "+parentFile+" ok="+parentFile.mkdirs(), objArray5);
                                                                      }
                                                                      EncodeInfo$EncodeParams uEncodeParam = PatchProxy.applyTwoRefs(c, f, b, uEncodeManag2, "39");
                                                                      if (uEncodeParam != patchProxyRe1) {
                                                                      }else {
                                                                         EncodeInfo mEncodeParam1 = c.mEncodeParams;
                                                                         if (mEncodeParam1 != null && !TextUtils.x(mEncodeParam1.mEncodedFileOutputTempPath)) {
                                                                            objArray5 = new Object[0];
                                                                            a.D().w(str, "generateEncodedFilePath encodeParam is not null mEncodedTemporaryFilePath: "+c.mEncodeParams.mEncodedFileOutputTempPath, objArray5);
                                                                            uEncodeParam = c.mEncodeParams.mEncodedFileOutputTempPath;
                                                                         }else {
                                                                            uEncodeParam = (c.getOutputPath()).replace(f, System.currentTimeMillis()+"_tmp"+f);
                                                                         }
                                                                      }
                                                                      objArray6 = new Object[0];
                                                                      a.D().w(str, "encodeInMainThread path: "+outputPath+", tmpPath: "+uEncodeParam, objArray6);
                                                                      if (PatchProxy.applyVoidFourRefs(c, ou1, uEncodeParam, uExportOptio3, b, EncodeManager.class, "29")) {
                                                                         uExportOptio4 = uExportOptio3;
                                                                      }else if(c.mEncodeParams == null){
                                                                         i3 = 0;
                                                                         objArray5 = new Object[i3];
                                                                         a.D().w(str, "initExportTaskOptionsTemporaryFile encode param is null", objArray5);
                                                                         c.mEncodeParams = new EncodeInfo$EncodeParams();
                                                                      }else {
                                                                         i3 = 0;
                                                                      }
                                                                      c.mEncodeParams.mEncodingTemporaryFilePath = ou1;
                                                                      objArray5 = new Object[i3];
                                                                      a.D().s(str, "update exportOptions", objArray5);
                                                                      EncodeInfo mEncodeParam = c.mEncodeParams;
                                                                      mEncodeParam.mEncodedFileOutputTempPath = uEncodeParam;
                                                                      uExportOptio4 = uExportOptio3;
                                                                      uExportOptio4.setTemporaryFilesDirectory(mEncodeParam.mEncodingTemporaryFilePath);
                                                                      objArray6 = new Object[0];
                                                                      a.D().s(str, "initExportTaskOptionsTemporaryFile temporaryFilesDirectory: "+uExportOptio4.temporaryFilesDirectory(), objArray6);
                                                                      c.mEncodeParams.mExportOptionsBytes = uExportOptio4.toByteArray();
                                                                      boolean b2 = f.a("androidMultiProcessExport");
                                                                      f = ou2;
                                                                      videoEditorP = b.l(f, c);
                                                                      postEncodeIn = c.mWorkspace;
                                                                      if (postEncodeIn != null && p0.a(postEncodeIn.getSource())) {
                                                                         d0.u(videoEditorP);
                                                                      }
                                                                      if (c.isExportTaskInQueueing()) {
                                                                         ExportTask uExportTask = new ExportTask(a.a().a(), videoEditorP, uEncodeParam, uExportOptio4, 0, b2);
                                                                      }else {
                                                                         ExportTaskNoQueueing uExportTaskN = new ExportTaskNoQueueing(a.a().a(), videoEditorP, uEncodeParam, uExportOptio4);
                                                                      }
                                                                      ExportTask uExportTask1 = postEncodeIn;
                                                                      e.a().d(e.b(c), "create_export_task");
                                                                      postLogger = new PostLogger().c(str).e(str);
                                                                      postLogger.k(c.getSessionId());
                                                                      postLogger.h(PostSubTaskEvent.ENCODE_EXPORT).i(String.valueOf(c.getId())).j(PostLogger$Status.WAIT).d();
                                                                      if (uExportOptio4.openUploadDecision()) {
                                                                         sessionId = c.getSessionId();
                                                                         String str6 = sessionId;
                                                                         b3 = b2;
                                                                         String str7 = sessionId;
                                                                         if (!PatchProxy.applyVoidThreeRefs(c, uExportTask1, str6, null, a0.class, "7")) {
                                                                            objArray1 = new Object[0];
                                                                            a.D().w("ENCODE_ANALYZE_TAG", "initExportTaskUploadDecisionIfNeeded", objArray1);
                                                                            uExportTask1.setEncodeSpeedProvider(new z());
                                                                            uExportTask1.setUploadDecisionMaker(new y(str7, c));
                                                                         label_07d7 :
                                                                            mVideoEncode = c.mResult;
                                                                            if (mVideoEncode != null) {
                                                                               new a().a(mVideoEncode.d(), mVideoEncode.a());
                                                                               mVideoEncode.b();
                                                                            }
                                                                            d.b = uExportTask1;
                                                                            b.d.put(Integer.valueOf(c.getId()), d);
                                                                            a uoa = b.r().g4(c.getId());
                                                                            b.q().j(uoa);
                                                                            b1 = (int)(EditorSdk2UtilsV2.getDisplayDuration(f) * 0x408f400000000000);
                                                                            c.mExportDuration = (long)b1;
                                                                            if (PostExperimentUtils.h()) {
                                                                               c.setByteStreamEncodeInfo(new a(uEncodeParam, b1));
                                                                            }
                                                                            int i2 = b.a(-2001546430).b(c, null) ^ 0x01;
                                                                            b uob = new b("export");
                                                                            mVideoEncode = c.mResult;
                                                                            if (mVideoEncode != null) {
                                                                               uob.c(mVideoEncode.getTemplateId());
                                                                               uob.d(c.mResult.getTemplateType());
                                                                            }
                                                                            w ow = str6;
                                                                            w ow1 = str6;
                                                                            b uob1 = uob;
                                                                            ExportTask uExportTask2 = uExportTask1;
                                                                            a uoa1 = uoa;
                                                                            boolean b4 = b3;
                                                                            str2 = str;
                                                                            ow = new w(b, c, uoa, uob1, f, uExportOptio4, outputPath, uExportTask1, i2, d);
                                                                            uExportTask2.setExportEventListener(ow1);
                                                                            c.mStatus = EncodeInfo$Status.ENCODING;
                                                                            ou3 = b;
                                                                            ou3.z(c);
                                                                            objArray6 = new Object[0];
                                                                            a.D().w(str2, "encodeInMainThread exportTask run", objArray6);
                                                                            uExportTask2.run();
                                                                            uExportTask2.startRealtimeQosWithListener(new i0(c));
                                                                            outputPath = uExportTask2.getMcSummaryPreviewStats();
                                                                            objArray5 = new Object[0];
                                                                            a.D().w(str2, "getMcSummaryPreviewStats:"+outputPath, objArray5);
                                                                            ClipEditLogger.reportMcSummaryLog(1, TextUtils.k(c.mSessionId), outputPath);
                                                                            uob1.b();
                                                                            if (uoa1 != null) {
                                                                               ou3.q().r(uoa1.getId());
                                                                            }
                                                                            a = b.a;
                                                                            Objects.requireNonNull(a);
                                                                            if (!PatchProxy.applyVoid(null, a, b.class, "1")) {
                                                                               PostFunnelManager.j.a().d().l(EncodeFunnel$funnelStart$1.INSTANCE);
                                                                            }
                                                                            ou3.F(d.c, "enableMultiProcessExport: "+b4);
                                                                            Boolean.FALSE.d(null, c, 1, Boolean.FALSE);
                                                                         }
                                                                      }else {
                                                                         b3 = b2;
                                                                      }
                                                                      sessionId = 0;
                                                                      goto label_07d7 ;
                                                                   }
                                                                }else {
                                                                   ou2 = e;
                                                                   uExportOptio3 = uExportOptio2;
                                                                   uAudioAsset.setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, d1));
                                                                   goto label_05e0 ;
                                                                }
                                                             }
                                                          }
                                                       }
                                                    }
                                                 }
                                              }
                                              ou2 = e;
                                              uExportOptio3 = uExportOptio2;
                                              goto label_05e0 ;
                                           }
                                        }else {
                                           i1 = i1 + 1;
                                        }
                                     }else {
                                        trackAssetAr = 0;
                                        goto label_0344 ;
                                     }
                                  }
                               }
                               i = 1;
                               if (uoa2 == null && e.trackAssetsSize() > i) {
                                  objArray5 = new Object[0];
                                  a.D().w(str1, "adjustVideoFrameRate 多段导入/影集，把视频删完只剩图片且长度大于1，导出帧率为30", objArray5);
                                  obj1 = EditorSdk2Utils.createRational(30, i);
                                  goto label_03c4 ;
                               }else {
                                  objArray5 = new Object[0];
                                  a.D().w(str1, "adjustVideoFrameRate 多段导入或者智能影集、没有转场、没有视频、长度为1，走单图逻辑", objArray5);
                               }
                            }else {
                               objArray3 = 1;
                            }
                            obj1 = null;
                            goto label_03c4 ;
                         }
                         objArray3 = 1;
                         goto label_03c4 ;
                      }
                   }
                   videoEditorP = null;
                   goto label_0094 ;
                }
             }catch(java.lang.Exception e0){
                str2 = str1;
                EncodeManager uEncodeManag1 = b;
                PostLogger postLogger1 = new PostLogger().b(str2).e(str2);
                postLogger1.k(c.getSessionId());
                postLogger1.h(PostSubTaskEvent.ENCODE_EXPORT).i(String.valueOf(c.getId())).j(PostLogger$Status.ERROR).g("generateOption exception").l(e0).d();
                uEncodeManag1.x(c, e0);
                uEncodeManag1.E(d.c, e0.getClass().getName()+str+e0.getMessage(), 0);
                d.b.d(d.b, c, 8, Boolean.FALSE);
             }catch(java.lang.Exception e0){
                str2 = str;
                ou3 = b;
                a.D().e(str2, "create ExportTask error", e0);
                postLogger1 = new PostLogger().b(str2).e(str2);
                postLogger1.k(c.getSessionId());
                postLogger1.h(PostSubTaskEvent.ENCODE_EXPORT).i(String.valueOf(c.getId())).j(PostLogger$Status.ERROR).l(e0).d();
                ou3.x(c, e0);
                ou3.E(d.c, e0.getClass().getName()+str+e0.getMessage(), 0);
                d.b.d(d.b, c, 8, Boolean.FALSE);
             }
          }
       }else {
          goto label_0039 ;
       }
    }
}
