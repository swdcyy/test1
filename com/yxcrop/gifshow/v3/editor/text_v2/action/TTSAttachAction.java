package com.yxcrop.gifshow.v3.editor.text_v2.action.TTSAttachAction;
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
import com.yxcorp.gifshow.edit.draft.model.c;

public final class TTSAttachAction extends EditDraftAction	// class@000b0a
{

    public void TTSAttachAction(){
       super(false, 1, null);
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TTSAttachAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.Z0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.ttsDraft ?: return");
          uoa.c0();
       }
       return;
    }
}
