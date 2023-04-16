package htd.r;
import htd.a;
import htd.r$a;
import nsd.u;
import ltd.e0;
import java.lang.String;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.Object;
import java.util.concurrent.locks.Lock;
import htd.p;
import htd.c;
import htd.z;
import ltd.o$d;
import qrd.l1;
import htd.b;
import otd.f;
import htd.c$d;
import ltd.b;
import ltd.o$e;
import kotlin.jvm.internal.a;
import ltd.c;
import otd.g;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import htd.x;

public class r extends a	// class@000fdf
{
    public final ReentrantLock d;
    public Object e;
    public static final e0 f;
    public static final r$a g;

    static {
       r.g = new r$a(null);
       r.f = new e0("EMPTY");
    }
    public void r(){
       super();
       this.d = new ReentrantLock();
       this.e = r.f;
    }
    public final boolean C(){
       return false;
    }
    public final boolean D(){
       return false;
    }
    public Object F(Object p0){
       r td = this.d;
       td.lock();
       p op = this.p();
       if (op != null) {
          td.unlock();
          return op;
       }else if(this.e == r.f){
          z oz = this.M();
          while (oz != null) {
             if (oz instanceof p) {
                td.unlock();
                return oz;
             }
          }
       }
       this.e = p0;
       td.unlock();
       return b.a;
    }
    public Object G(Object p0,f p1){
       z oz;
       r td = this.d;
       td.lock();
       p op = this.p();
       if (op != null) {
          td.unlock();
          return op;
       }else if(this.e == r.f){
          while (true) {
             c$d uod = this.e(p0);
             Object obj = p1.g(uod);
             if (obj == null) {
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
          td.unlock();
          return g.e();
       }else {
          this.e = p0;
          td.unlock();
          return b.a;
       }
    }
    public boolean R(x p0){
       r td = this.d;
       td.lock();
       td.unlock();
       return super.R(p0);
    }
    public final boolean V(){
       return false;
    }
    public final boolean W(){
       boolean b = (this.e == r.f)? true: false;
       return b;
    }
    public void Y(boolean p0){
       if (p0) {
          r td = this.d;
          td.lock();
          this.e = r.f;
          td.unlock();
       }
       super.Y(p0);
       return;
    }
    public Object b0(){
       r td = this.d;
       td.lock();
       r te = this.e;
       e0 f = r.f;
       if (te == f) {
          p op = this.p();
          if (op == null) {
             op = b.c;
          }
          td.unlock();
          return op;
       }else {
          this.e = f;
          td.unlock();
          return te;
       }
    }
    public Object c0(f p0){
       r td = this.d;
       td.lock();
       e0 f = r.f;
       if (this.e == f) {
          p op = this.p();
          if (op == null) {
             op = b.c;
          }
          td.unlock();
          return op;
       }else if(!p0.j()){
          td.unlock();
          return g.e();
       }else {
          r te = this.e;
          this.e = f;
          td.unlock();
          return te;
       }
    }
    public boolean isEmpty(){
       r td = this.d;
       td.lock();
       td.unlock();
       return this.X();
    }
    public String j(){
       return "\(value="+this.e+')';
    }
}
