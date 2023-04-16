package kb.f;
import ab.h;
import java.util.List;
import java.lang.Object;
import ab.e;
import kb.c;
import kb.f$a;
import ab.d;
import java.lang.String;
import ab.d$b;

public class f implements h	// class@00249d
{
    public final List a;

    public void f(List p0){
       super();
       e.b((p0.isEmpty() ^ 0x01), "List of suppliers is empty!");
       this.a = p0;
    }
    public static f b(List p0){
       return new f(p0);
    }
    public c c(){
       return new f$a(this);
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof f) {
          return false;
       }
       return d.a(this.a, p0.a);
    }
    public Object get(){
       return this.c();
    }
    public int hashCode(){
       return this.a.hashCode();
    }
    public String toString(){
       d$b uob = d.c(this);
       uob.b("list", this.a);
       return uob.toString();
    }
}
