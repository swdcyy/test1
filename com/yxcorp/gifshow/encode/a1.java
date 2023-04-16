package com.yxcorp.gifshow.encode.a1;
import erd.o;
import java.lang.Object;
import pca.h2;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.encode.RxExportApi;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import brd.t;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import pr3.d;
import mca.a;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.encode.RxExportApi$a;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.clipkit.mv.EditorSdk2MvAsset;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosFaceMagicParam;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.Integer;
import java.lang.Float;
import com.kwai.video.minecraft.model.nano.Minecraft$CropOptions;
import com.kwai.video.clipkit.mv.ClipMvUtils;
import android.util.Pair;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import tkd.b;
import tkd.d;
import b26.c;
import b26.d;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import com.kwai.feature.post.api.core.model.GSConfig;
import com.yxcorp.gifshow.media.model.EncodeConfig$ImportEncodeConfig;
import com.yxcorp.gifshow.encode.c1;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.encode.b1;
import java.io.File;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.kwai.video.editorsdk2.ExportTaskNoQueueing;
import android.content.Context;
import lnc.a1;
import com.yxcorp.gifshow.encode.z0;
import com.kwai.video.editorsdk2.ExportTask;
import io.reactivex.g;
import pca.c2;
import erd.a;
import brd.w;

public final class a1 implements o	// class@000d0c
{
    public final boolean b;

