package ftd.j0;
import asd.a;
import ftd.j0$a;
import nsd.u;
import java.lang.String;
import kotlin.coroutines.CoroutineContext$b;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class j0 extends a	// class@000e9a
{
    public final String b;
    public static final j0$a c;

    static {
       j0.c = new j0$a(null);
    }
    public void j0(String p0){
       super(j0.c);
       this.b = p0;
    }
    public static j0 x(j0 p0,String p1,int p2,Object p3){
       j0 b;
       if (p2 & 0x01) {
          b = p0.b;
       }
       return p0.v(b);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof j0 && a.g(this.b, p0.b))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       j0 tb = this.b;
       int i = (tb != null)? tb.hashCode(): 0;
       return i;
    }
    public String toString(){
       return "CoroutineName\("+this.b+')';
    }
    public final String u(){
       return this.b;
    }
    public final j0 v(String p0){
       return new j0(p0);
    }
    public final String y(){
       return this.b;
    }
}
