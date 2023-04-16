package com.yxcorp.dynamicfeature.video.redpack.a;
import io.reactivex.g;
import com.yxcorp.dynamicfeature.video.redpack.RedPackPluginImpl$c;
import java.lang.String;
import java.lang.Object;
import brd.v;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.media.MediaMetadataRetriever;
import java.lang.Long;
import java.lang.Integer;
import com.yxcorp.dynamicfeature.video.redpack.RedPackPluginImpl$b;
import tu8.a;
import java.util.Objects;
import tu8.a$a;
import java.io.File;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import qkd.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import org.json.JSONObject;
import org.json.JSONArray;
import usd.k;
import usd.q;
import java.util.Iterator;
import java.lang.Iterable;
import trd.l0;
import java.lang.Math;
import com.yxcorp.dynamicfeature.video.redpack.RedPackPluginImpl;
import com.kwai.sharelib.model.QrCodeResponse;
import android.graphics.Bitmap;
import okio.ByteString;
import okio.ByteString$a;
import android.graphics.BitmapFactory;
import wkd.b;
import eo7.b;
import lu5.c;
import tkd.b;
import tkd.d;
import ku5.a;
import fo7.c;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import brd.g;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import mca.a;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.yxcorp.gifshow.media.watermark.a;
import com.kwai.framework.model.user.User;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.kwai.video.editorsdk2.EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings;
import com.kwai.video.editorsdk2.EditorSdk2AE2Utils$CreateAE2EffectParamRet;
import com.kwai.video.editorsdk2.EditorSdk2AE2Utils;
import xf6.i;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.yxcorp.gifshow.media.watermark.g;
import com.yxcorp.dynamicfeature.video.redpack.RedPackPluginImpl$a;
import qrd.p;
import java.lang.StringBuilder;
import java.lang.System;
import com.kwai.video.editorsdk2.TailEffectGenerator;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import kotlin.jvm.internal.Ref$BooleanRef;
import com.yxcorp.dynamicfeature.video.redpack.a$a;
import com.kwai.video.editorsdk2.TailEffectGenerator$EventListener;
import com.yxcorp.dynamicfeature.video.redpack.a$b;
import erd.f;

public final class a implements g	// class@0011da
{
    public final RedPackPluginImpl$c b;
    public final String c;

