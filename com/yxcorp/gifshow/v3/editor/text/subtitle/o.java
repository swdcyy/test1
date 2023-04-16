package com.yxcorp.gifshow.v3.editor.text.subtitle.o;
import erd.o;
import com.yxcorp.gifshow.v3.editor.text.subtitle.SubtitleHelper;
import java.lang.Object;
import android.util.Pair;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import brd.y;
import brd.t;
import com.yxcorp.gifshow.v3.editor.text.subtitle.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yaa.c;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Music;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import faa.a;
import q87.c;
import com.kuaishou.edit.draft.Music$Type;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.Double;
import com.kuaishou.edit.draft.TimeRange;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.util.Iterator;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils$AssetIdType;
import com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.TimeRange$b;
import java.lang.Math;
import java.lang.StringBuilder;
import prc.b;
import java.util.ArrayList;
import dvc.y;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import w46.b;
import java.io.File;
import wkd.b;
import j80.c;
import java.lang.System;
import r6b.b;
import java.lang.Long;
import com.yxcorp.gifshow.media.builder.MP4Builder;
import com.yxcorp.gifshow.v3.editor.text.subtitle.SubtitleHelper$AudioRecognizeException;
import dvc.x;
import kuaishou.perf.page.impl.d;
import okhttp3.MultipartBody$Part;
import ojd.e;
import uv8.m;
import uv8.n;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.editor.text.subtitle.h;
import com.yxcorp.gifshow.v3.editor.text.subtitle.i;
import erd.r;
import dvc.k;

public final class o implements o	// class@0014a4
{
    public final SubtitleHelper b;

