package hb2.o;
import im8.b;
import java.lang.Object;
import hb2.n;
import ks5.c;
import java.lang.Class;
import im8.e;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.Set;
import java.util.HashSet;

public final class o implements b	// class@002d50
{
    public Set a;
    public Set b;

    public void o(){
       super();
    }
    public void a(Object p0,Object p1){
       if (e.d(p1, c.class)) {
          p1 = e.b(p1, c.class);
          if (p1 != null) {
             p0.f = p1;
          }else {
             throw new IllegalArgumentException("mLiveTopPendantAssociateService ²»ÄÜÎª¿Õ");
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
       p0.f = null;
    }
    public final Set d(){
       if (this.b == null) {
          HashSet hashSet = new HashSet();
          this.b = hashSet;
          hashSet.add(c.class);
       }
       return this.b;
    }
}
