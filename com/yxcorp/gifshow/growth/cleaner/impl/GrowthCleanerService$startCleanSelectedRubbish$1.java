package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService$startCleanSelectedRubbish$1;
import io.reactivex.g;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService;
import java.util.ArrayList;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService$startCleanSelectedRubbish$1$1;
import java.util.Objects;
import java.util.List;
import fna.b;
import fna.v;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.lang.Iterable;
import fna.a;
import cra.c0;
import java.util.Collection;
import fna.j$d;
import msd.l;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.io.File;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerHelper;
import msd.p;
import java.lang.Long;
import fna.j$c;
import fna.j$a;

public final class GrowthCleanerService$startCleanSelectedRubbish$1 implements g	// class@00133c
{
    public final GrowthCleanerService b;
    public final ArrayList c;

    public void GrowthCleanerService$startCleanSelectedRubbish$1(GrowthCleanerService p0,ArrayList p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       Object obj = this;
       b obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, GrowthCleanerService$startCleanSelectedRubbish$1.class, str)) {
          return;
       }
       a.p(obj1, "emitter");
       GrowthCleanerService$startCleanSelectedRubbish$1 b = obj.b;
       GrowthCleanerService$startCleanSelectedRubbish$1 c = obj.c;
       GrowthCleanerService$startCleanSelectedRubbish$1$1 ostartCleanS = new GrowthCleanerService$startCleanSelectedRubbish$1$1(obj1);
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidTwoRefs(c, ostartCleanS, b, GrowthCleanerService.class, "7")) {
          obj1 = v.c(c);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          j$c obj2 = null;
          ArrayList uArrayList = PatchProxy.applyOneRefs(c, obj2, v.class, "8");
          if (uArrayList != patchProxyRe) {
          }else {
             a.p(c, "$this$selectedRubbishFileSize");
             uArrayList = new ArrayList();
             Iterator iterator1 = c.iterator();
             while (iterator1.hasNext()) {
                a uoa1 = iterator1.next();
                Objects.requireNonNull(uoa1);
                ArrayList uArrayList1 = PatchProxy.apply(obj2, uoa1, a.class, str);
                if (uArrayList1 != patchProxyRe) {
                }else {
                   uArrayList1 = new ArrayList();
                   v.b(uoa1.j, uArrayList1);
                   v.b(uoa1.k, uArrayList1);
                   v.b(uoa1.l, uArrayList1);
                   Iterator iterator2 = uoa1.m.iterator();
                   while (iterator2.hasNext()) {
                      v.b(iterator2.next(), uArrayList1);
                   }
                   iterator2 = uoa1.n.iterator();
                   while (iterator2.hasNext()) {
                      v.b(iterator2.next(), uArrayList1);
                   }
                   Iterator iterator3 = uoa1.o.iterator();
                   while (iterator3.hasNext()) {
                      v.b(iterator3.next(), uArrayList1);
                   }
                }
                uArrayList.addAll(uArrayList1);
             }
          }
          int i = uArrayList.size();
          ostartCleanS.invoke(new j$d(b, i, obj1, c));
          Iterator iterator = uArrayList.iterator();
          int i1 = 0;
          while (iterator.hasNext()) {
             j$c obj3 = iterator.next();
             int i2 = i1 + 1;
             if (i1 < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             GrowthCleanerHelper.a(obj3.e());
             obj3.h(Long.valueOf(GrowthCleanerHelper.d(obj3.e(), obj2, 2, obj2)));
             obj3 = v10;
             obj2 = v10;
             obj3 = new j$c(b, i1, i, v.c(c), obj1, c);
             ostartCleanS.invoke(obj2);
             i1 = i2;
             obj2 = 0;
          }
          j$a uoa = new j$a(b, i, v.c(c), obj1, c);
          ostartCleanS.invoke(v10);
       }
       return;
    }
}
