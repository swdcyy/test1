package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$inflateTitleFileSize$1;
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
import cra.c0;

public final class GrowthCleanerCorePresenter$inflateTitleFileSize$1 extends Lambda implements l	// class@001323
{
    public final List $appList;
    public final GrowthCleanerCategory $category;

    public void GrowthCleanerCorePresenter$inflateTitleFileSize$1(List p0,GrowthCleanerCategory p1){
       this.$appList = p0;
       this.$category = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(GrowthCleanerCorePresenter$inflateTitleFileSize$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GrowthCleanerCorePresenter$inflateTitleFileSize$1.class, "1")) {
          return;
       }
       Iterator iterator = this.$appList.iterator();
       while (iterator.hasNext()) {
          this.$category.filterFileSize(iterator.next()).i(Boolean.valueOf(p0));
       }
       return;
    }
}
