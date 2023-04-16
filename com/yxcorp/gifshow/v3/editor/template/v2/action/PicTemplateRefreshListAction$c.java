package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateRefreshListAction$c;
import erd.g;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateRefreshListAction;
import com.yxcorp.gifshow.v3.framework.KSStore;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateRefreshListFailureAction;
import kotlin.jvm.internal.a;
import tvc.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateAction;

public final class PicTemplateRefreshListAction$c implements g	// class@001371
{
    public final PicTemplateRefreshListAction b;
    public final KSStore c;

    public void PicTemplateRefreshListAction$c(PicTemplateRefreshListAction p0,KSStore p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateRefreshListAction$c.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.post(this.c, new PicTemplateRefreshListFailureAction(p0));
       }
       return;
    }
}
