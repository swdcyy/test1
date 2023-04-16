package com.oceanlong.home_perf.cache.MerchantHomeCacheManager;
import java.lang.Object;
import com.oceanlong.home_perf.cache.MerchantHomeCacheManager$mCacheHelper$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import com.oceanlong.home_perf.cache.MerchantHomeCacheManager$a;
import com.kuaishou.bowl.data.center.data.model.page.component.ComponentInfo;
import kotlin.jvm.internal.a;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo$Field;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.lang.String;
import com.google.gson.JsonArray;
import java.util.LinkedHashMap;
import java.lang.Iterable;
import java.util.Map;
import java.lang.Integer;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentResponse;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentInfo;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentHierarchyInfo;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.lang.System;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import com.oceanlong.home_perf.cache.MerchantHomeCacheManager$b;
import java.util.Comparator;
import java.util.Collections;
import java.lang.Math;

public final class MerchantHomeCacheManager	// class@000aa3
{
    public final String a;
    public final int b;
    public boolean c;
    public final p d;

    public void MerchantHomeCacheManager(){
       super();
       this.a = "merchantHomeAgileCacheConfig";
       this.b = 20;
       this.d = s.c(MerchantHomeCacheManager$mCacheHelper$2.INSTANCE);
    }
    public final List a(List p0){
       HashSet hashSet = new HashSet();
       ArrayList uArrayList = new ArrayList(p0);
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          MerchantHomeCacheManager$a uoa = iterator.next();
          ComponentInfo uComponentIn = uoa.b();
          ComponentInfo uComponentIn1 = null;
          uComponentIn = (uComponentIn != null)? uComponentIn.name: uComponentIn1;
          if (!a.g(uComponentIn, "commodity_card_tk")) {
             uComponentIn = uoa.b();
             if (uComponentIn != null) {
                uComponentIn1 = uComponentIn.name;
             }
             if (!a.g(uComponentIn1, "feed_activity_product_tk")) {
             }
          }
          PageComponentDataInfo pageComponen = uoa.c();
          if (pageComponen != null) {
             pageComponen = pageComponen.fields;
             if (pageComponen != null) {
                PageComponentDataInfo$Field data = pageComponen.data;
                if (data != null) {
                   String str = data.r().e0("relationItemInfoList").q().e0(0).r().e0("itemId").w();
                   if (hashSet.contains(str)) {
                      iterator.remove();
                   }else {
                      hashSet.add(str);
                   }
                }
             }
          }
       }
       return uArrayList;
    }
    public final List b(List p0,List p1){
       ComponentInfo uComponentIn;
       ComponentInfo uComponentIn1;
       int i1;
       int i2;
       ArrayList uArrayList = new ArrayList();
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          uComponentIn = iterator.next();
          if (linkedHashMa.containsKey(uComponentIn.name)) {
             uComponentIn1 = linkedHashMa.get(uComponentIn.name);
             if (uComponentIn1 != null) {
                uComponentIn1 = uComponentIn1.ver;
                if (uComponentIn1 != null) {
                   i1 = Integer.parseInt(uComponentIn1);
                label_0037 :
                   ComponentInfo ver = uComponentIn.ver;
                   if (ver != null) {
                      i = Integer.parseInt(ver);
                   }
                   if (i1 >= i) {
                   }
                }
             }
             i1 = 0;
             goto label_0037 ;
          }
          linkedHashMa.put(uComponentIn.name, uComponentIn);
       }
       iterator = p1.iterator();
       while (iterator.hasNext()) {
          ComponentInfo uComponentIn2 = iterator.next().b();
          if (uComponentIn2 != null) {
             if (linkedHashMa.containsKey(uComponentIn2.name)) {
                uComponentIn = linkedHashMa.get(uComponentIn2.name);
                if (uComponentIn != null) {
                   uComponentIn = uComponentIn.ver;
                   if (uComponentIn != null) {
                      i2 = Integer.parseInt(uComponentIn);
                   label_0079 :
                      uComponentIn1 = uComponentIn2.ver;
                      i1 = (uComponentIn1 != null)? Integer.parseInt(uComponentIn1): 0;
                      if (i2 >= i1) {
                      }
                   }
                }
                i2 = 0;
                goto label_0079 ;
             }
             linkedHashMa.put(uComponentIn2.name, uComponentIn2);
          }
       }
       iterator = linkedHashMa.values().iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next());
       }
       return uArrayList;
    }
    public final List c(PageComponentResponse p0,boolean p1){
       PageComponentHierarchyInfo root;
       JsonElement jsonElement;
       PageComponentDataInfo pageComponen1;
       ComponentInfo obj;
       boolean b1;
       ArrayList uArrayList = new ArrayList();
       if (p0 != null) {
          PageComponentResponse data = p0.data;
          if (data != null) {
             PageComponentInfo hierarchy = data.hierarchy;
             if (hierarchy != null) {
                root = hierarchy.root;
             label_0014 :
                if (root != null) {
                   PageComponentHierarchyInfo structure = p0.data.hierarchy.structure;
                   List list = (structure != null)? structure.get(root): null;
                   if (list != null) {
                      List list1 = ((list.isEmpty() ^ 1) && StringsKt__StringsKt.O2(list.get(0), "list_component", 0, 2, null))? 1: null;
                      list1 = (list1)? list: null;
                      if (list1 != null) {
                         structure = p0.data.hierarchy.structure;
                         list = (structure != null)? structure.get(list.get(0)): null;
                         if (list != null) {
                            Iterator iterator = list.iterator();
                            while (iterator.hasNext()) {
                               String str = iterator.next();
                               if (p1) {
                                  PageComponentResponse data1 = p0.data;
                                  if (data1 != null) {
                                     PageComponentInfo data2 = data1.data;
                                     if (data2 != null) {
                                        PageComponentDataInfo pageComponen = data2.get(str);
                                        if (pageComponen != null) {
                                           pageComponen = pageComponen.fields;
                                           if (pageComponen != null) {
                                              PageComponentDataInfo$Field data3 = pageComponen.data;
                                              if (data3 != null) {
                                                 jsonElement = data3.r().e0("liveStreamView");
                                              label_0096 :
                                                 if (jsonElement != null) {
                                                 }
                                              }
                                           }
                                        }
                                     }
                                  }
                                  jsonElement = null;
                                  goto label_0096 ;
                               }
                               MerchantHomeCacheManager$a uoa = new MerchantHomeCacheManager$a();
                               if (!p1) {
                                  uoa.c = System.currentTimeMillis();
                               }
                               PageComponentResponse data4 = p0.data;
                               if (data4 != null) {
                                  PageComponentInfo data5 = data4.data;
                                  if (data5 != null) {
                                     pageComponen1 = data5.get(str);
                                  label_00b6 :
                                     uoa.b = pageComponen1;
                                     PageComponentResponse data6 = p0.data;
                                     if (data6 != null) {
                                        PageComponentInfo component = data6.component;
                                        if (component != null) {
                                           Iterator iterator1 = component.iterator();
                                           while (true) {
                                              if (iterator1.hasNext()) {
                                                 obj = iterator1.next();
                                                 ComponentInfo name = obj.name;
                                                 PageComponentDataInfo pageComponen2 = uoa.c();
                                                 pageComponen2 = (pageComponen2 != null)? pageComponen2.name: null;
                                                 if (!a.g(name, pageComponen2)) {
                                                    continue ;
                                                 }
                                              }else {
                                                 obj = null;
                                              }
                                           label_00e9 :
                                              uoa.a = obj;
                                              if (obj != null) {
                                                 MerchantHomeCacheManager$a b = uoa.b;
                                                 if (b != null && uoa.c >= 0) {
                                                    obj = obj.name;
                                                    if (obj != null && a.g(obj, b.name)) {
                                                       b1 = true;
                                                    label_0108 :
                                                       if (b1) {
                                                          uArrayList.add(uoa);
                                                       }
                                                    }
                                                 }
                                              }
                                              b1 = false;
                                              goto label_0108 ;
                                           }
                                        }
                                     }
                                     obj = null;
                                     goto label_00e9 ;
                                  }
                               }
                               pageComponen1 = null;
                               goto label_00b6 ;
                            }
                         }
                      }
                   }
                   return uArrayList;
                }else {
                   return null;
                }
             }
          }
       }
       root = null;
       goto label_0014 ;
    }
    public final Map d(Map p0,List p1){
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Object obj = null;
       if (p0 == null) {
          return obj;
       }
       Iterator iterator = p0.values().iterator();
       while (iterator.hasNext()) {
          PageComponentDataInfo pageComponen = iterator.next();
          if (StringsKt__StringsKt.O2(pageComponen.name, "infinity_root_node", false, 2, obj) || StringsKt__StringsKt.O2(pageComponen.name, "list_component", false, 2, obj)) {
             linkedHashMa.put(pageComponen.instanceId, pageComponen);
          }
       }
       iterator = p1.iterator();
       while (iterator.hasNext()) {
          PageComponentDataInfo pageComponen1 = iterator.next().c();
          if (pageComponen1 != null) {
             linkedHashMa.put(pageComponen1.instanceId, pageComponen1);
          }
       }
       return linkedHashMa;
    }
    public final PageComponentHierarchyInfo e(PageComponentHierarchyInfo p0,List p1){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          PageComponentDataInfo pageComponen = iterator.next().c();
          if (pageComponen != null) {
             uArrayList.add(pageComponen.instanceId);
          }
       }
       PageComponentHierarchyInfo pageComponen1 = new PageComponentHierarchyInfo();
       pageComponen1.root = p0.root;
       pageComponen1.structure = p0.structure;
       PageComponentHierarchyInfo structure = p0.structure;
       int i = 0;
       List list = (structure != null)? structure.get(p0.root): i;
       if (list != null) {
          if (list.isEmpty() ^ 0x01) {
             i = list;
          }
          if (i != null) {
             structure = pageComponen1.structure;
             if (structure != null) {
                structure.put(list.get(0), uArrayList);
             }
          }
       }
    label_0059 :
       return pageComponen1;
    }
    public final String f(String p0){
       return "MerchantHomeCacheManager_"+QCurrentUser.ME.getId()+'_'+p0+"_v1";
    }
    public final boolean g(MerchantHomeCacheManager$a p0){
       boolean b;
       ComponentInfo uComponentIn = p0.b();
       ComponentInfo uComponentIn1 = null;
       uComponentIn = (uComponentIn != null)? uComponentIn.name: uComponentIn1;
       if (!a.g(uComponentIn, "commodity_card_tk")) {
          uComponentIn = p0.b();
          uComponentIn = (uComponentIn != null)? uComponentIn.name: uComponentIn1;
          if (!a.g(uComponentIn, "live_component")) {
             uComponentIn = p0.b();
             uComponentIn = (uComponentIn != null)? uComponentIn.name: uComponentIn1;
             if (!a.g(uComponentIn, "feed_activity_product_tk")) {
                ComponentInfo uComponentIn2 = p0.b();
                if (uComponentIn2 != null) {
                   uComponentIn1 = uComponentIn2.name;
                }
                if (!a.g(uComponentIn1, "brand_live_component")) {
                   b = false;
                label_004b :
                   return b;
                }
             }
          }
       }
    label_004a :
       b = true;
       goto label_004b ;
    }
    public final boolean h(PageComponentResponse p0){
       PageComponentInfo component;
       PageComponentHierarchyInfo pageComponen = null;
       if (p0 != null) {
          PageComponentResponse data = p0.data;
          if (data != null) {
             component = data.component;
          label_000b :
             if (component != null) {
                data = p0.data;
                if (data != null) {
                   component = data.component;
                   if (component != null && (component.isEmpty() ^ 1) == 1) {
                      data = p0.data;
                      PageComponentInfo data1 = (data != null)? data.data: pageComponen;
                      if (data1 != null && data != null) {
                         component = data.data;
                         if (component != null && (component.isEmpty() ^ 1) == 1) {
                            data = p0.data;
                            if (data != null) {
                               component = data.data;
                               if (component != null && component.containsKey("KUAISHOU_ERA_ROOT") == true) {
                                  data = p0.data;
                                  PageComponentInfo hierarchy = (data != null)? data.hierarchy: pageComponen;
                                  if (hierarchy != null) {
                                     if (data != null) {
                                        hierarchy = data.hierarchy;
                                        if (hierarchy != null) {
                                           pageComponen = hierarchy.root;
                                        }
                                     }
                                     if (pageComponen != null && data != null) {
                                        PageComponentInfo hierarchy1 = data.hierarchy;
                                        if (hierarchy1 != null) {
                                           pageComponen = hierarchy1.structure;
                                           if (pageComponen != null && (pageComponen.isEmpty() ^ 1) == 1) {
                                              p0 = p0.data;
                                              if (p0 != null) {
                                                 PageComponentInfo hierarchy2 = p0.hierarchy;
                                                 if (hierarchy2 != null) {
                                                    PageComponentHierarchyInfo structure = hierarchy2.structure;
                                                    if (structure != null && structure.containsKey("KUAISHOU_ERA_ROOT") == true) {
                                                       return 1;
                                                    }
                                                 }
                                              }
                                           }
                                        }
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                }
             }
          label_0081 :
             return false;
          }
       }
       component = pageComponen;
       goto label_000b ;
    }
    public final List i(List p0,List p1){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          MerchantHomeCacheManager$a uoa = iterator.next();
          if (!uArrayList.contains(uoa) && this.g(uoa)) {
             uArrayList.add(uoa);
          }
       }
       if (p1 != null) {
          iterator = p1.iterator();
          while (iterator.hasNext()) {
             MerchantHomeCacheManager$a uoa1 = iterator.next();
             if (!uArrayList.contains(uoa1) && this.g(uoa1)) {
                uArrayList.add(uoa1);
             }
          }
       }
       Collections.sort(uArrayList, new MerchantHomeCacheManager$b());
       return uArrayList.subList(0, Math.min(uArrayList.size(), this.b));
    }
}
