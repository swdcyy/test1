package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateReleaseAction;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateAction;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import tvc.e;

public final class PicTemplateReleaseAction extends PicTemplateAction	// class@001375
{

    public void PicTemplateReleaseAction(){
       super();
    }
    public PicTemplateState reduce(PicTemplateState p0){
       Object obj = p0;
       Object obj1 = PatchProxy.applyOneRefs(obj, this, PicTemplateReleaseAction.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "state");
       return PicTemplateState.a(p0, null, null, null, null, false, false, true, 0, 0, 0, 0, null, null, null, 0x3fbf, null);
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
}
