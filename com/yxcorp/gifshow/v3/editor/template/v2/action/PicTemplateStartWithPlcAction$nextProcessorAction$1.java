package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateStartWithPlcAction$nextProcessorAction$1;
import io.reactivex.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateStartWithPlcAction;
import com.yxcorp.gifshow.v3.framework.KSStore;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDraftAction;
import java.lang.Object;
import brd.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.v2.midduleware.ObservableAction;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateStartWithPlcAction$nextProcessorAction$1$1;
import xvc.b;
import msd.l;
import tvc.a;

public final class PicTemplateStartWithPlcAction$nextProcessorAction$1 implements a	// class@00137c
{
    public final PicTemplateStartWithPlcAction a;
    public final KSStore b;
    public final PicTemplateDraftAction c;

    public void PicTemplateStartWithPlcAction$nextProcessorAction$1(PicTemplateStartWithPlcAction p0,KSStore p1,PicTemplateDraftAction p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateStartWithPlcAction$nextProcessorAction$1.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       this.a.post(this.b, new ObservableAction(this.c, new PicTemplateStartWithPlcAction$nextProcessorAction$1$1(p0)));
       return;
    }
}
