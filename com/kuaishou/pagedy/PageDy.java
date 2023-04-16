package com.kuaishou.pagedy.PageDy;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.Object;
import oo4.c;
import com.kuaishou.pagedy.PageDy$1;
import com.kuaishou.pagedy.PageDy$b;
import androidx.fragment.app.Fragment;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import nv.c;
import com.kuaishou.pagedy.manager.DynamicPageCenter;
import com.kuaishou.pagedy.util.PageDyUtil;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.pagedy.util.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentInfo;
import yz7.e;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.kuaishou.bowl.core.component.a;
import ho4.b;
import ho4.h;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.pagedy.container.widget.DynamicNestedRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.pagedy.PageDy$2;
import androidx.lifecycle.LifecycleObserver;
import android.app.Activity;
import qu4.f;
import android.content.Context;
import pu4.a;
import android.os.Handler;
import bo4.a;
import java.lang.Runnable;
import com.kuaishou.pagedy.d$a;
import com.kuaishou.pagedy.d;
import uu.c;
import java.util.HashMap;
import java.util.Map;
import com.kuaishou.pagedy.c;
import androidx.fragment.app.FragmentActivity;
import su.g;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.kuaishou.bowl.event.utils.StageName;
import qo4.a;
import com.kuaishou.pagedy.c$a;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.pagedy.manager.b;
import com.kuaishou.pagedy.manager.c;
import erd.g;
import crd.b;
import com.kuaishou.pagedy.PageDy$a;
import su.a;
import po4.f;
import uu.h;
import java.util.Collection;
import hu4.h;
import java.util.Set;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import pv.a;
import com.kuaishou.render.engine.tk.a;
import ju4.d;
import com.kuaishou.render.engine.communication.event.SPBEventCenter;
import com.kuaishou.render.engine.communication.event.SPBEventCenter$a;
import lu4.a;
import ju4.e;
import nu4.e;
import nu4.e$a;
import nu4.b;
import android.os.Bundle;
import k2b.e0;
import android.content.ComponentName;
import xu4.e;
import xu4.a;
import java.util.LinkedHashMap;
import java.util.Map$Entry;
import java.lang.ref.WeakReference;
import nu4.d;
import jo4.i;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import android.view.View;
import co4.d;

public class PageDy implements Application$ActivityLifecycleCallbacks	// class@000a41
{
    public boolean b;
    public Application c;
    public d d;
    public Map e;
    public Map f;
    public c g;

