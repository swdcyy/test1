package com.yxcrop.gifshow.v3.editor.text_v3.action.DecorationScaleProcessSdkAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import com.yxcrop.gifshow.v3.editor.text_v3.action.DecorationScaleProcessAction;

public final class DecorationScaleProcessSdkAction extends EditSdkAction	// class@000bfd
{
    public final boolean changeAll;
    public final boolean commit;
    public final int layerIndex;
    public final float scale;

    public void DecorationScaleProcessSdkAction(int p0,boolean p1,float p2,boolean p3){
       super();
       this.layerIndex = p0;
       this.changeAll = p1;
       this.scale = p2;
       this.commit = p3;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DecorationScaleProcessSdkAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       DecorationScaleProcessAction uDecorationS = new DecorationScaleProcessAction(this.layerIndex, this.changeAll, this.scale, this.commit, false);
       v0.performAction(p0, p1);
       return;
    }
}
