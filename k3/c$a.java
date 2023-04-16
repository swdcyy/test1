package k3.c$a;
import android.net.Uri;
import java.lang.Object;
import java.lang.Class;

public final class c$a	// class@00246d
{
    public final Uri a;
    public final boolean b;

    public void c$a(Uri p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public Uri a(){
       return this.a;
    }
    public boolean b(){
       return this.b;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || c$a.class != p0.getClass()) {
          return false;
       }
       if (this.b != p0.b || !this.a.equals(p0.a)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return ((this.a.hashCode() * 31) + this.b);
    }
}
