package com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import xvc.b;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import qba.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import xvc.c;
import xvc.o;
import java.util.List;
import qba.b;

public class EditDraftAction extends b	// class@00152c
{
    public final boolean needAsync;

    public void EditDraftAction(){
       super(false, 1, null);
    }
    public void EditDraftAction(boolean p0){
       super();
       this.needAsync = p0;
    }
    public void EditDraftAction(boolean p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = false;
       }
       super(p0);
       return;
    }
    public final boolean getNeedAsync(){
       return this.needAsync;
    }
    public c loaderContext(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditDraftAction.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       p0 = (PostExperimentUtils.A(p0) || PostExperimentUtils.x(p0))? new c(3, false, 2, null): new c(false, false, 2, null);
       return p0;
    }
    public boolean needRefreshSdk(){
       return false;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditDraftAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       return;
    }
    public o performActionWithPop(c p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, EditDraftAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       this.performAction(p0, p1);
       return null;
    }
    public List targetLoader(){
       Object obj = PatchProxy.apply(null, this, EditDraftAction.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a();
    }
}
