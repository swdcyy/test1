package com.yxcrop.gifshow.v3.editor.text_v2.action.TTSDownloadFinishAndDetachAction;
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

public final class TTSDownloadFinishAndDetachAction extends EditSdkAction	// class@000b13
{
    public final List resultList;

    public void TTSDownloadFinishAndDetachAction(List p0){
       a.p(p0, "resultList");
       super();
       this.resultList = p0;
    }
    public final List getResultList(){
       return this.resultList;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TTSDownloadFinishAndDetachAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.Z0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.ttsDraft ?: return");
          if (this.resultList.isEmpty()) {
             uoa.f();
             return;
          }else {
             g.a.h(uoa, this.resultList);
             uoa.f();
          }
       }
       return;
    }
}
