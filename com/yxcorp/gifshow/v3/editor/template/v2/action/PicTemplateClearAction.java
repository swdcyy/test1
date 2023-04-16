package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateClearAction;
import duc.c;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDraftAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.String;
import brd.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateClearAction$a;
import erd.a;
import brd.a;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelProvider;
import com.yxcorp.gifshow.v3.framework.KSStore;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import crd.b;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$b;
import buc.j;
import ytc.h;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import buc.f;
import androidx.lifecycle.ViewModel;
import java.util.List;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import qsc.c;
import java.util.Collection;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateClearAction$b;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateClearAction$c;
import erd.g;
import java.io.File;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import tvc.e;

public final class PicTemplateClearAction extends PicTemplateDraftAction implements c	// class@001358
{

    public void PicTemplateClearAction(){
       super();
    }
    public final e clearTemplateInfoToDraft(c p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplateClearAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a uoa = a.q(new PicTemplateClearAction$a(p0, p1));
       a.o(uoa, "Completable.fromAction {¡­learAtlasTemplate\(\)\n    }");
       return uoa;
    }
    public b handle(ViewModelProvider p0,KSStore p1,PicTemplateState p2,c p3){
       h obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, PicTemplateClearAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "vmp");
       a.p(p1, "store");
       a.p(p2, "state");
       a.p(p3, "draft");
       b uob = null;
       if (p2.k()) {
          PostUtils.F("PicTemplateAction", "clear when illegal state");
          return uob;
       }else {
          PicTemplateState$b uob1 = p2.l();
          if (uob1 == null) {
             return uob;
          }
          if (uob1.e() == null) {
             return uob;
          }
          obj = h.a;
          String id = uob1.e().getId();
          Objects.requireNonNull(obj);
          if (!PatchProxy.applyVoidOneRefs(id, obj, h.class, "4")) {
             a.p(id, "templateId");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "TEMPLATE_RESET_BUTTON";
             i3 oi3 = i3.f();
             oi3.d("template_id", id);
             uElementPack.params = oi3.e();
             u1.u(1, uElementPack, uob);
          }
          ViewModel viewModel = p0.get(f.class);
          a.o(viewModel, "get\(T::class.java\)");
          List list = viewModel.o0();
          ArrayList uArrayList = new ArrayList(u.Y(list, 10));
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().a(p3, uob1.getId()));
          }
          return a.i(uArrayList).b(this.clearTemplateInfoToDraft(p3, uob1.getId())).u(new PicTemplateClearAction$b(this, p0, p1), new PicTemplateClearAction$c(this, p1));
       }
    }
    public PicTemplateState reduce(PicTemplateState p0){
       PicTemplateState picTemplateS = p0;
       PicTemplateState$b obj = PatchProxy.applyOneRefs(picTemplateS, this, PicTemplateClearAction.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(picTemplateS, "state");
       if (p0.k()) {
          return picTemplateS;
       }
       obj = p0.l();
       if (obj != null) {
          if (obj.e() == null) {
             return picTemplateS;
          }else {
             List list = p0.d();
             int i = 10;
             ArrayList uArrayList = new ArrayList(u.Y(list, i));
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                PicTemplateState$b uob = iterator.next();
                if (uob == obj) {
                   uob = PicTemplateState$b.a(uob, null, null, false, null, null, null, 47, null);
                }
                uArrayList.add(uob);
             }
             List list1 = p0.r();
             ArrayList uArrayList1 = new ArrayList(u.Y(list1, i));
             Iterator iterator1 = list1.iterator();
             while (iterator1.hasNext()) {
                PicTemplateState$e uoe = iterator1.next();
                if (uoe.h()) {
                   uoe = PicTemplateState$e.a(uoe, null, null, 0, false, false, null, false, null, false, 495, null);
                }
                uArrayList1.add(uoe);
             }
             picTemplateS = PicTemplateState.a(p0, uArrayList, null, null, uArrayList1, 1, false, false, 0, 0, 0, 0, null, null, null, 0x3fe6, null);
          }
       }
       return picTemplateS;
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
}
