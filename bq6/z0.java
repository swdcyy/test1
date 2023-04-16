package bq6.z0;
import erd.o;
import bq6.p2;
import l85.c;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import l85.b;
import com.kwai.middleware.azeroth.network.EmptyResponse;
import brd.t;

public final class z0 implements o	// class@0005d4
{
    public final p2 b;
    public final c c;

    public void z0(p2 p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       this.b.m(2, p0);
       b.a(this.c.b());
       return t.just(new EmptyResponse());
    }
}
