package com.yxcorp.gifshow.edit.previewer.loaderv2.e;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lba.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import raa.e;
import haa.a;
import maa.a;
import raa.g;
import com.yxcorp.gifshow.edit.draft.model.c;
import haa.f;
import q87.c;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.OriginalVoice;
import wba.o;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.TimeEffect;
import java.util.Objects;
import com.kuaishou.edit.draft.VoiceChange;
import java.util.ArrayList;
import com.kuaishou.edit.draft.HighlightTimeEffect;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.kuaishou.edit.draft.TimeRange;
import wba.d;
import sba.c$a;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.yxcorp.gifshow.edit.previewer.loaderv2.cache.BizCache;
import rba.b;
import rba.c;
import sba.c;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils$AssetIdType;
import com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioFilterParam;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import java.util.LinkedList;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.Collection;
import com.kuaishou.edit.draft.Workspace$Type;
import java.util.Arrays;
import sba.h;
import android.util.Pair;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.edit.previewer.loaderv2.PreviewLoaderException;

public class e extends a	// class@001b3d
{
    public e h;
    public a i;
    public a j;
    public g k;

    public void e(){
       super();
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       this.i = this.a.g1();
       this.h = a.l(this.a);
       this.j = a.c(this.a);
       this.k = a.s(this.a);
       return;
    }
    public void d(){
       OriginalVoice originalVoic;
       Iterator iterator;
       EditorSdk2V2$AudioAsset uAudioAsset;
       a b;
       float f;
       int b1;
       boolean i2;
       Object obj = this;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, uoe, "3")) {
          return;
       }
       String str = "AudioAssetLoaderV2";
       String str1 = 1;
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, obj, uoe, "4")) {
          if (obj.h.E()) {
             objArray = new Object[i];
             f.D().w(str, "loadHighlightTimeAudio empty return", objArray);
          }else {
             originalVoic = obj.i.v();
             f = (originalVoic == null)? 0x3f800000: originalVoic.getVolume();
             e k = obj.k;
             String str3 = "1";
             HighlightTimeEffect obj1 = PatchProxy.applyOneRefs(k, objArray, o.class, str3);
             if (obj1 != PatchProxyResult.class) {
                b1 = obj1.booleanValue();
             }else {
                a.p(k, "effectDraft");
                List list = k.z();
                a.o(list, "effectDraft.messages");
                iterator = list.iterator();
                e uoe1 = null;
                while (iterator.hasNext()) {
                   TimeEffect timeEffect = iterator.next();
                   a.o(timeEffect, "it");
                   Objects.requireNonNull(o.a);
                   i2 = (timeEffect.getSdkType() == 3)? true: false;
                   if (i2) {
                      uoe1 = 1;
                   }
                }
                b1 = uoe1;
             }
             if (b1) {
                f = 0;
             }
             if (originalVoic != null) {
                objArray = originalVoic.getVoiceChange();
             }
             ArrayList uArrayList1 = new ArrayList();
             b1 = 0;
             while (b1 < obj.h.p()) {
                obj1 = obj.h.y(b1);
                File uFile1 = DraftFileManager.E().B(obj1.getMusisFile(), obj.h);
                if (uFile1 == null) {
                   PostUtils.D(str, "loadHighlightTimeAudio ", new RuntimeException("musicFile is null"));
                }else {
                   c$a uoa = new c$a(uFile1.getAbsolutePath(), (double)f, i);
                   EditorSdk2$TimeRange timeRange = new EditorSdk2$TimeRange();
                   double d = d.e(obj.j, obj1.getAssetIdentifier(), i).getStart() + obj1.getMusicTimeRange().getStart();
                   timeRange.setStart(d);
                   timeRange.setDuration(obj1.getMusicTimeRange().getDuration());
                   if (!PatchProxy.applyVoidOneRefs(timeRange, uoa, c$a.class, str3)) {
                      a.p(timeRange, "<set-?>");
                      uoa.a = timeRange;
                   }
                   uAudioAsset = obj.d.c(BizCache.AudioAsset).e(uoa);
                   uAudioAsset.setAssetId((long)AudioAssetUtils.a(AudioAssetUtils$AssetIdType.HIGHLIGHT_TIME_AUDIO_ASSET));
                   i2 = uAudioAsset.assetAudioFlag() | str1;
                   uAudioAsset.setAssetAudioFlag(i2);
                   i2 = (objArray != null)? objArray.getSdkType(): 0;
                   if (i2) {
                      uAudioAsset.setAudioFilterParam(EditorSdk2Utils.createAudioFilterParam(i2, i, i));
                   }
                   uArrayList1.add(uAudioAsset);
                }
                b1 = b1 + 1;
             }
             LinkedList linkedList = new LinkedList();
             linkedList.addAll(obj.b.audioAssets().getArrayList());
             linkedList.addAll(uArrayList1);
             EditorSdk2V2$AudioAsset[] uAudioAssetA1 = new EditorSdk2V2$AudioAsset[i];
             obj.b.setAudioAssets(linkedList.toArray(uAudioAssetA1));
          }
       }
       originalVoic = obj.i.v();
       if (originalVoic != null && originalVoic.getAudioAssetsCount()) {
          Workspace$Type type = obj.a.a1();
          if (type == Workspace$Type.KTV_MV || type == Workspace$Type.KTV_SONG) {
             objArray = new Object[i];
             f.D().w(str, "load exit reason: ktv don\'t need AudioAssetLoader", objArray);
          }else {
             ArrayList uArrayList = new ArrayList();
             if (obj.b.audioAssetsSize()) {
                uArrayList.addAll(Arrays.asList(obj.b.audioAssets().toNormalArray()));
             }
             int sdkType = (originalVoic.hasVoiceChange())? originalVoic.getVoiceChange().getSdkType(): 0;
             iterator = originalVoic.getAudioAssetsList().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   String str2 = iterator.next();
                   File uFile = obj.d.c(BizCache.EffectiveFile).g(new Pair(str2, obj.i));
                   if (uFile != null) {
                      uAudioAsset = obj.d.c(BizCache.AudioAsset).e(new c$a(uFile.getAbsolutePath(), (double)originalVoic.getVolume(), str1));
                      int i1 = uAudioAsset.assetAudioFlag() | str1;
                      uAudioAsset.setAssetAudioFlag(i1);
                      if (sdkType) {
                         uAudioAsset.setAudioFilterParam(EditorSdk2Utils.createAudioFilterParam(sdkType, i, i));
                      }
                      uArrayList.add(uAudioAsset);
                   }else {
                      Object[] objArray1 = new Object[i];
                      f.D().A(str, "Audio asset file not found: "+str2+", workspace "+obj.a.D0(), objArray1);
                      throw new PreviewLoaderException("Audio asset file not found.");
                   }
                }else if(!originalVoic.getMuteTrackAssets() || !originalVoic.getEditMuteTrackAsset()){
                   i = 1;
                }
                if (i) {
                   b = obj.b;
                   b.setMuteFlags((b.muteFlags() & 0xfe));
                   break ;
                }else {
                   b = obj.b;
                   b.setMuteFlags((b.muteFlags() | str1));
                   break ;
                }
             }
             EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[uArrayList.size()];
             obj.b.setAudioAssets(uArrayList.toArray(uAudioAssetA));
             return;
          }
       }
       return;
    }
    public void f(EditorSdk2V2$VideoEditorProject p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       if (p1.g1() == null || (p1.g1().v() != null && p1.g1().v().getAudioAssetsCount())) {
          EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[0];
          p0.setAudioAssets(uAudioAssetA);
       }
    label_0032 :
       return;
    }
    public int g(){
       return 1;
    }
}
