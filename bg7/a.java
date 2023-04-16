package bg7.a;
import ag7.j;
import java.lang.Object;
import java.util.HashSet;
import java.lang.Thread;
import java.util.Set;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Integer;

public class a	// class@00040e
{
    public final int a;
    public Thread b;
    public Set c;
    public int d;
    public int e;
    public j f;
    public long g;
    public long h;
    public long i;
    public long j;
    public int k;
    public int l;
    public int m;
    public final boolean n;

    public void a(j p0,long p1,boolean p2){
       super();
       this.d = 0;
       this.e = 0;
       this.k = 1;
       this.l = -1;
       this.m = 0;
       this.a = p0.a;
       this.f = p0;
       this.j = p1;
       this.n = p2;
       if (p2) {
          this.c = new HashSet();
       }
       return;
    }
    public void a(Thread p0){
       if (this.b == null) {
          this.b = p0;
          this.d = this.d + 1;
       }
       if (this.n != null && (this.b != p0 && this.c.add(p0))) {
          this.d = this.d + 1;
       }
    label_0022 :
       return;
    }
    public boolean b(){
       boolean b = (this.e >= 3)? true: false;
       return b;
    }
    public boolean c(){
       boolean b = false;
       if (this.n != null) {
          return b;
       }
       if (this.b != null) {
          b = true;
       }
       return b;
    }
    public String toString(){
       StringBuilder str = "ThreadHolder {tid="+this.a+", name=";
       a tf = this.f;
       String str1 = (tf == null)? null: tf.b;
       return str+str1+", bind="+this.c()+", failure="+this.b()+", status="+this.k+"}@"+Integer.toHexString(this.hashCode());
    }
}
