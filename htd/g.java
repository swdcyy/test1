package htd.g;
import htd.i;
import htd.c;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.Object;
import java.util.List;
import ltd.e;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalArgumentException;
import htd.g$a;
import java.util.concurrent.locks.Lock;
import htd.p;
import htd.b;
import qrd.l1;
import otd.f;
import otd.g;
import java.lang.Throwable;
import java.util.Iterator;
import htd.a;
import usd.q;
import htd.b0;
import ltd.o$d;
import ltd.e0;
import java.util.concurrent.CancellationException;
import htd.y;

public final class g extends c implements i	// class@000fcb
{
    public long _head;
    public int _size;
    public long _tail;
    public final ReentrantLock d;
    public final Object[] e;
    public final List f;
    public final int g;

    public void g(int p0){
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
          Object[] objArray = new Object[p0];
          this.e = objArray;
          this._head = 0;
          this._tail = 0;
          this._size = i;
          this.f = e.d();
          return;
       }else {
          throw new IllegalArgumentException("ArrayBroadcastChannel capacity must be at least 1, but "+p0+" was specified".toString());
       }
    }
    public static void b0(g p0,g$a p1,g$a p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = null;
       }
       if (p3 & 0x02) {
          p2 = null;
       }
       p0.a0(p1, p2);
       return;
    }
    public boolean C(){
       return false;
    }
    public boolean D(){
       boolean b = (this.V() >= this.g)? true: false;
       return b;
    }
    public Object F(Object p0){
       g td = this.d;
       td.lock();
       p op = this.p();
       if (op != null) {
          td.unlock();
          return op;
       }else {
          int i = this.V();
          if (i >= this.g) {
             td.unlock();
             return b.b;
          }else {
             long l = this.W();
             this.e[(int)(l % (long)this.g)] = p0;
             this.Y((i + 1));
             this.Z((l + 1));
             td.unlock();
             this.P();
             return b.a;
          }
       }
    }
    public Object G(Object p0,f p1){
       g td = this.d;
       td.lock();
       p op = this.p();
       if (op != null) {
          td.unlock();
          return op;
       }else {
          int i = this.V();
          if (i >= this.g) {
             td.unlock();
             return b.b;
          }else if(!p1.j()){
             td.unlock();
             return g.e();
          }else {
             long l = this.W();
             p1[(int)(l % (long)this.g)] = p0;
             this.Y((i + 1));
             this.Z((l + 1));
             td.unlock();
             this.P();
             return b.a;
          }
       }
    }
    public final boolean O(Throwable p0){
       boolean b = this.T(p0);
       Iterator iterator = this.f.iterator();
       while (iterator.hasNext()) {
          iterator.next().O(p0);
       }
       return b;
    }
    public final void P(){
       Iterator iterator = this.f.iterator();
       int i = 0;
       g$a uoa = null;
       while (iterator.hasNext()) {
          if (iterator.next().i0()) {
             i = 1;
          }
          uoa = 1;
       }
       if (i || uoa == null) {
          g.b0(this, null, null, 3, null);
       }
       return;
    }
    public final long Q(){
       Iterator iterator = this.f.iterator();
       long l = Long.MAX_VALUE;
       while (iterator.hasNext()) {
          l = q.v(l, iterator.next().j0());
       }
       return l;
    }
    public final Object R(long p0){
       return this.e[(int)(p0 % (long)this.g)];
    }
    public final int S(){
       return this.g;
    }
    public boolean T(Throwable p0){
       if (!super.T(p0)) {
          return false;
       }
       this.P();
       return true;
    }
    public final long U(){
       return this._head;
    }
    public final int V(){
       return this._size;
    }
    public final long W(){
       return this._tail;
    }
    public final void X(long p0){
       this._head = p0;
    }
    public final void Y(int p0){
       this._size = p0;
    }
    public final void Z(long p0){
       this._tail = p0;
    }
    public boolean a(Throwable p0){
       return this.O(p0);
    }
    public final void a0(g$a p0,g$a p1){
       object oobject = null;
       while (true) {
          g td = this.d;
          td.lock();
          if (p0 != null) {
             p0.m0(this.W());
             this.f.add(p0);
             if (!this.f.isEmpty()) {
             }else if(p1 != null){
                this.f.remove(p1);
                if (this.U() - p1.j0()) {
                   td.unlock();
                   return;
                }
             }
             long l = this.W();
             long l1 = this.U();
             long l2 = q.v(this.Q(), l);
             if (l2 - l1 <= 0) {
                td.unlock();
                return;
             }else {
                int i = this.V();
                while (true) {
                   if (l1 - l2 < 0) {
                      g tg = this.g;
                      long l3 = l1 % (long)tg;
                      this.e[(int)l3] = oobject;
                      b0 uob0 = (i >= tg)? 1: null;
                      long l4 = 1;
                      l1 = l1 + l4;
                      this.X(l1);
                      i = i - 1;
                      this.Y(i);
                      if (uob0) {
                         while (true) {
                            uob0 = this.N();
                            if (uob0 == null || uob0 instanceof p) {
                            }else {
                               if (uob0.e0(oobject) != null) {
                                  l1 = l % (long)this.g;
                                  int i1 = (int)l1;
                                  l2[i1] = uob0.c0();
                                  i = i + 1;
                                  this.Y(i);
                                  l = l + l4;
                                  this.Z(l);
                                  td.unlock();
                                  uob0.b0();
                                  this.P();
                                  object oobject1 = oobject;
                                  object oobject2 = oobject1;
                               }else {
                                  continue ;
                               }
                            }
                         }
                         td.unlock();
                         return;
                      }
                   }else {
                      goto label_00ad ;
                   }
                }
                td.unlock();
                return;
             }
          }else {
             goto label_0023 ;
          }
       }
    }
    public void b(CancellationException p0){
       this.O(p0);
    }
    public y h(){
       g$a uoa = new g$a(this);
       g.b0(this, uoa, null, 2, null);
       return uoa;
    }
    public String j(){
       return "\(buffer:capacity="+this.e.length+",size="+this.V()+')';
    }
}
