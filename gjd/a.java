package gjd.a;
import java.lang.Object;
import java.util.List;
import java.util.ArrayList;
import java.lang.Class;
import ok.k;
import java.lang.Boolean;
import java.lang.Long;

public class a	// class@000f43
{
    public Map a;
    public Map b;
    public List c;
    public boolean d;
    public long e;
    public long f;

    public void a(){
       super();
    }
    public List a(){
       if (this.c == null) {
          this.c = new ArrayList();
       }
       return this.c;
    }
    public boolean b(){
       return this.d;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || a.class != p0.getClass()) {
          return false;
       }
       if (this.d != p0.d || (this.e - p0.e || (this.f - p0.f || (!k.a(this.a, p0.a) || (!k.a(this.b, p0.b) || !k.a(this.c, p0.c)))))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{this.a,this.b,Boolean.valueOf(this.d),this.c,Long.valueOf(this.e),Long.valueOf(this.f)};
       return k.b(objArray);
    }
}
