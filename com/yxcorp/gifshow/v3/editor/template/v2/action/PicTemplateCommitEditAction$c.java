package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateCommitEditAction$c;
import erd.g;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateCommitEditAction;
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

public final class PicTemplateCommitEditAction$c implements g	// class@00135b
{
    public final PicTemplateCommitEditAction b;
    public final KSStore c;

    public void PicTemplateCommitEditAction$c(PicTemplateCommitEditAction p0,KSStore p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateCommitEditAction$c.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.post(this.c, new PicTemplateProcessErrorAction(this.b, "commit error", p0));
       }
       return;
    }
}
