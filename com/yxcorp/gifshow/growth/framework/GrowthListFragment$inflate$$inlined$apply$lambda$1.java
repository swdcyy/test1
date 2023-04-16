package com.yxcorp.gifshow.growth.framework.GrowthListFragment$inflate$$inlined$apply$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.framework.GrowthListFragment;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$d;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import pna.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.LinkedHashMap;
import java.lang.CharSequence;
import zsd.u;
import kotlin.text.StringsKt___StringsKt;
import java.util.Map;
import java.lang.Integer;
import java.util.Set;
import java.util.Map$Entry;
import java.util.SortedMap;
import trd.s0;
import trd.u0;
import kotlin.Pair;
import com.yxcorp.gifshow.growth.framework.GrowthListFragment$inflate$$inlined$apply$lambda$1$1;

public final class GrowthListFragment$inflate$$inlined$apply$lambda$1 extends Lambda implements l	// class@001373
{
    public final GrowthListFragment this$0;

    public void GrowthListFragment$inflate$$inlined$apply$lambda$1(GrowthListFragment p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$d p0){
       Iterator iterator;
       List obj;
       LinkedHashMap linkedHashMa1;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GrowthListFragment$inflate$$inlined$apply$lambda$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       int i = 0;
       if (this.this$0.fh().d.size() < 20) {
          iterator = this.this$0.fh().d.iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             this.this$0.ih(p0, obj, i);
             i = i1;
          }
       }else {
          j oj = this.this$0.fh();
          Objects.requireNonNull(oj);
          obj = PatchProxy.apply(null, oj, j.class, "1");
          if (obj != PatchProxyResult.class) {
          }else {
             LinkedHashMap linkedHashMa = new LinkedHashMap();
             String str1 = "#";
             iterator = oj.d.iterator();
             while (iterator.hasNext()) {
                Object obj1 = iterator.next();
                int i2 = i + 1;
                if (i < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                int i3 = u.S1(obj1) ^ true;
                if (i3) {
                   char c = StringsKt___StringsKt.y6(obj1);
                   String str2 = 122;
                   if (65 <= c && str2 >= c) {
                      String str3 = String.valueOf(c);
                      Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
                      str3 = str3.toUpperCase();
                      a.o(str3, "\(this as java.lang.String\).toUpperCase\(\)");
                      linkedHashMa1 = linkedHashMa.get(str3);
                      if (linkedHashMa1 == null) {
                         linkedHashMa1 = new LinkedHashMap();
                         linkedHashMa.put(str3, linkedHashMa1);
                      }
                   }else {
                      linkedHashMa1 = linkedHashMa.get(str1);
                      if (linkedHashMa1 == null) {
                         linkedHashMa1 = new LinkedHashMap();
                         linkedHashMa.put(str1, linkedHashMa1);
                      }
                   }
                   a.o(linkedHashMa1, "if \(subTitle in \'A\'..\'z\'¡­ther] = it }\)\n          }");
                }else {
                   LinkedHashMap linkedHashMa2 = linkedHashMa.get(str1);
                   if (linkedHashMa2 == null) {
                      linkedHashMa2 = new LinkedHashMap();
                      linkedHashMa.put(str1, linkedHashMa2);
                   }
                   linkedHashMa1 = linkedHashMa2;
                   a.o(linkedHashMa1, "map[subTitleOther] ?: \(L\x20\x02ap[subTitleOther] = it }\)\x00");
                }
                linkedHashMa1.put(obj1, Integer.valueOf(i));
                i = i2;
             }
             LinkedHashMap linkedHashMa3 = new LinkedHashMap();
             Iterator iterator1 = linkedHashMa.entrySet().iterator();
             while (iterator1.hasNext()) {
                Map$Entry uEntry = iterator1.next();
                str1 = uEntry.getKey();
                linkedHashMa3.put(str1, u0.D1(s0.q(uEntry.getValue())));
             }
             obj = u0.D1(s0.q(linkedHashMa3));
          }
          iterator = obj.iterator();
          while (iterator.hasNext()) {
             Pair pair = iterator.next();
             String str = pair.component1();
             p0.n(str, true, new GrowthListFragment$inflate$$inlined$apply$lambda$1$1(pair.component2(), this, p0));
          }
       }
       PatchProxy.onMethodExit(GrowthListFragment$inflate$$inlined$apply$lambda$1.class, "1");
       return;
    }
}
