package com.yxcorp.gifshow.encode.EncodeManager;
import java.lang.Object;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.HashSet;
import q6b.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import java.lang.Number;
import java.lang.Double;
import java.lang.reflect.Type;
import com.kwai.video.editorsdk2.ExportTask;
import c26.d;
import com.yxcorp.gifshow.util.PostUtils;
import java.util.Set;
import java.lang.Integer;
import d26.b;
import java.lang.System;
import java.util.Objects;
import java.lang.Long;
import com.yxcorp.gifshow.media.builder.MediaEncoderParams;
import java.io.File;
import java.lang.Float;
import dq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.postwork.a;
import r26.a;
import com.yxcorp.gifshow.postwork.PostWorkInfo;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import w46.b;
import java.util.Map;
import com.yxcorp.gifshow.postwork.e;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import pca.m0;
import java.util.concurrent.Executor;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.encode.model.VideoEncodeSDKInfo;
import pca.b0;
import wkd.b;
import ob6.p;
import ob6.h;
import com.kuaishou.gifshow.platform.network.keyconfig.FeatureConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.UploadConfig;
import gq.a;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import xf6.l;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.encode.v0;
import com.yxcorp.gifshow.encode.w0;
import com.yxcorp.gifshow.encode.EncodeManager$d;
import rca.e;
import brd.t;
import kotlin.jvm.internal.a;
import t45.d;
import brd.z;
import rca.d;
import erd.o;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.encode.r;
import erd.a;
import pca.j0;
import pca.k0;
import erd.g;
import crd.b;
import pca.e0;
import java.lang.Exception;
import ekd.k1;
import com.kwai.video.clipkit.hardware.ClipDPHardwareConfigManager;
import com.kwai.video.devicepersona.benchmark.BenchmarkEncodeProfile;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.Math;
import android.content.Context;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager$EncodeResult;
import com.kwai.video.devicepersonabenchmark.DPHardwareConfigManager;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$EncodeParams;
import java.util.Collection;
import java.util.Iterator;
import c26.b;
import mca.a;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import cj9.b;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import com.yxcorp.gifshow.encode.j;
import com.yxcorp.gifshow.encode.EncodeManager$a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import pca.f0;
import t45.c;
import com.kwai.feature.post.api.core.model.GSConfig;
import pca.a0;
import com.yxcorp.gifshow.media.model.EncodeConfig$ComplexEncodeProfile;
import com.yxcorp.gifshow.media.model.DegradeEncodeConfig;
import com.yxcorp.gifshow.media.model.KtvMvEncodeConfig;
import q46.l;
import com.yxcorp.gifshow.media.model.BaseEncodeConfig;
import com.yxcorp.gifshow.media.model.PhotoMovieEncodeConfig;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.gifshow.media.model.EncodeConfig$ImportEncodeConfig;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import dnc.x0;
import com.yxcorp.gifshow.upload.UploadInfo;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import wba.d0;
import com.kuaishou.edit.draft.Workspace;
import xf6.g;
import java.lang.RuntimeException;
import com.kwai.video.editorsdk2.DeliveryParamsManager$EncodeAdditionalInfo;
import com.kwai.video.editorsdk2.DeliveryParamsManager;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProtoSkipTranscodeConfig;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.yxcorp.gifshow.edit.previewer.utils.d;
import com.yxcorp.gifshow.edit.previewer.utils.KtvEditUtils;
import j80.c;
import java.util.concurrent.ExecutorService;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$Rational;
import tkd.b;
import tkd.d;
import f0c.t;
import rq.a;
import com.yxcorp.gifshow.media.model.EncodeConfig$SkipTranscodingConfig;
import com.kwai.framework.abtest.f;
import com.kwai.video.clipkit.config.ClipKitConfigManager;
import com.kwai.video.clipkit.config.ClipKitConfig;
import com.kwai.video.clipkit.config.EditorEncodeConfig;
import android.os.Build$VERSION;
import com.yxcorp.gifshow.encode.EncodeManager$c;
import java.util.Map$Entry;
import com.yxcorp.gifshow.encode.s;
import com.yxcorp.gifshow.encode.t;

public class EncodeManager	// class@000d05
{
    public int a;
    public final Set b;
    public final Map c;
    public final Map d;
    public final Set e;
    public x0 f;
    public DeliveryParamsManager g;
    public Executor h;
    public final c i;
    public EncodeConfig j;
    public static EncodeManager k;

