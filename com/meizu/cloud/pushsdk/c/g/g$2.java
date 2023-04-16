package com.meizu.cloud.pushsdk.c.g.g$2;
import com.meizu.cloud.pushsdk.c.g.m;
import com.meizu.cloud.pushsdk.c.g.n;
import java.io.InputStream;
import java.lang.Object;
import com.meizu.cloud.pushsdk.c.g.b;
import com.meizu.cloud.pushsdk.c.g.j;
import java.lang.Math;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class g$2 implements m	// class@0014f1
{
    public final n a;
    public final InputStream b;

    public void g$2(n p0,InputStream p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public long b(b p0,long p1){
       long l = 0;
       if ((v2 = p1 - l) < 0) {
          throw new IllegalArgumentException("byteCount < 0: "+p1);
       }
       if (!v2) {
          return l;
       }
       this.a.a();
       j oj = p0.c(1);
       int i = this.b.read(oj.a, oj.c, (int)Math.min(p1, (long)(oj.c - 2048)));
       if (i == -1) {
          return -1;
       }
       oj.c = oj.c + i;
       i = (long)i;
       p0.b = p0.b + i;
       return i;
    }
    public void close(){
       this.b.close();
    }
    public String toString(){
       return "source\("+this.b+"\)";
    }
}
