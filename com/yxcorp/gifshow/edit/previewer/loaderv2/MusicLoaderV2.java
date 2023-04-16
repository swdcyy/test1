package com.yxcorp.gifshow.edit.previewer.loaderv2.MusicLoaderV2;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import pba.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yaa.c;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import lba.a;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Iterator;
import com.kuaishou.edit.draft.Music;
import com.kuaishou.edit.draft.Music$Type;
import com.kuaishou.edit.draft.ImportMusicParam;
import com.kuaishou.edit.draft.TimeRange;
import com.kuaishou.edit.draft.Song;
import com.kuaishou.edit.draft.OnlineMusicParam;
import com.kuaishou.edit.draft.OperationMusicParam;
import com.yxcorp.gifshow.edit.previewer.loaderv2.cache.BizCache;
import rba.b;
import rba.c;
import sba.h;
import android.util.Pair;
import java.io.File;
import qkd.b;
import sba.c;
import sba.c$a;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.yxcorp.gifshow.media.util.c;
import com.yxcorp.gifshow.music.utils.g;
import java.lang.Double;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import wba.u;
import com.kuaishou.webkit.URLUtil;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.Math;
import wba.d0;
import com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils$AssetIdType;
import com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.OriginalVoice;
import com.kuaishou.edit.draft.VoiceChange;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioFilterParam;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kuaishou.edit.draft.Workspace$Source;
import haa.f;
import q87.c;
import java.lang.StringBuilder;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioVolumeRange;
import com.kuaishou.edit.draft.VolumeRange;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import java.lang.Float;
import w46.b;
import maa.a;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import java.util.ArrayList;
import com.kuaishou.edit.draft.Asset;
import fba.a;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.util.LinkedList;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.util.Collection;
import ekd.q;
import w46.a;
import w46.a$a;
import com.kwai.feature.post.log.PostCommonBiz;
import com.yxcorp.gifshow.edit.previewer.loaderv2.MusicLoaderV2$MusicFileInvalidException;
import com.yxcorp.gifshow.edit.previewer.loaderv2.MusicLoaderV2$a;
import oa9.b;
import com.yxcorp.gifshow.biz.monitor.log.BizLogger;
import com.yxcorp.gifshow.util.PostUtils;

public class MusicLoaderV2 extends a	// class@001b28
{
    public c h;
    public a i;
    public a$a j;
    public a k;

