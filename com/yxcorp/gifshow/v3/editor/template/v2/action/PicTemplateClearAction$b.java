package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateClearAction$b;
import erd.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateClearAction;
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

public final class PicTemplateClearAction$b implements a	// class@001356
{
    public final PicTemplateClearAction b;
    public final ViewModelProvider c;
    public final KSStore d;

    public void PicTemplateClearAction$b(PicTemplateClearAction p0,ViewModelProvider p1,KSStore p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PicTemplateClearAction$b.class, "1")) {
          return;
       }
       a a = a.a;
       a.d(this.c, false);
       a.c(this.c, false);
       a.a(this.c);
       this.b.post(this.d, new PicTemplateProcessCompleteAction(this.b));
       return;
    }
}
