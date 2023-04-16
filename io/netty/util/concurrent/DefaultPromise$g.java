package io.netty.util.concurrent.DefaultPromise$g;
import java.lang.Runnable;
import io.netty.util.concurrent.DefaultPromise;
import io.netty.util.concurrent.g;
import java.lang.Object;
import io.netty.util.concurrent.DefaultPromise$LateListeners;
import java.util.ArrayDeque;

public final class DefaultPromise$g implements Runnable	// class@0010ff
{
    public g b;
    public final DefaultPromise c;

    public void DefaultPromise$g(DefaultPromise p0,g p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void run(){
       DefaultPromise$g tc = this.c;
       DefaultPromise e = tc.e;
       if (this.b != null) {
          if (e == null) {
             e = new DefaultPromise$LateListeners(this.c);
             tc.e = e;
          }
          e.add(this.b);
          this.b = null;
       }
       e.run();
       return;
    }
}
