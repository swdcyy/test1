package bq6.o0;
import erd.o;
import bq6.p2;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import brd.t;

public final class o0 implements o	// class@0005a6
{
    public final p2 b;

    public void o0(p2 p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       o0 tb = this.b;
       Objects.requireNonNull(tb);
       return tb.h(new HashSet(p0));
    }
}
