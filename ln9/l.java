package ln9.l;
import tvc.c;
import mn9.f;
import jn9.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import crd.a;
import tvc.a;
import tvc.e;
import nn9.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kn9.c;
import com.yxcorp.gifshow.component.postlistcomponent.middleware.PostListComponentMiddleware$dispose$transform$1;
import java.util.List;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import msd.l;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import nn9.a;
import crd.b;
import com.yxcorp.gifshow.component.postlistcomponent.state.LoadingStatus;
import java.lang.Throwable;
import nsd.u;
import kn9.f;
import java.lang.Boolean;
import java.lang.System;
import java.util.Objects;
import brd.t;
import mn9.d;
import io.reactivex.g;
import t45.d;
import brd.z;
import ln9.b;
import erd.o;
import ln9.c;
import ln9.d;
import erd.g;
import kn9.h;
import mn9.b;
import mn9.e;
import ln9.h;
import ln9.i;
import ln9.j;
import ln9.k;
import com.yxcorp.gifshow.component.postlistcomponent.action.PostListComponentResetItemLoadingAction;
import java.lang.Integer;
import nn9.b;
import com.yxcorp.gifshow.component.postlistcomponent.state.ItemLoadingStatus;
import mn9.a;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import kn9.e;
import mn9.c;
import ln9.e;
import erd.a;
import ln9.f;
import ln9.g;
import kn9.b;
import com.yxcorp.gifshow.component.postlistcomponent.middleware.PostListComponentMiddleware$clearSelection$transform$1;
import kn9.d;
import com.yxcorp.utility.SystemUtil;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import e17.i;
import ln9.a;
import java.lang.Enum;
import jn9.c;
import kotlin.NoWhenBranchMatchedException;
import kn9.j;
import kn9.n;
import kn9.m;
import kn9.k;
import kn9.a;
import kn9.l;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.IndexOutOfBoundsException;
import com.yxcorp.gifshow.v3.framework.KSStore;

public final class l extends c	// class@002e28
{
    public a b;
    public b c;
    public b d;
    public String e;
    public final f f;
    public final d g;