    public void o(SubtitleHelper p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       t ot;
       Object[] obj;
       Object[] objArray2;
       int b1;
       int i;
       String str1;
       y obj3;
       double d;
       double d1;
       Music music;
       double d2;
       EditorSdk2V2$AudioAsset uAudioAsset;
       o b = this.b;
       Pair pair = p0;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (pair.first.intValue() == 17) {
          b.f.onNext(Integer.valueOf(11));
          ot = t.empty();
       }else {
          SubtitleHelper c = b.c;
          Objects.requireNonNull(c);
          k ok = k.class;
          Object[] objArray = null;
          Object[] objArray1 = PatchProxy.apply(objArray, c, ok, "9");
          object oobject = null;
          long l = 0;
          if (objArray1 != patchProxyRe) {
          }else if(c.b.J0() == null){
             Music music1 = DraftUtils.x(c.b.J0(), l);
             if (music1 == null) {
                obj = new Object[l];
                a.D().w("SubtitleAudioAssetUploadHelper", "music is null", obj);
             }else if(music1.getType() == Music$Type.IMPORT){
                obj = new Object[l];
                a.D().w("SubtitleAudioAssetUploadHelper", "local music doesn\'t recognize subtitle", obj);
             }else if(!music1.getVolume() - null){
                obj = new Object[l];
                a.D().w("SubtitleAudioAssetUploadHelper", "music volume is 0", obj);
             }else {
                double displayDurat = EditorSdk2UtilsV2.getDisplayDuration(c.c);
                if (PatchProxy.isSupport(ok)) {
                   TimeRange timeRange = PatchProxy.applyTwoRefs(music1, Double.valueOf(displayDurat), c, ok, "10");
                   if (timeRange != patchProxyRe) {
                   }else {
                   label_00ad :
                      timeRange = DraftUtils.z(music1);
                      if (timeRange == null) {
                         d2 = displayDurat;
                         timeRange = null;
                      label_013a :
                         if (timeRange == null) {
                            objArray1 = new Object[0];
                            a.D().w("SubtitleAudioAssetUploadHelper", "time range is null: "+music1.getType(), objArray1);
                         }else {
                            int i2 = 0;
                            d1 = timeRange.getDuration();
                            if (!d1 - null) {
                               obj = new Object[i2];
                               a.D().w("SubtitleAudioAssetUploadHelper", "music duration is 0", obj);
                            }else if(b.a(c.b.J0())){
                               obj = new Object[i2];
                               a.D().w("SubtitleAudioAssetUploadHelper", "music lyric added", obj);
                            }else {
                               ArrayList uArrayList = new ArrayList();
                               int i3 = 0;
                               double d3 = 0;
                               double d4 = d3 + d1;
                               while (d4 - d2 < 0 && i3 < 100) {
                                  uArrayList.add(c.a(music1, timeRange, d3));
                                  i3 = i3 + 1;
                                  d3 = d4;
                               }
                               obj3 = c.a(music1, timeRange, d3);
                               obj3.musicEndTime = (int)(((timeRange.getStart() + d2) - d3) * 0x408f400000000000);
                               uArrayList.add(obj3);
                               objArray1 = a.a.q(uArrayList);
                               objArray = new Object[0];
                               a.D().w("SubtitleAudioAssetUploadHelper", objArray1, objArray);
                            }
                         }
                         objArray1 = null;
                      }else if(!timeRange.getDuration() - oobject){
                         Iterator iterator = c.c.audioAssets().iterator();
                         while (true) {
                            if (iterator.hasNext()) {
                               uAudioAsset = iterator.next();
                               if (!uAudioAsset.assetId() - (long)AudioAssetUtils.a(AudioAssetUtils$AssetIdType.MUSIC_AUDIO_ASSET)) {
                               label_00ea :
                                  if (uAudioAsset != null) {
                                     TimeRange$b uob1 = timeRange.toBuilder();
                                     d2 = displayDurat;
                                     uob1.a(Math.max(0, Math.min(displayDurat, (EditorSdk2UtilsV2.audioAssetProbedDuration(uAudioAsset) - timeRange.getStart()))));
                                     timeRange = uob1.build();
                                     Object[] objArray5 = new Object[0];
                                     a.D().w("SubtitleAudioAssetUploadHelper", "fix music duration: "+d2+"-"+EditorSdk2UtilsV2.audioAssetProbedDuration(uAudioAsset), objArray5);
                                     goto label_013a ;
                                  }
                               }else {
                                  long l4 = 0;
                               }
                            }else {
                               uAudioAsset = null;
                               goto label_00ea ;
                            }
                         }
                      }
                   }
                }else {
                   goto label_00ad ;
                }
                d2 = displayDurat;
                goto label_013a ;
             }
          }
          objArray1 = objArray;
          c = SubtitleHelper.class;
          objArray = null;
          obj = PatchProxy.apply(objArray, b, c, "5");
          if (obj != patchProxyRe) {
             objArray2 = objArray;
          }else {
             String obj2 = PatchProxy.apply(objArray, b, c, "7");
             if (obj2 != patchProxyRe) {
                b1 = obj2.booleanValue();
             }else if(b.k.J0() == null){
                music = DraftUtils.x(b.k.J0(), false);
                if (music != null && music.getType() == Music$Type.IMPORT) {
                   b1 = true;
                }
             }
             b1 = false;
             EditorSdk2V2$AudioAsset[] uAudioAssetA = b.g.audioAssets().toNormalArray();
             if (b1) {
                b1 = uAudioAssetA.length;
                String str = null;
                for (i = 0; i < b1; b1 = i1) {
                   oobject = uAudioAssetA[i];
                   int i1 = b1;
                   EditorSdk2V2$AudioAsset[] uAudioAssetA1 = uAudioAssetA;
                   if (!oobject.assetId() - (long)AudioAssetUtils.a(AudioAssetUtils$AssetIdType.MUSIC_AUDIO_ASSET)) {
                      if (oobject.volume()) {
                         str = oobject.assetPath();
                         b.n = oobject;
                      }
                   }else {
                      l = 0;
                   }
                   i = i + 1;
                   uAudioAssetA = uAudioAssetA1;
                }
                str1 = str;
             }else {
                str1 = null;
             }
             obj3 = PatchProxy.applyOneRefs(str1, b, c, "6");
             if (obj3 != patchProxyRe) {
                obj2 = obj3;
             }else if(TextUtils.isEmpty(str1)){
                if (b.n.clippedRange() == null) {
                   Object[] objArray4 = new Object[0];
                   a.D().t("SubtitleHelper", "mLocalMusicAudioAsset asset clipped range is null", objArray4);
                }else {
                   File uFile = new File(str1);
                   File uFile1 = new File(b.a(-1504323719).d(".video_cache"), System.currentTimeMillis()+".mp3");
                   str1 = uFile1.toString();
                   d = 0x408f400000000000;
                   long l1 = (long)(b.n.clippedRange().start() * d);
                   d1 = b.n.clippedRange().duration() * d;
                   try{
                      long l2 = (long)d1;
                      if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(uFile, uFile1, Long.valueOf(l1), Long.valueOf(l2), null, b.class, "4")) {
                         objArray2 = null;
                      }else {
                         objArray2 = null;
                         b uob = new b(uFile1, objArray2);
                         while (l2 > 0) {
                            long l3 = l1 + l2;
                            uob.f(uFile, l1, l3);
                            l3 = l3 - l1;
                            l2 = l2 - l3;
                         }
                         uob.a();
                      }
                      obj2 = str1;
                   }catch(java.io.IOException e0){
                      throw new SubtitleHelper$AudioRecognizeException("识别出错");
                   }
                }
             }
             obj2 = str1;
             objArray2 = null;
          }
          if (TextUtils.isEmpty(pair.second.first) && (TextUtils.isEmpty(pair.second.second) && (!TextUtils.isEmpty(obj) || objArray1 != null))) {
             d.d(x.a).h(x.b);
             d.d(x.a).g(x.c);
             SubtitleHelper c1 = b.c;
             pair = pair.second;
             Pair first = pair.first;
             pair = pair.second;
             Objects.requireNonNull(c1);
             MultipartBody$Part obj1 = PatchProxy.applyFourRefs(first, pair, obj, objArray1, c1, k.class, "4");
             if (obj1 != patchProxyRe) {
                ot = obj1;
             }else {
                Object[] objArray3 = new Object[0];
                a.D().s("SubtitleAudioAssetUploadHelper", "uploadAudio: "+first, objArray3);
                obj1 = (!TextUtils.isEmpty(first))? e.d("origin", new File(first)): objArray2;
                MultipartBody$Part part = (!TextUtils.isEmpty(pair))? e.d("record", new File(pair)): objArray2;
                if (!TextUtils.isEmpty(obj) && new File(obj).exists()) {
                   objArray2 = e.d("localMusicFile", new File(obj));
                }
                obj = new Object[0];
                a.D().w("SubtitleAudioAssetUploadHelper", "uploadAudio musicJson:"+objArray1, obj);
                ot = n.a().d(obj1, part, objArray2, objArray1).subscribeOn(d.c).flatMap(new h(c1)).filter(i.b).map(new k(c1));
             }
          }else {
             throw new SubtitleHelper$AudioRecognizeException("原声录音本地配乐线上配乐信息都为空");
          }
       }
       return ot;
    }
}