    public void MusicLoaderV2(){
       super();
       this.k = new a();
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicLoaderV2.class, "1")) {
          return;
       }
       this.j = p0;
       this.h = this.a.J0();
       this.i = this.a.g1();
       return;
    }
    public void d(){
       TimeRange selectedRang;
       Song song;
       TimeRange timeRange;
       Song song1;
       a uoa;
       Object[] this;
       Iterator iterator1;
       EditorSdk2V2$AudioAsset uAudioAsset;
       int sdkType;
       float f;
       EditorSdk2V2$AudioAsset uAudioAsset1;
       Object[] objArray2;
       Minecraft$Range range;
       Object[] objArray5;
       Minecraft$Range obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, MusicLoaderV2.class, "3")) {
          return;
       }
       Iterator iterator = obj.h.z().iterator();
       int i = 1;
       int i1 = 0;
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          if (obj1.getType() == Music$Type.IMPORT) {
             selectedRang = (obj1.getImportParam().hasSelectedRange())? obj1.getImportParam().getSelectedRange(): objArray;
             if (obj1.getImportParam().hasSong()) {
                song = obj1.getImportParam().getSong();
             label_0055 :
                timeRange = selectedRang;
                song1 = song;
             label_00bc :
                if (PatchProxy.applyVoidThreeRefs(timeRange, song1, obj1, this, MusicLoaderV2.class, "4")) {
                label_00cb :
                   uoa = obj;
                   this = objArray;
                   iterator1 = iterator;
                }else {
                   BizCache effectiveFil = BizCache.EffectiveFile;
                   File uFile = obj.d.c(effectiveFil).g(new Pair(obj1.getFile(), obj.h));
                   String str = null;
                   if (b.S(uFile) && uFile.length() - str > 0) {
                      int i2 = obj1.getDisableLoop() ^ i;
                      uAudioAsset = obj.d.c(BizCache.AudioAsset).e(new c$a(uFile.getAbsolutePath(), (double)obj1.getVolume(), i2));
                      if (obj1.getDelay()) {
                         u.o(obj.a, obj1, obj.b, uAudioAsset, Double.valueOf(g.e((long)c.i(uFile.getAbsolutePath()))));
                      }
                   }else if(song1 == null){
                      obj.h("makeAudioAssetToProject: music file is invalid and song is null");
                      goto label_00cb ;
                   }else if(URLUtil.isNetworkUrl(song1.getFile())){
                      objArray5 = objArray;
                   }else {
                      objArray5 = obj.d.c(effectiveFil).g(new Pair(song1.getFile(), obj.h));
                   }
                   if (!b.S(objArray5) || objArray5.length() - str <= 0) {
                      uoa = obj;
                      this = objArray;
                      iterator1 = iterator;
                      uoa.h("makeAudioAssetToProject: music file and song are both invalid");
                   }else {
                      int i4 = obj1.getDisableLoop() ^ i;
                      uAudioAsset = obj.d.c(BizCache.AudioAsset).e(new c$a(objArray5.getAbsolutePath(), (double)obj1.getVolume(), i4));
                      uAudioAsset.setVolume((double)obj1.getVolume());
                      if (timeRange != null) {
                         if (obj.b.isKwaiPhotoMovie()) {
                            uAudioAsset.setClippedRange(EditorSdk2UtilsV2.createTimeRange(timeRange.getStart(), timeRange.getDuration()));
                         }else {
                            d0.s(uAudioAsset, timeRange.getStart(), Math.max(EditorSdk2UtilsV2.getComputedDuration(obj.b), EditorSdk2UtilsV2.getDisplayDuration(obj.b)), timeRange.getDuration());
                         }
                      }else {
                         obj.h("makeAudioAssetToProject: song is valid but time range is null");
                      }
                   }
                   uAudioAsset.setAssetAudioFlag(i1);
                   if (u.j(obj1)) {
                      if (obj1.getType() == Music$Type.RECORD) {
                         uAudioAsset.setAssetId((long)AudioAssetUtils.a(AudioAssetUtils$AssetIdType.RECORD_AUDIO_ASSET));
                      }
                      MusicLoaderV2 i3 = obj.i;
                      OriginalVoice originalVoic = (i3 != null)? i3.v(): objArray;
                      if (originalVoic != null) {
                         sdkType = (originalVoic.hasVoiceChange())? originalVoic.getVoiceChange().getSdkType(): 0;
                         uAudioAsset.setAudioFilterParam(EditorSdk2Utils.createAudioFilterParam(sdkType, i1, i1));
                      }
                   }else {
                      uAudioAsset.setAssetId((long)AudioAssetUtils.a(AudioAssetUtils$AssetIdType.MUSIC_AUDIO_ASSET));
                   }
                   double loudness = obj1.getLoudness();
                   if (loudness < 0) {
                      if (uAudioAsset.audioFilterParam() == null) {
                         uAudioAsset.setAudioFilterParam(EditorSdk2Utils.createAudioFilterParam(i1, i1, i1));
                      }
                      uAudioAsset.audioFilterParam().setLoudness(loudness);
                      uAudioAsset.audioFilterParam().setEnableAutoGain(i);
                   }
                   String str1 = "MusicLoader";
                   if (!PatchProxy.applyVoidTwoRefs(obj1, uAudioAsset, obj, MusicLoaderV2.class, "5")) {
                      double str5 = obj1.getFadeInTime();
                      double fadeOutTime = obj1.getFadeOutTime();
                      EditorSdk2V2$AudioAsset uAudioAsset2 = 0x4000000000000000;
                      if (obj.a.T0() == Workspace$Source.ANNUAL_ALBUM_2022 || obj.a.T0() == Workspace$Source.ANNUAL_ALBUM_2022_LOCAL) {
                         str5 = uAudioAsset2;
                         fadeOutTime = str5;
                      }
                      if (!str5 && !fadeOutTime) {
                         this = new Object[i1];
                         f.D().w(str1, "loadFadeTime fade time is 0", this);
                      }else {
                         iterator1 = iterator;
                         u.p(uAudioAsset, obj1.getFadeInTime(), obj1.getFadeOutTime());
                         u.o(obj.a, obj1, obj.b, uAudioAsset, null);
                         f uof = f.D();
                         StringBuilder str6 = " fadeInTime:"+str5+"fadeOutTime:"+fadeOutTime+", displayDuration:";
                         str5 = (uAudioAsset.displayRange() == null)? 0: uAudioAsset.displayRange().duration();
                         Object[] objArray4 = new Object[0];
                         uof.w(str1, str6+str5, objArray4);
                      label_02e6 :
                         if (obj.a.a1() == Workspace$Type.AI_CUT || obj.a.a1() == Workspace$Type.ALBUM_MOVIE) {
                            a a = obj.a;
                            a str2 = obj.b;
                            f = 0.40f;
                            if (!PatchProxy.isSupport(d0.class) || !PatchProxy.applyVoidFourRefs(uAudioAsset, a, str2, Float.valueOf(f), null, d0.class, "35")) {
                               String str3 = "PostEditorSdkUtil";
                               if (a == null) {
                                  this = new Object[0];
                                  f.D().t(str3, "makeAudioLowVolumeFromAsset: workspaceDraft is null", this);
                               }else {
                                  a uoa1 = a.g1();
                                  a uoa2 = a.o0();
                                  if (uoa1 == null || uoa2 == null) {
                                     uAudioAsset1 = uAudioAsset;
                                     Object[] objArray1 = new Object[0];
                                     f.D().t(str3, "makeAudioLowVolumeFromAsset: sub draft is null", objArray1);
                                  label_04aa :
                                     if (!obj1.getDelay()) {
                                        uoa = this;
                                        this = null;
                                        u.o(uoa.a, obj1, uoa.b, uAudioAsset1, this);
                                     }else {
                                        this = null;
                                        uoa = this;
                                     }
                                     LinkedList linkedList = new LinkedList();
                                     linkedList.addAll(uoa.b.audioAssets().getArrayList());
                                     linkedList.add(uAudioAsset1);
                                     EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[0];
                                     uoa.b.setAudioAssets(linkedList.toArray(uAudioAssetA));
                                  }else {
                                     List list = uoa2.z();
                                     if (list.isEmpty()) {
                                        i1.c(new RuntimeException("makeAudioLowVolumeFromAsset error asset is empty"));
                                     }else if(uoa1.v() != null && uoa1.v().getVolume() - null > 0){
                                        sdkType = 1;
                                        if ((str2.muteFlags() & sdkType) != sdkType) {
                                           iterator = 1;
                                        label_03f6 :
                                           ArrayList uArrayList = new ArrayList();
                                           Iterator iterator2 = list.iterator();
                                           while (true) {
                                              objArray2 = null;
                                              break ;
                                           }
                                           while (true) {
                                              if (iterator2.hasNext()) {
                                                 Asset uAsset = iterator2.next();
                                                 if (uAsset.getIsVocal()) {
                                                    EditorSdk2$TimeRange timeRange1 = d0.e(uAsset, str2, DraftUtils.E(a.n0()));
                                                    if (timeRange1 == null) {
                                                       objArray2 = new Object[0];
                                                       f.D().t(str3, "makeAudioLowVolumeFromAsset: no matched displayRange", objArray2);
                                                    }else if(objArray2){
                                                       sdkType = uArrayList.size() - 1;
                                                       range = uArrayList.get(sdkType).timeRange();
                                                       double d = range.duration() + timeRange1.duration();
                                                       range.setDuration(d);
                                                    }else {
                                                       Minecraft$AudioVolumeRange uAudioVolume = new Minecraft$AudioVolumeRange();
                                                       obj = new Minecraft$Range();
                                                       uAudioAsset1 = uAudioAsset;
                                                       obj.setStart(timeRange1.start());
                                                       obj.setDuration(timeRange1.duration());
                                                       uAudioVolume.setTimeRange(obj);
                                                       double d1 = (iterator)? (double)f * uAudioAsset1.volume(): uAudioAsset1.volume();
                                                       uAudioVolume.setVolume(d1);
                                                       uAudioVolume.setFadeTime(0x3fe0000000000000);
                                                       uArrayList.add(uAudioVolume);
                                                    label_0485 :
                                                       uAudioAsset = uAudioAsset1;
                                                       objArray2 = uAsset.getIsVocal();
                                                    }
                                                 }
                                                 uAudioAsset1 = uAudioAsset;
                                                 goto label_0485 ;
                                              }else {
                                                 uAudioAsset1 = uAudioAsset;
                                                 Minecraft$AudioVolumeRange[] uAudioVolume1 = new Minecraft$AudioVolumeRange[0];
                                                 uAudioAsset1.setAudioVolumeRanges(uArrayList.toArray(uAudioVolume1));
                                                 goto label_04aa ;
                                              }
                                           }
                                        }
                                     }
                                     iterator = null;
                                     goto label_03f6 ;
                                  }
                               }
                            }
                         }else if(PatchProxy.applyVoidTwoRefs(obj1, uAudioAsset, obj, MusicLoaderV2.class, "6")){
                            if (!obj1.getVolumeRangesCount()) {
                               Object[] objArray3 = new Object[0];
                               f.D().w(str1, "loadVolumeRanges volume range is empty", objArray3);
                            }else {
                               Minecraft$AudioVolumeRange[] uAudioVolume2 = new Minecraft$AudioVolumeRange[obj1.getVolumeRangesCount()];
                               uAudioAsset.setAudioVolumeRanges(uAudioVolume2);
                               Iterator iterator3 = obj1.getVolumeRangesList().iterator();
                               while (iterator3.hasNext()) {
                                  VolumeRange volumeRange = iterator3.next();
                                  Minecraft$AudioVolumeRange str4 = new Minecraft$AudioVolumeRange();
                                  str4.setFadeTime(volumeRange.getFadeTime());
                                  str4.setVolume(volumeRange.getVolume());
                                  str4.setTimeRange(new Minecraft$Range());
                                  str4.timeRange().setStart(volumeRange.getVolumeRange().getStart());
                                  str4.timeRange().setDuration(volumeRange.getVolumeRange().getDuration());
                               }
                               u.o(obj.a, obj1, obj.b, uAudioAsset, null);
                            }
                         }
                         uAudioAsset1 = uAudioAsset;
                         goto label_04aa ;
                      }
                   }
                   iterator1 = iterator;
                   goto label_02e6 ;
                }
                obj = uoa;
                objArray = this;
                iterator = iterator1;
             }
          }else if(obj1.getType() == Music$Type.ONLINE){
             selectedRang = (obj1.getOnlineParam().hasSelectedRange())? obj1.getOnlineParam().getSelectedRange(): objArray;
             if (obj1.getOnlineParam().hasSong()) {
                song = obj1.getOnlineParam().getSong();
                goto label_0055 ;
             }
          }else if(obj1.getType() == Music$Type.OPERATION){
             selectedRang = (obj1.getOperationParam().hasSelectedRange())? obj1.getOperationParam().getSelectedRange(): objArray;
             if (obj1.getOperationParam().hasSong()) {
                song = obj1.getOperationParam().getSong();
                goto label_0055 ;
             }
          }else {
             objArray2 = objArray;
             song1 = objArray2;
             goto label_00bc ;
          }
          timeRange = selectedRang;
          song1 = objArray;
          goto label_00bc ;
       }
       Object obj2 = obj;
       this = new Object[0];
       obj2.k.b(obj2.j, this);
       obj2.k.e(true);
       obj2.b.audioAssetsSize();
       return;
    }
    public void f(EditorSdk2V2$VideoEditorProject p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicLoaderV2.class, "2")) {
          return;
       }
       if (p1.J0() != null && !q.f(p1.J0().z())) {
          EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[0];
          p0.setAudioAssets(uAudioAssetA);
       }
       return;
    }
    public int g(){
       return 1;
    }
    public final void h(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicLoaderV2.class, "7")) {
          return;
       }
       a.f.a().d(PostCommonBiz.EDIT, "MusicLoader", p0, new MusicLoaderV2$MusicFileInvalidException(null));
       PostUtils.D("MusicLoader", p0, new MusicLoaderV2$MusicFileInvalidException(null));
       return;
    }
}
