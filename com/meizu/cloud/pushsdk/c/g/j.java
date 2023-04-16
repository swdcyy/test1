package com.meizu.cloud.pushsdk.c.g.j;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.System;
import com.meizu.cloud.pushsdk.c.g.k;
import java.lang.IllegalStateException;

public final class j	// class@0014f6
{
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public j f;
    public j g;

    public void j(){
       super();
       byte[] uobyteArray = new byte[2048];
       this.a = uobyteArray;
       this.e = true;
       this.d = false;
    }
    public void j(j p0){
       super(p0.a, p0.b, p0.c);
    }
    public void j(byte[] p0,int p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.e = false;
       this.d = true;
    }
    public j a(){
       j tf = this.f;
       j oj = (tf != this)? tf: null;
       j tg = this.g;
       tg.f = tf;
       this.f.g = tg;
       this.f = null;
       this.g = null;
       return oj;
    }
    public j a(int p0){
       if (p0 <= 0 || p0 > (this.c - this.b)) {
          throw new IllegalArgumentException();
       }
       j oj = new j(this);
       oj.c = oj.b + p0;
       this.b = this.b + p0;
       this.g.a(oj);
       return oj;
    }
    public j a(j p0){
       p0.g = this;
       p0.f = this.f;
       this.f.g = p0;
       this.f = p0;
       return p0;
    }
    public void a(j p0,int p1){
       if (p0.e == null) {
          throw new IllegalArgumentException();
       }
       j c = p0.c;
       j oj = 2048;
       if ((c + p1) > oj) {
          if (p0.d == null) {
             j b = p0.b;
             if (((c + p1) - b) <= oj) {
                int i = 0;
                System.arraycopy(p0.a, b, p0.a, i, (c - b));
                p0.c = p0.c - p0.b;
                p0.b = i;
             }else {
                throw new IllegalArgumentException();
             }
          }else {
             throw new IllegalArgumentException();
          }
       }
       System.arraycopy(this.a, this.b, p0.a, p0.c, p1);
       p0.c = p0.c + p1;
       this.b = this.b + p1;
       return;
    }
    public void b(){
       j tg = this.g;
       if (tg == this) {
          throw new IllegalStateException();
       }
       if (tg.e == null) {
          return;
       }
       int i = this.c - this.b;
       int i1 = tg.c - 2048;
       int i2 = (tg.d != null)? 0: tg.b;
       if (i > (i1 + i2)) {
          return;
       }else {
          this.a(tg, i);
          this.a();
          k.a(this);
          return;
       }
    }
}
