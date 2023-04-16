package pk.c;
import java.lang.Object;
import ok.n;
import java.lang.Long;
import ok.k;
import java.lang.String;
import ok.j$b;
import ok.j;

public final class c	// class@00292e
{
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public void c(long p0,long p1,long p2,long p3,long p4,long p5){
       int i = this;
       long l = p0;
       long l1 = p1;
       long l2 = p2;
       long l3 = p3;
       long l4 = p4;
       long l5 = p5;
       super();
       boolean b = true;
       boolean b1 = (l >= 0)? true: false;
       n.b(b1);
       b1 = (l1 >= 0)? true: false;
       n.b(b1);
       b1 = (l2 >= 0)? true: false;
       n.b(b1);
       b1 = (l3 >= 0)? true: false;
       n.b(b1);
       b1 = (l4 >= 0)? true: false;
       n.b(b1);
       if (l5 < 0) {
          b = false;
       }
       n.b(b);
       i.a = l;
       i.b = l1;
       i.c = l2;
       i.d = l3;
       i.e = l4;
       i.f = l5;
       return;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof c && (!this.a - p0.a && (!this.b - p0.b && (!this.c - p0.c && (!this.d - p0.d && (!this.e - p0.e && !this.f - p0.f)))))) {
          b = true;
       }
    label_0038 :
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{Long.valueOf(this.a),Long.valueOf(this.b),Long.valueOf(this.c),Long.valueOf(this.d),Long.valueOf(this.e),Long.valueOf(this.f)};
       return k.b(objArray);
    }
    public String toString(){
       j$b uob = j.b(this);
       uob.b("hitCount", this.a);
       uob.b("missCount", this.b);
       uob.b("loadSuccessCount", this.c);
       uob.b("loadExceptionCount", this.d);
       uob.b("totalLoadTime", this.e);
       uob.b("evictionCount", this.f);
       return uob.toString();
    }
}
