package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateProcessCompleteAction;
import duc.d;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDraftAction;
import duc.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import tvc.e;

public final class PicTemplateProcessCompleteAction extends PicTemplateDraftAction implements d	// class@00136d
{
    public final c request;

    public void PicTemplateProcessCompleteAction(c p0){
       a.p(p0, "request");
       super();
       this.request = p0;
    }
    public c getRequest(){
       return this.request;
    }
    public PicTemplateState reduce(PicTemplateState p0){
       Object obj = p0;
       Object obj1 = PatchProxy.applyOneRefs(obj, this, PicTemplateProcessCompleteAction.class, "1");
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
