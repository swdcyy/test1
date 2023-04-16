package com.kuaishou.pagedy.b;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import nv.c;
import com.kuaishou.pagedy.PageDy;
import com.kuaishou.pagedy.manager.DynamicPageCenter;
import com.kuaishou.bowl.core.component.a;
import bo4.d;
import java.lang.Runnable;
import ekd.k1;
import uu.d;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.pagedy.b$a;
import java.util.Map;
import java.util.HashMap;
import bo4.c;
import java.util.ArrayList;
import ho4.b;
import com.kuaishou.pagedy.b$b;
import kotlin.jvm.internal.a;
import com.kuaishou.pagedy.container.widget.DynamicMultiTabsView;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import do4.n;
import ho4.d;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo$Field;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo$DataApi;
import com.google.gson.JsonElement;
import go4.b;
import trd.t0;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentInfo;
import com.kuaishou.pagedy.util.PageDyUtil;
import com.google.gson.Gson;
import com.kuaishou.pagedy.util.a;
import java.lang.StringBuilder;
import lo4.f;
import su.g;
import tu.d;
import android.view.ViewGroup;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$a;
import androidx.core.view.ViewGroupKt$b;
import android.view.View;
import yz7.e;
import lo4.g;
import hu4.n;
import androidx.fragment.app.FragmentActivity;
import hu4.f;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public class b	// class@000a45
{

    public void b(){
       super();
    }
    public static boolean a(Fragment p0,String p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (p0 == null) {
          c.b("PageDy anchorToComponent error fragment is null ");
          return b;
       }else {
          DynamicPageCenter uDynamicPage = PageDy.e().h(p0);
          if (uDynamicPage == null) {
             return b;
          }
          a uoa = uDynamicPage.h();
          if (uoa == null) {
             return b;
          }
          k1.r(new d(uoa, p1), 10);
          return true;
       }
    }
    public static void b(Fragment p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "9")) {
          return;
       }
       a uoa = b.f(b.k(p0), p1);
       if (uoa != null && uoa instanceof d) {
          Iterator iterator = uoa.children.iterator();
          while (iterator.hasNext()) {
             a uoa1 = iterator.next();
             if (TextUtils.equals(p1, uoa1.componentData.instanceId)) {
                uoa.deleteChild(uoa1);
                break ;
             }
          }
       }else {
          c.b("deleteComponent fail,can\'t find parent node");
       }
       return;
    }
    public static void c(Fragment p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "10")) {
          return;
       }
       a uoa = b.k(p0);
       int i = p1.size();
       i = i - 1;
       while (i >= 0) {
          String instanceId = p1.get(i).getInstanceId();
          a uoa1 = b.f(uoa, instanceId);
          if (uoa1 != null && uoa1 instanceof d) {
             Iterator iterator = uoa1.children.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   a uoa2 = iterator.next();
                   if (TextUtils.equals(instanceId, uoa2.componentData.instanceId)) {
                      uoa1.deleteChild(uoa2);
                   }else {
                      continue ;
                   }
                }else {
                   continue ;
                }
             }
             return;
          }else {
             c.b("deleteComponent fail,can\'t find parent node");
          }
       }
    }
    public static void d(a p0,List p1,b$a p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, b.class, "16")) {
          return;
       }
       if (p0 != null && p0.componentData != null) {
          if (p2.a(p0)) {
             p1.add(p0);
          }
          List realChildren = p0.getRealChildren(p3);
          if (realChildren == null) {
             return;
          }else {
             for (int i = 0; i < realChildren.size(); i = i + 1) {
                b.d(realChildren.get(i), p1, p2, p3);
             }
          }
       }
       return;
    }
    public static a e(a p0,b$a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.componentData != null) {
          if (p1.a(p0)) {
             return p0;
          }else {
             List realChildren = p0.getRealChildren(null);
             if (realChildren == null) {
                return null;
             }else {
                int i = 0;
                while (i < realChildren.size()) {
                   a uoa = b.e(realChildren.get(i), p1);
                   if (uoa != null) {
                      return uoa;
                   }
                   i = i + 1;
                }
             }
          }
       }
       return null;
    }
    public static a f(a p0,String p1){
       HashMap obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = new HashMap();
       obj.put("disable_pre_resolve", Boolean.TRUE);
       List realChildren = p0.getRealChildren(obj);
       if (realChildren != null && realChildren.size()) {
          int i = 0;
          int i1 = 0;
          while (true) {
             if (i1 < realChildren.size()) {
                a uoa = realChildren.get(i1);
                if (uoa != null) {
                   uoa = uoa.componentData;
                   if (uoa != null && TextUtils.equals(p1, uoa.instanceId)) {
                      return p0;
                   }
                }
                i1 = i1 + 1;
             }else {
                while (i < realChildren.size()) {
                   p0 = b.f(realChildren.get(i), p1);
                   if (p0 != null) {
                      return p0;
                   }
                   i = i + 1;
                }
             }
          }
       }
       return null;
    }
    public static a g(Fragment p0,b$a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.e(b.k(p0), p1);
    }
    public static a h(Fragment p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.e(b.k(p0), new c(p1));
    }
    public static List i(Fragment p0,b$a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.j(p0, p1, false);
    }
    public static List j(Fragment p0,b$a p1,boolean p2){
       ArrayList obj;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, b.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       HashMap hashMap = new HashMap();
       hashMap.put("allTab", Boolean.valueOf(p2));
       b.d(b.k(p0), obj, p1, hashMap);
       return obj;
    }
    public static a k(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          c.f("getRootComponent fragment is null");
          return null;
       }else {
          DynamicPageCenter uDynamicPage = PageDy.e().h(p0);
          if (uDynamicPage != null) {
             return uDynamicPage.h();
          }
          return null;
       }
    }
    public static List l(Fragment p0,b p1,b$b p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "19");
       if (p0 != patchProxyRe) {
          return p0;
       }
       ArrayList uArrayList = new ArrayList();
       if (p1 != null) {
          uArrayList = PatchProxy.applyOneRefs(p2, p1, b.class, "29");
          if (uArrayList != patchProxyRe) {
          }else {
             a.p(p2, "tabPredicate");
             uArrayList = new ArrayList();
             a rootView = p1.rootView;
             if (!rootView instanceof DynamicMultiTabsView) {
                rootView = null;
             }
             if (rootView != null) {
                int i = 0;
                Iterator iterator = rootView.getAllChildViewHolder().iterator();
                while (iterator.hasNext()) {
                   a obj = iterator.next();
                   int i1 = i + 1;
                   if (i < 0) {
                      CollectionsKt__CollectionsKt.W();
                   }
                   if (obj.b() == 3) {
                      obj = b.e(obj.a(), d.a);
                      if (obj != null) {
                         a componentDat = obj.componentData;
                         if (componentDat != null) {
                            PageDyComponentInfo filedData = componentDat.filedData;
                            if (filedData != null) {
                               PageComponentDataInfo$Field dataApi = filedData.dataApi;
                               if (dataApi != null) {
                                  PageComponentDataInfo$DataApi params = dataApi.params;
                                  if (params != null) {
                                     Map map = b.a(params);
                                     if (map != null && p2.a(map, i)) {
                                        uArrayList = obj.getRealChildren(t0.z());
                                        a.o(uArrayList, "listComponent.getRealChildren\(mapOf\(\)\)");
                                        break ;
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                   i = i1;
                }
             }
          }
       }else {
          c.b("[getTabComponents] mainTab is null");
       }
       return uArrayList;
    }
    public static List m(Fragment p0,PageComponentInfo p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       List obj = null;
       DynamicPageCenter obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, b.class, "21");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = PageDy.e().h(p0);
       if (obj1 != null) {
          String str = PageDyUtil.a(p0);
          obj = PatchProxy.applyThreeRefs(str, p1, obj1, obj1, DynamicPageCenter.class, "25");
          if (obj != patchProxyRe) {
          }else {
             obj = a.k(str, p1, obj1.e, obj1);
          }
          return obj;
       }else {
          c.b("[parsePartComponents] dynamicPageCenter is null");
          return obj;
       }
    }
    public static boolean n(Fragment p0,String p1,Map p2){
       boolean b;
       Object[] objArray1;
       f obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       c.f("popupHide:"+p1);
       b = false;
       if (p0 == null) {
          c.b("PageDy anchorToComponent error fragment is null ");
          return b;
       }else {
          a uoa = b.h(p0, p1);
          if (uoa == null) {
             return b;
          }
          obj = new f(p0, uoa, p2);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, obj, f.class, "2")) {
             g og = g.a(PageDyUtil.a(obj.a));
             if (og != null) {
                og = og.p;
                if (og != null) {
                   d uod = og.get("KEY_GET_POPUP_LAYOUT_CALLBACK");
                   if (uod != null) {
                      objArray1 = uod.e();
                   label_006d :
                      if (!objArray1 instanceof ViewGroup) {
                         objArray1 = objArray;
                      }
                      f b1 = obj.b;
                      a relatedCompo = b1.relatedComponent;
                      if (relatedCompo != null && (a.g(b1.relatedAction, "popup") && objArray1 != null)) {
                         Iterator iterator = ViewGroupKt.b(objArray1).iterator();
                         while (true) {
                            Iterator iterator1 = iterator;
                            if (iterator1.hasNext()) {
                               Object obj1 = iterator1.next();
                               if (a.g(obj1.getTag(0x7f0a0c6d), relatedCompo.getInstanceId())) {
                                  objArray = obj1;
                               }
                            }
                            if (objArray != null) {
                               objArray1.removeView(objArray);
                            }
                         }
                      }
                   label_00b9 :
                      obj.b.invoke("onPopupHide", e.f(obj.c));
                   }
                }
                objArray1 = objArray;
                goto label_006d ;
             }
          }
          return true;
       }
    }
    public static boolean o(Fragment p0,String p1,Map p2){
       Object[] objArray1;
       g b;
       Object[] objArray2;
       n on;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       c.f("popupShow:"+p1);
       if (p0 == null) {
          c.b("PageDy anchorToComponent error fragment is null ");
          return false;
       }else {
          a uoa = b.h(p0, p1);
          if (uoa == null) {
             return false;
          }
          g og = new g(p0, uoa, p2);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, og, g.class, "2")) {
             g og1 = g.a(PageDyUtil.a(og.a));
             if (og1 != null) {
                og1 = og1.p;
                if (og1 != null) {
                   d uod = og1.get("KEY_GET_POPUP_LAYOUT_CALLBACK");
                   if (uod != null) {
                      objArray1 = uod.e();
                   label_006e :
                      if (!objArray1 instanceof ViewGroup) {
                         objArray1 = objArray;
                      }
                      b = og.b;
                      a relatedCompo = b.relatedComponent;
                      if (relatedCompo == null || (a.g(b.relatedAction, "popup") ^ true)) {
                         c.b("PopupShowActionHandler error,relatedComponent is null");
                      }else if(objArray1 == null){
                         c.b("PopupShowActionHandler error,viewGroup is null");
                      }else {
                         Iterator iterator = ViewGroupKt.b(objArray1).iterator();
                         while (true) {
                            Iterator iterator1 = iterator;
                            if (iterator1.hasNext()) {
                               objArray2 = iterator1.next();
                               if (!a.g(objArray2.getTag(0x7f0a0c6d), relatedCompo.getInstanceId())) {
                                  continue ;
                               }
                            }else {
                               objArray2 = objArray;
                            }
                            if (objArray2 != null) {
                               objArray1.removeView(objArray2);
                            }
                            int[] ointArray = new int[2]{0,0};
                            og.b.rootView.getLocationOnScreen(ointArray);
                            int[] ointArray1 = new int[2]{0,0};
                            objArray1.getLocationOnScreen(ointArray1);
                            if (!relatedCompo.isTypeNative()) {
                               a componentDat = relatedCompo.componentData;
                               if (componentDat != null) {
                                  a.o(componentDat, "relatedComponent.componentData");
                                  on = new n(componentDat.bundleUrl, componentDat.getMapParams());
                               label_00f6 :
                                  View view = relatedCompo.getView(og.a.getActivity(), on, objArray1, objArray);
                                  if (view != null) {
                                     FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -1);
                                     layoutParams.leftMargin = ointArray[0] - ointArray1[0];
                                     layoutParams.topMargin = ointArray[1] - ointArray1[1];
                                     view.setTag(R.id.dynamic_related_popup_view, relatedCompo.getInstanceId());
                                     objArray1.addView(view, layoutParams);
                                     relatedCompo.bindData(relatedCompo, view, false);
                                     relatedCompo.invoke("onPopupShow", e.f(og.c));
                                     break ;
                                  }
                               }
                            }
                            on = objArray;
                            goto label_00f6 ;
                         }
                      }
                   }
                }
                objArray1 = objArray;
                goto label_006e ;
             }
          }
          return true;
       }
    }
    public static boolean p(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       p0.updateModelObj(p0.getModelObj());
       p0.markDataChanged();
       return true;
    }
}
