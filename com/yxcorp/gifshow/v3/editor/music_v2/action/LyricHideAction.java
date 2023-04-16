package com.yxcorp.gifshow.v3.editor.music_v2.action.LyricHideAction;
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
import yaa.a;
import com.yxcorp.gifshow.edit.draft.model.c;

public final class LyricHideAction extends EditSdkAction	// class@00106e
{
    public final boolean isSave;

    public void LyricHideAction(boolean p0){
       super();
       this.isSave = p0;
    }
    public final boolean isSave(){
       return this.isSave;
    }
    public void performAction(c p0,c p1){
       a uoa;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LyricHideAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       if (this.isSave != null) {
          p0 = p0.J0();
          if (p0 != null) {
             uoa = p0.f0();
             if (uoa != null) {
                uoa.f();
             }
          }
       }else {
          p0 = p0.J0();
          if (p0 != null) {
             uoa = p0.f0();
             if (uoa != null) {
                uoa.j();
             }
          }
       }
       return;
    }
}
