package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDraftAction;
import cuc.a;
import cuc.b;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDraftAction$a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import androidx.lifecycle.ViewModelProvider;
import com.yxcorp.gifshow.v3.framework.KSStore;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import tvc.e;
import xvc.c;
import tvc.a;
import xvc.b;
import cuc.a$a;
import cuc.b$a;

public abstract class PicTemplateDraftAction extends EditDraftAction implements a, b	// class@00136a
{
    public c draft;
    public static final PicTemplateDraftAction$a Companion;

    static {
       PicTemplateDraftAction.Companion = new PicTemplateDraftAction$a(null);
    }
    public void PicTemplateDraftAction(){
       super(false, 1, null);
    }
    public final c getDraft(){
       return this.draft;
    }
    public final b handle(ViewModelProvider p0,KSStore p1,PicTemplateState p2){
       PicTemplateDraftAction obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PicTemplateDraftAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "vmp");
       a.p(p1, "store");
       a.p(p2, "state");
       obj = this.draft;
       if (obj != null) {
          return this.handle(p0, p1, p2, obj);
       }
       PostUtils.D("PicTemplateAction", "draft is null", new Throwable("draft is null"));
       return null;
    }
    public b handle(ViewModelProvider p0,KSStore p1,PicTemplateState p2,c p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, PicTemplateDraftAction.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "vmp");
       a.p(p1, "store");
       a.p(p2, "state");
       a.p(p3, "draft");
       return this.handle(p1, p2, p3);
    }
    public b handle(ViewModelProvider p0,KSStore p1,e p2){
       return this.handle(p0, p1, p2);
    }
    public final b handle(KSStore p0,PicTemplateState p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplateDraftAction.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "store");
       a.p(p1, "state");
       return null;
    }
    public b handle(KSStore p0,PicTemplateState p1,c p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PicTemplateDraftAction.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "store");
       a.p(p1, "state");
       a.p(p2, "draft");
       return null;
    }
    public b handle(KSStore p0,e p1){
       return this.handle(p0, p1);
    }
    public final void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PicTemplateDraftAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       this.draft = p0;
       return;
    }
    public void post(KSStore p0,a p1){
       this.post(p0, p1);
    }
    public void post(KSStore p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PicTemplateDraftAction.class, "6")) {
          return;
       }
       a.p(p0, "$this$post");
       a.p(p1, "action");
       a$a.a(this, p0, p1);
       return;
    }
    public PicTemplateState reduce(PicTemplateState p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateDraftAction.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "state");
       return b$a.a(this, p0);
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
    public final void setDraft(c p0){
       this.draft = p0;
    }
}
