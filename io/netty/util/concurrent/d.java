package io.netty.util.concurrent.d;
import io.netty.util.concurrent.k;
import io.netty.util.concurrent.DefaultPromise;
import yqd.e;
import java.lang.Throwable;
import io.netty.util.concurrent.l;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalStateException;
import io.netty.util.concurrent.f;
import io.netty.util.concurrent.j;
import io.netty.util.concurrent.g;
import java.lang.Object;

public class d extends DefaultPromise implements k	// class@001104
{

    public void d(){
       super();
    }
    public void d(e p0){
       super(p0);
    }
    public boolean C(long p0,long p1){
       boolean b = false;
       if (p1 - b < 0) {
          if (p0 - b < 0 || this.isDone()) {
             return false;
          }
       }else if(p0 - b >= 0 && (p0 - p1 > 0 || this.isDone())){
          return false;
       }
       this.G0(p0, -1);
       return true;
    }
    public k a(Throwable p0){
       super.a(p0);
       return this;
    }
    public l a(Throwable p0){
       return this.a(p0);
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
    public f c(){
       return this.c();
    }
    public j c(){
       return this.c();
    }
    public k c(){
       super.c();
       return this;
    }
    public l c(){
       return this.c();
    }
    public f e(){
       return this.e();
    }
    public j e(){
       return this.e();
    }
    public k e(){
       super.e();
       return this;
    }
    public l e(){
       return this.e();
    }
    public f f(g p0){
       return this.f(p0);
    }
    public j f(g p0){
       return this.f(p0);
    }
    public k f(g p0){
       super.f(p0);
       return this;
    }
    public l f(g p0){
       return this.f(p0);
    }
    public f g(g[] p0){
       return this.g(p0);
    }
    public j g(g[] p0){
       return this.g(p0);
    }
    public k g(g[] p0){
       super.g(p0);
       return this;
    }
    public l g(g[] p0){
       return this.g(p0);
    }
    public f h(g[] p0){
       return this.h(p0);
    }
    public j h(g[] p0){
       return this.h(p0);
    }
    public k h(g[] p0){
       super.h(p0);
       return this;
    }
    public l h(g[] p0){
       return this.h(p0);
    }
    public f i(g p0){
       return this.i(p0);
    }
    public j i(g p0){
       return this.i(p0);
    }
    public k i(g p0){
       super.i(p0);
       return this;
    }
    public l i(g p0){
       return this.i(p0);
    }
    public f j(){
       return this.j();
    }
    public j j(){
       return this.j();
    }
    public k j(){
       super.j();
       return this;
    }
    public l j(){
       return this.j();
    }
    public f k(){
       return this.k();
    }
    public j k(){
       return this.k();
    }
    public k k(){
       super.k();
       return this;
    }
    public l k(){
       return this.k();
    }
    public k p(Object p0){
       super.p(p0);
       return this;
    }
    public l p(Object p0){
       return this.p(p0);
    }
}
