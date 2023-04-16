package io.netty.util.concurrent.c;
import io.netty.util.concurrent.b;
import yqd.e;
import java.util.concurrent.TimeUnit;
import java.lang.Thread;
import java.lang.InterruptedException;
import io.netty.util.concurrent.f;
import io.netty.util.concurrent.g;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import io.netty.util.concurrent.DefaultPromise;

public abstract class c extends b	// class@001103
{
    public final e b;

    public void c(e p0){
       super();
       this.b = p0;
    }
    public boolean await(long p0,TimeUnit p1){
       if (!Thread.interrupted()) {
          return true;
       }
       throw new InterruptedException();
    }
    public f c(){
       if (!Thread.interrupted()) {
          return this;
       }
       throw new InterruptedException();
    }
    public boolean cancel(boolean p0){
       return false;
    }
    public f e(){
       return this;
    }
    public f f(g p0){
       Objects.requireNonNull(p0, "listener");
       DefaultPromise.y0(this.o0(), this, p0);
       return this;
    }
    public f g(g[] p0){
       Objects.requireNonNull(p0, "listeners");
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          if (oobject == null) {
             break ;
          }else {
             DefaultPromise.y0(this.o0(), this, oobject);
          }
       }
       return this;
    }
    public f h(g[] p0){
       return this;
    }
    public f i(g p0){
       return this;
    }
    public boolean isCancelled(){
       return false;
    }
    public boolean isDone(){
       return true;
    }
    public f j(){
       return this;
    }
    public boolean j0(long p0){
       return true;
    }
    public f k(){
       return this;
    }
    public boolean l0(long p0,TimeUnit p1){
       return true;
    }
    public boolean n0(long p0){
       if (!Thread.interrupted()) {
          return true;
       }
       throw new InterruptedException();
    }
    public e o0(){
       return this.b;
    }
    public boolean s(){
       return false;
    }
}
