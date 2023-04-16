package upd.a;
import javax.inject.Provider;
import tpd.a;
import java.lang.Object;
import upd.d;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;

public final class a implements Provider, a	// class@002601
{
    public Provider a;
    public Object b;
    public static final Object c;
    public static final boolean d;

    static {
       a.c = new Object();
    }
    public void a(Provider p0){
       super();
       this.b = a.c;
       this.a = p0;
    }
    public static a a(Provider p0){
       if (p0 instanceof a) {
          return p0;
       }
       d.b(p0);
       return new a(p0);
    }
    public static Provider b(Provider p0){
       d.b(p0);
       if (p0 instanceof a) {
          return p0;
       }
       return new a(p0);
    }
    public static Object c(Object p0,Object p1){
       IllegalStateException illegalState = (p0 != a.c)? 1: null;
       if (!illegalState || p0 == p1) {
          return p1;
       }else {
          throw new IllegalStateException("Scoped provider was invoked recursively returning different results: "+p0+" & "+p1+". This is likely due to a circular dependency.");
       }
    }
    public Object get(){
       a tb = this.b;
       Object c = a.c;
       if (tb == c) {
          _monitor_enter(this);
          tb = this.b;
          if (tb == c) {
             tb = this.a.get();
             a.c(this.b, tb);
             this.b = tb;
             this.a = null;
          }
          _monitor_exit(this);
       }
       return tb;
    }
}
