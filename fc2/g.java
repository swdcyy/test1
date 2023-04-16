package fc2.g;
import im8.b;
import java.lang.Object;
import fc2.f;
import pq5.c;
import java.lang.Class;
import im8.e;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.Set;
import java.util.HashSet;

public final class g implements b	// class@002932
{
    public Set a;
    public Set b;

    public void g(){
       super();
    }
    public void a(Object p0,Object p1){
       if (e.d(p1, c.class)) {
          p1 = e.b(p1, c.class);
          if (p1 != null) {
             p0.e = p1;
          }else {
             throw new IllegalArgumentException("mLiveRightPendantContainerService ²»ÄÜÎª¿Õ");
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
       p0.e = null;
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
