package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyConfirmAction;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDraftAction;
import nsd.u;
import com.yxcorp.gifshow.v3.framework.KSStore;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyAllAction;
import tvc.a;
import lq.i;
import lq.e;
import lq.e$b;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import tvc.e;

public final class PicTemplateApplyConfirmAction extends PicTemplateDraftAction	// class@001354
{
    public final boolean confirm;

    public void PicTemplateApplyConfirmAction(){
       super(false, 1, null);
    }
    public void PicTemplateApplyConfirmAction(boolean p0){
       super();
       this.confirm = p0;
    }
    public void PicTemplateApplyConfirmAction(boolean p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = false;
       }
       super(p0);
       return;
    }
    public final boolean getConfirm(){
       return this.confirm;
    }
    public b handle(KSStore p0,PicTemplateState p1,c p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PicTemplateApplyConfirmAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "store");
       a.p(p1, "state");
       a.p(p2, "draft");
       if (this.confirm != null) {
          this.post(p0, new PicTemplateApplyAllAction());
       }
       if (i.h()) {
          i.m().k().w(new e$b(true));
       }
       return null;
    }
    public PicTemplateState reduce(PicTemplateState p0){
       Object obj = p0;
       Object obj1 = PatchProxy.applyOneRefs(obj, this, PicTemplateApplyConfirmAction.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "state");
       return PicTemplateState.a(p0, null, null, null, null, false, false, false, 0, 0, 0, 0, p0.c().a(false, true), null, null, 0x37ff, null);
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
}
