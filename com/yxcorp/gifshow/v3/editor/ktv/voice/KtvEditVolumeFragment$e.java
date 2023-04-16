package com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment$e;
import com.yxcorp.gifshow.music.KaraokeDoubleSeekBar$a;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment;
import java.lang.Object;
import com.yxcorp.gifshow.music.KaraokeDoubleSeekBar;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.yxcorp.gifshow.v3.previewer.ktv.p;
import com.yxcorp.gifshow.v3.editor.i;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioFilterParam;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import faa.a;
import w46.b;
import mwc.p;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Karaoke$b;
import com.kuaishou.edit.draft.KaraokeGeneral;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.KaraokeGeneral$b;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;

public class KtvEditVolumeFragment$e implements KaraokeDoubleSeekBar$a	// class@000ff9
{
    public final KtvEditVolumeFragment a;

    public void KtvEditVolumeFragment$e(KtvEditVolumeFragment p0){
       this.a = p0;
       super();
    }
    public void a(KaraokeDoubleSeekBar p0,int p1){
    }
    public void b(KaraokeDoubleSeekBar p0,int p1){
    }
    public void c(KaraokeDoubleSeekBar p0,int p1){
       KtvEditVolumeFragment$e uoe = KtvEditVolumeFragment$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1")) {
          return;
       }
       if (this.a.u.E()) {
          return;
       }
       try{
          if (p.l(this.a.v)) {
             EditorSdk2V2$TrackAsset[] trackAssetAr = p.f(this.a.t);
             if (trackAssetAr != null) {
                int len = trackAssetAr.length;
                for (int i = 0; i < len; i = i + 1) {
                   this.a.eh(trackAssetAr[i].audioFilterParam(), p1);
                }
             }
          }else {
             EditorSdk2V2$AudioAsset uAudioAsset = p.e(this.a.t);
             if (uAudioAsset == null) {
                return;
             }else {
                this.a.eh(uAudioAsset.audioFilterParam(), p1);
             }
          }
          p.q(this.a.t);
       }catch(java.lang.Exception e5){
          PostUtils.D("KtvEditVolumeFragment", "ktv fail to change volume ", e5);
          a.D().e("ktv_log", "fail to change volume ", e5);
       }
       p0.h = p1;
       Karaoke$b uob = this.a.u.k();
       KaraokeGeneral$b uob1 = uob.getGeneral().toBuilder();
       uob1.e(p1);
       uob1.b(DraftUtils.m0(uob1.getAttributes()));
       uob.c(uob1);
       return;
    }
}