    public void EncodeManager(){
       super();
       this.b = new LinkedHashSet();
       this.c = new LinkedHashMap();
       this.d = new HashMap();
       this.e = new HashSet();
       this.i = new c();
    }
    public static boolean f(){
       Object obj = PatchProxy.apply(null, null, EncodeManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enable_cape_hevc_model", false);
    }
    public static double g(){
       Object obj = PatchProxy.apply(null, null, EncodeManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return a.t().getValue("editor_hevc_export_speed_min_ratio", Double.class, Double.valueOf(0)).doubleValue();
    }
    public static EncodeManager o(){
       EncodeManager uEncodeManag = EncodeManager.class;
       Object obj = PatchProxy.apply(null, null, uEncodeManag, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (EncodeManager.k == null) {
          _monitor_enter(uEncodeManag);
          if (EncodeManager.k == null) {
             EncodeManager.k = new EncodeManager();
          }
          _monitor_exit(uEncodeManag);
       }
       return EncodeManager.k;
    }
    public void A(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EncodeManager.class, "38")) {
          return;
       }
       if (p0 != null) {
          p0.release();
       }
       return;
    }
    public void B(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EncodeManager.class, "50")) {
          return;
       }
       PostUtils.A("EncodeManager removeListener\(\) ");
       this.b.remove(p0);
       return;
    }
    public void C(d p0,int p1){
       EncodeManager uEncodeManag = EncodeManager.class;
       if (PatchProxy.isSupport(uEncodeManag) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uEncodeManag, "51")) {
          return;
       }
       PostUtils.A("EncodeManager removeListenerAndEncodeId\(\) ");
       this.b.remove(p0);
       this.e.remove(Integer.valueOf(p1));
       return;
    }
    public final void D(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EncodeManager.class, "22")) {
          return;
       }
       if (this.i != null && p0 != null) {
          long l = System.currentTimeMillis() - p0.c();
          EncodeManager ti = this.i;
          Objects.requireNonNull(ti);
          c uoc = c.class;
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(l), ti, uoc, "3")) {
             ti.d(p0, l, 9, "", 0, 0, 0);
          }
       }
       return;
    }
    public void E(b p0,String p1,int p2){
       if (PatchProxy.isSupport(EncodeManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, EncodeManager.class, "19")) {
          return;
       }
       EncodeManager ti = this.i;
       if (ti != null && p0 != null) {
          long l = System.currentTimeMillis() - p0.c();
          Objects.requireNonNull(ti);
          if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidFourRefs(p0, p1, Long.valueOf(l), Integer.valueOf(p2), ti, c.class, "2")) {
             ti.d(p0, l, 8, p1, 0, 0, p2);
          }
       }
       return;
    }
    public final void F(b p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EncodeManager.class, "20")) {
          return;
       }
       EncodeManager ti = this.i;
       if (ti != null && p0 != null) {
          Objects.requireNonNull(ti);
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, ti, c.class, "4")) {
             ti.d(p0, 0, 1, p1, 0, 0, 0);
          }
       }
       return;
    }
    public void G(b p0,long p1,long p2,boolean p3){
       long l3;
       EncodeManager uEncodeManag = this;
       MediaEncoderParams mediaEncoder = p0;
       long l = p2;
       if (PatchProxy.isSupport(EncodeManager.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Long.valueOf(p2), Boolean.valueOf(p3), this, EncodeManager.class, "21")) {
          return;
       }
       if (uEncodeManag.i != null && mediaEncoder) {
          mediaEncoder.b(new File(p0.a().toString()));
          float f = (((float)p1 * 8.00f) / 1024.00f) / ((float)l / 1000.00f);
          long l1 = 0;
          if (!p3) {
             l1 = System.currentTimeMillis() - p0.c();
          }
          long l2 = l1;
          EncodeManager i = uEncodeManag.i;
          Objects.requireNonNull(i);
          if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, Float.valueOf(f), Long.valueOf(p2), Long.valueOf(l2), i, c.class, "1")) {
             l3 = l2;
             l1 = l;
          }else {
             l3 = l2;
             l1 = l;
             i.d(p0, l2, 7, "", f, p2, 0);
          }
          Object[] objArray = new Object[0];
          a.D().s("mfl_video", "onFinished: cost="+l3+", duration="+l1, objArray);
       }
       return;
    }
    public boolean H(int p0){
       PostWorkInfo obj;
       PostEncodeInfo encodeInfo;
       EncodeManager uEncodeManag = EncodeManager.class;
       if (PatchProxy.isSupport(uEncodeManag)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uEncodeManag, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Object[] objArray = new Object[0];
       a.D().w("EncodeManager", "retry", objArray);
       obj = this.r().g4(p0);
       if (obj != null && obj.getEncodeInfo() != null) {
          objArray = new Object[0];
          a.D().w("EncodeManager", "retry: encodeInfo inside postWorkInfo", objArray);
          encodeInfo = obj.getEncodeInfo();
       }else {
          objArray = new Object[0];
          a.D().t("EncodeManager", "retry: get encodeInfo from mInfos", objArray);
          encodeInfo = this.c.get(Integer.valueOf(p0));
       }
       if (encodeInfo == null) {
          Object[] objArray1 = new Object[0];
          a.D().t("EncodeManager", "retry: encode info is null", objArray1);
          return 0;
       }else {
          this.c(encodeInfo);
          this.I(encodeInfo);
          return true;
       }
    }
    public void I(PostEncodeInfo p0){
       VideoEncodeSDKInfo videoEncodeS;
       boolean b;
       int i1;
       EncodeManager$d uod;
       VideoEncodeSDKInfo mProject1;
       UploadConfig clientTransc;
       Object obj = this;
       int i = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(i, obj, EncodeManager.class, "58")) {
          return;
       }
       try{
          e.a().d(e.b(p0), "start_encode_task");
          if (p0.isAtlasEncode() && i.mWorkspace != null) {
             Object obj1 = obj.d.get(Integer.valueOf(p0.getId()));
             if (obj1 instanceof m0) {
                this.n().execute(obj1);
             }
          }else {
             PostEncodeInfo mVideoEncode = i.mVideoEncodeSDKInfo;
             EditorSdk2$ExportOptions obj2 = null;
             if (mVideoEncode != null) {
                VideoEncodeSDKInfo mProject = mVideoEncode.mProject;
                if (mProject != null) {
                   videoEncodeS = mProject;
                label_0051 :
                   String activityKey = p0.getActivityKey();
                   if (!p0.isDisableTranscodeDegrade()) {
                      Object[] obj3 = PatchProxy.applyOneRefs(activityKey, obj2, b0.class, "1");
                      if (obj3 != patchProxyRe) {
                         b = obj3.booleanValue();
                      }else {
                         h oh = b.a(0x36463d96).f();
                         if (oh != null) {
                            oh = oh.mFeatureConfig;
                            if (oh != null) {
                               FeatureConfig mUploadConfi = oh.mUploadConfig;
                               if (mUploadConfi != null) {
                                  clientTransc = mUploadConfi.clientTranscodeDegradeTypes;
                               label_0089 :
                                  Object[] objArray2 = new Object[0];
                                  a.D().w("EncodeDegradeUtils", "isTranscodeDegrade, degradeTypes:"+clientTransc, objArray2);
                                  if (clientTransc != null) {
                                     if (!clientTransc.contains("all")) {
                                        a uoa = (activityKey == null || !activityKey.length())? 1: null;
                                        if (!uoa) {
                                           b = clientTransc.contains(activityKey);
                                        }else if(clientTransc.contains("normal")){
                                        label_00ce :
                                           b = false;
                                        }
                                     }
                                     b = true;
                                  }
                               }
                            }
                         }
                         clientTransc = obj2;
                         goto label_0089 ;
                      }
                      if (b) {
                         b = true;
                      label_00d4 :
                         i.setTranscodeDegrade(b);
                         obj3 = new Object[0];
                         a.D().w("EncodeManager", "activityKey: "+activityKey+" , isTranscodeDegrade:"+b+" , isDisableTranscodeDegrade:"+p0.isDisableTranscodeDegrade(), obj3);
                         EditorSdk2$ExportOptions uExportOptio = new EditorSdk2$ExportOptions();
                         EditorSdk2$ExportOptions uExportOptio1 = uExportOptio;
                         obj2 = uExportOptio;
                         Object[] obj4 = PatchProxy.applyThreeRefs(uExportOptio1, p0, videoEncodeS, this, EncodeManager.class, "16");
                         if (obj4 != patchProxyRe) {
                            i1 = obj4.intValue();
                         }else {
                            i1 = -1;
                            if (videoEncodeS != null) {
                               if (p0.isTranscodeDegrade()) {
                                  Object[] objArray1 = new Object[0];
                                  a.D().w("EncodeManager", "isSkipEncode return -1, isTranscodeDegrade can\'t skip!", objArray1);
                               }else {
                                  obj.u(i, obj2);
                                  i1 = EditorSdk2UtilsV2.willTranscodeSkipWithCode(videoEncodeS, obj2);
                               }
                            }
                         }
                         String str = 0x2710;
                         if (!PatchProxy.isSupport(EncodeManager.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), i, obj, EncodeManager.class, "59")) {
                            i.mTranscodeReason = (i1)? i1: str;
                            if (!l.c("key_force_transcode", 0)) {
                               EncodeInfo mTranscodeRe = i.mTranscodeReason;
                               if (mTranscodeRe == str || (mTranscodeRe >= 1000 && EditorSdk2Utils.getEnableSkipVideoTranscode() > 0)) {
                                  b = false;
                               label_0179 :
                                  i.setIsTranscoded(b);
                               }
                            }
                            b = true;
                            goto label_0179 ;
                         }
                         Object[] objArray = new Object[0];
                         a.D().w("EncodeManager", "skip code: "+i1+" needTranscode:"+p0.isTranscoded()+",exportVersion:"+EditorSdk2Utils.getExportVersion(), objArray);
                         if (i.mTranscodeReason == str && (videoEncodeS != null && (videoEncodeS.trackAssets().isNotEmpty() && (videoEncodeS.trackAssetsSize() > 0 && (videoEncodeS.trackAssets(0) != null && (!TextUtils.x(videoEncodeS.trackAssets(0).assetPath()) && (!TextUtils.x(p0.getOutputPath()) && EditorSdk2Utils.getExportVersion() <= 1))))))) {
                            if (!PatchProxy.applyVoidTwoRefs(i, videoEncodeS, obj, EncodeManager.class, "40")) {
                               obj4 = new Object[0];
                               a.D().w("EncodeManager", "skip encode video", obj4);
                               e.a().d(e.b(p0), "skip_video_encode");
                               obj.F(this.t(p0), "skipEncodeVideo");
                               Boolean.FALSE.d(null, i, 1, Boolean.FALSE);
                               this.n().execute(new w0(i, new File(i.mVideoEncodeSDKInfo.mProject.trackAssets(0).assetPath()), (long)(EditorSdk2UtilsV2.getComputedDuration(videoEncodeS) * 0x408f400000000000)));
                            }
                         }else if(PatchProxy.applyVoidOneRefs(i, obj, EncodeManager.class, "25")){
                            obj3 = new Object[0];
                            a.D().w("EncodeManager", "encode video", obj3);
                            uod = new EncodeManager$d();
                            b uob = this.t(p0);
                            uod.c = uob;
                            String videoBufferP = p0.getVideoBufferPath();
                            PostEncodeInfo mVideoEncode1 = i.mVideoEncodeSDKInfo;
                            if (mVideoEncode1 != null) {
                               mProject1 = mVideoEncode1.mProject;
                               if (mProject1 != null) {
                               label_0279 :
                                  t ot = PatchProxy.applyTwoRefs(i, "EncodeManager", null, e.class, "1");
                                  if (ot != patchProxyRe) {
                                  }else {
                                     a.p(i, "encodeInfo");
                                     a.p("EncodeManager", "postLoggerTag");
                                     ot = t.just(String.valueOf(p0.getId())).subscribeOn(d.c).map(new d("EncodeManager", i)).timeout(0x7530, TimeUnit.MILLISECONDS);
                                     a.o(ot, "Observable.just\(encodeIn¡­T, TimeUnit.MILLISECONDS\)");
                                  }
                                  ot.doFinally(new r(obj, i, uod, mProject1)).subscribe(new j0(i), new k0(i));
                               }
                            }
                            String[] stringArray = new String[]{videoBufferP};
                            mProject1 = EditorSdk2UtilsV2.createProjectWithFileArray(stringArray);
                            goto label_0279 ;
                         }
                      }
                   }
                   b = false;
                   goto label_00d4 ;
                }
             }
             videoEncodeS = obj2;
             goto label_0051 ;
          }
       }catch(java.lang.Exception e0){
          k1.o(new e0(obj, i, e0, uod));
       }
       return;
    }
    public final void J(EditorSdk2$ExportOptions p0,int p1,int p2){
       Object[] objArray;
       BenchmarkEncodeProfile this;
       EditorSdk2$ExportOptions uExportOptio = p0;
       int i = p1;
       int i1 = p2;
       if (PatchProxy.isSupport(EncodeManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, EncodeManager.class, "11")) {
          return;
       }
       String str = "EncodeManager";
       int i2 = 0;
       if (!p0.openUploadDecision()) {
          objArray = new Object[i2];
          a.D().w(str, "HEVC export, upload decision close Not Support", objArray);
          return;
       }else {
          ClipDPHardwareConfigManager instance = ClipDPHardwareConfigManager.getInstance();
          this = BenchmarkEncodeProfile.MAIN;
          if (!instance.isSupportEncode(a.a().a(), "avc", Math.max(p1, p2), 0, true, this, 2)) {
             objArray = new Object[i2];
             a.D().w(str, "HEVC export, avc encoder Not Support", objArray);
             return;
          }else if(!instance.isSupportEncode(a.a().a(), "hevc", Math.max(p1, p2), 0, true, this, 2)){
             objArray = new Object[i2];
             a.D().w(str, "HEVC export, hevc encoder Not Support", objArray);
             return;
          }else {
             String str1 = "HEVC export, profile : ";
             if (EncodeManager.f() && p0.openEncodeAnalyze()) {
                Object[] objArray1 = new Object[i2];
                a.D().w(str, "HEVC export, cape mode", objArray1);
                int i3 = 7;
                DPHardwareConfigManager$EncodeResult uEncodeResul = instance.isSupportEncodeWithResult(a.a().a(), "hevc", Math.max(p1, p2), 0, true, this, 2);
                if (uEncodeResul != null && uEncodeResul.isSupport != null) {
                   objArray = new Object[i2];
                   a.D().w(str, str1+uEncodeResul.profile, objArray);
                   uExportOptio.setVideoEncoderType(i3);
                   uExportOptio.setHevcProfile(uEncodeResul.profile);
                   uExportOptio.setEnableCapeHevcModel(true);
                   return;
                }
             }else {
                String str2 = 7;
             }
             double d = EncodeManager.g();
             double d1 = 0;
             if (d - d1 > 0) {
                Object[] objArray2 = new Object[i2];
                a.D().w(str, "HEVC export, speed ratio mode", objArray2);
                int i4 = 5;
                double encodeSpeedB = instance.getEncodeSpeedBySize(i4, "hevc", i, i1);
                BenchmarkEncodeProfile uBenchmarkEn = this;
                double encodeSpeedB1 = instance.getEncodeSpeedBySize(i4, "avc", i, i1);
                if (encodeSpeedB1 - d1 > 0) {
                   d1 = encodeSpeedB / encodeSpeedB1;
                }
                i4 = 0;
                objArray2 = new Object[i4];
                a.D().w(str, "HEVC export, hevcEncodeSpeed : "+encodeSpeedB+" avcEncodeSpeed : "+encodeSpeedB1+" ratioOfHevcToAvc : "+d1, objArray2);
                if (d1 - d < 0) {
                   objArray = new Object[i4];
                   a.D().w(str, "HEVC export, hevc speed lower NotSupport", objArray);
                   return;
                }else {
                   DPHardwareConfigManager$EncodeResult uEncodeResul1 = instance.isSupportEncodeWithResult(a.a().a(), "hevc", Math.max(p1, p2), (float)(encodeSpeedB1 * d), true, uBenchmarkEn, 2);
                   if (uEncodeResul1 != null && uEncodeResul1.isSupport != null) {
                      Object[] objArray3 = new Object[0];
                      a.D().w(str, str1+uEncodeResul1.profile, objArray3);
                      uExportOptio.setVideoEncoderType(7);
                      uExportOptio.setHevcProfile(uEncodeResul1.profile);
                   }
                }
             }
          label_0199 :
             return;
          }
       }
    }
    public final void K(PostEncodeInfo p0,EditorSdk2$ExportOptions p1){
       Object[] objArray1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EncodeManager.class, "14")) {
          return;
       }
       if (!p0.isOverrideParams()) {
          return;
       }
       int i = 0;
       if (p0.isTranscodeDegrade()) {
          Object[] objArray = new Object[i];
          a.D().w("EncodeManager", "it is transcodeDegrade, setOverrideParams is invalid", objArray);
          return;
       }else if(!TextUtils.x(p0.mEncodeParams.mX264Params)){
          objArray1 = new Object[i];
          a.D().w("EncodeManager", "set x264Params: "+p0.mEncodeParams.mX264Params, objArray1);
          p1.setX264Params(p0.mEncodeParams.mX264Params);
       }
       if (!TextUtils.x(p0.mEncodeParams.mX264Preset)) {
          objArray1 = new Object[i];
          a.D().w("EncodeManager", "set x264Preset: "+p0.mEncodeParams.mX264Preset, objArray1);
          p1.setX264Preset(p0.mEncodeParams.mX264Preset);
       }
       if (!TextUtils.x(p0.mEncodeParams.mAudioProfile)) {
          objArray1 = new Object[i];
          a.D().w("EncodeManager", "set audioProfile: "+p0.mEncodeParams.mAudioProfile, objArray1);
          p1.setAudioProfile(p0.mEncodeParams.mAudioProfile);
       }
       if (p0.mEncodeParams.mVideoBitrate > null) {
          objArray1 = new Object[i];
          a.D().w("EncodeManager", "set videoBitrate: "+p0.mEncodeParams.mVideoBitrate, objArray1);
          p1.setVideoBitrate((long)p0.mEncodeParams.mVideoBitrate);
       }
       if (p0.mEncodeParams.mVideoGopSize > null) {
          Object[] objArray2 = new Object[i];
          a.D().w("EncodeManager", "set videoGopSize: "+p0.mEncodeParams.mVideoGopSize, objArray2);
          p1.setVideoGopSize(p0.mEncodeParams.mVideoGopSize);
       }
       return;
    }
    public boolean L(int p0,boolean p1){
       Iterator obj;
       PostEncodeInfo postEncodeIn;
       EncodeManager uEncodeManag = EncodeManager.class;
       if (PatchProxy.isSupport(uEncodeManag)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uEncodeManag, "47");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.c.values().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          postEncodeIn = obj.next();
          if (postEncodeIn.getId() == p0) {
             break ;
          }
       }
       postEncodeIn.mHidden = p1 ^ 1;
       this.z(postEncodeIn);
       return 1;
    }
    public int a(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EncodeManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Object[] objArray = new Object[0];
       a.D().s("EncodeManager", "add mId: "+this.a, objArray);
       PostEncodeInfo postEncodeIn = p0.toEncodeInfo(this.a);
       this.a = this.a + 1;
       this.c(postEncodeIn);
       return postEncodeIn.getId();
    }
    public void b(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EncodeManager.class, "48")) {
          return;
       }
       PostUtils.A("EncodeManager addListener\(\) ");
       this.b.add(p0);
       return;
    }
    public void c(PostEncodeInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EncodeManager.class, "23")) {
          return;
       }
       a.u();
       this.j = b.c();
       p0.mStatus = EncodeInfo$Status.PENDING;
       p0.mProgress = 0;
       this.c.put(Integer.valueOf(p0.getId()), p0);
       if (p0.isAtlasEncode() && p0.mWorkspace != null) {
          this.d.put(Integer.valueOf(p0.getId()), new j(p0, new EncodeManager$a(this)));
       }
       this.z(p0);
       return;
    }
    public boolean d(int p0,int p1){
       PostEncodeInfo obj;
       EncodeManager uEncodeManag = EncodeManager.class;
       if (PatchProxy.isSupport(uEncodeManag)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uEncodeManag, "44");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 1;
       Object[] objArray = new Object[i];
       int i1 = 0;
       objArray[i1] = " trigger:"+p1;
       a.D().w("EncodeManager", "cancel: id:"+p0, objArray);
       obj = this.c.remove(Integer.valueOf(p0));
       if (obj == null) {
          PostWorkInfo postWorkInfo = this.r().g4(p0);
          if (postWorkInfo != null) {
             obj = postWorkInfo.getEncodeInfo();
          }
       }
       if (obj != null) {
          obj.mStatus = EncodeInfo$Status.CANCELED;
          this.z(obj);
          i1 = 1;
       }
       boolean b = this.d.get(Integer.valueOf(p0));
       if (b instanceof EncodeManager$d) {
          b.a = i;
          if (b.b != null && obj != null) {
             if (PostExperimentUtils.L()) {
                c.a(new f0(this, b));
             }else {
                b.b.cancel();
                this.D(b.c);
             }
          }else {
          label_00b6 :
             i = i1;
          }
       }else if(b instanceof m0){
          b.a(p1);
       }else {
          goto label_00b6 ;
       }
       return i;
    }
    public boolean e(int p0){
       EncodeManager uEncodeManag = EncodeManager.class;
       if (PatchProxy.isSupport(uEncodeManag)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uEncodeManag, "52");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.e.contains(Integer.valueOf(p0));
    }
    public final EditorSdk2$ExportOptions h(PostEncodeInfo p0,EditorSdk2V2$VideoEditorProject p1){
       String str;
       String audioProfile;
       int audioBitrate;
       int audioCutoff;
       String str2;
       String str3;
       int i;
       int i1;
       PatchProxyResult patchProxyRe1;
       GSConfig gSConfig1;
       EditorSdk2$ExportOptions uExportOptio1;
       Object[] objArray2;
       boolean b;
       long l;
       Object[] objArray4;
       String str4;
       int i3;
       int i4;
       Object obj = this;
       Object obj1 = p0;
       Object[] obj2 = p1;
       GSConfig gSConfig = GSConfig.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, EncodeManager.class, "13");
       if (obj3 != patchProxyRe) {
          return obj3;
       }
       try{
          EditorSdk2$ExportOptions uExportOptio = EditorSdk2Utils.createDefaultExportOptions();
          a0.e(obj1, uExportOptio);
          obj3 = p0.getComment();
          uExportOptio.setComment(obj3);
          uExportOptio.setVideoType(obj3.b(p0));
          str = "veryfast";
          EncodeConfig$ComplexEncodeProfile properComple = p0.getProperComplexEncodeProfile();
          EditorSdk2$ExportOptions mVExportOpti = EditorSdk2Utils.getMVExportOptionsNativeOptions(p0.getTemplateGrade(), true);
          String str1 = "";
          if (p0.isTranscodeDegrade()) {
             DegradeEncodeConfig uDegradeEnco = b0.a();
             str = uDegradeEnco.getX264Params();
             String x264Preset = uDegradeEnco.getX264Preset();
             audioProfile = uDegradeEnco.getAudioProfile();
             audioBitrate = uDegradeEnco.getAudioBitrate();
             audioCutoff = uDegradeEnco.getAudioCutoff();
             Object[] objArray = new Object[0];
             a.D().w("EncodeManager", "needTranscode, config:"+uDegradeEnco.toString(), objArray);
             str2 = str1;
             obj3 = audioProfile;
             audioProfile = x264Preset;
          }else if(p0.isKtvMv()){
             KtvMvEncodeConfig ktvMvEncodeC = l.c();
             str = ktvMvEncodeC.l();
             str2 = ktvMvEncodeC.m();
             str3 = ktvMvEncodeC.c();
             i = ktvMvEncodeC.a();
             audioCutoff = ktvMvEncodeC.b();
             audioProfile = str2;
             obj3 = str3;
             audioBitrate = i;
          }else if(p0.isPhotoMovie()){
             PhotoMovieEncodeConfig photoMovieEn = l.e();
             str2 = photoMovieEn.getX264Params();
             str3 = photoMovieEn.getAudioProfile();
             i = photoMovieEn.getAudioBitrate();
             i1 = photoMovieEn.getAudioCutoff();
             int count = p0.getCount();
             audioProfile = str;
             PostEncodeInfo mVideoEncode = obj1.mVideoEncodeSDKInfo;
             if (mVideoEncode != null) {
                VideoEncodeSDKInfo mProject = mVideoEncode.mProject;
                if (mProject != null && !count) {
                   str = str3;
                   i3 = i;
                   count = (int)(EditorSdk2UtilsV2.getComputedDuration(mProject) + 0x3ff0000000000000) / 2;
                label_00e6 :
                   if (count && count <= 16) {
                      i4 = 23;
                   }else {
                      count = 4;
                      i4 = 26;
                   }
                   String str5 = str;
                   if (!TextUtils.x(str2)) {
                      i = 2;
                      objArray2 = new Object[i];
                      objArray2[0] = Integer.valueOf(count);
                      objArray2[1] = Integer.valueOf(i4);
                      str = String.format(str2, objArray2);
                   label_0116 :
                      audioCutoff = i1;
                      obj3 = str5;
                      audioBitrate = i3;
                   }
                }
             }
             str = str3;
             i3 = i;
             goto label_00e6 ;
          }else {
             audioProfile = str;
             obj3 = obj.j.getAudioProfile();
             audioBitrate = obj.j.getAudioBitrate();
             audioCutoff = obj.j.getAudioCutoff();
             if (p0.useTemplateGrade() && p0.getTemplateGrade() > 0) {
                if (mVExportOpti != null && !TextUtils.x(mVExportOpti.x264Params())) {
                   str = mVExportOpti.x264Params();
                   str2 = mVExportOpti.x264Params();
                }else {
                   str = obj.j.getX264Params();
                   str2 = str1;
                }
                if (mVExportOpti != null) {
                   str3 = (!TextUtils.x(mVExportOpti.x264Preset()))? mVExportOpti.x264Preset(): audioProfile;
                   if (!TextUtils.x(mVExportOpti.audioProfile())) {
                      obj3 = mVExportOpti.audioProfile();
                   }
                   audioProfile = obj3;
                   if (mVExportOpti.audioBitrate() > 0) {
                      audioBitrate = (int)mVExportOpti.audioBitrate();
                   }
                   if (mVExportOpti.audioCutoff() > 0) {
                      audioCutoff = mVExportOpti.audioCutoff();
                   }
                   if (mVExportOpti.videoBitrate() > 0) {
                      uExportOptio.setVideoBitrate(mVExportOpti.videoBitrate());
                   }
                   if (mVExportOpti.videoGopSize() > 0) {
                      uExportOptio.setVideoGopSize(mVExportOpti.videoGopSize());
                   }
                   obj3 = audioProfile;
                   audioProfile = str3;
                }
             }else if(obj1.mIsImport != null){
                str2 = GSConfig.e(true);
                if (PatchProxy.isSupport(gSConfig)) {
                   str = PatchProxy.applyOneRefs(Boolean.TRUE, null, gSConfig, "16");
                   if (str != patchProxyRe) {
                   }else if(GSConfig.c().getImportEncodeConfig() != null){
                      str = GSConfig.c().getImportEncodeConfig().getX264Preset(true);
                   }else {
                      str = GSConfig.a.getX264Preset(true);
                   }
                }else {
                   goto label_01da ;
                }
                patchProxyRe1 = patchProxyRe;
                str3 = str1;
                i = audioBitrate;
                i1 = audioCutoff;
             label_0223 :
                if (!TextUtils.x(obj.j.getHdExportParams()) && (p0.isSupportHdExport() && p0.isHdExport())) {
                   gSConfig1 = gSConfig;
                   uExportOptio1 = mVExportOpti;
                   Object[] objArray1 = new Object[0];
                   a.D().w("EncodeManager", "hdExport params: "+obj.j.getHdExportParams(), objArray1);
                   uExportOptio.setHdExport(true);
                   uExportOptio.setHdExportParams(obj.j.getHdExportParams());
                }else {
                   gSConfig1 = gSConfig;
                   uExportOptio1 = mVExportOpti;
                   uExportOptio.setHdExport(false);
                   uExportOptio.setHdExportParams(str1);
                }
                uExportOptio.setX264Params(str2);
                uExportOptio.setX264Preset(str);
                if (!TextUtils.x(p0.getComment())) {
                   uExportOptio.setComment(p0.getComment());
                }
                if (!TextUtils.x(obj3)) {
                   uExportOptio.setAudioProfile(obj3);
                }
                if (i > 0) {
                   uExportOptio.setAudioBitrate((long)i);
                }
                if (i1 >= 0) {
                   uExportOptio.setAudioCutoff(i1);
                }
                obj.u(obj1, uExportOptio);
                if (p0.isKtvSinglePicSong()) {
                   uExportOptio.setSeparateAudioTrack(true);
                   uExportOptio.setSeparateAudioTrackPath(p0.getAudioOutputPath());
                }
                if (p0.isKtvSinglePicSong() || p0.isSinglePicture()) {
                   uExportOptio.setSingleImageQuality(DraftFileManager.l);
                }
                if (b.a(-2001546430).b(obj1, null)) {
                   objArray2 = new Object[0];
                   a.D().w("EncodeManager", "generateOption isPipelineSupported", objArray2);
                   uExportOptio.setComment(uExportOptio.comment()+"[pipeline]");
                   obj3 = (properComple != null && !TextUtils.x(properComple.getPipelineX264Params()))? properComple.getPipelineX264Params(): obj.j.getPipelineX264Params();
                   if (!TextUtils.x(obj3)) {
                      uExportOptio.setX264Params(obj3);
                   }else {
                      uExportOptio.setX264Params("cabac=1:mixed-refs=0:rc-lookahead=10:ref=1:subme=2:trellis=0:weightp=1:crf=15:qpmin=0:qpmax=69:merange=16:me=hex:scenecut=0:ipratio=1.4:qcomp=0.6:keyint=150:bframes=3:open-gop=0:vbv_maxrate=5000:vbv_bufsize=10000:threads=6:mbtree=1:analyse=i4x4,i8x8,p8x8,b8x8");
                   }
                   if (!TextUtils.x(str3)) {
                      uExportOptio.setX264Params(str3);
                      objArray2 = new Object[0];
                      a.D().w("EncodeManager", "generateOption mvx264Params", objArray2);
                   }
                   uExportOptio.setOutputFormat(2);
                   uExportOptio.setFmp4IncreasingFragStr(d0.i(obj2, this.r().h4(obj1, null)));
                   if (PostExperimentUtils.h()) {
                      objArray2 = new Object[0];
                      a.D().w("EncodeManager", "open byteStreamEncode kb:"+PostExperimentUtils.f0(), objArray2);
                      b = true;
                      uExportOptio.setEnableMp4ByteStreamUpload(b);
                      uExportOptio.setMp4ByteStreamUploadSizeKb((int)PostExperimentUtils.f0());
                      uExportOptio.setOutputFormat(b);
                      uExportOptio.setNoFastStart(b);
                   }else {
                      uExportOptio.setNoFastStart(a.t().d("editorExportDisableFastStart", false));
                   }
                }
                if (a0.f(obj1.mWorkspace, obj2, p0.getEncodedWidth(), p0.getEncodedHeight(), obj1.mIsVisionEngineLoadedSuccess)) {
                   Object[] objArray3 = new Object[0];
                   a.D().w("EncodeManager", "enable encode analyze", objArray3);
                   uExportOptio.setOpenEncodeAnalyze(true);
                }
                if (a0.g()) {
                   uExportOptio.setOpenUploadDecision(true);
                }
                EncodeConfig uEncodeConfi = (GSConfig.c() != null && GSConfig.c().getImportEncodeConfig() != null)? 1: null;
                l = 0x7a1200;
                int i2 = 250;
                if (p0.useTemplateGrade() && p0.getTemplateGrade() > 0) {
                   uExportOptio.setVideoGopSize(i2);
                   uExportOptio.setVideoBitrate(l);
                   if (uEncodeConfi) {
                      uExportOptio.setVideoGopSize(GSConfig.c().getImportEncodeConfig().mVideoGopSize);
                      uExportOptio.setVideoBitrate(GSConfig.c().getImportEncodeConfig().mVideoBitrate);
                   }
                   if (uExportOptio1 != null) {
                      if (uExportOptio1.videoBitrate() > 0) {
                         uExportOptio.setVideoBitrate(uExportOptio1.videoBitrate());
                      }
                      if (uExportOptio1.videoGopSize() > 0) {
                         uExportOptio.setVideoGopSize(uExportOptio1.videoGopSize());
                      }
                   }
                }else if(p0.isTranscodeDegrade()){
                   DegradeEncodeConfig uDegradeEnco1 = b0.a();
                   uExportOptio.setVideoGopSize(uDegradeEnco1.getVideoGopSize());
                   uExportOptio.setVideoBitrate(uDegradeEnco1.getVideoBitrate());
                }else if(p0.isEncode1080p() && p0.isVideo()){
                   uExportOptio.setVideoBitrate(0xa7d8c0);
                   uExportOptio.setVideoGopSize(i2);
                   if (uEncodeConfi != null) {
                      uExportOptio.setVideoGopSize(GSConfig.c().getImportEncodeConfig().mVideoGopSize1080p);
                      uExportOptio.setVideoBitrate(GSConfig.c().getImportEncodeConfig().mVideoBitrate1080p);
                   }
                   if (PatchProxy.isSupport(gSConfig1)) {
                      str4 = PatchProxy.applyOneRefs(Boolean.TRUE, null, gSConfig1, "15");
                      if (str4 != patchProxyRe1) {
                      }else if(GSConfig.c().getImportEncodeConfig() != null){
                         str4 = GSConfig.c().getImportEncodeConfig().getX264Params1080p(true);
                      }else {
                         str4 = GSConfig.a.getX264Params1080p(true);
                      }
                   }else {
                      goto label_048a ;
                   }
                   if (str4 != null && str4.length() > 0) {
                      Object[] objArray5 = new Object[0];
                      a.D().w("EncodeManager", "encode at 1080p, use x264Param1080p", objArray5);
                      uExportOptio.setX264Params(str4);
                   }
                   if (this.v()) {
                      uExportOptio.setVideoEncoderType(5);
                   }
                }else {
                   uExportOptio.setVideoGopSize(i2);
                   uExportOptio.setVideoBitrate(l);
                   if (uEncodeConfi != null) {
                      uExportOptio.setVideoGopSize(GSConfig.c().getImportEncodeConfig().mVideoGopSize);
                      uExportOptio.setVideoBitrate(GSConfig.c().getImportEncodeConfig().mVideoBitrate);
                   }
                }
                if (p0.getExtraInfoInSEI() != null && p0.getExtraInfoInSEI().length > 0) {
                   objArray4 = new Object[0];
                   a.D().w("EncodeManager", "generateOption\(\) write SEI info ", objArray4);
                   uExportOptio.setHiddenUserInfo(p0.getExtraInfoInSEI());
                }
                objArray4 = new Object[0];
                a.D().w("EncodeManager", "HEVC export, it is transcodeDegraded:"+p0.isTranscodeDegrade(), objArray4);
                if (!p0.isTranscodeDegrade()) {
                   obj.J(uExportOptio, p0.getEncodedWidth(), p0.getEncodedHeight());
                }
                if (uEncodeConfi) {
                   uExportOptio.setExport60FpsOptimize(GSConfig.c().getImportEncodeConfig().getExport60fpsOptimize());
                   uExportOptio.setExport60FpsOptimizeParams(GSConfig.c().getImportEncodeConfig().getExport60fpsOptimizeParams());
                }
                obj.K(obj1, uExportOptio);
                obj3 = g.c0();
                if (!TextUtils.x(obj3)) {
                   String[] stringArray = obj3.split(",");
                   i2 = 1;
                   if (stringArray.length == i2 && ("sw").equals(stringArray[0])) {
                      uExportOptio.setVideoEncoderType(i2);
                   }else if(stringArray.length >= 2){
                      if (("mediacodec").equals(stringArray[0])) {
                         if (("hevc").equals(stringArray[1])) {
                            uExportOptio.setVideoEncoderType(7);
                         }else {
                            uExportOptio.setVideoEncoderType(5);
                         }
                      }else {
                         uExportOptio.setVideoEncoderType(0);
                      }
                   }
                   uExportOptio.setOpenUploadDecision(false);
                }
                if (p0.getEncodedWidth() > 0 && p0.getEncodedHeight() > 0) {
                   uExportOptio.setWidth(p0.getEncodedWidth());
                   uExportOptio.setHeight(p0.getEncodedHeight());
                   obj2 = new Object[0];
                   a.D().w("EncodeManager", "exportOptions.width\(\):"+uExportOptio.width()+",exportOptions.height\(\):"+uExportOptio.height(), obj2);
                }
                return uExportOptio;
             }else if(properComple != null && !TextUtils.x(properComple.getX264Params())){
                str = properComple.getX264Params();
             }else {
                str = obj.j.getX264Params();
             }
          }
          str2 = str1;
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          throw new RuntimeException(e0);
       }catch(java.util.IllegalFormatException e0){
          i1.c(e0);
       }
       str = str2;
       goto label_0116 ;
          str3 = str2;
          i = audioBitrate;
          i1 = audioCutoff;
          str2 = str;
          str = audioProfile;
          patchProxyRe1 = patchProxyRe;
          goto label_0223 ;
    }
    public final EditorSdk2$ExportOptions i(PostEncodeInfo p0,EditorSdk2V2$VideoEditorProject p1){
       UploadInfo uploadInfo1;
       boolean b6;
       int i2;
       boolean b7;
       Object obj = this;
       String obj1 = p0;
       EncodeConfig obj2 = p1;
       EditorSdk2$ExportOptions obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, EncodeManager.class, "12");
       if (obj3 != PatchProxyResult.class) {
          return obj3;
       }
       Object[] objArray = new Object[0];
       String str = "EncodeManager";
       a.D().w(str, "try to use DeliveryParamsManager!", objArray);
       int b = EncodeManager.f();
       double d = EncodeManager.g();
       boolean b1 = a0.g();
       int encodedWidth = p0.getEncodedWidth();
       int encodedHeigh = p0.getEncodedHeight();
       int count = p0.getCount();
       int i = -2001546430;
       UploadInfo uploadInfo = null;
       boolean b2 = b.a(i).b(obj1, uploadInfo);
       boolean b3 = p0.isTranscodeDegrade();
       boolean b4 = p0.isVideo();
       boolean b5 = true;
       if (p0.isSupportHdExport() && p0.isHdExport()) {
          uploadInfo1 = uploadInfo;
          b6 = true;
       }else {
          uploadInfo1 = uploadInfo;
          b6 = false;
       }
       DeliveryParamsManager$EncodeAdditionalInfo uEncodeAddit = new DeliveryParamsManager$EncodeAdditionalInfo(b, d, b1, encodedWidth, encodedHeigh, count, b2, b3, b4, false, b6);
       int i1 = obj.b(p0);
       if (p0.useTemplateGrade() && p0.getTemplateGrade() <= 0) {
          i1 = 50;
       }
       obj3 = this.j().getExportOptions(i1, obj3, obj2);
       if (obj3 != null) {
          if (!TextUtils.x(p0.getComment())) {
             obj3.setComment(p0.getComment());
          }
          if (obj3.skipTranscodeConfig() == null || !obj3.skipTranscodeConfig().enabled()) {
             obj.u(obj1, obj3);
          }
          if (p0.isKtvSinglePicSong()) {
             obj3.setSeparateAudioTrack(b5);
             obj3.setSeparateAudioTrackPath(p0.getAudioOutputPath());
          }
          if (b.a(i).b(obj1, uploadInfo1)) {
             obj3.setComment(obj3.comment()+"[pipeline]");
             obj3.setOutputFormat(2);
             obj3.setFmp4IncreasingFragStr(d0.i(obj2, this.r().h4(obj1, uploadInfo1)));
             if (PostExperimentUtils.h()) {
                b = 0;
                Object[] objArray1 = new Object[b];
                a.D().w(str, "open byteStreamEncode kb:"+PostExperimentUtils.f0(), objArray1);
                obj3.setEnableMp4ByteStreamUpload(b5);
                obj3.setMp4ByteStreamUploadSizeKb((int)PostExperimentUtils.f0());
                obj3.setOutputFormat(b5);
                obj3.setNoFastStart(b5);
             }else {
                b = false;
                obj3.setNoFastStart(a.t().d("editorExportDisableFastStart", b));
             }
          }else {
             b = 0;
          }
          if (a0.f(obj1.mWorkspace, obj2, p0.getEncodedWidth(), p0.getEncodedHeight(), obj1.mIsVisionEngineLoadedSuccess)) {
             objArray = new Object[b];
             a.D().w(str, "enable encode analyze", objArray);
             obj3.setOpenEncodeAnalyze(b5);
          }
          if (a0.g()) {
             obj3.setOpenUploadDecision(b5);
          }
          if (!TextUtils.x(obj.j.getHdExportParams()) && (p0.isSupportHdExport() && p0.isHdExport())) {
             i2 = 0;
             Object[] objArray2 = new Object[i2];
             a.D().w(str, "hdExport params: "+obj.j.getHdExportParams(), objArray2);
             obj3.setHdExport(b5);
             obj3.setHdExportParams(obj.j.getHdExportParams());
          }else {
             i2 = false;
             obj3.setHdExport(i2);
             obj3.setHdExportParams("");
          }
          if (p0.getExtraInfoInSEI() != null && p0.getExtraInfoInSEI().length > 0) {
             objArray = new Object[i2];
             a.D().w(str, "generateOption\(\) write SEI info ", objArray);
             obj3.setHiddenUserInfo(p0.getExtraInfoInSEI());
          }
          obj2 = (GSConfig.c() != null)? 1: null;
          if (obj2 && GSConfig.c().getImportEncodeConfig() != null) {
             obj3.setExport60FpsOptimize(GSConfig.c().getImportEncodeConfig().getExport60fpsOptimize());
             obj3.setExport60FpsOptimizeParams(GSConfig.c().getImportEncodeConfig().getExport60fpsOptimizeParams());
          }
          obj.K(obj1, obj3);
          if (obj3.enableFallbackToLowResolution()) {
             i = 0;
             Object[] objArray3 = new Object[i];
             a.D().w(str, "4k export not support hd param, cape analyze, upload decision. close...", objArray3);
             obj3.setHdExport(i);
             obj3.setOpenUploadDecision(i);
             obj3.setOpenEncodeAnalyze(i);
             obj3.setVideoEncoderType(5);
          }else {
             i = 0;
          }
          obj1 = g.c0();
          if (!TextUtils.x(obj1)) {
             String[] stringArray = obj1.split(",");
             if (stringArray.length == b5 && ("sw").equals(stringArray[i])) {
                obj3.setVideoEncoderType(b5);
             }else if(stringArray.length >= 2){
                if (("mediacodec").equals(stringArray[i])) {
                   if (("hevc").equals(stringArray[b5])) {
                      obj3.setVideoEncoderType(7);
                   }else {
                      obj3.setVideoEncoderType(5);
                   }
                }else {
                   obj3.setVideoEncoderType(0);
                label_0270 :
                   obj3.setOpenUploadDecision(b7);
                }
             }
             b7 = false;
             goto label_0270 ;
          }
       }
       return obj3;
    }
    public DeliveryParamsManager j(){
       Object obj = PatchProxy.apply(null, this, EncodeManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.g == null) {
          this.g = new DeliveryParamsManager(a.a().a());
       }
       return this.g;
    }
    public PostEncodeInfo k(int p0){
       EncodeManager uEncodeManag = EncodeManager.class;
       if (PatchProxy.isSupport(uEncodeManag)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uEncodeManag, "46");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.c.get(Integer.valueOf(p0));
    }
    public final EditorSdk2V2$VideoEditorProject l(EditorSdk2V2$VideoEditorProject p0,PostEncodeInfo p1){
       Throwable throwable;
       int i;
       EditorSdk2V2$VideoEditorProject obj = PatchProxy.applyTwoRefs(p0, p1, this, EncodeManager.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          boolean b = false;
          obj = (p0.animatedSubAssets() == null)? null: p0.animatedSubAssetsSize();
          EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub = d.b(p0.animatedSubAssets().toNormalArray(), b);
          if (uAnimatedSub != null) {
             b = uAnimatedSub.length;
          }
          try{
             if (b != obj) {
                obj = p0.clone();
                obj.setAnimatedSubAssets(uAnimatedSub);
             label_0039 :
                if (p1.isKtvSinglePicSong()) {
                   p1.mOriginProject = p0.clone();
                   KtvEditUtils.d(p0);
                }
             }else {
                obj = p0;
                goto label_0039 ;
             }
             return obj;
          }catch(java.lang.Exception e4){
          }
          a.D().e("EncodeManager", "filt Interact Sticker", throwable);
          goto label_005b ;
       }catch(java.lang.Exception e5){
          obj = p0;
          throwable = e5;
          goto label_0050 ;
       }
    }
    public File m(){
       Object obj = PatchProxy.apply(null, this, EncodeManager.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1504323719).h(".encoding_output_path");
    }
    public final Executor n(){
       Object obj = PatchProxy.apply(null, this, EncodeManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.a().c()) {
          k1.d();
       }
       if (this.h == null) {
          Object[] objArray = new Object[0];
          a.D().w("EncodeManager", "init Executor", objArray);
          this.h = c.f("encode-manager");
       }
       return this.h;
    }
    public final EditorSdk2$Rational p(){
       Object obj = PatchProxy.apply(null, this, EncodeManager.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorSdk2Utils.createRational(20, 1);
    }
    public x0 q(){
       Object obj = PatchProxy.apply(null, this, EncodeManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f == null) {
          this.f = b.a(-2001546430);
       }
       return this.f;
    }
    public final a r(){
       Object obj = PatchProxy.apply(null, this, EncodeManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-273232199).a20();
    }
    public Map s(){
       return this.d;
    }
    public b t(PostEncodeInfo p0){
       b obj = PatchProxy.applyOneRefs(p0, this, EncodeManager.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       obj.s = p0.mSessionId;
       obj.u = System.currentTimeMillis();
       obj.t = 17;
       obj.b = p0.getFrameIntervalMs();
       obj.c = p0.getForegroundAudioPath();
       obj.p = p0.getForegroundAudioClipStartTime();
       obj.q = p0.getForegroundAudioClipEndTime();
       obj.d = p0.getBackgroundAudioPath();
       obj.k = p0.isBackgroundAudioRepeat();
       obj.e = p0.getForegroundAudioVolume();
       obj.f = p0.getBackgroundAudioVolume();
       obj.b(new File(p0.getOutputPath()));
       obj.h = p0.getComment();
       obj.i = p0.getCount();
       obj.m = p0.isKtvMv();
       obj.l = p0.isPhotoMovie();
       obj.o = p0.mTranscodeReason;
       return obj;
    }
    public final void u(PostEncodeInfo p0,EditorSdk2$ExportOptions p1){
       EncodeConfig uEncodeConfi;
       Object[] objArray2;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EncodeManager.class, "17")) {
          return;
       }
       String str = "EncodeManager";
       int i = 0;
       if (p0.isTranscodeDegrade()) {
          Object[] objArray = new Object[i];
          a.D().w(str, "it is transcodeDegrade, can\'t init SkipTranscodingConfig", objArray);
          return;
       }else {
          p1.setVideoType(patchProxyRe.b(p0));
          if (p0.isLongVideo()) {
             uEncodeConfi = PatchProxy.apply(null, null, l.class, "1");
             if (uEncodeConfi != patchProxyRe) {
             }else {
                uEncodeConfi = a.w(EncodeConfig.class);
             }
          }else {
             uEncodeConfi = b.c();
          }
          Object[] objArray1 = (uEncodeConfi == null)? null: uEncodeConfi.getSkipTranscodeConfig();
          if (!p0.isLongVideo() && p0.getProperComplexEncodeProfile() != null) {
             objArray2 = new Object[i];
             a.D().w(str, "isSkipEncode use ComplexEncodeProfile", objArray2);
             objArray1 = p0.getProperComplexEncodeProfile().getSkipEncodeConfig();
             if (objArray1 == null) {
                objArray1 = new Object[i];
                a.D().w(str, "isSkipEncode use ComplexEncodeProfile with null skipConfig", objArray1);
                objArray1 = new EncodeConfig$SkipTranscodingConfig();
             }
          }else {
             a uoa = a.D();
             Object[] objArray3 = new Object[1];
             String str1 = (p0.isLongVideo())? "long": "normal";
             objArray3[i] = str1;
             objArray3 = new Object[i];
             uoa.w(str, String.format("isSkipEncode use skipConfig in %s video EncodeConfig", objArray3), objArray3);
          }
          if (objArray1 != null) {
             objArray2 = new Object[i];
             a.D().w(str, "skipTranscodingConfig is not null", objArray2);
             p1.setSkipTranscodeConfig(new EditorSdk2$ProtoSkipTranscodeConfig());
             p1.skipTranscodeConfig().setEnabled(objArray1.isEnabled());
             p1.skipTranscodeConfig().setMaxBytes(objArray1.getMaxBytes());
             p1.skipTranscodeConfig().setEnableUploadDecision(f.a("enableDynamicSkipEncAndr"));
             p1.skipTranscodeConfig().setUploadDecisionMaxBytes(((f.b("skipEncodeMaxSizeMB", Integer.class, Integer.valueOf(1000)).intValue() * 1000) * 1000));
             p1.skipTranscodeConfig().setSupportAdvancedColorspace(objArray1.isSupportAdvancedColorSpace());
             EditorSdk2$ProtoSkipTranscodeConfig protoSkipTra = p1.skipTranscodeConfig();
             p1 = PatchProxy.apply(null, null, a.class, "32");
             if (p1 != patchProxyRe) {
                b = p1.booleanValue();
             }else {
                ClipKitConfig config = ClipKitConfigManager.getInstance().getConfig();
                if (config != null && config.getEditorEncodeConfig() != null) {
                   i = config.getEditorEncodeConfig().allowTrackSizeExceedsProject;
                }
                b = i;
             }
             protoSkipTra.setAllowTrackSizeExceedsProject(b);
          }
          return;
       }
    }
    public final boolean v(){
       Object obj = PatchProxy.apply(null, this, EncodeManager.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (Build$VERSION.SDK_INT < 24) {
          Object[] objArray = new Object[i];
          a.D().w("EncodeManager", "is1080pHardEncodeSupport os version lower N", objArray);
          return i;
       }else {
          boolean b = ClipDPHardwareConfigManager.getInstance().isUseEncodeConfigs();
          Object[] objArray1 = new Object[i];
          a.D().w("hwcfg_EncodeManager", "is1080pHardEncodeSupport isUseDPEncodeConfigs "+b, objArray1);
          if (!b) {
             return i;
          }
          b = ClipDPHardwareConfigManager.getInstance().isSupportEncode(a.a().a(), "avc", 1920, 0, true, BenchmarkEncodeProfile.MAIN, 2);
          Object[] objArray2 = new Object[i];
          a.D().w("hwcfg_EncodeManager", "is1080pHardEncodeSupport ClipDPHardwareConfigManager return "+b, objArray2);
          return b;
       }
    }
    public final void w(EncodeManager$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EncodeManager.class, "62")) {
          return;
       }
       Iterator iterator = this.d.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          Map$Entry uEntry = iterator.next();
          if (uEntry.getValue() instanceof EncodeManager$d) {
             EncodeManager$d b = uEntry.getValue().b;
             if (b == null) {
                break ;
             }else {
                PostEncodeInfo postEncodeIn = this.c.get(uEntry.getKey());
                if (postEncodeIn == null || postEncodeIn.getStatus() != EncodeInfo$Status.ENCODING) {
                   continue ;
                }else {
                   p0.a(b, postEncodeIn.getId());
                }
             }
          }
       }
       return;
    }
    public final void x(PostEncodeInfo p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EncodeManager.class, "43")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.mStatus = EncodeInfo$Status.FAILED;
       p0.setThrowable(p1);
       this.d.remove(Integer.valueOf(p0.getId()));
       this.z(p0);
       return;
    }
    public void y(PostEncodeInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EncodeManager.class, "55")) {
          return;
       }
       k1.o(new s(this, p0));
       return;
    }
    public void z(PostEncodeInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EncodeManager.class, "53")) {
          return;
       }
       k1.o(new t(this, p0));
       return;
    }
}
