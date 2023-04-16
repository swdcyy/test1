package io.netty.util.concurrent.DefaultPromise$LateListeners;
import java.lang.Runnable;
import java.util.ArrayDeque;
import io.netty.util.concurrent.DefaultPromise;
import yqd.e;
import yqd.k;
import java.lang.Object;
import io.netty.util.concurrent.g;
import io.netty.util.concurrent.f;

public final class DefaultPromise$LateListeners extends ArrayDeque implements Runnable	// class@0010f8
{
    public final DefaultPromise this$0;
    public static final long serialVersionUID = 0xf676cc28ab706bcc;

    public void DefaultPromise$LateListeners(DefaultPromise p0){
       this.this$0 = p0;
       super(2);
    }
    public void run(){
       e uoe = this.this$0.s0();
       if (this.this$0.d == null || uoe == k.e) {
          g og = this.poll();
          while (og != null) {
             DefaultPromise.A0(this.this$0, og);
          }
       }else {
          DefaultPromise.r0(uoe, this);
       }
       return;
    }
}
