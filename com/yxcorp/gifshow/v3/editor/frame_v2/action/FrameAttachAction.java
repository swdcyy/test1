package com.yxcorp.gifshow.v3.editor.frame_v2.action.FrameAttachAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import taa.a;
import com.yxcorp.gifshow.edit.draft.model.c;

public final class FrameAttachAction extends EditSdkAction	// class@000f94
{

    public void FrameAttachAction(){
       super();
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrameAttachAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       a uoa = p0.P0();
       if (uoa != null && !uoa.D()) {
          uoa.c0();
       }
       return;
    }
}
