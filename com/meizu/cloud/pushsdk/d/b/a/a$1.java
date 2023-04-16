package com.meizu.cloud.pushsdk.d.b.a.a$1;
import java.lang.Runnable;
import com.meizu.cloud.pushsdk.d.b.a.a;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;

public class a$1 implements Runnable	// class@001506
{
    public final a a;

    public void a$1(a p0){
       this.a = p0;
       super();
    }
    public void run(){
       if (a.a(this.a).compareAndSet(false, true)) {
          a.b(this.a);
       }
       return;
    }
}
