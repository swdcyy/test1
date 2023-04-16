package id.z$c;
import jd.e;
import id.k;
import id.z;
import id.z$b;
import jd.d;
import id.c0;
import id.z$a;
import id.i;
import id.a0;
import id.d0;
import java.lang.Throwable;
import java.lang.Object;
import com.facebook.common.references.a;
import id.b;

public class z$c extends k implements e	// class@0021d8
{
    public boolean c;
    public a d;
    public final z e;

    public void z$c(z p0,z$b p1,d p2,c0 p3,z$a p4){
       this.e = p0;
       super(p1);
       this.c = false;
       this.d = null;
       p2.c(this);
       p3.k(new a0(this, p0));
    }
    public synchronized void c(){
       this.p();
    }
    public void g(){
       if (this.o()) {
          this.n().b();
       }
       return;
    }
    public void h(Throwable p0){
       if (this.o()) {
          this.n().onFailure(p0);
       }
       return;
    }
    public void i(Object p0,int p1){
       if (b.f(p1)) {
       }else {
          _monitor_enter(this);
          if (this.c != null) {
             _monitor_exit(this);
          }else {
             z$c td = this.d;
             this.d = a.d(p0);
             _monitor_exit(this);
             a.f(td);
          }
          this.p();
       }
       return;
    }
    public boolean o(){
       _monitor_enter(this);
       if (this.c != null) {
          _monitor_exit(this);
          return false;
       }else {
          z$c td = this.d;
          this.d = null;
          this.c = true;
          _monitor_exit(this);
          a.f(td);
          return true;
       }
    }
    public final void p(){
       _monitor_enter(this);
       if (this.c != null) {
          _monitor_exit(this);
          return;
       }else {
          a uoa = a.d(this.d);
          _monitor_exit(this);
          this.n().d(uoa, 0);
          a.f(uoa);
          return;
       }
    }
}
