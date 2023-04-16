package com.yxcorp.gifshow.v3.editor.prettify.filter.b;
import erd.o;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.filter.model.RecoFiltersResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroup;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.prettify.v4.magic.filter.Filters;
import n0c.c$a;

public final class b implements o	// class@00116a
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object apply(Object p0){
       ArrayList uArrayList = new ArrayList();
       p0 = p0.mRecoGroupFilters.iterator();
       while (p0.hasNext()) {
          FilterGroup uFilterGroup = p0.next();
          if (q.f(uFilterGroup.getFilters())) {
             continue ;
          }else {
             uArrayList.addAll(uFilterGroup.getFilters());
          }
       }
       Filters.initExtraInfo(uArrayList);
       return new c$a(uArrayList);
    }
}
