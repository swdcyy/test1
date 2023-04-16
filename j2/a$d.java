package j2.a$d;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class a$d	// class@00221d
{
    public final long a;
    public final long b;

    public void a$d(double p0){
       super((long)(p0 * 10000.00f), 0x2710);
    }
    public void a$d(long p0,long p1){
       super();
       if (!p1) {
          this.a = 0;
          this.b = 1;
          return;
       }else {
          this.a = p0;
          this.b = p1;
          return;
       }
    }
    public double a(){
       return ((double)this.a / (double)this.b);
    }
    public String toString(){
       return this.a+"/"+this.b;
    }
}
