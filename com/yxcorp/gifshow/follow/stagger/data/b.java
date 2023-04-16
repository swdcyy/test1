package com.yxcorp.gifshow.follow.stagger.data.b;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.data.i;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Collection;
import ekd.q;
import lnc.c2;
import pia.n;
import b06.d;

public final class b implements g	// class@001171
{
    public final i b;

    public void b(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, i.class, "50")) {
       }else {
          List items = p0.getItems();
          if (!q.f(items)) {
             c2[] uoc2Array = new c2[]{new n(tb, items.size(), p0)};
             d.e(items, uoc2Array);
          }
       }
       return;
    }
}
