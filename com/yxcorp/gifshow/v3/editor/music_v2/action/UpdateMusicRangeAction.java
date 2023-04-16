package com.yxcorp.gifshow.v3.editor.music_v2.action.UpdateMusicRangeAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import yaa.c;
import wba.u;

public final class UpdateMusicRangeAction extends EditSdkAction	// class@00108e
{
    public final double requestDuration;

    public void UpdateMusicRangeAction(double p0){
       super();
       this.requestDuration = p0;
    }
    public final double getRequestDuration(){
       return this.requestDuration;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UpdateMusicRangeAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       p0 = p0.J0();
       if (p0 != null) {
          a.o(p0, "workspaceDraft.musicDraft ?: return");
          u.s(p0, this.requestDuration);
       }
       return;
    }
}
