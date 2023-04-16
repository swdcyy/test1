package com.yxcrop.gifshow.v3.editor.text_v2.action.TTSDownloadFinishAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import jba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import wnd.g;

public final class TTSDownloadFinishAction extends EditSdkAction	// class@000b12
{
    public final boolean commit;
    public final List resultList;

    public void TTSDownloadFinishAction(List p0,boolean p1){
       a.p(p0, "resultList");
       super();
       this.resultList = p0;
       this.commit = p1;
    }
    public final boolean getCommit(){
       return this.commit;
    }
    public final List getResultList(){
       return this.resultList;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TTSDownloadFinishAction.class, "1")) {
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
          g.a.h(uoa, this.resultList);
          if (this.commit != null) {
             uoa.f();
          }
       }
       return;
    }
}
