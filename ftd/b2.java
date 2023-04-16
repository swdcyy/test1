package ftd.b2;
import ftd.w;
import kotlinx.coroutines.JobSupport;
import ftd.z1;
import qrd.l1;
import java.lang.Object;
import java.lang.Throwable;
import ftd.x;
import nsd.u;
import ftd.q;
import ftd.r;
import ftd.f2;

public class b2 extends JobSupport implements w	// class@000e72
{
    public final boolean c;

    public void b2(z1 p0){
       super(true);
       this.B0(p0);
       this.c = this.k1();
    }
    public boolean complete(){
       return this.J0(l1.a);
    }
    public boolean d(Throwable p0){
       return this.J0(new x(p0, false, 2, null));
    }
    public final boolean k1(){
       q oq = this.x0();
       if (!oq instanceof r) {
          oq = null;
       }
       if (oq != null) {
          f2 e = oq.e;
          if (e != null) {
             while (true) {
                if (e.u0()) {
                   return true;
                }
                oq = e.x0();
                if (!oq instanceof r) {
                   oq = null;
                }
                if (oq != null) {
                   e = oq.e;
                   if (e != null) {
                   }
                }
             }
          }
       }
       return false;
    }
    public boolean u0(){
       return this.c;
    }
    public boolean v0(){
       return true;
    }
}