    public void a(RedPackPluginImpl$c p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       String str5;
       double d2;
       boolean b;
       String str6;
       Bitmap uBitmap;
       QrCodeResponse mShareUrl;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, a.class, str)) {
          return;
       }
       a.p(obj1, "emitter");
       MediaMetadataRetriever mediaMetadat = new MediaMetadataRetriever();
       mediaMetadat.setDataSource(obj.b.c);
       String str1 = mediaMetadat.extractMetadata(9);
       a.m(str1);
       a.o(str1, "extractMetadata\(MediaMet¡­.METADATA_KEY_DURATION\)!!");
       String str2 = mediaMetadat.extractMetadata(18);
       a.m(str2);
       a.o(str2, "extractMetadata\(MediaMet¡­TADATA_KEY_VIDEO_WIDTH\)!!");
       String str3 = mediaMetadat.extractMetadata(19);
       a.m(str3);
       a.o(str3, "extractMetadata\(MediaMet¡­ADATA_KEY_VIDEO_HEIGHT\)!!");
       RedPackPluginImpl$b uob = new RedPackPluginImpl$b(((double)Long.parseLong(str1) / 0x408f400000000000), Integer.parseInt(str2), Integer.parseInt(str3));
       a$a e = a.e;
       a c = obj.c;
       Objects.requireNonNull(e);
       a uoa = PatchProxy.applyOneRefs(c, e, a$a.class, str);
       RedPackPluginImpl$c uoc = 2;
       str2 = "image_4.png";
       int i = 0;
       if (uoa != patchProxyRe) {
       }else {
          a.p(c, "themePath");
          uoa = new a();
          File uFile1 = new File(c, str2);
          if (!uFile1.exists()) {
             uFile1 = null;
          }
          if (uFile1 != null) {
             uoa.d = BitmapUtil.E(uFile1.getPath()).a;
          }
          uFile1 = new File(c, "config.json");
          if (uFile1.exists()) {
             str1 = b.f0(uFile1);
             if (!TextUtils.x(str1)) {
                JSONArray jSONArray = new JSONObject(str1).optJSONArray("assets");
                Iterator iterator1 = q.n1(i, jSONArray.length()).iterator();
                while (iterator1.hasNext()) {
                   JSONObject jSONObject = jSONArray.optJSONObject(iterator1.b());
                   String str7 = jSONObject.optString("id");
                   if (str7 == null || (str7.hashCode() == 0x71f5ca4c && str7.equals("image_0"))) {
                      JSONArray jSONArray1 = jSONObject.optJSONArray("visibleTime");
                      if (jSONArray1.length() >= uoc) {
                         double d4 = jSONArray1.optDouble(1);
                         uoa.b = d4;
                         d4 = d4 - jSONArray1.optDouble(i);
                         uoa.c = Math.max(0, d4);
                         str2 = str2;
                         uoc = 2;
                      }
                   }
                }
             }
          }
       }
       String str4 = str2;
       c = obj.b;
       uoc = c.b;
       RedPackPluginImpl$c d = c.d;
       a c1 = obj.c;
       a d1 = uoa.d;
       Objects.requireNonNull(uoc);
       RedPackPluginImpl redPackPlugi = RedPackPluginImpl.class;
       if (PatchProxy.isSupport(redPackPlugi)) {
          str5 = PatchProxy.applyThreeRefs(d, c1, Integer.valueOf(d1), uoc, RedPackPluginImpl.class, "2");
          if (str5 != patchProxyRe) {
          }else {
          label_014f :
             QrCodeResponse mQrBytes = d.mQrBytes;
             if (mQrBytes != null) {
                d2 = (!mQrBytes.length)? 1: 0;
                if (!d2) {
                   str6 = null;
                label_015f :
                   if (!str6) {
                      try{
                         object oobject = mQrBytes[i];
                         a.o(oobject, "qrCodeResponse.mQrBytes[0]");
                         uBitmap = PatchProxy.applyOneRefs(oobject, uoc, redPackPlugi, "3");
                         if (uBitmap != patchProxyRe) {
                         }else {
                            ByteString uByteString = ByteString.Companion.a(oobject);
                            if (uByteString != null) {
                               byte[] uobyteArray = uByteString.toByteArray();
                               if (uobyteArray != null) {
                                  uBitmap = BitmapFactory.decodeByteArray(uobyteArray, i, uobyteArray.length);
                               }
                            }
                         }
                      }catch(java.lang.Exception e0){
                      }
                   }
                   uBitmap = null;
                }
             }
             str6 = 1;
             goto label_015f ;
          }
       }else {
          goto label_014f ;
       }
       if (!TextUtils.x(str5)) {
          obj1.onError(new IllegalStateException(str5));
          return;
       }else {
          String[] stringArray = new String[]{obj.b.c,new File(obj.c, "image_8.png").getPath()};
          EditorSdk2V2$VideoEditorProject videoEditorP = a.a(stringArray);
          EditorSdk2V2$TrackAsset trackAsset = videoEditorP.trackAssets(i);
          a.o(trackAsset, "project.trackAssets\(0\)");
          EditorSdk2V2$TrackAsset trackAsset1 = videoEditorP.trackAssets(1);
          a.o(trackAsset1, "project.trackAssets\(1\)");
          if (EditorSdk2UtilsV2.trackAssetProbedFileDuration(trackAsset) - (double)i > 0) {
             uob.a = EditorSdk2UtilsV2.trackAssetProbedFileDuration(trackAsset);
          }
          d2 = 0;
          trackAsset.setClippedRange(EditorSdk2UtilsV2.createTimeRange(d2, uob.a()));
          trackAsset1.setClippedRange(EditorSdk2UtilsV2.createTimeRange(d2, uoa.a()));
          videoEditorP.setProjectOutputWidth(uob.c());
          videoEditorP.setProjectOutputHeight(uob.b());
          if (obj.b.e != null) {
             a uoa1 = new a(uob.c(), uob.b(), obj.b.f.getKwaiId(), obj.b.f.getId(), null);
             if (trackAsset.a()) {
                videoEditorP.setAnimatedSubAssets(trackAsset.b(videoEditorP, 1));
                ImmutableArray immutableArr = videoEditorP.animatedSubAssets();
                a.o(immutableArr, "project.animatedSubAssets\(\)");
                Iterator iterator = immutableArr.iterator();
                while (iterator.hasNext()) {
                   EditorSdk2V2$AnimatedSubAsset uAnimatedSub = iterator.next();
                   double d3 = uob.a();
                   d2 = 0;
                   uAnimatedSub.setDisplayRange(EditorSdk2Utils.createTimeRange(d2, d3));
                   uAnimatedSub.setClippedRange(EditorSdk2UtilsV2.createTimeRange(d2, d3));
                }
             }else {
                obj1.onError(new IllegalStateException("add watermark failed"));
                return;
             }
          }
          String path = new File(obj.c, "audio_0.mp3").getPath();
          EditorSdk2V2$AudioAsset uAudioAsset = EditorSdk2UtilsV2.openAudioAsset(path);
          uAudioAsset.setVolume(0x3ff0000000000000);
          uAudioAsset.setAssetId(EditorSdk2Utils.getRandomID());
          uAudioAsset.setAssetPath(path);
          uAudioAsset.setAssetSpeed(0x3ff0000000000000);
          uAudioAsset.setIsRepeat(i);
          uAudioAsset.setDisplayRange(EditorSdk2Utils.createTimeRange(uob.a(), uoa.a()));
          EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[]{uAudioAsset};
          videoEditorP.setAudioAssets(uAudioAssetA);
          EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
          uEditorSdk2A.ae2AssetDir = obj.c;
          uEditorSdk2A.fillingMode = 1;
          uEditorSdk2A.displayRange = EditorSdk2Utils.createTimeRange(uob.a(), (uob.a() + uoa.a()));
          EditorSdk2AE2Utils.applyAE2EffectOnProjectBySettingsV2(videoEditorP, uEditorSdk2A);
          int i1 = i.g("KEY_NEBULA_RED_PACK_ENCODE_TYPE") % 3;
          if (i1) {
             b = (i1 != 1)? false: true;
          }else {
             b = obj.b.e;
          }
          EditorSdk2$ExportOptions uExportOptio = g.c(new File(obj.b.c), videoEditorP, obj.b.f);
          if (b == null) {
             uExportOptio.setAudioProfile("aac_he");
             uExportOptio.setAudioBitrate(0xfa00);
             uExportOptio.setX264Preset("medium");
             uExportOptio.setX264Params("crf=25:keyint=100:deblock=1,1");
          }
          RedPackPluginImpl$a c2 = RedPackPluginImpl.c;
          Objects.requireNonNull(c2);
          c obj2 = PatchProxy.apply(null, c2, RedPackPluginImpl$a.class, str);
          if (obj2 != patchProxyRe) {
          }else {
             obj2 = RedPackPluginImpl.b.getValue();
          }
          File uFile = new File(obj2, "temp"+System.currentTimeMillis()+".mp4");
          obj2 = a.a();
          a.o(obj2, "AppEnv.get\(\)");
          TailEffectGenerator tailEffectGe = new TailEffectGenerator(obj2.a(), videoEditorP, uFile.getPath(), uExportOptio, uob.a(), b);
          Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
          uBooleanRef.element = true;
          patchProxyRe.setExportEventListener(new a$a(obj, obj1, uBooleanRef, uFile));
          obj1.setCancellable(new a$b(uBooleanRef, patchProxyRe));
          if (!p0.isDisposed()) {
             patchProxyRe.run();
          }
          return;
       }
    }
}
