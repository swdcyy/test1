package com.yxcorp.gifshow.edit.previewer.loaderv2.a0;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jba.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Tts;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import com.google.common.collect.Lists;
import java.util.Iterator;
import com.kuaishou.edit.draft.TtsAudio;
import hba.a;
import haa.a;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.StickerResult;
import com.yxcorp.gifshow.edit.previewer.loaderv2.cache.BizCache;
import rba.b;
import rba.c;
import sba.h;
import android.util.Pair;
import java.io.File;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.q;
import java.lang.Integer;
import com.kuaishou.edit.draft.TimeRange;
import com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils;
import qkd.b;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils$AssetIdType;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import java.lang.Math;
import haa.f;
import q87.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Tts$b;
import java.util.Collections;
import com.yxcorp.gifshow.edit.previewer.loaderv2.z;
import java.util.Comparator;

public class a0 extends a	// class@001b2c
{
    public a h;
    public boolean i;

    public void a0(){
       super();
       this.i = false;
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a0.class, "1")) {
          return;
       }
       this.h = this.a.Z0();
       return;
    }
    public void d(){
       File uFile;
       boolean b;
       Object obj = this;
       a0 uoa0 = a0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, uoa0, "3")) {
          return;
       }
       Tts tts = obj.h.v();
       if (tts == null || !tts.getTtsAudiosCount()) {
          this.h();
          return;
       }else {
          ArrayList uArrayList = new ArrayList();
          if (obj.b.audioAssetsSize()) {
             uArrayList.addAll(Arrays.asList(obj.b.audioAssets().toNormalArray()));
          }
          ArrayList uArrayList1 = Lists.b();
          Iterator iterator = tts.getTtsAudiosList().iterator();
          List list = null;
          while (iterator.hasNext()) {
             TtsAudio ttsAudio = iterator.next();
             Iterator iterator1 = a.r(obj.a).z().iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   if ((ttsAudio.getTextIdentifier()).equals(iterator1.next().getResult().getIdentifier())) {
                      uFile = obj.d.c(BizCache.EffectiveFile).g(new Pair(ttsAudio.getFile(), obj.h));
                   }
                }else {
                   uFile = objArray;
                }
                String obj1 = PatchProxy.applyOneRefs(ttsAudio, obj, uoa0, "4");
                a0 uoa01 = 1;
                if (obj1 != PatchProxyResult.class) {
                   b = obj1.booleanValue();
                }else {
                   obj1 = ttsAudio.getTextIdentifier();
                   if (!TextUtils.x(obj1)) {
                      a uoa = a.r(obj.a);
                      if (!q.f(uoa.z())) {
                         Iterator iterator2 = uoa.z().iterator();
                         while (true) {
                            if (iterator2.hasNext()) {
                               if (obj1.equals(iterator2.next().getResult().getIdentifier())) {
                                  b = true;
                               }else {
                                  continue ;
                               }
                            }
                         }
                      }
                   }
                   b = false;
                }
                if (!b) {
                   uArrayList1.add(Integer.valueOf(tts.getTtsAudiosList().indexOf(ttsAudio)));
                }else if(uFile == null || !uFile.exists()){
                   Object[] objArray1 = new Object[list];
                   f.D().A("TtsLoader", "cacheFile not exists or cannot copy from draft file", objArray1);
                   uArrayList1.add(Integer.valueOf(tts.getTtsAudiosList().indexOf(ttsAudio)));
                   continue ;
                }else {
                   double d = AudioAssetUtils.e(ttsAudio.getTextIdentifier(), ttsAudio.getRange().getStart(), a.r(obj.a), obj.b);
                   if (!b.S(uFile) || uFile.length() - null <= 0) {
                      continue ;
                   }else {
                      EditorSdk2V2$AudioAsset uAudioAsset = EditorSdk2UtilsV2.openAudioAsset(uFile.getAbsolutePath(), (double)ttsAudio.getVolume(), uoa01);
                      uAudioAsset.setAssetId((long)AudioAssetUtils.a(AudioAssetUtils$AssetIdType.SPEECH_AUDIO_ASSET));
                      int i = uAudioAsset.assetAudioFlag() | list;
                      uAudioAsset.setAssetAudioFlag(i);
                      uAudioAsset.setDisplayRange(new EditorSdk2$TimeRange());
                      uAudioAsset.displayRange().setStart(d);
                      double d1 = EditorSdk2UtilsV2.getComputedDuration(obj.b) - d;
                      uAudioAsset.displayRange().setDuration(Math.max(d1, ttsAudio.getRange().getDuration()));
                      uAudioAsset.setIsRepeat(list);
                      uArrayList.add(uAudioAsset);
                      continue ;
                   }
                }
             }
          }
          EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[uArrayList.size()];
          obj.b.setAudioAssets(uArrayList.toArray(uAudioAssetA));
          if (!PatchProxy.applyVoidOneRefs(uArrayList1, obj, uoa0, "5") && !q.f(uArrayList1)) {
             obj.h.c0();
             Tts$b uob = obj.h.k();
             Collections.sort(uArrayList1);
             Collections.reverse(uArrayList1);
             Iterator iterator3 = uArrayList1.iterator();
             while (iterator3.hasNext()) {
                uob.c(iterator3.next().intValue());
             }
             uob.build();
             obj.h.g(list);
          }
          this.h();
          obj.b.audioAssetsSize();
          return;
       }
    }
    public void f(EditorSdk2V2$VideoEditorProject p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a0.class, "2")) {
          return;
       }
       Tts tts = a.t(p1).v();
       if (tts != null && tts.getTtsAudiosCount()) {
          EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[0];
          p0.setAudioAssets(uAudioAssetA);
       }
       return;
    }
    public int g(){
       return 1;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, a0.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       f.D().w("TtsLoader", "orderAudio", objArray);
       ArrayList uArrayList = new ArrayList();
       uArrayList.addAll(this.b.audioAssets().getArrayList());
       Collections.sort(uArrayList, z.b);
       EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[0];
       this.b.setAudioAssets(uArrayList.toArray(uAudioAssetA));
       return;
    }
}
