package bq6.y0;
import erd.o;
import bq6.p2;
import l85.c;
import java.lang.Object;
import java.util.List;
import brd.t;
import cp6.e;
import bq6.n2;
import erd.g;
import bq6.b2;

public final class y0 implements o	// class@0005d0
{
    public final p2 b;
    public final c c;

    public void y0(p2 p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       return this.b.b.d(p0).doOnError(new n2(this.c)).map(new b2(p0));
    }
}
