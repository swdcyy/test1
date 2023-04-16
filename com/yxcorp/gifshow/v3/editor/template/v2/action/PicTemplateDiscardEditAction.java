package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDiscardEditAction;
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
import buc.j;
import java.util.Collection;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import androidx.lifecycle.ViewModel;
import trd.u;
import qsc.c;
import brd.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDiscardEditAction$a;
import erd.a;
import brd.e;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDiscardEditAction$b;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDiscardEditAction$c;
import erd.g;
import java.io.File;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import tvc.e;

public final class PicTemplateDiscardEditAction extends PicTemplateDraftAction implements c	// class@001361
{

    public void PicTemplateDiscardEditAction(){
       super();
    }
    public b handle(ViewModelProvider p0,KSStore p1,PicTemplateState p2,c p3){
       PicTemplateDiscardEditAction picTemplateD = this;
       Object obj = p0;
       Object obj1 = p1;
       Object obj2 = p2;
       Object obj3 = p3;
       h obj4 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, PicTemplateDiscardEditAction.class, "1");
       if (obj4 != PatchProxyResult.class) {
          return obj4;
       }
       a.p(obj, "vmp");
       a.p(obj1, "store");
       a.p(obj2, "state");
       a.p(obj3, "draft");
       b uob = null;
       if (!p2.e()) {
          PostUtils.F("PicTemplateAction", "discard when illegal state");
          return uob;
       }else {
          obj4 = h.a;
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p2.d().iterator();
          while (iterator.hasNext()) {
             j oj = iterator.next().b();
             String id = (oj != null)? oj.getId(): uob;
             if (id != null) {
                uArrayList.add(id);
             }
          }
          String str = CollectionsKt___CollectionsKt.V2(uArrayList, ",", null, null, 0, null, null, 62, null);
          Objects.requireNonNull(obj4);
          if (!PatchProxy.applyVoidOneRefs(str, obj4, h.class, "6")) {
             a.p(str, "templateId");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "TEMPLATE_CANCEL_BUTTON";
             i3 oi3 = i3.f();
             oi3.d("template_id", str);
             uElementPack.params = oi3.e();
             u1.u(1, uElementPack, uob);
          }
          ViewModel viewModel = obj.get(f.class);
          String str1 = "get\(T::class.java\)";
          a.o(viewModel, str1);
          List list = viewModel.o0();
          int i = 10;
          ArrayList uArrayList1 = new ArrayList(u.Y(list, i));
          Iterator iterator1 = list.iterator();
          while (iterator1.hasNext()) {
             uArrayList1.add(iterator1.next().f(obj3));
          }
          a uoa = a.i(uArrayList1).l(new PicTemplateDiscardEditAction$a(obj));
          ViewModel viewModel1 = obj.get(f.class);
          a.o(viewModel1, str1);
          List list1 = viewModel1.o0();
          uArrayList1 = new ArrayList(u.Y(list1, i));
          Iterator iterator2 = list1.iterator();
          while (iterator2.hasNext()) {
             uArrayList1.add(iterator2.next().e());
          }
          uoa.b(a.i(uArrayList1)).u(new PicTemplateDiscardEditAction$b(picTemplateD, obj, obj1), new PicTemplateDiscardEditAction$c(picTemplateD, obj1));
          return super.handle(obj1, obj2, obj3);
       }
    }
    public PicTemplateState reduce(PicTemplateState p0){
       String id;
       Object obj = p0;
       PicTemplateState$b obj1 = PatchProxy.applyOneRefs(obj, this, PicTemplateDiscardEditAction.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "state");
       if (!p0.e()) {
          return obj;
       }
       obj1 = p0.l();
       if (obj1 != null) {
          j oj = obj1.b();
          if (oj != null) {
             id = oj.getId();
          label_0031 :
             List list = p0.d();
             int i = 10;
             ArrayList uArrayList = new ArrayList(u.Y(list, i));
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                PicTemplateState$b uob = iterator.next();
                int i1 = a.g(uob.e(), uob.b()) ^ 0x01;
                if (i1) {
                   uob = PicTemplateState$b.a(uob, null, null, false, null, uob.b(), null, 47, null);
                }
                uArrayList.add(uob);
             }
             list = p0.r();
             ArrayList uArrayList1 = new ArrayList(u.Y(list, i));
             iterator = list.iterator();
             while (iterator.hasNext()) {
                PicTemplateState$e uoe = iterator.next();
                if (a.g(uoe.getId(), id) && !uoe.h()) {
                   uoe = PicTemplateState$e.a(uoe, null, null, 0, false, true, null, false, null, false, 495, null);
                }else {
                   i = a.g(uoe.getId(), id) ^ 0x01;
                   if (i && uoe.h()) {
                      uoe = PicTemplateState$e.a(uoe, null, null, 0, false, false, null, false, null, false, 495, null);
                   }
                }
                uArrayList1.add(uoe);
             }
             return PicTemplateState.a(p0, uArrayList, null, null, uArrayList1, 1, false, false, 0, 0, 0, 0, null, null, 0, 0x3fc6, null);
          }
       }
       id = null;
       goto label_0031 ;
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
}
