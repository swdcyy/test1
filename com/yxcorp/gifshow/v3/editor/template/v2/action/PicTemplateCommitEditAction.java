package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateCommitEditAction;
import duc.c;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDraftAction;
import androidx.lifecycle.ViewModelProvider;
import com.yxcorp.gifshow.v3.framework.KSStore;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import crd.b;
import buc.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.PostUtils;
import ytc.h;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$b;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import buc.j;
import java.util.Collection;
import trd.u;
import ytc.b;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateGroupInfo;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import androidx.lifecycle.ViewModel;
import qsc.c;
import brd.a;
import brd.e;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateCommitEditAction$a;
import erd.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateCommitEditAction$b;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateCommitEditAction$c;
import erd.g;
import java.io.File;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import tvc.e;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateCommitEditAction$d;

public final class PicTemplateCommitEditAction extends PicTemplateDraftAction implements c	// class@00135d
{

    public void PicTemplateCommitEditAction(){
       super();
    }
    public b handle(ViewModelProvider p0,KSStore p1,PicTemplateState p2,c p3){
       b uob2;
       String id;
       String id1;
       List list;
       f uof = f.class;
       h obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, PicTemplateCommitEditAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "vmp");
       a.p(p1, "store");
       a.p(p2, "state");
       a.p(p3, "draft");
       b uob = null;
       if (!p2.e()) {
          PostUtils.F("PicTemplateAction", "commit when illegal state");
          return uob;
       }else {
          obj = h.a;
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p2.d().iterator();
          while (iterator.hasNext()) {
             PicTemplateState$b uob1 = iterator.next();
             Iterator iterator1 = p2.r().iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   uob2 = iterator1.next();
                   id = uob2.getId();
                   j oj = uob1.e();
                   id1 = (oj != null)? oj.getId(): uob;
                   if (!a.g(id, id1)) {
                      continue ;
                   }
                }else {
                   uob2 = uob;
                }
                if (uob2 != null) {
                   uArrayList.add(uob2);
                }else {
                   continue ;
                }
             }
          }
          ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
          Iterator iterator2 = uArrayList.iterator();
          while (iterator2.hasNext()) {
             PicTemplateState$e uoe = iterator2.next();
             id = uoe.b().getPicTemplateInfo().getId();
             id1 = (p2.s() == Workspace$Type.SINGLE_PICTURE)? "single": "multi";
             uArrayList1.add(new b(id, id1, uoe.b().getPicTemplateGroupInfo().getId(), uoe.b().getPicTemplateGroupInfo().getName()));
          }
          Objects.requireNonNull(obj);
          if (!PatchProxy.applyVoidOneRefs(uArrayList1, obj, h.class, "7")) {
             a.p(uArrayList1, "list");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "TEMPLATE_FINISH_BUTTON";
             i3 oi3 = i3.f();
             oi3.d("template_list", h.a.b(uArrayList1));
             uElementPack.params = oi3.e();
             u1.u(1, uElementPack, uob);
          }
          ViewModel viewModel = p0.get(uof);
          String str = "get\(T::class.java\)";
          a.o(viewModel, str);
          list = viewModel.o0();
          uArrayList1 = new ArrayList(u.Y(list, 10));
          Iterator iterator3 = list.iterator();
          while (iterator3.hasNext()) {
             uArrayList1.add(iterator3.next().b(p3));
          }
          a uoa = a.i(uArrayList1).b(this.saveTemplateInfoToPhotoMeta(p3)).l(new PicTemplateCommitEditAction$a(p0));
          ViewModel viewModel1 = p0.get(uof);
          a.o(viewModel1, str);
          List list1 = viewModel1.o0();
          ArrayList uArrayList2 = new ArrayList(u.Y(list1, 10));
          Iterator iterator4 = list1.iterator();
          while (iterator4.hasNext()) {
             uArrayList2.add(iterator4.next().e());
          }
          uoa.b(a.i(uArrayList2)).u(new PicTemplateCommitEditAction$b(this, p0, p1), new PicTemplateCommitEditAction$c(this, p1));
          return super.handle(p1, p2, p3);
       }
    }
    public PicTemplateState reduce(PicTemplateState p0){
       Object obj = p0;
       List obj1 = PatchProxy.applyOneRefs(obj, this, PicTemplateCommitEditAction.class, "3");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "state");
       if (!p0.e()) {
          return obj;
       }
       obj1 = p0.d();
       ArrayList uArrayList = new ArrayList(u.Y(obj1, 10));
       Iterator iterator = obj1.iterator();
       while (iterator.hasNext()) {
          PicTemplateState$b uob = iterator.next();
          int i = a.g(uob.e(), uob.b()) ^ 0x01;
          if (i) {
             uob = PicTemplateState$b.a(uob, null, null, false, null, null, uob.e(), 31, null);
          }
          uArrayList.add(uob);
       }
       return PicTemplateState.a(p0, uArrayList, null, null, null, 1, false, false, 0, 0, 0, 0, null, null, null, 0x3fce, null);
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
    public final a saveTemplateInfoToPhotoMeta(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateCommitEditAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a uoa = a.q(new PicTemplateCommitEditAction$d(p0));
       a.o(uoa, "Completable.fromAction {¡­emplate = templates\n    }");
       return uoa;
    }
}
