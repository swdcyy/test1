package com.kuaishou.krn.delegate.j;
import erd.g;
import com.kuaishou.krn.delegate.k;
import java.lang.Object;
import crd.b;
import java.util.Objects;
import nj0.p;
import java.lang.Runnable;
import ekd.k1;

public final class j implements g	// class@000864
{
    public final k b;

    public void j(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       k1.o(new p(tb));
    }
}
