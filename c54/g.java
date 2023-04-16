package c54.g;
import erd.g;
import c54.o;
import com.kuaishou.merchant.live.cart.onsale.audience.model.RealTimeUpdateResponse$TabResponse;
import ho4.b;
import java.lang.Object;
import c54.o$a;
import java.util.Objects;
import ho4.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import java.lang.Integer;
import com.kuaishou.pagedy.b$b;
import com.kuaishou.pagedy.b;
import kotlin.jvm.internal.a;
import com.kuaishou.bowl.core.component.a;
import com.kuaishou.pagedy.container.widget.DynamicMultiTabsView;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import do4.n;
import ho4.f;
import com.kuaishou.pagedy.b$a;
import com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo$Field;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo$DataApi;
import com.google.gson.JsonElement;
import java.util.Map;
import go4.b;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter;
import java.util.ArrayList;
import ho4.r$c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import nv.c;
import java.lang.Boolean;
import ho4.e;
import com.kuaishou.pagedy.container.widget.DynamicNestedRecyclerView;
import eo4.a;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView;
import crd.b;
import su.e;
import ho4.i;
import io.reactivex.g;
import brd.t;
import t45.d;
import brd.z;
import ho4.j;
import w44.b;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.log.LiveCartNode;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopFrameModel$Toast;

public final class g implements g	// class@0004b8
{
    public final o b;
    public final RealTimeUpdateResponse$TabResponse c;
    public final b d;

