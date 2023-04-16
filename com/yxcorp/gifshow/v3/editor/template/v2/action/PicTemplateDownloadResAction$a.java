package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDownloadResAction$a;
import erd.g;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDownloadResAction;
import com.yxcorp.gifshow.v3.framework.KSStore;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate$b$a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDownloadResSuccessAction;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import tvc.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateAction;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate$b$b;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDownloadResFailureAction;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate$b$c;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDownloadResUpdateAction;

public final class PicTemplateDownloadResAction$a implements g	// class@001362
{
    public final PicTemplateDownloadResAction b;
    public final KSStore c;

    public void PicTemplateDownloadResAction$a(PicTemplateDownloadResAction p0,KSStore p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateDownloadResAction$a.class, "1")) {
       }else if(a.g(p0, PicTemplate$b$a.a)){
          this.b.post(this.c, new PicTemplateDownloadResSuccessAction(this.b.getTemplate()));
       }else if(a.g(p0, PicTemplate$b$b.a)){
          this.b.post(this.c, new PicTemplateDownloadResFailureAction(this.b.getTemplate()));
       }else if(p0 instanceof PicTemplate$b$c){
          this.b.post(this.c, new PicTemplateDownloadResUpdateAction(this.b.getTemplate(), (p0.a / 100.00f)));
       }
       return;
    }
}
