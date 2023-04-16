package com.yxcrop.gifshow.v3.editor.sticker_v2.action.UpdateStickerAttachInfoAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import mmd.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class UpdateStickerAttachInfoAction extends EditDraftAction	// class@000a56
{
    public final a attachInfo;

    public void UpdateStickerAttachInfoAction(a p0){
       super(false, 1, null);
       this.attachInfo = p0;
    }
    public final a getAttachInfo(){
       return this.attachInfo;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UpdateStickerAttachInfoAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       return;
    }
}
