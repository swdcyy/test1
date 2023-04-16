package btd.s;
import java.lang.Object;
import nsd.u;
import kotlin.jvm.internal.a;
import java.lang.Double;
import java.lang.String;
import java.lang.StringBuilder;
import btd.d;

public final class s	// class@0002f5
{
    public final Object a;
    public final double b;

    public void s(Object p0,double p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void s(Object p0,double p1,u p2){
       super(p0, p1);
    }
    public static s d(s p0,Object p1,double p2,int p3,Object p4){
       s b;
       if (p3 & 0x01) {
          p1 = p0.a;
       }
       if (p3 & 0x02) {
          b = p0.b;
       }
       return p0.c(p1, b);
    }
    public final Object a(){
       return this.a;
    }
    public final double b(){
       return this.b;
    }
    public final s c(Object p0,double p1){
       return new s(p0, p1);
    }
    public final double e(){
       return this.b;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof s && (a.g(this.a, p0.a) && !Double.compare(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public final Object f(){
       return this.a;
    }
    public int hashCode(){
       s ta = this.a;
       int i = (ta != null)? ta.hashCode(): 0;
       long l = Double.doubleToLongBits(this.b);
       return ((i * 31) + (int)(l ^ (l >> 32)));
    }
    public String toString(){
       return "TimedValue\(value="+this.a+", duration="+d.B0(this.b)+"\)";
    }
}
