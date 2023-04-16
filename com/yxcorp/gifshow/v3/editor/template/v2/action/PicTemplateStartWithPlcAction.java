package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateStartWithPlcAction;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDraftAction;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateGroupInfo;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;
import androidx.lifecycle.ViewModelProvider;
import com.yxcorp.gifshow.v3.framework.KSStore;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import crd.b;
import brd.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateStartEditAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Collection;
import java.lang.Math;
import kotlin.Pair;
import qrd.r0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Map$Entry;
import buc.a;
import trd.u;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$b;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyAction;
import buc.j;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateStartWithPlcAction$a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateStartWithPlcAction$b;
import erd.a;
import erd.g;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateStartWithPlcAction$nextProcessorAction$1;
import io.reactivex.a;
import brd.e;
import java.util.HashSet;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import tvc.e;

public final class PicTemplateStartWithPlcAction extends PicTemplateDraftAction	// class@00137d
{
    public final List templateIds;
    public final List templateResources;

    public void PicTemplateStartWithPlcAction(List p0,List p1){
       a.p(p0, "templateIds");
       a.p(p1, "templateResources");
       super();
       this.templateIds = p0;
       this.templateResources = p1;
    }
    public final String generatePlcPicTemplateId(PicTemplate p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateStartWithPlcAction.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "plc_"+p0.getPicTemplateGroupInfo().getId()+"_"+p0.getPicTemplateInfo().getId();
    }
    public final List getTemplateIds(){
       return this.templateIds;
    }
    public final List getTemplateResources(){
       return this.templateResources;
    }
    public b handle(ViewModelProvider p0,KSStore p1,PicTemplateState p2,c p3){
       String str;
       String str2;
       Iterable obj1;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, PicTemplateStartWithPlcAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "vmp");
       a.p(p1, "store");
       a.p(p2, "state");
       a.p(p3, "draft");
       a uoa = a.g();
       a.o(uoa, "chain");
       uoa = this.nextProcessorAction(uoa, p1, new PicTemplateStartEditAction());
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.templateIds.iterator();
       while (iterator.hasNext()) {
          str = iterator.next();
          Iterator iterator1 = this.templateResources.iterator();
          while (true) {
             String str1 = null;
             if (iterator1.hasNext()) {
                str2 = iterator1.next();
                if (!a.g(str2.getPicTemplateInfo().getId(), str)) {
                   continue ;
                }
             }else {
                str2 = str1;
             }
             if (str2 != null) {
                str1 = this.generatePlcPicTemplateId(str2);
             }
             if (str1 != null) {
                uArrayList.add(str1);
             }else {
                continue ;
             }
          }
       }
       ArrayList uArrayList1 = new ArrayList();
       int i = Math.min(uArrayList.size(), p2.d().size());
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          uArrayList1.add(r0.a(uArrayList.get(i1), p2.d().get(i1)));
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       iterator = uArrayList1.iterator();
       while (iterator.hasNext()) {
          obj1 = iterator.next();
          str = obj1.getFirst();
          ArrayList uArrayList2 = linkedHashMa.get(str);
          if (uArrayList2 == null) {
             uArrayList2 = new ArrayList();
             linkedHashMa.put(str, uArrayList2);
          }
          uArrayList2.add(obj1);
       }
       Iterator iterator2 = linkedHashMa.entrySet().iterator();
       boolean i2 = 0;
       while (iterator2.hasNext()) {
          obj1 = iterator2.next();
          i = i2 + 1;
          if (i2 < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          a.o(uoa, "chain");
          a uoa1 = new a(obj1.getKey());
          obj1 = obj1.getValue();
          ArrayList uArrayList3 = new ArrayList(u.Y(obj1, 10));
          Iterator iterator3 = obj1.iterator();
          while (iterator3.hasNext()) {
             uArrayList3.add(iterator3.next().getSecond());
          }
          i2 = (!i2)? true: false;
          uoa = this.nextProcessorAction(uoa, p1, new PicTemplateApplyAction(uoa1, uArrayList3, i2));
          i2 = i;
       }
       return uoa.u(new PicTemplateStartWithPlcAction$a(p0), PicTemplateStartWithPlcAction$b.b);
    }
    public final a nextProcessorAction(a p0,KSStore p1,PicTemplateDraftAction p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PicTemplateStartWithPlcAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.b(a.k(new PicTemplateStartWithPlcAction$nextProcessorAction$1(this, p1, p2)));
       a.o(p0, "andThen\(Completable.crea¡­       }\n      }\)\)\n    }\)");
       return p0;
    }
    public PicTemplateState reduce(PicTemplateState p0){
       PicTemplateState$e obj2;
       ArrayList obj3;
       Object obj = this;
       PicTemplateState picTemplateS = p0;
       Iterator obj1 = PatchProxy.applyOneRefs(picTemplateS, obj, PicTemplateStartWithPlcAction.class, "4");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(picTemplateS, "state");
       ArrayList uArrayList = new ArrayList();
       obj1 = obj.templateIds.iterator();
       while (obj1.hasNext()) {
          String str = obj1.next();
          Iterator iterator = obj.templateResources.iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj2 = iterator.next();
                if (!a.g(obj2.getPicTemplateInfo().getId(), str)) {
                   continue ;
                }
             }else {
                obj2 = null;
             }
             if (obj2 != null) {
                uArrayList.add(obj2);
             }else {
                continue ;
             }
          }
       }
       HashSet hashSet = new HashSet();
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator1 = uArrayList.iterator();
       while (iterator1.hasNext()) {
          obj3 = iterator1.next();
          if (hashSet.add(obj3.getPicTemplateInfo().getId())) {
             uArrayList1.add(obj3);
          }
       }
       obj3 = new ArrayList(u.Y(uArrayList1, 10));
       obj1 = uArrayList1.iterator();
       while (obj1.hasNext()) {
          Object obj4 = obj1.next();
          String str1 = obj.generatePlcPicTemplateId(obj4);
          List icon = obj4.getPicTemplateInfo().getIcon();
          if (icon == null) {
             icon = CollectionsKt__CollectionsKt.E();
          }
          obj2 = new PicTemplateState$e(str1, icon, 0, false, false, null, false, obj4, true, 124, null);
          obj3.add(iterator1);
       }
       if (obj3.isEmpty() ^ 0x01) {
          picTemplateS = PicTemplateState.a(p0, null, null, null, obj3, false, false, false, 0, 0, 0, 0, null, null, null, 0x3ff7, null);
       }
       return picTemplateS;
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
}
