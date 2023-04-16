package bd.g;
import bd.h;
import java.lang.Object;

public class g implements h	// class@000b1a
{
    public int a;
    public boolean b;
    public boolean c;
    public static final h d;

    static {
       g.d = g.c(Integer.MAX_VALUE, true, true);
    }
    public void g(int p0,boolean p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static h c(int p0,boolean p1,boolean p2){
       return new g(p0, p1, p2);
    }
    public boolean a(){
       return this.c;
    }
    public boolean b(){
       return this.b;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof g) {
          return false;
       }
       if (this.a != p0.a || (this.b != p0.b || this.c != p0.c)) {
          b = false;
       }
       return b;
    }
    public int getQuality(){
       return this.a;
    }
    public int hashCode(){
       g ta = this.a;
       int i = 0;
       int i1 = (this.b != null)? 0x400000: 0;
       int i2 = ta ^ i1;
       if (this.c != null) {
          i = Float.MIN_NORMAL;
       }
       return (i2 ^ i);
    }
}
