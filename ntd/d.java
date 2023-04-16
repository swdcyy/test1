package ntd.d;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import ntd.l;
import java.lang.String;
import nsd.u;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import java.lang.Object;
import kotlinx.coroutines.CoroutineDispatcher;
import java.lang.UnsupportedOperationException;
import java.util.concurrent.Executor;
import ntd.f;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.Runnable;
import ntd.j;
import ftd.p0;
import ntd.i;
import ftd.h1;
import kotlin.coroutines.CoroutineContext;

public class d extends ExecutorCoroutineDispatcher	// class@001f7e
{
    public CoroutineScheduler d;
    public final int e;
    public final int f;
    public final long g;
    public final String h;

    public void d(int p0,int p1){
       super(p0, p1, l.e, null, 8, null);
    }
    public void d(int p0,int p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = l.c;
       }
       if (p2 & 0x02) {
          p1 = l.d;
       }
       super(p0, p1);
       return;
    }
    public void d(int p0,int p1,long p2,String p3){
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.d = this.b0();
    }
    public void d(int p0,int p1,long p2,String p3,int p4,u p5){
       if (p4 & 0x08) {
          p3 = "CoroutineScheduler";
       }
       super(p0, p1, p2, p3);
       return;
    }
    public void d(int p0,int p1,String p2){
       super(p0, p1, l.e, p2);
    }
    public void d(int p0,int p1,String p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = l.c;
       }
       if (p3 & 0x02) {
          p1 = l.d;
       }
       if (p3 & 0x04) {
          p2 = "DefaultDispatcher";
       }
       super(p0, p1, p2);
       return;
    }
    public static CoroutineDispatcher Y(d p0,int p1,int p2,Object p3){
       if (p3 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blocking");
       }
       if (p2 & 0x01) {
          p1 = l.b;
       }
       return p0.T(p1);
    }
    public Executor A(){
       return this.d;
    }
    public final CoroutineDispatcher T(int p0){
       int i = 1;
       f uof = (p0 > 0)? 1: null;
       if (uof) {
          return new f(this, p0, i);
       }else {
          throw new IllegalArgumentException("Expected positive parallelism level, but have "+p0.toString());
       }
    }
    public final CoroutineScheduler b0(){
       CoroutineScheduler uCoroutineSc = new CoroutineScheduler(this.e, this.f, this.g, this.h);
       return v6;
    }
    public void close(){
       this.d.close();
    }
    public final void f0(Runnable p0,j p1,boolean p2){
       try{
          this.d.p(p0, p1, p2);
       }catch(java.util.concurrent.RejectedExecutionException e0){
          p0.i.w0(this.d.f(p0, p1));
       }
       return;
    }
    public final CoroutineDispatcher g0(int p0){
       f uof = 1;
       int i = 0;
       d uod = (p0 > 0)? 1: null;
       if (uod) {
          if (p0 > this.e) {
             uof = null;
          }
          if (uof) {
             return new f(this, p0, i);
          }else {
             throw new IllegalArgumentException("Expected parallelism level lesser than core pool size \("+this.e+"\), but have "+p0.toString());
          }
       }else {
          throw new IllegalArgumentException("Expected positive parallelism level, but have "+p0.toString());
       }
    }
    public final void h0(){
       this.j0();
    }
    public synchronized final void i0(long p0){
       this.d.L(p0);
    }
    public synchronized final void j0(){
       this.d.L(1000);
       this.d = this.b0();
    }
    public String toString(){
       return super.toString()+"[scheduler = "+this.d+']';
    }
    public void u(CoroutineContext p0,Runnable p1){
       try{
          CoroutineScheduler.r(this.d, p1, null, false, 6, null);
       }catch(java.util.concurrent.RejectedExecutionException e0){
          p0.i.u(p0, p1);
       }
       return;
    }
    public void v(CoroutineContext p0,Runnable p1){
       try{
          CoroutineScheduler.r(this.d, p1, null, true, 2, null);
       }catch(java.util.concurrent.RejectedExecutionException e0){
          p0.i.v(p0, p1);
       }
       return;
    }
}
