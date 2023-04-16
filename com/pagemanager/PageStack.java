package com.pagemanager.PageStack;
import android.app.Application$ActivityLifecycleCallbacks;
import java.util.ArrayList;
import com.pagemanager.PageStack$mCloser$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import android.content.Context;
import java.util.Map;
import ck8.e;
import ck8.b;
import java.util.HashMap;
import java.util.Objects;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.String;
import android.app.Activity;
import gk8.a;
import com.pagemanager.PageStack$navigateBackToPage$$inlined$apply$lambda$1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import java.util.Iterator;
import ek8.c;
import ek8.e;
import java.lang.StringBuilder;
import java.lang.Iterable;
import kotlin.jvm.internal.a;
import fk8.b;
import dk8.a;
import qrd.l1;
import kotlin.jvm.internal.Ref$BooleanRef;
import com.pagemanager.PageStack$closeChildPageOneByOne$$inlined$synchronized$lambda$1;
import com.pagemanager.PageStack$closeChildPageOneByOne$$inlined$synchronized$lambda$2;
import ck8.a;
import com.pagemanager.PageStack$notifyResult$1;
import java.lang.Throwable;
import android.util.Log;
import ek8.a;
import java.lang.System;
import java.util.ListIterator;
import com.pagemanager.PageStack$navigateBackToStartPage$2;
import com.pagemanager.PageStack$navigateBackToStartPage$3;
import com.pagemanager.PageStack$navigateBackToStartPage$5;
import com.pagemanager.PageStack$navigateBackToStartPage$6;
import ftd.r1;
import ftd.j2;
import ftd.z0;
import com.pagemanager.PageStack$runOnUi$1;
import asd.c;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import android.os.Bundle;
import com.pagemanager.PageStack$onActivityCreated$page$1;
import msd.l;
import ck8.e$a;
import com.pagemanager.PageStack$onActivityDestroyed$page$1;

public final class PageStack implements Application$ActivityLifecycleCallbacks	// class@000b48
{
    public static ArrayList b;
    public static a c;
    public static b d;
    public static final p e;
    public static final PageStack f;