    public void l(f p0,d p1){
       a.p(p0, "mRepo");
       a.p(p1, "mDataConfig");
       super();
       this.f = p0;
       this.g = p1;
       this.b = new a();
    }
    public e b(a p0,e p1){
       List list;
       Iterator iterator;
       List list1;
       ArrayList uArrayList;
       Iterator iterator1;
       List list2;
       ArrayList uArrayList1;
       Iterator iterator2;
       List list3;
       l c;
       f a;
       f b;
       f uof1;
       l obj3;
       long l;
       c uoc;
       String str1;
       b[] obj4;
       a obj5;
       t ot1;
       int index;
       Object obj6;
       String obj9;
       ArrayList uArrayList3;
       d uod;
       Iterator iterator3;
       a obj10;
       l d;
       b uob1;
       a uoa = this;
       PostListComponentMiddleware$dispose$transform$1 obj = p0;
       Object obj1 = p1;
       f uof = f.class;
       l ol = l.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       ArrayList obj2 = PatchProxy.applyTwoRefs(obj, obj1, uoa, ol, str);
       if (obj2 != patchProxyRe) {
       }else {
          a.p(obj, "action");
          a.p(obj1, "oldState");
          int i = 10;
          Throwable throwable = null;
          int i1 = 2;
          if (obj instanceof c) {
             obj = PatchProxy.applyOneRefs(obj1, uoa, ol, "10");
             if (obj != patchProxyRe) {
                obj1 = obj;
             }else if(!uoa.b.isDisposed()){
                uoa.b.dispose();
                uoa.b = new a();
             }
             obj = new PostListComponentMiddleware$dispose$transform$1(uoa);
             list = obj1.e();
             obj2 = new ArrayList(u.Y(list, i));
             iterator = list.iterator();
             while (iterator.hasNext()) {
                obj2.add(obj.invoke(iterator.next()));
             }
             list = CollectionsKt___CollectionsKt.J5(obj2);
             list1 = obj1.f();
             uArrayList = new ArrayList(u.Y(list1, i));
             iterator1 = list1.iterator();
             while (iterator1.hasNext()) {
                uArrayList.add(obj.invoke(iterator1.next()));
             }
             list1 = CollectionsKt___CollectionsKt.J5(uArrayList);
             list2 = obj1.h();
             uArrayList1 = new ArrayList(u.Y(list2, i));
             iterator2 = list2.iterator();
             while (iterator2.hasNext()) {
                uArrayList1.add(obj.invoke(iterator2.next()));
             }
             list3 = CollectionsKt___CollectionsKt.J5(uArrayList1);
             a uoa1 = obj1.g();
             c = uoa.c;
             if (c != null && !c.isDisposed()) {
                c.dispose();
                uoa1 = new a(LoadingStatus.DATA_LOADING_CANCELLED, throwable, i1, throwable);
             }
             obj1 = obj1.b(uoa1, list, list1, list3);
          }else if(obj instanceof f){
             a = obj.a;
             b = obj.b;
             f c1 = obj.c;
             if (PatchProxy.isSupport(ol)) {
                uof1 = c1;
                obj3 = PatchProxy.applyFourRefs(obj1, Boolean.valueOf(a), Boolean.valueOf(b), c1, this, l.class, "2");
                if (obj3 != patchProxyRe) {
                   obj1 = obj3;
                }
             }else {
                uof1 = c1;
             }
             obj3 = uoa.c;
             if (obj3 != null && !obj3.isDisposed()) {
                obj3 = uoa.c;
                if (obj3 != null) {
                   obj3.dispose();
                }
             }
             l = System.currentTimeMillis();
             obj3 = uoa.f;
             Objects.requireNonNull(obj3);
             t ot = PatchProxy.applyOneRefs(uof1, obj3, uof, str);
             if (ot != patchProxyRe) {
             }else {
                ot = t.create(new d(obj3, uof1));
                a.o(ot, "Observable.create { emit¡­st\(emitter\)\n      }\n    }");
             }
             uoc = new c(this, l, a, b);
             uoa.c = ot.observeOn(d.c).flatMap(new b(uoa)).observeOn(d.a).subscribe(uof, new d(uoa, a, b));
             obj1 = d.c(obj1, super(LoadingStatus.DATA_LOADING, null, i1, null), null, null, null, 14, null);
          }else if(obj instanceof h){
             h a1 = obj.a;
             str1 = "4";
             if (PatchProxy.isSupport(ol)) {
                obj4 = PatchProxy.applyTwoRefs(obj1, Boolean.valueOf(a1), uoa, ol, str1);
                if (obj4 != patchProxyRe) {
                }
             }
             ol = uoa.f;
             Objects.requireNonNull(ol);
             obj5 = PatchProxy.apply(null, ol, uof, "6");
             boolean b1 = (obj5 != patchProxyRe)? obj5.booleanValue(): ol.a.hasMore();
             if (b1) {
                ol = uoa.c;
                if (ol != null && !ol.isDisposed()) {
                   ol = uoa.c;
                   if (ol != null) {
                      ol.dispose();
                   }
                }
                long l1 = System.currentTimeMillis();
                c = uoa.f;
                Objects.requireNonNull(c);
                ot1 = PatchProxy.apply(null, c, uof, str1);
                if (ot1 != patchProxyRe) {
                }else {
                   ot1 = t.create(new e(c)).subscribeOn(d.c);
                   a.o(ot1, "Observable.create { emit¡­eOn\(KwaiSchedulers.ASYNC\)");
                }
                uoa.c = ot1.observeOn(d.c).flatMap(new h(uoa)).flatMap(new i(uoa)).observeOn(d.a).subscribe(new j(uoa, l1, a1), new k(uoa, a1));
                obj1 = d.c(obj1, new a(LoadingStatus.DATA_LOADING_MORE, null, i1, null), null, null, null, 14, null);
             }
          }else {
             int i2 = 0;
             int i3 = 1;
             if (obj instanceof PostListComponentResetItemLoadingAction) {
                index = obj.getIndex();
                if (PatchProxy.isSupport(ol)) {
                   obj4 = PatchProxy.applyTwoRefs(Integer.valueOf(index), obj1, uoa, ol, "3");
                   if (obj4 != patchProxyRe) {
                   }
                }
                if (index >= 0 && index < obj1.j().size()) {
                   b uob = b.a(obj1.j().get(index), null, ItemLoadingStatus.IDLE, 0, false, -1, null, false, false, null, 461, null);
                   if (a.g(uoa.d, uob)) {
                      uoa.d = uob;
                   }
                   obj4 = new b[i3];
                   obj4[i2] = uob;
                   obj1 = obj1.k(obj4);
                }
             }else if(obj instanceof e){
                obj6 = obj1.j().get(obj.a);
                e b2 = obj.b;
                e c2 = obj.c;
                String obj7 = PatchProxy.applyFourRefs(obj6, obj1, b2, c2, this, l.class, "6");
                if (obj7 != patchProxyRe) {
                   obj1 = obj7;
                }else {
                   uoa.e = obj6.b();
                   if (!obj6.i()) {
                      if (obj6.d() && !obj6.g().a()) {
                         obj1 = uoa.e(obj1, obj6.g());
                      }else if(uoa.f.a(obj6.g(), c2)){
                         if (obj6.g().d()) {
                            obj1 = uoa.f(obj6, obj1, i3, b2);
                         }
                      }else {
                         obj7 = obj6.b();
                         ol = uoa.f;
                         obj5 = obj6.g();
                         Objects.requireNonNull(ol);
                         ot1 = PatchProxy.applyTwoRefs(obj5, c2, ol, uof, "2");
                         if (ot1 != patchProxyRe) {
                         }else {
                            a.p(obj5, "item");
                            ot1 = t.create(new c(ol, c2, obj5)).observeOn(d.a);
                            a.o(ot1, "Observable.create { emit¡­veOn\(KwaiSchedulers.MAIN\)");
                         }
                         uoa.b.c(ot1.doOnComplete(new e(uoa, obj7, b2)).subscribe(new f(uoa, obj7), new g(uoa, obj7)));
                         obj4 = new b[i3];
                         obj4[i2] = b.a(obj6, null, ItemLoadingStatus.ITEM_LOADING, 0, false, 0, null, false, false, null, 485, null);
                         obj1 = obj1.k(obj4);
                      }
                   }
                }
             }else if(obj instanceof b){
                PostListComponentMiddleware$clearSelection$transform$1 obj8 = PatchProxy.applyOneRefs(obj1, uoa, ol, "9");
                if (obj8 != patchProxyRe) {
                   obj1 = obj8;
                }else {
                   obj8 = PostListComponentMiddleware$clearSelection$transform$1.INSTANCE;
                   list = obj1.e();
                   obj2 = new ArrayList(u.Y(list, i));
                   iterator = list.iterator();
                   while (iterator.hasNext()) {
                      obj2.add(obj8.invoke(iterator.next()));
                   }
                   list1 = CollectionsKt___CollectionsKt.J5(obj2);
                   list = obj1.f();
                   uArrayList = new ArrayList(u.Y(list, i));
                   iterator = list.iterator();
                   while (iterator.hasNext()) {
                      uArrayList.add(obj8.invoke(iterator.next()));
                   }
                   list2 = CollectionsKt___CollectionsKt.J5(uArrayList);
                   list = obj1.h();
                   uArrayList1 = new ArrayList(u.Y(list, i));
                   iterator = list.iterator();
                   while (iterator.hasNext()) {
                      uArrayList1.add(obj8.invoke(iterator.next()));
                   }
                   uoa.d = null;
                   obj1 = d.c(obj1, null, list1, list2, CollectionsKt___CollectionsKt.J5(uArrayList1), 1, 0);
                }
             }else if(obj instanceof d){
                obj4 = PatchProxy.applyTwoRefs(obj1, obj, uoa, ol, "12");
                if (obj4 != patchProxyRe) {
                }else {
                   d a2 = obj.a;
                   d b3 = obj.b;
                   iterator2 = obj1.j().iterator();
                   while (true) {
                      if (iterator2.hasNext()) {
                         obj9 = iterator2.next();
                         if (!a.g(obj9.g().getId(), a2.getId())) {
                            continue ;
                         }
                      }else {
                         obj9 = null;
                      }
                      if (obj9 != null && SystemUtil.I()) {
                         i.d(R.style.arg_RES_7f11066a, "insert duplicated item, moving it to specified position:"+b3+','+"item id: "+obj9.b());
                      }
                      index = a.a[obj.c.ordinal()];
                      if (index != i3) {
                         if (index != i1) {
                            if (index == 3) {
                               uoc = c.a;
                               uArrayList1 = uoc.a(obj1.e(), obj9);
                               ArrayList uArrayList2 = uoc.a(obj1.f(), obj9);
                               obj2 = uArrayList1;
                               uArrayList3 = uArrayList2;
                               uod = d.c(obj1, 0, obj2, uArrayList3, uoa.c(b3, a2, obj1.h(), obj9), 1, 0);
                            }else {
                               throw new NoWhenBranchMatchedException();
                            }
                         }else {
                            uoc = c.a;
                            uArrayList1 = uoc.a(obj1.e(), obj9);
                            uArrayList = uoc.a(obj1.h(), obj9);
                            obj2 = uArrayList1;
                            uod = d.c(obj1, 0, obj2, uoa.c(b3, a2, obj1.f(), obj9), uArrayList, 1, 0);
                         }
                      }else {
                         uoc = c.a;
                         uArrayList1 = uoc.a(obj1.f(), obj9);
                         uArrayList = uoc.a(obj1.h(), obj9);
                         uArrayList3 = uArrayList1;
                         uod = d.c(obj1, 0, uoa.c(b3, a2, obj1.e(), obj9), uArrayList3, uArrayList, 1, 0);
                      }
                      obj1 = uod;
                      iterator3 = obj1.j().iterator();
                      while (true) {
                         if (iterator3.hasNext()) {
                            obj10 = iterator3.next();
                            String str2 = obj10.b();
                            d = uoa.d;
                            str1 = (d != null)? d.b(): null;
                            if (a.g(str2, str1)) {
                               uob1 = obj10;
                            }else {
                               continue ;
                            }
                         }else {
                            uob1 = null;
                         }
                         uoa.d = uob1;
                      }
                   }
                }
             }else if(obj instanceof j){
                obj1 = c.a.c(obj1, obj);
             }else if(obj instanceof n){
                obj1 = uoa.e(obj1, obj.a);
             }else {
                obj9 = "5";
                if (obj instanceof m) {
                   obj6 = obj1.j().get(obj.a);
                   Object obj11 = PatchProxy.applyTwoRefs(obj6, obj1, uoa, ol, obj9);
                   if (obj11 != patchProxyRe) {
                      obj1 = obj11;
                   }else if(a.g(obj6, uoa.d)){
                      uoa.d = null;
                   }
                   obj4 = new b[i3];
                   obj4[i2] = b.a(obj6, null, null, 0, false, 0, null, false, false, null, 503, null);
                   obj1 = obj1.k(obj4);
                }else if(obj instanceof k){
                   ol = uoa.d;
                   if (ol != null && ol.c() == obj.getPosition()) {
                      ol = uoa.d;
                      if (ol != null) {
                         obj10 = ol.g();
                         if (obj10 == null || obj10.a()) {
                         }
                      }else {
                      }
                   }else {
                   }
                }else if(obj instanceof a){
                   uoa.e = null;
                }else if(obj instanceof l){
                   obj3 = obj.a;
                   obj4 = PatchProxy.applyTwoRefs(obj1, obj3, uoa, ol, "14");
                   if (obj4 != patchProxyRe) {
                   }else {
                      ol = uoa.f;
                      list1 = obj1.f();
                      uArrayList1 = new ArrayList(u.Y(list1, i));
                      iterator1 = list1.iterator();
                      while (iterator1.hasNext()) {
                         uArrayList1.add(iterator1.next().g());
                      }
                      Objects.requireNonNull(ol);
                      list1 = PatchProxy.applyTwoRefs(uArrayList1, obj3, ol, uof, obj9);
                      if (list1 != patchProxyRe) {
                      }else {
                         a.p(uArrayList1, "itemList");
                         a.p(obj3, "payload");
                         list1 = ol.a.a(uArrayList1, obj3);
                      }
                      list3 = obj1.f();
                      ArrayList uArrayList4 = new ArrayList(u.Y(list3, i));
                      iterator3 = list3.iterator();
                      while (iterator3.hasNext()) {
                         Object obj12 = iterator3.next();
                         int i4 = i2 + 1;
                         if (i2 < 0) {
                            CollectionsKt__CollectionsKt.W();
                         }
                         uArrayList4.add(b.a(obj12, list1.get(i2), null, 0, false, 0, null, false, false, null, 510, null));
                         i2 = i4;
                      }
                      obj1 = obj1.a(obj1.b, obj1.c, new ArrayList(uArrayList4), obj1.e);
                   }
                }
             }
          }
          obj1 = obj4;
       label_06b1 :
          obj2 = obj1;
       }
       return obj2;
    }
    public final ArrayList c(int p0,a p1,List p2,b p3){
       ArrayList obj1;
       int i = p0;
       Object obj = p3;
       if (PatchProxy.isSupport(l.class)) {
          obj1 = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, p3, this, l.class, "13");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       obj1 = new ArrayList(p2);
       if (i >= 0 && i <= obj1.size()) {
          if (!obj) {
             ItemLoadingStatus iTEM_LOADING = (f.b(this.f, p1, null, 2, null))? ItemLoadingStatus.ITEM_LOADING_FINISH: ItemLoadingStatus.IDLE;
             b uob = new b(p1, iTEM_LOADING, 0, false, 0, null, false, false, null, 508, null);
             obj1.add(i, iTEM_LOADING);
          }else {
             obj1.remove(obj);
             if (i > obj1.size()) {
                i = obj1.size();
             }
             obj1.add(i, obj);
          }
          return obj1;
       }else {
          throw new IndexOutOfBoundsException("index "+i+", listCount "+obj1.size());
       }
    }
    public final b d(String p0){
       List list;
       KSStore obj = PatchProxy.applyOneRefs(p0, this, l.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       b uob = null;
       if (obj != null) {
          d uod = obj.b();
          if (uod != null) {
             list = uod.j();
          label_0024 :
             if (list != null) {
                Iterator iterator = list.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      Object obj1 = iterator.next();
                      if (a.g(obj1.b(), p0)) {
                         uob = obj1;
                      }
                   }
                   break ;
                }
             }
             return uob;
          }
       }
       list = uob;
       goto label_0024 ;
    }
    public final d e(d p0,a p1){
       int b1;
       Object obj = this;
       d uod = p0;
       Iterator obj1 = PatchProxy.applyTwoRefs(uod, p1, obj, l.class, "11");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = p0.j().iterator();
       while (true) {
          boolean b = false;
          if (obj1.hasNext()) {
             b1 = obj1.next();
             if (!a.g(b1.g().getId(), p1.getId())) {
                continue ;
             }
          }else {
             b1 = b;
          }
          b[] obj2 = b1;
          b1 = 1;
          if (obj2 != null) {
             b = b.a(obj2, p1, null, 0, false, 0, null, (obj2.h() ^ 0x01), false, null, 446, null);
          }
          if (a.g(obj.d, b)) {
             obj.d = b;
          }
          if (b != null) {
             obj2 = new b[b1];
             obj2[0] = b;
             uod = uod.k(obj2);
             break ;
          }
          break ;
       }
       return uod;
    }
    public final d f(b p0,d p1,boolean p2,SelectScrollOption p3){
       ItemLoadingStatus obj;
       b this;
       l ol = this;
       if (PatchProxy.isSupport(l.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, l.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = ItemLoadingStatus.ITEM_LOADING_FINISH;
       b uob = b.a(p0, null, obj, 0, true, 100, null, false, p2, p3, 69, null);
       this = null;
       if (a.g(uob, ol.d) ^ 1) {
          l d = ol.d;
          if (d != null) {
             this = b.a(d, null, obj, 0, false, 100, null, false, false, null, 453, null);
          }
       }
       b[] uobArray = new b[]{uob,this};
       ol.d = uob;
       return p1.k(uobArray);
    }
}
