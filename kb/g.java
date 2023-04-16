package kb.g;
import ab.h;
import java.util.List;
import java.lang.Object;
import ab.e;
import ab.d;
import kb.g$a;
import java.lang.String;
import ab.d$b;

public class g implements h	// class@0024a0
{
    public final List a;
    public final boolean b;

    public void g(List p0,boolean p1){
       super();
       e.b((p0.isEmpty() ^ 0x01), "List of suppliers is empty!");
       this.a = p0;
       this.b = p1;
    }
    public static g b(List p0,boolean p1){
       return new g(p0, p1);
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof g) {
          return false;
       }
       return d.a(this.a, p0.a);
    }
    public Object get(){
       return new g$a(this);
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
