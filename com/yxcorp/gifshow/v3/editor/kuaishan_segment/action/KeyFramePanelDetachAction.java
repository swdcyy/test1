package com.yxcorp.gifshow.v3.editor.kuaishan_segment.action.KeyFramePanelDetachAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import maa.a;
import haa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import vaa.a;
import qaa.a;

public final class KeyFramePanelDetachAction extends EditSdkAction	// class@00100e
{
    public final boolean savedChanges;

    public void KeyFramePanelDetachAction(boolean p0){
       super();
       this.savedChanges = p0;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KeyFramePanelDetachAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       Object[] objArray = new Object[0];
       a.D().w("KeyFramePanelDetachAction", "performAction savedChanges:"+this.savedChanges, objArray);
       if (this.savedChanges != null) {
          a.c(p0).f();
          a.m(p0).f();
          a.f(p0).f();
       }else {
          a.c(p0).j();
          a.m(p0).j();
          a.f(p0).j();
       }
       return;
    }
}
