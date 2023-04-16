package kqd.l;
import kqd.m;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.lang.Object;
import kqd.k;
import kqd.q;
import java.util.ArrayList;
import kqd.o;
import io.netty.buffer.PoolArena;
import java.lang.String;
import java.lang.StringBuilder;
import zqd.w;

public final class l implements m	// class@001b5c
{
    public final l b;
    public final int c;
    public final int d;
    public k e;
    public l f;
    public static final Iterator g;
    public static final boolean h;

    static {
       l.g = Collections.emptyList().iterator();
    }
    public void l(l p0,int p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void b(k p0){
       if (p0.a() >= this.d) {
          this.b.b(p0);
          return;
       }else {
          p0.p = this;
          l te = this.e;
          if (te == null) {
             this.e = p0;
             p0.q = null;
             p0.r = null;
          }else {
             p0.q = null;
             p0.r = te;
             te.q = p0;
             this.e = p0;
          }
          return;
       }
    }
    public boolean d(q p0,int p1,int p2){
       l te = this.e;
       if (te == null) {
          return false;
       }
       while (true) {
          long l = te.d(p2);
          if (l < 0) {
             te = te.r;
             if (te == null) {
                return false;
             }
             continue ;
          }else {
             te.g(p0, l, p1);
             if (te.a() >= this.d) {
                this.n(te);
                this.b.b(te);
                break ;
             }
             break ;
          }
       }
       return true;
    }
    public Iterator iterator(){
       if (this.e == null) {
          return l.g;
       }
       ArrayList uArrayList = new ArrayList();
       l te = this.e;
       do {
          uArrayList.add(te);
       } while (te.r == null);
       return uArrayList.iterator();
    }
    public int k4(){
       return this.d;
    }
    public boolean l(k p0,long p1){
       int i = (int)p1;
       int i1 = (int)(p1 >> 32);
       if (i1) {
          object oobject = p0.f[p0.n(i)];
          o oo = p0.a.z(oobject.i);
          _monitor_enter(oo);
          i1 = i1 & 0x3fffffff;
          if (oobject.i != null) {
             int i3 = i1 >> 6;
             o e = oobject.e;
             e[i3] = e[i3] ^ (1 << (i1 & 0x3f));
             oobject.l = i1;
             o m = oobject.m;
             i3 = m + 1;
             oobject.m = i3;
             if (m == null) {
                oobject.e(oo);
             }else if(i3 != oobject.j || oobject.f == oobject.g){
                oobject.h = false;
                oobject.h();
                i1 = 0;
             label_0052 :
                if (i1) {
                   _monitor_exit(oo);
                }else {
                   _monitor_exit(oo);
                }
             }
          }
          i1 = 1;
          goto label_0052 ;
       }
       p0.o = p0.o + p0.k(i);
       p0.m(i, p0.f(i));
       i1 = p0.f(i) + true;
       while (i > 1) {
          int i2 = i >> 1;
          byte b = p0.o(i);
          i = i ^ 0x01;
          i = p0.o(i);
          i1 = i1 - 1;
          if (b == i1 && i == i1) {
             i = i1 - 1;
             p0.m(i2, (byte)i);
          }else if(b < i){
             b = i;
          }
          p0.m(i2, b);
          i = i2;
       }
       if (p0.a() < this.c) {
          this.n(p0);
          l tf = this.f;
          if (tf == null) {
             return false;
          }else {
             tf.b(p0);
          }
       }
       return true;
    }
    public void m(l p0){
       this.f = p0;
    }
    public final void n(k p0){
       if (p0 == this.e) {
          p0 = p0.r;
          this.e = p0;
          if (p0 != null) {
             p0.q = null;
          }
       }else {
          k r = p0.r;
          p0 = p0.q;
          p0.r = r;
          if (r != null) {
             r.q = p0;
          }
       }
       return;
    }
    public int s2(){
       return this.c;
    }
    public String toString(){
       if (this.e == null) {
          return "none";
       }
       StringBuilder str = "";
       l te = this.e;
       str = str+te;
       while (te.r != null) {
          str = str+w.a;
       }
       return str;
    }
}
