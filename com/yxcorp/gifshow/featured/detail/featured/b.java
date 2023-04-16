package com.yxcorp.gifshow.featured.detail.featured.b;
import erd.g;
import com.yxcorp.gifshow.featured.detail.featured.t;
import n50.a$a;
import lfa.a;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import lda.q;
import java.lang.Runnable;
import yb7.p;
import wkd.b;
import gb5.a;
import java.lang.String;
import nda.a;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;

public final class b implements g	// class@000f09
{
    public final t b;
    public final a$a c;
    public final a d;

    public void b(t p0,a$a p1,a p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       p.d(new q(tb, this.c));
       b.a(0x8708467).k("featured", false);
       b.a(0x8ca227e).b(null, this.d);
       tb.B2(null);
    }
}