    public void PageDy(){
       super();
       this.g = new c();
    }
    public void PageDy(PageDy$1 p0){
       super();
       this.g = new c();
    }
    public static PageDy e(){
       return PageDy$b.a;
    }
    public void a(Fragment p0,String p1,int p2){
       List list;
       RecyclerView recyclerView1;
       if (PatchProxy.isSupport(PageDy.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, PageDy.class, "19")) {
          return;
       }
       if (p0 == null) {
          c.b("PageDy addFeed error fragment is null ");
          return;
       }else {
          DynamicPageCenter uDynamicPage = this.h(p0);
          if (uDynamicPage != null) {
             String str = PageDyUtil.a(p0);
             DynamicPageCenter obj = PatchProxy.applyThreeRefs(str, p1, uDynamicPage, uDynamicPage, DynamicPageCenter.class, "24");
             RecyclerView recyclerView = null;
             if (obj != PatchProxyResult.class) {
             }else {
                DynamicPageCenter e = uDynamicPage.e;
                list = PatchProxy.applyFourRefs(str, p1, e, uDynamicPage, null, a.class, "11");
                if (list != PatchProxyResult.class) {
                }else if(TextUtils.isEmpty(p1)){
                   c.b("parse data is null");
                }else {
                   list = a.k(str, e.a(p1, PageComponentInfo.class), e, uDynamicPage);
                }
             }
             if (obj == null || !obj.size()) {
                c.f("addFeed parse error");
             }else {
                int i = 0;
                a uoa = obj.get(i);
                obj = DynamicPageCenter.class;
                if (!PatchProxy.isSupport(obj) || !PatchProxy.applyVoidTwoRefs(uoa, Integer.valueOf(p2), uDynamicPage, obj, "26")) {
                   obj = uDynamicPage.m;
                   if (obj == null || uoa == null) {
                      c.g("addFeed curComponent or component is null");
                   }else {
                      a uoa1 = uDynamicPage.n(obj);
                      if (uoa1 instanceof b) {
                         list = uoa1.r();
                         if (list.size() > 0) {
                            uoa1 = uDynamicPage.j(list.get(i));
                            if (uoa1 instanceof h) {
                               Objects.requireNonNull(uoa1);
                               h oh = h.class;
                               if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidTwoRefs(uoa, Integer.valueOf(p2), uoa1, oh, "10")) {
                                  String str1 = "component";
                                  a.p(uoa, str1);
                                  DynamicComponentAdapter uDynamicComp = uoa1.n();
                                  a children = uoa1.children;
                                  a.o(children, "children");
                                  Iterator iterator = children.iterator();
                                  while (true) {
                                     if (iterator.hasNext()) {
                                        recyclerView1 = iterator.next();
                                        Object obj1 = recyclerView1;
                                        a.o(obj1, "it");
                                        if (!TextUtils.equals(obj1.getInstanceId(), uoa.getInstanceId())) {
                                           continue ;
                                        }
                                     }else {
                                        recyclerView1 = recyclerView;
                                     }
                                     if (recyclerView1 == null) {
                                        uoa1.children.add(p2, uoa);
                                        if (uDynamicComp != null) {
                                           uDynamicComp.T0(uoa);
                                        }
                                        if (uDynamicComp != null) {
                                           DynamicComponentAdapter uDynamicComp1 = DynamicComponentAdapter.class;
                                           if (!PatchProxy.isSupport(uDynamicComp1) || !PatchProxy.applyVoidTwoRefs(uoa, Integer.valueOf(p2), uDynamicComp, uDynamicComp1, "11")) {
                                              a.p(uoa, str1);
                                              uDynamicComp.f.add(p2, uoa);
                                              int i1 = (p2 > 0)? p2 - 1: 0;
                                              uDynamicComp.p0(i1, (uDynamicComp.f.size() - i1));
                                           }
                                        }
                                        if (!p2) {
                                           uoa = uoa1.rootView;
                                           if (uoa instanceof DynamicNestedRecyclerView) {
                                              recyclerView = uoa;
                                           }
                                           if (recyclerView != null) {
                                              recyclerView.scrollToPosition(i);
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
                }
             }
          }
       label_0185 :
          return;
       }
    }
    public final void b(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PageDy.class, "18")) {
          return;
       }
       p0.getLifecycle().addObserver(new PageDy$2(this, p0));
       return;
    }
    public final void c(Activity p0,Fragment p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PageDy.class, "5")) {
          return;
       }
       String str = PageDyUtil.a(p1);
       f.c.k(p0, str);
       if (a.b(p0)) {
          new Handler().postDelayed(new a(p0, str, p2, p1), 5000);
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, PageDy.class, "2")) {
          return;
       }
       if (this.b == null) {
          this.d = new d$a().a();
          c.a().k();
          this.e = new HashMap();
          this.f = new HashMap();
          this.b = true;
          c.a("checkInit init");
       }
       return;
    }
    public d f(){
       return this.d;
    }
    public String g(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PageDy.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0) && !TextUtils.isEmpty(p1)) {
          Map map = this.f.get(p0);
          if (map == null) {
             return null;
          }else if(map.get(p1) != null){
             return map.get(p1).c;
          }
       }
       return null;
    }
    public DynamicPageCenter h(Fragment p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DynamicPageCenter obj = PatchProxy.applyOneRefs(p0, this, PageDy.class, "17");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = null;
       if (p0 == null) {
          c.b("PageDy getPageDyCenter error fragment is null ");
          return obj;
       }else {
          FragmentActivity activity = p0.getActivity();
          if (activity == null) {
             c.b("PageDy getPageDyCenter error activity is null ");
             return obj;
          }else {
             Object obj1 = PatchProxy.applyTwoRefs(activity, p0, this, PageDy.class, "16");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             }else {
                String str = PageDyUtil.a(p0);
                Map map = this.f.get(PageDyUtil.c(activity));
                if (map != null) {
                   c uoc = map.get(str);
                   if (uoc != null) {
                      c b = uoc.b;
                   }
                }
             }
             return obj;
          }
       }
    }
    public final c i(Fragment p0,g p1){
       c obj = PatchProxy.applyTwoRefs(p0, p1, this, PageDy.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       FragmentActivity activity = p0.getActivity();
       if (activity == null) {
          return obj;
       }
       String str = PageDyUtil.c(activity);
       String str1 = PageDyUtil.a(p0);
       Map map = this.f.get(str);
       if (map == null) {
          HashMap hashMap = new HashMap();
          c uoc = this.l(activity, p0, p1);
          hashMap.put(str1, uoc);
          this.f.put(str, hashMap);
          return uoc;
       }else {
          obj = map.get(str1);
          if (obj == null) {
             obj = this.l(activity, p0, p1);
             map.put(str1, obj);
          }
          obj.a = p1;
          return obj;
       }
    }
    public String j(Fragment p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, PageDy.class, "33");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = null;
       if (p0 == null) {
          c.b("PageDy getStashPageData error fragment is null ");
          return obj;
       }else {
          DynamicPageCenter uDynamicPage = this.h(p0);
          if (uDynamicPage != null) {
             Object obj1 = PatchProxy.applyOneRefs(p1, uDynamicPage, DynamicPageCenter.class, "42");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             }else if(TextUtils.x(p1)){
                obj = e.f(uDynamicPage.v);
             }else if(uDynamicPage.v.containsKey(p1)){
                uDynamicPage = uDynamicPage.v.get(p1);
                obj = (uDynamicPage instanceof String)? uDynamicPage: e.f(uDynamicPage);
             }else {
                c.b("√ª”–’“µΩkey:"+p1);
             }
          }
          return obj;
       }
    }
    public a k(String p0,String p1,String p2,g p3,boolean p4){
       a obj;
       DynamicPageCenter r;
       PageComponentInfo pageComponen;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(PageDy.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, PageDy.class, "28");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       Map map = this.f.get(p0);
       obj = null;
       if (map != null) {
          c uoc = map.get(p1);
          if (uoc != null) {
             uoc = uoc.b;
             if (uoc != null) {
                if (PatchProxy.isSupport(DynamicPageCenter.class)) {
                   p1 = PatchProxy.applyThreeRefs(p2, p3, Boolean.valueOf(p4), uoc, DynamicPageCenter.class, "32");
                   if (p1 != patchProxyRe) {
                      obj = p1;
                   }
                }
                uoc.r(StageName.pgy_feed_request_start);
                if (p4) {
                   r = uoc.r;
                   if (r != null) {
                      pageComponen = r.remove(p2);
                   }
                }else {
                   r = uoc.q;
                   if (r != null) {
                      pageComponen = r.remove(p2);
                   }
                }
                if (pageComponen != null) {
                   uoc.r(StageName.pgy_feed_request_end);
                   a uoa = a.f(a.g(uoc.l, pageComponen, uoc.e, p4));
                   if (uoa != null) {
                      obj = uoc.q(uoa, p3);
                      if (obj != null) {
                         uoc.t = false;
                      }
                      if (obj != null) {
                         uoc.r(StageName.pgy_feed_parse_end);
                      }
                   }
                }
             }
          }
       }
    label_00a5 :
       return obj;
    }
    public final c l(Activity p0,Fragment p1,g p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PageDy.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c$a uoa = new c$a(p2, new DynamicPageCenter(p0, p1, p2.a));
       c uoc = PatchProxy.apply(null, uoa, c$a.class, "1");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c(uoa);
       }
       return uoc;
    }
    public void m(Fragment p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PageDy.class, "7")) {
          return;
       }
       if (p0 == null || p1 == null) {
          c.b("PageDy refreshPage error fragment or pageContext is null ");
          return;
       }else if(p0.getActivity() == null){
          c.b("PageDy refreshPage error activity is null ");
          return;
       }else {
          c uoc = this.i(p0, p1);
          if (uoc != null) {
             uoc = uoc.b;
             if (uoc != null && !PatchProxy.applyVoidOneRefs(p1, uoc, DynamicPageCenter.class, "5")) {
                if (TextUtils.x(p1.q)) {
                   c.b("refreshPage reqPath is null");
                }else if(p1.n == null){
                   p1.n = new HashMap();
                }
                PageDyUtil.d(p1.n);
                t ot = uoc.k(new HashMap(), p1);
                if (ot != null) {
                   ot.map(new e()).subscribe(new b(uoc, p1), new c(uoc));
                }
             }
          }
          return;
       }
    }
    public final void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PageDy.class, "25")) {
          return;
       }
       c.a().r(p0, "infinity_root_node", new PageDy$a(this), null);
       return;
    }
    public void o(Fragment p0){
       Map map;
       c uoc;
       String str3;
       e uoe;
       Set set;
       Iterator iterator;
       b uob;
       String obj1;
       boolean b;
       SPBEventCenter sPBEventCent;
       Set set1;
       Iterator iterator1;
       a uoa;
       String[] obj2;
       boolean b1;
       h oh;
       h oh1;
       Iterator iterator2;
       PresenterV2 presenterV2;
       String[] stringArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "20";
       if (PatchProxy.applyVoidOneRefs(p0, this, PageDy.class, str)) {
          return;
       }
       if (p0 == null) {
          return;
       }
       FragmentActivity activity = p0.getActivity();
       if (activity == null) {
          return;
       }
       String str1 = PageDyUtil.c(activity);
       String str2 = PageDyUtil.a(p0);
       a.a.remove(str2);
       String obj = null;
       if (!PatchProxy.applyVoidOneRefs(str2, obj, f.class, "3")) {
          try{
             f.a.remove(str2);
          }catch(java.lang.Exception e3){
             e3.printStackTrace();
          }
       }
    }
    public void onActivityCreated(Activity p0,Bundle p1){
    }
    public void onActivityDestroyed(Activity p0){
       Iterator iterator;
       Iterator iterator1;
       d uod;
       if (PatchProxy.applyVoidOneRefs(p0, this, PageDy.class, "24")) {
          return;
       }
       if (p0 instanceof FragmentActivity && (p0 instanceof e0 && p0.getComponentName() != null)) {
          String str = PageDyUtil.c(p0);
          if (this.e.containsKey(str) && !PatchProxy.applyVoidOneRefs(str, this, PageDy.class, "21")) {
             Map map = this.f.remove(str);
             if (map != null) {
                iterator = map.keySet().iterator();
                while (iterator.hasNext()) {
                   c uoc = map.get(iterator.next());
                   if (uoc != null) {
                      uoc.a();
                   }
                }
             }
             this.e.remove(str);
             CopyOnWriteArraySet obj = null;
             if (!PatchProxy.applyVoidOneRefs(str, obj, e.class, "8")) {
                e.a.get("memory").b(str);
                e.a.get("list_memory").b(str);
             }
             String str1 = "pageId";
             if (!PatchProxy.applyVoidOneRefs(str, obj, d.class, "19")) {
                a.p(str, str1);
                SPBEventCenter.g.a().e(str);
             }
             if (!PatchProxy.applyVoidOneRefs(str, obj, e.class, "22")) {
                a.p(str, str1);
                e uoe = e.g.a();
                Objects.requireNonNull(uoe);
                if (!PatchProxy.applyVoidOneRefs(str, uoe, e.class, "11")) {
                   a.p(str, str1);
                   Set set = uoe.b.get(str);
                   if (set != null) {
                      iterator1 = set.iterator();
                      while (iterator1.hasNext()) {
                         String str2 = iterator1.next();
                         if (uoe.a.containsKey(str2)) {
                            uoe.a.remove(str2);
                         }
                      }
                   }
                   LinkedHashMap linkedHashMa = new LinkedHashMap();
                   iterator1 = uoe.c.entrySet().iterator();
                   while (iterator1.hasNext()) {
                      Map$Entry uEntry = iterator1.next();
                      WeakReference value = uEntry.getValue();
                      if (value != null) {
                         uod = value.get();
                         if (uod != null) {
                            uod = uod.a;
                         label_0121 :
                            if (TextUtils.equals(uod, str)) {
                               linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
                            }
                         }
                      }
                      uod = obj;
                      goto label_0121 ;
                   }
                   iterator = linkedHashMa.entrySet().iterator();
                   while (iterator.hasNext()) {
                      uoe.c.remove(iterator.next().getKey());
                   }
                }
             }
             i oi = i.a();
             Objects.requireNonNull(oi);
             if (!PatchProxy.applyVoidOneRefs(str, oi, i.class, "6")) {
                a.p(str, "pageName");
                obj = oi.b.remove(str);
                if (obj != null) {
                   obj.clear();
                }
                str = oi.c.remove(str);
                if (str != null) {
                   d.l(str);
                }
             }
          }
       }
    label_0182 :
       return;
    }
    public void onActivityPaused(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PageDy.class, "23")) {
          return;
       }
       if (p0 instanceof FragmentActivity && (p0 instanceof e0 && p0.getComponentName() != null)) {
          Map map = this.f.get(PageDyUtil.c(p0));
          if (map != null) {
             Iterator iterator = map.keySet().iterator();
             while (iterator.hasNext()) {
                c uoc = map.get(iterator.next());
                if (uoc != null) {
                   uoc = uoc.b;
                   if (uoc != null) {
                      Objects.requireNonNull(uoc);
                      if (PatchProxy.applyVoid(null, uoc, DynamicPageCenter.class, "20")) {
                         continue ;
                      }else {
                         Map map1 = c.a().h(uoc.l);
                         if (map1 == null) {
                         }else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("functionName", "hide");
                            Iterator iterator1 = map1.entrySet().iterator();
                            while (iterator1.hasNext()) {
                               Map$Entry uEntry = iterator1.next();
                               if (uEntry.getValue() != null) {
                                  List list = c.a().j(uoc.l, uEntry.getValue());
                                  if (list != null) {
                                     Iterator iterator2 = list.iterator();
                                     while (iterator2.hasNext()) {
                                        uEntry.getValue().h(iterator2.next(), "callMethodWithData", e.f(hashMap));
                                     }
                                  }else {
                                     continue ;
                                  }
                               }else {
                                  continue ;
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PageDy.class, "22")) {
          return;
       }
       if (p0 instanceof FragmentActivity && (p0 instanceof e0 && p0.getComponentName() != null)) {
          Map map = this.f.get(PageDyUtil.c(p0));
          if (map != null) {
             Iterator iterator = map.keySet().iterator();
             while (iterator.hasNext()) {
                c uoc = map.get(iterator.next());
                if (uoc != null) {
                   uoc = uoc.b;
                   if (uoc != null) {
                      Objects.requireNonNull(uoc);
                      if (PatchProxy.applyVoid(null, uoc, DynamicPageCenter.class, "19")) {
                         continue ;
                      }else {
                         Map map1 = c.a().h(uoc.l);
                         if (map1 == null) {
                         }else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("functionName", "show");
                            Iterator iterator1 = map1.entrySet().iterator();
                            while (iterator1.hasNext()) {
                               Map$Entry uEntry = iterator1.next();
                               if (uEntry.getValue() != null) {
                                  List list = c.a().j(uoc.l, uEntry.getValue());
                                  if (list != null) {
                                     Iterator iterator2 = list.iterator();
                                     while (iterator2.hasNext()) {
                                        uEntry.getValue().h(iterator2.next(), "callMethodWithData", e.f(hashMap));
                                     }
                                  }else {
                                     continue ;
                                  }
                               }else {
                                  continue ;
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
    }
    public void onActivityStopped(Activity p0){
    }
    public void p(Fragment p0,g p1,d p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PageDy.class, "13")) {
          return;
       }
       if (p0 == null || p1 == null) {
          c.b("PageDy requestPageInfo error fragment or pageContext is null ");
          return;
       }else {
          this.d();
          DynamicPageCenter uDynamicPage = this.h(p0);
          if (uDynamicPage != null) {
             uDynamicPage.s(p1, p2);
          }
          return;
       }
    }
}
