package fna.v;
import cra.c0;
import java.lang.Long;
import java.lang.Boolean;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerTag;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fna.b;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import fna.a;
import java.util.Objects;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;
import java.lang.Number;

public final class v	// class@002997
{
    public static final c0 a;

    static {
       v.a = new c0(null, Long.valueOf(0), Boolean.FALSE, GrowthCleanerTag.UNDEFINED);
    }
    public static final c0 a(){
       return v.a;
    }
    public static final void b(c0 p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, v.class, "2")) {
          return;
       }
       a.p(p0, "$this$selectTo");
       a.p(p1, "list");
       int i = (p0.g().booleanValue() && p0.e() != null)? 1: 0;
       if (!i) {
          p0 = null;
       }
       if (p0 != null) {
          p1.add(p0);
       }
       return;
    }
    public static final b c(List p0){
       c0 uoc0;
       Long longx1;
       long l1;
       Boolean uBoolean1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Iterator obj = null;
       ArrayList obj1 = PatchProxy.applyOneRefs(p0, obj, v.class, "7");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       a.p(p0, "$this$selectedRubbishAppSize");
       obj1 = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          Objects.requireNonNull(uoa);
          b uob = PatchProxy.apply(obj, uoa, a.class, "2");
          if (uob != patchProxyRe) {
          }else {
             uob = new b();
             a j = uoa.j;
             if (!j.g().booleanValue()) {
                j = obj;
             }
             Boolean uBoolean = null;
             if (j != null) {
                Long longx = j.f();
                if (longx != null) {
                   long l = longx.longValue();
                label_0068 :
                   uob.a = l;
                   j = uoa.k;
                   if (!j.g().booleanValue()) {
                      j = obj;
                   }
                   if (j != null) {
                      longx = j.f();
                      if (longx != null) {
                         l = longx.longValue();
                      label_008a :
                         uob.b = l;
                         j = uoa.l;
                         if (!j.g().booleanValue()) {
                            j = obj;
                         }
                         if (j != null) {
                            longx = j.f();
                            if (longx != null) {
                               l = longx.longValue();
                            label_00ac :
                               uob.c = l;
                               j = uoa.m;
                               ArrayList uArrayList = new ArrayList(u.Y(j, 10));
                               Iterator iterator1 = j.iterator();
                               while (iterator1.hasNext()) {
                                  uoc0 = iterator1.next();
                                  if (!uoc0.g().booleanValue()) {
                                     uoc0 = obj;
                                  }
                                  if (uoc0 != null) {
                                     longx1 = uoc0.f();
                                     if (longx1 != null) {
                                        l1 = longx1.longValue();
                                     label_00e7 :
                                        uArrayList.add(Long.valueOf(l1));
                                     }
                                  }
                                  l1 = uBoolean;
                                  goto label_00e7 ;
                               }
                               uob.d = CollectionsKt___CollectionsKt.p5(uArrayList);
                               j = uoa.n;
                               uArrayList = new ArrayList(u.Y(j, 10));
                               iterator1 = j.iterator();
                               while (iterator1.hasNext()) {
                                  uoc0 = iterator1.next();
                                  if (!uoc0.g().booleanValue()) {
                                     uoc0 = obj;
                                  }
                                  if (uoc0 != null) {
                                     longx1 = uoc0.f();
                                     if (longx1 != null) {
                                        l1 = longx1.longValue();
                                     label_012e :
                                        uArrayList.add(Long.valueOf(l1));
                                     }
                                  }
                                  l1 = uBoolean;
                                  goto label_012e ;
                               }
                               uob.e = CollectionsKt___CollectionsKt.p5(uArrayList);
                               uoa = uoa.o;
                               ArrayList uArrayList1 = new ArrayList(u.Y(uoa, 10));
                               Iterator iterator2 = uoa.iterator();
                               while (iterator2.hasNext()) {
                                  c0 uoc01 = iterator2.next();
                                  if (!uoc01.g().booleanValue()) {
                                     uoc01 = obj;
                                  }
                                  if (uoc01 != null) {
                                     Long longx2 = uoc01.f();
                                     if (longx2 != null) {
                                        l = longx2.longValue();
                                     label_0175 :
                                        uArrayList1.add(Long.valueOf(l));
                                     }
                                  }
                                  l = uBoolean;
                                  goto label_0175 ;
                               }
                               uob.f = CollectionsKt___CollectionsKt.p5(uArrayList1);
                            }
                         }
                         uBoolean1 = uBoolean;
                         goto label_00ac ;
                      }
                   }
                   uBoolean1 = uBoolean;
                   goto label_008a ;
                }
             }
             uBoolean1 = uBoolean;
             goto label_0068 ;
          }
          obj1.add(uob);
       }
       b uob1 = new b();
       ArrayList uArrayList2 = new ArrayList(u.Y(obj1, 10));
       obj = obj1.iterator();
       while (obj.hasNext()) {
          uArrayList2.add(Long.valueOf(obj.next().a));
       }
       uob1.a = CollectionsKt___CollectionsKt.p5(uArrayList2);
       uArrayList2 = new ArrayList(u.Y(obj1, 10));
       obj = obj1.iterator();
       while (obj.hasNext()) {
          uArrayList2.add(Long.valueOf(obj.next().b));
       }
       uob1.b = CollectionsKt___CollectionsKt.p5(uArrayList2);
       uArrayList2 = new ArrayList(u.Y(obj1, 10));
       obj = obj1.iterator();
       while (obj.hasNext()) {
          uArrayList2.add(Long.valueOf(obj.next().c));
       }
       uob1.c = CollectionsKt___CollectionsKt.p5(uArrayList2);
       uArrayList2 = new ArrayList(u.Y(obj1, 10));
       obj = obj1.iterator();
       while (obj.hasNext()) {
          uArrayList2.add(Long.valueOf(obj.next().d));
       }
       uob1.d = CollectionsKt___CollectionsKt.p5(uArrayList2);
       uArrayList2 = new ArrayList(u.Y(obj1, 10));
       obj = obj1.iterator();
       while (obj.hasNext()) {
          uArrayList2.add(Long.valueOf(obj.next().e));
       }
       uob1.e = CollectionsKt___CollectionsKt.p5(uArrayList2);
       uArrayList2 = new ArrayList(u.Y(obj1, 10));
       Iterator iterator3 = obj1.iterator();
       while (iterator3.hasNext()) {
          uArrayList2.add(Long.valueOf(iterator3.next().f));
       }
       uob1.f = CollectionsKt___CollectionsKt.p5(uArrayList2);
       return uob1;
    }
    public static final void d(List p0,boolean p1){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, ov, "6")) {
          return;
       }
       a.p(p0, "$this$isSelectAll");
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          iterator.next().i(Boolean.valueOf(p1));
       }
       return;
    }
    public static final long e(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, v.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       a.p(p0, "$this$totalSize");
       obj = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj.add(Long.valueOf(iterator.next().f().longValue()));
       }
       return CollectionsKt___CollectionsKt.p5(obj);
    }
}
