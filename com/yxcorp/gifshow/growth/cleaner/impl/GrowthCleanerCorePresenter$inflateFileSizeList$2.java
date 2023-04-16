package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$inflateFileSizeList$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.List;
import java.lang.Object;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerLayout$a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$inflateFileSizeList$2$a;
import java.lang.Iterable;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Iterator;
import cra.c0;
import java.io.File;
import java.lang.Number;
import java.lang.Boolean;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerTag;
import java.lang.Integer;
import fna.f;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$inflateFileSizeList$2$2$1;
import android.graphics.drawable.Drawable;
import gna.b$c;
import gna.b;

public final class GrowthCleanerCorePresenter$inflateFileSizeList$2 extends Lambda implements l	// class@001322
{
    public final List $fileSizeList;

    public void GrowthCleanerCorePresenter$inflateFileSizeList$2(List p0){
       this.$fileSizeList = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthCleanerLayout$a p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, GrowthCleanerCorePresenter$inflateFileSizeList$2.class, "1")) {
          return;
       }
       a.p(obj1, "$receiver");
       Iterator iterator = CollectionsKt___CollectionsKt.f5(obj.$fileSizeList, new GrowthCleanerCorePresenter$inflateFileSizeList$2$a()).iterator();
       while (iterator.hasNext()) {
          Object obj2 = iterator.next();
          File uFile = obj2.a();
          long l = obj2.b().longValue();
          boolean b = obj2.c().booleanValue();
          GrowthCleanerTag growthCleane = obj2.d();
          if (uFile != null) {
             String name = uFile.getName();
             a.o(name, "file.name");
             String str = name;
             GrowthCleanerLayout$a.a(p0, str, growthCleane.getShowTag(), Integer.valueOf(growthCleane.getShowTagColor()), 0, f.d(l), 0, 0, 0, b, new GrowthCleanerCorePresenter$inflateFileSizeList$2$2$1(obj2), 232, 0).t(obj2);
          }
          int i = this;
       }
       return;
    }
}
