package com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.DiscardTemplateStickerAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import eba.a;
import com.yxcorp.gifshow.edit.draft.model.c;

public final class DiscardTemplateStickerAction extends EditDraftAction	// class@000a5c
{

    public void DiscardTemplateStickerAction(){
       super(false, 1, null);
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DiscardTemplateStickerAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.U0();
       if (uoa != null && uoa.D() == true) {
          a uoa1 = p0.U0();
          if (uoa1 != null) {
             uoa1.j();
          }
       }
       return;
    }
}
