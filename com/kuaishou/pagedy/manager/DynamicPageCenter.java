package com.kuaishou.pagedy.manager.DynamicPageCenter;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import pv.b;
import com.kuaishou.bowl.event.utils.StageName;
import java.lang.ref.WeakReference;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.pagedy.util.PageDyUtil;
import po4.e;
import uu.c;
import com.kuaishou.bowl.core.component.a;
import so4.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import java.util.List;
import su.g;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Throwable;
import qu4.f;
import tu.a;
import java.lang.Runnable;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Future;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;
import po4.c;
import po4.d;
import java.util.concurrent.Executor;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentResponse;
import co4.d;
import uu.h;
import nv.c;
import pv.a;
import to4.g;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentInfo;
import java.util.Objects;
import com.google.gson.Gson;
import qo4.a;
import java.lang.RuntimeException;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentGlobalInfo;
import com.google.gson.JsonElement;
import com.kuaishou.bowl.data.center.data.model.page.component.Track;
import to4.e;
import android.content.Context;
import pu4.a;
import java.util.Collection;
import hu4.h;
import com.kuaishou.render.engine.tk.a;
import iv.a;
import android.view.View;
import com.kuaishou.pagedy.container.component.RootContainerComponent;
import ho4.h;
import brd.t;
import no4.a;
import bv.a;
import no4.a$a;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import jv.b;
import okhttp3.RequestBody;
import fv.f;
import su.g$a;
import java.lang.reflect.Field;
import su.f;
import ukd.a;
import java.lang.StringBuilder;
import java.lang.Exception;
import android.view.ViewGroup;
import iv.b;
import erd.o;
import brd.x;
import iv.c;
import androidx.recyclerview.widget.RecyclerView$r;
import tu.i;
import tu.f;
import tu.b;
import com.kuaishou.pagedy.container.widget.DynamicRootListContainer;
import ho4.b;
import com.kuaishou.pagedy.util.a;
import com.kuaishou.pagedy.PageDy;
import java.lang.System;
import oo4.c;
import fv.c;
import mrd.c;
import nv.d;
import hu4.n;
import hu4.f;
import mv.d;
import java.lang.Long;
import java.lang.Enum;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import crd.b;
import to4.h;
import com.kuaishou.pagedy.request.d;
import com.kuaishou.pagedy.request.PreReqInfo;
import com.kuaishou.pagedy.request.PreReqInfo$ReqStatus;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.pagedy.manager.DynamicPageCenter$3;
import com.kuaishou.pagedy.manager.DynamicPageCenter$4;
import com.kuaishou.pagedy.manager.DynamicPageCenter$a;
import com.kuaishou.pagedy.request.a;
import com.kuaishou.pagedy.request.PreReqManager$1;
import tu.d;
import qkd.c;
import yz7.e;

public class DynamicPageCenter	// class@000a8b
{
    public e A;
    public b a;
    public b b;
    public d c;
    public b d;
    public Gson e;
    public ViewGroup f;
    public Map g;
    public boolean h;
    public WeakReference i;
    public WeakReference j;
    public String k;
    public String l;
    public a m;
    public a n;
    public String o;
    public String p;
    public Map q;
    public Map r;
    public Map s;
    public boolean t;
    public c u;
    public Map v;
    public CyclicBarrier w;
    public Executor x;
    public boolean y;
    public Map z;

