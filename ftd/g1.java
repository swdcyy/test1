package ftd.g1;
import kotlinx.coroutines.CoroutineDispatcher;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import ftd.w0;
import ltd.a;

public abstract class g1 extends CoroutineDispatcher	// class@001642
{
    public long c;
    public boolean d;
    public a e;

    public void g1(){
       super();
    }
    public static void T(g1 p0,boolean p1,int p2,Object p3){
       if (p3 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
       }
       if (p2 & 0x01) {
          p1 = false;
       }
       p0.A(p1);
       return;
    }
    public static void h0(g1 p0,boolean p1,int p2,Object p3){
       if (p3 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
       }
       if (p2 & 0x01) {
          p1 = false;
       }
       p0.g0(p1);
       return;
    }
    public final void A(boolean p0){
       long l = this.c - this.Y(p0);
       this.c = l;
       if (l > 0) {
          return;
       }
       if (this.d != null) {
          this.shutdown();
       }
       return;
    }
    public final boolean E(){
       boolean b = (this.c > 0)? true: false;
       return b;
    }
    public final long Y(boolean p0){
       long l = (p0)? 0x100000000: 1;
       return l;
    }
    public final void b0(w0 p0){
       g1 te = this.e;
       if (te != null) {
       }else {
          te = new a();
          this.e = te;
       }
       te.a(p0);
       return;
    }
    public long f0(){
       g1 te = this.e;
       long l = Long.MAX_VALUE;
       if (te != null && !te.d()) {
          l = 0;
       }
       return l;
    }
    public final void g0(boolean p0){
       this.c = this.c + this.Y(p0);
       if (!p0) {
          this.d = true;
       }
       return;
    }
    public boolean i0(){
       return this.k0();
    }
    public final boolean j0(){
       boolean b = true;
       if (this.c - this.Y(b) >= 0) {
       }else {
          b = false;
       }
       return b;
    }
    public final boolean k0(){
       g1 te = this.e;
       boolean b = (te != null)? te.d(): true;
       return b;
    }
    public long l0(){
       if (!this.n0()) {
          return Long.MAX_VALUE;
       }
       return 0;
    }
    public final boolean n0(){
       g1 te = this.e;
       if (te != null) {
          w0 ow0 = te.e();
          if (ow0 != null) {
             ow0.run();
             return true;
          }
       }
       return false;
    }
    public boolean o0(){
       return false;
    }
    public void shutdown(){
    }
}
