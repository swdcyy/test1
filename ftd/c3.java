package ftd.c3;
import ftd.z1;
import ftd.w;
import ftd.b3;
import java.lang.Object;
import msd.p;
import asd.c;
import ftd.a3;
import kotlin.coroutines.CoroutineContext;
import ltd.a0;
import mtd.b;
import csd.b;
import dsd.e;

public final class c3	// class@000e79
{

    public static final w a(z1 p0){
       return new b3(p0);
    }
    public static final z1 b(z1 p0){
       return c3.a(p0);
    }
    public static w c(z1 p0,int p1,Object p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       return c3.a(p0);
    }
    public static z1 d(z1 p0,int p1,Object p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       return c3.b(p0);
    }
    public static final Object e(p p0,c p1){
       p0 = b.f(new a3(p1.getContext(), p1), new a3(p1.getContext(), p1), p0);
       if (p0 == b.h()) {
          e.c(p1);
       }
       return p0;
    }
}
