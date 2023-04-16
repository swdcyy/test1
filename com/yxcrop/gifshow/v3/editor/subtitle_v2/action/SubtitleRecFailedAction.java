package com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleRecFailedAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.state.SubtitleStatus;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.c;

public final class SubtitleRecFailedAction extends EditDraftAction	// class@000ae3
{
    public final SubtitleStatus subtitleStatus;

    public void SubtitleRecFailedAction(SubtitleStatus p0){
       a.p(p0, "subtitleStatus");
       super(false, 1, null);
       this.subtitleStatus = p0;
    }
    public final SubtitleStatus getSubtitleStatus(){
       return this.subtitleStatus;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SubtitleRecFailedAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       SubtitleRecFailedAction tsubtitleSta = this.subtitleStatus;
       if (tsubtitleSta == SubtitleStatus.NO_RESULT && tsubtitleSta == SubtitleStatus.NO_RESULT_MUTE) {
          a uoa = p0.W0();
          if (uoa != null) {
             a.o(uoa, "workspaceDraft.textDraft ?: return");
             if (!uoa.D()) {
                uoa.c0();
             }
             uoa.f();
          }
       }
       return;
    }
}
