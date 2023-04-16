package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateRefreshListSuccessAction;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateAction;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import java.util.Collection;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$b;
import buc.j;
import trd.u;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateGroupInfo;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import tvc.e;

public final class PicTemplateRefreshListSuccessAction extends PicTemplateAction	// class@001374
{
    public final List groups;
    public final List items;

    public void PicTemplateRefreshListSuccessAction(List p0,List p1){
       a.p(p0, "groups");
       a.p(p1, "items");
       super();
       this.groups = p0;
       this.items = p1;
    }
    public final Iterable filterOutRecommendGroupSamePlcTemplate(List p0){
       PicTemplateState$d obj = PatchProxy.applyOneRefs(p0, this, PicTemplateRefreshListSuccessAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.isEmpty()) {
          return this.items;
       }
       obj = CollectionsKt___CollectionsKt.p2(this.groups);
       if (obj == null) {
          return this.items;
       }
       if (a.g(obj.b(), "ÍÆ¼ö") ^ 1) {
          return this.items;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.items.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          Object obj2 = obj1;
          if (i < obj.a()) {
             if (!p0.isEmpty()) {
                Iterator iterator1 = p0.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      if (a.g(iterator1.next().b().getPicTemplateInfo().getId(), obj2.b().getPicTemplateInfo().getId())) {
                         iterator1 = 0;
                         break ;
                      }
                   }
                }
                if (!i) {
                   i = 0;
                label_0097 :
                   if (i) {
                      uArrayList.add(obj1);
                   }
                   i = i1;
                }
             }
             i = 1;
             goto label_0091 ;
          }
          i = 1;
          goto label_0097 ;
       }
       return uArrayList;
    }
    public final List getGroups(){
       return this.groups;
    }
    public final List getItems(){
       return this.items;
    }
    public PicTemplateState reduce(PicTemplateState p0){
       String id;
       PicTemplateState$d obj3;
       PicTemplateGroupInfo picTemplateG;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PicTemplateState$b obj2 = PatchProxy.applyOneRefs(obj1, obj, PicTemplateRefreshListSuccessAction.class, "1");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       a.p(obj1, "state");
       obj2 = p0.l();
       if (obj2 != null) {
          j oj = obj2.b();
          if (oj != null) {
             id = oj.getId();
          label_002a :
             Iterable iterable = obj.filterOutRecommendGroupSamePlcTemplate(p0.r());
             List list = p0.r();
             ArrayList uArrayList = new ArrayList(u.Y(list, 10));
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                obj3 = iterator.next();
                String str = null;
                List list1 = null;
                float f = 0;
                boolean b = false;
                boolean b1 = false;
                PicTemplateInfo picTemplateI = obj3.b().getPicTemplateInfo();
                PicTemplateState$e uoe = CollectionsKt___CollectionsKt.p2(obj.items);
                if (uoe != null) {
                   PicTemplate picTemplate = uoe.b();
                   if (picTemplate != null) {
                      picTemplateG = picTemplate.getPicTemplateGroupInfo();
                      if (picTemplateG != null) {
                      label_0081 :
                         uArrayList.add(PicTemplateState$e.a(obj3, str, list1, f, b, false, null, b1, new PicTemplate(picTemplateI, picTemplateG, obj3.b().getFilePath()), false, 383, null));
                         picTemplateI = 10;
                      }
                   }
                }
                picTemplateG = obj3.b().getPicTemplateGroupInfo();
                goto label_0081 ;
             }
             iterator = 0;
             PicTemplateState$ResourceState rEADY = PicTemplateState$ResourceState.READY;
             PicTemplateRefreshListSuccessAction groups = obj.groups;
             ArrayList uArrayList1 = new ArrayList(u.Y(groups, 10));
             int i = 0;
             Iterator iterator1 = groups.iterator();
             while (iterator1.hasNext()) {
                obj3 = iterator1.next();
                int i1 = i + 1;
                if (i < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                if (!i) {
                   i = obj3.a() + p0.r().size();
                   String id1 = obj3.getId();
                   PicTemplateState$d b2 = obj3.b;
                   if (PatchProxy.isSupport(PicTemplateState$d.class)) {
                      obj3 = PatchProxy.applyThreeRefs(id1, b2, Integer.valueOf(i), obj3, PicTemplateState$d.class, "2");
                      if (obj3 != patchProxyRe) {
                      }
                   }
                   a.p(id1, "id");
                   a.p(b2, "title");
                   obj3 = new PicTemplateState$d(id1, b2, i);
                }
                uArrayList1.add(obj3);
                i = i1;
             }
             List list2 = CollectionsKt___CollectionsKt.m4(uArrayList, iterable);
             ArrayList uArrayList2 = new ArrayList(u.Y(list2, 10));
             Iterator iterator2 = list2.iterator();
             while (iterator2.hasNext()) {
                PicTemplateState$e uoe1 = iterator2.next();
                if (a.g(uoe1.getId(), id)) {
                   uoe1 = PicTemplateState$e.a(uoe1, null, null, 0, false, true, null, false, null, false, 495, null);
                }
                uArrayList2.add(uoe1);
             }
             return PicTemplateState.a(p0, iterator, rEADY, uArrayList1, uArrayList2, false, false, false, 0, 0, 0, 0, null, null, 0, 0x3ff1, null);
          }
       }
       id = null;
       goto label_002a ;
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
}
