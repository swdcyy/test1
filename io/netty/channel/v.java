package io.netty.channel.v;
import io.netty.channel.q;
import lqd.d;
import io.netty.util.concurrent.d;
import io.netty.channel.d;
import yqd.e;
import java.lang.Throwable;
import io.netty.util.concurrent.k;
import io.netty.channel.r;
import io.netty.util.concurrent.l;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import io.netty.util.concurrent.DefaultPromise;
import java.lang.IllegalStateException;
import io.netty.channel.e;
import io.netty.channel.p;
import io.netty.util.concurrent.f;
import io.netty.util.concurrent.j;
import java.lang.Void;
import io.netty.util.concurrent.g;
import java.lang.Object;
import lqd.m;

public class v extends d implements q, d	// class@0010cd
{
    public final d l;
    public long m;

    public void v(d p0){
       super();
       this.l = p0;
    }
    public void v(d p0,e p1){
       super(p1);
       this.l = p0;
    }
    public q a(Throwable p0){
       super.a(p0);
       return this;
    }
    public r a(Throwable p0){
       this.a(p0);
       return this;
    }
    public k a(Throwable p0){
       this.a(p0);
       return this;
    }
    public l a(Throwable p0){
       this.a(p0);
       return this;
    }
    public q b(long p0,long p1){
       String str = "progress: ";
       IllegalArgumentException illegalArgum = null;
       if (p1 - illegalArgum < 0) {
          p1 = -1;
          if (p0 - illegalArgum < 0) {
             throw new IllegalArgumentException(str+p0+" \(expected: >= 0\)");
          }
       }else if(p0 - illegalArgum >= 0 && p0 - p1 <= 0){
          throw new IllegalArgumentException(str+p0+" \(expected: 0 <= progress <= total \("+p1+"\)\)");
       }
       if (!this.isDone()) {
          this.G0(p0, p1);
          return this;
       }else {
          throw new IllegalStateException("complete already");
       }
    }
    public k b(long p0,long p1){
       String str = "progress: ";
       IllegalArgumentException illegalArgum = null;
       if (p1 - illegalArgum < 0) {
          p1 = -1;
          if (p0 - illegalArgum < 0) {
             throw new IllegalArgumentException(str+p0+" \(expected: >= 0\)");
          }
       }else if(p0 - illegalArgum >= 0 && p0 - p1 <= 0){
          throw new IllegalArgumentException(str+p0+" \(expected: 0 <= progress <= total \("+p1+"\)\)");
       }
       if (!this.isDone()) {
          this.G0(p0, p1);
          return this;
       }else {
          throw new IllegalStateException("complete already");
       }
    }
    public e c(){
       this.c();
       return this;
    }
    public p c(){
       this.c();
       return this;
    }
    public q c(){
       super.c();
       return this;
    }
    public r c(){
       this.c();
       return this;
    }
    public f c(){
       this.c();
       return this;
    }
    public j c(){
       this.c();
       return this;
    }
    public k c(){
       this.c();
       return this;
    }
    public l c(){
       this.c();
       return this;
    }
    public q d(){
       this.n(null);
       return this;
    }
    public r d(){
       this.n(null);
       return this;
    }
    public e e(){
       this.e();
       return this;
    }
    public p e(){
       this.e();
       return this;
    }
    public q e(){
       super.e();
       return this;
    }
    public r e(){
       this.e();
       return this;
    }
    public f e(){
       this.e();
       return this;
    }
    public j e(){
       this.e();
       return this;
    }
    public k e(){
       this.e();
       return this;
    }
    public l e(){
       this.e();
       return this;
    }
    public e f(g p0){
       this.f(p0);
       return this;
    }
    public p f(g p0){
       this.f(p0);
       return this;
    }
    public q f(g p0){
       super.f(p0);
       return this;
    }
    public r f(g p0){
       this.f(p0);
       return this;
    }
    public f f(g p0){
       this.f(p0);
       return this;
    }
    public j f(g p0){
       this.f(p0);
       return this;
    }
    public k f(g p0){
       this.f(p0);
       return this;
    }
    public l f(g p0){
       this.f(p0);
       return this;
    }
    public e g(g[] p0){
       this.g(p0);
       return this;
    }
    public p g(g[] p0){
       this.g(p0);
       return this;
    }
    public q g(g[] p0){
       super.g(p0);
       return this;
    }
    public r g(g[] p0){
       this.g(p0);
       return this;
    }
    public f g(g[] p0){
       this.g(p0);
       return this;
    }
    public j g(g[] p0){
       this.g(p0);
       return this;
    }
    public k g(g[] p0){
       this.g(p0);
       return this;
    }
    public l g(g[] p0){
       this.g(p0);
       return this;
    }
    public r g0(){
       return this;
    }
    public e h(g[] p0){
       this.h(p0);
       return this;
    }
    public p h(g[] p0){
       this.h(p0);
       return this;
    }
    public q h(g[] p0){
       super.h(p0);
       return this;
    }
    public r h(g[] p0){
       this.h(p0);
       return this;
    }
    public f h(g[] p0){
       this.h(p0);
       return this;
    }
    public j h(g[] p0){
       this.h(p0);
       return this;
    }
    public k h(g[] p0){
       this.h(p0);
       return this;
    }
    public l h(g[] p0){
       this.h(p0);
       return this;
    }
    public e i(g p0){
       this.i(p0);
       return this;
    }
    public p i(g p0){
       this.i(p0);
       return this;
    }
    public q i(g p0){
       super.i(p0);
       return this;
    }
    public r i(g p0){
       this.i(p0);
       return this;
    }
    public f i(g p0){
       this.i(p0);
       return this;
    }
    public j i(g p0){
       this.i(p0);
       return this;
    }
    public k i(g p0){
       this.i(p0);
       return this;
    }
    public l i(g p0){
       this.i(p0);
       return this;
    }
    public boolean i0(){
       return this.h0(null);
    }
    public e j(){
       this.j();
       return this;
    }
    public p j(){
       this.j();
       return this;
    }
    public q j(){
       super.j();
       return this;
    }
    public r j(){
       this.j();
       return this;
    }
    public f j(){
       this.j();
       return this;
    }
    public j j(){
       this.j();
       return this;
    }
    public k j(){
       this.j();
       return this;
    }
    public l j(){
       this.j();
       return this;
    }
    public e k(){
       this.k();
       return this;
    }
    public p k(){
       this.k();
       return this;
    }
    public q k(){
       super.k();
       return this;
    }
    public r k(){
       this.k();
       return this;
    }
    public f k(){
       this.k();
       return this;
    }
    public j k(){
       this.k();
       return this;
    }
    public k k(){
       this.k();
       return this;
    }
    public l k(){
       this.k();
       return this;
    }
    public q l(){
       return this;
    }
    public r l(){
       return this;
    }
    public long m(){
       return this.m;
    }
    public q n(Void p0){
       super.p(p0);
       return this;
    }
    public r n(Void p0){
       this.n(p0);
       return this;
    }
    public d o(){
       return this.l;
    }
    public k p(Object p0){
       this.n(p0);
       return this;
    }
    public l p(Object p0){
       this.n(p0);
       return this;
    }
    public void p0(){
       if (this.o().e0()) {
          super.p0();
       }
       return;
    }
    public e s0(){
       e uoe = super.s0();
       if (uoe == null) {
          uoe = this.o().F3();
       }
       return uoe;
    }
    public boolean v(){
       return false;
    }
    public void x(long p0){
       this.m = p0;
    }
}
