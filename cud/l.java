package cud.l;
import cud.l$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import cud.b;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;

public final class l	// class@001442
{
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public l f;
    public l g;
    public static final l$a h;

    static {
       l.h = new l$a(null);
    }
    public void l(){
       super();
       byte[] uobyteArray = new byte[8192];
       this.a = uobyteArray;
       this.e = true;
       this.d = false;
    }
    public void l(byte[] p0,int p1,int p2,boolean p3,boolean p4){
       a.q(p0, "data");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final l a(){
       l tf = this.f;
       if (tf != this) {
       }else {
          tf = null;
       }
       l tg = this.g;
       if (tg == null) {
          a.L();
       }
       tg.f = this.f;
       tg = this.f;
       if (tg == null) {
          a.L();
       }
       tg.g = this.g;
       this.f = null;
       this.g = null;
       return tf;
    }
    public final l b(l p0){
       a.q(p0, "segment");
       p0.g = this;
       p0.f = this.f;
       l tf = this.f;
       if (tf == null) {
          a.L();
       }
       tf.g = p0;
       this.f = p0;
       return p0;
    }
    public final l c(){
       this.d = true;
       l ol = new l(this.a, this.b, this.c, true, false);
       return v0;
    }
    public final void d(l p0,int p1){
       l b;
       a.q(p0, "sink");
       if (p0.e == null) {
          throw new IllegalStateException("only owner can write".toString());
       }
       l c = p0.c;
       l ol = 8192;
       if ((c + p1) > ol) {
          if (p0.d == null) {
             b = p0.b;
             if (((c + p1) - b) <= ol) {
                int i = 0;
                b.a(p0.a, b, p0.a, i, (c - b));
                p0.c = p0.c - p0.b;
                p0.b = i;
             }else {
                throw new IllegalArgumentException();
             }
          }else {
             throw new IllegalArgumentException();
          }
       }
       b.a(this.a, this.b, p0.a, p0.c, p1);
       p0.c = p0.c + p1;
       this.b = this.b + p1;
       return;
    }
}
