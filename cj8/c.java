package cj8.c;
import cj8.d;
import z0.a;
import java.lang.Object;
import java.util.Objects;
import cj8.b;

public final class c	// class@000430
{

    public static d a(d p0,a p1){
       Objects.requireNonNull(p1);
       return new b(p0, p1);
    }
    public static Object b(d p0,a p1,Object p2,Object p3){
       return p1.apply(p0.a(p2, p3));
    }
    public static Object c(d p0,a p1,Object p2,Object p3){
       return c.b(p0, p1, p2, p3);
    }
}
