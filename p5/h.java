package p5.h;
import java.lang.Object;
import z1.e;
import java.lang.String;
import java.lang.StringBuilder;

public class h	// class@0028bf
{
    public Object a;
    public Object b;

    public void h(){
       super();
    }
    public static boolean a(Object p0,Object p1){
       boolean b = (p0 == p1 || (p0 != null && p0.equals(p1)))? true: false;
       return b;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof e) {
          return b;
       }
       if (h.a(p0.a, this.a) && h.a(p0.b, this.b)) {
          b = true;
       }
       return b;
    }
    public int hashCode(){
       h ta = this.a;
       int i = 0;
       int i1 = (ta == null)? 0: ta.hashCode();
       h tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 ^ i);
    }
    public String toString(){
       return "Pair{"+String.valueOf(this.a)+" "+String.valueOf(this.b)+"}";
    }
}
