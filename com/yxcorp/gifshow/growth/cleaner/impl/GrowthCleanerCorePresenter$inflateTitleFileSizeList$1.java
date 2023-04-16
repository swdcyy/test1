package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$inflateTitleFileSizeList$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.List;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCategory;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.util.Iterator;
import java.lang.Iterable;
import fna.a;
import fna.v;

public final class GrowthCleanerCorePresenter$inflateTitleFileSizeList$1 extends Lambda implements l	// class@001326
{
    public final List $appList;
    public final GrowthCleanerCategory $category;

    public void GrowthCleanerCorePresenter$inflateTitleFileSizeList$1(List p0,GrowthCleanerCategory p1){
       this.$appList = p0;
       this.$category = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(GrowthCleanerCorePresenter$inflateTitleFileSizeList$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GrowthCleanerCorePresenter$inflateTitleFileSizeList$1.class, "1")) {
          return;
       }
       Iterator iterator = this.$appList.iterator();
       while (iterator.hasNext()) {
          v.d(this.$category.filterFileSizeList(iterator.next()), p0);
       }
       return;
    }
}
