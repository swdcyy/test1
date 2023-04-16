package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectPanelAttachAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import faa.a;
import q87.c;
import raa.a;
import haa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import raa.c;
import raa.g;
import raa.i;
import maa.a;
import raa.e;
import kba.a;

public final class EffectPanelAttachAction extends EditSdkAction	// class@000f2a
{

    public void EffectPanelAttachAction(){
       super();
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EffectPanelAttachAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       Object[] objArray = new Object[0];
       a.D().w("EffectMagicSelectAction", "performAction", objArray);
       a.b(p0).c0();
       a.k(p0).c0();
       a.s(p0).c0();
       a.v(p0).c0();
       a.c(p0).c0();
       a.l(p0).c0();
       a.a.u(p0).c0();
       return;
    }
}
