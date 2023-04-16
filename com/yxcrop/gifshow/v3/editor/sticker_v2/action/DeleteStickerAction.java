package com.yxcrop.gifshow.v3.editor.sticker_v2.action.DeleteStickerAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import eba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import rmd.c;
import java.util.Objects;
import java.lang.Integer;
import wba.l0;

public final class DeleteStickerAction extends EditSdkAction	// class@000a4f
{
    public final boolean commit;
    public final int layerIndex;

    public void DeleteStickerAction(int p0,boolean p1){
       super();
       this.layerIndex = p0;
       this.commit = p1;
    }
    public final int getLayerIndex(){
       return this.layerIndex;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DeleteStickerAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.U0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.stickerDraft ?: return");
          if (!uoa.D()) {
             uoa.c0();
          }
          p1 = c.a;
          DeleteStickerAction tlayerIndex = this.layerIndex;
          Objects.requireNonNull(p1);
          if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(tlayerIndex), uoa, p1, c.class, "7")) {
             a.p(uoa, "stickerDraft");
             int i = l0.a.a(tlayerIndex, uoa);
             if (i >= 0) {
                uoa.V(i);
             }
          }
          if (this.commit != null) {
             uoa.f();
          }
       }
       return;
    }
}
