package htd.h;
import htd.a;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.Math;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.util.concurrent.locks.Lock;
import htd.p;
import htd.c;
import htd.z;
import ltd.o$d;
import ltd.e0;
import qrd.l1;
import htd.b;
import otd.f;
import htd.c$d;
import ltd.b;
import ltd.o$e;
import kotlin.jvm.internal.a;
import ltd.c;
import otd.g;
import java.lang.IllegalStateException;
import htd.x;
import java.lang.Integer;
import htd.b0;
import htd.a$f;

public class h extends a	// class@000fcc
{
    public final ReentrantLock d;
    public Object[] e;
    public int f;
    public final int g;
    public int size;

    public void h(int p0){
       super();
       this.g = p0;
       int i = 0;
       int i1 = 1;
       if (p0 >= i1) {
       }else {
          i1 = 0;
       }
       if (i1) {
          this.d = new ReentrantLock();
          Object[] objArray = new Object[Math.min(p0, 8)];
          this.e = objArray;
          this.size = i;
          return;
       }else {
          throw new IllegalArgumentException("ArrayChannel capacity must be at least 1, but "+p0+" was specified".toString());
       }
    }
    public final boolean C(){
       return false;
    }
    public final boolean D(){
       boolean b = (this.size == this.g)? true: false;
       return b;
    }
    public Object F(Object p0){
       h td = this.d;
       td.lock();
       h tsize = this.size;
       p op = this.p();
       if (op != null) {
          td.unlock();
          return op;
       }else if(tsize < this.g){
          this.size = tsize + 1;
          if (tsize == null) {
             z oz = this.M();
             while (oz != null) {
                if (oz instanceof p) {
                   this.size = tsize;
                   td.unlock();
                   return oz;
                }
             }
          }
          this.i0(tsize);
          h te = this.e;
          te[((this.f + tsize) % te.length)] = p0;
          td.unlock();
          return b.a;
       }else {
          td.unlock();
          return b.b;
       }
    }
    public Object G(Object p0,f p1){
       z oz;
       h td = this.d;
       td.lock();
       h tsize = this.size;
       p op = this.p();
       if (op != null) {
          td.unlock();
          return op;
       }else if(tsize < this.g){
          this.size = tsize + 1;
          if (tsize == null) {
             while (true) {
                c$d uod = this.e(p0);
                Object obj = p1.g(uod);
                if (obj == null) {
                   this.size = tsize;
                   oz = uod.n();
                   td.unlock();
                   if (oz == null) {
                      a.L();
                      break ;
                   }
                   break ;
                }else if(obj == b.b){
                   if (obj == c.b) {
                      continue ;
                   }else if(obj == g.e() || obj instanceof p){
                      this.size = tsize;
                      td.unlock();
                      return obj;
                   }else {
                      throw new IllegalStateException("performAtomicTrySelect\(describeTryOffer\) returned "+obj.toString());
                   }
                }
             }
             oz.m(p0);
             return oz.e();
          }
          if (!p1.j()) {
             this.size = tsize;
             td.unlock();
             return g.e();
          }else {
             this.i0(tsize);
             h te = this.e;
             te[((this.f + tsize) % te.length)] = p0;
             td.unlock();
             return b.a;
          }
       }else {
          td.unlock();
          return b.b;
       }
    }
    public boolean R(x p0){
       h td = this.d;
       td.lock();
       td.unlock();
       return super.R(p0);
    }
    public final boolean V(){
       return false;
    }
    public final boolean W(){
       boolean b = (this.size == null)? true: false;
       return b;
    }
    public void Y(boolean p0){
       if (p0) {
          h td = this.d;
          td.lock();
          h tsize = this.size;
          for (int i = 0; i < tsize; i = i + 1) {
             this.e[this.f] = Integer.valueOf(0);
             int i1 = this.f + 1;
             i1 = i1 % this.e.length;
             this.f = i1;
          }
          this.size = 0;
          td.unlock();
       }
       super.Y(p0);
       return;
    }
    public Object b0(){
       h td = this.d;
       td.lock();
       h tsize = this.size;
       if (tsize == null) {
          p op = this.p();
          if (op == null) {
             op = b.c;
          }
          td.unlock();
          return op;
       }else {
          h te = this.e;
          h tf = this.f;
          object oobject = te[tf];
          object oobject1 = null;
          te[tf] = oobject1;
          this.size = tsize - 1;
          Object c = b.c;
          int i = 0;
          if (tsize == this.g) {
             object oobject2 = oobject1;
             while (true) {
                b0 uob0 = this.N();
                if (uob0 != null) {
                   if (uob0.e0(oobject1) != null) {
                      c = uob0.c0();
                      oobject1 = uob0;
                      i = 1;
                   }else {
                      oobject2 = uob0;
                   }
                }else {
                   oobject1 = oobject2;
                }
             }
          }
          if (c != b.c && !c instanceof p) {
             this.size = tsize;
             tf = this.e;
             tf[((this.f + tsize) % tf.length)] = c;
          }
          this.f = (this.f + 1) % this.e.length;
          td.unlock();
          if (i) {
             if (oobject1 == null) {
                a.L();
             }
             oobject1.b0();
          }
          return oobject;
       }
    }
    public Object c0(f p0){
       a$f uof;
       h td = this.d;
       td.lock();
       h tsize = this.size;
       if (tsize == null) {
          p op = this.p();
          if (op == null) {
             op = b.c;
          }
          td.unlock();
          return op;
       }else {
          h te = this.e;
          h tf = this.f;
          object oobject = te[tf];
          object oobject1 = null;
          te[tf] = oobject1;
          this.size = tsize - 1;
          Object c = b.c;
          if (tsize == this.g) {
             while (true) {
                uof = this.P();
                Object obj = p0.g(uof);
                if (obj == null) {
                   oobject1 = uof.n();
                   if (oobject1 == null) {
                      a.L();
                   }
                   c = oobject1.c0();
                }else if(obj == b.c){
                   if (obj == c.b) {
                      continue ;
                   }else if(obj == g.e()){
                      this.size = tsize;
                      p0[this.f] = oobject;
                      td.unlock();
                      return obj;
                   }else if(obj instanceof p){
                      oobject1 = obj;
                      c = obj;
                   }else {
                      throw new IllegalStateException("performAtomicTrySelect\(describeTryOffer\) returned "+obj.toString());
                   }
                }
                uof = 1;
             label_0087 :
                if (c != b.c && !c instanceof p) {
                   this.size = tsize;
                   h te1 = this.e;
                   te1[((this.f + tsize) % te1.length)] = c;
                }else if(!p0.j()){
                   this.size = tsize;
                   p0[this.f] = oobject;
                   td.unlock();
                   return g.e();
                }
                this.f = (this.f + 1) % this.e.length;
                td.unlock();
                if (uof) {
                   if (oobject1 == null) {
                      a.L();
                   }
                   oobject1.b0();
                   break ;
                }
                break ;
             }
             return oobject;
          }
          uof = 0;
          goto label_0087 ;
       }
    }
    public Object i(b0 p0){
       h td = this.d;
       td.lock();
       td.unlock();
       return super.i(p0);
    }
    public final void i0(int p0){
       h te = this.e;
       if (p0 >= te.length) {
          Object[] objArray = new Object[Math.min((te.length * 2), this.g)];
          for (int i = 0; i < p0; i = i + 1) {
             h te1 = this.e;
             int i1 = this.f + i;
             i1 = i1 % te1.length;
             objArray[i] = te1[i1];
          }
          this.e = objArray;
          this.f = 0;
       }
       return;
    }
    public boolean isEmpty(){
       h td = this.d;
       td.lock();
       td.unlock();
       return this.X();
    }
    public String j(){
       return "\(buffer:capacity="+this.g+",size="+this.size+')';
    }
    public final int j0(){
       return this.g;
    }
    public boolean n(){
       h td = this.d;
       td.lock();
       td.unlock();
       return super.n();
    }
    public boolean q(){
       h td = this.d;
       td.lock();
       td.unlock();
       return this.E();
    }
}
