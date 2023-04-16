package atd.a;
import zsd.i;
import java.lang.String;
import zsd.h;
import java.lang.Object;
import kotlin.jvm.internal.a;
import zsd.j;
import java.lang.UnsupportedOperationException;

public final class a	// class@000238
{

    public static final h a(i p0,String p1){
       a.p(p0, "$this$get");
       a.p(p1, "name");
       if (!p0 instanceof j) {
          p0 = null;
       }
       if (p0 != null) {
          return p0.get(p1);
       }else {
          throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
       }
    }
}
