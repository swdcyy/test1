package com.kuaishou.pagedy.util.a;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.bowl.data.center.data.model.page.component.ComponentInfo;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo;
import com.google.gson.Gson;
import com.kuaishou.pagedy.manager.DynamicPageCenter;
import com.kuaishou.bowl.core.component.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import java.util.Map;
import com.google.gson.JsonElement;
import uu.c;
import yz7.e;
import java.lang.Exception;
import pv.a;
import nv.c;
import iv.a;
import java.util.Objects;
import com.kuaishou.bowl.core.component.c;
import com.kuaishou.bowl.core.component.KRNComponent;
import su.a;
import com.kuaishou.bowl.core.component.NativeComponent;
import java.lang.ref.WeakReference;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.kuaishou.pagedy.util.PageDyUtil;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.Iterator;
import qo4.a;
import java.util.ArrayList;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentInfo;
import java.lang.Boolean;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentGlobalInfo;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentHierarchyInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentResponse;
import su.e;
import java.util.concurrent.ExecutorService;
import t45.c;
import to4.c;
import java.lang.Runnable;
import java.util.concurrent.Future;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.StringBuilder;

public class a	// class@000a9f
{
    public static Map a;

    static {
       a.a = new HashMap();
    }
    public void a(){
       super();
    }
    public static a a(String p0,ComponentInfo p1,PageComponentDataInfo p2,Gson p3,DynamicPageCenter p4){
       PageDyComponentInfo obj1;
       PageComponentDataInfo fields;
       a uoa1;
       a uoa = a.class;
       Object obj = null;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj1 = PatchProxy.apply(objArray, obj, uoa, "10");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       obj1 = new PageDyComponentInfo();
       obj1.cid = p2.cid;
       obj1.instanceId = p2.instanceId;
       obj1.name = p2.name;
       if (p1 != null) {
          obj1.bundleUrl = p1.bundleUrl;
          obj1.renderType = p1.renderType;
       }
       if (a.a.get(p0) != null) {
          obj1.commonData = a.a.get(p0);
          Class uClass = c.a().c(p0);
          PageDyComponentInfo commonData = obj1.commonData;
          if (commonData != null && uClass != null) {
             try{
                uClass = (p3 == null)? e.a(commonData.toString(), uClass): p3.h(commonData.toString(), uClass);
                obj = uClass;
             }catch(java.lang.Exception e7){
                String[] stringArray = new String[]{"msg"};
                String[] stringArray1 = new String[]{e7.getMessage()};
                c.d("parse CommonData error", a.a(stringArray, stringArray1));
             }
          }
       }
    }
    public static a b(String p0,PageDyComponentInfo p1){
       NativeComponent nativeCompon;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       PageDyComponentInfo obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, a.class, "13");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = p1.renderType;
       Objects.requireNonNull(obj1);
       int i = -1;
       String str = null;
       switch (obj1.hashCode()){
           case 0x88d54417:
             if (obj1.equals("NATIVE")) {
                i = 0;
             }
             break;
           case 2620:
             if (obj1.equals("RN")) {
                i = 1;
             }
             break;
           case 2679:
             if (obj1.equals("TK")) {
                i = 2;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             a uoa = c.a().d(p0, p1.name);
             if (uoa != null) {
                nativeCompon = uoa.a();
             }else {
                String[] stringArray = new String[]{"componentName"};
                String[] stringArray1 = new String[]{p1.name};
                c.d("组件没有注册，请检查", a.a(stringArray, stringArray1));
             label_0076 :
                nativeCompon = obj;
             }
             break;
           case 1:
             nativeCompon = new KRNComponent();
             break;
           case 2:
             nativeCompon = new c();
             break;
           default:
             goto label_0076 ;
       }
       if (nativeCompon != null) {
          WeakReference weakReferenc = c.a().b(p0);
          if (weakReferenc != null) {
             nativeCompon.setCurActivity(weakReferenc.get());
             nativeCompon.setActivityHashCode(PageDyUtil.c(weakReferenc.get()));
          }
          c uoc = c.a();
          Objects.requireNonNull(uoc);
          Object obj2 = PatchProxy.applyOneRefs(p0, uoc, c.class, "32");
          if (obj2 != patchProxyRe) {
          }else if(uoc.d.get(p0) != null){
             obj = uoc.d.get(p0).get();
          }
          obj2 = obj;
          if (obj2 != null) {
             nativeCompon.setCurFragment(obj2);
          }
          nativeCompon.setPageHashCode(p0);
          nativeCompon.setComponentData(p1);
       }
       return nativeCompon;
    }
    public static Map c(List p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          ComponentInfo uComponentIn = iterator.next();
          obj.put(uComponentIn.name, uComponentIn);
       }
       return obj;
    }
    public static String d(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          p0 = p0.componentData;
          if (p0 != null) {
             PageDyComponentInfo engineConfig = p0.engineConfig;
             if (engineConfig != null) {
                return engineConfig.get("relatedAction");
             }
          }
       }
       return null;
    }
    public static String e(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          p0 = p0.componentData;
          if (p0 != null) {
             PageDyComponentInfo engineConfig = p0.engineConfig;
             if (engineConfig != null) {
                return engineConfig.get("relatedComponent");
             }
          }
       }
       return null;
    }
    public static a f(List p0){
       a obj = PatchProxy.applyOneRefs(p0, null, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || p0.isEmpty()) {
          return null;
       }
       obj = p0.get(0);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (uoa.c() == null) {
             obj = uoa;
          }
          Iterator iterator1 = p0.iterator();
          while (iterator1.hasNext()) {
             a uoa1 = iterator1.next();
             if (!uoa.equals(uoa1.c()) || PatchProxy.applyVoidOneRefs(uoa1, uoa, a.class, "1")) {
                continue ;
             }
             uoa.c.add(uoa1);
          }
          if (uoa.b().isTypeNative() && (uoa.a() == null || PatchProxy.applyVoidOneRefs(uoa, null, a.class, "15"))) {
             continue ;
          }else {
             a uoa2 = uoa.b();
             ArrayList uArrayList = new ArrayList();
             Iterator iterator2 = uoa.a().iterator();
             while (iterator2.hasNext()) {
                uArrayList.add(iterator2.next().b());
             }
             uoa2.children = uArrayList;
          }
       }
       return obj;
    }
    public static List g(String p0,PageComponentInfo p1,Gson p2,boolean p3){
       PageComponentInfo obj1;
       Object obj2;
       Object obj = p0;
       PageComponentInfo pageComponen = p1;
       Gson gson = p2;
       if (PatchProxy.isSupport(a.class)) {
          obj1 = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, a.class, "1");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       ArrayList uArrayList = new ArrayList();
       obj1 = pageComponen.component;
       PageComponentInfo hierarchy = pageComponen.hierarchy;
       PageComponentInfo data = pageComponen.data;
       pageComponen = pageComponen.global;
       if (obj1 != null && (hierarchy == null || data == null)) {
          c.b("PageDy getTreeNodeList error : components||global||hierarchy||data is null");
          return uArrayList;
       }else {
          Map map = a.c(obj1);
          obj1 = 0;
          PageComponentGlobalInfo pageComponen1 = (pageComponen != null)? pageComponen.commonData: obj1;
          if (pageComponen1 != null) {
             a.a.put(obj, pageComponen1);
          }
          PageComponentHierarchyInfo root = hierarchy.root;
          if (TextUtils.isEmpty(root)) {
             return uArrayList;
          }else if(data.get(root) == null){
             return uArrayList;
          }else if(data.get(root) == null){
             c.b("PageDy getTreeNodeList error rootNodeData is null");
             return uArrayList;
          }else {
             Class uClass = c.a().c(obj);
             if (pageComponen1 != null && uClass != null) {
                try{
                   obj2 = (!gson)? e.a(pageComponen1.toString(), uClass): gson.h(pageComponen1.toString(), uClass);
                label_00a9 :
                   Map map1 = map;
                   PageComponentInfo pageComponen2 = data;
                   a uoa = a.j(p0, root, map1, pageComponen2, null, pageComponen1, obj2, p2, p3);
                   HashMap hashMap = new HashMap();
                   hashMap.put(root, uoa);
                   uArrayList.add(uoa);
                   a.l(p0, uArrayList, map1, pageComponen2, hashMap, hierarchy.structure, pageComponen1, obj2, p2, p3);
                   return uArrayList;
                }catch(java.lang.Exception e0){
                   String[] stringArray = new String[]{"msg"};
                   String[] stringArray1 = new String[]{e0.getMessage()};
                   c.d("parse CommonData error", a.a(stringArray, stringArray1));
                }
             label_00a8 :
                obj2 = obj1;
                goto label_00a9 ;
             }else {
                goto label_00a8 ;
             }
          }
       }
    }
    public static List h(String p0,PageComponentResponse p1,Gson p2,boolean p3){
       ArrayList obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       if (p1 == null) {
          return obj;
       }else {
          p1 = p1.data;
          if (p1 == null) {
             c.b("PageDy getTreeNodeList error componentInfo is null");
             return obj;
          }else {
             return a.g(p0, p1, p2, p3);
          }
       }
    }
    public static a i(String p0,ComponentInfo p1,PageComponentDataInfo p2,JsonElement p3,Object p4,Gson p5,boolean p6){
       PageDyComponentInfo obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,Boolean.valueOf(p6)};
          obj = PatchProxy.apply(objArray, null, uoa, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PageDyComponentInfo();
       obj.cid = p2.cid;
       obj.instanceId = p2.instanceId;
       obj.name = p1.name;
       obj.bundleUrl = p1.bundleUrl;
       obj.renderType = p1.renderType;
       obj.commonData = p3;
       obj.downgradeName = p1.downgradeName;
       PageComponentDataInfo fields = p2.fields;
       if (fields != null) {
          obj.filedData = fields;
       }
       obj.style = p2.style;
       obj.trackInfo = p2.track;
       obj.engineConfig = p2.engineConfig;
       a uoa1 = a.b(p0, obj);
       if (uoa1 == null) {
          return null;
       }else {
          uoa1.isFromCache = p6;
          if (e.b("KEY_LIVE_CART_PERF_OPT", 1)) {
             c.c().submit(new c(uoa1, p5));
          }else {
             uoa1.parseModel(p5);
             uoa1.parseTKModelFiled(p5);
          }
          uoa1.setCommonObj(p4);
          return uoa1;
       }
    }
    public static a j(String p0,String p1,Map p2,Map p3,a p4,JsonElement p5,Object p6,Gson p7,boolean p8){
       String obj;
       String[] stringArray;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = oobject;
          objArray[2] = oobject1;
          objArray[3] = oobject2;
          objArray[4] = oobject3;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = Boolean.valueOf(p8);
          obj = PatchProxy.apply(objArray, null, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object obj1 = oobject2.get(oobject);
       if (obj1 == null) {
          stringArray = new String[]{"instanceId"};
          String[] stringArray1 = new String[]{oobject};
          c.d("组件data为空，请检查", a.a(stringArray, stringArray1));
          return null;
       }else {
          Object obj2 = oobject1.get(obj1.name);
          if (obj2 == null) {
             String[] stringArray2 = new String[]{"component"};
             stringArray = new String[]{obj1.name};
             c.d("未找到组件对应的component，请检查", a.a(stringArray2, stringArray));
             return null;
          }else {
             a uoa1 = a.i(p0, obj2, obj1, p5, p6, p7, p8);
             if (uoa1 == null) {
                return null;
             }else {
                obj = a.d(uoa1);
                String str = a.e(uoa1);
                if (obj != null && str != null) {
                   uoa1.relatedAction = obj;
                   obj1 = oobject2.get(str);
                   if (obj1 != null) {
                      obj2 = oobject1.get(obj1.name);
                      if (obj2 != null) {
                         uoa1.relatedComponent = a.i(p0, obj2, obj1, p5, p6, p7, p8);
                      }
                   }
                }
                return new a(uoa1, oobject3);
             }
          }
       }
    }
    public static List k(String p0,PageComponentInfo p1,Gson p2,DynamicPageCenter p3){
       PageComponentInfo component;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (p1 != null) {
             component = p1.component;
             if (component != null) {
                p1 = p1.data;
                if (p1 != null) {
                   Map map = a.c(component);
                   Iterator iterator = p1.entrySet().iterator();
                   ArrayList uArrayList = new ArrayList();
                   while (iterator.hasNext()) {
                      PageComponentDataInfo value = iterator.next().getValue();
                      uArrayList.add(a.a(p0, map.get(value.name), value, p2, p3));
                   }
                   return uArrayList;
                }
             }
          }
          c.b("parse response is null");
          return null;
       }catch(java.lang.Exception e7){
          c.b("component parse error"+e7.getMessage());
          return null;
       }
    }
    public static void l(String p0,List p1,Map p2,Map p3,Map p4,Map p5,JsonElement p6,Object p7,Gson p8,boolean p9){
       object oobject = p1;
       object oobject1 = p5;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = oobject;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = oobject1;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = Boolean.valueOf(p9);
          if (PatchProxy.applyVoid(objArray, null, uoa, "3")) {
             return;
          }
       }
       HashMap hashMap = new HashMap();
       Iterator iterator = p4.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          a value = uEntry.getValue();
          List list = oobject1.get(key);
          if (list != null) {
             Iterator iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                Object obj = iterator1.next();
                a uoa1 = a.j(p0, obj, p2, p3, value, p6, p7, p8, p9);
                if (uoa1 != null) {
                   hashMap.put(obj, uoa1);
                   oobject.add(uoa1);
                }else {
                   continue ;
                }
             }
          }
       }
       if (hashMap.isEmpty()) {
          return;
       }else {
          a.l(p0, p1, p2, p3, hashMap, p5, p6, p7, p8, p9);
          return;
       }
    }
}
