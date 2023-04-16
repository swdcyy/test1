package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateStartEditAction$a;
import erd.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateStartEditAction;
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

public final class PicTemplateStartEditAction$a implements a	// class@001376
{
    public final PicTemplateStartEditAction b;
    public final ViewModelProvider c;
    public final KSStore d;

    public void PicTemplateStartEditAction$a(PicTemplateStartEditAction p0,ViewModelProvider p1,KSStore p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PicTemplateStartEditAction$a.class, "1")) {
          return;
       }
       a.a.d(this.c, false);
       this.b.post(this.d, new PicTemplateProcessCompleteAction(this.b));
       return;
    }
}
