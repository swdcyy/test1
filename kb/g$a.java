package kb.g$a;
import com.facebook.datasource.AbstractDataSource;
import kb.g;
import java.util.ArrayList;
import java.lang.Object;
import kb.c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import ab.h;
import kb.g$a$a;
import ya.a;
import kb.e;
import java.util.concurrent.Executor;
import java.lang.Throwable;
import java.util.Map;

public class g$a extends AbstractDataSource	// class@00249f
{
    public ArrayList i;
    public int j;
    public int k;
    public AtomicInteger l;
    public Throwable m;
    public Map n;
    public final g o;

    public void g$a(g p0){
       this.o = p0;
       super();
       if (p0.b == null) {
          this.q();
       }
       return;
    }
    public boolean close(){
       if (this.o.b != null) {
          this.q();
       }
       _monitor_enter(this);
       boolean b = false;
       if (!super.close()) {
          _monitor_exit(this);
          return b;
       }else {
          g$a ti = this.i;
          this.i = null;
          _monitor_exit(this);
          if (ti != null) {
             for (; b < ti.size(); b = b + 1) {
                this.p(ti.get(b));
             }
          }
          return true;
       }
    }
    public synchronized Object getResult(){
       if (this.o.b != null) {
          this.q();
       }
       c uoc = this.t();
       Object result = (uoc != null)? uoc.getResult(): null;
       return result;
    }
    public synchronized boolean hasResult(){
       if (this.o.b != null) {
          this.q();
       }
       c uoc = this.t();
       boolean b = (uoc != null && uoc.hasResult())? true: false;
       return b;
    }
    public final void p(c p0){
       if (p0 != null) {
          p0.close();
       }
       return;
    }
    public final void q(){
       if (this.l != null) {
          return;
       }
       _monitor_enter(this);
       if (this.l == null) {
          int i = 0;
          this.l = new AtomicInteger(i);
          int i1 = this.o.a.size();
          this.k = i1;
          this.j = i1;
          this.i = new ArrayList(i1);
          while (i < i1) {
             c uoc = this.o.a.get(i).get();
             this.i.add(uoc);
             uoc.f(new g$a$a(this, i), a.a());
             if (!uoc.hasResult()) {
                i = i + 1;
             }
          }
       }
       _monitor_exit(this);
       return;
    }
    public synchronized final c r(int p0){
       g$a ti = this.i;
       Object obj = null;
       if (ti != null && p0 < ti.size()) {
          obj = this.i.set(p0, obj);
       }
       return obj;
    }
    public synchronized final c s(int p0){
       g$a ti = this.i;
       c uoc = (ti != null && p0 < ti.size())? this.i.get(p0): null;
       return uoc;
    }
    public synchronized final c t(){
       return this.s(this.j);
    }
    public final void u(){
       if (this.l.incrementAndGet() == this.k) {
          g$a tm = this.m;
          if (tm != null) {
             this.l(tm, this.n);
          }
       }
       return;
    }
    public void v(int p0,c p1){
       c uoc;
       _monitor_enter(this);
       if (p1 == this.t()) {
          _monitor_exit(this);
       }else if(p1 == this.s(p0)){
          uoc = this.r(p0);
          _monitor_exit(this);
       }else {
          _monitor_exit(this);
          uoc = p1;
       }
       this.p(null);
       if (!p0) {
          this.m = p1.e();
          this.n = p1.getExtras();
       }
       this.u();
       return;
    }
}
