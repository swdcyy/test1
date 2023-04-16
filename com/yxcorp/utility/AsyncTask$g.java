package com.yxcorp.utility.AsyncTask$g;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.util.ArrayDeque;
import java.lang.Runnable;
import com.yxcorp.utility.AsyncTask;
import com.yxcorp.utility.AsyncTask$g$a;

public class AsyncTask$g implements Executor	// class@0009a4
{
    public final ArrayDeque b;
    public Runnable c;

    public void AsyncTask$g(){
       super();
       this.b = new ArrayDeque();
    }
    public synchronized void a(){
       Runnable runnable = this.b.poll();
       this.c = runnable;
       if (runnable != null) {
          AsyncTask.l.execute(runnable);
       }
       return;
    }
    public synchronized void execute(Runnable p0){
       this.b.offer(new AsyncTask$g$a(this, p0));
       if (this.c == null) {
          this.a();
       }
       return;
    }
}
