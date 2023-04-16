package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyAction;
import duc.c;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDraftAction;
import buc.j;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import androidx.lifecycle.ViewModelProvider;
import com.yxcorp.gifshow.v3.framework.KSStore;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import java.lang.StringBuilder;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$b;
import java.util.Collection;
import auc.a;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import java.util.Objects;
import brd.t;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import auc.b;
import erd.g;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyAction$a;
import erd.o;
import brd.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyAction$b;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyAction$c;
import erd.a;
import trd.u;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import tvc.e;
import brd.e;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyAction$d;

public final class PicTemplateApplyAction extends PicTemplateDraftAction implements c	// class@001351
{
    public final List assets;
    public final boolean notifyUpdate;
    public final j template;

    public void PicTemplateApplyAction(j p0,List p1,boolean p2){
       a.p(p0, "template");
       a.p(p1, "assets");
       super();
       this.template = p0;
       this.assets = p1;
       this.notifyUpdate = p2;
    }
    public void PicTemplateApplyAction(j p0,List p1,boolean p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = true;
       }
       super(p0, p1, p2);
       return;
    }
    public final List getAssets(){
       return this.assets;
    }
    public final boolean getNotifyUpdate(){
       return this.notifyUpdate;
    }
    public final j getTemplate(){
       return this.template;
    }
    public b handle(ViewModelProvider p0,KSStore p1,PicTemplateState p2,c p3){
       b uob1;
       ArrayList uArrayList;
       b id3;
       a a;
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Iterator obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, PicTemplateApplyAction.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "vmp");
       a.p(p1, "store");
       a.p(p2, "state");
       a.p(p3, "draft");
       b uob = null;
       if (!p2.e()) {
          return uob;
       }
       String str = "PicTemplateAction";
       if (p2.k()) {
          PostUtils.F(str, "apply when illegal state");
          return uob;
       }else {
          obj = p2.r().iterator();
          while (true) {
             if (obj.hasNext()) {
                uob1 = obj.next();
                if (!a.g(uob1.getId(), this.template.getId())) {
                   continue ;
                }
             }else {
                uob1 = uob;
             }
             if (uob1 == null) {
                PostUtils.F(str, "template invalid: "+this.template);
                return uob;
             }else {
                uArrayList = new ArrayList();
                obj = this.assets.iterator();
                while (obj.hasNext()) {
                   Object obj1 = obj.next();
                   String id = obj1.getId();
                   PicTemplateState$b uob2 = p2.l();
                   String id1 = (uob2 != null)? uob2.getId(): uob;
                   if (a.g(id, id1)) {
                      j id2 = p2.l().e();
                      id = (id2 != null)? id2.getId(): uob;
                      if (a.g(id, uob1.getId())) {
                         id3 = null;
                      label_00cc :
                         if (id3) {
                            uArrayList.add(obj1);
                         }else {
                            continue ;
                         }
                      }
                   }
                   id3 = 1;
                   goto label_00cc ;
                }
                a = a.a;
                String filePath = uob1.b().getFilePath();
                Objects.requireNonNull(a);
                ot = PatchProxy.applyOneRefs(filePath, a, a.class, "1");
                if (ot != patchProxyRe) {
                }else {
                   a.p(filePath, "path");
                   ot = DraftFileManager.E().b0(new File(filePath)).doOnNext(b.b);
                   a.o(ot, "DraftFileManager.getInst¡­emplateDraft\(draft\)\n    }");
                }
             }
          }
          PicTemplateApplyAction$a uoa = new PicTemplateApplyAction$a(this, uArrayList, p0, p3, p1);
          return ot.subscribeOn(d.c).observeOn(d.a).flatMapCompletable(patchProxyRe).u(new PicTemplateApplyAction$b(this, p0, p1), new PicTemplateApplyAction$c(this, p1));
       }
    }
    public PicTemplateState reduce(PicTemplateState p0){
       Object obj = this;
       Object obj1 = p0;
       List obj2 = PatchProxy.applyOneRefs(obj1, obj, PicTemplateApplyAction.class, "3");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       a.p(obj1, "state");
       if (!p0.e()) {
          return obj1;
       }
       if (p0.k()) {
          return obj1;
       }
       obj2 = p0.d();
       ArrayList uArrayList = new ArrayList(u.Y(obj2, 10));
       Iterator iterator = obj2.iterator();
       while (iterator.hasNext()) {
          PicTemplateState$b uob = iterator.next();
          PicTemplateApplyAction assets = obj.assets;
          int i = 0;
          if (!assets instanceof Collection || !assets.isEmpty()) {
             Iterator iterator1 = assets.iterator();
             while (iterator1.hasNext()) {
                if (a.g(iterator1.next().getId(), uob.getId())) {
                   i = 1;
                   break ;
                }
             }
          }
          if (i) {
             uob = PicTemplateState$b.a(uob, null, null, false, null, obj.template, null, 47, null);
          }
          uArrayList.add(uob);
       }
       return PicTemplateState.a(p0, uArrayList, null, null, obj.reduceTemplates(obj1, p0.r()), true, false, false, 0, 0, 0, 0, null, null, 0, 0x3fe6, null);
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
    public final List reduceTemplates(PicTemplateState p0,List p1){
       ArrayList uArrayList;
       Object obj = this;
       List obj1 = p1;
       PicTemplateApplyAction obj2 = PatchProxy.applyTwoRefs(p0, obj1, obj, PicTemplateApplyAction.class, "4");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       obj2 = obj.assets;
       if (!obj2 instanceof Collection || !obj2.isEmpty()) {
          Iterator iterator1 = obj2.iterator();
          while (true) {
             if (iterator1.hasNext()) {
                String id = iterator1.next().getId();
                PicTemplateState$b uob = p0.l();
                String id1 = (uob != null)? uob.getId(): null;
                if (a.g(id, id1)) {
                   uArrayList = null;
                   break ;
                }
             }
          }
          if (uArrayList) {
             return obj1;
          }else {
             obj1 = p0.r();
             uArrayList = new ArrayList(u.Y(obj1, 10));
             Iterator iterator = obj1.iterator();
             while (iterator.hasNext()) {
                PicTemplateState$e uoe = iterator.next();
                if (a.g(uoe.getId(), obj.template.getId())) {
                   uoe = PicTemplateState$e.a(uoe, null, null, 0, false, true, null, false, null, false, 495, null);
                }else {
                   int i = a.g(uoe.getId(), obj.template.getId()) ^ 1;
                   if (i && uoe.h()) {
                      uoe = PicTemplateState$e.a(uoe, null, null, 0, false, false, null, false, null, false, 495, null);
                   }
                }
                uArrayList.add(uoe);
             }
             return uArrayList;
          }
       }
       uArrayList = 1;
       goto label_004b ;
    }
    public final e saveTemplateInfoToDraft(KSStore p0,c p1,String p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, PicTemplateApplyAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a uoa = a.q(new PicTemplateApplyAction$d(p0, p1, p2, p3));
       a.o(uoa, "Completable.fromAction {¡­templateId\)\n      \)\n    }");
       return uoa;
    }
}
