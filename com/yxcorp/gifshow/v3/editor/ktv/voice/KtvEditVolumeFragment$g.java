package com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment$g;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Karaoke$b;
import com.kuaishou.edit.draft.KaraokeGeneral;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.KaraokeGeneral$b;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import mwc.p;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.yxcorp.gifshow.v3.previewer.ktv.p;
import com.yxcorp.gifshow.v3.editor.i;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioFilterParam;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;

public class KtvEditVolumeFragment$g implements SlipSwitchButton$b	// class@000ffb
{
    public final KtvEditVolumeFragment a;

    public void KtvEditVolumeFragment$g(KtvEditVolumeFragment p0){
       this.a = p0;
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       KtvEditVolumeFragment$g og = KtvEditVolumeFragment$g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, og, "1")) {
          return;
       }
       if (!this.a.u.E()) {
          KtvEditVolumeFragment$g ta = this.a;
          if (ta.s != null) {
             Karaoke$b uob = ta.u.k();
             KaraokeGeneral$b uob1 = uob.getGeneral().toBuilder();
             uob1.c(p1);
             uob1.b(DraftUtils.m0(uob1.getAttributes()));
             uob.c(uob1);
             uob.c = p1;
             if (p.l(this.a.v)) {
                EditorSdk2V2$TrackAsset[] trackAssetAr = p.f(this.a.t);
                if (trackAssetAr != null) {
                   int len = trackAssetAr.length;
                   for (int i = 0; i < len; i = i + 1) {
                      this.a.dh(trackAssetAr[i].audioFilterParam(), p1);
                   }
                }
             }else {
                EditorSdk2V2$AudioAsset uAudioAsset = p.e(this.a.t);
                if (uAudioAsset != null) {
                   this.a.dh(uAudioAsset.audioFilterParam(), p1);
                }
             }
             p.q(this.a.t);
          }
       }
       return;
    }
}
