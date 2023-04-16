package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerCorePresenter$inflateFileSizeList$2$a;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import cra.c0;
import java.lang.Long;
import java.lang.Comparable;
import xrd.b;

public final class GrowthCleanerCorePresenter$inflateFileSizeList$2$a implements Comparator	// class@001321
{

    public void GrowthCleanerCorePresenter$inflateFileSizeList$2$a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, GrowthCleanerCorePresenter$inflateFileSizeList$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Long.valueOf((- p0.f().longValue())), Long.valueOf((- p1.f().longValue())));
    }
}
