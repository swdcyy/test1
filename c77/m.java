package c77.m;
import im8.b;
import java.lang.Object;
import c77.l;
import c77.q;
import c77.o;
import java.lang.Class;
import im8.e;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.Set;
import java.util.HashSet;

public final class m implements b	// class@000503
{
    public Set a;
    public Set b;

    public void m(){
       super();
    }
    public void a(Object p0,Object p1){
       o oo = o.class;
       if (e.d(p1, oo)) {
          p0.d = e.b(p1, oo);
       }
       if (e.d(p1, q.class)) {
          p1 = e.b(p1, q.class);
          if (p1 != null) {
             p0.c = p1;
          }else {
             throw new IllegalArgumentException("mLiveGzoneTabManageService ²»ÄÜÎª¿Õ");
          }
       }
       return;
    }
    public final Set b(){
       if (this.a == null) {
          this.a = new HashSet();
       }
       return this.a;
    }
    public void c(Object p0){
       p0.d = null;
       p0.c = null;
    }
    public final Set d(){
       if (this.b == null) {
          HashSet hashSet = new HashSet();
          this.b = hashSet;
          hashSet.add(q.class);
       }
       return this.b;
    }
}
