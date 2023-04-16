package com.yxcrop.gifshow.v3.editor.text_v2_share.action.UpdateProjectAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import qba.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import nsd.u;

public final class UpdateProjectAction extends EditSdkAction	// class@000b80
{
    public final boolean showAnimatedSubAsset;

    public void UpdateProjectAction(boolean p0){
       super();
       this.showAnimatedSubAsset = p0;
    }
    public final boolean getShowAnimatedSubAsset(){
       return this.showAnimatedSubAsset;
    }
    public c loaderContext(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UpdateProjectAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       p0 = (this.showAnimatedSubAsset != null)? new c(0, 0, 2, null): new c(3, 0, 2, null);
       return p0;
    }
}
