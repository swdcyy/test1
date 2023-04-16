package cud.g;
import okio.m;
import java.io.OutputStream;
import okio.o;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import okio.b;
import cud.c;
import cud.l;
import java.lang.Math;
import cud.m;

public final class g implements m	// class@00143b
{
    public final OutputStream b;
    public final o c;

    public void g(OutputStream p0,o p1){
       a.q(p0, "out");
       a.q(p1, "timeout");
       super();
       this.b = p0;
       this.c = p1;
    }
    public void close(){
       this.b.close();
    }
    public void flush(){
       this.b.flush();
    }
    public o timeout(){
       return this.c;
    }
    public String toString(){
       return "sink\("+this.b+')';
    }
    public void write(b p0,long p1){
       a.q(p0, "source");
       c.b(p0.p(), 0, p1);
       while (p1 - null > 0) {
          this.c.throwIfReached();
          b b = p0.b;
          if (b == null) {
             a.L();
          }
          int i = b.c - b.b;
          int i1 = (int)Math.min(p1, (long)i);
          this.b.write(b.a, b.b, i1);
          i = b.b + i1;
          b.b = i;
          long l = (long)i1;
          p1 = p1 - l;
          long l1 = p0.p() - l;
          p0.o(l1);
          if (b.b == b.c) {
             p0.b = b.a();
             m.a(b);
          }
       }
       return;
    }
}
