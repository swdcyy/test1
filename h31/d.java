package h31.d;
import lnc.c3$a;
import h31.l;
import java.lang.Object;
import kg1.e;
import java.util.Objects;
import brd.t;
import g31.h;
import h31.k;
import erd.g;
import crd.b;

public final class d implements c3$a	// class@002611
{
    public final l a;

    public void d(l p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       d ta = this.a;
       Objects.requireNonNull(ta);
       ta.X = p0.io().subscribe(new h(p0), k.b);
    }
}
