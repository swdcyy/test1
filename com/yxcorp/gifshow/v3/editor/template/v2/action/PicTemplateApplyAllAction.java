package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyAllAction;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDraftAction;
import com.yxcorp.gifshow.v3.framework.KSStore;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$b;
import java.util.Collection;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyAction;
import buc.j;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyAllAction$handle$2;
import com.yxcorp.gifshow.v3.editor.template.v2.midduleware.ObservableAction;
import xvc.b;
import msd.l;
import tvc.a;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import tvc.e;

public final class PicTemplateApplyAllAction extends PicTemplateDraftAction	// class@001353
{

    public void PicTemplateApplyAllAction(){
       super();
    }
    public b handle(KSStore p0,PicTemplateState p1,c p2){
       Iterator obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PicTemplateApplyAllAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "store");
       a.p(p1, "state");
       a.p(p2, "draft");
       String str = "KSToast.applyStyle\(R.sty¡­st.LENGTH_SHORT\n        \)";
       int i = 0;
       if (p1.n() == null) {
          a.o(i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f103c64), i), str);
       }else if(p1.b() && p1.c().b()){
          PicTemplateState$e uoe = p1.n();
          ArrayList uArrayList = new ArrayList();
          obj = p1.d().iterator();
          while (obj.hasNext()) {
             Object obj1 = obj.next();
             i = obj1.f() ^ 0x01;
             if (i) {
                uArrayList.add(obj1);
             }
          }
          PicTemplateApplyAction picTemplateA = new PicTemplateApplyAction(uoe, uArrayList, false, 4, null);
          this.post(p0, new ObservableAction(obj, new PicTemplateApplyAllAction$handle$2(p0)));
       }else if(p1.b()){
          a.o(i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f103c60), i), str);
       }
       return super.handle(p0, p1, p2);
    }
    public PicTemplateState reduce(PicTemplateState p0){
       PicTemplateState picTemplateS = p0;
       Object obj = PatchProxy.applyOneRefs(picTemplateS, this, PicTemplateApplyAllAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(picTemplateS, "state");
       if (p0.b() && !p0.c().b()) {
          PicTemplateState$a uoa = p0.c();
          PicTemplateState$a uoa1 = uoa.a(true, uoa.b);
          picTemplateS = PicTemplateState.a(p0, null, null, null, null, false, false, false, 0, 0, 0, 0, uoa1, null, null, 0x37ff, null);
       }
       return picTemplateS;
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
}
