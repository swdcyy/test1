package io.netty.util.concurrent.b;
import io.netty.util.concurrent.f;
import java.lang.Object;
import java.lang.Throwable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class b implements f	// class@001102
{

    public void b(){
       super();
    }
    public Object get(){
       this.c();
       Throwable throwable = this.z();
       if (throwable == null) {
          return this.A();
       }
       if (throwable instanceof CancellationException) {
          throw throwable;
       }
       throw new ExecutionException(throwable);
    }
    public Object get(long p0,TimeUnit p1){
       if (!this.await(p0, p1)) {
          throw new TimeoutException();
       }
       Throwable throwable = this.z();
       if (throwable == null) {
          return this.A();
       }
       if (throwable instanceof CancellationException) {
          throw throwable;
       }
       throw new ExecutionException(throwable);
    }
}
