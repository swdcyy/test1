package q3.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class b	// class@002959
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    public void b(boolean p0,boolean p1,boolean p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public boolean a(){
       return this.a;
    }
    public boolean b(){
       return this.c;
    }
    public boolean c(){
       return this.d;
    }
    public boolean d(){
       return this.b;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof b) {
          return false;
       }
       if (this.a != p0.a || (this.b != p0.b || (this.c != p0.c || this.d != p0.d))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       b ta = this.a;
       if (this.b != null) {
          ta = ta + 16;
       }
       if (this.c != null) {
          ta = ta + 256;
       }
       if (this.d != null) {
          ta = ta + 4096;
       }
       return ta;
    }
    public String toString(){
       Object[] objArray = new Object[]{Boolean.valueOf(this.a),Boolean.valueOf(this.b),Boolean.valueOf(this.c),Boolean.valueOf(this.d)};
       return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", objArray);
    }
}
