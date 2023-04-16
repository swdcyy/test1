package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyAction$b;
import erd.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyAction;
import androidx.lifecycle.ViewModelProvider;
import com.yxcorp.gifshow.v3.framework.KSStore;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import auc.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateProcessCompleteAction;
import duc.c;
import tvc.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDraftAction;

public final class PicTemplateApplyAction$b implements a	// class@00134e
{
    public final PicTemplateApplyAction b;
    public final ViewModelProvider c;
    public final KSStore d;

    public void PicTemplateApplyAction$b(PicTemplateApplyAction p0,ViewModelProvider p1,KSStore p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PicTemplateApplyAction$b.class, "1")) {
          return;
       }
       if (this.b.getNotifyUpdate()) {
          a a = a.a;
          boolean b = false;
          a.d(this.c, b);
          a.c(this.c, b);
          a.a(this.c);
       }
       this.b.post(this.d, new PicTemplateProcessCompleteAction(this.b));
       return;
    }
}
