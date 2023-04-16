package com.yxcorp.gifshow.edit.previewer.loaderv2.KaraokeLoaderV2;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import uaa.a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Karaoke;
import com.kuaishou.edit.draft.KaraokeAsset;
import com.kuaishou.edit.draft.OnlineMusicParam;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.kuaishou.edit.draft.KaraokeVoiceAsset;
import java.io.File;
import com.kuaishou.edit.draft.Song;
import com.yxcorp.gifshow.edit.previewer.loaderv2.cache.BizCache;
import rba.b;
import rba.c;
import sba.c;
import sba.c$a;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioFilterParam;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.yxcorp.gifshow.edit.previewer.utils.KtvEditUtils$KtvAssetIdType;
import com.yxcorp.gifshow.edit.previewer.utils.KtvEditUtils;
import com.kuaishou.edit.draft.KaraokeGeneral;
import com.yxcorp.gifshow.edit.previewer.loaderv2.KaraokeLoaderV2$OpenKtvAssetFailException;
import java.lang.Throwable;
import com.kuaishou.edit.draft.TimeRange;
import com.kuaishou.edit.draft.KaraokeClip;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.util.List;
import com.yxcorp.gifshow.edit.previewer.loaderv2.o;
import java.util.Collection;
import ekd.q$a;
import ekd.q;
import wba.d;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.lang.Double;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.edit.draft.Asset;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.yxcorp.gifshow.edit.previewer.loaderv2.PreviewLoaderException;
import com.kwai.video.minecraft.model.nano.Minecraft$InputFileOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$RationalV2;
import com.kwai.robust.PatchProxyResult;
import ekd.k1;
import laa.m0;
import brd.t;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.util.PostUtils;
import wba.n0;
import java.lang.Math;
import qba.d;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.kwai.plugin.dva.Dva;
import tkd.b;
import tkd.d;
import r16.a;
import r16.d;
import com.kuaishou.edit.draft.KaraokeMixing;
import com.kuaishou.edit.draft.VoiceChange;

public class KaraokeLoaderV2 extends a	// class@001b24
{
    public a h;
    public a i;
    public d j;

