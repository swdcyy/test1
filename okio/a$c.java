package okio.a$c;
import okio.m;
import okio.a;
import java.lang.Object;
import java.io.IOException;
import okio.o;
import java.lang.String;
import java.lang.StringBuilder;
import okio.b;
import kotlin.jvm.internal.a;
import cud.c;
import cud.l;

public final class a$c implements m	// class@0020ea
{
    public final a b;
    public final m c;

    public void a$c(a p0,m p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void close(){
       a$c tb = this.b;
       try{
          tb.enter();
          this.c.close();
          this.b.exit$jvm(true);
          return;
       }catch(java.io.IOException e0){
          throw this.b.exit$jvm(e0);
       }
    }
    public void flush(){
       a$c tb = this.b;
       try{
          tb.enter();
          this.c.flush();
          this.b.exit$jvm(true);
          return;
       }catch(java.io.IOException e0){
          throw this.b.exit$jvm(e0);
       }
    }
    public o timeout(){
       return this.b;
    }
    public String toString(){
       return "AsyncTimeout.sink\("+this.c+')';
    }
    public void write(b p0,long p1){
       a.q(p0, "source");
       c.b(p0.p(), 0, p1);
       long l = 0;
       while (p1 - l > 0) {
          b b = p0.b;
          if (b == null) {
             a.L();
          }
          while (l - (long)0x10000 < 0) {
             int i = b.c - b.b;
             l = l + (long)i;
             if (l - p1 >= 0) {
                l = p1;
                break ;
             }else {
                b = b.f;
                if (b == null) {
                   a.L();
                }
             }
          }
          a$c tb = this.b;
          try{
             tb.enter();
             this.c.write(p0, l);
             p1 = p1 - l;
             this.b.exit$jvm(true);
          }catch(java.io.IOException e8){
             throw this.b.exit$jvm(e8);
          }
       }
       return;
    }
}
