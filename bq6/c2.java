package bq6.c2;
import erd.o;
import java.util.List;
import java.lang.Object;
import com.kwai.middleware.azeroth.network.EmptyResponse;
import java.lang.Iterable;
import brd.t;

public final class c2 implements o	// class@000577
{
    public final List b;

    public void c2(List p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return t.fromIterable(this.b);
    }
}
