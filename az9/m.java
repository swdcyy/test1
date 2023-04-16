package az9.m;
import lnc.c3$a;
import az9.i0;
import java.lang.Object;
import brd.t;
import java.util.Objects;
import az9.y;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import qp7.b;

public final class m implements c3$a	// class@000333
{
    public final i0 a;

    public void m(i0 p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       m ta = this.a;
       Objects.requireNonNull(ta);
       ta.j(p0.subscribe(y.b, Functions.e));
    }
}
