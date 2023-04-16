package io.netty.channel.g0;
import io.netty.channel.r;
import io.netty.util.concurrent.b;
import io.netty.channel.d;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import io.netty.util.concurrent.l;
import java.util.concurrent.TimeUnit;
import io.netty.channel.e;
import io.netty.util.concurrent.f;
import io.netty.util.concurrent.g;
import java.lang.Void;
import io.netty.channel.w;
import io.netty.channel.g0$a;
import java.lang.Thread;
import java.lang.InterruptedException;
import lqd.i;

public final class g0 extends b implements r	// class@00109a
{
    public final d b;
    public final boolean c;

    public void g0(d p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public static void s0(){
       throw new IllegalStateException("void future");
    }
    public Object A(){
       return null;
    }
    public r a(Throwable p0){
       this.u0(p0);
       return this;
    }
    public l a(Throwable p0){
       this.u0(p0);
       return this;
    }
    public boolean await(long p0,TimeUnit p1){
       g0.s0();
       throw false;
    }
    public e c(){
       this.q0();
       return this;
    }
    public r c(){
       this.q0();
       return this;
    }
    public f c(){
       this.q0();
       return this;
    }
    public l c(){
       this.q0();
       return this;
    }
    public boolean cancel(boolean p0){
       return false;
    }
    public r d(){
       return this;
    }
    public e e(){
       this.v0();
       throw null;
    }
    public r e(){
       this.v0();
       throw null;
    }
    public f e(){
       this.v0();
       throw null;
    }
    public l e(){
       this.v0();
       throw null;
    }
    public e f(g p0){
       this.o0(p0);
       throw null;
    }
    public r f(g p0){
       this.o0(p0);
       throw null;
    }
    public f f(g p0){
       this.o0(p0);
       throw null;
    }
    public l f(g p0){
       this.o0(p0);
       throw null;
    }
    public e g(g[] p0){
       this.p0(p0);
       throw null;
    }
    public r g(g[] p0){
       this.p0(p0);
       throw null;
    }
    public f g(g[] p0){
       this.p0(p0);
       throw null;
    }
    public l g(g[] p0){
       this.p0(p0);
       throw null;
    }
    public e h(g[] p0){
       return this;
    }
    public r h(g[] p0){
       return this;
    }
    public f h(g[] p0){
       return this;
    }
    public l h(g[] p0){
       return this;
    }
    public boolean h0(Object p0){
       return false;
    }
    public e i(g p0){
       return this;
    }
    public r i(g p0){
       return this;
    }
    public f i(g p0){
       return this;
    }
    public l i(g p0){
       return this;
    }
    public boolean i0(){
       return false;
    }
    public boolean isCancelled(){
       return false;
    }
    public boolean isDone(){
       return false;
    }
    public boolean isSuccess(){
       return false;
    }
    public e j(){
       this.r0();
       throw null;
    }
    public r j(){
       this.r0();
       throw null;
    }
    public f j(){
       this.r0();
       throw null;
    }
    public l j(){
       this.r0();
       throw null;
    }
    public boolean j0(long p0){
       g0.s0();
       throw false;
    }
    public e k(){
       this.w0();
       throw null;
    }
    public r k(){
       this.w0();
       throw null;
    }
    public f k(){
       this.w0();
       throw null;
    }
    public l k(){
       this.w0();
       throw null;
    }
    public boolean k0(){
       return true;
    }
    public r l(){
       w ow = new w(this.b);
       if (this.c != null) {
          ow.f(new g0$a(this));
       }
       return ow;
    }
    public boolean l0(long p0,TimeUnit p1){
       g0.s0();
       throw false;
    }
    public r n(Void p0){
       return this;
    }
    public boolean n0(long p0){
       g0.s0();
       throw false;
    }
    public d o(){
       return this.b;
    }
    public g0 o0(g p0){
       g0.s0();
       throw null;
    }
    public l p(Object p0){
       return this;
    }
    public g0 p0(g[] p0){
       g0.s0();
       throw null;
    }
    public g0 q0(){
       if (!Thread.interrupted()) {
          return this;
       }
       throw new InterruptedException();
    }
    public g0 r0(){
       g0.s0();
       throw null;
    }
    public boolean s(){
       return false;
    }
    public void t0(Throwable p0){
       if (this.c != null && this.b.e0()) {
          this.b.d0().A(p0);
       }
       return;
    }
    public g0 u0(Throwable p0){
       this.t0(p0);
       return this;
    }
    public boolean v(){
       return true;
    }
    public g0 v0(){
       g0.s0();
       throw null;
    }
    public g0 w0(){
       g0.s0();
       throw null;
    }
    public boolean y(Throwable p0){
       this.t0(p0);
       return false;
    }
    public Throwable z(){
       return null;
    }
}