    public void g(o p0,RealTimeUpdateResponse$TabResponse p1,b p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       Object[] objArray;
       int i;
       b$b uob1;
       o$a a;
       RealTimeUpdateResponse$TabResponse mToast;
       o$a uoa1;
       o$a uoa2;
       a obj;
       Iterator iterator;
       int i1;
       a componentDat;
       PageDyComponentInfo filedData;
       PageComponentDataInfo$Field dataApi;
       PageComponentDataInfo$DataApi params;
       Map map;
       a rootView1;
       h f;
       o$a uoa3;
       i oi;
       t ot;
       Iterator iterator1;
       g og = this;
       g b = og.b;
       g c = og.c;
       g d = og.d;
       o$a uoa = p0;
       Objects.requireNonNull(b);
       b uob = b.class;
       if (uoa) {
          if (PatchProxy.applyVoidTwoRefs(c, d, b, o.class, "10")) {
          label_0069 :
             objArray = null;
             i = 1;
          }else {
             RealTimeUpdateResponse$TabResponse mTabType = c.mTabType;
             RealTimeUpdateResponse$TabResponse mTabId = c.mTabId;
             HashMap hashMap = new HashMap();
             hashMap.put("tabType", Integer.valueOf(mTabType));
             hashMap.put("tabId", mTabId);
             hashMap.put("pcursor", c.mCursor);
             hashMap.put("context", c.mContext);
             b$b uob3 = b.a(mTabType, mTabId);
             b$b uob4 = uob3;
             HashMap hashMap1 = hashMap;
             String str1 = "pcursor";
             uob1 = uob3;
             if (PatchProxy.applyVoidFourRefs(b.c, d, uob4, hashMap, 0, b.class, "20")) {
                goto label_0069 ;
             }else if(d != null){
                String str = "30";
                HashMap hashMap2 = hashMap1;
                if (PatchProxy.applyVoidTwoRefs(uob1, hashMap2, d, uob, str)) {
                   goto label_0069 ;
                }else {
                   a.p(uob1, "tabPredicate");
                   a.p(hashMap2, "params");
                   a rootView = d.rootView;
                   if (!rootView instanceof DynamicMultiTabsView) {
                      rootView = null;
                   }
                   if (rootView != null) {
                      Iterator iterator2 = rootView.getAllChildViewHolder().iterator();
                      i = 0;
                      while (true) {
                         if (iterator2.hasNext()) {
                            PageDyComponentInfo obj2 = iterator2.next();
                            int i2 = i + 1;
                            if (i < 0) {
                               CollectionsKt__CollectionsKt.W();
                            }
                            if (obj2.b() == 3) {
                               obj = b.e(obj2.a(), f.a);
                               if (obj != null) {
                                  a obj1 = obj.componentData;
                                  if (obj1 != null) {
                                     obj2 = obj1.filedData;
                                     if (obj2 != null) {
                                        PageComponentDataInfo$Field dataApi1 = obj2.dataApi;
                                        if (dataApi1 != null) {
                                           PageComponentDataInfo$DataApi params1 = dataApi1.params;
                                           if (params1 != null) {
                                              Map map1 = b.a(params1);
                                              if (map1 != null && uob1.a(map1, i)) {
                                                 map1.putAll(hashMap2);
                                                 obj.componentData.filedData.dataApi.params = d.getGson().x(map1);
                                                 rootView = (!obj instanceof h)? null: obj;
                                                 if (rootView == null || PatchProxy.applyVoidOneRefs(map1, rootView, h.class, "19")) {
                                                    goto label_0069 ;
                                                 }else if(rootView.g == null){
                                                    rootView.g = new LinkedHashMap();
                                                 }
                                                 h g = rootView.g;
                                                 if (g != null) {
                                                    g.putAll(map1);
                                                 }
                                                 g = rootView.g;
                                                 DynamicComponentAdapter obj3 = (g != null)? g.get(str1): null;
                                                 i = 1;
                                                 if (a.g(obj3, "no_more") ^ i) {
                                                    obj3 = rootView.n();
                                                    if (obj3 != null) {
                                                       objArray = null;
                                                       if (!PatchProxy.applyVoid(objArray, obj3, DynamicComponentAdapter.class, str)) {
                                                          obj3.k = i;
                                                          obj3.m = false;
                                                          if (obj3.o == null && obj3.f.size() > 0) {
                                                             DynamicComponentAdapter uDynamicComp = obj3.f;
                                                             if (uDynamicComp.get((uDynamicComp.size() - i)) instanceof r$c) {
                                                                uDynamicComp = obj3.f;
                                                                uDynamicComp.remove((uDynamicComp.size() - i));
                                                                obj3.t0((obj3.f.size() - i));
                                                                break ;
                                                             }
                                                          }
                                                       }
                                                    }else {
                                                       objArray = null;
                                                       break ;
                                                    }
                                                 }else {
                                                    objArray = null;
                                                    obj3 = rootView.n();
                                                    if (obj3 != null) {
                                                       obj3.d1();
                                                       break ;
                                                    }
                                                 }
                                              }
                                           }
                                        }
                                     }
                                  }
                               }
                            }
                            str1 = str1;
                            i = i2;
                            obj = null;
                         }else {
                            goto label_0069 ;
                         }
                      }
                   }else {
                      goto label_0069 ;
                   }
                }
             }else {
                objArray = null;
                i = 1;
                c.b("[updateTabParams] mainTab is null");
             }
          }
          o c1 = b.c;
          uob1 = b.a(c.mTabType, c.mTabId);
          a = uoa.a;
          o$a b1 = uoa.b;
          b uob2 = b.class;
          if (PatchProxy.isSupport(uob2)) {
             Object[] objArray1 = new Object[]{c1,d,uob1,a,Boolean.valueOf(b1)};
             if (!PatchProxy.applyVoid(objArray1, objArray, uob2, "22")) {
             label_01c4 :
                if (a != null) {
                   if (d != null) {
                      if (PatchProxy.isSupport(uob)) {
                         uoa1 = b1;
                         uoa2 = a;
                         obj = objArray;
                         if (!PatchProxy.applyVoidThreeRefs(uob1, a, Boolean.valueOf(b1), d, b.class, "31")) {
                         }
                      }else {
                         uoa1 = b1;
                         uoa2 = a;
                         obj = objArray;
                      }
                   }else {
                      c.b("[refreshTabList] mainTab is null");
                   }
                }
             }
          }else {
             int i3 = 0;
             goto label_01c4 ;
          }
       }
    label_0323 :
       return;
    }
}
