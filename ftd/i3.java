package ftd.i3;
import msd.l;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ftd.z1;
import java.lang.Object;
import java.lang.Thread;
import java.lang.Void;
import ftd.c1;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import qrd.l1;

public final class i3 implements l	// class@000e97
{
    public int _state;
    public final Thread b;
    public c1 c;
    public final z1 d;
    public static final AtomicIntegerFieldUpdater e;

    static {
       i3.e = AtomicIntegerFieldUpdater.newUpdater(i3.class, "_state");
    }
    public void i3(z1 p0){
       super();
       this.d = p0;
       this._state = 0;
       this.b = Thread.currentThread();
    }
    public final void a(){
       while (true) {
          i3 t_state = this._state;
          if (t_state != null) {
             if (t_state != 2) {
                if (t_state == 3) {
                   Thread.interrupted();
                   return;
                }else {
                   this.b(t_state);
                   throw null;
                }
             }
          }else if(i3.e.compareAndSet(this, t_state, 1)){
             t_state = this.c;
             if (t_state != null) {
                t_state.dispose();
                break ;
             }
             break ;
          }
       }
       return;
    }
    public final Void b(int p0){
       throw new IllegalStateException("Illegal state "+p0.toString());
    }
    public void c(Throwable p0){
       while (true) {
          i3 t_state = this._state;
          if (t_state != null) {
             if (t_state != 1 && (t_state == 2 || t_state == 3)) {
                break ;
             }else {
                this.b(t_state);
                throw null;
             }
          }else {
             if (i3.e.compareAndSet(this, t_state, 2)) {
                this.b.interrupt();
                this._state = 3;
                return;
             }
          }
       }
       return;
    }
    public final void d(){
       this.c = this.d.L(true, true, this);
       while (true) {
          i3 t_state = this._state;
          if (t_state != null) {
             if (t_state == 2 || t_state == 3) {
                break ;
             }else {
                this.b(t_state);
                throw null;
             }
          }else {
             if (i3.e.compareAndSet(this, t_state, 0)) {
                return;
             }
             continue ;
          }
       }
       return;
    }
    public Object invoke(Object p0){
       this.c(p0);
       return l1.a;
    }
}
