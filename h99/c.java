package h99.c;
import im8.b;
import java.lang.Object;
import h99.b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import im8.e;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.Set;
import java.util.HashSet;

public final class c implements b	// class@00256e
{
    public Set a;
    public Set b;

    public void c(){
       super();
    }
    public void a(Object p0,Object p1){
       if (e.d(p1, QPhoto.class)) {
          p1 = e.b(p1, QPhoto.class);
          if (p1 != null) {
             p0.c = p1;
          }else {
             throw new IllegalArgumentException("mPhoto ²»ÄÜÎª¿Õ");
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
       p0.c = null;
    }
    public final Set d(){
       if (this.b == null) {
          HashSet hashSet = new HashSet();
          this.b = hashSet;
          hashSet.add(QPhoto.class);
       }
       return this.b;
    }
}
