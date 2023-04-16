package com.kuaishou.pagedy.manager.b;
import erd.g;
import com.kuaishou.pagedy.manager.DynamicPageCenter;
import su.g;
import java.lang.Object;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import nv.c;
import com.kuaishou.pagedy.util.a;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentInfo;
import java.util.Map;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentGlobalInfo;
import com.google.gson.JsonElement;
import uu.c;
import yz7.e;
import com.google.gson.Gson;
import java.lang.Exception;
import java.util.HashMap;
import pv.a;
import java.util.Collection;
import java.util.Iterator;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo;
import com.kuaishou.bowl.data.center.data.model.page.component.ComponentInfo;
import com.kuaishou.bowl.core.component.a;
import po4.b;
import com.kuaishou.pagedy.b$a;
import com.kuaishou.pagedy.b;

public class b implements g	// class@000a91
{
    public final g b;
    public final DynamicPageCenter c;

    public void b(DynamicPageCenter p0,g p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       boolean b;
       b c;
       ArrayList uArrayList;
       Iterator iterator;
       a uoa;
       a uoa1;
       String str;
       Iterator iterator1;
       a uoa2;
       PageComponentInfo data;
       Iterator iterator2;
       Object obj4;
       String[] obj5;
       Object obj6;
       a uoa3;
       String[] stringArray2;
       Object obj = this;
       PageComponentResponse obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, b.class, "1")) {
       }else {
          b = true;
          if (obj1 != null && obj1.result == b) {
             c = obj.c;
             Objects.requireNonNull(c);
             if (!PatchProxy.applyVoidOneRefs(obj1, c, DynamicPageCenter.class, "34")) {
                obj1 = obj1.data;
                if (obj1 == null) {
                   c.b("dealUpdateResponse error data is null");
                }else {
                   DynamicPageCenter l = c.l;
                   DynamicPageCenter e = c.e;
                   String obj2 = PatchProxy.applyThreeRefs(l, obj1, e, null, a.class, "9");
                   if (obj2 != PatchProxyResult.class) {
                      uArrayList = obj2;
                   }else {
                      uArrayList = new ArrayList();
                      PageComponentInfo component = obj1.component;
                      data = obj1.data;
                      PageComponentInfo global = obj1.global;
                      if (component == null || data == null) {
                         c.b("PageDy getTreeNodeList error : components||global||hierarchy||data is null");
                      }else {
                         Map map = a.c(component);
                         Collection uCollection = null;
                         PageComponentGlobalInfo commonData = (global != null)? global.commonData: uCollection;
                         if (commonData == null) {
                            commonData = a.a.get(l);
                         }
                         PageComponentGlobalInfo pageComponen = commonData;
                         Class uClass = c.a().c(l);
                         if (pageComponen != null && uClass != null) {
                            try{
                               Collection obj3 = (e == null)? e.a(pageComponen.toString(), uClass): e.h(pageComponen.toString(), uClass);
                               uCollection = obj3;
                            }catch(java.lang.Exception e0){
                               String[] stringArray = new String[]{"msg"};
                               String[] stringArray1 = new String[b];
                               stringArray1[0] = e0.getMessage();
                               c.d("parse CommonData error", a.a(stringArray, stringArray1));
                            }
                         }
                      }
                   }
                }
             }
          }else {
             String[] stringArray3 = new String[]{"reqPath"};
             String[] stringArray4 = new String[b];
             stringArray4[0] = obj.b.q;
             c.d("req refresh error", a.a(stringArray3, stringArray4));
          }
       }
    }
}
