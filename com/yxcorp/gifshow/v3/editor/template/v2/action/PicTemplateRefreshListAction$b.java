package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateRefreshListAction$b;
import erd.g;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateRefreshListAction;
import com.yxcorp.gifshow.v3.framework.KSStore;
import java.lang.Object;
import ytc.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ytc.a$c;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateRefreshListFailureAction;
import java.lang.Throwable;
import java.lang.StringBuilder;
import tvc.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateAction;
import java.lang.Iterable;
import java.util.ArrayList;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateGroupInfo;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDivider;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import nsd.u;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map$Entry;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$d;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateRefreshListSuccessAction;

public final class PicTemplateRefreshListAction$b implements g	// class@001370
{
    public final PicTemplateRefreshListAction b;
    public final KSStore c;

    public void PicTemplateRefreshListAction$b(PicTemplateRefreshListAction p0,KSStore p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       String str;
       Map$Entry obj1;
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateRefreshListAction$b.class, "1")) {
       }else if(!p0 instanceof a$c){
          this.b.post(this.c, new PicTemplateRefreshListFailureAction(new Throwable("illegal state: "+p0)));
       }else {
          p0 = p0.a;
          ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
          p0 = p0.iterator();
          while (p0.hasNext()) {
             Object obj = p0.next();
             str = obj.getPicTemplateGroupInfo().getId()+"_"+obj.getPicTemplateInfo().getId();
             List icon = obj.getPicTemplateInfo().getIcon();
             if (icon == null) {
                icon = CollectionsKt__CollectionsKt.E();
             }
             PicTemplateState$e uoe = new PicTemplateState$e(str, icon, 0, false, false, null, obj instanceof PicTemplateDivider, obj, false, 316, null);
             uArrayList.add(v1);
          }
          p0 = new LinkedHashMap();
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             obj1 = iterator.next();
             str = obj1.b().getPicTemplateGroupInfo().getName();
             ArrayList uArrayList1 = p0.get(str);
             if (uArrayList1 == null) {
                uArrayList1 = new ArrayList();
                p0.put(str, uArrayList1);
             }
             uArrayList1.add(obj1);
          }
          ArrayList uArrayList2 = new ArrayList(p0.size());
          p0 = p0.entrySet().iterator();
          while (p0.hasNext()) {
             obj1 = p0.next();
             String key = obj1.getKey();
             String key1 = obj1.getKey();
             uArrayList2.add(new PicTemplateState$d(key, key1, obj1.getValue().size()));
          }
          this.b.post(this.c, new PicTemplateRefreshListSuccessAction(uArrayList2, uArrayList));
       }
       return;
    }
}
