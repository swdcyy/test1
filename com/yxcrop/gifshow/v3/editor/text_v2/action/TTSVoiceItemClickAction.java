package com.yxcrop.gifshow.v3.editor.text_v2.action.TTSVoiceItemClickAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import java.lang.String;
import jod.e;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
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
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.TtsAudio$b;
import com.kuaishou.edit.draft.TtsAudio;

public final class TTSVoiceItemClickAction extends EditDraftAction	// class@000b17
{
    public final String identifier;
    public final e item;
    public final int volume;

    public void TTSVoiceItemClickAction(String p0,e p1,int p2){
       a.p(p0, "identifier");
       a.p(p1, "item");
       super(false, 1, null);
       this.identifier = p0;
       this.item = p1;
       this.volume = p2;
    }
    public final String getIdentifier(){
       return this.identifier;
    }
    public final e getItem(){
       return this.item;
    }
    public final int getVolume(){
       return this.volume;
    }
    public void performAction(c p0,c p1){
       g a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TTSVoiceItemClickAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.Z0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.ttsDraft ?: return");
          a = g.a;
          TTSVoiceItemClickAction tidentifier = this.identifier;
          TTSVoiceItemClickAction titem = this.item;
          float f = ((float)this.volume * 0x3f800000) / (float)200;
          Objects.requireNonNull(a);
          if (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidFourRefs(uoa, tidentifier, titem, Float.valueOf(f), a, g.class, "5")) {
             a.p(uoa, "ttsDraft");
             a.p(tidentifier, "identifier");
             a.p(titem, "item");
             int i = 0;
             if (!uoa.z().size()) {
                Object[] objArray = new Object[i];
                a.D().w("TTSDraftUtil", "saveTTSWhenAudition ttsDraft is empty, need append", objArray);
                uoa.b().build();
             }
             int i1 = a.f(tidentifier, uoa);
             GeneratedMessageLite$Builder uBuilder = uoa.n(i);
             a.o(uBuilder, "ttsDraft.getBuilder\(0\)");
             TtsAudio$b uob = TtsAudio.newBuilder();
             a.o(uob, "ttsAudioBuilder");
             uob.d(titem.c());
             uob.b(titem.b());
             uob.g(f);
             uob.f(tidentifier);
             uob.e(titem.d());
             if (i1 < 0) {
                Object[] objArray1 = new Object[i];
                a.D().w("TTSDraftUtil", "saveTTSWhenAudition doesn\'t have match tts audio, need add", objArray1);
                uBuilder.a(uob.build());
             }else {
                uBuilder.g(i1, uob.build());
             }
          }
       }
       return;
    }
}
