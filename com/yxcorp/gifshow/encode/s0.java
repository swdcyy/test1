package com.yxcorp.gifshow.encode.s0;
import java.lang.Object;
import java.io.File;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import pca.g1;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import java.lang.Boolean;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import qkd.b;
import android.util.Pair;
import java.lang.Float;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import pca.k1;
import pca.d1;
import erd.o;
import java.util.List;
import pca.j1;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import pca.x0;
import com.yxcorp.gifshow.encode.y;
import erd.g;
import r26.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import com.kwai.feature.post.api.feature.upload.model.UploadResult;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.post.api.feature.encode.model.AtlasInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$AtlasPackage;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import q2b.h$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoWatermarkDetailPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import org.json.JSONObject;
import com.yxcorp.gifshow.photo.download.model.PhotoStage;
import org.json.JSONException;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import k2b.e0;
import k2b.u1;
import kxb.e;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.media.watermark.a;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import java.lang.Exception;
import java.io.IOException;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import com.kwai.video.editorsdk2.EncodedSegmentInfo;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import um6.a;
import wkd.b;
import dnc.x0;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.lang.reflect.Type;
import com.kwai.framework.abtest.f;
import com.yxcorp.gifshow.photo.download.task.s;
import com.yxcorp.plugin.kwaitoken.KwaiToken;
import y6b.a;
import com.yxcorp.gifshow.video.api.watermark.BitmapAlignType;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.nano.Minecraft$InputFileOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$RationalV2;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.yxcorp.gifshow.media.model.PhotoMovieEncodeConfig;
import q46.l;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import mca.a;
import cj9.b;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.yxcorp.gifshow.media.util.g;
import wba.d0;
import com.yxcorp.gifshow.encode.p0;
import io.reactivex.g;
import com.kuaishou.edit.draft.Workspace;
import tkd.b;
import tkd.d;
import f0c.t;
import com.yxcorp.gifshow.postwork.a;
import com.yxcorp.gifshow.postwork.e;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.encode.m0;
import com.yxcorp.gifshow.encode.x;
import com.yxcorp.gifshow.encode.e0;
import com.yxcorp.gifshow.util.PostUtils;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import pca.b1;
import com.yxcorp.gifshow.encode.h0;
import com.yxcorp.gifshow.encode.f0;
import pca.v0;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import pca.i1;
import com.yxcorp.gifshow.upload.UploadInfo;
import qr4.i;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import qr4.m$k0;
import com.yxcorp.gifshow.media.model.BaseEncodeConfig;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$Rational;
import com.yxcorp.gifshow.media.model.KtvMvEncodeConfig;
import android.text.TextUtils;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$AdaptiveX264Config;
import java.util.Objects;
import java.lang.Number;
import com.yxcorp.gifshow.media.model.BaseEncodeConfig$AdaptiveX264Config;
import com.yxcorp.gifshow.encode.g0;
import qaa.a;
import lnc.a1;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.VideoCoverParam;
import com.google.protobuf.Timestamp;
import xf6.g;
import zwb.a;
import cjd.e;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import lrd.b;
import com.yxcorp.gifshow.encode.l0;
import com.yxcorp.gifshow.encode.n0;
import java.lang.System;
import com.kuaishou.gifshow.files.a;
import android.os.Build$VERSION;
import qkd.a;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.os.Environment;
import com.yxcorp.gifshow.albumcontrol.a;
import android.provider.MediaStore$Video$Media;
import android.provider.MediaStore$Images$Media;
import android.net.Uri;
import java.io.OutputStream;
import ekd.p;
import ekd.k1;
import lnc.i1;
import com.yxcorp.gifshow.media.util.c;
import com.kwai.video.videoprocessor.JpegBuilderException;
import com.yxcorp.gifshow.postwork.PostWorkErrorTips;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import com.yxcorp.gifshow.edit.draft.model.DraftEditException;
import pca.r0;
import pca.s0;
import pca.t0;
import pca.h1;
import pca.e1;
import haa.a;
import pca.y0;
import com.yxcorp.gifshow.activity.preview.f;
import com.yxcorp.gifshow.encode.k0;
import com.yxcorp.gifshow.encode.a0;
import y6b.o;
import j80.c;
import com.yxcorp.gifshow.media.watermark.g;
import lnc.z6;
import oa0.a;
import java.util.ArrayList;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import com.kwai.video.editorsdk2.ExportTask;

public class s0	// class@000d4a
{

