package htd.k;
import htd.w;
import htd.i;
import ftd.a;
import kotlin.coroutines.CoroutineContext;
import java.lang.Object;
import asd.c;
import htd.c0;
import java.lang.Throwable;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.JobCancellationException;
import java.lang.String;
import ftd.z1;
import java.util.concurrent.CancellationException;
import otd.e;
import htd.y;
import ftd.h0;
import qrd.l1;
import msd.l;
import htd.c0$a;

public class k extends a implements w, i	// class@000fd0
{
    public final i e;

    public void k(CoroutineContext p0,i p1,boolean p2){
       super(p0, p2);
       this.e = p1;
    }
    public static Object u1(k p0,Object p1,c p2){
       return p0.e.l(p1, p2);
    }
    public boolean E(){
       return super.E();
    }
    public boolean T(Throwable p0){
       this.start();
       return this.e.T(p0);
    }
    public final boolean a(Throwable p0){
       if (p0 != null) {
       }else {
          JobCancellationException jobCancellat = new JobCancellationException(this.g0(), null, this);
       }
       this.d0(p0);
       return true;
    }
    public final void b(CancellationException p0){
       if (p0 != null) {
       }else {
          JobCancellationException jobCancellat = new JobCancellationException(this.g0(), null, this);
       }
       this.d0(p0);
       return;
    }
    public void d0(Throwable p0){
       CancellationException uCancellatio = JobSupport.d1(this, p0, null, 1, null);
       this.e.b(uCancellatio);
       this.b0(uCancellatio);
    }
    public e f(){
       return this.e.f();
    }
    public c0 getChannel(){
       return this;
    }
    public y h(){
       return this.e.h();
    }
    public Object l(Object p0,c p1){
       return k.u1(this, p0, p1);
    }
    public boolean m(){
       return this.e.m();
    }
    public void n1(Throwable p0,boolean p1){
       if (!this.e.T(p0) && !p1) {
          h0.b(this.getContext(), p0);
       }
       return;
    }
    public void o1(Object p0){
       this.t1(p0);
    }
    public boolean offer(Object p0){
       return this.e.offer(p0);
    }
    public boolean q(){
       return this.e.q();
    }
    public final i s1(){
       return this.e;
    }
    public void t(l p0){
       this.e.t(p0);
    }
    public void t1(l1 p0){
       c0$a.a(this.e, null, 1, null);
    }
}
