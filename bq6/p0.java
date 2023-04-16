package bq6.p0;
import erd.o;
import bq6.p2;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.lang.Iterable;
import brd.t;
import bq6.m0;

public final class p0 implements o	// class@0005aa
{
    public final p2 b;

    public void p0(p2 p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       p0 tb = this.b;
       Objects.requireNonNull(tb);
       return t.fromIterable(p0).flatMap(new m0(tb));
    }
}
