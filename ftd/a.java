package ftd.a;
import asd.c;
import ftd.k0;
import kotlinx.coroutines.JobSupport;
import kotlin.coroutines.CoroutineContext;
import nsd.u;
import java.lang.Throwable;
import ftd.h0;
import java.lang.String;
import ftd.f0;
import java.lang.StringBuilder;
import java.lang.Object;
import ftd.x;
import ftd.o0;
import ftd.z1;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import msd.l;
import ftd.y;
import ftd.g2;

public abstract class a extends JobSupport implements c, k0	// class@001632
{
    public final CoroutineContext c;
    public final CoroutineContext d;

    public void a(CoroutineContext p0,boolean p1){
       super(p1);
       this.d = p0;
       this.c = p0.plus(this);
    }
    public void a(CoroutineContext p0,boolean p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = true;
       }
       super(p0, p1);
       return;
    }
    public static void l1(){
    }
    public final void A0(Throwable p0){
       h0.b(this.c, p0);
    }
    public boolean E(){
       return super.E();
    }
    public String M0(){
       String str = f0.b(this.c);
       if (str != null) {
          return '"'+str+"\":"+super.M0();
       }
       return super.M0();
    }
    public final void S0(Object p0){
       if (p0 instanceof x) {
          this.n1(p0.a, p0.a());
       }else {
          this.o1(p0);
       }
       return;
    }
    public final void T0(){
       this.p1();
    }
    public String g0(){
       return o0.a(this)+" was cancelled";
    }
    public final CoroutineContext getContext(){
       return this.c;
    }
    public CoroutineContext getCoroutineContext(){
       return this.c;
    }
    public void k1(Object p0){
       this.Y(p0);
    }
    public final void m1(){
       this.B0(this.d.get(z1.p0));
    }
    public void n1(Throwable p0,boolean p1){
    }
    public void o1(Object p0){
    }
    public void p1(){
    }
    public final void q1(CoroutineStart p0,Object p1,p p2){
       this.m1();
       p0.invoke(p2, p1, this);
    }
    public final void r1(CoroutineStart p0,l p1){
       this.m1();
       p0.invoke(p1, this);
    }
    public final void resumeWith(Object p0){
       p0 = this.K0(y.b(p0));
       if (p0 == g2.b) {
          return;
       }
       this.k1(p0);
       return;
    }
}
