package com.yxcrop.gifshow.v3.editor.text_v2.action.TTSOriginDraftRestoreAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import rwc.j;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import wnd.g;
import java.util.Objects;
import faa.a;
import q87.c;
import jba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Tts$b;
import com.kuaishou.edit.draft.Tts;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.edit.draft.TtsAudio;
import java.lang.StringBuilder;
import com.kuaishou.edit.draft.TtsAudio$b;
import com.kuaishou.edit.draft.TimeRange;
import com.google.protobuf.GeneratedMessageLite;

public final class TTSOriginDraftRestoreAction extends EditSdkAction	// class@000b15
{
    public final j originDraftRef;

    public void TTSOriginDraftRestoreAction(){
       super(null, 1, null);
    }
    public void TTSOriginDraftRestoreAction(j p0){
       super();
       this.originDraftRef = p0;
    }
    public void TTSOriginDraftRestoreAction(j p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       super(p0);
       return;
    }
    public void performAction(c p0,c p1){
       g a;
       GeneratedMessageLite$Builder uBuilder;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TTSOriginDraftRestoreAction.class, "1")) {
          return;
       }
       String str = "workspaceDraft";
       a.p(p0, str);
       a.p(p1, "store");
       super.performAction(p0, p1);
       a = g.a;
       TTSOriginDraftRestoreAction toriginDraft = this.originDraftRef;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidTwoRefs(toriginDraft, p0, a, g.class, "15")) {
          a.p(p0, str);
          Object[] objArray = new Object[0];
          a.D().w("TTSDraftUtil", "restoreOriginTts: ", objArray);
          a uoa = p0.Z0();
          if (uoa != null) {
             a.o(uoa, "workspaceDraft.ttsDraft ?: return");
             if (toriginDraft != null) {
                if (!uoa.D()) {
                   uoa.c0();
                }
                uoa.k().b();
                String str1 = "ttsDraft.ensureFirstBuilder\(\)";
                if (toriginDraft.getValue() == null) {
                   Object[] objArray1 = new Object[0];
                   a.D().w("TTSDraftUtil", "restoreOriginTts: mOriginTts is null", objArray1);
                   uBuilder = uoa.k();
                   a.o(uBuilder, str1);
                   uBuilder.d(0);
                }else {
                   uBuilder = uoa.k();
                   a.o(uBuilder, str1);
                   Object value = toriginDraft.getValue();
                   a.m(value);
                   uBuilder.d(value.getApplyToAll());
                   uBuilder = toriginDraft.getValue();
                   a.m(uBuilder);
                   Iterator iterator = uBuilder.getTtsAudiosList().iterator();
                   while (iterator.hasNext()) {
                      TtsAudio ttsAudio = iterator.next();
                      a.o(ttsAudio, "ttsAudio");
                      Object[] objArray2 = new Object[0];
                      a.D().w("TTSDraftUtil", "restoreOriginTts: ttsAudio = "+ttsAudio.getFile(), objArray2);
                      TtsAudio$b uob = TtsAudio.newBuilder();
                      uob.d(ttsAudio.getSpeakerId());
                      uob.b(ttsAudio.getLanguageType());
                      uob.a(uoa.Q(ttsAudio.getFile()));
                      uob.f(ttsAudio.getTextIdentifier());
                      uob.g(ttsAudio.getVolume());
                      uob.c(ttsAudio.getRange());
                      uoa.k().a(uob.build());
                   }
                }
                if (uoa.D()) {
                   uoa.g(0);
                }
             }
          }
       }
       return;
    }
}
