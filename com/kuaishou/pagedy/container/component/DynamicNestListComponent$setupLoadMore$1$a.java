package com.kuaishou.pagedy.container.component.DynamicNestListComponent$setupLoadMore$1$a;
import co4.d;
import com.kuaishou.pagedy.container.component.DynamicNestListComponent$setupLoadMore$1;
import java.lang.Object;
import com.google.gson.JsonElement;
import co4.c;
import com.kuaishou.bowl.core.component.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import iv.a;
import java.util.List;
import com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo$Field;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo$DataApi;
import kotlin.jvm.internal.Ref$ObjectRef;
import zk.f;
import com.kuaishou.pagedy.PageDy;
import nv.d;
import nv.c;
import java.util.Map;
import go4.b;
import java.util.HashMap;
import ho4.h;
import java.util.ArrayList;
import go4.a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.util.Collection;
import com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentResponse;
import com.kuaishou.bowl.data.center.data.model.page.component.Track;
import java.lang.Throwable;
import java.lang.Integer;
import com.yxcorp.utility.SystemUtil;
import qrd.i;
import pv.a;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentGlobalInfo;

public final class DynamicNestListComponent$setupLoadMore$1$a implements d	// class@000a53
{
    public final DynamicNestListComponent$setupLoadMore$1 b;

    public void DynamicNestListComponent$setupLoadMore$1$a(DynamicNestListComponent$setupLoadMore$1 p0){
       this.b = p0;
       super();
    }
    public void A(JsonElement p0,JsonElement p1){
       c.c(this, p0, p1);
    }
    public void L7(a p0,boolean p1,boolean p2){
       PageComponentDataInfo$DataApi params;
       Map map;
       Iterator iterator;
       if (PatchProxy.isSupport(DynamicNestListComponent$setupLoadMore$1$a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, DynamicNestListComponent$setupLoadMore$1$a.class, "1")) {
          return;
       }
       if (p0 != null) {
          DynamicNestListComponent$setupLoadMore$1 $callerConte = this.b.$callerContext;
          if ($callerConte != null) {
             p0.setCallerContexts($callerConte);
          }
          p0 = p0.children.get(0);
          String str = null;
          if (!p0 instanceof a) {
             p0 = str;
          }
          if (p0 != null) {
             a componentDat = p0.componentData;
             if (componentDat != null) {
                PageDyComponentInfo filedData = componentDat.filedData;
                if (filedData != null) {
                   PageComponentDataInfo$Field dataApi = filedData.dataApi;
                   if (dataApi != null) {
                      params = dataApi.params;
                   label_0049 :
                      if (this.b.$channelParams.element instanceof f) {
                         c.b(d.a(PageDy.e().g(p0.activityHashCode, p0.pageHashCode), "nestList params is null"));
                         params = str;
                      }
                      DynamicNestListComponent$setupLoadMore$1 this$0 = this.b.this$0;
                      if (params != null) {
                         map = b.a(params);
                         if (map != null) {
                         label_007d :
                            this$0.g = map;
                            $callerConte = this.b.this$0;
                            Map map1 = $callerConte.o();
                            DynamicNestListComponent$setupLoadMore$1 $callerConte1 = this.b.$callerContext;
                            String str1 = ($callerConte1 != null)? $callerConte1.b("localApiParam"): str;
                            $callerConte.l(map1, str1);
                            this.b.this$0.m(p0);
                            ArrayList uArrayList = a.h(p0);
                            $callerConte = this.b.this$0;
                            Objects.requireNonNull($callerConte);
                            if (!PatchProxy.applyVoidOneRefs(uArrayList, $callerConte, h.class, "13")) {
                               a.p(uArrayList, "children");
                               $callerConte.children.addAll(uArrayList);
                            }
                            map = this.b.this$0.o();
                            if (map != null) {
                               str = map.get("pcursor");
                            }
                            int i = 2;
                            if (a.g(str, "no_more")) {
                               this.b.$dynamicComponentAdapter.U0();
                               if (uArrayList.size() > 0) {
                                  iterator = uArrayList.iterator();
                                  while (iterator.hasNext()) {
                                     this.b.$dynamicComponentAdapter.T0(iterator.next());
                                  }
                                  this.b.$dynamicComponentAdapter.J0(uArrayList);
                               }
                               this.b.$dynamicComponentAdapter.d1();
                               $callerConte = this.b.$dynamicComponentAdapter;
                               if (uArrayList.size() > 0) {
                                  i = 1;
                               }
                               $callerConte.S0(i);
                            }else {
                               this.b.$dynamicComponentAdapter.U0();
                               this.b.$dynamicComponentAdapter.W0(true);
                               if (uArrayList.size() > 0) {
                                  iterator = uArrayList.iterator();
                                  while (iterator.hasNext()) {
                                     this.b.$dynamicComponentAdapter.T0(iterator.next());
                                  }
                                  this.b.$dynamicComponentAdapter.J0(uArrayList);
                               }
                               $callerConte = this.b.$dynamicComponentAdapter;
                               if (uArrayList.size() > 0) {
                                  i = 1;
                               }
                               $callerConte.S0(i);
                            }
                         }
                      }
                      map = new HashMap();
                      goto label_007d ;
                   }
                }
             }
             params = str;
             goto label_0049 ;
          }
       }
       return;
    }
    public void V6(PageComponentResponse p0){
       c.f(this, p0);
    }
    public void d0(JsonElement p0,JsonElement p1,JsonElement p2,JsonElement p3,Track p4){
       c.d(this, p0, p1, p2, p3, p4);
    }
    public void onRefresh(){
       c.g(this);
    }
    public void p6(a p0,int p1,Throwable p2){
       String[] stringArray;
       String[] stringArray1;
       if (PatchProxy.isSupport(DynamicNestListComponent$setupLoadMore$1$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, DynamicNestListComponent$setupLoadMore$1$a.class, "2")) {
          return;
       }
       a.p(p2, "throwable");
       this.b.$dynamicComponentAdapter.U0();
       this.b.$dynamicComponentAdapter.S0(3);
       int i = 1;
       if (SystemUtil.I()) {
          stringArray = new String[]{"msg"};
          stringArray1 = new String[i];
          stringArray1[0] = i.i(p2);
          c.d("DynamicNestListComponent: setupLoadMore exception:", a.a(stringArray, stringArray1));
       }else {
          stringArray = new String[]{"msg"};
          stringArray1 = new String[i];
          stringArray1[0] = p2.getMessage();
          c.d("DynamicNestListComponent: setupLoadMore exception:", a.a(stringArray, stringArray1));
       }
       return;
    }
    public void r2(PageComponentGlobalInfo p0){
       c.e(this, p0);
    }
}
