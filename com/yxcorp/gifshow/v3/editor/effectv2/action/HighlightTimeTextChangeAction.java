package com.yxcorp.gifshow.v3.editor.effectv2.action.HighlightTimeTextChangeAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import raa.e;
import haa.a;
import maa.a;
import lqc.d;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.HighlightTimeEffect$b;
import com.kuaishou.edit.draft.EditLyric;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.EditLyric$b;
import java.lang.RuntimeException;
import com.kwai.robust.PatchProxyResult;

public final class HighlightTimeTextChangeAction extends EditSdkAction	// class@000f46
{
    public final String currentTrackIdentifier;
    public final String text;

    public void HighlightTimeTextChangeAction(String p0,String p1){
       a.p(p0, "text");
       a.p(p1, "currentTrackIdentifier");
       super();
       this.text = p0;
       this.currentTrackIdentifier = p1;
    }
    public final String getCurrentTrackIdentifier(){
       return this.currentTrackIdentifier;
    }
    public final String getText(){
       return this.text;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HighlightTimeTextChangeAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       e uoe = a.l(p0);
       int i = d.a.b(this.currentTrackIdentifier, uoe, a.c(p0));
       Object[] objArray = new Object[0];
       a.D().w("HighlightTimeTextChangeAction", "performAction text:"+this.text+" currentTrackIdentifier:"+this.currentTrackIdentifier, objArray);
       if (i < 0) {
          throw new RuntimeException("HighlightTimeTextChangeAction performAction highlightTimeEffectIndex invalid currentTrackIdentifier:"+this.currentTrackIdentifier);
       }
       GeneratedMessageLite$Builder uBuilder = uoe.n(i);
       a.o(uBuilder, "highlightTimeEffectDraft¡­highlightTimeEffectIndex\)");
       EditLyric$b uob = uBuilder.getText().toBuilder();
       uob.c();
       uob.a(this.text);
       uBuilder.b(uob.build());
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, HighlightTimeTextChangeAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HighlightTimeTextChangeAction\(text=\'"+this.text+"\', currentTrackIdentifier=\'"+this.currentTrackIdentifier+"\'\)";
    }
}
