package com.yxcorp.gifshow.v3.editor.music_v2.action.LyricMoveEndAction;
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
import lsc.w;

public final class LyricMoveEndAction extends EditSdkAction	// class@00106f
{
    public final float deltaX;
    public final float deltaY;

    public void LyricMoveEndAction(float p0,float p1){
       super();
       this.deltaX = p0;
       this.deltaY = p1;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LyricMoveEndAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       p0 = p0.J0();
       if (p0 != null) {
          a uoa = p0.f0();
          if (uoa != null) {
             w.b(uoa, this.deltaX, this.deltaY);
          }
       }
       return;
    }
}
