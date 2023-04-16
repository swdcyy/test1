package com.meizu.cloud.pushsdk.c.g.g$1;
import com.meizu.cloud.pushsdk.c.g.l;
import com.meizu.cloud.pushsdk.c.g.n;
import java.io.OutputStream;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.g.b;
import com.meizu.cloud.pushsdk.c.g.o;
import com.meizu.cloud.pushsdk.c.g.j;
import java.lang.Math;
import com.meizu.cloud.pushsdk.c.g.k;
import java.lang.String;
import java.lang.StringBuilder;

public final class g$1 implements l	// class@0014f0
{
    public final n a;
    public final OutputStream b;

    public void g$1(n p0,OutputStream p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(b p0,long p1){
       o.a(p0.b, 0, p1);
       while (p1 - null > 0) {
          this.a.a();
          b a = p0.a;
          int i = a.c - a.b;
          int i1 = (int)Math.min(p1, (long)i);
          this.b.write(a.a, a.b, i1);
          i = a.b + i1;
          a.b = i;
          long l = (long)i1;
          p1 = p1 - l;
          long l1 = p0.b - l;
          p0.b = l1;
          if (i == a.c) {
             p0.a = a.a();
             k.a(a);
          }
       }
       return;
    }
    public void close(){
       this.b.close();
    }
    public void flush(){
       this.b.flush();
    }
    public String toString(){
       return "sink\("+this.b+"\)";
    }
}
