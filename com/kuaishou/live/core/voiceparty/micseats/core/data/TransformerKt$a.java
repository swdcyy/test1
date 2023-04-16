package com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt$a;
import erd.c;
import co2.f2;
import msd.a;
import java.lang.Object;
import ss2.l;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import co2.y1;
import qs2.a;
import co2.y1$a;
import ss2.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import ss2.d;
import ts2.j;
import ts2.j$b;
import ts2.j$c;
import java.util.Collection;
import ts2.d;
import ts2.e;
import java.lang.Integer;
import java.util.Map;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.micseats.core.data.MicSeatTeam;
import trd.u;
import ts2.j$a;
import ts2.j$d;

public final class TransformerKt$a implements c	// class@00157d
{
    public final f2 a;
    public final a b;

    public void TransformerKt$a(f2 p0,a p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object a(Object p0,Object p1){
       y1 oy1;
       Iterator obj3;
       String str2;
       String str3;
       StringBuilder obj4;
       d uod;
       List list1;
       ArrayList uArrayList1;
       Object obj = this;
       Object obj1 = p0;
       List obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       l ol = PatchProxy.applyTwoRefs(obj1, obj2, obj, TransformerKt$a.class, "1");
       if (ol != patchProxyRe) {
       }else {
          a.p(obj1, "<name for destructuring parameter 0>");
          a.p(obj2, "<anonymous parameter 1>");
          obj2 = obj1.a();
          int i = obj1.b();
          f2 p = obj.a.p;
          if (p != null) {
             oy1 = p.d();
             if (oy1 != null) {
             label_0041 :
                y1 oy11 = oy1;
                TransformerKt$a b = obj.b;
                List list = PatchProxy.applyThreeRefs(obj2, oy11, b, null, b.class, "1");
                if (list != patchProxyRe) {
                }else {
                   a.p(obj2, "dataList");
                   a.p(oy11, "applyingData");
                   a.p(b, "teamInfoFetcher");
                   ArrayList uArrayList = new ArrayList();
                   Iterator iterator = obj2.iterator();
                   while (iterator.hasNext()) {
                      obj3 = iterator.next();
                      int i1 = (obj3.getState() == j$b.a)? 1: 0;
                      if (i1) {
                         uArrayList.add(obj3);
                      }
                   }
                   Iterator iterator1 = uArrayList.iterator();
                   while (iterator1.hasNext()) {
                      iterator1.next().c(j$c.a);
                   }
                   if (oy11.b()) {
                      if (!obj2.isEmpty()) {
                         iterator1 = obj2.iterator();
                         while (true) {
                            if (iterator1.hasNext()) {
                               if (e.b(iterator1.next())) {
                                  list = 1;
                                  break ;
                               }
                            }
                         }
                         if (!list) {
                            String str = "麦位列表状态：";
                            String str1 = "ApplyingDataProcessor";
                            if (oy11.a() == null) {
                               str2 = str1;
                               str3 = str;
                               obj4 = PatchProxy.applyThreeRefs(obj2, oy11, b, null, b.class, "3");
                               if (obj4 != patchProxyRe) {
                                  obj2 = obj4;
                               }else {
                                  Map map = b.invoke();
                                  if (map != null) {
                                     b.P(LiveVoicePartyLogTag.MIC_SEAT.appendTag(str2), "团队信息："+map);
                                     uArrayList = new ArrayList();
                                     iterator = obj2.iterator();
                                     while (iterator.hasNext()) {
                                        obj3 = iterator.next();
                                        Object obj5 = (map.get(Integer.valueOf(obj3.getId())) == oy11.c)? 1: null;
                                        if (obj5) {
                                           uArrayList.add(obj3);
                                        }
                                     }
                                     uod = b.a(uArrayList);
                                     if (uod != null) {
                                        uod.c(j$b.a);
                                     }
                                     list1 = LiveVoicePartyLogTag.MIC_SEAT.appendTag(str2);
                                     obj4 = str3;
                                     uArrayList1 = new ArrayList(u.Y(obj2, 10));
                                     obj3 = obj2.iterator();
                                     while (obj3.hasNext()) {
                                        uArrayList1.add(obj3.next().getState().getClass().getSimpleName());
                                     }
                                     b.P(list1, obj4+uArrayList1);
                                  }
                               }
                            }else {
                               str2 = str1;
                               str3 = str;
                               Object obj6 = null;
                               Object obj7 = PatchProxy.applyTwoRefs(obj2, oy11, obj6, b.class, "2");
                               if (obj7 != patchProxyRe) {
                                  obj2 = obj7;
                               }else {
                                  Integer integer = oy11.a();
                                  iterator1 = obj2.iterator();
                                  while (iterator1.hasNext()) {
                                     Object obj8 = iterator1.next();
                                     boolean id = obj8.getId();
                                     id = (integer != null && id == integer.intValue())? true: false;
                                     if (id) {
                                        obj6 = obj8;
                                        break ;
                                     }
                                  }
                                  if (obj6 == null || obj6.getState() instanceof j$a) {
                                     uod = b.a(obj2);
                                     if (uod != null) {
                                        uod.c(j$b.a);
                                     }
                                  }else if(obj6.getState() != j$d.a){
                                     obj6.c(j$b.a);
                                  }
                                  list1 = LiveVoicePartyLogTag.MIC_SEAT.appendTag(str2);
                                  obj4 = str3;
                                  uArrayList1 = new ArrayList(u.Y(obj2, 10));
                                  obj3 = obj2.iterator();
                                  while (obj3.hasNext()) {
                                     uArrayList1.add(obj3.next().getState().getClass().getSimpleName());
                                  }
                                  b.P(list1, obj4+uArrayList1);
                               }
                            }
                         }
                      }
                      list = null;
                      goto label_00c8 ;
                   }
                label_0235 :
                   list = obj2;
                }
                ol = new l(list, i);
             }
          }
          oy1 = y1.d.a();
          goto label_0041 ;
       }
       return ol;
    }
}
