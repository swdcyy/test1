package z1.e;
import java.lang.Object;
import z1.d;
import java.lang.String;
import java.lang.StringBuilder;

public class e	// class@0028e8
{
    public final Object a;
    public final Object b;

    public void e(Object p0,Object p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static e a(Object p0,Object p1){
       return new e(p0, p1);
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof e) {
          return b;
       }
       if (d.a(p0.a, this.a) && d.a(p0.b, this.b)) {
          b = true;
       }
       return b;
    }
    public int hashCode(){
       e ta = this.a;
       int i = 0;
       int i1 = (ta == null)? 0: ta.hashCode();
       e tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 ^ i);
    }
    public String toString(){
       return "Pair{"+this.a+" "+this.b+"}";
    }
}
