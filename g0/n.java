package g0.n;
import java.lang.Object;
import java.util.Arrays;

public class n	// class@00202e
{
    public int a;
    public boolean b;
    public boolean c;
    public byte d;
    public byte[] e;
    public boolean f;
    public static final n g;
    public static final n h;
    public static final n i;
    public static final n j;
    public static final n k;
    public static final n l;
    public static final n m;
    public static final n n;
    public static final n o;
    public static final n p;
    public static final n q;
    public static final boolean r;

    static {
       n on = new n().c(0);
       n.g = on;
       n.h = on.b();
       on = new n().c(1);
       n.i = on;
       n.j = on.b();
       on = new n().c(2);
       n.k = on;
       n.l = on.b();
       on = new n();
       n.m = on;
       on.f = true;
       on = new n().d().c(2);
       n.n = on;
       n.o = on.c(2);
       n.p = on.c(1);
       n.q = on.c(0);
    }
    public void n(){
       super();
       this.a = 2;
    }
    public void n(n p0){
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.e;
    }
    public boolean a(){
       boolean b = (this.d != null)? true: false;
       return b;
    }
    public n b(){
       n on = new n(this);
       on.b = true;
       return on;
    }
    public n c(int p0){
       n on = new n(this);
       on.a = p0;
       return on;
    }
    public n d(){
       n on = new n(this);
       on.c = true;
       return on;
    }
    public n e(){
       if (this.c == null && !this.a()) {
          return this.d();
       }
       return this;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof n) {
          return false;
       }
       if (this.a != p0.a || (this.b != p0.b || (this.c != p0.c || (this.d != p0.d || (!Arrays.equals(this.e, p0.e) || this.f != p0.f))))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return (((((((((((1147 + this.a) * 37) + (this.b ^ 0x01)) * 37) + (this.c ^ 0x01)) * 37) + this.d) * 37) + Arrays.hashCode(this.e)) * 37) + (this.f ^ 0x01));
    }
}
