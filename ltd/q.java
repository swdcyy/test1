package ltd.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ltd.r;
import msd.l;
import java.util.List;

public class q	// class@001e16
{
    public Object _cur;
    public static final AtomicReferenceFieldUpdater a;

    static {
       q.a = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_cur");
    }
    public void q(boolean p0){
       super();
       this._cur = new r(8, p0);
    }
    public final boolean a(Object p0){
       while (true) {
          q t_cur = this._cur;
          int i = t_cur.a(p0);
          r or = 1;
          if (!i) {
             return or;
          }
          if (i != or) {
             if (i != 2) {
                continue ;
             }else {
                break ;
             }
          }else {
             q.a.compareAndSet(this, t_cur, t_cur.k());
          }
       }
       return false;
    }
    public final void b(){
       q t_cur = this._cur;
       while (!t_cur.d()) {
          q.a.compareAndSet(this, t_cur, t_cur.k());
       }
       return;
    }
    public final int c(){
       return this._cur.f();
    }
    public final boolean d(){
       return this._cur.g();
    }
    public final boolean e(){
       return this._cur.h();
    }
    public final List f(l p0){
       return this._cur.i(p0);
    }
    public final Object g(){
       q t_cur = this._cur;
       Object obj = t_cur.l();
       while (obj == r.g) {
          q.a.compareAndSet(this, t_cur, t_cur.k());
       }
       return obj;
    }
}
