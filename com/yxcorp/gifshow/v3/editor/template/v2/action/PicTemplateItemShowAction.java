package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateItemShowAction;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateAction;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import java.util.Set;
import trd.e1;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.kuaishou.edit.draft.Workspace$Type;
import tvc.e;

public final class PicTemplateItemShowAction extends PicTemplateAction	// class@00136b
{
    public final PicTemplateState$e data;

    public void PicTemplateItemShowAction(PicTemplateState$e p0){
       a.p(p0, "data");
       super();
       this.data = p0;
    }
    public final PicTemplateState$e getData(){
       return this.data;
    }
    public PicTemplateState reduce(PicTemplateState p0){
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = PatchProxy.applyOneRefs(obj1, obj, PicTemplateItemShowAction.class, "1");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       a.p(obj1, "state");
       return PicTemplateState.a(p0, null, null, null, null, false, false, false, 0, 0, 0, 0, null, null, p0.j().a(e1.D(p0.j().b(), obj.data)), 8191, null);
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
}
