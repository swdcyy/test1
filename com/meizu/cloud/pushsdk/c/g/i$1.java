package com.meizu.cloud.pushsdk.c.g.i$1;
import java.io.InputStream;
import com.meizu.cloud.pushsdk.c.g.i;
import com.meizu.cloud.pushsdk.c.g.b;
import java.lang.Math;
import java.io.IOException;
import java.lang.String;
import com.meizu.cloud.pushsdk.c.g.m;
import com.meizu.cloud.pushsdk.c.g.o;
import java.lang.StringBuilder;
import java.lang.Object;

public class i$1 extends InputStream	// class@0014f4
{
    public final i a;

    public void i$1(i p0){
       this.a = p0;
       super();
    }
    public int available(){
       if (!i.a(this.a)) {
          return (int)Math.min(i.b(this.a).b, 0x7fffffff);
       }
       throw new IOException("closed");
    }
    public void close(){
       this.a.close();
    }
    public int read(){
       if (i.a(this.a)) {
          throw new IOException("closed");
       }
       if (!i.b(this.a).b && !i.c(this.a).b(i.b(this.a), 2048) - -1) {
          return -1;
       }
       return (i.b(this.a).f() & 0x00ff);
    }
    public int read(byte[] p0,int p1,int p2){
       if (i.a(this.a)) {
          throw new IOException("closed");
       }
       o.a((long)p0.length, (long)p1, (long)p2);
       if (!i.b(this.a).b && !i.c(this.a).b(i.b(this.a), 2048) - -1) {
          return -1;
       }
       return i.b(this.a).a(p0, p1, p2);
    }
    public String toString(){
       return this.a+".inputStream\(\)";
    }
}
