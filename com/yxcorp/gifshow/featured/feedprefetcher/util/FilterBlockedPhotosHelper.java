package com.yxcorp.gifshow.featured.feedprefetcher.util.FilterBlockedPhotosHelper;
import com.yxcorp.gifshow.featured.feedprefetcher.util.FilterBlockedPhotosHelper$models$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FilterBlockedPhotosHelper	// class@000fd7
{
    public static final p a;
    public static final FilterBlockedPhotosHelper b;

    static {
       FilterBlockedPhotosHelper.b = new FilterBlockedPhotosHelper();
       FilterBlockedPhotosHelper.a = s.c(FilterBlockedPhotosHelper$models$2.INSTANCE);
    }
    public void FilterBlockedPhotosHelper(){
       super();
    }
    public final List a(){
       Object obj = PatchProxy.apply(null, this, FilterBlockedPhotosHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FilterBlockedPhotosHelper.a.getValue();
    }
}
