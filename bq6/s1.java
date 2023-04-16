package bq6.s1;
import erd.o;
import bq6.p2;
import java.util.List;
import java.lang.Object;
import com.kwai.middleware.azeroth.network.EmptyResponse;
import brd.t;

public final class s1 implements o	// class@0005b8
{
    public final p2 b;
    public final List c;

    public void s1(p2 p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       return this.b.o(this.c);
    }
}
