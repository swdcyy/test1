package com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import qba.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public class EditSdkAction extends EditDraftAction	// class@001537
{

    public void EditSdkAction(){
       super(false, 1, null);
    }
    public c loaderContext(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditSdkAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       return super.loaderContext(p0);
    }
    public boolean needForceStartPlayer(){
       return false;
    }
    public boolean needRefreshSdk(){
       return true;
    }
}
