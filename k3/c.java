package k3.c;
import java.lang.Object;
import java.util.HashSet;
import android.net.Uri;
import k3.c$a;
import java.util.Set;
import java.lang.Class;

public final class c	// class@00246e
{
    public final Set a;

    public void c(){
       super();
       this.a = new HashSet();
    }
    public void a(Uri p0,boolean p1){
       this.a.add(new c$a(p0, p1));
    }
    public Set b(){
       return this.a;
    }
    public int c(){
       return this.a.size();
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || c.class != p0.getClass()) {
          return false;
       }
       return this.a.equals(p0.a);
    }
    public int hashCode(){
       return this.a.hashCode();
    }
}
