package c.t.m.g.bx;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

public class bx	// class@000bfc
{

    public static Object a(Object p0,Object p1){
       bx.a(p1);
       if (p0 == null) {
          p0 = p1;
       }
       return p0;
    }
    public static void a(Object p0){
       Objects.requireNonNull(p0, "object is null.");
    }
}
