package com.kuaishou.commercial.splash.n;
import brd.w;
import com.kuaishou.commercial.splash.q;
import java.lang.Object;
import brd.y;
import java.util.Objects;
import yy.n0;
import java.lang.Runnable;
import ekd.k1;

public final class n implements w	// class@0015b5
{
    public final q b;

    public void n(q p0){
       this.b = p0;
    }
    public final void subscribe(y p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       k1.o(new n0(tb));
    }
}
