package com.yxcorp.gifshow.prettify.filter.repo.b;
import java.lang.Object;
import d1c.c;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import e1c.q;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;

public final class b	// class@001154
{

    public void b(){
       super();
    }
    public static FilterConfig a(c p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return null;
       }else {
          List list = PatchProxy.applyOneRefs(p0, null, uob, "1");
          if (list != PatchProxyResult.class) {
          }else {
             p0.init();
             list = p0.getFilters();
          }
          return y.y(list, new q(p1)).orNull();
       }
    }
}
