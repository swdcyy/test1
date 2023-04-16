package com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationScaleEndAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import wnd.h;

public final class DecorationScaleEndAction extends EditDraftAction	// class@000b72
{
    public final float additionScale;
    public final boolean commit;
    public final boolean isSubtitle;
    public final int layerIndex;
    public final float scale;

    public void DecorationScaleEndAction(int p0,boolean p1,float p2,float p3,boolean p4){
       super(false, 1, null);
       this.layerIndex = p0;
       this.isSubtitle = p1;
       this.scale = p2;
       this.additionScale = p3;
       this.commit = p4;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DecorationScaleEndAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.W0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.textDraft ?: return");
          if (!uoa.D()) {
             uoa.c0();
          }
          h.t(this.layerIndex, this.isSubtitle, uoa, this.scale, this.additionScale);
          if (this.commit != null) {
             uoa.f();
          }
       }
       return;
    }
}