    public void a1(boolean p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       t ot;
       Object[] objArray1;
       a uoa;
       h2 this;
       double d3;
       Minecraft$CropOptions uCropOptions;
       EditorSdk2V2$VideoEditorProject videoEditorP1;
       PatchProxyResult patchProxyRe1;
       boolean b1;
       int i3;
       int i4;
       h2 oh22;
       int i5;
       try{
          a1 b = this.b;
          t obj = p0;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          RxExportApi rxExportApi = RxExportApi.class;
          h2 obj1 = null;
          if (PatchProxy.isSupport(rxExportApi)) {
             ot = PatchProxy.applyTwoRefs(obj, Boolean.valueOf(b), obj1, rxExportApi, "6");
             if (ot != patchProxyRe) {
             }else {
             label_0023 :
                int i = 0;
                Object[] objArray = new Object[i];
                a.D().w("RxExportApi", "rxExportTask\(\) "+obj, objArray);
                h2 oh2 = 1;
                ot = (obj.p == null && obj.r == null)? 1: null;
                if (ot) {
                   objArray1 = new Object[i];
                   a.D().w("RxExportApi", "rxExportTask: just a picture no need to export", objArray1);
                   ot = t.just(new d(obj.a));
                }else if(b == null){
                   uoa = (obj.m >= obj.f && (obj.l >= obj.e && !obj.h))? 1: null;
                   if (uoa) {
                      objArray1 = new Object[i];
                      a.D().w("RxExportApi", "rxExportTask: skip export", objArray1);
                      ot = t.just(new d(obj.a));
                   }
                }
                a.u();
                double d = (double)((float)obj.h / 1000.00f);
                double d1 = (double)((float)obj.b() / 1000.00f);
                if (!a.t().d("template_import_switch", i)) {
                   RxExportApi$a uoa1 = new RxExportApi$a(obj.b, obj.a, EditorSdk2Utils.createTimeRange(d, d1), obj.d, obj.j, obj.k, obj.l, obj.m);
                   ot = RxExportApi.e(uoa);
                }else {
                   EditorSdk2V2$VideoEditorProject videoEditorP = new EditorSdk2V2$VideoEditorProject();
                   videoEditorP.setProjectOutputWidth((int)((float)obj.l * obj.o));
                   videoEditorP.setProjectOutputHeight((int)((float)obj.m * obj.o));
                   EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[oh2];
                   videoEditorP.setTrackAssets(trackAssetAr);
                   EditorSdk2V2$TrackAsset trackAsset = new EditorSdk2V2$TrackAsset();
                   videoEditorP.trackAssetsSetItem(i, trackAsset);
                   if (obj.r != null) {
                      Object[] objArray2 = new Object[i];
                      a.D().w("RxExportApi", "rxExportTask: set magicParam for video="+obj.a, objArray2);
                      obj.r.setTrackAssetTimeRange(obj1);
                      trackAsset.setWesterosFaceMagicParam(obj.r);
                   }
                   trackAsset.setVolume((double)obj.n);
                   trackAsset.setAssetPath(obj.a);
                   trackAsset.setAssetId(EditorSdk2Utils.getRandomID());
                   trackAsset.setClippedRange(EditorSdk2UtilsV2.createTimeRange(d, d1));
                   h2 e = obj.e;
                   obj1 = obj.f;
                   oh2 = obj.j;
                   h2 k = obj.k;
                   h2 l = obj.l;
                   this = obj.m;
                   double d2 = d1;
                   int i1 = 5;
                   if (PatchProxy.isSupport(rxExportApi)) {
                      Object[] objArray3 = new Object[]{Integer.valueOf(e),Integer.valueOf(obj1),Float.valueOf(oh2),Float.valueOf(k),Integer.valueOf(l),Integer.valueOf(this)};
                      d3 = d;
                      uCropOptions = PatchProxy.apply(objArray3, null, rxExportApi, "7");
                      if (uCropOptions != patchProxyRe) {
                         videoEditorP1 = videoEditorP;
                         patchProxyRe1 = patchProxyRe;
                      label_025c :
                         trackAsset.setCropOptions(uCropOptions);
                         EditorSdk2V2$VideoEditorProject videoEditorP2 = videoEditorP1;
                         Pair exportSize = EditorSdk2UtilsV2.getExportSize(videoEditorP2, obj.l, obj.m);
                         a EditorSdk2$ExportOptions uoa2 = a.D();
                         String str = "rxExportTask exportSize: width: "+exportSize.first+", height: "+exportSize.second+", scale: "+obj.o+", startTime "+d3+", duration "+d2+", projectOutputWidth: "+videoEditorP2.projectOutputWidth()+", projectOutputHeight: "+videoEditorP2.projectOutputHeight();
                         Object[] objArray4 = new Object[0];
                         uoa2.w("RxExportApi", str, objArray4);
                         uoa2 = EditorSdk2Utils.createDefaultExportOptions();
                         uoa2.setWidth(exportSize.first.intValue());
                         uoa2.setHeight(exportSize.second.intValue());
                         uoa2.setX264Params(obj.c);
                         EditorSdk2$ExportOptions mVExportOpti = EditorSdk2Utils.getMVExportOptionsNativeOptions(obj.d, false);
                         if (d.a(0x2e6e89ac).C5(uoa2.width(), uoa2.height())) {
                            EncodeConfig$ImportEncodeConfig importEncode = GSConfig.c().getImportEncodeConfig();
                            uoa2.setVideoEncoderType(5);
                            uoa2.setVideoGopSize(250);
                            uoa2.setVideoBitrate(0x7a1200);
                            if (mVExportOpti != null) {
                               uoa2.setVideoGopSize(mVExportOpti.videoGopSize());
                               uoa2.setVideoBitrate(mVExportOpti.videoBitrate());
                               uoa2.setX264Preset(mVExportOpti.x264Preset());
                               uoa2.setAudioBitrate(mVExportOpti.audioBitrate());
                               uoa2.setAudioCutoff(mVExportOpti.audioCutoff());
                               uoa2.setAudioProfile(mVExportOpti.audioProfile());
                            }else if(importEncode != null){
                               uoa2.setVideoGopSize(importEncode.mVideoGopSize);
                               uoa2.setVideoBitrate(importEncode.mVideoBitrate);
                            }
                            objArray4 = new Object[0];
                            a.D().w("RxExportApi", "rxExportTask: using hard encode videoGopSize="+uoa2.videoGopSize()+" videoBitrate="+uoa2.videoBitrate(), objArray4);
                         }
                         z c = d.c;
                         ot = t.fromCallable(new c1(obj)).subscribeOn(c).flatMap(b1.b);
                         String absolutePath = obj.c().getAbsolutePath();
                         obj = PatchProxy.applyThreeRefs(absolutePath, videoEditorP2, uoa2, null, RxExportApi.class, "10");
                         if (obj != patchProxyRe1) {
                         }else if(TextUtils.x(absolutePath)){
                            obj = t.error(new IllegalArgumentException("exportFilePath is empty"));
                         }else if(new File(absolutePath).exists()){
                            objArray1 = new Object[0];
                            a.D().w("RxExportApi", "rxSdkExport: hit cache export "+absolutePath, objArray1);
                            obj = t.just(new d(absolutePath));
                         }else {
                            int i2 = 0;
                            Object[] objArray5 = new Object[i2];
                            a.D().w("RxExportApi", "rxSdkExport: no cache exportFilePath="+absolutePath, objArray5);
                            String str1 = absolutePath+"_exp_.mp4";
                            b1 = a.t().d("editorExportDisableFastStart", i2);
                            try{
                               uoa2.setNoFastStart(b1);
                               ExportTaskNoQueueing uExportTaskN = new ExportTaskNoQueueing(a1.c(), videoEditorP2, str1, uoa2);
                               obj = t.create(new z0(absolutePath, str1, uExportTaskN)).unsubscribeOn(c).doFinally(new c2(uExportTaskN));
                            }catch(java.io.IOException e0){
                               a.D().z("RxExportApi", "rxSdkExport: ", e0);
                               obj = t.error(e0);
                            }
                         }
                      }
                   }else {
                      d3 = d;
                   }
                   d = (double)l;
                   double d4 = d * 0x3ff0000000000000;
                   d1 = (double)this;
                   patchProxyRe1 = patchProxyRe;
                   double d5 = (double)e * 0x3ff0000000000000;
                   videoEditorP1 = videoEditorP;
                   h2 oh21 = this;
                   double d6 = (double)obj1;
                   float f = 2.00f;
                   if ((d4 / d1) - (d5 / d6) > 0) {
                      i3 = (int)((d5 * d1) / d);
                      i4 = i3;
                      i3 = (int)(((float)obj1 * k) - ((float)i3 / f));
                      oh22 = e;
                      i5 = 0;
                   }else {
                      i3 = (int)((d4 * d6) / d1);
                      i5 = (int)(((float)e * oh2) - ((float)i3 / f));
                      oh22 = i3;
                      i4 = obj1;
                      i3 = 0;
                   }
                   objArray = new Object[0];
                   a.D().w("RxExportApi", "calculateCropOptions rectX: "+i5+", rectY: "+i3+", cropWidth: "+oh22+", cropHeight: "+i4+", exportPositionX: "+oh2+", exportPositionY: "+k+", mediaWidth: "+e+", mediaHeight: "+obj1+", mediaExportWidth: "+l+", mediaExportHeight: "+oh21, objArray);
                   uCropOptions = ClipMvUtils.getCropOptionsByAssetRectangle(e, obj1, i5, i3, oh22, i4, oh22, i4);
                   goto label_025c ;
                }
             }
          }else {
             goto label_0023 ;
          }
       }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
          Throwable uoa21 = e0;
          a.D().z("RxExportApi", "rxExportTask: ", uoa21);
          ot = t.error(uoa21);
       }
       return ot;
    }
}