    static {
       PageStack.f = new PageStack();
       PageStack.b = new ArrayList();
       PageStack.e = s.c(PageStack$mCloser$2.INSTANCE);
    }
    public void PageStack(){
       super();
    }
    public static void f(PageStack p0,Context p1,boolean p2,Map p3,e p4,b p5,int p6,Object p7){
       HashMap obj2;
       List list;
       int i3;
       Iterator obj5;
       e uoe1;
       PageStack obj = p4;
       HashMap hashMap = (p6 & 0x04)? new HashMap(): p3;
       ArrayList uArrayList = null;
       b uob = null;
       Objects.requireNonNull(p0);
       if (PageStack.b.size() > 0) {
          uArrayList = CollectionsKt___CollectionsKt.Y2(PageStack.b).c();
          Objects.requireNonNull(uArrayList, "null cannot be cast to non-null type android.app.Activity");
       }
       ArrayList uArrayList1 = uArrayList;
       Object obj1 = p4.c();
       if (obj1 instanceof Activity) {
          obj2 = obj1;
          list = p4.e();
       }else {
          PageStack f = PageStack.f;
          uoe1 = f.i(obj);
          if (uoe1 == null) {
             a.a(a.a, "page_backSuccess", f.b(PageStack.b, 404), null, null, 12, null);
             PageStack$navigateBackToPage$$inlined$apply$lambda$1 onavigateBac = new PageStack$navigateBackToPage$$inlined$apply$lambda$1(uob, uArrayList1, p2, hashMap, p4);
             f.h(v8);
          }else {
             List list1 = CollectionsKt___CollectionsKt.J5(CollectionsKt__CollectionsKt.E());
             obj5 = uoe1.e().iterator();
             while (obj5.hasNext()) {
                f.c(obj5.next(), list1);
             }
             Object obj6 = uoe1.c();
             Objects.requireNonNull(obj6, "null cannot be cast to non-null type android.app.Activity");
             obj2 = obj6;
             list = list1;
          }
       }
       char c = ']';
       c.b.b(e.a("PageStack"), "[navigateBackToPage]first, jump to Activity["+obj2+"],topActivity["+uArrayList1+c);
       Objects.requireNonNull(PageStack.f);
       uArrayList = PageStack.b;
       _monitor_enter(uArrayList);
       Iterator iterator = CollectionsKt___CollectionsKt.G4(PageStack.b).iterator();
       boolean b = false;
       int i = 1;
       PageStack pageStack = 1;
       int i1 = 0;
       while (true) {
          if (iterator.hasNext()) {
             PageStack obj3 = iterator.next().c();
             if (obj3 instanceof Activity) {
                int i2 = a.g(obj3, obj2) ^ i;
                if (i2) {
                   if (!pageStack) {
                      PageStack.f.d().a(b, obj3, PageStack.c);
                      i3 = p2;
                   }else {
                      PageStack.f.d().a(p2, obj3, PageStack.c);
                   }
                   c.b.b(e.a("PageStack"), "[closeActivityOneByOne]close["+obj3+c);
                   i1 = i1 + 1;
                   b = false;
                   pageStack = null;
                }else {
                   c.b.b(e.a("PageStack"), "[closeActivityOneByOne]back to ["+obj2+c);
                label_015f :
                   _monitor_exit(uArrayList);
                   c b1 = c.b;
                   b1.b(e.a("PageStack"), "[navigateBackToPage]sec, try to close subpages");
                   Objects.requireNonNull(PageStack.f);
                   b1.b(e.a("PageStack"), "[closeChildPageOneByOne]subPages size="+list.size());
                   if (list.isEmpty()) {
                      b1.b(e.a("PageStack"), "[closeChildPageOneByOne]no subpage to close");
                   }else {
                      ArrayList uArrayList2 = new ArrayList();
                      _monitor_enter(list);
                      Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
                      uBooleanRef.element = i;
                      Iterator iterator1 = CollectionsKt___CollectionsKt.G4(list).iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            Object obj4 = iterator1.next();
                            obj5 = obj4.c();
                            e uoe = obj4.b();
                            int i4 = a.g(obj4, obj) ^ i;
                            if (i4) {
                               uArrayList2.add(obj4);
                               obj3 = PageStack.f;
                               Objects.requireNonNull(obj3);
                               uoe1 = obj4.b();
                               if (uoe1 != null) {
                                  uoe1.e().remove(obj4);
                               }
                               c.b.b(e.a("PageStack"), "[popSubPage]page="+obj4);
                               PageStack$closeChildPageOneByOne$$inlined$synchronized$lambda$1 uocloseChild = new PageStack$closeChildPageOneByOne$$inlined$synchronized$lambda$1(obj5, obj4, uBooleanRef, list, p4, uArrayList2, p2, hashMap);
                               obj3.h(i);
                               uArrayList2 = uArrayList2;
                               i = 1;
                            }else {
                               ArrayList uArrayList3 = uArrayList2;
                               c.b.b(e.a("PageStack"), "[closeChildPageOneByOne]back to subpage["+obj4+']');
                               if (hashMap != null) {
                                  a.p(hashMap, "<set-?>");
                                  obj4.c = hashMap;
                               }
                               PageStack$closeChildPageOneByOne$$inlined$synchronized$lambda$2 uocloseChild1 = new PageStack$closeChildPageOneByOne$$inlined$synchronized$lambda$2(uoe, list, p4, uArrayList3, p2, hashMap);
                               PageStack.f.h(v9);
                            label_0267 :
                               _monitor_exit(list);
                            }
                         }else {
                            goto label_0267 ;
                         }
                      }
                   }
                   obj = PageStack.f;
                   Objects.requireNonNull(obj);
                   if (obj1 instanceof a) {
                      c.b.b(e.a("PageStack"), "[notifyResult]finally, bring customParam["+hashMap+" to target page]");
                      obj.h(new PageStack$notifyResult$1(obj1, hashMap));
                   }
                   obj2 = new HashMap();
                   obj2.put("stackSize", String.valueOf((PageStack.b.size() - i1)));
                   obj2.put("errorCode", "200");
                   a.a(a.a, "page_backSuccess", obj2, 0, 0, 12, 0);
                   break ;
                }
             }else {
                i3 = p2;
             }
          }else {
             i3 = p2;
             goto label_015f ;
          }
       }
       return;
    }
    public final List a(){
       List list = CollectionsKt___CollectionsKt.J5(CollectionsKt__CollectionsKt.E());
       Iterator iterator = PageStack.b.iterator();
       while (iterator.hasNext()) {
          e uoe = iterator.next();
          a.o(uoe, "page");
          this.c(uoe, list);
       }
       return list;
    }
    public final Map b(ArrayList p0,int p1){
       HashMap hashMap = new HashMap();
       hashMap.put("stackSize", String.valueOf(p0.size()));
       String stackTraceSt = Log.getStackTraceString(new Throwable());
       a.o(stackTraceSt, "Log.getStackTraceString\(Throwable\(\)\)");
       hashMap.put("codeStack", stackTraceSt);
       hashMap.put("errorCode", String.valueOf(p1));
       return hashMap;
    }
    public final void c(e p0,List p1){
       p1.add(p0);
       if (p0.e().isEmpty() ^ 0x01) {
          Iterator iterator = p0.e().iterator();
          while (iterator.hasNext()) {
             this.c(iterator.next(), p1);
          }
       }
       return;
    }
    public final b d(){
       return PageStack.e.getValue();
    }
    public final void e(){
       char c;
       a.a(a.a, "page_markTarget", null, null, null, 14, null);
       e uoe = CollectionsKt___CollectionsKt.Y2(this.a());
       boolean b = true;
       uoe.h(b);
       String str = "PageStack";
       c.b.b(e.a(str), uoe.d()+" markTopPageAsTarget");
       String stackTraceSt = Log.getStackTraceString(new Throwable());
       a.o(stackTraceSt, "Log.getStackTraceString\(Throwable\(\)\)");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.a().iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (obj.f()) {
             uArrayList.add(obj);
          }
       }
       if (uArrayList.size() > b) {
          String str1 = e.a(str);
          Objects.requireNonNull(c.b);
          a.p(str1, "tag");
          a.p("page stack has more than one target page", "message");
          c.a.a(str1, "page stack has more than one target page");
          HashMap hashMap = new HashMap();
          Iterator iterator1 = this.a().iterator();
          str1 = "";
          str = str1;
          c = ',';
          while (iterator1.hasNext()) {
             e uoe1 = iterator1.next();
             if (uoe1.f()) {
                str = str+uoe1.d()+c;
             }
          }
          hashMap.put("targetPage", str);
          hashMap.put("codeStack", stackTraceSt);
          Iterator iterator2 = this.a().iterator();
          while (iterator2.hasNext()) {
             str1 = str1+iterator2.next().d()+c;
          }
          hashMap.put("pageStack", str1);
          a.a(a.a, "page_multiMarkTarget", hashMap, null, null, 12, null);
       }
       return;
    }
    public final void g(Context p0,boolean p1,Map p2,b p3){
       Map map1;
       b uob = p3;
       String str = "stackSize";
       String str1 = "PageStack";
       a.p(p0, "context");
       c.b.b(e.a(str1), "[navigateBackToStartPage]start,time="+System.currentTimeMillis());
       HashMap hashMap = new HashMap();
       hashMap.put(str, String.valueOf(PageStack.b.size()));
       a.a(a.a, "page_backStart", hashMap, null, null, 12, null);
       List list = this.a();
       ListIterator listIterator = list.listIterator(list.size());
       while (true) {
          Map map = null;
          if (listIterator.hasPrevious()) {
             map1 = listIterator.previous();
             if (!map1.f()) {
                continue ;
             }
          }else {
             map1 = map;
          }
          Object obj = map1;
          if (obj == null) {
             break ;
          }else {
             c b = c.b;
             b.b(e.a(str1), "[navigateBackToStartPage]find target["+obj.d()+"] success,backing");
             if (PageStack.b.size() > 0) {
                map = CollectionsKt___CollectionsKt.Y2(PageStack.b);
             }
             if (a.g(obj, map)) {
                b.b(e.a(str1), "[navigateBackToStartPage]top page is target page");
                HashMap hashMap1 = new HashMap();
                hashMap1.put(str, String.valueOf(PageStack.b.size()));
                hashMap1.put("errorCode", "201");
                a.a(a.a, "page_backSuccess", hashMap1, null, null, 12, null);
                this.h(new PageStack$navigateBackToStartPage$3(uob));
                return;
             }else {
                PageStack.f(PageStack.f, p0, p1, p2, obj, null, 16, null);
                this.h(new PageStack$navigateBackToStartPage$5(uob));
                return;
             }
          }
       }
       c.b.a(e.a(str1), "[navigateBackToStartPage]Fail,no target page");
       a.a(a.a, "page_backFail", this.b(PageStack.b, 404), null, null, 12, null);
       this.h(new PageStack$navigateBackToStartPage$2(uob));
       return;
    }
    public final void h(a p0){
       a.f(r1.b, z0.g(), null, new PageStack$runOnUi$1(p0, null), 2, null);
    }
    public final e i(e p0){
       if (p0.c() instanceof Activity) {
          return p0;
       }
       p0 = p0.b();
       if (p0 != null) {
          return this.i(p0);
       }
       return null;
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       a.p(p0, "activity");
       e uoe = e.g.a(new PageStack$onActivityCreated$page$1(p0));
       if (!PageStack.b.contains(uoe)) {
          PageStack.b.add(uoe);
       }
       c.b.b(e.a("PageStack"), "[onActivityCreated]["+p0+']');
       return;
    }
    public void onActivityDestroyed(Activity p0){
       a.p(p0, "activity");
       e uoe = e.g.a(new PageStack$onActivityDestroyed$page$1(p0));
       if (PageStack.b.contains(uoe)) {
          PageStack.b.remove(uoe);
       }
       c.b.b(e.a("PageStack"), "[onActivityDestroyed]["+p0+"], time="+System.currentTimeMillis());
       return;
    }
    public void onActivityPaused(Activity p0){
       a.p(p0, "activity");
    }
    public void onActivityResumed(Activity p0){
       a.p(p0, "activity");
       c.b.b(e.a("PageStack"), "[onActivityResumed]["+p0+"],time="+System.currentTimeMillis());
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
       a.p(p0, "p0");
       a.p(p1, "p1");
    }
    public void onActivityStarted(Activity p0){
       a.p(p0, "activity");
    }
    public void onActivityStopped(Activity p0){
       a.p(p0, "activity");
       c.b.b(e.a("PageStack"), "[onActivityStopped]["+p0+']');
    }
}
