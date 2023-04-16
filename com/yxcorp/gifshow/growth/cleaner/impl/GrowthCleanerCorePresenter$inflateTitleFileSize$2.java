package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$inflateTitleFileSize$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
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
import cra.c0;
import java.io.File;
import java.lang.Number;
import java.lang.Boolean;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerTag;
import fna.i;
import java.lang.Integer;
import fna.f;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$inflateTitleFileSize$2$1$1;
import android.graphics.drawable.Drawable;
import gna.b$c;
import gna.b;

public final class GrowthCleanerCorePresenter$inflateTitleFileSize$2 extends Lambda implements l	// class@001325
{
    public final List $appList;
    public final GrowthCleanerCategory $category;

    public void GrowthCleanerCorePresenter$inflateTitleFileSize$2(List p0,GrowthCleanerCategory p1){
       this.$appList = p0;
       this.$category = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthCleanerLayout$a p0){
       GrowthCleanerCorePresenter$inflateTitleFileSize$2 oinflateTitl = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, oinflateTitl, GrowthCleanerCorePresenter$inflateTitleFileSize$2.class, "1")) {
          return;
       }
       a.p(obj, "$receiver");
       Iterator iterator = oinflateTitl.$appList.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          c0 uoc0 = oinflateTitl.$category.filterFileSize(uoa);
          long l = uoc0.b().longValue();
          boolean b = uoc0.c().booleanValue();
          GrowthCleanerTag growthCleane = uoc0.d();
          if (uoc0.a() != null) {
             GrowthCleanerLayout$a.a(p0, i.a(uoa), growthCleane.getShowTag(), Integer.valueOf(growthCleane.getShowTagColor()), 0, f.d(l), 0, 0, uoa.c, b, new GrowthCleanerCorePresenter$inflateTitleFileSize$2$1$1(uoc0), 104, 0).t(uoc0);
          }
          oinflateTitl = this;
       }
       return;
    }
}
