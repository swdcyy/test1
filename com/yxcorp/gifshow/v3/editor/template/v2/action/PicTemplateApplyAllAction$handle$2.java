package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyAllAction$handle$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.framework.KSStore;
import java.lang.Object;
import duc.d;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateProcessCompleteAction;
import tvc.e;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class PicTemplateApplyAllAction$handle$2 extends Lambda implements l	// class@001352
{
    public final KSStore $store;

    public void PicTemplateApplyAllAction$handle$2(KSStore p0){
       this.$store = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateApplyAllAction$handle$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       if (p0 instanceof PicTemplateProcessCompleteAction && this.$store.b().e()) {
          i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f103c60), 0);
       }
       return;
    }
}