    public void s0(){
       super();
    }
    public static t A(File p0){
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       s0 os0 = s0.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, os0, "43");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (PatchProxy.isSupport(os0)) {
          ot = PatchProxy.applyTwoRefs(p0, Long.valueOf(0), null, os0, "44");
          if (ot != patchProxyRe) {
          label_003c :
             return ot;
          }
       }
       ot = t.fromCallable(new g1(0, p0)).subscribeOn(d.c).observeOn(d.a);
       goto label_003c ;
    }
    public static t B(String p0,String p1,long p2,String p3,boolean p4){
       Object[] objArray;
       t ot;
       Object[] objArray4;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       boolean b = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       s0 os0 = s0.class;
       Object obj = null;
       int i = 4;
       int i1 = 3;
       int i2 = 1;
       if (PatchProxy.isSupport(os0)) {
          objArray = new Object[]{oobject,oobject1,Long.valueOf(p2),oobject2,Boolean.valueOf(p4)};
          Object obj1 = PatchProxy.apply(objArray, obj, os0, "23");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       Object[] objArray1 = new Object[0];
       a.D().w("EncodingUtils", "saveKtvSinglePicToAlbum needWatermark: "+b, objArray1);
       File uFile = s0.p(oobject2, ".mp4", b);
       if (b.S(uFile)) {
          Object[] objArray2 = new Object[0];
          a.D().w("EncodingUtils", "saveKtvSinglePicToAlbum from cache: "+uFile.getAbsolutePath(), objArray2);
          return s0.m(t.just(new Pair(uFile, Float.valueOf(0x3f800000))));
       }else if(PatchProxy.isSupport(os0)){
          objArray = new Object[]{oobject,oobject1,Long.valueOf(p2),uFile,Boolean.valueOf(p4)};
          ot = PatchProxy.apply(objArray, null, os0, "41");
          if (ot != patchProxyRe) {
          }else {
          label_00b8 :
             Object[] objArray3 = new Object[0];
             a.D().w("EncodingUtils", "buildKtvSinglePicModeFile", objArray3);
             String str = "buildKtvSinglePicModeFile ktvInfo.mOutputAudioPath is inValid";
             if (!b.S(new File(oobject))) {
                objArray4 = new Object[0];
                a.D().w("EncodingUtils", "mOutputAudioPath is inValid", objArray4);
                ot = t.error(new IllegalArgumentException(str));
             }else if(!b.S(new File(oobject1))){
                objArray4 = new Object[0];
                a.D().w("EncodingUtils", "mOutputCoverPath is invalid", objArray4);
                ot = t.error(new IllegalArgumentException(str));
             }else {
                ot = t.fromCallable(new k1(b, oobject1)).subscribeOn(d.c).observeOn(d.a).flatMap(new d1(oobject, p2, uFile));
             }
          }
       }else {
          goto label_00b8 ;
       }
       return s0.m(ot);
    }
    public static t C(List p0,String p1,boolean p2){
       Object[] obj;
       if (PatchProxy.isSupport(s0.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, s0.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("EncodingUtils", "saveLongPictureToAlbum needWatermark: "+p2, objArray);
       File uFile = s0.p(p1, ".jpg", p2);
       if (b.S(uFile)) {
          obj = new Object[0];
          a.D().w("EncodingUtils", "saveLongPictureToAlbum from cache: "+uFile.getAbsolutePath(), obj);
          return s0.m(t.just(new Pair(uFile, Float.valueOf(0x3f800000))));
       }else {
          return s0.m(s0.e(p0, uFile, p2));
       }
    }
    public static t D(String p0,String p1,boolean p2){
       Object[] obj;
       if (PatchProxy.isSupport(s0.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, s0.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("EncodingUtils", "saveSinglePicToAlbum needWatermark: "+p2, objArray);
       File uFile = s0.p(p1, ".jpg", p2);
       if (b.S(uFile)) {
          obj = new Object[0];
          a.D().w("EncodingUtils", "saveSinglePicToAlbum from cache: "+uFile.getAbsolutePath(), obj);
          return s0.m(t.just(new Pair(uFile, Float.valueOf(0x3f800000))));
       }else if(p2){
          return s0.m(t.fromCallable(new j1(p0, uFile)).subscribeOn(d.c));
       }else {
          return s0.m(t.just(new Pair(new File(p0), Float.valueOf(0x3f800000))));
       }
    }
    public static t E(String p0,File p1,String p2,boolean p3,VideoContext p4){
       s0 os0 = s0.class;
       if (PatchProxy.isSupport(os0)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, null, os0, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray1 = new Object[0];
       a.D().w("EncodingUtils", "saveVideoToAlbum needWatermark: "+p3, objArray1);
       File uFile = s0.p(p2, ".mp4", p3);
       if (b.S(uFile)) {
          Object[] objArray2 = new Object[0];
          a.D().w("EncodingUtils", "saveVideoToAlbum from cache: "+uFile.getAbsolutePath(), objArray2);
          return s0.m(t.just(new Pair(uFile, Float.valueOf(0x3f800000))));
       }else {
          return s0.m(s0.i(new File(p0), uFile, p1, p3, p4).map(new x0(uFile))).doOnNext(y.b);
       }
    }
    public static void F(a p0,long p1,File p2,long p3,int p4,int p5,String p6){
       h$b uob;
       ClientContent$VideoWatermarkDetailPackage videoWaterma;
       ClientEvent$ElementPackage uElementPack;
       JSONObject jSONObject;
       Activity uActivity;
       object oobject = p6;
       s0 os0 = s0.class;
       x ox = null;
       int i = 6;
       int i1 = 5;
       int i2 = 2;
       int i3 = 1;
       if (PatchProxy.isSupport(os0)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),p2,Long.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),oobject};
          if (PatchProxy.applyVoid(objArray, ox, os0, "56")) {
             return;
          }
       }
       if (p0 != null && p0.hasPhotoId()) {
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page2 = oobject;
          ClientContent$PhotoPackage photoPackage = new ClientContent$PhotoPackage();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          IUploadInfo uploadInfo = p0.getUploadInfo();
          photoPackage.identity = TextUtils.I(uploadInfo.getUploadResult().getPhotoId());
          if (uploadInfo.getAtlasInfo() != null) {
             ClientContent$AtlasPackage uAtlasPackag = new ClientContent$AtlasPackage();
             photoPackage.type = i;
             uAtlasPackag.type = (uploadInfo.getAtlasInfo().mMixedType == i3)? i3: i2;
             uContentPack.atlasPackage = uAtlasPackag;
          }else if(b.L(new File(uploadInfo.getFilePath()))){
             photoPackage.type = i1;
          }else {
             photoPackage.type = i3;
          }
          String id = QCurrentUser.me().getId();
          photoPackage.sAuthorId = TextUtils.I(id);
          if (!TextUtils.x(id)) {
             try{
                photoPackage.authorId = Long.valueOf(id).longValue();
             }catch(java.lang.Exception e0){
             }
          }
       }
    label_013d :
       return;
    }
    public static void a(EditorSdk2V2$VideoEditorProject p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, s0.class, "54")) {
          return;
       }
       try{
          int i = p0.projectOutputWidth();
          int i1 = p0.projectOutputHeight();
          Object[] objArray = new Object[0];
          a.D().w("EncodingUtils", "processWatermarkProject w:"+i+" h: "+i1, objArray);
          a uoa = new a(i, i1, QCurrentUser.me().getKwaiId(), QCurrentUser.me().getId(), QCurrentUser.me().getName());
          v1.a();
          p0.setAnimatedSubAssets(v1.b(p0, true));
       }catch(java.io.IOException e8){
          a.D().z("EncodingUtils", e8.getMessage(), e8);
       }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e8){
          a.D().z("EncodingUtils", e8.getMessage(), e8);
       }
       return;
    }
    public static void b(PostWorkInfo p0,EncodedSegmentInfo p1,boolean p2,String p3,int p4){
       s0 os0 = s0.class;
       String str = null;
       int i = 0;
       if (PatchProxy.isSupport(os0)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, str, os0, "14")) {
             return;
          }
       }
       Object[] objArray1 = new Object[i];
       a.D().s("EncodingUtils", "addSegment: useWholeFileUpload: "+p2, objArray1);
       if (p0 == null) {
          return;
       }else {
          PostEncodeInfo encodeInfo = p0.getEncodeInfo();
          if (encodeInfo != null && (encodeInfo.mKtvInfo != null && encodeInfo.isKtvMv())) {
             str = encodeInfo.mKtvInfo.getOutputAudioPath();
          }
       label_0061 :
          Object obj = str;
          Object obj1 = b.a(-2001546430);
          obj1.j(p0);
          if (!p2) {
             obj1.u(p3, obj, p4, false, p0, p1);
          }
          return;
       }
    }
    public static void c(File p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, s0.class, "39")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EncodingUtils", "addWatermarkForImage", objArray);
       if (!b.S(p0)) {
          a uoa = a.D();
          StringBuilder str = "input path:";
          String absolutePath = (p0 != null)? p0.getAbsolutePath(): " ";
          Object[] objArray1 = new Object[i];
          uoa.A("EncodingUtils", str+absolutePath+" is invalid", objArray1);
          return;
       }else {
          Bitmap uBitmap = BitmapUtil.q(p0);
          if (uBitmap != null) {
             if (f.b("photoDownload", Boolean.class, Boolean.FALSE).booleanValue()) {
                Bitmap uBitmap1 = s.k(QCurrentUser.me().getId()).blockingLast();
                if (uBitmap1.getHeight() != 1) {
                   uBitmap1 = s.g(uBitmap, uBitmap1, QCurrentUser.me().getName());
                   KwaiToken.k().F1(p1.getName());
                }else {
                   uBitmap1 = new a().a(uBitmap, s0.r(), false, true, BitmapAlignType.BOTTOM_CENTER_ONE_LINE);
                }
                uBitmap = uBitmap1;
             }else {
                uBitmap = new a().a(uBitmap, s0.r(), false, true, BitmapAlignType.BOTTOM_CENTER_ONE_LINE);
             }
          }
          s0.u(uBitmap, p0, p1);
          return;
       }
    }
    public static t d(List p0,String p1,File p2,boolean p3){
       Object[] obj;
       EditorSdk2V2$VideoEditorProject videoEditorP;
       PhotoMovieEncodeConfig photoMovieEn;
       Pair pair;
       EditorSdk2$ExportOptions uExportOptio;
       Object[] objArray2;
       object oobject = p0;
       object oobject1 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(s0.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, s0.class, "36");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EncodingUtils", "saveAtlas", objArray);
       int i1 = 5;
       int i2 = 3;
       int i3 = 4;
       Object obj1 = null;
       if (PatchProxy.isSupport(s0.class)) {
          obj = new Object[i1];
          obj[i] = oobject;
          obj[1] = oobject1;
          obj[2] = Integer.valueOf(i);
          obj[i2] = Integer.valueOf(2);
          obj[i3] = Boolean.TRUE;
          videoEditorP = PatchProxy.apply(obj, obj1, s0.class, "5");
          if (videoEditorP != patchProxyRe) {
          }else {
          label_0062 :
             videoEditorP = new EditorSdk2V2$VideoEditorProject();
             int i4 = p0.size();
             EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[i4];
             videoEditorP.setTrackAssets(trackAssetAr);
             videoEditorP.setIsKwaiPhotoMovie(1);
             int i5 = 0;
             while (i5 < i4) {
                String str = oobject.get(i5);
                if (PatchProxy.isSupport(s0.class)) {
                   Object[] objArray1 = new Object[i1];
                   objArray1[i] = Integer.valueOf(i5);
                   objArray1[1] = str;
                   objArray1[2] = videoEditorP;
                   objArray1[i2] = Integer.valueOf(i);
                   objArray1[i3] = Integer.valueOf(2);
                   if (!PatchProxy.applyVoid(objArray1, obj1, s0.class, "7")) {
                   label_00a3 :
                      Minecraft$InputFileOptions inputFileOpt = new Minecraft$InputFileOptions();
                      Minecraft$RationalV2 rationalV2 = EditorSdk2Utils.createRationalV2(1, 2);
                      try{
                         inputFileOpt.setFrameRate(rationalV2);
                         objArray2 = new Object[i];
                         a.D().w("EncodingUtils", "processSinglePhoto index: "+i5+" path:"+str, objArray2);
                         EditorSdk2V2$TrackAsset trackAsset = EditorSdk2UtilsV2.openTrackAsset(str, obj1, inputFileOpt);
                         trackAsset.setClippedRange(EditorSdk2UtilsV2.createTimeRange((double)i, (double)2));
                         videoEditorP.trackAssetsSetItem(i5, trackAsset);
                      }catch(java.lang.Exception e0){
                         objArray2 = new Object[i];
                         a.D().A("EncodingUtils", "processSinglePhoto exception: "+e0.getMessage(), objArray2);
                      }
                   }
                }else {
                   goto label_00a3 ;
                }
                i5 = i5 + 1;
                oobject = p0;
                i1 = 5;
                i2 = 3;
                i3 = 4;
                obj1 = null;
             }
             if (!TextUtils.x(p1) && !PatchProxy.applyVoidTwoRefs(oobject1, videoEditorP, null, s0.class, "6")) {
                Object[] objArray3 = new Object[i];
                a.D().w("EncodingUtils", "processPhotoAudio: "+oobject1, objArray3);
                EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[1];
                videoEditorP.setAudioAssets(uAudioAssetA);
                try{
                   objArray3 = 0x3ff0000000000000;
                   videoEditorP.audioAssetsSetItem(i, EditorSdk2UtilsV2.openAudioAsset(oobject1, objArray3, 1));
                }catch(java.io.IOException e0){
                }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
                }
                a.D().r("EncodingUtils", "打开音频素材失败", e0);
             }
          }
       }else {
          goto label_0062 ;
       }
       if (!EditorSdk2UtilsV2.videoProjectPrivateDataLoaded(videoEditorP)) {
          try{
             videoEditorP = EditorSdk2UtilsV2.loadProject(videoEditorP);
          }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
             e0.printStackTrace();
          }
       }
    }
    public static t e(List p0,File p1,boolean p2){
       if (PatchProxy.isSupport(s0.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, s0.class, "37");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return t.create(new p0(p2, p0, p1)).subscribeOn(d.c);
    }
    public static t f(Workspace p0,File p1,File p2){
       PostWorkInfo obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, s0.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("EncodingUtils", "clipAndExportMusicFile: "+p0.getIdentifier(), objArray);
       obj = d.a(-273232199).a20().e4(p0.getIdentifier());
       if (obj != null) {
          e.a().d(obj.getSessionId(), "clip_and_export_music_file");
       }
       List list = DraftUtils.w(p0);
       if (q.f(list)) {
          return t.just(Boolean.FALSE);
       }else {
          return t.create(new m0(list, p1, p0, p2));
       }
    }
    public static t g(EditorSdk2V2$VideoEditorProject p0,EditorSdk2$ExportOptions p1,File p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, s0.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new x(p2, p1, p0));
    }
    public static t h(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, s0.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new e0(p0, p1)).subscribeOn(d.c);
    }
    public static t i(File p0,File p1,File p2,boolean p3,VideoContext p4){
       File obj;
       s0 os0 = s0.class;
       int i = 0;
       if (PatchProxy.isSupport(os0)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, null, os0, "28");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!b.S(p0)) {
          return t.error(new IllegalArgumentException("exportNormalVideoFile input file is invalid"));
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w("EncodingUtils", "exportNormalVideoFile needWatermark:"+p3, objArray1);
          obj = b.X(PostUtils.g("[>|61|>]"), ".mp4");
          return new g().a(b.c(), p0.getAbsolutePath(), obj.getAbsolutePath(), a.a().a()).map(new b1(p0, obj)).flatMap(h0.b).flatMap(new f0(p3, p2, p1, p4)).map(new v0(obj));
       }
    }
    public static t j(Workspace p0,boolean p1){
       File obj;
       s0 os0 = s0.class;
       if (PatchProxy.isSupport(os0)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, os0, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("EncodingUtils", "exportSingleImageFromDraft needWatermark:"+p1, objArray);
       obj = s0.o(p0, p1, 0, ".jpg");
       if (b.S(obj)) {
          Object[] objArray1 = new Object[0];
          a.D().w("EncodingUtils", "exportImageFromDraft image cache: "+obj.getAbsolutePath(), objArray1);
          return t.just(new Pair(obj, Float.valueOf(0x3f800000)));
       }else {
          File uFile = DraftFileManager.E().J(p0);
          if (b.S(uFile)) {
             if (p1) {
                return t.fromCallable(new i1(uFile, obj)).subscribeOn(d.c);
             }else {
                return t.just(new Pair(uFile, Float.valueOf(0x3f800000)));
             }
          }else {
             return null;
          }
       }
    }
    public static boolean k(PostWorkInfo p0){
       Object[] objArray;
       UploadInfo obj = PatchProxy.applyOneRefs(p0, null, s0.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String str = "EncodingUtils";
       int i = 0;
       if (p0.getUploadInfo() == null || p0.getUploadInfo().mWorkspace == null) {
          objArray = new Object[i];
          a.D().A(str, "forceSaveSingPicture: getUploadInfo = "+p0.getUploadInfo(), objArray);
          return i;
       }else if(p0.getUploadInfo().getVideoContext() != null && (p0.getUploadInfo().getVideoContext().F() == null || p0.getUploadInfo().getVideoContext().F().b == null)){
          objArray = new Object[i];
          a.D().A(str, "forceSaveSingPicture: getVideoContext = "+p0.getUploadInfo().getVideoContext(), objArray);
          return i;
       }else {
          obj = p0.getUploadInfo().mWorkspace;
          if (obj.getSource() == Workspace$Source.CAPTURE && (obj.getType() == Workspace$Type.SINGLE_PICTURE && (PostExperimentUtils.y0() && p0.getUploadInfo().getVideoContext().F().b.E0 == 1))) {
             i = true;
          }
       label_0080 :
          return i;
       }
    }
    public static EditorSdk2$ExportOptions l(EditorSdk2V2$VideoEditorProject p0){
       double d;
       BaseEncodeConfig uBaseEncodeC = BaseEncodeConfig.class;
       String str = "1";
       p0 = PatchProxy.applyOneRefs(p0, null, s0.class, str);
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       try{
          a.u();
          EditorSdk2$ExportOptions uExportOptio = EditorSdk2Utils.createDefaultExportOptions();
          try{
             int i = 1;
             uExportOptio.setVideoFrameRate(EditorSdk2Utils.createRational(i, i));
             String str1 = l.c().c();
             if (!TextUtils.isEmpty(str1)) {
                uExportOptio.setAudioProfile(str1);
             }
             i = l.c().a();
             if (i > 0) {
                uExportOptio.setAudioBitrate((long)i);
             }
             i = l.c().b();
             if (i >= 0) {
                uExportOptio.setAudioCutoff(i);
             }
             uExportOptio.setAndroidExportTryEnablePbo(l.c().j());
             uExportOptio.setEnableAdaptiveX264Params(l.c().h());
             uExportOptio.setAdaptiveX264Config(new EditorSdk2$AdaptiveX264Config());
             EditorSdk2$AdaptiveX264Config uAdaptiveX26 = uExportOptio.adaptiveX264Config();
             KtvMvEncodeConfig ktvMvEncodeC = l.c();
             Objects.requireNonNull(ktvMvEncodeC);
             KtvMvEncodeConfig obj = PatchProxy.apply(null, ktvMvEncodeC, uBaseEncodeC, str);
             if (obj != PatchProxyResult.class) {
                d = obj.doubleValue();
             }else {
                BaseEncodeConfig mAdaptiveX26 = ktvMvEncodeC.mAdaptiveX264Config;
                d = (mAdaptiveX26 == null)? 0: mAdaptiveX26.getInterThreshold();
             }
             uAdaptiveX26.setInterThreshold(d);
             uAdaptiveX26 = uExportOptio.adaptiveX264Config();
             obj = l.c();
             Objects.requireNonNull(obj);
             String str2 = PatchProxy.apply(null, obj, uBaseEncodeC, "2");
             if (str2 != PatchProxyResult.class) {
             }else {
                uBaseEncodeC = obj.mAdaptiveX264Config;
                str2 = (uBaseEncodeC == null)? "": uBaseEncodeC.getExtraX264Params();
             }
             uAdaptiveX26.setExtraX264Params(str2);
          label_00c6 :
             return uExportOptio;
          }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
             int i1 = uExportOptio;
          }
          a.D().z("generateKTVSingOption", "设置导出信息失败", e0);
          uExportOptio = null;
          goto label_00c6 ;
       }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
          goto label_00ba ;
       }
    }
    public static t m(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, s0.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.flatMap(g0.b);
    }
    public static File n(a p0){
       boolean b;
       String obj = PatchProxy.applyOneRefs(p0, null, s0.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a1.p(R.string.arg_RES_7f10461f);
       int i = 0;
       if (p0.v() != null) {
          String videoCoverRa = p0.v().getVideoCoverParam().getVideoCoverRatio();
          if (!TextUtils.x(videoCoverRa) && !TextUtils.n(obj, videoCoverRa)) {
             b = true;
          label_003b :
             Object[] objArray = new Object[i];
             a.D().w("EncodingUtils", "getCoverFileIfNeed: coverCropped="+b, objArray);
             if (!b) {
                return DraftFileManager.E().v(p0);
             }else {
                return null;
             }
          }
       }
       b = false;
       goto label_003b ;
    }
    public static File o(Workspace p0,boolean p1,boolean p2,String p3){
       File obj;
       if (PatchProxy.isSupport(s0.class)) {
          obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, null, s0.class, "51");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = DraftFileManager.E().I(p0);
       if (!obj.exists()) {
          obj.mkdirs();
       }
       String str = DraftUtils.k0(p0.getOutputContentModifiedAt());
       if (p1) {
          str = str+"_watermark";
       }
       if (p2) {
          str = str+"_cover";
       }
       if (!p2 && !p1) {
          str = str+"_normal";
       }
       return new File(obj, str+p3);
    }
    public static File p(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(s0.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, s0.class, "52");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p2) {
          return new File(PostUtils.g("[>|68|>]"), p0+"_watermark"+p1);
       }else {
          return new File(PostUtils.g("[>|69|>]"), p0+p1);
       }
    }
    public static t q(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, s0.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.a().c()) {
          int i = 1;
          if (g.w0() == 2) {
             return t.just(Integer.valueOf(i));
          }else if(g.w0() == i){
             return t.just(Integer.valueOf(0));
          }
       }
       return b.a(-258426948).d(p0, s0.r(), "publishPage", null, 0).map(new e()).subscribeOn(b.b(c.c())).observeOn(d.a).map(l0.b).onErrorReturn(n0.b);
    }
    public static String r(){
       String obj = PatchProxy.apply(null, null, s0.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = QCurrentUser.me().getKwaiId();
       if (!TextUtils.x(obj)) {
          return obj;
       }
       return QCurrentUser.me().getId();
    }
    public static File s(long p0,File p1){
       File uFile;
       a b;
       long l = System.currentTimeMillis();
       if (b.N(p1)) {
          if (!p0 - null) {
             p0 = (long)(EditorSdk2Utils.getVideoTrackDuration(p1.getAbsolutePath()) * 0x408f400000000000);
          }
          uFile = a.b(".mp4");
       }else if(b.L(p1)){
          uFile = a.b(".jpg");
       }else if(b.O(p1.getName())){
          uFile = a.b(".png");
       }else {
          uFile = null;
       }
       Object[] objArray = new Object[0];
       a.D().w("EncodingUtils", "copy file to camera", objArray);
       if (uFile != null) {
          if (Build$VERSION.SDK_INT < 30) {
             PostUtils.c(p1, uFile);
             if (b.N(uFile)) {
                a.d(a.a().a(), uFile, p0);
             }else if(b.L(uFile)){
                a.b(a.a().a(), uFile);
             }else if(b.O(uFile.getAbsolutePath())){
                a.b(a.a().a(), uFile);
             }
          }else {
             ContentResolver contentResol = a.a().a().getContentResolver();
             ContentValues uContentValu = new ContentValues();
             uContentValu.put("relative_path", Environment.DIRECTORY_DCIM+"/Camera/");
             uContentValu.put("_display_name", uFile.getName());
             b = a.b;
             Uri eXTERNAL_CON = (b.N(p1))? MediaStore$Video$Media.EXTERNAL_CONTENT_URI: MediaStore$Images$Media.EXTERNAL_CONTENT_URI;
             OutputStream outputStream = contentResol.openOutputStream(b.h("post_share_saveAlbum", contentResol, eXTERNAL_CON, uContentValu));
             b.f(p1, outputStream);
             p.d(outputStream);
          }
          Object[] objArray1 = new Object[0];
          a.D().w("EncodingUtils", "saveFile:copy&insert cost:"+k1.t(l), objArray1);
          return uFile;
       }else {
          throw new IllegalArgumentException("save file to album input file is not mp4 or jpg");
       }
    }
    public static void t(String p0,int p1){
       s0 os0 = s0.class;
       if (PatchProxy.isSupport(os0) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, os0, "45")) {
          return;
       }
       h$b uob = h$b.d(p1, 453);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$PhotoPackage photoPackage = new ClientContent$PhotoPackage();
       photoPackage.identity = TextUtils.k(p0);
       uContentPack.photoPackage = photoPackage;
       uob.h(uContentPack);
       u1.r0(uob);
       return;
    }
    public static void u(Bitmap p0,File p1,File p2){
       Object[] objArray;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, s0.class, "40")) {
          return;
       }
       int i = 0;
       if (p0 == null) {
          a uoa = a.D();
          objArray = new Object[i];
          try{
             uoa.A("EncodingUtils", "addWatermarkForImage get bitmap is null", objArray);
             PostUtils.c(p1, p2);
          }catch(java.io.IOException e10){
             i1.c(e10);
          }
          return;
       }else {
          try{
             p1 = b.X(PostUtils.g("[>|64|>]"), ".jpg");
             c.e(null, p0, p0.getWidth(), p0.getHeight(), 100, p1.getAbsolutePath(), true, false);
             b.k0(p1, p2);
          }catch(com.kwai.video.videoprocessor.JpegBuilderException e11){
             if (e11.retcode == -30007) {
                PostWorkErrorTips.b(R.string.arg_RES_7f1043cd);
             }
             objArray = new Object[i];
             a.D().A("EncodingUtils", e11.getMessage(), objArray);
          }
          p0.recycle();
          return;
       }
    }
    public static t v(c p0,b$a p1,String p2,boolean p3){
       Object[] obj;
       t ot;
       Object[] objArray1;
       EditorSdk2V2$VideoEditorProject videoEditorP;
       EditorSdk2V2$VideoEditorProject videoEditorP1;
       String str1;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       boolean b = p3;
       if (PatchProxy.isSupport(s0.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, s0.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 1;
       File uFile = null;
       if (PatchProxy.isSupport(s0.class)) {
          obj = new Object[]{oobject,oobject1,oobject2,Boolean.FALSE,Boolean.valueOf(p3)};
          ot = PatchProxy.apply(obj, uFile, s0.class, "25");
          if (ot != PatchProxyResult.class) {
          }else {
          label_0055 :
             Workspace workspace = p0.v();
             if (workspace == null) {
                ot = t.error(new DraftEditException("buildWorkspace: draft is empty"));
             }else {
                Object[] objArray = new Object[0];
                a.D().w("EncodingUtils", "prepareOutputFileFromDraft needWatermark:false", objArray);
                if (workspace.getType() == Workspace$Type.SINGLE_PICTURE) {
                   t ot1 = s0.j(workspace, 0);
                   if (ot1 != null) {
                      ot = ot1;
                   }
                }
                File uFile1 = s0.o(workspace, 0, b, ".mp4");
                if (b.S(uFile1)) {
                   objArray1 = new Object[0];
                   a.D().w("EncodingUtils", "prepareOutputFileFromDraft getCacheVideo:"+uFile1.getAbsolutePath(), objArray1);
                   ot = t.just(new Pair(uFile1, Float.valueOf(0x3f800000)));
                }else {
                   String str = " needWatermark: ";
                   if (workspace.getType() == Workspace$Type.ATLAS) {
                      if (PatchProxy.isSupport(s0.class)) {
                         ot = PatchProxy.applyThreeRefs(p0, uFile1, Boolean.FALSE, null, s0.class, "29");
                         if (ot != PatchProxyResult.class) {
                         }
                      }
                      objArray1 = new Object[0];
                      a.D().w("EncodingUtils", "exportAtlasToVideo output:"+uFile1.getAbsolutePath()+str+0, objArray1);
                      z c = d.c;
                      ot = t.just(p0).observeOn(c).flatMap(new r0(oobject)).observeOn(c);
                      ot = ot.flatMap(new s0(oobject)).observeOn(d.a).flatMap(new t0(oobject, uFile1, 0));
                   }else if(oobject1 != null){
                      videoEditorP = p1.getProject();
                   }else {
                      videoEditorP = uFile;
                   }
                   if (workspace.getType() == Workspace$Type.KTV_SONG && workspace.getAssetsCount() == i) {
                      if (PatchProxy.isSupport(s0.class)) {
                         videoEditorP1 = videoEditorP;
                         str1 = str;
                         ot = PatchProxy.applyFourRefs(p0, videoEditorP, uFile1, Boolean.FALSE, null, s0.class, "31");
                         if (ot != PatchProxyResult.class) {
                         }
                      }else {
                         videoEditorP1 = videoEditorP;
                         str1 = str;
                      }
                      objArray1 = new Object[0];
                      a.D().w("EncodingUtils", "exportSinglePicSongToVideo output: "+uFile1.getAbsolutePath()+str1+0, objArray1);
                      ot = t.fromCallable(new h1(videoEditorP1, oobject)).flatMap(new e1(0, uFile1));
                   }else {
                      File uFile2 = DraftFileManager.E().J(workspace);
                      if (b.S(uFile2) && b.N(uFile2)) {
                         objArray = new Object[0];
                         a.D().w("EncodingUtils", "get encodeFile: "+uFile2.getAbsolutePath(), objArray);
                         if (b) {
                            uFile = s0.n(a.f(p0));
                         }
                         ot = s0.i(uFile2, uFile1, uFile, 0, p0.d1()).map(new y0(uFile1));
                      }else {
                         ot = f.a(oobject, oobject1, 0, oobject2).flatMap(k0.b).flatMap(new a0(oobject, 0, b));
                      }
                   }
                }
             }
          }
       }else {
          goto label_0055 ;
       }
       return ot;
    }
    public static void w(EditorSdk2V2$VideoEditorProject p0,int p1,int p2){
       if (PatchProxy.isSupport(s0.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, s0.class, "53")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EncodingUtils", "processWatermarkProject w:"+p1+" h: "+p2, objArray);
       o oo = new o(p1, p2, s0.r());
       oo.c();
       File uFile = new File(b.a(-1504323719).o(), "logo_bmp.png");
       if (!oo.k(uFile)) {
          Object[] objArray1 = new Object[0];
          a.D().A("EncodingUtils", "create logo file fail", objArray1);
          return;
       }else {
          g.h(p0, uFile.getAbsolutePath());
          return;
       }
    }
    public static void x(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, s0.class, "4")) {
          return;
       }
       if (!b.N(p0)) {
          return;
       }
       List list = a.t0(z6.K3);
       if (list == null) {
          list = new ArrayList();
       }
       if (list.contains(p0.getAbsolutePath())) {
          return;
       }else if(list.size() == 10){
          list.remove(0);
       }
       list.add(p0.getAbsolutePath());
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("saved_publish_video_paths", b.e(list));
       g.a(uEditor);
       return;
    }
    public static void y(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, s0.class, "47")) {
          return;
       }
       if (p0 != null) {
          p0.release();
       }
       return;
    }
    public static t z(List p0,String p1,String p2,boolean p3){
       if (PatchProxy.isSupport(s0.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, s0.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("EncodingUtils", "saveAtlasToAlbum needWatermark: "+p3, objArray);
       File uFile = s0.p(p2, ".mp4", p3);
       if (b.S(uFile)) {
          Object[] objArray1 = new Object[0];
          a.D().w("EncodingUtils", "saveAtlasToAlbum from cache: "+uFile.getAbsolutePath(), objArray1);
          return s0.m(t.just(new Pair(uFile, Float.valueOf(0x3f800000))));
       }else {
          return s0.m(s0.d(p0, p1, uFile, p3));
       }
    }
}
