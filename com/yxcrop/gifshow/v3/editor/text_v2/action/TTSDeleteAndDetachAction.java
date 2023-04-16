package com.yxcrop.gifshow.v3.editor.text_v2.action.TTSDeleteAndDetachAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import jba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import wnd.g;

public final class TTSDeleteAndDetachAction extends EditSdkAction	// class@000b0e
{
    public final String identifier;
    public final boolean isApplyToAll;

    public void TTSDeleteAndDetachAction(boolean p0,String p1){
       a.p(p1, "identifier");
       super();
       this.isApplyToAll = p0;
       this.identifier = p1;
    }
    public final String getIdentifier(){
       return this.identifier;
    }
    public final boolean isApplyToAll(){
       return this.isApplyToAll;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TTSDeleteAndDetachAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.Z0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.ttsDraft ?: return");
          if (!uoa.D()) {
             uoa.c0();
          }
          g.a.a(uoa, this.isApplyToAll, this.identifier, p0);
          uoa.f();
       }
       return;
    }
}
