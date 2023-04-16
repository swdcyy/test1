package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$inflateTitleFileSizeList$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter;
import java.util.List;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCategory;
import java.lang.Object;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerLayout$a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import fna.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import fna.v;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerTag;
import java.util.ArrayList;
import trd.u;
import cra.c0;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Long;
import kotlin.collections.CollectionsKt___CollectionsKt;
import fna.i;
import java.lang.Integer;
import fna.f;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$inflateFileSizeList$1;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$inflateFileSizeList$2;
import gna.b$d;
import android.graphics.drawable.Drawable;
import gna.b$a;
import gna.b;

public final class GrowthCleanerCorePresenter$inflateTitleFileSizeList$2 extends Lambda implements l	// class@001327
{
    public final List $appList;
    public final GrowthCleanerCategory $category;
    public final GrowthCleanerCorePresenter this$0;

    public void GrowthCleanerCorePresenter$inflateTitleFileSizeList$2(GrowthCleanerCorePresenter p0,List p1,GrowthCleanerCategory p2){
       this.this$0 = p0;
       this.$appList = p1;
       this.$category = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthCleanerLayout$a p0){
       GrowthCleanerCorePresenter$inflateFileSizeList$2 obj5;
       b$d uod;
       Object obj6;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, GrowthCleanerCorePresenter$inflateTitleFileSizeList$2.class, "1")) {
          return;
       }
       a.p(obj1, "$receiver");
       Iterator iterator = obj.$appList.iterator();
       while (iterator.hasNext()) {
          a obj2 = iterator.next();
          GrowthCleanerCorePresenter$inflateTitleFileSizeList$2 this$0 = obj.this$0;
          List list = obj.$category.filterFileSizeList(obj2);
          Objects.requireNonNull(this$0);
          if (PatchProxy.applyVoidThreeRefs(p0, obj2, list, this$0, GrowthCleanerCorePresenter.class, "21")) {
             continue ;
          }else {
             Object[] obj3 = null;
             ArrayList obj4 = PatchProxy.applyOneRefs(list, obj3, v.class, "3");
             int i = 10;
             if (obj4 != PatchProxyResult.class) {
             }else {
                a.p(list, "$this$maxLevelTag");
                obj4 = new ArrayList(u.Y(list, i));
                Iterator iterator3 = list.iterator();
                while (iterator3.hasNext()) {
                   obj4.add(iterator3.next().d);
                }
                Iterator iterator4 = obj4.iterator();
                if (!iterator4.hasNext()) {
                   obj6 = obj3;
                }else {
                   obj6 = iterator4.next();
                   if (iterator4.hasNext()) {
                      int level = obj6.getLevel();
                      do {
                         Object obj7 = iterator4.next();
                         int level1 = obj7.getLevel();
                         if (level < level1) {
                            obj6 = obj7;
                            level = level1;
                         }
                         if (iterator4.hasNext()) {
                            continue ;
                         }
                      } while (!iterator4.hasNext());
                   }
                }
                obj4 = obj6;
                if (obj4 == null) {
                   obj4 = GrowthCleanerTag.UNDEFINED;
                }
             }
             long l = v.e(list);
             ArrayList uArrayList = new ArrayList();
             Iterator iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                obj5 = iterator1.next();
                if (obj5.g().booleanValue()) {
                   uArrayList.add(obj5);
                }else {
                   continue ;
                }
             }
             ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, i));
             Iterator iterator2 = uArrayList.iterator();
             while (iterator2.hasNext()) {
                uArrayList1.add(Long.valueOf(iterator2.next().f().longValue()));
             }
             String str = i.a(obj2);
             String showTag = obj4.getShowTag();
             Integer integer = Integer.valueOf(obj4.getShowTagColor());
             String str1 = f.a(CollectionsKt___CollectionsKt.p5(uArrayList1), l);
             obj2 = obj2.c;
             GrowthCleanerCorePresenter$inflateFileSizeList$1 oinflateFile = new GrowthCleanerCorePresenter$inflateFileSizeList$1(list);
             obj5 = new GrowthCleanerCorePresenter$inflateFileSizeList$2(list);
             Objects.requireNonNull(p0);
             GrowthCleanerLayout$a uoa = GrowthCleanerLayout$a.class;
             i = 0;
             if (PatchProxy.isSupport(uoa)) {
                obj3 = new Object[11];
                obj3[i] = str;
                obj3[1] = showTag;
                obj3[2] = integer;
                Boolean fALSE = Boolean.FALSE;
                obj3[3] = fALSE;
                obj3[4] = str1;
                obj3[5] = null;
                obj3[6] = Boolean.TRUE;
                obj3[7] = obj2;
                obj3[8] = fALSE;
                obj3[9] = oinflateFile;
                obj3[10] = obj5;
                uod = PatchProxy.apply(obj3, obj1, uoa, "1");
                if (uod != PatchProxyResult.class) {
                label_01ab :
                   uod.t(new c0(null, Long.valueOf(l), Boolean.valueOf(uod.l()), obj4));
                }
             }
             a.p(str, "title");
             b$d uod1 = new b$d(str, showTag, str1, obj2, oinflateFile);
             uod.D(i);
             uod.r(integer);
             uod.s(i);
             uod.o(null);
             uod.p(true);
             obj1.a.u(uod);
             l1 ol1 = obj5.invoke(new GrowthCleanerLayout$a(uod));
             goto label_01ab ;
          }
       }
       return;
    }
}