    public void KaraokeLoaderV2(){
       super();
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KaraokeLoaderV2.class, "1")) {
          return;
       }
       this.j = p0.f;
       this.i = this.a.o0();
       this.h = this.a.E0();
       return;
    }
    public void d(){
       KaraokeAsset asset;
       EditorSdk2V2$AudioAsset uAudioAsset;
       Karaoke karaoke1;
       double d2;
       List list;
       int i2;
       EditorSdk2V2$AudioAsset uAudioAsset2;
       ArrayList uArrayList;
       EditorSdk2V2$AudioAsset[] uAudioAssetA;
       Iterator iterator;
       EditorSdk2V2$TrackAsset trackAsset;
       double d3;
       EditorSdk2V2$AudioAsset uAudioAsset3;
       EditorSdk2V2$AudioAsset uAudioAsset4;
       double d4;
       double d5;
       File uFile2;
       float f;
       b0 uob02;
       ArrayList uArrayList2;
       a b1;
       b0 b2;
       b0 a1;
       d e;
       d uod;
       Object obj3;
       Object[] objArray2;
       Object[] objArray3;
       int i6;
       Object obj = this;
       KaraokeLoaderV2 karaokeLoade = KaraokeLoaderV2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, karaokeLoade, "3")) {
          return;
       }
       Workspace$Type type = obj.a.a1();
       if (type != Workspace$Type.KTV_SONG && type != Workspace$Type.KTV_MV) {
          return;
       }
       if (obj.a.T0() == Workspace$Source.REEDIT) {
          return;
       }
       Karaoke karaoke = obj.h.v();
       if (karaoke == null || (!karaoke.hasAsset() || (!karaoke.getNewVideoRecord() && (!karaoke.getAsset().getVoiceAssetsCount() || (!karaoke.getAsset().hasAccompany() || !karaoke.getAsset().getAccompany().hasSong()))))) {
          throw new PreviewLoaderException("No karaoke asset.");
       }
       asset = karaoke.getAsset();
       int i = 0;
       File uFile = (!karaoke.getNewVideoRecord())? DraftFileManager.E().B(asset.getVoiceAssets(i).getFile(), obj.h): objArray;
       File uFile1 = DraftFileManager.E().B(asset.getAccompany().getSong().getFile(), obj.h);
       if (uFile1 != null && (uFile != null || type == Workspace$Type.KTV_MV)) {
          double d = 0x3ff0000000000000;
          boolean i1 = 1;
          if (uFile != null) {
             try{
                uAudioAsset = obj.d.c(BizCache.AudioAsset).e(new c$a(uFile.getAbsolutePath(), d, i));
                uAudioAsset.setAudioFilterParam(EditorSdk2Utils.createAudioFilterParam(i, i, i));
                uAudioAsset.setAssetAudioFlag((uAudioAsset.assetAudioFlag() | i1));
                uAudioAsset.setAssetId((long)KtvEditUtils.a(KtvEditUtils$KtvAssetIdType.KTV_RECORD_AUDIO_ASSET));
                if (karaoke.hasGeneral()) {
                   uAudioAsset.setVolume((double)karaoke.getGeneral().getVoiceVolume());
                   obj.h(uAudioAsset.audioFilterParam(), karaoke);
                }
             }catch(java.lang.Exception e0){
                throw new KaraokeLoaderV2$OpenKtvAssetFailException(e0);
             }
          }else {
             uAudioAsset = objArray;
          }
          try{
             EditorSdk2V2$AudioAsset uAudioAsset1 = obj.d.c(BizCache.AudioAsset).e(new c$a(uFile1.getAbsolutePath(), d, i));
             uAudioAsset1.setAssetAudioFlag((uAudioAsset1.assetAudioFlag() | i1));
             uAudioAsset1.setAssetId((long)KtvEditUtils.a(KtvEditUtils$KtvAssetIdType.KTV_MUSIC_AUDIO_ASSET));
             double d1 = 0;
             d = (asset.getAccompany().hasSelectedRange())? asset.getAccompany().getSelectedRange().getStart(): d1;
             if (karaoke.hasGeneral()) {
                KaraokeGeneral general = karaoke.getGeneral();
                karaoke1 = karaoke;
                uAudioAsset1.setVolume((double)general.getAccompanyVolume());
                d2 = d1 - general.getVoiceOffset();
             }else {
                karaoke1 = karaoke;
                d2 = d1;
             }
             double recordDurati = asset.getRecordDuration();
             if (karaoke1.hasClip()) {
                d1 = karaoke1.getClip().getSelectedRange().getStart();
                recordDurati = karaoke1.getClip().getSelectedRange().getDuration();
             }
             if (karaoke1.getPitch()) {
                if (uAudioAsset1.audioFilterParam() == null) {
                   uAudioAsset1.setAudioFilterParam(EditorSdk2Utils.createAudioFilterParam(i, i, i));
                }
                uAudioAsset1.audioFilterParam().setPitch(karaoke1.getPitch());
             }
             String str = "KaraokeLoader";
             if (type == Workspace$Type.KTV_MV) {
                uAudioAsset1.setClippedRange(EditorSdk2UtilsV2.createTimeRange(((d + d2) + d1), recordDurati));
                if (karaoke1.hasClip()) {
                   recordDurati = recordDurati + d1;
                   try{
                      list = d.b(d1, recordDurati, q.g(obj.i.z(), o.a));
                      Object[] objArray1 = new Object[0];
                      f.D().w(str, "load clippedTimeRangeList:"+list, objArray1);
                      for (i2 = 0; i2 < obj.b.trackAssetsSize(); i2 = i2 + 1) {
                         obj.b.trackAssets(i2).setClippedRange(EditorSdk2UtilsV2.createTimeRange(list.get(i2).getStart(), list.get(i2).getDuration()));
                      }
                   }catch(java.lang.Exception e0){
                   }
                }
                uAudioAsset2 = uAudioAsset;
             }else {
                double recordDurati1 = asset.getRecordDuration();
                if (PatchProxy.isSupport(karaokeLoade) && PatchProxy.applyVoidTwoRefs(Double.valueOf(recordDurati), Double.valueOf(recordDurati1), obj, karaokeLoade, "4")) {
                   d3 = d2;
                   uAudioAsset3 = uAudioAsset;
                   uAudioAsset4 = uAudioAsset1;
                   d4 = d;
                   d5 = d1;
                }else {
                   list = obj.i.z();
                   if (!list.isEmpty()) {
                      ArrayList uArrayList1 = new ArrayList();
                      Iterator iterator1 = list.iterator();
                      b0 uob0 = null;
                      while (true) {
                         if (iterator1.hasNext()) {
                            Asset uAsset = iterator1.next();
                            Iterator iterator2 = iterator1;
                            uAudioAsset4 = uAudioAsset1;
                            d4 = d;
                            uFile2 = DraftFileManager.E().B(uAsset.getFile(), obj.i);
                            if (uFile2 != null) {
                               b0 uob01 = BitmapUtil.E(uFile2.getAbsolutePath());
                               b0 a = uob01.a;
                               if (a > null) {
                                  b0 b = uob01.b;
                                  if (b > null) {
                                     if (uob0 != null) {
                                        f = (float)b / (float)a;
                                        uob02 = uob01;
                                        float f1 = (float)uob0.b / (float)uob0.a;
                                        if (f - f1 <= 0) {
                                        label_0292 :
                                           uArrayList1.add(uFile2);
                                           iterator1 = iterator2;
                                           uAudioAsset1 = uAudioAsset4;
                                           d = d4;
                                        }
                                     }else {
                                        uob02 = uob01;
                                     }
                                     uob0 = uob02;
                                     goto label_0292 ;
                                  }else {
                                     goto label_0292 ;
                                  }
                               }else {
                                  goto label_0292 ;
                               }
                            }else {
                               objArray = new Object[0];
                               f.D().A(str, "Asset file not found: "+uAsset.getFile()+", workspace "+obj.a.D0(), objArray);
                               throw new PreviewLoaderException("Asset file not found.");
                            }
                         }else {
                            uAudioAsset4 = uAudioAsset1;
                            d4 = d;
                            Minecraft$InputFileOptions inputFileOpt = new Minecraft$InputFileOptions();
                            int i3 = 1;
                            inputFileOpt.setFrameRate(EditorSdk2Utils.createRationalV2(i3, 2));
                            if (uArrayList1.size() == i3) {
                               File obj1 = uArrayList1.get(0);
                               EditorSdk2V2$TrackAsset obj2 = PatchProxy.applyOneRefs(obj1, obj, karaokeLoade, "5");
                               if (obj2 != PatchProxyResult.class) {
                                  obj1 = obj2;
                                  d3 = d2;
                               }else if(k1.g()){
                                  d3 = d2;
                                  obj3 = obj1;
                               }else {
                                  String path = obj.a.f0().getPath();
                                  if ((obj1.getPath()).startsWith(path)) {
                                     obj3 = obj1;
                                     objArray2 = new Object[0];
                                     f.D().w(str, "getKtvSongSingleFile ready, skip save", objArray2);
                                     d3 = d2;
                                  }else {
                                     obj3 = obj1;
                                     i3 = 0;
                                     f uof = f.D();
                                     d3 = d2;
                                     objArray = new Object[i3];
                                     String str1 = "getKtvSongSingleFile save draft";
                                     try{
                                        uof.w(str, str1, objArray);
                                        DraftFileManager.E().j0(obj.a, i3).timeout(3000, TimeUnit.MILLISECONDS).blockingSubscribe();
                                     }catch(java.lang.Exception e0){
                                        PostUtils.D(str, "getKtvSongSingleFile save draft error", e0);
                                     }
                                     list = obj.i.z();
                                     if (list.isEmpty()) {
                                        objArray3 = new Object[0];
                                        f.D().w(str, "getKtvSongSingleFile assets.isEmpty\(\)", objArray3);
                                     }else {
                                        uFile2 = DraftFileManager.E().B(list.get(0).getFile(), obj.i);
                                        if (uFile2 == null || !uFile2.exists()) {
                                           objArray3 = new Object[0];
                                           f.D().w(str, "getKtvSongSingleFile file == null||!file.exists\(\)", objArray3);
                                        }else if(!(uFile2.getPath()).startsWith(path)){
                                           objArray3 = new Object[0];
                                           f.D().w(str, "!file.getPath\(\).startsWith\(rootDirectoryPath\)", objArray3);
                                        }else {
                                           objArray2 = new Object[0];
                                           f.D().w(str, "getKtvSongSingleFile ready, after save", objArray2);
                                           obj1 = uFile2;
                                        }
                                     }
                                  }
                               }
                               obj1 = obj3;
                               obj2 = EditorSdk2UtilsV2.openTrackAsset(obj1.getAbsolutePath(), null, inputFileOpt);
                               obj2.setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, recordDurati));
                               n0.a(obj2);
                               EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[]{obj2};
                               obj.b.setTrackAssets(trackAssetAr);
                            }else {
                               d3 = d2;
                               int i4 = (int)Math.floor((recordDurati1 / 2.00f));
                               EditorSdk2V2$TrackAsset[] trackAssetAr1 = new EditorSdk2V2$TrackAsset[i4];
                               obj.b.setTrackAssets(trackAssetAr1);
                               i2 = 0;
                               d = 0;
                               while (i2 < i4) {
                                  uAudioAsset3 = uAudioAsset;
                                  d5 = d1;
                                  Object[] objArray4 = new Object[0];
                                  f.D().s(str, "Create karaoke track asset "+i2+", total "+i4, objArray4);
                                  int i5 = i2 % uArrayList1.size();
                                  EditorSdk2V2$TrackAsset trackAsset1 = EditorSdk2UtilsV2.openTrackAsset(uArrayList1.get(i5).getAbsolutePath(), null, inputFileOpt);
                                  if (d - recordDurati >= 0) {
                                     trackAsset1.setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, 0));
                                     i6 = i4;
                                     uArrayList2 = uArrayList1;
                                     uArrayList1 = 0x4000000000000000;
                                  }else {
                                     d1 = 0;
                                     double d6 = recordDurati - 4.00f;
                                     if (d - d6 < 0) {
                                        i6 = i4;
                                        uArrayList2 = uArrayList1;
                                        double d7 = 2.00f;
                                        trackAsset1.setClippedRange(EditorSdk2UtilsV2.createTimeRange(d1, d7));
                                        d = d + d7;
                                     }else {
                                        i6 = i4;
                                        uArrayList2 = uArrayList1;
                                        d = recordDurati - d;
                                        trackAsset1.setClippedRange(EditorSdk2UtilsV2.createTimeRange(d1, d));
                                        d = recordDurati;
                                     }
                                  }
                                  n0.a(trackAsset1);
                                  obj.b.trackAssetsSetItem(i2, trackAsset1);
                                  i2 = i2 + 1;
                                  uArrayList1 = uArrayList2;
                                  i4 = i6;
                                  uAudioAsset = uAudioAsset3;
                                  d1 = d5;
                               }
                            }
                            uArrayList2 = uArrayList1;
                            uAudioAsset3 = uAudioAsset;
                            d5 = d1;
                            if (!PatchProxy.applyVoidOneRefs(uob0, obj, karaokeLoade, "8")) {
                               if (uob0 == null) {
                                  if (obj.i.p() == 1) {
                                     obj.b.setProjectOutputWidth(obj.j.c);
                                     obj.b.setProjectOutputHeight(obj.j.d);
                                  }else {
                                     obj.b.setProjectOutputWidth(obj.j.e);
                                     obj.b.setProjectOutputHeight(obj.j.f);
                                  }
                               }else {
                                  float f2 = (float)uob0.a / (float)uob0.b;
                                  if (obj.i.p() == 1) {
                                     obj.b.setProjectOutputWidth(uob0.a);
                                     b1 = obj.b;
                                     b2 = uob0.b;
                                     a1 = uob0.a;
                                     if (b2 <= a1) {
                                        b2 = a1;
                                     }
                                     b1.setProjectOutputHeight(b2);
                                  }else {
                                     b2 = uob0.b;
                                     a1 = uob0.a;
                                     if (b2 <= a1) {
                                        e = obj.j.e;
                                        if (a1 > e) {
                                           uod = e;
                                        }
                                        obj.b.setProjectOutputWidth(uod);
                                        obj.b.setProjectOutputHeight(uod);
                                     }else {
                                        KaraokeLoaderV2 j = obj.j;
                                        float f3 = (float)j.a / (float)j.b;
                                        if (((float)a1 / (float)b2) - f3 < 0) {
                                           e = j.e;
                                           if (a1 > e) {
                                              obj.b.setProjectOutputWidth(e);
                                              obj.b.setProjectOutputHeight((int)((float)obj.j.e / f3));
                                           }else {
                                              obj.b.setProjectOutputWidth(a1);
                                              obj.b.setProjectOutputHeight((int)((float)uob0.a / f3));
                                           }
                                        }else {
                                           d e1 = j.e;
                                           if (a1 > e1) {
                                              obj.b.setProjectOutputWidth(e1);
                                              obj.b.setProjectOutputHeight((int)((float)obj.j.e / f2));
                                           }else {
                                              obj.b.setProjectOutputWidth(a1);
                                              obj.b.setProjectOutputHeight((int)((float)uob0.a / f2));
                                           }
                                        }
                                     }
                                  }
                               }
                            }
                            b1 = obj.b;
                            i1 = (uArrayList2.size() > Double.MIN_VALUE)? true: false;
                            b1.setIsKwaiPhotoMovie(i1);
                         }
                      }
                   }else {
                      throw new PreviewLoaderException("No photo assets.");
                   }
                }
                d1 = d5;
                uAudioAsset2 = uAudioAsset3;
                uAudioAsset2.setClippedRange(EditorSdk2UtilsV2.createTimeRange(d1, recordDurati));
                uAudioAsset1 = uAudioAsset4;
                uAudioAsset1.setClippedRange(EditorSdk2UtilsV2.createTimeRange((d4 + (d3 + d1)), recordDurati));
             }
          }catch(java.lang.Exception e0){
             throw new KaraokeLoaderV2$OpenKtvAssetFailException(e0);
          }
       }else {
          throw new PreviewLoaderException("Missing audio track files in karaoke.");
       }
    }
    public void f(EditorSdk2V2$VideoEditorProject p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KaraokeLoaderV2.class, "2")) {
          return;
       }
       Workspace$Type type = p1.a1();
       if (type != Workspace$Type.KTV_SONG && type != Workspace$Type.KTV_MV) {
          return;
       }
       EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[0];
       p0.setAudioAssets(uAudioAssetA);
       EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub = new EditorSdk2V2$AnimatedSubAsset[0];
       p0.setAnimatedSubAssets(uAnimatedSub);
       return;
    }
    public int g(){
       return 1;
    }
    public final void h(Minecraft$AudioFilterParam p0,Karaoke p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KaraokeLoaderV2.class, "7")) {
          return;
       }
       KaraokeGeneral general = p1.getGeneral();
       p0.setEnableAgc(general.getEnableAgc());
       p0.setAgcTargetEnergy(general.getAgcTargetEnergy());
       p0.setOriginAudioMaxValue(general.getOriginAudioMaxValue());
       int i = 0;
       if (Dva.instance().isLoaded("voice_detect") && Dva.instance().isLoaded("mmu")) {
          p0.setEnableDenoise(general.getDenoise());
          Object[] objArray = new Object[i];
          f.D().w("KaraokeLoader", "load: mmu voice_detect has loaded enableDenoise="+general.getDenoise(), objArray);
       }else {
          Object[] objArray2 = new Object[i];
          f.D().A("KaraokeLoader", "load: mmu voice_detect not ready", objArray2);
          p0.setEnableDenoise(i);
       }
       p0.setDenoiseModelDir(d.a(0x14d6f666).Fw());
       Object[] objArray1 = new Object[i];
       f.D().w("KaraokeLoader", "load: set denoiseModelDir "+p0.denoiseModelDir(), objArray1);
       p0.setNoiseLevel(-10);
       p0.setQualityLevel(4);
       if (p1.hasMixing()) {
          p0.setAudioEffectType(p1.getMixing().getSdkType());
       }
       if (p1.hasVoiceChange()) {
          p0.setAudioChangeType(p1.getVoiceChange().getSdkType());
       }
       return;
    }
}
