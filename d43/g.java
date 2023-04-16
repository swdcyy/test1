package d43.g;
import im8.b;
import java.lang.Object;
import d43.a;
import t43.m$h;
import java.lang.Class;
import im8.e;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.Set;
import java.util.HashSet;

public final class g implements b	// class@002446
{
    public Set a;
    public Set b;

    public void g(){
       super();
    }
    public void a(Object p0,Object p1){
       if (e.d(p1, m$h.class)) {
          p1 = e.b(p1, m$h.class);
          if (p1 != null) {
             p0.f = p1;
          }else {
             throw new IllegalArgumentException("mGamePanelControlService ²»ÄÜÎª¿Õ");
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
          hashSet.add(m$h.class);
       }
       return this.b;
    }
}
