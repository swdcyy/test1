package dub.z;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import dub.k;
import java.util.List;
import java.util.Arrays;
import java.util.Objects;
import java.util.Collections;
import java.util.Iterator;
import xr4.a$a;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.lang.Boolean;
import k2b.f2;
import dub.j;
import java.lang.Runnable;
import ekd.k1;
import j9c.b;
import dub.i;
import dub.y;
import j9c.d;
import io.reactivex.subjects.PublishSubject;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import androidx.collection.ArrayMap;
import dub.n;
import java.util.Map;
import erd.r;
import bq6.e2;
import erd.o;
import t45.d;
import brd.z;
import java.lang.Long;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import dub.e;
import erd.g;
import crd.b;
import dub.h;
import brd.w;
import dub.f;
import dub.g;

public class z	// class@002584
{

    public void z(){
       super();
    }
    public static void a(String p0,Integer[] p1){
       Object[] obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, z.class, "25")) {
          return;
       }
       k ok = b.a(0x399cba89);
       List list = Arrays.asList(p1);
       Objects.requireNonNull(ok);
       if (!PatchProxy.applyVoidTwoRefs(p0, list, ok, k.class, "10")) {
          List list1 = Collections.emptyList();
          Iterator iterator = list.iterator();
          int i = 0;
          int i1 = 1;
          while (iterator.hasNext()) {
             Integer integer = iterator.next();
             if (integer.intValue() >= 0) {
                continue ;
             }else {
                a$a uoa = ok.a(integer.intValue());
                a$a c = uoa.c;
                if (c - uoa.d) {
                   uoa.d = c;
                   if (list1.isEmpty()) {
                      if (list.size() == i1) {
                         list1 = list;
                      }else {
                         Integer[] integerArray = new Integer[i1];
                         integerArray[i] = Integer.valueOf(uoa.g);
                         list1 = Lists.e(integerArray);
                      }
                   }else {
                      list1.add(Integer.valueOf(uoa.g));
                   }
                }
                ok.b(integer.intValue(), obj);
             }
          }
          obj = new Object[]{p0,Boolean.valueOf((list1.isEmpty() ^ i1)),list};
          f2.b("LocalNotifyDispatcher", "consumeRedDot: [%1$s] fake consume red dots %2$s, %3$s", obj);
          if (!list1.isEmpty()) {
             k1.o(new j(ok, list1));
          }
       }
       return;
    }
    public static void b(String p0,int p1){
       z oz = z.class;
       if (PatchProxy.isSupport(oz) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oz, "17")) {
          return;
       }
       z.c(p0, p1, 1);
       return;
    }
    public static void c(String p0,int p1,int p2){
       if (PatchProxy.isSupport(z.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, z.class, "18")) {
          return;
       }
       z.e(p0, b.a(p1, p2));
       return;
    }
    public static void d(String p0,int p1,int p2,Object p3){
       if (PatchProxy.isSupport(z.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, null, z.class, "19")) {
          return;
       }
       z.e(p0, b.a(p1, p2));
       b.a(0x399cba89).b(p1, p3);
       return;
    }
    public static void e(String p0,a$a p1){
       z oz = z.class;
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, oz, "20")) {
          return;
       }
       List list = Collections.singletonList(p1);
       if (!PatchProxy.applyVoidTwoRefs(p0, list, obj, oz, "21")) {
          k ok = b.a(0x399cba89);
          Objects.requireNonNull(ok);
          if (!PatchProxy.applyVoidTwoRefs(p0, list, ok, k.class, "4")) {
             k1.o(new i(ok, p0, list));
          }
       }
       return;
    }
    public static void f(String p0,String[] p1){
       y b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, z.class, "16")) {
          return;
       }
       y oy = b.a(-211346462);
       List list = Arrays.asList(p1);
       Objects.requireNonNull(oy);
       if (!PatchProxy.applyVoidTwoRefs(p0, list, oy, y.class, "6")) {
          d uod = b.a(0x2c71dec4);
          List list1 = Collections.emptyList();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             Iterator iterator1 = uod.i(iterator.next()).iterator();
             while (iterator1.hasNext()) {
                a$a uoa = iterator1.next();
                a$a c = uoa.c;
                if (c - uoa.d) {
                   uoa.d = c;
                   if (list1.isEmpty()) {
                      Integer[] integerArray = new Integer[]{Integer.valueOf(uoa.g)};
                      list1 = Lists.e(integerArray);
                   }else {
                      list1.add(Integer.valueOf(uoa.g));
                   }
                }
             }
          }
          int i = list1.isEmpty() ^ 1;
          Object[] objArray = new Object[]{p0,Boolean.valueOf(i),list1};
          f2.b("NotifyDispatcher", "fakeConsumeRanges: [%1$s] fake consume red dots %2$s, %3$s", objArray);
          if (i) {
             b = oy.b;
             if (b != null) {
                b.onNext(list1);
             }
          }
       }
       return;
    }
    public static void g(String p0,Integer[] p1){
       y b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, z.class, "15")) {
          return;
       }
       y oy = b.a(-211346462);
       List list = Arrays.asList(p1);
       Objects.requireNonNull(oy);
       if (!PatchProxy.applyVoidTwoRefs(p0, list, oy, y.class, "5")) {
          d uod = b.a(0x2c71dec4);
          List list1 = Collections.emptyList();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             a$a uoa = uod.c(iterator.next().intValue());
             a$a c = uoa.c;
             if (c - uoa.d) {
                uoa.d = c;
                if (list1.isEmpty()) {
                   if (list.size() == 1) {
                      list1 = list;
                   }else {
                      Integer[] integerArray = new Integer[]{Integer.valueOf(uoa.g)};
                      list1 = Lists.e(integerArray);
                   }
                }else {
                   list1.add(Integer.valueOf(uoa.g));
                }
             }
          }
          Object[] objArray = new Object[]{p0,Boolean.valueOf((list1.isEmpty() ^ 1)),list};
          f2.b("NotifyDispatcher", "fakeConsumeTypes: [%1$s] fake consume red dots %2$s, %3$s", objArray);
          if (!list1.isEmpty()) {
             b = oy.b;
             if (b != null) {
                b.onNext(list1);
             }
          }
       }
       return;
    }
    public static t h(String p0,List p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       y obj = PatchProxy.applyTwoRefs(p0, p1, null, z.class, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = b.a(-211346462);
       Objects.requireNonNull(obj);
       t ot = PatchProxy.applyTwoRefs(p0, p1, obj, y.class, "2");
       if (ot != patchProxyRe) {
       }else {
          ArrayMap uArrayMap = new ArrayMap(p1.size());
          ot = obj.b(p0, Collections.emptyList(), p1).filter(new n(p1, uArrayMap)).map(new e2(uArrayMap)).observeOn(d.a);
       }
       return ot;
    }
    public static t i(String p0,List p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Long obj = PatchProxy.applyTwoRefs(p0, p1, null, z.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = Long.valueOf(0);
       t ot = PatchProxy.applyThreeRefs(p0, p1, obj, null, z.class, "8");
       if (ot != patchProxyRe) {
       }else {
          ot = b.a(-211346462).a(p0, Collections.emptyList(), p1, obj.longValue());
       }
       return ot;
    }
    public static t j(String p0,Integer p1){
       Long obj = PatchProxy.applyTwoRefs(p0, p1, null, z.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Long.valueOf(0);
       t ot = PatchProxy.applyThreeRefs(p0, p1, obj, null, z.class, "2");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = z.k(p0, Collections.singletonList(p1), obj);
       }
       return ot;
    }
    public static t k(String p0,List p1,Long p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, z.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-211346462).a(p0, p1, Collections.emptyList(), p2.longValue());
    }
    public static t l(String p0,Integer p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       z oz = z.class;
       Object obj = null;
       k obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, oz, "22");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       List list = Collections.singletonList(p1);
       k obj2 = PatchProxy.applyTwoRefs(p0, list, obj, oz, "23");
       if (obj2 != patchProxyRe) {
       }else {
          obj2 = b.a(0x399cba89);
          Objects.requireNonNull(obj2);
          obj1 = k.class;
          t obj3 = PatchProxy.applyTwoRefs(p0, list, obj2, obj1, "5");
          if (obj3 != patchProxyRe) {
             obj2 = obj3;
          }else {
             obj3 = PatchProxy.applyTwoRefs(p0, list, obj2, obj1, "7");
             if (obj3 != patchProxyRe) {
             }else if(PatchProxy.applyVoid(obj, obj2, obj1, "11")){
                obj2.d = QCurrentUser.me().getId();
                if (obj2.e == null) {
                   obj2.e = PublishSubject.g();
                }
                if (obj2.a == null) {
                   obj2.a = RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new e(obj2));
                }
             }
             Object[] objArray = new Object[]{p0,list};
             f2.b("LocalNotifyDispatcher", "observeInternal: [%1$s] start observeHeartbeat red dots types:=%2$s", objArray);
             t ot = (obj2.e == null)? t.empty(): t.merge(t.just(Boolean.TRUE), obj2.e.hide().filter(new h(list, p0))).observeOn(d.c).map(new f(list));
             obj3 = ot;
             obj2 = obj3.map(g.b).observeOn(d.a);
          }
       }
       return obj2;
    }
}
