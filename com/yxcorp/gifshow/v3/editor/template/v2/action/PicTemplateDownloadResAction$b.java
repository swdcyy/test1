package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDownloadResAction$b;
import erd.g;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDownloadResAction;
import com.yxcorp.gifshow.v3.framework.KSStore;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDownloadResFailureAction;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import tvc.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateAction;

public final class PicTemplateDownloadResAction$b implements g	// class@001363
{
    public final PicTemplateDownloadResAction b;
    public final KSStore c;

    public void PicTemplateDownloadResAction$b(PicTemplateDownloadResAction p0,KSStore p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateDownloadResAction$b.class, "1")) {
       }else {
          PostUtils.D("PicTemplateAction", "downLoadPicTemplate", p0);
          this.b.post(this.c, new PicTemplateDownloadResFailureAction(this.b.getTemplate()));
       }
       return;
    }
}
