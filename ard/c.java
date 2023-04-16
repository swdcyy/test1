package ard.c;
import java.lang.String;
import java.lang.Class;
import ard.f;
import ard.b;
import io.netty.util.internal.logging.a;
import ard.d;
import io.netty.util.internal.ThreadLocalRandom;
import java.lang.ClassLoader;
import java.lang.Object;

public abstract class c	// class@000228
{
    public static c a;

    static {
       c uoc = c.class;
       f uof = new f(true);
       uof.c(uoc.getName()).debug("Using SLF4J as the default logging framework");
       c.a = uof;
       try{
          Class.forName(ThreadLocalRandom.class.getName(), true, uoc.getClassLoader());
       }catch(java.lang.Exception e0){
       }
    }
    public void c(){
       super();
    }
    public static b a(Class p0){
       return c.b(p0.getName());
    }
    public static b b(String p0){
       return c.a.c(p0);
    }
    public abstract b c(String p0);
}
