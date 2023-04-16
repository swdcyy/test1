package com.yxcrop.gifshow.v3.editor.text_v2_share.action.timeline.DecorationTimelineAttachAction;
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
import hba.a;

public final class DecorationTimelineAttachAction extends EditDraftAction	// class@000b83
{
    public final boolean isSticker;
    public final boolean isSubtitle;

    public void DecorationTimelineAttachAction(boolean p0,boolean p1){
       super(false, 1, null);
       this.isSubtitle = p0;
       this.isSticker = p1;
    }
    public void DecorationTimelineAttachAction(boolean p0,boolean p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = false;
       }
       super(p0, p1);
       return;
    }
    public final boolean isSticker(){
       return this.isSticker;
    }
    public final boolean isSubtitle(){
       return this.isSubtitle;
    }
    public void performAction(c p0,c p1){
       a uoa;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DecorationTimelineAttachAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       if (this.isSticker != null) {
          uoa = p0.U0();
          if (uoa != null) {
             a.o(uoa, "workspaceDraft.stickerDraft ?: return");
             if (!uoa.D()) {
                uoa.c0();
             }
          }else {
             return;
          }
       }else {
          uoa = p0.W0();
          if (uoa != null) {
             a.o(uoa, "workspaceDraft.textDraft?: return");
             if (this.isSubtitle == null && !uoa.D()) {
                uoa.c0();
             }
          }
       }
       return;
    }
}
