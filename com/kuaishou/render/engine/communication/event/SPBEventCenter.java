package com.kuaishou.render.engine.communication.event.SPBEventCenter;
import com.kuaishou.render.engine.communication.event.SPBEventCenter$a;
import nsd.u;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import pv.b;
import java.lang.String;
import lu4.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import nv.c;
import java.util.Map;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Objects;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;
import java.util.ListIterator;
import com.kuaishou.render.engine.communication.data.SPBEventBean;
import yz7.e;
import com.kuaishou.bowl.event.utils.StageName;
import lu4.c;
import bv4.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Collection;
import java.lang.Iterable;
import hu4.k;
import hu4.l;
import uu4.f;
import uu4.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.render.engine.communication.event.SPBEventCenter$dispatchPageEvent$1;
import msd.l;
import trd.y;
import trd.u;

public final class SPBEventCenter	// class@000eef
{
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final String e;
    public static final SPBEventCenter f;
    public static final SPBEventCenter$a g;

    static {
       SPBEventCenter.g = new SPBEventCenter$a(null);
       SPBEventCenter.f = new SPBEventCenter();
    }
    public void SPBEventCenter(){
       super();
       this.a = new ConcurrentHashMap();
       this.b = new ConcurrentHashMap();
       this.c = new ConcurrentHashMap();
       this.d = new ConcurrentHashMap();
       this.e = b.a().b("SPBEventCenter", String.valueOf(this.hashCode()));
    }
    public static final SPBEventCenter d(){
       return SPBEventCenter.f;
    }
    public final void a(String p0,String p1,a p2,boolean p3){
       Set set1;
       a obj1;
       if (PatchProxy.isSupport(SPBEventCenter.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, SPBEventCenter.class, "1")) {
          return;
       }
       SPBEventCenter obj = null;
       a d = (p2 != null)? p2.d: obj;
       if (d == null) {
          c.b("addSubscriber fail,eventlistener or function is null");
          return;
       }else {
          SPBEventCenter ta = this.a;
          a e = (p2 != null)? p2.e: obj;
          if (!ta.containsKey(e)) {
             ta = this.a;
             a e1 = (p2 != null)? p2.e: obj;
             a.o(e1, "iEventListener?.token");
             ta.put(e1, p2);
          }else {
             c.b("addSubscriber fail,duplicate add subscriber "+p2.a+" to eventcenter");
          }
          String str = "null cannot be cast to non-null type kotlin.collections.Map<K, *>";
          if (!TextUtils.isEmpty(p0)) {
             ta = this.b;
             Objects.requireNonNull(ta, str);
             if (!ta.containsKey(p0)) {
                a.m(p0);
                this.b.put(p0, new LinkedHashSet());
             }
             Set set = this.b.get(p0);
             if (set != null) {
                a e2 = (p2 != null)? p2.e: obj;
                a.o(e2, "iEventListener?.token");
                set.add(e2);
             }
          }
          if (!TextUtils.isEmpty(p1)) {
             ta = this.b;
             Objects.requireNonNull(ta, str);
             if (!ta.containsKey(p1)) {
                a.m(p1);
                this.b.put(p1, new LinkedHashSet());
             }
             set1 = this.b.get(p1);
             if (set1 != null) {
                d = (p2 != null)? p2.e: obj;
                a.o(d, "iEventListener?.token");
                set1.add(d);
             }
          }
          a b = p2.b;
          if (!TextUtils.isEmpty(b)) {
             if (!this.b.containsKey(b)) {
                a.o(b, "fragmentId");
                this.b.put(b, new LinkedHashSet());
             }
             set1 = this.b.get(b);
             if (set1 != null) {
                d = p2.e;
                a.o(d, "iEventListener?.token");
                set1.add(d);
             }
          }
          if (p3) {
             List list = this.c.get(p2.a);
             if (list != null) {
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                   if (listIterator.hasPrevious()) {
                      obj1 = listIterator.previous();
                      if (TextUtils.equals(obj1.pageId, p0)) {
                         obj = obj1;
                      }
                   }
                   if (obj != null) {
                      p2.b(obj, e.f(obj));
                   }
                }
             }
             SPBEventBean sPBEventBean = this.d.get(p2.a);
             if (sPBEventBean != null) {
                p2.b(sPBEventBean, e.f(this.d.get(p2.a)));
             }
          }
          StageName pgy_componen = StageName.pgy_component_bridge_regis;
          obj1 = p2.c;
          obj = this.e;
          p2 = p2.a;
          p0 = (TextUtils.isEmpty(p0))? "global": "page";
          a.b(pgy_componen, obj1, obj, c.a("event", p2, p0));
          return;
       }
    }
    public final void b(String p0,SPBEventBean p1,String p2,boolean p3){
       String str;
       SPBEventCenter sPBEventCent = SPBEventCenter.class;
       if (PatchProxy.isSupport(sPBEventCent) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, SPBEventCenter.class, "3")) {
          return;
       }
       a.p(p0, "action");
       if (p3) {
          this.d.put(p0, p1);
       }
       SPBEventCenter ta = this.a;
       ArrayList uArrayList = new ArrayList(ta.size());
       Iterator iterator = ta.entrySet().iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().getValue());
       }
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator1 = uArrayList.iterator();
       while (iterator1.hasNext()) {
          Object obj = iterator1.next();
          Object obj1 = obj;
          obj1 = (TextUtils.equals(obj1.a, p0) && obj1.g == null)? 1: null;
          if (obj1) {
             uArrayList1.add(obj);
          }
       }
       iterator = uArrayList1.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p1, p2);
       }
       k ok = k.a();
       a.o(ok, "RenderEngineInit.get\(\)");
       l ol = ok.b();
       if (ol != null) {
          ol = ol.a;
          if (ol != null) {
             f b = ol.b;
             if (b != null) {
                b.b("__#SPB_RN_EVENT_"+p0, p2);
             }
          }
       }
       p2 = PatchProxy.applyOneRefs(p0, this, sPBEventCent, "4");
       boolean b1 = (p2 != PatchProxyResult.class)? p2.booleanValue(): a.g(p0, "__#DEFAULT_SPB_CALLBACK_ACTION");
       if (!b1) {
          StageName pgy_componen = StageName.pgy_component_bridge_dispatch;
          p1 = (p1 != null)? p1.pageName: null;
          a.b(pgy_componen, p1, this.e, c.a("event", p0, "global"));
       }
       return;
    }
    public final void c(String p0,SPBEventBean p1,String p2,boolean p3){
       SPBEventCenter tb;
       SPBEventBean pageId;
       Set set;
       CharSequence uCharSequenc;
       if (PatchProxy.isSupport(SPBEventCenter.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, SPBEventCenter.class, "2")) {
          return;
       }
       a.p(p0, "action");
       if (p3) {
          if (!this.c.containsKey(p0) || this.c.get(p0) == null) {
             this.c.put(p0, new ArrayList());
          }
          List list = this.c.get(p0);
          if (list != null) {
             y.K0(list, new SPBEventCenter$dispatchPageEvent$1(p1));
          }
          if (p1 != null && list != null) {
             list.add(p1);
          }
       }
    label_0055 :
       SPBEventBean sPBEventBean = null;
       SPBEventBean customPageId = (p1 != null)? p1.customPageId: sPBEventBean;
       if (TextUtils.isEmpty(customPageId)) {
          tb = this.b;
          pageId = (p1 != null)? p1.pageId: sPBEventBean;
          set = tb.get(pageId);
       }else {
          tb = this.b;
          pageId = (p1 != null)? p1.customPageId: sPBEventBean;
          set = tb.get(pageId);
       }
       if (set != null) {
          ArrayList uArrayList = new ArrayList(u.Y(set, 10));
          Iterator iterator = set.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(this.a.get(iterator.next()));
          }
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             Object obj = iterator1.next();
             a obj1 = obj;
             obj1 = (obj1 != null)? obj1.a: sPBEventBean;
             if (TextUtils.equals(obj1, p0)) {
                uArrayList1.add(obj);
             }
          }
          iterator = uArrayList1.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa != null) {
                uoa.b(p1, p2);
             }
          }
       }
       k ok = k.a();
       a.o(ok, "RenderEngineInit.get\(\)");
       l ol = ok.b();
       if (ol != null) {
          ol = ol.a;
          if (ol != null) {
             f b = ol.b;
             if (b != null) {
                b.b("__#SPB_RN_EVENT_"+p0, p2);
             }
          }
       }
       StageName pgy_componen = StageName.pgy_component_bridge_dispatch;
       if (p1 != null) {
          sPBEventBean = p1.pageName;
       }
       a.b(pgy_componen, sPBEventBean, this.e, c.a("event", p0, "page"));
       return;
    }
    public final void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SPBEventCenter.class, "8")) {
          return;
       }
       a.p(p0, "pageId");
       Set set = this.b.get(p0);
       if (set != null) {
          Iterator iterator = set.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             if (this.a.containsKey(str)) {
                this.a.remove(str);
             }
          }
       }
       this.b.remove(p0);
       return;
    }
    public final void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SPBEventCenter.class, "5")) {
          return;
       }
       a.p(p0, "token");
       if (this.a.containsKey(p0)) {
          this.a.remove(p0);
       }
       return;
    }
}
