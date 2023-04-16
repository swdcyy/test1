package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateLoggerShowTemplateAction;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateAction;
import com.yxcorp.gifshow.v3.framework.KSStore;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ytc.h;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import java.util.Set;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import ytc.b;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateGroupInfo;
import java.util.Collection;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.util.List;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import tvc.e;
import trd.d1;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;

public final class PicTemplateLoggerShowTemplateAction extends PicTemplateAction	// class@00136c
{

    public void PicTemplateLoggerShowTemplateAction(){
       super();
    }
    public b handle(KSStore p0,PicTemplateState p1){
       h a;
       Set obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplateLoggerShowTemplateAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "store");
       a.p(p1, "state");
       a = h.a;
       obj = p1.j().b();
       ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          PicTemplateState$e uoe = iterator.next();
          String id = uoe.b().getPicTemplateInfo().getId();
          String str = (p1.s() == Workspace$Type.SINGLE_PICTURE)? "single": "multi";
          uArrayList.add(new b(id, str, uoe.b().getPicTemplateGroupInfo().getId(), uoe.b().getPicTemplateGroupInfo().getName()));
       }
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(uArrayList, a, h.class, "12")) {
          a.p(uArrayList, "list");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SHOW_TEMPLATE";
          i3 oi3 = i3.f();
          oi3.d("template_list", h.a.b(uArrayList));
          uElementPack.params = oi3.e();
          u1.u0(3, uElementPack, null);
       }
       return null;
    }
    public b handle(KSStore p0,e p1){
       return this.handle(p0, p1);
    }
    public PicTemplateState reduce(PicTemplateState p0){
       Object obj = p0;
       Object obj1 = PatchProxy.applyOneRefs(obj, this, PicTemplateLoggerShowTemplateAction.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "state");
       return PicTemplateState.a(p0, null, null, null, null, false, false, false, 0, 0, 0, 0, null, null, p0.j().a(d1.k()), 8191, null);
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
}
