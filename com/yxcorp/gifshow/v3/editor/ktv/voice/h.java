package com.yxcorp.gifshow.v3.editor.ktv.voice.h;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditEffectFragment$a;
import ppb.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditEffectFragment;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Karaoke$b;
import mwc.p;
import com.kuaishou.edit.draft.VoiceChange;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.VoiceChange$b;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.InternalFeatureId;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import oa0.a;
import com.kuaishou.edit.draft.KaraokeMixing;
import com.kuaishou.edit.draft.KaraokeMixing$b;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.yxcorp.gifshow.v3.previewer.ktv.p;
import com.yxcorp.gifshow.v3.editor.i;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioFilterParam;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class h extends m	// class@001004
{
    public final a c;
    public final KtvEditEffectFragment$a d;

    public void h(KtvEditEffectFragment$a p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       FeatureId$b uob2;
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       KtvEditEffectFragment$a e = this.d.e;
       h tc = this.c;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidOneRefs(tc, e, KtvEditEffectFragment.class, "8") && !e.n.E()) {
          Karaoke$b uob = e.n.k();
          if (tc.c == null) {
             if (p.a().b() != tc.d) {
                p.a().e = tc.d;
                VoiceChange$b uob1 = uob.getVoiceChange().toBuilder();
                uob2 = FeatureId.newBuilder();
                uob2.b(tc.f);
                uob1.b(uob2);
                uob1.a(DraftUtils.m0(uob1.getAttributes()));
                uob1.c(tc.d);
                uob.f(uob1);
             }
          }else if(p.a().f() == tc.d){
             p.a().k(tc.d);
             a.f1(tc.d);
             KaraokeMixing$b uob3 = uob.getMixing().toBuilder();
             uob2 = FeatureId.newBuilder();
             uob2.b(tc.f);
             uob3.b(uob2);
             uob3.a(DraftUtils.m0(uob3.instance.getAttributes()));
             uob3.c(tc.d);
             uob.e(uob3);
          }
          int i = 0;
          if (p.l(e.o)) {
             EditorSdk2V2$TrackAsset[] trackAssetAr = p.f(e.m);
             if (trackAssetAr != null) {
                int len = trackAssetAr.length;
                for (int i1 = 0; i1 < len; i1 = i1 + 1) {
                   e.ch(trackAssetAr[i1].audioFilterParam(), tc);
                }
             }
          }else {
             EditorSdk2V2$AudioAsset uAudioAsset = p.e(e.m);
             if (uAudioAsset != null) {
                e.ch(uAudioAsset.audioFilterParam(), tc);
             }
          }
          p.q(e.m);
          Object[] objArray = new Object[i];
          a.D().w("ktv_log", "setEffect "+tc.d, objArray);
       }
    label_0113 :
       this.d.k0();
       return;
    }
}
