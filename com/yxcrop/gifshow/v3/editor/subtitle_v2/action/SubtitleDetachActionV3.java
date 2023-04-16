package com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleDetachActionV3;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.c;

public final class SubtitleDetachActionV3 extends EditSdkAction	// class@000ade
{
    public final boolean isSave;

    public void SubtitleDetachActionV3(boolean p0){
       super();
       this.isSave = p0;
    }
    public final boolean isSave(){
       return this.isSave;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SubtitleDetachActionV3.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       Object[] objArray = new Object[0];
       a.D().w("SubtitleDetachActionV3", "performAction isSave:"+this.isSave, objArray);
       a uoa = p0.W0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.textDraft ?: return");
          if (!uoa.D()) {
             return;
          }else if(this.isSave != null){
             uoa.f();
          }else {
             uoa.j();
          }
       }
       return;
    }
}
