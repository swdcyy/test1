package com.meizu.cloud.pushsdk.c.g.h;
import com.meizu.cloud.pushsdk.c.g.c;
import com.meizu.cloud.pushsdk.c.g.l;
import com.meizu.cloud.pushsdk.c.g.b;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import com.meizu.cloud.pushsdk.c.g.m;
import java.lang.IllegalStateException;
import com.meizu.cloud.pushsdk.c.g.e;
import java.lang.Throwable;
import com.meizu.cloud.pushsdk.c.g.o;
import java.lang.StringBuilder;

public final class h implements c	// class@0014f3
{
    public final b a;
    public final l b;
    public boolean c;

    public void h(l p0){
       super(p0, new b());
    }
    public void h(l p0,b p1){
       super();
       if (p0 == null) {
          throw new IllegalArgumentException("sink == null");
       }
       this.a = p1;
       this.b = p0;
       return;
    }
    public long a(m p0){
       if (p0 == null) {
          throw new IllegalArgumentException("source == null");
       }
       long l = 0;
       long l1 = p0.b(this.a, 2048);
       while (l1 - -1) {
          l = l + l1;
          this.a();
       }
       return l;
    }
    public c a(){
       if (this.c != null) {
          throw new IllegalStateException("closed");
       }
       long l = this.a.e();
       if (l - null > 0) {
          this.b.a(this.a, l);
       }
       return this;
    }
    public void a(b p0,long p1){
       if (this.c != null) {
          throw new IllegalStateException("closed");
       }
       this.a.a(p0, p1);
       this.a();
       return;
    }
    public b b(){
       return this.a;
    }
    public c b(e p0){
       if (this.c != null) {
          throw new IllegalStateException("closed");
       }
       this.a.a(p0);
       return this.a();
    }
    public c b(String p0){
       if (this.c != null) {
          throw new IllegalStateException("closed");
       }
       this.a.a(p0);
       return this.a();
    }
    public c c(byte[] p0){
       if (this.c != null) {
          throw new IllegalStateException("closed");
       }
       this.a.b(p0);
       return this.a();
    }
    public c c(byte[] p0,int p1,int p2){
       if (this.c != null) {
          throw new IllegalStateException("closed");
       }
       this.a.b(p0, p1, p2);
       return this.a();
    }
    public void close(){
       if (this.c != null) {
          return;
       }
       h ta = this.a;
       b b = ta.b;
       if (b - null > 0) {
          this.b.a(ta, b);
       }
       this.b.close();
       this.c = true;
       if (null) {
          o.a(null);
       }
       return;
    }
    public c e(long p0){
       if (this.c != null) {
          throw new IllegalStateException("closed");
       }
       this.a.c(p0);
       return this.a();
    }
    public void flush(){
       if (this.c != null) {
          throw new IllegalStateException("closed");
       }
       h ta = this.a;
       b b = ta.b;
       if (b - null > 0) {
          this.b.a(ta, b);
       }
       this.b.flush();
       return;
    }
    public String toString(){
       return "buffer\("+this.b+"\)";
    }
}
