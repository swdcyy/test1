package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateSwitchTemplateAction;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateAction;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.KSStore;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$b;
import com.yxcorp.gifshow.util.PostUtils;
import ytc.h;
import ytc.b;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateGroupInfo;
import trd.t;
import java.util.Objects;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import qrd.l1;
import k2b.u1;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyAction;
import buc.j;
import nsd.u;
import tvc.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDownloadResAction;
import tvc.e;
import java.util.ArrayList;
import trd.u;
import java.io.File;
import java.util.Collection;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;

public final class PicTemplateSwitchTemplateAction extends PicTemplateAction	// class@001380
{
    public final PicTemplateState$e template;

    public void PicTemplateSwitchTemplateAction(PicTemplateState$e p0){
       a.p(p0, "template");
       super();
       this.template = p0;
    }
    public final PicTemplateState$e getTemplate(){
       return this.template;
    }
    public b handle(KSStore p0,PicTemplateState p1){
       b uob;
       h a;
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplateSwitchTemplateAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "store");
       a.p(p1, "state");
       obj = p1.d().iterator();
       while (true) {
          if (obj.hasNext()) {
             uob = obj.next();
             if (!uob.f()) {
                continue ;
             }
          }else {
             uob = null;
          }
          if (uob == null) {
             PostUtils.F("PicTemplateAction", "illegal state: no selected asset");
             return null;
          }else {
             a = h.a;
             String id = this.template.b().getPicTemplateInfo().getId();
             String str = (p1.s() == Workspace$Type.SINGLE_PICTURE)? "single": "multi";
             List list = t.k(new b(id, str, this.template.b().getPicTemplateGroupInfo().getId(), this.template.b().getPicTemplateGroupInfo().getName()));
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(list, a, h.class, "2")) {
                a.p(list, "list");
                h$b uob1 = h$b.e(7, "CHANGE_TEMPLATE");
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "CHANGE_TEMPLATE";
                i3 oi3 = i3.f();
                oi3.d("template_list", a.b(list));
                uElementPack.params = oi3.e();
                uob1.k(uElementPack);
                u1.r0(uob1);
             }
             if (this.template.f() == PicTemplateState$ResourceState.READY) {
                PicTemplateApplyAction picTemplateA = new PicTemplateApplyAction(this.template, t.k(uob), false, 4, null);
                this.post(p0, this.template.f());
                break ;
             }else {
                this.post(p0, new PicTemplateDownloadResAction(this.template));
                break ;
             }
          }
       }
       return null;
    }
    public b handle(KSStore p0,e p1){
       return this.handle(p0, p1);
    }
    public PicTemplateState reduce(PicTemplateState p0){
       Object obj = this;
       Object obj1 = p0;
       List obj2 = PatchProxy.applyOneRefs(obj1, obj, PicTemplateSwitchTemplateAction.class, "2");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       a.p(obj1, "state");
       if (obj.template.f() == PicTemplateState$ResourceState.READY) {
          return obj1;
       }
       obj2 = p0.d();
       ArrayList uArrayList = new ArrayList(u.Y(obj2, 10));
       Iterator iterator = obj2.iterator();
       while (iterator.hasNext()) {
          PicTemplateState$b uob = iterator.next();
          if (uob.f()) {
             uob = PicTemplateState$b.a(uob, null, null, false, obj.template, null, null, 55, null);
          }
          uArrayList.add(uob);
       }
       return PicTemplateState.a(p0, uArrayList, null, null, null, false, false, false, 0, 0, 0, 0, null, null, 0, 0x3ffe, null);
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
}