    public void DynamicPageCenter(Activity p0,Fragment p1,String p2){
       super();
       this.k = "";
       this.l = "";
       this.s = new HashMap();
       this.t = true;
       this.v = new HashMap();
       this.y = true;
       this.z = new HashMap();
       if (p0 != null && p1 != null) {
          this.p = p2;
          this.o = b.a().b(this.p, "PageDy");
          this.r(StageName.pgy_init_start);
          this.i = new WeakReference(p0);
          this.j = new WeakReference(p1);
          this.k = PageDyUtil.c(p0);
          this.l = PageDyUtil.a(p1);
          this.A = new e(this, p1);
          c.a().o(this.l, this.i);
          c.a().q(this.l, this.j);
          this.r(StageName.pgy_init_end);
       }
       return;
    }
    public static a f(a p0){
       a uoa = null;
       HashMap obj = PatchProxy.applyOneRefs(p0, uoa, DynamicPageCenter.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof a) {
          uoa = p0;
       }
       if (p0 != null) {
          obj = new HashMap();
          obj.put("disable_pre_resolve", Boolean.TRUE);
          List realChildren = p0.getRealChildren(obj);
          if (realChildren != null) {
             int i = 0;
             while (i < realChildren.size()) {
                a uoa1 = DynamicPageCenter.f(realChildren.get(i));
                if (uoa1 != null) {
                   return uoa1;
                }
                i = i + 1;
             }
          }
       }
       return uoa;
    }
    public final void a(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicPageCenter.class, "8")) {
          return;
       }
       if (p0.n == null) {
          p0.n = new HashMap();
       }
       DynamicPageCenter tg = this.g;
       if (tg != null) {
          Iterator iterator = tg.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (!p0.n.containsKey(uEntry.getKey())) {
                p0.n.put(uEntry.getKey(), uEntry.getValue());
             }
          }
       }
       PageDyUtil.d(p0.n);
       return;
    }
    public void b(String p0,String p1,Throwable p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, null, this, DynamicPageCenter.class, "46")) {
          return;
       }
       f.c.b(this.l, p0, p1, p2, null);
       return;
    }
    public void c(String p0,String p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DynamicPageCenter.class, "45")) {
          return;
       }
       f.c.c(this.l, p0, p1, p2);
       return;
    }
    public final void d(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicPageCenter.class, "44")) {
          return;
       }
       g m = p0.M;
       if (m == null) {
          return;
       }
       List list = m.t2();
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             c.c().submit(iterator.next());
          }
       }
       List list1 = p0.M.T5();
       if (list1 != null && list1.size()) {
          this.w = new CyclicBarrier(2);
          if (this.x == null) {
             this.x = Executors.newSingleThreadExecutor();
          }
          list1.add(new c(this));
          for (int i = 0; i < list1.size(); i = i + 1) {
             this.x.execute(new d(list1.get(i)));
          }
       }
       return;
    }
    public void e(g p0,PageComponentResponse p1,d p2){
       DynamicPageCenter l;
       DynamicPageCenter w;
       String str3;
       DynamicPageCenter c;
       DynamicPageCenter uDynamicPage = this;
       g og = p0;
       PageComponentResponse pageComponen = p1;
       d uod = p2;
       h oh = h.class;
       c uoc = c.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DynamicPageCenter.class, "12")) {
          return;
       }
       String str = (og.t != null)? "COMPONENT_MAIN_RENDER_STEP_1": "COMPONENT_OTHER_RENDER_STEP_1";
       Map map = null;
       uDynamicPage.c(str, "开始渲染", map);
       if (uDynamicPage.h != null) {
          c.f("request is canceled return");
          return;
       }else {
          PageComponentResponse isFromCache = pageComponen.isFromCache;
          boolean b = false;
          if (isFromCache == null && og.t == null) {
             uDynamicPage.t = b;
          }
          String[] stringArray = new String[]{"isCache"};
          int i = 1;
          String[] stringArray1 = new String[i];
          stringArray1[b] = String.valueOf(isFromCache);
          g.d("merchant_pgy_*_parse_start", og, a.a(stringArray, stringArray1));
          if (og.t != null) {
             isFromCache = pageComponen.data;
             if (isFromCache != null && isFromCache.subPage != null) {
                if (pageComponen.isFromCache != null) {
                   if (uDynamicPage.r == null) {
                      uDynamicPage.r = new HashMap();
                   }
                   uDynamicPage.r.clear();
                   uDynamicPage.r.putAll(pageComponen.data.subPage);
                }else if(uDynamicPage.q == null){
                   uDynamicPage.q = new HashMap();
                }
                uDynamicPage.q.clear();
                uDynamicPage.q.putAll(pageComponen.data.subPage);
             }
          }
          if (og.t != null) {
             c uoc1 = c.a();
             l = uDynamicPage.l;
             Objects.requireNonNull(uoc1);
             if (!PatchProxy.applyVoidOneRefs(l, uoc1, uoc, "37")) {
                h oh4 = uoc1.a.get(l);
                if (oh4 != null && !PatchProxy.applyVoid(map, oh4, oh, "24")) {
                   c.f("resetReportModuleTrack");
                   Iterator iterator1 = oh4.h.keySet().iterator();
                   while (iterator1.hasNext()) {
                      oh4.h.put(iterator1.next(), Boolean.FALSE);
                   }
                }
             }
             uDynamicPage.r(StageName.pgy_page_request_end);
             if (og.s == null) {
                w = uDynamicPage.w;
                if (w != null) {
                   try{
                      w.await();
                   }catch(java.lang.Exception e0){
                      c.b("taskCyclicBarrier main error");
                   }
                   uDynamicPage.w = map;
                }
             }
          }else {
             uDynamicPage.r(StageName.pgy_feed_request_end);
          }
          a uoa = uDynamicPage.o(pageComponen, uDynamicPage.e, e0.t, pageComponen.isFromCache);
          String[] stringArray2 = new String[]{"isCache"};
          stringArray = new String[i];
          stringArray[b] = String.valueOf(pageComponen.isFromCache);
          g.d("merchant_pgy_*_parse_end", e0, a.a(stringArray2, stringArray));
          str = "COMPONENT_MAIN_RENDER_STEP_2";
          String str1 = "COMPONENT_OTHER_RENDER_STEP_2";
          if (uoa == null) {
             uDynamicPage.u(uod, e0, new Throwable("getTreeNode error"));
             if (e0.t == null) {
                str = str1;
             }
             uDynamicPage.b(str, "解析TreeNode失败", new RuntimeException("解析TreeNode失败"), map);
             return;
          }else if(e0.t != null){
             str = str1;
          }
          String str2 = "创建成功";
          uDynamicPage.c(str, str2, map);
          isFromCache = pageComponen.data;
          if (isFromCache != null) {
             PageComponentInfo global = isFromCache.global;
             if (global != null && uod != null) {
                uod.A(global.bizData, global.commonData);
                global = pageComponen.data.global;
                str3 = str2;
                p2.d0(global.bizData, global.commonData, global.style, global.config, global.track);
                uod.r2(pageComponen.data.global);
                w = uDynamicPage.c;
                if (uod != w && w != null) {
                   PageComponentInfo global1 = pageComponen.data.global;
                   w.A(global1.bizData, global1.commonData);
                   global1 = pageComponen.data.global;
                   uDynamicPage.c.d0(global1.bizData, global1.commonData, global1.style, global1.config, global1.track);
                   uDynamicPage.c.r2(pageComponen.data.global);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("global", pageComponen.data.global);
                str1 = (e0.t != null)? "COMPONENT_MAIN_RENDER_STEP_3": "COMPONENT_OTHER_RENDER_STEP_3";
                uDynamicPage.c(str1, "解析成功", hashMap);
             label_01e4 :
                str1 = "绑定成功";
                String str4 = "COMPONENT_MAIN_RENDER_STEP_5";
                String str5 = "merchant_pgy_*_render_start";
                str2 = "COMPONENT_MAIN_RENDER_STEP_4";
                String str6 = "merchant_pgy_*_tree_end";
                String str7 = "merchant_pgy_*_tree_start";
                if (e0.s != null && e0.t != null) {
                   stringArray2 = new String[]{"isCache"};
                   c uoc2 = uoc;
                   String[] stringArray3 = new String[i];
                   h oh1 = oh;
                   int i1 = 0;
                   stringArray3[i1] = String.valueOf(pageComponen.isFromCache);
                   g.d(str7, e0, a.a(stringArray2, stringArray3));
                   a uoa1 = uDynamicPage.q(uoa, e0);
                   String[] stringArray4 = new String[]{"isCache"};
                   i = 1;
                   String[] stringArray5 = new String[i];
                   stringArray5[i1] = String.valueOf(pageComponen.isFromCache);
                   g.d(str6, e0, a.a(stringArray4, stringArray5));
                   a uoa2 = null;
                   if (e0.t != null) {
                      uod.L7(uoa2, i1, i);
                   }
                   uDynamicPage.c(str2, str3, uoa2);
                   if (uDynamicPage.m != null) {
                      FragmentActivity uFragmentAct = this.g();
                      DynamicPageCenter m = uDynamicPage.m;
                      String str8 = str1;
                      DynamicPageCenter uDynamicPage1 = uDynamicPage.l;
                      DynamicPageCenter uDynamicPage2 = m;
                      DynamicPageCenter uDynamicPage3 = uDynamicPage1;
                      l = m;
                      String str9 = str4;
                      c uoc3 = uoc2;
                      DynamicPageCenter uDynamicPage4 = uDynamicPage1;
                      h oh2 = oh1;
                      if (!PatchProxy.applyVoidFourRefs(uFragmentAct, p0, uDynamicPage2, uDynamicPage3, 0, e.class, "2") && (e0.v != null && (a.a(uFragmentAct) && l != null))) {
                         a children = l.children;
                         if (children != null) {
                            children.clear();
                            c uoc4 = c.a();
                            Objects.requireNonNull(uoc4);
                            DynamicPageCenter uDynamicPage5 = uDynamicPage4;
                            if (!PatchProxy.applyVoidOneRefs(uDynamicPage5, uoc4, uoc3, "41")) {
                               h oh3 = uoc4.a.get(uDynamicPage5);
                               if (oh3 != null && !PatchProxy.applyVoid(null, oh3, oh2, "28")) {
                                  Iterator iterator = oh3.c.values().iterator();
                                  while (iterator.hasNext()) {
                                     iterator.next().i();
                                  }
                                  oh3.c.clear();
                                  oh3.d.clear();
                                  oh3.e.clear();
                               }
                               a.b().a(uDynamicPage5);
                            }
                         }
                      }
                      uoa1.setCallerContexts(uDynamicPage.m.callerContext);
                      stringArray = new String[]{"isCache"};
                      String[] stringArray6 = new String[]{String.valueOf(pageComponen.isFromCache)};
                      g.d(str5, e0, a.a(stringArray, stringArray6));
                      uDynamicPage.m.update(uoa1);
                      l = uDynamicPage.m;
                      l.bindData(uoa1, l.rootView, 0);
                      stringArray2 = new String[]{"isCache"};
                      stringArray = new String[]{String.valueOf(pageComponen.isFromCache)};
                      g.d("merchant_pgy_*_bind_data_end", e0, a.a(stringArray2, stringArray));
                      uDynamicPage.c(str9, str8, null);
                   }
                   p2.onRefresh();
                   c = uDynamicPage.c;
                   if (p2 != c && c != null) {
                      c.onRefresh();
                   }
                   return;
                }else {
                   str = str1;
                   str1 = str4;
                   d uod1 = uod;
                   String str10 = str3;
                   String[] stringArray7 = new String[]{"isCache"};
                   String[] stringArray8 = new String[]{String.valueOf(pageComponen.isFromCache)};
                   g.d(str7, e0, a.a(stringArray7, stringArray8));
                   uoa = uDynamicPage.q(uoa, e0);
                   stringArray8 = new String[]{"isCache"};
                   stringArray7 = new String[]{String.valueOf(pageComponen.isFromCache)};
                   g.d(str6, e0, a.a(stringArray8, stringArray7));
                   if (e0.t != null) {
                      uDynamicPage.r(StageName.pgy_page_parse_end);
                      uDynamicPage.m = uoa;
                      this.p();
                   }else {
                      uDynamicPage.r(StageName.pgy_feed_parse_end);
                   }
                   if (e0.t == null) {
                      str2 = "COMPONENT_OTHER_RENDER_STEP_4";
                   }
                   uDynamicPage.c(str2, str10, null);
                   if (uod1 != null) {
                      uod1.L7(uoa, false, false);
                   }
                   DynamicPageCenter m1 = uDynamicPage.m;
                   if (m1 instanceof RootContainerComponent) {
                      m1.applyClipConfig();
                   }
                   stringArray1 = new String[]{"isCache"};
                   stringArray8 = new String[]{String.valueOf(pageComponen.isFromCache)};
                   g.d(str5, e0, a.a(stringArray1, stringArray8));
                   uoa.bindData(uoa, uoa.rootView, 0);
                   stringArray1 = new String[]{"isCache"};
                   String[] stringArray9 = new String[]{String.valueOf(pageComponen.isFromCache)};
                   g.d("merchant_pgy_*_bind_data_end", e0, a.a(stringArray1, stringArray9));
                   if (e0.t != null) {
                      uDynamicPage.r(StageName.pgy_page_render_end);
                   }else {
                      uDynamicPage.r(StageName.pgy_feed_render_end);
                   }
                   str4 = (e0.t != null)? str1: "COMPONENT_OTHER_RENDER_STEP_5";
                   uDynamicPage.c(str4, str, null);
                   return;
                }
             }
          }
          str3 = str2;
          goto label_01e4 ;
       }
    }
    public final FragmentActivity g(){
       Object[] objArray = null;
       DynamicPageCenter obj = PatchProxy.apply(objArray, this, DynamicPageCenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj != null) {
          objArray = obj.get();
       }
       return objArray;
    }
    public a h(){
       return this.m;
    }
    public Fragment i(){
       Object[] objArray = null;
       DynamicPageCenter obj = PatchProxy.apply(objArray, this, DynamicPageCenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       if (obj != null) {
          objArray = obj.get();
       }
       return objArray;
    }
    public final a j(a p0){
       a uoa;
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicPageCenter.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       if (p0 instanceof h) {
          return p0;
       }
       if (p0.children == null) {
          return null;
       }
       int i = 0;
       while (true) {
          if (i >= p0.children.size()) {
             return null;
          }
          uoa = this.j(p0.children.get(i));
          if (uoa != null) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return uoa;
    }
    public final t k(Map p0,g p1){
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, DynamicPageCenter.class, "43");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object[] objArray = null;
       if (p1.Q != null) {
          obj = a.b;
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, a.class, "1");
          if (obj1 != patchProxyRe) {
          }else if(obj.a == null){
             obj.a = new a$a(d.b);
          }
          obj1 = e.b(obj.a, a.class);
          return obj1.b(p0, p1.q, p1.n);
       }else if(p1.J != null){
          if (p1.r == null) {
             return objArray;
          }else {
             ot = b.b().a().j(p0, p1.q, p1.r);
          }
       }else {
          ot = b.b().a().b(p0, p1.q, p1.n);
       }
       return ot;
    }
    public final g l(g p0){
       g og;
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicPageCenter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          og = PatchProxy.applyOneRefs(p0, null, f.class, "1");
          if (og != PatchProxyResult.class) {
          }else {
             og = new g$a(p0.a, p0.b, p0.c).a();
             Field[] fields = g.class.getFields();
             int len = fields.length;
             int i = 0;
             while (i < len) {
                object oobject = fields[i];
                if (oobject.isAnnotationPresent(f.class)) {
                   a.o(og, oobject.getName(), a.d(p0, oobject.getName()));
                }
                i = i + 1;
             }
          }
       }catch(java.lang.Exception e2){
          c.b("PageContext getDeepCopy error : "+e2.getMessage());
          obj = PatchProxy.apply(null, p0, g.class, "3");
          if (obj != PatchProxyResult.class) {
             og = obj;
          }else {
             g$a uoa = new g$a(p0.a, p0.b, p0.c);
             uoa.v(p0.q);
             uoa.u(p0.n);
             uoa.t(p0.r);
             uoa.s(p0.l);
             uoa.f(p0.o);
             uoa.j(p0.v);
             uoa.h(p0.w);
             uoa.l(p0.t);
             uoa.k(p0.u);
             uoa.g(p0.x);
             uoa.D(p0.y);
             uoa.e(p0.z);
             uoa.o(p0.A);
             uoa.p(p0.D);
             uoa.C(p0.C);
             uoa.w(p0.F);
             uoa.i(p0.G);
             uoa.c(p0.E);
             uoa.b(p0.H);
             uoa.m(p0.J);
             uoa.d(p0.p);
             uoa.r(p0.I);
             uoa.B(p0.K);
             uoa.q(p0.N);
             uoa.z(p0.L);
             uoa.x(p0.M);
             uoa.y(p0.O);
             uoa.A(p0.P);
             og = uoa.a();
          }
       }
       og.s = true;
       return og;
    }
    public final a m(a p0){
       a uoa;
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicPageCenter.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       a rootView = p0.rootView;
       if (rootView != null && rootView instanceof DynamicRootListContainer) {
          return p0;
       }
       if (p0.children == null) {
          return null;
       }
       int i = 0;
       while (true) {
          if (i >= p0.children.size()) {
             return null;
          }
          uoa = this.m(p0.children.get(i));
          if (uoa != null) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return uoa;
    }
    public final a n(a p0){
       a uoa;
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicPageCenter.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       if (p0 instanceof b) {
          return p0;
       }
       if (p0.children == null) {
          return null;
       }
       int i = 0;
       while (true) {
          if (i >= p0.children.size()) {
             return null;
          }
          uoa = this.n(p0.children.get(i));
          if (uoa != null) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return uoa;
    }
    public final a o(PageComponentResponse p0,Gson p1,boolean p2,boolean p3){
       a obj;
       if (PatchProxy.isSupport(DynamicPageCenter.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, DynamicPageCenter.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       if (p0 == null) {
          return obj;
       }else if(this.g() == null){
          return obj;
       }else {
          a uoa = a.f(a.h(this.l, p0, p1, p3));
          if (p2) {
             p1.c = System.currentTimeMillis();
             c.f(StageName.pdy_parse_end, this.p, this.o);
          }
          return uoa;
       }
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, DynamicPageCenter.class, "38")) {
          return;
       }
       if (this.u == null) {
          return;
       }
       a uoa = DynamicPageCenter.f(this.h());
       if (uoa != null) {
          uoa.setDispatchDrawSubject(this.u);
       }
       return;
    }
    public final a q(a p0,g p1){
       c c;
       c d;
       Object obj = this;
       a obj1 = p0;
       a uoa = p1;
       DynamicPageCenter uDynamicPage = DynamicPageCenter.class;
       a obj2 = PatchProxy.applyTwoRefs(obj1, uoa, obj, uDynamicPage, "17");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       obj2 = null;
       if (obj1 == null) {
          return obj2;
       }
       if (this.g() == null) {
          c.b(d.a(obj.p, "PageDy parseComponent error activity null"));
          return obj2;
       }else {
          obj1 = p0.b();
          if (uoa.t == null || uoa.s == null) {
             obj1.getView(this.g(), obj2, obj.f, obj2);
          }
          if (uoa.z == null) {
             uoa.z = obj.n;
          }
          g z = uoa.z;
          if (z != null) {
             obj1.setCallerContexts(z);
          }
          if (uoa.t != null) {
             PageDy.e().g.d = System.currentTimeMillis();
             c.f(StageName.pdy_create_rootview, obj.p, obj.o);
             if (!PatchProxy.applyVoid(obj2, obj, uDynamicPage, "18")) {
                PageDy g = PageDy.e().g;
                c a = g.a;
                c b = g.b;
                c = g.c;
                d = g.d;
                if (a - d <= 0) {
                   long l = b - a;
                   long l1 = c - a;
                   long l2 = d - a;
                   c.f("t1: "+l+" t2: "+l1+" t3: "+l2);
                   String str = "PageDy";
                   if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidFourRefs(Long.valueOf(l), Long.valueOf(l1), Long.valueOf(l2), str, null, d.class, "6")) {
                      Map map = d.b();
                      map.put("t1", Long.valueOf(l));
                      map.put("t2", Long.valueOf(l1));
                      map.put("t3", Long.valueOf(l2));
                      map.put("dynamic_type", str);
                      d.m("DynamicCostTimeEvent", map);
                   }
                }
             }
          }
          return obj1;
       }
    }
    public void r(StageName p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicPageCenter.class, "40")) {
          return;
       }
       if (p0 != null && !TextUtils.x(p0.name())) {
          DynamicPageCenter uDynamicPage = null;
          if (this.s.containsKey(p0.name())) {
             uDynamicPage = this.s.get(p0.name()).booleanValue();
          }
          if (uDynamicPage) {
             c.f("已经上报过了，本次不上报"+p0.name());
             return;
          }else {
             c.l(p0, this.p, this.o, null);
             this.s.put(p0.name(), Boolean.TRUE);
          }
       }
       return;
    }
    public synchronized void s(g p0,d p1){
       boolean b1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DynamicPageCenter.class, "6")) {
          return;
       }
       boolean b = true;
       if (p0.t != null) {
          PageDy.e().g.a(System.currentTimeMillis());
          c.f(StageName.pdy_request_start, this.p, this.o);
          this.t = b;
          if (p0.N != null) {
             h.a(this.a);
          }
       }else {
          this.r(StageName.pgy_feed_request_start);
       }
       this.a(p0);
       String str = (p0.t != null)? "COMPONENT_DATA_MAIN_REQUEST_STEP_1": "COMPONENT_DATA_OTHER_REQUEST_STEP_1";
       this.c(str, "开始接口请求:"+p0.q, p0.n);
       d uod = d.a();
       g q = p0.q;
       g n = p0.n;
       Objects.requireNonNull(uod);
       Object obj = PatchProxy.applyTwoRefs(q, n, uod, d.class, "2");
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else if(TextUtils.x(q) || !uod.b(q, n)){
          PreReqInfo preReqInfo = uod.a.get(q);
          if (preReqInfo != null && preReqInfo.c == PreReqInfo$ReqStatus.ING) {
             b1 = true;
          }
       }
       b1 = false;
       boolean b2 = a.t().d("merchantHomeAgileNetworkCache", false);
       if (b1 && (b2 && !this.z.containsKey(p0.q))) {
          c.f("预请求中，先返回缓存数据");
          c.l(StageName.pgy_page_first_request, this.p, this.o, new DynamicPageCenter$3(this, p0));
          if (this.d != null) {
             g.c("merchant_pgy_*_cache_start", p0);
             PageComponentResponse pageComponen = this.d.a(p0.q, p0.n);
             this.z.put(p0.q, Boolean.TRUE);
             g.c("merchant_pgy_*_cache_end", p0);
             if (pageComponen != null) {
                pageComponen.isFromCache = b;
                this.e(p0, pageComponen, p1);
                c.l(StageName.pgy_page_cache_hit, this.p, this.o, new DynamicPageCenter$4(this, p0));
                p0 = this.l(p0);
             }else {
                c.f("没有缓存数据");
             }
          }
       }
       this.t(p0, p1);
       return;
    }
    public final void t(g p0,d p1){
       PreReqInfo c;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DynamicPageCenter.class, "7")) {
          return;
       }
       d uod = d.a();
       g q = p0.q;
       g n = p0.n;
       DynamicPageCenter$a uoa = new DynamicPageCenter$a(this, p0, p1);
       Objects.requireNonNull(uod);
       if (!PatchProxy.applyVoidThreeRefs(q, n, uoa, uod, d.class, "3") && !TextUtils.x(q)) {
          if (!uod.b(q, n)) {
             c.f("no pre data return none"+q);
             uoa.b();
          }else {
             PreReqInfo preReqInfo = uod.a.get(q);
             c = preReqInfo.c;
             if (c == PreReqInfo$ReqStatus.ING) {
                if (uod.b.containsKey(q)) {
                   c.f("has same request wait ："+q);
                }else {
                   c.f("pre request ing wait ： "+q);
                   uod.b.put(q, uoa);
                }
             }else if(c == PreReqInfo$ReqStatus.COMPLETE){
                c = preReqInfo.a;
                if (c != null) {
                   Object obj = PatchProxy.apply(null, c, a.class, "1");
                   boolean b = true;
                   if (obj != PatchProxyResult.class) {
                      b = obj.booleanValue();
                   }else if(!c.a - -1){
                      c.f("数据是否有效 time"+(System.currentTimeMillis() - c.e)+" expirationTime = "+c.a);
                      if ((System.currentTimeMillis() - c.e) - c.a >= 0) {
                         b = false;
                      }
                      if (!b) {
                         c.f("数据失效了");
                      }
                   }
                   if (b) {
                      c.f("pre request complete response"+q);
                      c.l(StageName.pgy_page_prefetch_hit, preReqInfo.a.g, b.a().b(preReqInfo.a.g, "PageDy"), new PreReqManager$1(uod, preReqInfo));
                      uoa.a(preReqInfo.b);
                   label_0148 :
                      uod.a.remove(q);
                   }
                }
                c.f("pre data isValid return none"+q);
                uoa.b();
                goto label_0148 ;
             }
          }
       }
       return;
    }
    public void u(d p0,g p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, DynamicPageCenter.class, "13")) {
          return;
       }
       if (this.h != null) {
          c.f("request is canceled return");
          return;
       }else {
          a uoa = null;
          if (p1.s != null) {
             c.f("request is isRefresh return");
             p1 = p1.p;
             if (p1 != null) {
                d uod = p1.get("KEY_NEED_REFRESH_ERROR");
                if (uod != null && (uod.e() != null && uod.e() instanceof Boolean)) {
                   if (uod.e().booleanValue()) {
                      p0.p6(uoa, -1, p2);
                   }
                   return;
                }
             }
             if (p0 != this.c) {
                p0.p6(uoa, -1, p2);
             }
             return;
          }else {
             this.r(StageName.pgy_page_request_end);
             a obj = PatchProxy.applyOneRefs(p1, this, DynamicPageCenter.class, "15");
             if (obj != PatchProxyResult.class) {
                uoa = obj;
             }else {
                g x = p1.x;
                if (x != null) {
                   try{
                      uoa = this.o(e.a(c.m(x), PageComponentResponse.class), this.e, p1.t, 0);
                   }catch(java.lang.Exception e0){
                      String[] stringArray = new String[]{"msg"};
                      String[] stringArray1 = new String[]{e0.getMessage()};
                      c.d(d.a(this.p, "PageDy getDefaultTreeNode error"), a.a(stringArray, stringArray1));
                      String str = (p1.t != null)? "COMPONENT_MAIN_RENDER_STEP_2": "COMPONENT_OTHER_RENDER_STEP_2";
                      this.b(str, "getDefaultTreeNode error", e0, uoa);
                   }
                }
             }
          }
       }
    }
    public final void v(a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DynamicPageCenter.class, "36")) {
          return;
       }
       p1.setCallerContexts(this.n);
       p1.setCallerContexts(p0.callerContext);
       try{
          p0.update(p1);
          p0.bindData(p1, p0.rootView, p0.getAdapterPosition());
       }catch(java.lang.Exception e4){
          c.b("refreshPage update component fail, reason:"+e4.getMessage());
          p0.addError("refreshPage update component fail", null, e4);
       }
       return;
    }
}
