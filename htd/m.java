package htd.m;
import htd.l;
import ftd.a;
import kotlin.coroutines.CoroutineContext;
import asd.c;
import java.lang.Object;
import htd.y;
import htd.c0;
import otd.d;
import java.lang.Throwable;
import kotlinx.coroutines.JobCancellationException;
import java.lang.String;
import kotlinx.coroutines.JobSupport;
import ftd.z1;
import java.util.concurrent.CancellationException;
import otd.e;
import kotlinx.coroutines.channels.ChannelIterator;
import msd.l;
import htd.c;
import csd.b;
import qrd.l1;
import kotlin.TypeCastException;

public class m extends a implements l	// class@000fd4
{
    public final l e;

    public void m(CoroutineContext p0,l p1,boolean p2){
       super(p0, p2);
       this.e = p1;
    }
    public static Object t1(m p0,c p1){
       return p0.e.k(p1);
    }
    public static Object u1(m p0,c p1){
       return p0.e.y(p1);
    }
    public static Object v1(m p0,c p1){
       return p0.e.g(p1);
    }
    public static Object w1(m p0,Object p1,c p2){
       return p0.e.l(p1, p2);
    }
    public d B(){
       return this.e.B();
    }
    public boolean T(Throwable p0){
       return this.e.T(p0);
    }
    public final boolean a(Throwable p0){
       this.d0(new JobCancellationException(this.g0(), null, this));
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
    public void cancel(){
       this.d0(new JobCancellationException(this.g0(), null, this));
    }
    public void d0(Throwable p0){
       CancellationException uCancellatio = JobSupport.d1(this, p0, null, 1, null);
       this.e.b(uCancellatio);
       this.b0(uCancellatio);
    }
    public e f(){
       return this.e.f();
    }
    public Object g(c p0){
       return m.v1(this, p0);
    }
    public final l getChannel(){
       return this;
    }
    public boolean isEmpty(){
       return this.e.isEmpty();
    }
    public ChannelIterator iterator(){
       return this.e.iterator();
    }
    public Object k(c p0){
       return m.t1(this, p0);
    }
    public Object l(Object p0,c p1){
       return m.w1(this, p0, p1);
    }
    public boolean m(){
       return this.e.m();
    }
    public boolean n(){
       return this.e.n();
    }
    public boolean offer(Object p0){
       return this.e.offer(p0);
    }
    public Object poll(){
       return this.e.poll();
    }
    public boolean q(){
       return this.e.q();
    }
    public d s(){
       return this.e.s();
    }
    public final l s1(){
       return this.e;
    }
    public void t(l p0){
       this.e.t(p0);
    }
    public d v(){
       return this.e.v();
    }
    public final Object x1(Object p0,c p1){
       m te = this.e;
       if (te == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.AbstractSendChannel<E>");
       }
       p0 = te.K(p0, p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public Object y(c p0){
       return m.u1(this, p0);
    }
}
