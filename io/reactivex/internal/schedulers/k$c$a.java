package io.reactivex.internal.schedulers.k$c$a;
import java.lang.Runnable;
import io.reactivex.internal.schedulers.k$c;
import io.reactivex.internal.schedulers.k$b;
import java.lang.Object;
import java.util.concurrent.PriorityBlockingQueue;

public final class k$c$a implements Runnable	// class@0014b6
{
    public final k$b b;
    public final k$c c;

    public void k$c$a(k$c p0,k$b p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void run(){
       this.b.e = true;
       this.c.b.remove(this.b);
    }
}
