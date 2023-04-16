package com.yxcorp.gifshow.follow.stagger.post.f;
import java.lang.Runnable;
import com.yxcorp.gifshow.follow.stagger.post.g;
import java.lang.Object;
import java.util.Objects;
import r16.f;
import java.lang.Class;
import lnc.x6;
import lnc.y6;
import bja.q;
import ekd.k1;
import brd.t;
import bja.a0;
import lq.f;
import erd.g;
import crd.b;
import i46.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import bja.b0;
import com.yxcorp.gifshow.follow.stagger.post.c;

public final class f implements Runnable	// class@0011dc
{
    public final g b;

    public void f(g p0){
       this.b = p0;
    }
    public final void run(){
       f tb = this.b;
       Objects.requireNonNull(tb);
       f uof = y6.r(f.class);
       k1.o(new q(tb, uof));
       uof.a2().subscribe(new a0(tb), f.b);
       b0 uob0 = new b0(tb);
       y6.s(b.class, LoadPolicy.SILENT_IF_DOWNLOADED).R(uob0, c.b);
    }
}
