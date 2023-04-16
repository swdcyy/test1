package com.yxcrop.gifshow.v3.editor.text_v3.action.DecorationMoveProcessSdkAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import com.yxcrop.gifshow.v3.editor.text_v3.action.DecorationMoveProcessAction;

public final class DecorationMoveProcessSdkAction extends EditSdkAction	// class@000bfb
{
    public final boolean changeAll;
    public final boolean commit;
    public final int layerIndex;
    public final float x;
    public final float y;

    public void DecorationMoveProcessSdkAction(int p0,boolean p1,float p2,float p3,boolean p4){
       super();
       this.layerIndex = p0;
       this.changeAll = p1;
       this.x = p2;
       this.y = p3;
       this.commit = p4;
    }
    public final int getLayerIndex(){
       return this.layerIndex;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DecorationMoveProcessSdkAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       DecorationMoveProcessAction uDecorationM = new DecorationMoveProcessAction(this.layerIndex, this.changeAll, this.x, this.y, this.commit, false);
       v0.performAction(p0, p1);
       return;
    }
}
