package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateRefreshListFailureAction;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateAction;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import tvc.e;

public final class PicTemplateRefreshListFailureAction extends PicTemplateAction	// class@001373
{
    public final Throwable e;

    public void PicTemplateRefreshListFailureAction(Throwable p0){
       a.p(p0, "e");
       super();
       this.e = p0;
    }
    public final Throwable getE(){
       return this.e;
    }
    public PicTemplateState reduce(PicTemplateState p0){
       Object obj = p0;
       Object obj1 = PatchProxy.applyOneRefs(obj, this, PicTemplateRefreshListFailureAction.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "state");
       return PicTemplateState.a(p0, null, PicTemplateState$ResourceState.MISSING, null, null, false, false, false, 0, 0, 0, 0, null, null, null, 0x3ffd, null);
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
}
