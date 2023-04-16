package htd.g$a;
import htd.y;
import htd.a;
import htd.g;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import htd.c;
import java.util.concurrent.locks.Lock;
import qrd.l1;
import htd.p;
import htd.b;
import otd.f;
import otd.g;
import htd.z;
import ltd.o$d;
import ltd.e0;

public final class g$a extends a implements y	// class@000fca
{
    public long _subHead;
    public final ReentrantLock d;
    public final g e;

    public void g$a(g p0){
       super();
       this.e = p0;
       this.d = new ReentrantLock();
       this._subHead = 0;
    }
    public boolean C(){
       throw new IllegalStateException("Should not be used".toString());
    }
    public boolean D(){
       throw new IllegalStateException("Should not be used".toString());
    }
    public boolean T(Throwable p0){
       boolean b = super.T(p0);
       if (b) {
          g.b0(this.e, null, this, 1, null);
          g$a td = this.d;
          td.lock();
          this.m0(this.e.W());
          td.unlock();
       }
       return b;
    }
    public boolean V(){
       return false;
    }
    public boolean W(){
       boolean b = (this.j0() - this.e.W() >= 0)? true: false;
       return b;
    }
    public Object b0(){
       int i1;
       g$a td = this.d;
       td.lock();
       Object obj = this.l0();
       int i = 1;
       if (obj instanceof p) {
       }else if(obj == b.c){
          this.m0((this.j0() + 1));
          i1 = 1;
       label_0020 :
          td.unlock();
          p op = (!obj instanceof p)? null: obj;
          if (op != null) {
             this.T(op.e);
          }
          if (!this.i0()) {
             i = i1;
          }
          if (i) {
             g.b0(this.e, null, null, 3, null);
          }
          return obj;
       }
       i1 = 0;
       goto label_0020 ;
    }
    public Object c0(f p0){
       g$a td = this.d;
       td.lock();
       Object obj = this.l0();
       int i = 1;
       long l = 0;
       if (obj instanceof p) {
       }else if(obj == b.c){
          if (!p0.j()) {
             obj = g.e();
          }else {
             this.m0((this.j0() + 1));
             l = 1;
          }
       }
       td.unlock();
       p op = (!obj instanceof p)? null: obj;
       if (op != null) {
          this.T(op.e);
       }
       if (!this.i0()) {
          i = l;
       }
       if (i) {
          g.b0(this.e, null, null, 3, null);
       }
       return obj;
    }
    public final boolean i0(){
       boolean b = false;
       p op = null;
       while (this.k0() && this.d.tryLock()) {
          Object obj = this.l0();
          if (obj != b.c) {
             if (obj instanceof p) {
                op = obj;
             }else {
                z oz = this.M();
                if (oz != null && !oz instanceof p) {
                   if (oz.d(obj, op) != null) {
                      long l = this.j0() + 1;
                      this.m0(l);
                      b = true;
                      this.d.unlock();
                      oz.m(obj);
                   }
                }
             }
             this.d.unlock();
             break ;
          }
          this.d.unlock();
       }
       if (op != null) {
          this.T(op.e);
       }
       return b;
    }
    public final long j0(){
       return this._subHead;
    }
    public final boolean k0(){
       if (this.o() != null) {
          return false;
       }
       if (this.W() && this.e.o() == null) {
          return false;
       }
       return true;
    }
    public final Object l0(){
       long l = this.j0();
       p op = this.e.o();
       if (l - this.e.W() >= 0) {
          if (op == null) {
             op = this.o();
          }
          if (op == null) {
             op = b.c;
          }
          return op;
       }else {
          Object obj = this.e.R(l);
          p op1 = this.o();
          if (op1 != null) {
             return op1;
          }
          return obj;
       }
    }
    public final void m0(long p0){
       this._subHead = p0;
    }
}
