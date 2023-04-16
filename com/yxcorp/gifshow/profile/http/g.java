package com.yxcorp.gifshow.profile.http.g;
import erd.g;
import com.yxcorp.gifshow.profile.http.i;
import java.lang.Object;
import com.yxcorp.gifshow.profile.model.response.PhotoCollectorListResponse;
import qvb.n0;
import java.util.Collection;
import ekd.q;
import o3c.i;
import ekd.q$b;

public final class g implements g	// class@001353
{
    public final i b;

    public void g(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       if (tb.p != null && (!tb.K() && !q.f(p0.mItems))) {
          q.c(p0.mItems, new i(tb));
       }
    label_0022 :
       return;
    }
}
