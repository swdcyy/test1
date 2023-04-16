package ftd.i1;
import ftd.g1;
import java.lang.Thread;
import ftd.h1$c;
import ftd.p0;
import ftd.h1;
import ftd.j3;
import ftd.k3;
import java.util.concurrent.locks.LockSupport;

public abstract class i1 extends g1	// class@00164b
{

    public void i1(){
       super();
    }
    public abstract Thread p0();
    public final void r0(long p0,h1$c p1){
       p0.i.B0(p0, p1);
    }
    public final void s0(){
       Thread thread = this.p0();
       if (Thread.currentThread() != thread) {
          j3 oj3 = k3.b();
          if (oj3 != null) {
             oj3.h(thread);
          }else {
             LockSupport.unpark(thread);
          }
       }
       return;
    }
}
