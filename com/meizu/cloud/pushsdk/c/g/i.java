package com.meizu.cloud.pushsdk.c.g.i;
import com.meizu.cloud.pushsdk.c.g.d;
import com.meizu.cloud.pushsdk.c.g.m;
import com.meizu.cloud.pushsdk.c.g.b;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Math;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.io.InputStream;
import com.meizu.cloud.pushsdk.c.g.i$1;

public final class i implements d	// class@0014f5
{
    public final b a;
    public final m b;
    public boolean c;

    public void i(m p0){
       super(p0, new b());
    }
    public void i(m p0,b p1){
       super();
       if (p0 == null) {
          throw new IllegalArgumentException("source == null");
       }
       this.a = p1;
       this.b = p0;
       return;
    }
    public static boolean a(i p0){
       return p0.c;
    }
    public static b b(i p0){
       return p0.a;
    }
    public static m c(i p0){
       return p0.b;
    }
    public long b(b p0,long p1){
       if (p0 == null) {
          throw new IllegalArgumentException("sink == null");
       }
       i oi = null;
       if (p1 - oi < 0) {
          throw new IllegalArgumentException("byteCount < 0: "+p1);
       }
       if (this.c != null) {
          throw new IllegalStateException("closed");
       }
       i ta = this.a;
       if (!ta.b - oi && !this.b.b(ta, 2048) - -1) {
          return -1;
       }
       return this.a.b(p0, Math.min(p1, this.a.b));
    }
    public void close(){
       if (this.c != null) {
          return;
       }
       this.c = true;
       this.b.close();
       this.a.j();
       return;
    }
    public InputStream d(){
       return new i$1(this);
    }
    public String h(){
       this.a.a(this.b);
       return this.a.h();
    }
    public byte[] i(){
       this.a.a(this.b);
       return this.a.i();
    }
    public String toString(){
       return "buffer\("+this.b+"\)";
    }
}
