package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDownloadResSuccessAction;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$b;
import buc.j;
import java.util.Collection;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDownloadResSuccessAction$a;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyAction;
import nsd.u;
import tvc.a;
import tvc.e;
import trd.u;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import java.io.File;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;

public final class PicTemplateDownloadResSuccessAction extends PicTemplateAction	// class@001367
{
    public final PicTemplateState$e template;

    public void PicTemplateDownloadResSuccessAction(PicTemplateState$e p0){
       a.p(p0, "template");
       super();
       this.template = p0;
    }
    public final PicTemplateState$e getTemplate(){
       return this.template;
    }
    public b handle(KSStore p0,PicTemplateState p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplateDownloadResSuccessAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "store");
       a.p(p1, "state");
       obj = new ArrayList();
       Iterator iterator = p1.d().iterator();
       String str = null;
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          j oj = obj1.d();
          if (oj != null) {
             str = oj.getId();
          }
          if (a.g(str, this.template.getId())) {
             obj.add(obj1);
          }
       }
       if (!(obj.isEmpty() ^ 0x01)) {
          String str1 = str;
       }
       if (obj != null) {
          List list = CollectionsKt___CollectionsKt.f5(obj, new PicTemplateDownloadResSuccessAction$a());
          if (list != null) {
             PicTemplateApplyAction picTemplateA = new PicTemplateApplyAction(this.template, list, false, 4, null);
             this.post(p0, new PicTemplateDownloadResSuccessAction$a());
          }
       }
       return str;
    }
    public b handle(KSStore p0,e p1){
       return this.handle(p0, p1);
    }
    public PicTemplateState reduce(PicTemplateState p0){
       Object obj = this;
       Object obj1 = p0;
       List obj2 = PatchProxy.applyOneRefs(obj1, obj, PicTemplateDownloadResSuccessAction.class, "2");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       a.p(obj1, "state");
       obj2 = p0.r();
       int i = 10;
       ArrayList uArrayList = new ArrayList(u.Y(obj2, i));
       Iterator iterator = obj2.iterator();
       while (iterator.hasNext()) {
          PicTemplateState$e uoe = iterator.next();
          if (a.g(uoe.getId(), obj.template.getId())) {
             uoe = PicTemplateState$e.a(uoe, null, null, 0, false, false, PicTemplateState$ResourceState.READY, false, null, false, 471, null);
          }
          uArrayList.add(uoe);
       }
       int i1 = 0;
       obj2 = p0.d();
       ArrayList uArrayList1 = new ArrayList(u.Y(obj2, i));
       iterator = obj2.iterator();
       while (iterator.hasNext()) {
          PicTemplateState$b uob = iterator.next();
          j oj = uob.d();
          String id = (oj != null)? oj.getId(): null;
          if (a.g(id, obj.template.getId())) {
             uob = PicTemplateState$b.a(uob, null, null, false, null, null, null, 55, null);
          }
          uArrayList1.add(uob);
       }
       return PicTemplateState.a(p0, uArrayList1, i1, 0, uArrayList, false, false, false, 0, 0, 0, 0, null, null, 0, 0x3ff6, null);
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
}
