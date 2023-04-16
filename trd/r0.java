package trd.r0;
import java.lang.Object;
import java.util.Map;
import java.lang.String;
import kotlin.jvm.internal.a;
import trd.o0;
import java.util.NoSuchElementException;
import java.lang.StringBuilder;
import msd.l;
import trd.p0;
import trd.w0;
import trd.x0;

public class r0	// class@002582
{

    public void r0(){
       super();
    }
    public static final Object a(Map p0,Object p1){
       a.p(p0, "$this$getOrImplicitDefault");
       if (p0 instanceof o0) {
          return p0.r(p1);
       }
       Object obj = p0.get(p1);
       if (obj != null || p0.containsKey(p1)) {
          return obj;
       }
       throw new NoSuchElementException("Key "+p1+" is missing in the map.");
    }
    public static final Map b(Map p0,l p1){
       p0 op0;
       a.p(p0, "$this$withDefault");
       a.p(p1, "defaultValue");
       p0 = (p0 instanceof o0)? r0.b(p0.getMap(), p1): new p0(p0, p1);
       return p0;
    }
    public static final Map c(Map p0,l p1){
       x0 ox0;
       a.p(p0, "$this$withDefault");
       a.p(p1, "defaultValue");
       p0 = (p0 instanceof w0)? r0.c(p0.getMap(), p1): new x0(p0, p1);
       return p0;
    }
}
