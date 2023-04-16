package com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$g;
import erd.o;
import java.lang.Object;
import br3.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import gr3.a;
import gr3.a$a;
import ar3.b;
import java.util.Objects;
import ar3.b$a;
import brd.t;
import com.kuaishou.liveclient.resourcemanager.apiservices.LiveCommonApi;
import ar3.a;
import com.kuaishou.liveclient.resourcemanager.apiservices.LiveCommonApi$a;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialBriefGroupInfo;
import trd.u;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialBriefInfoItem;
import java.util.Collection;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ar3.c;
import ar3.d;
import t45.d;
import brd.z;

public final class LiveMaterialResourceInfoRepo$g implements o	// class@001068
{
    public static final LiveMaterialResourceInfoRepo$g b;

    static {
       LiveMaterialResourceInfoRepo$g.b = new LiveMaterialResourceInfoRepo$g();
    }
    public void LiveMaterialResourceInfoRepo$g(){
       super();
    }
    public Object apply(Object p0){
       ArrayList uArrayList1;
       boolean b;
       t obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       b$a obj1 = PatchProxy.applyOneRefs(obj, this, LiveMaterialResourceInfoRepo$g.class, str);
       if (obj1 != patchProxyRe) {
       }else {
          a.p(obj, "groupInfos");
          a.a.a(true, 0);
          obj1 = b.a;
          Objects.requireNonNull(obj1);
          a obj2 = PatchProxy.applyTwoRefs(obj, "LIVE_PRELOAD_RESOURCE_FILE", obj1, b$a.class, "2");
          if (obj2 != patchProxyRe) {
             obj1 = obj2;
          }else {
             a.p(obj, "briefInfos");
             a.p("LIVE_PRELOAD_RESOURCE_FILE", "subBiz");
             obj2 = LiveCommonApi.b.a();
             Objects.requireNonNull(obj);
             Object[] objArray = null;
             ArrayList uArrayList = PatchProxy.apply(objArray, obj, a.class, str);
             if (uArrayList != patchProxyRe) {
             }else {
                uArrayList = new ArrayList();
                Iterator iterator = obj.materialGroupList.iterator();
                while (iterator.hasNext()) {
                   List simpleInfoLi = iterator.next().getSimpleInfoList();
                   if (simpleInfoLi != null) {
                      uArrayList1 = new ArrayList(u.Y(simpleInfoLi, 10));
                      Iterator iterator1 = simpleInfoLi.iterator();
                      while (iterator1.hasNext()) {
                         uArrayList1.add(iterator1.next().getId());
                      }
                   }else {
                      uArrayList1 = objArray;
                   }
                   b = (uArrayList1 == null || uArrayList1.isEmpty())? true: false;
                   if (!b) {
                      uArrayList.addAll(uArrayList1);
                   }
                }
             }
             Object obj3 = uArrayList;
             Object[] objArray1 = PatchProxy.applyOneRefs(obj3, obj1, b$a.class, "4");
             if (objArray1 != patchProxyRe) {
             }else if(obj3.isEmpty()){
                objArray = CollectionsKt___CollectionsKt.V2(obj3, ",", "[", "]", 0, null, null, 56, null);
             }
             objArray1 = objArray;
             obj = obj2.b("LIVE_PRELOAD_RESOURCE_FILE", objArray1).map(c.b).map(new d(obj)).observeOn(d.c);
             a.o(obj, "LiveCommonApi.service\n  ¡­eOn\(KwaiSchedulers.ASYNC\)");
             obj1 = obj;
          }
       }
       return obj1;
    }
}
