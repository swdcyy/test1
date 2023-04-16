package hv1.c$a;
import erd.c;
import hv1.c;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Set;
import fv1.d;
import java.util.Objects;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
import java.lang.Iterable;
import ls5.a;
import java.lang.Number;
import java.util.Map;
import java.lang.Integer;
import fv1.f;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.impl.LiveTempPlayPendantItemManagerImpl$grouplize$1$1;
import java.util.ListIterator;
import msd.l;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import fv1.g;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class c$a implements c	// class@002787
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public final Object a(Object p0,Object p1){
       c$a a;
       int i2;
       d obj4;
       Object obj7;
       LinkedList[] linkedListAr1;
       int i5;
       Object obj = this;
       ArrayList obj1 = p0;
       Iterator obj2 = p1;
       c uoc = c.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArrayList obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, c$a.class, "1");
       if (obj3 != patchProxyRe) {
          return obj3;
       }
       a.q(obj1, "t1");
       a.q(obj2, "t2");
       a = obj.a;
       d b = obj1.b;
       Objects.requireNonNull(a);
       obj3 = PatchProxy.applyTwoRefs(obj1, obj2, a, uoc, "7");
       if (obj3 != patchProxyRe) {
       }else {
          obj4 = obj1.a;
          i2 = obj4.size();
          LinkedList[] linkedListAr = new LinkedList[i2];
          for (int i4 = 0; i4 < i2; i4 = i4 + 1) {
             linkedListAr[i4] = new LinkedList();
          }
          obj2 = obj2.iterator();
          while (obj2.hasNext()) {
             LiveTempPlayPendantItemManagerImpl$grouplize$1$1 obj5 = obj2.next();
             String id1 = obj5.getId();
             Object obj6 = PatchProxy.applyOneRefs(id1, obj1, d.class, "2");
             if (obj6 != patchProxyRe) {
                i4 = obj6.intValue();
             }else {
                a.p(id1, "pendantId");
                Integer integer = obj1.c.get(id1);
                i4 = (integer != null)? integer.intValue(): -1;
             }
             if (i4 >= 0) {
                object oobject = linkedListAr[i4];
                p1 = new LiveTempPlayPendantItemManagerImpl$grouplize$1$1(obj4.get(i4), obj5);
                obj7 = obj5;
                linkedListAr1 = linkedListAr;
                i5 = i2;
                d uod = obj4;
                if (!PatchProxy.applyVoidThreeRefs(oobject, obj5, p1, a, c.class, "8")) {
                   ListIterator listIterator = oobject.listIterator();
                   a.o(listIterator, "listIterator\(\)");
                   while (true) {
                      if (listIterator.hasNext()) {
                         obj5 = p1;
                         if (obj5.invoke(listIterator.next()).booleanValue()) {
                            listIterator.previous();
                            listIterator.add(obj7);
                            i4 = true;
                         label_00e5 :
                            if (!i4) {
                               oobject.addLast(obj7);
                            }
                         }else {
                            p1 = obj5;
                         }
                      }else {
                         i4 = false;
                         goto label_00e5 ;
                      }
                   }
                }
                i2 = i5;
                linkedListAr = linkedListAr1;
                obj4 = uod;
             }else {
                obj7 = obj5;
                LiveLogTag lIVE_TOP_PEN = LiveLogTag.LIVE_TOP_PENDANT;
                lIVE_TOP_PEN.appendTag("LiveTempPlayPendantItemManager");
                b.T(lIVE_TOP_PEN, "grouplize", "unknown bizType", obj7.getId(), "pendant item", obj7);
                ExceptionHandler.handleCaughtException(new RuntimeException("LiveTempPlayPendantItemManager receive unknown bizType "+obj7.getId()));
             }
          }
          linkedListAr1 = linkedListAr;
          i5 = i2;
          obj3 = new ArrayList();
          int i6 = 0;
          while (i6 < i5) {
             object oobject1 = linkedListAr1[i6];
             int i7 = oobject1.isEmpty() ^ 1;
             if (i7) {
                obj3.add(oobject1);
             }
             i6 = i6 + 1;
          }
       }
       int i = 1;
       Objects.requireNonNull(a);
       obj1 = PatchProxy.applyTwoRefs(b, obj3, a, uoc, "6");
       if (obj1 != patchProxyRe) {
       }else {
          LinkedHashSet linkedHashSe = new LinkedHashSet();
          int i1 = obj3.size();
          boolean b1 = false;
          while (true) {
             if (b1 < i1) {
                Iterator iterator = b.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      g og = iterator.next();
                      Iterator iterator1 = obj3.iterator();
                      i2 = 0;
                      while (true) {
                         if (iterator1.hasNext()) {
                            a uoa = CollectionsKt___CollectionsKt.p2(iterator1.next());
                            String id = (uoa != null)? uoa.getId(): null;
                            if (a.g(id, og.a)) {
                               iterator1 = -1;
                            label_019b :
                               if (i2 != iterator1 && !linkedHashSe.contains(Integer.valueOf(i2))) {
                                  linkedHashSe.add(Integer.valueOf(i2));
                                  iterator = obj3.iterator();
                                  i2 = 0;
                                  while (iterator.hasNext()) {
                                     obj4 = iterator.next();
                                     int i3 = i2 + 1;
                                     if (i2 < 0) {
                                        CollectionsKt__CollectionsKt.W();
                                     }
                                     if (!linkedHashSe.contains(Integer.valueOf(i2))) {
                                        Iterator iterator2 = obj4.iterator();
                                        while (iterator2.hasNext()) {
                                           if (og.b.contains(iterator2.next().getId())) {
                                              iterator2.remove();
                                           }else {
                                              continue ;
                                           }
                                        }
                                     }
                                     i2 = i3;
                                  }
                                  iterator = 1;
                               }else {
                                  continue ;
                               }
                            }else {
                               i2 = i2 + 1;
                            }
                         }else {
                            iterator1 = -1;
                            i2 = -1;
                            goto label_019b ;
                         }
                      }
                   }else {
                      iterator = null;
                   }
                   if (!iterator) {
                   label_01fd :
                      obj1 = new ArrayList();
                      obj2 = obj3.iterator();
                      while (obj2.hasNext()) {
                         a uoa1 = CollectionsKt___CollectionsKt.p2(obj2.next());
                         if (uoa1 != null) {
                            obj1.add(uoa1);
                         }
                      }
                   }else {
                      b1 = b1 + 1;
                   }
                }
             }else {
                goto label_01fd ;
             }
          }
       }
       return obj1;
    }
}
