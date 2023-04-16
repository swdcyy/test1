package com.yxcrop.gifshow.v3.editor.text_v2.action.TTSVolumeChangeAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import jba.a;
import wnd.g;
import java.util.Objects;
import java.lang.Float;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import faa.a;
import q87.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Tts$b;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.edit.draft.TtsAudio;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.TtsAudio$b;

public final class TTSVolumeChangeAction extends EditDraftAction	// class@000b19
{
    public final int progress;

    public void TTSVolumeChangeAction(int p0){
       super(false, 1, null);
       this.progress = p0;
    }
    public final int getProgress(){
       return this.progress;
    }
    public void performAction(c p0,c p1){
       g a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TTSVolumeChangeAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.Z0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.ttsDraft ?: return");
          a = g.a;
          float f = ((float)this.progress * 0x3f800000) / (float)200;
          Objects.requireNonNull(a);
          g og = g.class;
          if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidTwoRefs(uoa, Float.valueOf(f), a, og, "9")) {
             a.p(uoa, "ttsDraft");
             int i = 0;
             if (!uoa.z().size()) {
                Object[] objArray = new Object[i];
                a.D().w("TTSDraftUtil", "saveVolume ttsDraft is empty", objArray);
             }else {
                GeneratedMessageLite$Builder uBuilder = uoa.n(i);
                a.o(uBuilder, "ttsDraft.getBuilder\(0\)");
                List ttsAudiosLis = uBuilder.getTtsAudiosList();
                a.o(ttsAudiosLis, "ttsBuilder.ttsAudiosList");
                Iterator iterator = ttsAudiosLis.iterator();
                while (iterator.hasNext()) {
                   TtsAudio$b obj = iterator.next();
                   int i1 = i + 1;
                   if (i < 0) {
                      CollectionsKt__CollectionsKt.W();
                   }
                   obj = obj.toBuilder();
                   obj.g(f);
                   uBuilder.f(i, obj);
                   i = i1;
                }
                uBuilder.build();
             }
          }
       }
       return;
    }
}
