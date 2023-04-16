package g2.a$c;
import b2.e;
import g2.a;
import b2.d;
import android.os.Bundle;

public class a$c extends e	// class@002034
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public d a(int p0){
       return d.O(this.b.D(p0));
    }
    public d b(int p0){
       a k = (p0 == 2)? this.b.k: this.b.l;
       if (k == Integer.MIN_VALUE) {
          return null;
       }else {
          return this.a(k);
       }
    }
    public boolean d(int p0,int p1,Bundle p2){
       return this.b.I(p0, p1, p2);
    }
}
