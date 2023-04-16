package com.kuaishou.bowl.core.trigger.d;
import cv.n;
import cv.h;
import java.lang.String;
import mu4.d;
import ju4.d;
import java.util.Map;
import java.util.List;
import cv.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import su.o;
import com.kuaishou.bowl.data.center.data.model.PageData;
import gv.h;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.bowl.data.center.data.model.ResourceItem;
import com.kuaishou.bowl.data.center.data.model.BaseInfo;
import java.lang.Boolean;
import com.kuaishou.bowl.data.center.data.model.MaterialDataItem;
import pv.b;
import java.lang.StringBuilder;
import java.lang.System;
import android.util.Pair;
import com.kuaishou.bowl.data.center.data.model.TriggerTiming;
import java.lang.Exception;
import nv.c;
import su.d;
import su.c;
import cv.m;
import com.kuaishou.bowl.data.center.data.model.RenderInfo;
import fv.i;
import java.lang.Long;
import com.kuaishou.bowl.event.utils.StageName;
import fv.c;
import cv.i;

public class d extends n	// class@0011b5
{

    public void d(){
       super();
       d.a("MERCHANT_LIST_SCROLL_EVENT", new h(this));
    }
    public String d(){
       return "slidingPage";
    }
    public void e(String p0,Map p1,List p2,c p3,String p4){
    }
    public final void f(String p0,int p1,List p2,c p3){
       boolean b;
       Object this;
       Pair pair;
       MaterialDataItem renderInfo;
       Object obj = this;
       String str = p0;
       Object obj1 = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, d.class, "4")) {
          return;
       }
       PageData pageData = o.c().c.c(str);
       if (pageData != null) {
          pageData = pageData.resourceDatas;
          if (pageData != null) {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = pageData.entrySet().iterator();
             while (iterator.hasNext()) {
                Object obj2 = iterator.next();
                if (obj2 != null && (!TextUtils.isEmpty(obj2.getKey()) && (obj2.getValue() != null && (obj2.getValue().materialDatas != null && obj2.getValue().baseInfo != null)))) {
                   BaseInfo resourceType = obj2.getValue().baseInfo.resourceType;
                   if (PatchProxy.isSupport(uod)) {
                      String obj3 = PatchProxy.applyTwoRefs(obj1, Integer.valueOf(resourceType), obj, uod, "6");
                      if (obj3 != patchProxyRe) {
                         b = obj3.booleanValue();
                      label_00a7 :
                         if (!b) {
                         }else {
                            Iterator iterator1 = obj2.getValue().materialDatas.iterator();
                            while (iterator1.hasNext()) {
                               this = iterator1.next();
                               if (this != null) {
                                  if (this.triggerTimings == null) {
                                  }else {
                                     String str1 = "";
                                     String str2 = b.a().b(this.materialId+str1, this.resourceId);
                                     long l = System.currentTimeMillis();
                                     obj3 = "slidingPage";
                                     if (PatchProxy.isSupport(uod)) {
                                        pair = PatchProxy.applyTwoRefs(this, Integer.valueOf(p1), obj, uod, "5");
                                        if (pair != patchProxyRe) {
                                        }else {
                                        label_0102 :
                                           renderInfo = this.triggerTimings;
                                           if (renderInfo != null) {
                                              Iterator iterator2 = renderInfo.iterator();
                                              while (true) {
                                                 if (iterator2.hasNext()) {
                                                    try{
                                                       TriggerTiming triggerTimin = iterator2.next();
                                                       if (triggerTimin != null && obj3.equals(triggerTimin.triggerType)) {
                                                          TriggerTiming triggerParam = triggerTimin.triggerParam;
                                                          if (triggerParam != null) {
                                                             String str5 = triggerParam.get("slidingPageCounts");
                                                             if (!TextUtils.isEmpty(str5)) {
                                                                String[] stringArray = str5.split(",");
                                                                if (stringArray.length > 0 && p1 >= Integer.parseInt(stringArray[0])) {
                                                                   pair = new Pair(Boolean.TRUE, triggerTimin);
                                                                }else {
                                                                   continue ;
                                                                }
                                                             }else {
                                                                continue ;
                                                             }
                                                          }else {
                                                             continue ;
                                                          }
                                                       }else {
                                                          continue ;
                                                       }
                                                    }catch(java.lang.Exception e0){
                                                       c.g(e0.getMessage());
                                                       goto label_010b ;
                                                    }
                                                 }
                                              }
                                           }
                                           pair = null;
                                        }
                                     }else {
                                        goto label_0102 ;
                                     }
                                     if (pair != null && pair.first.booleanValue()) {
                                        if (!PatchProxy.applyVoid(null, obj, uod, "3") && o.c().d().b() != null) {
                                           o.c().d().b().a();
                                        }
                                        m om = new m();
                                        String str3 = (obj2.getValue().baseInfo == null)? str1: obj2.getValue().baseInfo.resourceCode;
                                        om.a = str3;
                                        int i = (obj2.getValue().baseInfo == null)? 0: obj2.getValue().baseInfo.resourceType;
                                        om.b = i;
                                        om.c = this;
                                        om.i = this.pendantCode;
                                        om.e = true;
                                        om.h = obj3;
                                        om.j = pair.second;
                                        om.l = str;
                                        om.m = this.materialId+str1;
                                        renderInfo = this.renderInfo;
                                        if (renderInfo != null && !TextUtils.isEmpty(renderInfo.renderType)) {
                                           om.n = this.renderInfo.renderType;
                                        }
                                        uArrayList.add(om);
                                        String str4 = "Link";
                                        i oi = i.class;
                                        if (PatchProxy.isSupport(oi)) {
                                           Object[] objArray = new Object[]{str4,str,"slidingPage",this,str2,Long.valueOf(l)};
                                           if (!PatchProxy.applyVoid(objArray, null, oi, "4")) {
                                           }
                                        }else {
                                        }
                                     }
                                  label_0249 :
                                     d uod1 = uod;
                                     PatchProxyResult patchProxyRe1 = patchProxyRe;
                                  label_024d :
                                     str = p0;
                                     uod = uod1;
                                     patchProxyRe = patchProxyRe1;
                                  }
                               }else {
                                  str = p0;
                                  int i1 = p2;
                                  continue ;
                               }
                            }
                         }
                      }
                   }
                   b = obj1.contains(Integer.valueOf(resourceType));
                   goto label_00a7 ;
                }
             label_025d :
                str = p0;
                obj1 = p2;
                uod = uod;
                patchProxyRe = patchProxyRe;
             }
             p3.b(uArrayList);
          }
       }
       return;
    }
}
