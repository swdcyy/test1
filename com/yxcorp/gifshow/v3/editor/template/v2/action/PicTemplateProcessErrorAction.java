package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateProcessErrorAction;
import duc.d;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDraftAction;
import duc.c;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import androidx.lifecycle.ViewModelProvider;
import com.yxcorp.gifshow.v3.framework.KSStore;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import uwc.b;
import androidx.lifecycle.ViewModel;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.util.PostUtils;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import tvc.e;

public final class PicTemplateProcessErrorAction extends PicTemplateDraftAction implements d	// class@00136e
{
    public final Throwable e;
    public final String msg;
    public final c request;

    public void PicTemplateProcessErrorAction(c p0,String p1,Throwable p2){
       a.p(p0, "request");
       a.p(p1, "msg");
       a.p(p2, "e");
       super();
       this.request = p0;
       this.msg = p1;
       this.e = p2;
    }
    public void PicTemplateProcessErrorAction(c p0,String p1,Throwable p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = new Throwable(p1);
       }
       super(p0, p1, p2);
       return;
    }
    public final Throwable getE(){
       return this.e;
    }
    public final String getMsg(){
       return this.msg;
    }
    public c getRequest(){
       return this.request;
    }
    public b handle(ViewModelProvider p0,KSStore p1,PicTemplateState p2,c p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, PicTemplateProcessErrorAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "vmp");
       a.p(p1, "store");
       a.p(p2, "state");
       a.p(p3, "draft");
       ViewModel viewModel = p0.get(b.class);
       a.o(viewModel, "get\(T::class.java\)");
       viewModel.D0(Workspace$Type.ATLAS, 4);
       PostUtils.D("PicTemplateAction", this.msg, this.e);
       return null;
    }
    public PicTemplateState reduce(PicTemplateState p0){
       Object obj = p0;
       Object obj1 = PatchProxy.applyOneRefs(obj, this, PicTemplateProcessErrorAction.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "state");
       return PicTemplateState.a(p0, null, null, null, null, false, false, false, 0, 0, 0, 0, null, null, null, 0x3fef, null);
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
}
