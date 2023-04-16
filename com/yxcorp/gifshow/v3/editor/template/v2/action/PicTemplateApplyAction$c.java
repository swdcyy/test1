package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyAction$c;
import erd.g;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyAction;
import com.yxcorp.gifshow.v3.framework.KSStore;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateProcessErrorAction;
import kotlin.jvm.internal.a;
import duc.c;
import tvc.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDraftAction;

public final class PicTemplateApplyAction$c implements g	// class@00134f
{
    public final PicTemplateApplyAction b;
    public final KSStore c;

    public void PicTemplateApplyAction$c(PicTemplateApplyAction p0,KSStore p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateApplyAction$c.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.post(this.c, new PicTemplateProcessErrorAction(this.b, "apply error", p0));
       }
       return;
    }
}
